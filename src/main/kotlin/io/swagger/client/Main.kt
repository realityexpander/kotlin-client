package io.swagger.client

import io.swagger.client.apis.DealersApi
import io.swagger.client.apis.VehiclesApi
import io.swagger.client.infrastructure.ClientException
import io.swagger.client.infrastructure.ServerException
import io.swagger.client.models.DealersResponse
import io.swagger.client.models.VehicleIdsResponse


/**
 * Created by Chris Athanas on 2019-10-04.
 */


object Main {

  @JvmStatic
  fun main(arg: Array<String>) {

    val apiInstance = DealersApi()
    val datasetId = "4x7xITpJ1wg" // kotlin.String |
    val dealerid = 264111073 // kotlin.Int |
    try {
//      var result: DealersResponse = apiInstance.getDealer(datasetId, dealerid)
//      println(result)

      var result2: VehicleIdsResponse = VehiclesApi().getIds(datasetId)
      println(result2)

    } catch (e: ClientException) {
      println("4xx response calling DealersApi#getDealer")
      e.printStackTrace()
    } catch (e: ServerException) {
      println("5xx response calling DealersApi#getDealer")
      e.printStackTrace()
    }
  }

}