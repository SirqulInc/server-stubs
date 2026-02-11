package org.openapitools.api;

import java.io.File;
import org.openapitools.model.PurchaseItemListResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.ThemeDescriptorResponse;

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
@Path("/consumer/theme")
@Api(value = "/", description = "")
public interface ThemeDescriptorApi  {

    /**
     * Create/Update Theme
     *
     * Creates or updates a theme descriptor that can be used to give applications a customized look and feel. The theme can be created by consumers and shared to other users, allowing them to use and/or collaborate on making the theme.
     *
     */
    @POST
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Create/Update Theme", tags={ "Theme Descriptor" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ThemeDescriptorResponse.class) })
    public ThemeDescriptorResponse addOrUpdateThemeDescriptor(@QueryParam("publicRead") @NotNull Boolean publicRead, @QueryParam("publicWrite") @NotNull Boolean publicWrite, @QueryParam("publicDelete") @NotNull Boolean publicDelete, @QueryParam("publicAdd") @NotNull Boolean publicAdd, @QueryParam("visibility") @NotNull String visibility, @QueryParam("includeFriendGroup") @NotNull Boolean includeFriendGroup, @QueryParam("completeWithDefaultValues") @NotNull Boolean completeWithDefaultValues, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("themeDescriptorId") Long themeDescriptorId, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("connectionIdsToAdd") String connectionIdsToAdd, @QueryParam("connectionGroupIdsToAdd") String connectionGroupIdsToAdd, @QueryParam("appVersion") String appVersion, @QueryParam("colorValueJson") String colorValueJson, @QueryParam("stringReplacerJson") String stringReplacerJson, @QueryParam("customJsonObjects") String customJsonObjects, @QueryParam("iconImage") File iconImage, @QueryParam("sceneAtlasImage") File sceneAtlasImage, @QueryParam("bgImage") File bgImage, @QueryParam("bgSound") File bgSound, @QueryParam("musicSelection") String musicSelection, @QueryParam("locationDescription") String locationDescription, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Get Theme
     *
     * Gets a theme.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Theme", tags={ "Theme Descriptor" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PurchaseItemListResponse.class) })
    public PurchaseItemListResponse getThemeDescriptor(@QueryParam("themeDescriptorId") @NotNull Long themeDescriptorId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Search Themes
     *
     * Searches for themes.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Themes", tags={ "Theme Descriptor" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PurchaseItemListResponse.class) })
    public PurchaseItemListResponse getThemeDescriptors(@QueryParam("filter") @NotNull String filter, @QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("contestType") String contestType, @QueryParam("ownerId") Long ownerId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l, @QueryParam("dateCreated") Long dateCreated, @QueryParam("appVersion") String appVersion, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Delete Theme
     *
     * Removes a theme.
     *
     */
    @POST
    @Path("/remove")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Theme", tags={ "Theme Descriptor" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse removeThemeDescriptor(@QueryParam("themeDescriptorId") @NotNull Long themeDescriptorId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);
}
