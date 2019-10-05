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

import io.swagger.client.models.VehicleIdsResponse
import io.swagger.client.models.VehicleResponse

import io.swagger.client.infrastructure.*

class VehiclesApi(basePath: kotlin.String = "http://api.coxauto-interview.com") : ApiClient(basePath) {

    /**
    * Get a list of all vehicleids in dataset
    * 
    * @param datasetId  
    * @return VehicleIdsResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun getIds(datasetId: kotlin.String) : VehicleIdsResponse {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        
        val contentHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val acceptsHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Accept" to "text/plain, application/json, text/json")
        val localVariableHeaders: kotlin.collections.MutableMap<kotlin.String,kotlin.String> = mutableMapOf()
        localVariableHeaders.putAll(contentHeaders)
        localVariableHeaders.putAll(acceptsHeaders)
        
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/{datasetId}/vehicles".replace("{"+"datasetId"+"}", "$datasetId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<VehicleIdsResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as VehicleIdsResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Get information about a vehicle
    * 
    * @param datasetId  
    * @param vehicleid  
    * @return VehicleResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun getVehicle(datasetId: kotlin.String, vehicleid: kotlin.Int) : VehicleResponse {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        
        val contentHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val acceptsHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Accept" to "text/plain, application/json, text/json")
        val localVariableHeaders: kotlin.collections.MutableMap<kotlin.String,kotlin.String> = mutableMapOf()
        localVariableHeaders.putAll(contentHeaders)
        localVariableHeaders.putAll(acceptsHeaders)
        
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/{datasetId}/vehicles/{vehicleid}".replace("{"+"datasetId"+"}", "$datasetId").replace("{"+"vehicleid"+"}", "$vehicleid"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<VehicleResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as VehicleResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}