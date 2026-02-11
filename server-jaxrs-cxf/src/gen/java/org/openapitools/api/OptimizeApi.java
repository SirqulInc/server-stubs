package org.openapitools.api;

import org.openapitools.model.ImportStatuses;
import java.util.Map;
import org.openapitools.model.Orders;
import org.openapitools.model.ShipmentOrder;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
@Path("/optimize")
@Api(value = "/", description = "")
public interface OptimizeApi  {

    /**
     * Get Optimization Result
     *
     * Get the results of the import batch.
     *
     */
    @GET
    @Path("/result/{batchID}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Optimization Result", tags={ "Optimize" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ShipmentOrder.class, responseContainer = "Map") })
    public Map<String, ShipmentOrder> getOptimizationResult(@PathParam("batchID") String batchID, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit);

    /**
     * Request Optimization
     *
     * Request and upload of shipment orders and create ShipmentImportBatch for optimization.
     *
     */
    @POST
    @Path("/request")
    @Produces({ "*/*" })
    @ApiOperation(value = "Request Optimization", tags={ "Optimize" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ImportStatuses.class) })
    public ImportStatuses requestOptimization(@Valid Orders body);
}
