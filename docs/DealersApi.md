# DealersApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDealer**](DealersApi.md#getDealer) | **GET** /api/{datasetId}/dealers/{dealerid} | Get information about a dealer


<a name="getDealer"></a>
# **getDealer**
> DealersResponse getDealer(datasetId, dealerid)

Get information about a dealer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = DealersApi()
val datasetId : kotlin.String = datasetId_example // kotlin.String | 
val dealerid : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : DealersResponse = apiInstance.getDealer(datasetId, dealerid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealersApi#getDealer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealersApi#getDealer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetId** | **kotlin.String**|  |
 **dealerid** | **kotlin.Int**|  |

### Return type

[**DealersResponse**](DealersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

