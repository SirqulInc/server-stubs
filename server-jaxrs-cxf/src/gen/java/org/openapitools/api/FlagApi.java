package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.CountResponse;
import org.openapitools.model.FlagResponse;
import org.openapitools.model.SirqulResponse;

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
@Path("/api/{version}/flag")
@Api(value = "/", description = "")
public interface FlagApi  {

    /**
     * Create Flag
     *
     * Allows a user to flag an object that the user deems inappropriate or offensive. Flagable objects include accounts, albums, album contests, assets, game levels, and theme descriptors
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Flag", tags={ "Flag" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse createFlag(@PathParam("version") BigDecimal version, @QueryParam("flagableType") @NotNull String flagableType, @QueryParam("flagableId") @NotNull Long flagableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("flagDescription") String flagDescription, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Delete Flag
     *
     * Deletes a flag.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Flag", tags={ "Flag" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteFlag(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("itemBeingFlaggedType") String itemBeingFlaggedType, @QueryParam("itemBeingFlaggedId") Long itemBeingFlaggedId, @QueryParam("flagableType") String flagableType, @QueryParam("flagableId") Long flagableId);

    /**
     * Get Flag
     *
     * Gets the details on whether the user has flagged a particular flagable object.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Flag", tags={ "Flag" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = FlagResponse.class) })
    public FlagResponse getFlag(@PathParam("version") BigDecimal version, @QueryParam("flagableType") @NotNull String flagableType, @QueryParam("flagableId") @NotNull Long flagableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Get Flag Threshold
     *
     * Get the flag threshold value on an object type for a particular application.
     *
     */
    @GET
    @Path("/threshold/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Flag Threshold", tags={ "Flag" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CountResponse.class) })
    public CountResponse getFlagThreshold(@PathParam("version") BigDecimal version, @QueryParam("itemBeingFlaggedType") @NotNull String itemBeingFlaggedType, @QueryParam("appKey") @NotNull String appKey);

    /**
     * Update Flag Threshold
     *
     * Update the flag threshold on an object type for a particular application.
     *
     */
    @POST
    @Path("/threshold/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Flag Threshold", tags={ "Flag" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CountResponse.class) })
    public CountResponse updateFlagThreshold(@PathParam("version") BigDecimal version, @QueryParam("itemBeingFlaggedType") @NotNull String itemBeingFlaggedType, @QueryParam("threshold") @NotNull Long threshold, @QueryParam("appKey") @NotNull String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId);
}
