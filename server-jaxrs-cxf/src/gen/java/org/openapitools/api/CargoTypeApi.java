package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.CargoType;

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
@Path("/api/{version}/cargo/type")
@Api(value = "/", description = "")
public interface CargoTypeApi  {

    /**
     * Create Cargo Type
     *
     * Create new cargo type
     *
     */
    @POST
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Cargo Type", tags={ "Cargo Type" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CargoType.class) })
    public CargoType createCargoType(@PathParam("version") BigDecimal version, @Valid CargoType body);

    /**
     * Delete Cargo Type
     *
     * Delete a type of cargo
     *
     */
    @DELETE
    @Path("/{cargoTypeId}")
    @ApiOperation(value = "Delete Cargo Type", tags={ "Cargo Type" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void deleteCargoType(@PathParam("version") BigDecimal version, @PathParam("cargoTypeId") Long cargoTypeId);

    /**
     * Get Cargo Type
     *
     * Get an existing cargo type
     *
     */
    @GET
    @Path("/{cargoTypeId}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Cargo Type", tags={ "Cargo Type" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CargoType.class) })
    public CargoType getCargoType(@PathParam("version") BigDecimal version, @PathParam("cargoTypeId") Long cargoTypeId);

    /**
     * Search Cargo Type
     *
     * Search for types of cargo
     *
     */
    @GET
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Cargo Type", tags={ "Cargo Type" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CargoType.class, responseContainer = "List") })
    public List<CargoType> searchCargoTypes(@PathParam("version") BigDecimal version, @QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("activeOnly") @NotNull Boolean activeOnly, @QueryParam("retailerId") Long retailerId, @QueryParam("hubId") Long hubId);

    /**
     * Update Cargo Type
     *
     * Update an existing cargo type
     *
     */
    @PUT
    @Path("/{cargoTypeId}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Cargo Type", tags={ "Cargo Type" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CargoType.class) })
    public CargoType updateCargoType(@PathParam("version") BigDecimal version, @PathParam("cargoTypeId") Long cargoTypeId, @Valid CargoType body);
}
