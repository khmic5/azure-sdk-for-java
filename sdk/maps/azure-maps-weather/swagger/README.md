# Azure Maps Weather for Java

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

``` yaml
directive:
  - rename-model:
        from: RouteMatrixQuery
        to: RouteMatrixQueryPrivate      

title: WeatherClient
input-file: https://raw.githubusercontent.com/Azure/azure-rest-api-specs/main/specification/maps/data-plane/Weather/stable/1.1/weather.json
namespace: com.azure.maps.weather
java: true
output-folder: ../
license-header: MICROSOFT_MIT_SMALL
payload-flattening-threshold: 0
add-context-parameter: true
context-client-method-parameter: true
client-logger: true
generate-client-as-impl: true
sync-methods: all
generate-sync-async-clients: false
polling: {}
models-subpackage: implementation.models
custom-types-subpackage: models
#customization-jar-path: target/azure-maps-weather-customization-1.0.0-beta.1.jar
#customization-class: WeatherCustomization
```
