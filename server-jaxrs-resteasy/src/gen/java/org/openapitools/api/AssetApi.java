package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.AssetApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AssetFullResponse;
import org.openapitools.model.AssetResponse;
import org.openapitools.model.AssetShortResponse;
import java.io.File;
import org.openapitools.model.SirqulResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/asset")


@io.swagger.annotations.Api(description = "the asset API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AssetApi  {

    @Inject AssetApiService service;

    @GET
    @Path("/download/{filename}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Download Asset", notes = "Downloads an asset from the server for assets that have been uploaded to the server.", response = SirqulResponse.class, tags={ "Asset", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response assetDownload( @Pattern(regexp=".+") @PathParam("filename") String filename,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assetDownload(filename,securityContext);
    }
    @POST
    @Path("/morph")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Convert Offer to Creative", notes = "Converts an offer image + text into a creative image.", response = AssetShortResponse.class, tags={ "Asset", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssetShortResponse.class) })
    public Response assetMorph( @NotNull @QueryParam("offerId") Long offerId, @NotNull, allowableValues="CONFIG, BANNER, LEADERBOARD, SKYSCRAPER, VIDEO, ZIP, INTERSTITIAL, CUSTOM1, CUSTOM2, CUSTOM3, CUSTOM4, CUSTOM5, CUSTOM6, CUSTOM7, CUSTOM8, CUSTOM9, CUSTOM10" @QueryParam("adSize") String adSize, @QueryParam("creativeId") Long creativeId, @QueryParam("width") Integer width, @QueryParam("height") Integer height, @QueryParam("backgroundSize") String backgroundSize, @QueryParam("template") String template,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assetMorph(offerId,adSize,creativeId,width,height,backgroundSize,template,securityContext);
    }
    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Asset", notes = "Uploads an asset to server and returns an asset id which can be used to assign to various objects.", response = AssetResponse.class, tags={ "Asset", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssetResponse.class) })
    public Response createAsset( @QueryParam("returnNulls") Boolean returnNulls, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("albumId") Long albumId, @QueryParam("collectionId") Long collectionId, @QueryParam("addToDefaultAlbum") String addToDefaultAlbum, @QueryParam("addToMediaLibrary") Boolean addToMediaLibrary, @QueryParam("versionCode") Integer versionCode, @QueryParam("versionName") String versionName, @QueryParam("metaData") String metaData, @QueryParam("caption") String caption, @QueryParam("assetType") String assetType, @QueryParam("approvalStatus") String approvalStatus, @QueryParam("assignedAccountId") Long assignedAccountId, @QueryParam("media") File media, @QueryParam("mediaUrl") String mediaUrl, @QueryParam("mediaString") String mediaString, @QueryParam("mediaStringFileName") String mediaStringFileName, @QueryParam("mediaStringContentType") String mediaStringContentType, @QueryParam("mediaHeight") Integer mediaHeight, @QueryParam("mediaWidth") Integer mediaWidth, @QueryParam("attachedMedia") File attachedMedia, @QueryParam("attachedMediaUrl") String attachedMediaUrl, @QueryParam("attachedMediaString") String attachedMediaString, @QueryParam("attachedMediaStringFileName") String attachedMediaStringFileName, @QueryParam("attachedMediaStringContentType") String attachedMediaStringContentType, @QueryParam("attachedMediaHeight") Integer attachedMediaHeight, @QueryParam("attachedMediaWidth") Integer attachedMediaWidth, @QueryParam("locationDescription") String locationDescription, @QueryParam("app") String app, @QueryParam("appKey") String appKey, @QueryParam("searchTags") String searchTags, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createAsset(returnNulls,deviceId,accountId,albumId,collectionId,addToDefaultAlbum,addToMediaLibrary,versionCode,versionName,metaData,caption,assetType,approvalStatus,assignedAccountId,media,mediaUrl,mediaString,mediaStringFileName,mediaStringContentType,mediaHeight,mediaWidth,attachedMedia,attachedMediaUrl,attachedMediaString,attachedMediaStringFileName,attachedMediaStringContentType,attachedMediaHeight,attachedMediaWidth,locationDescription,app,appKey,searchTags,latitude,longitude,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Asset", notes = "Delete an asset.", response = SirqulResponse.class, tags={ "Asset", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteAsset( @NotNull @QueryParam("assetId") String assetId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteAsset(assetId,deviceId,accountId,latitude,longitude,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Asset", notes = "Gets the full asset response including attached likes and notes.", response = AssetFullResponse.class, tags={ "Asset", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssetFullResponse.class) })
    public Response getAsset( @NotNull @QueryParam("assetId") Long assetId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @DefaultValue("false") @QueryParam("noteDescending") Boolean noteDescending,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAsset(assetId,deviceId,accountId,noteDescending,securityContext);
    }
    @POST
    @Path("/remove")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Remove Asset from Collection", notes = "Remove assets from collections", response = SirqulResponse.class, tags={ "Asset", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response removeAsset( @NotNull @QueryParam("assetId") String assetId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("albumId") Long albumId, @QueryParam("collectionId") Long collectionId, @QueryParam("removeFromDefaultAlbums") Boolean removeFromDefaultAlbums, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeAsset(assetId,deviceId,accountId,albumId,collectionId,removeFromDefaultAlbums,latitude,longitude,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Assets", notes = "Searches for assets", response = AssetResponse.class, responseContainer = "List", tags={ "Asset", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssetResponse.class, responseContainer = "List") })
    public Response searchAssets( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("albumIds") String albumIds, @QueryParam("assetIds") String assetIds, @QueryParam("appKey") String appKey, @QueryParam("mediaType") String mediaType, @QueryParam("mimeType") String mimeType, @QueryParam("keyword") String keyword, @QueryParam("versionCode") Integer versionCode, @QueryParam("versionName") String versionName, @QueryParam("updatedSince") Long updatedSince, @QueryParam("updatedBefore") Long updatedBefore, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("searchMediaLibrary") Boolean searchMediaLibrary, @QueryParam("filterByBillable") Boolean filterByBillable, @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("returnApp") Boolean returnApp, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("searchMode") String searchMode, @QueryParam("assetType") String assetType, @QueryParam("approvalStatus") String approvalStatus, @QueryParam("assignedAccountId") Long assignedAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchAssets(deviceId,accountId,albumIds,assetIds,appKey,mediaType,mimeType,keyword,versionCode,versionName,updatedSince,updatedBefore,sortField,descending,searchMediaLibrary,filterByBillable,activeOnly,returnApp,start,limit,searchMode,assetType,approvalStatus,assignedAccountId,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Asset", notes = "Updates an asset's meta data. If an album reference is passed in, the participants with write permissions are allowed to edit the asset. Otherwise, only the asset up-loader has permission to edit the data.", response = SirqulResponse.class, tags={ "Asset", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response updateAsset( @NotNull @QueryParam("assetId") Long assetId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("albumId") Long albumId, @QueryParam("attachedAssetId") Long attachedAssetId, @QueryParam("versionCode") Integer versionCode, @QueryParam("versionName") String versionName, @QueryParam("metaData") String metaData, @QueryParam("caption") String caption, @QueryParam("assetType") String assetType, @QueryParam("approvalStatus") String approvalStatus, @QueryParam("assignedAccountId") Long assignedAccountId, @QueryParam("media") File media, @QueryParam("mediaUrl") String mediaUrl, @QueryParam("mediaString") String mediaString, @QueryParam("mediaStringFileName") String mediaStringFileName, @QueryParam("mediaStringContentType") String mediaStringContentType, @QueryParam("mediaHeight") Integer mediaHeight, @QueryParam("mediaWidth") Integer mediaWidth, @QueryParam("attachedMedia") File attachedMedia, @QueryParam("attachedMediaUrl") String attachedMediaUrl, @QueryParam("attachedMediaString") String attachedMediaString, @QueryParam("attachedMediaStringFileName") String attachedMediaStringFileName, @QueryParam("attachedMediaStringContentType") String attachedMediaStringContentType, @QueryParam("attachedMediaHeight") Integer attachedMediaHeight, @QueryParam("attachedMediaWidth") Integer attachedMediaWidth, @QueryParam("locationDescription") String locationDescription, @QueryParam("searchTags") String searchTags, @QueryParam("appKey") String appKey, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateAsset(assetId,deviceId,accountId,albumId,attachedAssetId,versionCode,versionName,metaData,caption,assetType,approvalStatus,assignedAccountId,media,mediaUrl,mediaString,mediaStringFileName,mediaStringContentType,mediaHeight,mediaWidth,attachedMedia,attachedMediaUrl,attachedMediaString,attachedMediaStringFileName,attachedMediaStringContentType,attachedMediaHeight,attachedMediaWidth,locationDescription,searchTags,appKey,latitude,longitude,securityContext);
    }
}
