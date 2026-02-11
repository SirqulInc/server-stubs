package org.openapitools.api;

import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TerritoryResponse;

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
@Path("/territory")
@Api(value = "/", description = "")
public interface TerritoryApi  {

    /**
     * Create Territory
     *
     * Creates a territory.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Territory", tags={ "Territory" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = TerritoryResponse.class) })
    public TerritoryResponse createTerritory(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("name") @NotNull String name, @QueryParam("active") Boolean active);

    /**
     * Delete Territory
     *
     * Deletes a territory.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Territory", tags={ "Territory" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteTerritory(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("territoryId") @NotNull Long territoryId);

    /**
     * Get Territory
     *
     * Get a territory.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Territory", tags={ "Territory" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = TerritoryResponse.class) })
    public TerritoryResponse getTerritory(@QueryParam("territoryId") @NotNull Long territoryId);

    /**
     * Search Territories
     *
     * Searches on territories.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Territories", tags={ "Territory" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = TerritoryResponse.class, responseContainer = "List") })
    public List<TerritoryResponse> searchTerritories(@QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("keyword") String keyword, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit);

    /**
     * Update Territory
     *
     * Updates a territory.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Territory", tags={ "Territory" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = TerritoryResponse.class) })
    public TerritoryResponse updateTerritory(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("territoryId") @NotNull Long territoryId, @QueryParam("name") String name, @QueryParam("active") Boolean active);
}
