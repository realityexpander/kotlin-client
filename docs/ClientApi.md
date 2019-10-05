# ClientApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generate**](ClientApi.md#generate) | **GET** /client/{language} | 
[**index**](ClientApi.md#index) | **GET** /client | 


<a name="generate"></a>
# **generate**
> generate(language)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ClientApi()
val language : kotlin.String = language_example // kotlin.String | 
try {
    apiInstance.generate(language)
} catch (e: ClientException) {
    println("4xx response calling ClientApi#generate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientApi#generate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="index"></a>
# **index**
> index()



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ClientApi()
try {
    apiInstance.index()
} catch (e: ClientException) {
    println("4xx response calling ClientApi#index")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientApi#index")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

