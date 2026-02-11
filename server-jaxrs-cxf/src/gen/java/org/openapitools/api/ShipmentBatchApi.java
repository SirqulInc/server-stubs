package org.openapitools.api;

import org.openapitools.model.ShipmentBatch;
import org.openapitools.model.ShipmentImportStatus;

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
@Path("/shipment/batch")
@Api(value = "/", description = "")
public interface ShipmentBatchApi  {

    /**
     * Create Shipment Batch
     *
     * Create a new shipment batch
     *
     */
    @POST
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Shipment Batch", tags={ "Shipment Batch" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ShipmentBatch.class) })
    public ShipmentBatch createShipmentBatch(@Valid ShipmentBatch body);

    /**
     * Delete Shipment Batch
     *
     * Search for shipment batches
     *
     */
    @DELETE
    @Path("/{batchId}")
    @ApiOperation(value = "Delete Shipment Batch", tags={ "Shipment Batch" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void deleteShipmentBatch(@PathParam("batchId") Long batchId);

    /**
     * Get Shipment Batch
     *
     * Get an existing shipment batch
     *
     */
    @GET
    @Path("/{batchId}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Shipment Batch", tags={ "Shipment Batch" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ShipmentBatch.class) })
    public ShipmentBatch getShipmentBatch(@PathParam("batchId") Long batchId);

    /**
     * Get Shipment Batch Status
     *
     * Get the import status list of the import shipment batch
     *
     */
    @GET
    @Path("/{batchId}/status")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Shipment Batch Status", tags={ "Shipment Batch" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ShipmentImportStatus.class, responseContainer = "List") })
    public List<ShipmentImportStatus> getShipmentBatchStatus(@PathParam("batchId") Long batchId, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("valid") Boolean valid, @QueryParam("started") Boolean started, @QueryParam("completed") Boolean completed, @QueryParam("hasShipment") Boolean hasShipment, @QueryParam("hasRoute") Boolean hasRoute, @QueryParam("keyword") String keyword);

    /**
     * Search Shipment Batch
     *
     * Search for shipment batches
     *
     */
    @GET
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Shipment Batch", tags={ "Shipment Batch" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ShipmentBatch.class, responseContainer = "List") })
    public List<ShipmentBatch> searchShipmentBatch(@QueryParam("hubId") @NotNull Long hubId, @QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit);
}
