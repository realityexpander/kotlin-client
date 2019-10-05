# VehiclesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIds**](VehiclesApi.md#getIds) | **GET** /api/{datasetId}/vehicles | Get a list of all vehicleids in dataset
[**getVehicle**](VehiclesApi.md#getVehicle) | **GET** /api/{datasetId}/vehicles/{vehicleid} | Get information about a vehicle


<a name="getIds"></a>
# **getIds**
> VehicleIdsResponse getIds(datasetId)

Get a list of all vehicleids in dataset

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = VehiclesApi()
val datasetId : kotlin.String = datasetId_example // kotlin.String | 
try {
    val result : VehicleIdsResponse = apiInstance.getIds(datasetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VehiclesApi#getIds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VehiclesApi#getIds")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetId** | **kotlin.String**|  |

### Return type

[**VehicleIdsResponse**](VehicleIdsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getVehicle"></a>
# **getVehicle**
> VehicleResponse getVehicle(datasetId, vehicleid)

Get information about a vehicle

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = VehiclesApi()
val datasetId : kotlin.String = datasetId_example // kotlin.String | 
val vehicleid : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : VehicleResponse = apiInstance.getVehicle(datasetId, vehicleid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VehiclesApi#getVehicle")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VehiclesApi#getVehicle")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetId** | **kotlin.String**|  |
 **vehicleid** | **kotlin.Int**|  |

### Return type

[**VehicleResponse**](VehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

