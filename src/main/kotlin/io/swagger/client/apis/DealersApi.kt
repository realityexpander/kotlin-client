/**
* DealersAndVehicles
* No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
*
* OpenAPI spec version: v1
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.swagger.client.apis

import io.swagger.client.models.DealersResponse

import io.swagger.client.infrastructure.*

class DealersApi(basePath: kotlin.String = "http://api.coxauto-interview.com") : ApiClient(basePath) {

    /**
    * Get information about a dealer
    * 
    * @param datasetId  
    * @param dealerid  
    * @return DealersResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun getDealer(datasetId: kotlin.String, dealerid: kotlin.Int) : DealersResponse {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        
        val contentHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val acceptsHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Accept" to "text/plain, application/json, text/json")
        val localVariableHeaders: kotlin.collections.MutableMap<kotlin.String,kotlin.String> = mutableMapOf()
        localVariableHeaders.putAll(contentHeaders)
        localVariableHeaders.putAll(acceptsHeaders)
        
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/{datasetId}/dealers/{dealerid}".replace("{"+"datasetId"+"}", "$datasetId").replace("{"+"dealerid"+"}", "$dealerid"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<DealersResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as DealersResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}
