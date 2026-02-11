package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.OptimizeApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ImportStatuses;
import java.util.Map;
import org.openapitools.model.Orders;
import org.openapitools.model.ShipmentOrder;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/optimize")


@io.swagger.annotations.Api(description = "the optimize API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OptimizeApi  {

    @Inject OptimizeApiService service;

    @GET
    @Path("/result/{batchID}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Optimization Result", notes = "Get the results of the import batch.", response = ShipmentOrder.class, responseContainer = "Map", tags={ "Optimize", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ShipmentOrder.class, responseContainer = "Map") })
    public Response getOptimizationResult( @PathParam("batchID") String batchID, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getOptimizationResult(batchID,start,limit,securityContext);
    }
    @POST
    @Path("/request")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Request Optimization", notes = "Request and upload of shipment orders and create ShipmentImportBatch for optimization.", response = ImportStatuses.class, tags={ "Optimize", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ImportStatuses.class) })
    public Response requestOptimization(@ApiParam(value = "" ) @Valid Orders body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.requestOptimization(body,securityContext);
    }
}
