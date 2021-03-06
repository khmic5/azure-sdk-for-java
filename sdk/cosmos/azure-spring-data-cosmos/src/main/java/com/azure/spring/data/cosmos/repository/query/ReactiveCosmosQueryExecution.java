// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.data.cosmos.repository.query;

import com.azure.spring.data.cosmos.core.ReactiveCosmosOperations;
import com.azure.spring.data.cosmos.core.query.CosmosQuery;
import com.azure.spring.data.cosmos.exception.CosmosAccessException;
import org.springframework.data.repository.query.ReturnedType;

/**
 * Interface to execute reactive cosmos query operations
 */
public interface ReactiveCosmosQueryExecution {

    /**
     * Declare an execute function for different operations to call
     *
     * @param query document query operation
     * @param type domain type
     * @param container container to conduct query
     * @return Object according to execution result
     */
    Object execute(CosmosQuery query, Class<?> type, String container);

    /**
     * Container operation implementation to execute a container name query
     */
    final class ContainerExecution implements ReactiveCosmosQueryExecution {

        private final ReactiveCosmosOperations operations;

        /**
         * Creates a new instance of container execution.
         *
         * @param operations Reactive Cosmos operations
         */
        public ContainerExecution(ReactiveCosmosOperations operations) {
            this.operations = operations;
        }

        @Override
        public Object execute(CosmosQuery query, Class<?> type, String container) {
            return operations.getContainerName(type);
        }
    }

    /**
     * Find operation implementation to execute a find query for multiple items
     */
    final class MultiEntityExecution implements ReactiveCosmosQueryExecution {

        private final ReactiveCosmosOperations operations;

        /**
         * Creates a new instance of multi-entity execution.
         *
         * @param operations Reactive Cosmos operations
         */
        public MultiEntityExecution(ReactiveCosmosOperations operations) {
            this.operations = operations;
        }

        @Override
        public Object execute(CosmosQuery query, Class<?> type, String container) {
            return operations.find(query, type, container);
        }
    }

    /**
     * Find operation implementation to execute a find query for a single item
     */
    final class SingleEntityExecution implements ReactiveCosmosQueryExecution {

        private final ReactiveCosmosOperations operations;
        private final ReturnedType returnedType;

        /**
         * Creates a new instance of single-entity execution.
         *
         * @param operations Reactive Cosmos operations
         * @param returnedType Return type
         */
        public SingleEntityExecution(ReactiveCosmosOperations operations, ReturnedType returnedType) {
            this.operations = operations;
            this.returnedType = returnedType;
        }

        @Override
        public Object execute(CosmosQuery query, Class<?> type, String container) {
            return operations.find(query, type, container)
                .buffer(2)
                .map((vals) -> {
                    if (vals.size() > 1) {
                        throw new CosmosAccessException("Too many results - Expected Mono<"
                            + returnedType.getReturnedType()
                            + "> but query returned multiple results");
                    }
                    return vals.iterator().next();
                });
        }
    }

    /**
     * Exist operation implementation to execute a exist query
     */
    final class ExistsExecution implements ReactiveCosmosQueryExecution {

        private final ReactiveCosmosOperations operations;

        /**
         * Creates a new instance of exists execution.
         *
         * @param operations Reactive Cosmos operations
         */
        public ExistsExecution(ReactiveCosmosOperations operations) {
            this.operations = operations;
        }

        @Override
        public Object execute(CosmosQuery query, Class<?> type, String container) {
            return operations.exists(query, type, container);
        }
    }

    /**
     * Delete operation implementation to execute a delete query
     */
    final class DeleteExecution implements ReactiveCosmosQueryExecution {

        private final ReactiveCosmosOperations operations;

        /**
         * Creates a new instance of delete execution.
         *
         * @param operations Reactive Cosmos operations
         */
        public DeleteExecution(ReactiveCosmosOperations operations) {
            this.operations = operations;
        }

        @Override
        public Object execute(CosmosQuery query, Class<?> type, String container) {
            return operations.delete(query, type, container);
        }
    }

    /**
     * Count operation implementation to execute a count query
     */
    final class CountExecution implements ReactiveCosmosQueryExecution {

        private final ReactiveCosmosOperations operations;

        /**
         * Creates a new instance of count execution.
         *
         * @param operations Reactive Cosmos operations
         */
        public CountExecution(ReactiveCosmosOperations operations) {
            this.operations = operations;
        }

        @Override
        public Object execute(CosmosQuery query, Class<?> type, String container) {
            return operations.count(query, container);
        }
    }

}
