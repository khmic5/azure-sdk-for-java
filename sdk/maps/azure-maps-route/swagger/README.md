# Azure Maps Route for Java

> see https://aka.ms/autorest

### Setup
> see https://github.com/Azure/autorest.java

### Generation
> see https://github.com/Azure/autorest.java/releases for the latest version of autorest
```ps
cd <swagger-folder>
mvn install
autorest --java --use:@autorest/java@4.0.x
```

### Code generation settings

## Java

``` yaml $(java)
directive:
  - rename-model:
      from: RouteMatrix
      to: RouteMatrixPrivate
  - rename-model:
      from: RouteMatrixResult
      to: RouteMatrixResultPrivate   
  - rename-model:
      from: RouteMatrixQuery
      to: RouteMatrixQueryPrivate           
java:
    input-file: https://raw.githubusercontent.com/Azure/azure-rest-api-specs/main/specification/maps/data-plane/Route/preview/1.0/route.json
    namespace: com.azure.maps.route
    java: true
    output-folder: ../
    license-header: MICROSOFT_MIT_SMALL
    payload-flattening-threshold: 0
    output-folder: $(azure-libraries-for-java-folder)/azure-maps-route 
    add-context-parameter: true
    context-client-method-parameter: true
    client-logger: true
    generate-client-as-impl: true
    sync-methods: all
    generate-sync-async-clients: false
    polling: {}
    models-subpackage: implementation.models
    custom-types-subpackage: models
    custom-types: AlternativeRouteType,BatchResultSummary,ComputeTravelTime,DelayMagnitude,DrivingSide,EffectiveSetting,ErrorAdditionalInfo,ErrorDetail,ErrorResponse,ErrorResponseException,GuidanceInstructionType,GuidanceManeuver,InclineLevel,JunctionType,Report,ResponseSectionType,ResponseTravelMode,Route,RouteAvoidType,RouteDirections,RouteDirectionsBatchResult,RouteGuidance,RouteInstructionGroup,RouteInstructionsType,RouteLegSummary,RouteMatrixSummary,RouteOptimizedWaypoint,RouteRangeResult,RouteReport,RouteRepresentationForBestOrder,RouteSection,RouteSectionTec,RouteSectionTecCause,RouteSummary,RouteType,SectionType,SimpleCategory,TravelMode,VehicleEngineType,VehicleLoadType,WindingnessLevel
    customization-class: src/main/java/QueueStorageCustomization.java
```
