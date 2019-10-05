# io.swagger.client - Kotlin client library for DealersAndVehicles

## Requires

* Kotlin 1.1.2
* Gradle 3.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ClientApi* | [**generate**](docs/ClientApi.md#generate) | **GET** /client/{language} | 
*ClientApi* | [**index**](docs/ClientApi.md#index) | **GET** /client | 
*DataSetApi* | [**getCheat**](docs/DataSetApi.md#getcheat) | **GET** /api/{datasetId}/cheat | Get correct answer for dataset (cheat)
*DataSetApi* | [**getDataSetId**](docs/DataSetApi.md#getdatasetid) | **GET** /api/datasetId | Creates new dataset and returns its ID
*DataSetApi* | [**postAnswer**](docs/DataSetApi.md#postanswer) | **POST** /api/{datasetId}/answer | Submit answer for dataset
*DealersApi* | [**getDealer**](docs/DealersApi.md#getdealer) | **GET** /api/{datasetId}/dealers/{dealerid} | Get information about a dealer
*VehiclesApi* | [**getIds**](docs/VehiclesApi.md#getids) | **GET** /api/{datasetId}/vehicles | Get a list of all vehicleids in dataset
*VehiclesApi* | [**getVehicle**](docs/VehiclesApi.md#getvehicle) | **GET** /api/{datasetId}/vehicles/{vehicleid} | Get information about a vehicle


<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.swagger.client.models.Answer](docs/Answer.md)
 - [io.swagger.client.models.AnswerResponse](docs/AnswerResponse.md)
 - [io.swagger.client.models.DatasetIdResponse](docs/DatasetIdResponse.md)
 - [io.swagger.client.models.DealerAnswer](docs/DealerAnswer.md)
 - [io.swagger.client.models.DealersResponse](docs/DealersResponse.md)
 - [io.swagger.client.models.VehicleAnswer](docs/VehicleAnswer.md)
 - [io.swagger.client.models.VehicleIdsResponse](docs/VehicleIdsResponse.md)
 - [io.swagger.client.models.VehicleResponse](docs/VehicleResponse.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
