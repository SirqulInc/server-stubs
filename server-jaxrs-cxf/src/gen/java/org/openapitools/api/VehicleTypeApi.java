package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.VehicleType;

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
@Path("/api/{version}/vehicle/type")
@Api(value = "/", description = "")
public interface VehicleTypeApi  {

    /**
     * Create Vehicle Type
     *
     * Create a new vehicle type
     *
     */
    @POST
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Vehicle Type", tags={ "Vehicle Type" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = VehicleType.class) })
    public VehicleType createVehicleType(@PathParam("version") BigDecimal version, @QueryParam("vehicleType") @NotNull String vehicleType, @Valid VehicleType body);

    /**
     * Delete Vehicle Type
     *
     * Delete a vehicle type
     *
     */
    @DELETE
    @Path("/{vehicleTypeId}")
    @ApiOperation(value = "Delete Vehicle Type", tags={ "Vehicle Type" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void deleteVehicleType(@PathParam("version") BigDecimal version, @PathParam("vehicleTypeId") Long vehicleTypeId);

    /**
     * Get Vehicle Type
     *
     * Get a vehicle type
     *
     */
    @GET
    @Path("/{vehicleTypeId}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Vehicle Type", tags={ "Vehicle Type" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = VehicleType.class) })
    public VehicleType getVehicleType(@PathParam("version") BigDecimal version, @PathParam("vehicleTypeId") Long vehicleTypeId);

    /**
     * Search Vehicle Type
     *
     * Search for types of vehicles
     *
     */
    @GET
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Vehicle Type", tags={ "Vehicle Type" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = VehicleType.class, responseContainer = "List") })
    public List<VehicleType> searchVehicleTypes(@PathParam("version") BigDecimal version, @QueryParam("sortField") @NotNull @DefaultValue("id")String sortField, @QueryParam("descending") @NotNull @DefaultValue("false")Boolean descending, @QueryParam("start") @NotNull @DefaultValue("0")Integer start, @QueryParam("limit") @NotNull @DefaultValue("20")Integer limit, @QueryParam("activeOnly") @NotNull @DefaultValue("true")Boolean activeOnly, @QueryParam("retailerId") Long retailerId, @QueryParam("hubId") Long hubId);

    /**
     * Update Vehicle Type
     *
     * Update a vehicle type
     *
     */
    @PUT
    @Path("/{vehicleTypeId}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Vehicle Type", tags={ "Vehicle Type" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = VehicleType.class) })
    public VehicleType updateVehicleType(@PathParam("version") BigDecimal version, @PathParam("vehicleTypeId") Long vehicleTypeId, @QueryParam("vehicleType") @NotNull String vehicleType, @Valid VehicleType body);
}
