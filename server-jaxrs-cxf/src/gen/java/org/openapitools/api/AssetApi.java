package org.openapitools.api;

import org.openapitools.model.AssetFullResponse;
import org.openapitools.model.AssetResponse;
import org.openapitools.model.AssetShortResponse;
import java.io.File;
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
@Path("/asset")
@Api(value = "/", description = "")
public interface AssetApi  {

    /**
     * Download Asset
     *
     * Downloads an asset from the server for assets that have been uploaded to the server.
     *
     */
    @GET
    @Path("/download/{filename}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Download Asset", tags={ "Asset" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse assetDownload(@PathParam("filename") @Pattern(regexp=".+") String filename);

    /**
     * Convert Offer to Creative
     *
     * Converts an offer image + text into a creative image.
     *
     */
    @POST
    @Path("/morph")
    @Produces({ "*/*" })
    @ApiOperation(value = "Convert Offer to Creative", tags={ "Asset" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AssetShortResponse.class) })
    public AssetShortResponse assetMorph(@QueryParam("offerId") @NotNull Long offerId, @QueryParam("adSize") @NotNull String adSize, @QueryParam("creativeId") Long creativeId, @QueryParam("width") Integer width, @QueryParam("height") Integer height, @QueryParam("backgroundSize") String backgroundSize, @QueryParam("template") String template);

    /**
     * Create Asset
     *
     * Uploads an asset to server and returns an asset id which can be used to assign to various objects.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Asset", tags={ "Asset" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AssetResponse.class) })
    public AssetResponse createAsset(@QueryParam("returnNulls") Boolean returnNulls, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("albumId") Long albumId, @QueryParam("collectionId") Long collectionId, @QueryParam("addToDefaultAlbum") String addToDefaultAlbum, @QueryParam("addToMediaLibrary") Boolean addToMediaLibrary, @QueryParam("versionCode") Integer versionCode, @QueryParam("versionName") String versionName, @QueryParam("metaData") String metaData, @QueryParam("caption") String caption, @QueryParam("assetType") String assetType, @QueryParam("approvalStatus") String approvalStatus, @QueryParam("assignedAccountId") Long assignedAccountId, @QueryParam("media") File media, @QueryParam("mediaUrl") String mediaUrl, @QueryParam("mediaString") String mediaString, @QueryParam("mediaStringFileName") String mediaStringFileName, @QueryParam("mediaStringContentType") String mediaStringContentType, @QueryParam("mediaHeight") Integer mediaHeight, @QueryParam("mediaWidth") Integer mediaWidth, @QueryParam("attachedMedia") File attachedMedia, @QueryParam("attachedMediaUrl") String attachedMediaUrl, @QueryParam("attachedMediaString") String attachedMediaString, @QueryParam("attachedMediaStringFileName") String attachedMediaStringFileName, @QueryParam("attachedMediaStringContentType") String attachedMediaStringContentType, @QueryParam("attachedMediaHeight") Integer attachedMediaHeight, @QueryParam("attachedMediaWidth") Integer attachedMediaWidth, @QueryParam("locationDescription") String locationDescription, @QueryParam("app") String app, @QueryParam("appKey") String appKey, @QueryParam("searchTags") String searchTags, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Delete Asset
     *
     * Delete an asset.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Asset", tags={ "Asset" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteAsset(@QueryParam("assetId") @NotNull String assetId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Get Asset
     *
     * Gets the full asset response including attached likes and notes.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Asset", tags={ "Asset" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AssetFullResponse.class) })
    public AssetFullResponse getAsset(@QueryParam("assetId") @NotNull Long assetId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("noteDescending") @DefaultValue("false")Boolean noteDescending);

    /**
     * Remove Asset from Collection
     *
     * Remove assets from collections
     *
     */
    @POST
    @Path("/remove")
    @Produces({ "*/*" })
    @ApiOperation(value = "Remove Asset from Collection", tags={ "Asset" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse removeAsset(@QueryParam("assetId") @NotNull String assetId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("albumId") Long albumId, @QueryParam("collectionId") Long collectionId, @QueryParam("removeFromDefaultAlbums") Boolean removeFromDefaultAlbums, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Search Assets
     *
     * Searches for assets
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Assets", tags={ "Asset" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AssetResponse.class, responseContainer = "List") })
    public List<AssetResponse> searchAssets(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("albumIds") String albumIds, @QueryParam("assetIds") String assetIds, @QueryParam("appKey") String appKey, @QueryParam("mediaType") String mediaType, @QueryParam("mimeType") String mimeType, @QueryParam("keyword") String keyword, @QueryParam("versionCode") Integer versionCode, @QueryParam("versionName") String versionName, @QueryParam("updatedSince") Long updatedSince, @QueryParam("updatedBefore") Long updatedBefore, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("searchMediaLibrary") Boolean searchMediaLibrary, @QueryParam("filterByBillable") Boolean filterByBillable, @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("returnApp") Boolean returnApp, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("searchMode") String searchMode, @QueryParam("assetType") String assetType, @QueryParam("approvalStatus") String approvalStatus, @QueryParam("assignedAccountId") Long assignedAccountId);

    /**
     * Update Asset
     *
     * Updates an asset&#39;s meta data. If an album reference is passed in, the participants with write permissions are allowed to edit the asset. Otherwise, only the asset up-loader has permission to edit the data.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Asset", tags={ "Asset" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse updateAsset(@QueryParam("assetId") @NotNull Long assetId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("albumId") Long albumId, @QueryParam("attachedAssetId") Long attachedAssetId, @QueryParam("versionCode") Integer versionCode, @QueryParam("versionName") String versionName, @QueryParam("metaData") String metaData, @QueryParam("caption") String caption, @QueryParam("assetType") String assetType, @QueryParam("approvalStatus") String approvalStatus, @QueryParam("assignedAccountId") Long assignedAccountId, @QueryParam("media") File media, @QueryParam("mediaUrl") String mediaUrl, @QueryParam("mediaString") String mediaString, @QueryParam("mediaStringFileName") String mediaStringFileName, @QueryParam("mediaStringContentType") String mediaStringContentType, @QueryParam("mediaHeight") Integer mediaHeight, @QueryParam("mediaWidth") Integer mediaWidth, @QueryParam("attachedMedia") File attachedMedia, @QueryParam("attachedMediaUrl") String attachedMediaUrl, @QueryParam("attachedMediaString") String attachedMediaString, @QueryParam("attachedMediaStringFileName") String attachedMediaStringFileName, @QueryParam("attachedMediaStringContentType") String attachedMediaStringContentType, @QueryParam("attachedMediaHeight") Integer attachedMediaHeight, @QueryParam("attachedMediaWidth") Integer attachedMediaWidth, @QueryParam("locationDescription") String locationDescription, @QueryParam("searchTags") String searchTags, @QueryParam("appKey") String appKey, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);
}
