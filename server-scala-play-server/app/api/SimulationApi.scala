package api

import play.api.libs.json._
import model.BigDecimal
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait SimulationApi {
  /**
    * Routing Simulation
    * Simulates routing requests.
    * @param data JSON string in the following format: &#x60;&#x60;&#x60;json {   \&quot;startDate\&quot;: 1474268400000,   \&quot;endDate\&quot;: 1474268700000,   \&quot;checkoutStops\&quot;: [     {       \&quot;latitude\&quot;: 25.060453943481615,       \&quot;longitude\&quot;: 121.57487118216957     }   ],   \&quot;requests\&quot;: [     {       \&quot;vehicles\&quot;: [         {           \&quot;id\&quot;: \&quot;customer1\&quot;,           \&quot;name\&quot;: \&quot;Customer 1\&quot;,           \&quot;depot\&quot;: {             \&quot;latitude\&quot;: 25.060453943481615,             \&quot;longitude\&quot;: 121.57487118216957           },           \&quot;startWindow\&quot;: 1474268464537         }       ],       \&quot;items\&quot;: [         {           \&quot;id\&quot;: 152712,           \&quot;name\&quot;: \&quot;Appliance Product\&quot;,           \&quot;pickup\&quot;: {             \&quot;latitude\&quot;: 25.060306635544144,             \&quot;longitude\&quot;: 121.5750770690688           }         },         {           \&quot;id\&quot;: 152711,           \&quot;name\&quot;: \&quot;TV product\&quot;,           \&quot;pickup\&quot;: {             \&quot;latitude\&quot;: 25.060126352576326,             \&quot;longitude\&quot;: 121.57505023621624           }         }       ]     }   ],   \&quot;featuredItems\&quot;: [],   \&quot;floorPlan\&quot;: {     \&quot;metersPerX\&quot;: 0.81493109028875,     \&quot;metersPerY\&quot;: 1.8525267552262,     \&quot;width\&quot;: 75,     \&quot;height\&quot;: 50,     \&quot;exclusions\&quot;: [       { \&quot;x\&quot;: 14, \&quot;y\&quot;: 49 }     ],     \&quot;southwest\&quot;: {       \&quot;x\&quot;: 0,       \&quot;y\&quot;: 0,       \&quot;latitude\&quot;: 25.05961539530497,       \&quot;longitude\&quot;: 121.57487591737885     }   } } &#x60;&#x60;&#x60; 
    * @param realTime determines whether to run the simulation and return the results in the same request
    */
  def simulation(version: BigDecimal, data: String, realTime: Boolean): SirqulResponse
}
