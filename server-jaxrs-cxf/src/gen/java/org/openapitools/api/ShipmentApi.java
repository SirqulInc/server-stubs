package org.openapitools.api;

import java.math.BigDecimal;
import java.util.Map;
import org.openapitools.model.Shipment;

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
@Path("/api/{version}/shipment")
@Api(value = "/", description = "")
public interface ShipmentApi  {

    /**
     * Cancel Shipment
     *
     * Remove shipment from route
     *
     */
    @POST
    @Path("/{id}/cancel")
    @ApiOperation(value = "Cancel Shipment", tags={ "Shipment" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void cancelShipment(@PathParam("version") BigDecimal version, @PathParam("id") Long id);

    /**
     * Create Shipment
     *
     * Create new shipment
     *
     */
    @POST
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Shipment", tags={ "Shipment" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Shipment.class) })
    public Shipment createShipment(@PathParam("version") BigDecimal version, @Valid Shipment body);

    /**
     * Delete Shipment
     *
     * Delete an existing shipment
     *
     */
    @DELETE
    @Path("/{id}")
    @ApiOperation(value = "Delete Shipment", tags={ "Shipment" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void deleteShipment(@PathParam("version") BigDecimal version, @PathParam("id") Long id);

    /**
     * Get Shipment
     *
     * Get an existing shipment
     *
     */
    @GET
    @Path("/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Shipment", tags={ "Shipment" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Shipment.class) })
    public Shipment getShipment(@PathParam("version") BigDecimal version, @PathParam("id") Long id);

    /**
     * Search Shipments
     *
     * Search for shipments
     *
     */
    @GET
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Shipments", tags={ "Shipment" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Shipment.class, responseContainer = "List") })
    public List<Shipment> searchShipments(@PathParam("version") BigDecimal version, @QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("activeOnly") @NotNull Boolean activeOnly, @QueryParam("ownerId") Long ownerId, @QueryParam("riderId") Long riderId, @QueryParam("routeId") Long routeId);

    /**
     * Update Shipment
     *
     * Update an existing shipment
     *
     */
    @PUT
    @Path("/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Shipment", tags={ "Shipment" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Shipment.class) })
    public Shipment updateShipment(@PathParam("version") BigDecimal version, @PathParam("id") Long id, @Valid Shipment body);

    /**
     * Uupdate Shipment Status
     *
     * Update status of an existing shipment
     *
     */
    @POST
    @Path("/{id}/status")
    @ApiOperation(value = "Uupdate Shipment Status", tags={ "Shipment" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void updateShipmentStatus(@PathParam("version") BigDecimal version, @PathParam("id") Long id, @Valid Map<String, Boolean> body);
}
