package org.openapitools.api;

import org.openapitools.api.SimulationApiService;
import org.openapitools.api.factories.SimulationApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.SirqulResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/simulation/routing")


@io.swagger.annotations.Api(description = "the simulation API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class SimulationApi  {
   private final SimulationApiService delegate;

   public SimulationApi(@Context ServletConfig servletContext) {
      SimulationApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("SimulationApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (SimulationApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = SimulationApiServiceFactory.getSimulationApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Routing Simulation", notes = "Simulates routing requests.", response = SirqulResponse.class, tags={ "Simulation", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response simulation(@ApiParam(value = "JSON string in the following format: ```json {   \"startDate\": 1474268400000,   \"endDate\": 1474268700000,   \"checkoutStops\": [     {       \"latitude\": 25.060453943481615,       \"longitude\": 121.57487118216957     }   ],   \"requests\": [     {       \"vehicles\": [         {           \"id\": \"customer1\",           \"name\": \"Customer 1\",           \"depot\": {             \"latitude\": 25.060453943481615,             \"longitude\": 121.57487118216957           },           \"startWindow\": 1474268464537         }       ],       \"items\": [         {           \"id\": 152712,           \"name\": \"Appliance Product\",           \"pickup\": {             \"latitude\": 25.060306635544144,             \"longitude\": 121.5750770690688           }         },         {           \"id\": 152711,           \"name\": \"TV product\",           \"pickup\": {             \"latitude\": 25.060126352576326,             \"longitude\": 121.57505023621624           }         }       ]     }   ],   \"featuredItems\": [],   \"floorPlan\": {     \"metersPerX\": 0.81493109028875,     \"metersPerY\": 1.8525267552262,     \"width\": 75,     \"height\": 50,     \"exclusions\": [       { \"x\": 14, \"y\": 49 }     ],     \"southwest\": {       \"x\": 0,       \"y\": 0,       \"latitude\": 25.05961539530497,       \"longitude\": 121.57487591737885     }   } } ``` ", required = true) @QueryParam("data") @NotNull  String data,@ApiParam(value = "determines whether to run the simulation and return the results in the same request", required = true) @QueryParam("realTime") @NotNull  Boolean realTime,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.simulation(data, realTime, securityContext);
    }
}
