package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.RouteSettings;

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
@Path("/api/{version}/route/setting")
@Api(value = "/", description = "")
public interface RouteSettingApi  {

    /**
     * Create Route Setting
     *
     * Create a new route setting
     *
     */
    @POST
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Route Setting", tags={ "Route Setting" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RouteSettings.class) })
    public RouteSettings createRouteSettings(@PathParam("version") BigDecimal version, @Valid RouteSettings body);

    /**
     * Delete Route Setting
     *
     * Delete an existing route setting
     *
     */
    @DELETE
    @Path("/{routeSettingsId}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Route Setting", tags={ "Route Setting" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Object deleteRouteSettings(@PathParam("version") BigDecimal version, @PathParam("routeSettingsId") Long routeSettingsId);

    /**
     * Get Route Setting
     *
     * Get an existing route settings
     *
     */
    @GET
    @Path("/{routeSettingsId}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Route Setting", tags={ "Route Setting" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RouteSettings.class) })
    public RouteSettings getRouteSettings(@PathParam("version") BigDecimal version, @PathParam("routeSettingsId") Long routeSettingsId);

    /**
     * Search Route Settings
     *
     * Search for route settings
     *
     */
    @GET
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Route Settings", tags={ "Route Setting" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RouteSettings.class, responseContainer = "List") })
    public List<RouteSettings> searchRouteSettings(@PathParam("version") BigDecimal version, @QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("activeOnly") @NotNull Boolean activeOnly, @QueryParam("hubId") Long hubId, @QueryParam("programId") Long programId, @QueryParam("keyword") String keyword);

    /**
     * Update Route Setting
     *
     * Update an existing route setting
     *
     */
    @PUT
    @Path("/{routeSettingsId}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Route Setting", tags={ "Route Setting" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RouteSettings.class) })
    public RouteSettings updateRouteSettings(@PathParam("version") BigDecimal version, @PathParam("routeSettingsId") Long routeSettingsId, @Valid RouteSettings body);
}
