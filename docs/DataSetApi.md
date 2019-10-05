# DataSetApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCheat**](DataSetApi.md#getCheat) | **GET** /api/{datasetId}/cheat | Get correct answer for dataset (cheat)
[**getDataSetId**](DataSetApi.md#getDataSetId) | **GET** /api/datasetId | Creates new dataset and returns its ID
[**postAnswer**](DataSetApi.md#postAnswer) | **POST** /api/{datasetId}/answer | Submit answer for dataset


<a name="getCheat"></a>
# **getCheat**
> Answer getCheat(datasetId)

Get correct answer for dataset (cheat)

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = DataSetApi()
val datasetId : kotlin.String = datasetId_example // kotlin.String | 
try {
    val result : Answer = apiInstance.getCheat(datasetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataSetApi#getCheat")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataSetApi#getCheat")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetId** | **kotlin.String**|  |

### Return type

[**Answer**](Answer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getDataSetId"></a>
# **getDataSetId**
> DatasetIdResponse getDataSetId()

Creates new dataset and returns its ID

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = DataSetApi()
try {
    val result : DatasetIdResponse = apiInstance.getDataSetId()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataSetApi#getDataSetId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataSetApi#getDataSetId")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DatasetIdResponse**](DatasetIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="postAnswer"></a>
# **postAnswer**
> AnswerResponse postAnswer(datasetId, answer)

Submit answer for dataset

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = DataSetApi()
val datasetId : kotlin.String = datasetId_example // kotlin.String | 
val answer : Answer =  // Answer | 
try {
    val result : AnswerResponse = apiInstance.postAnswer(datasetId, answer)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataSetApi#postAnswer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataSetApi#postAnswer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetId** | **kotlin.String**|  |
 **answer** | [**Answer**](Answer.md)|  | [optional]

### Return type

[**AnswerResponse**](AnswerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

