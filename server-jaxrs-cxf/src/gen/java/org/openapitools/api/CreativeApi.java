package org.openapitools.api;

import org.openapitools.model.CreativeResponse;
import org.openapitools.model.MissionResponse;
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
@Path("")
@Api(value = "/", description = "")
public interface CreativeApi  {

    /**
     * Add Preview
     *
     * Enable this ad for preview for this account.
     *
     */
    @POST
    @Path("/creative/addpreview")
    @Produces({ "*/*" })
    @ApiOperation(value = "Add Preview", tags={ "Creative" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse addPreview(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("creativeId") @NotNull Long creativeId);

    /**
     * Find Missions
     *
     * Get a set of ad filtered by the parameters provided.
     *
     */
    @GET
    @Path("/ads/find")
    @Produces({ "*/*" })
    @ApiOperation(value = "Find Missions", tags={ "Creative" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class, responseContainer = "List") })
    public List<MissionResponse> adsFind(@QueryParam("appKey") @NotNull String appKey, @QueryParam("randomize") @NotNull Boolean randomize, @QueryParam("targetedAdsOnly") @NotNull Boolean targetedAdsOnly, @QueryParam("type") String type, @QueryParam("accountId") Long accountId, @QueryParam("appVersion") String appVersion, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("device") String device, @QueryParam("deviceIdentifier") Long deviceIdentifier, @QueryParam("deviceVersion") String deviceVersion, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("includeAudiences") Boolean includeAudiences, @QueryParam("allocatesTickets") Boolean allocatesTickets, @QueryParam("missionIds") String missionIds);

    /**
     * Create Creative
     *
     * Create a creative
     *
     */
    @POST
    @Path("/creative/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Creative", tags={ "Creative" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CreativeResponse.class) })
    public CreativeResponse createCreative(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("name") @NotNull String name, @QueryParam("active") @NotNull Boolean active, @QueryParam("waitForAsset") @NotNull Boolean waitForAsset, @QueryParam("description") String description, @QueryParam("assetImageId") Long assetImageId, @QueryParam("action") String action, @QueryParam("data") String data, @QueryParam("suffix") String suffix, @QueryParam("type") String type, @QueryParam("balance") Double balance, @QueryParam("referenceId") Long referenceId, @QueryParam("appVersion") String appVersion, @QueryParam("missionId") Long missionId, @QueryParam("offerId") Long offerId);

    /**
     * Delete Creative
     *
     * Delete a creative
     *
     */
    @POST
    @Path("/creative/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Creative", tags={ "Creative" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteCreative(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("creativeId") @NotNull Long creativeId);

    /**
     * Get Creative
     *
     * Get a creative
     *
     */
    @GET
    @Path("/creative/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Creative", tags={ "Creative" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CreativeResponse.class) })
    public CreativeResponse getCreative(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("creativeId") @NotNull Long creativeId);

    /**
     * Search Creatives
     *
     * Get a list of levels for an application, just those the account has permissions to view.
     *
     */
    @GET
    @Path("/creative/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Creatives", tags={ "Creative" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CreativeResponse.class, responseContainer = "List") })
    public List<CreativeResponse> getCreativesByApplication(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("missionId") Long missionId, @QueryParam("keyword") String keyword);

    /**
     * Remove Preview
     *
     * Remove this ad for preview for this account.
     *
     */
    @POST
    @Path("/creative/removepreview")
    @Produces({ "*/*" })
    @ApiOperation(value = "Remove Preview", tags={ "Creative" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse removePreview(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("creativeId") @NotNull Long creativeId);

    /**
     * Update Creative
     *
     * Update a creative
     *
     */
    @POST
    @Path("/creative/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Creative", tags={ "Creative" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CreativeResponse.class) })
    public CreativeResponse updateCreative(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("creativeId") @NotNull Long creativeId, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("assetImageId") Long assetImageId, @QueryParam("action") String action, @QueryParam("data") String data, @QueryParam("suffix") String suffix, @QueryParam("type") String type, @QueryParam("balance") Double balance, @QueryParam("active") Boolean active, @QueryParam("referenceId") Long referenceId, @QueryParam("appVersion") String appVersion, @QueryParam("missionId") Long missionId);
}
