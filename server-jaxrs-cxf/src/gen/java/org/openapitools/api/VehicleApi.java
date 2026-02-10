package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.Vehicle;

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
@Path("/api/{version}/vehicle")
@Api(value = "/", description = "")
public interface VehicleApi  {

    /**
     * Create Vehicle
     *
     * Create new vehicle
     *
     */
    @POST
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Vehicle", tags={ "Vehicle" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Vehicle.class) })
    public Vehicle createVehicle(@PathParam("version") BigDecimal version, @QueryParam("vehicle") @NotNull String vehicle, @Valid Vehicle body);

    /**
     * Delete Vehicle
     *
     * Delete an existing vehicle
     *
     */
    @DELETE
    @Path("/{id}")
    @ApiOperation(value = "Delete Vehicle", tags={ "Vehicle" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void deleteVehicle(@PathParam("version") BigDecimal version, @PathParam("id") Long id);

    /**
     * Get Vehicle
     *
     * Get an existing vehicle
     *
     */
    @GET
    @Path("/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Vehicle", tags={ "Vehicle" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Vehicle.class) })
    public Vehicle getVehicle(@PathParam("version") BigDecimal version, @PathParam("id") Long id);

    /**
     * Search Vehicle
     *
     * Search for vehicles
     *
     */
    @GET
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Vehicle", tags={ "Vehicle" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Vehicle.class, responseContainer = "List") })
    public List<Vehicle> searchVehicle(@PathParam("version") BigDecimal version, @QueryParam("hubId") @NotNull Long hubId, @QueryParam("sortField") @NotNull @DefaultValue("id")String sortField, @QueryParam("descending") @NotNull @DefaultValue("false")Boolean descending, @QueryParam("start") @NotNull @DefaultValue("0")Integer start, @QueryParam("limit") @NotNull @DefaultValue("20")Integer limit, @QueryParam("activeOnly") @NotNull @DefaultValue("true")Boolean activeOnly, @QueryParam("keyword") String keyword);

    /**
     * Update Vehicle
     *
     * Update an existing vehicle
     *
     */
    @PUT
    @Path("/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Vehicle", tags={ "Vehicle" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Vehicle.class) })
    public Vehicle updateVehicle(@PathParam("version") BigDecimal version, @PathParam("id") Long id, @QueryParam("vehicle") @NotNull String vehicle, @Valid Vehicle body);
}
