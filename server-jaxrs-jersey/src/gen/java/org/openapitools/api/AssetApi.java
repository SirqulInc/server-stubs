package org.openapitools.api;

import org.openapitools.api.AssetApiService;
import org.openapitools.api.factories.AssetApiServiceFactory;

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

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/asset")


@io.swagger.annotations.Api(description = "the asset API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AssetApi  {
   private final AssetApiService delegate;

   public AssetApi(@Context ServletConfig servletContext) {
      AssetApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AssetApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AssetApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = AssetApiServiceFactory.getAssetApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    @Path("/download/{filename}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Download Asset", notes = "Downloads an asset from the server for assets that have been uploaded to the server.", response = SirqulResponse.class, tags={ "Asset", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response assetDownload(@ApiParam(value = "the filename in the following formats: {assetId}-{suffix}.{extension} | {assetId}.{extension} | {assetId}", required = true) @PathParam("filename") @NotNull  @Pattern(regexp=".+") String filename,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.assetDownload(filename, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/morph")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Convert Offer to Creative", notes = "Converts an offer image + text into a creative image.", response = AssetShortResponse.class, tags={ "Asset", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssetShortResponse.class)
    })
    public Response assetMorph(@ApiParam(value = "offer id used for inserting offer text/flavor", required = true) @QueryParam("offerId") @NotNull  Long offerId,@ApiParam(value = "the ad size used for selecting a format for the creative image", required = true, allowableValues="CONFIG, BANNER, LEADERBOARD, SKYSCRAPER, VIDEO, ZIP, INTERSTITIAL, CUSTOM1, CUSTOM2, CUSTOM3, CUSTOM4, CUSTOM5, CUSTOM6, CUSTOM7, CUSTOM8, CUSTOM9, CUSTOM10") @QueryParam("adSize") @NotNull  String adSize,@ApiParam(value = "used for inserting the newly created image into") @QueryParam("creativeId")  Long creativeId,@ApiParam(value = "total width of the creative image") @QueryParam("width")  Integer width,@ApiParam(value = "total height of the creative image") @QueryParam("height")  Integer height,@ApiParam(value = "the size of the background") @QueryParam("backgroundSize")  String backgroundSize,@ApiParam(value = "the template to use") @QueryParam("template")  String template,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.assetMorph(offerId, adSize, creativeId, width, height, backgroundSize, template, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Asset", notes = "Uploads an asset to server and returns an asset id which can be used to assign to various objects.", response = AssetResponse.class, tags={ "Asset", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssetResponse.class)
    })
    public Response createAsset(@ApiParam(value = "to return nulls") @QueryParam("returnNulls")  Boolean returnNulls,@ApiParam(value = "a unique ID given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account ID of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the album the asset will be added to (optional)") @QueryParam("albumId")  Long albumId,@ApiParam(value = "Deprecated: use collections via the collection endpoints.") @QueryParam("collectionId")  Long collectionId,@ApiParam(value = "Whether to add to a default album") @QueryParam("addToDefaultAlbum")  String addToDefaultAlbum,@ApiParam(value = "Whether to add to the media library") @QueryParam("addToMediaLibrary")  Boolean addToMediaLibrary,@ApiParam(value = "the version code") @QueryParam("versionCode")  Integer versionCode,@ApiParam(value = "the version name") @QueryParam("versionName")  String versionName,@ApiParam(value = "External custom client defined data") @QueryParam("metaData")  String metaData,@ApiParam(value = "the caption (optional)") @QueryParam("caption")  String caption,@ApiParam(value = "the asset type") @QueryParam("assetType")  String assetType,@ApiParam(value = "approval status for the asset") @QueryParam("approvalStatus")  String approvalStatus,@ApiParam(value = "account id assigned to the asset") @QueryParam("assignedAccountId")  Long assignedAccountId,@ApiParam(value = "a MultipartFile containing the mimetype, etc") @QueryParam("media")  File media,@ApiParam(value = "this can be used if the \"media\" is a link (optional)") @QueryParam("mediaUrl")  String mediaUrl,@ApiParam(value = "the media content as a string (optional)") @QueryParam("mediaString")  String mediaString,@ApiParam(value = "file name for mediaString (optional)") @QueryParam("mediaStringFileName")  String mediaStringFileName,@ApiParam(value = "content type for mediaString (optional)") @QueryParam("mediaStringContentType")  String mediaStringContentType,@ApiParam(value = "the media height (optional)") @QueryParam("mediaHeight")  Integer mediaHeight,@ApiParam(value = "the media width (optional)") @QueryParam("mediaWidth")  Integer mediaWidth,@ApiParam(value = "a MultipartFile containing an asset that the \"media\" file references (optional). Example: to upload a video the \"media\" file should contain a screen capture and the \"attachedMedia\" should be the actual video.") @QueryParam("attachedMedia")  File attachedMedia,@ApiParam(value = "this can be used if the \"attachedMedia\" is a link (i.e. a Youtube video, etc) (optional)") @QueryParam("attachedMediaUrl")  String attachedMediaUrl,@ApiParam(value = "attached media content as a string (optional)") @QueryParam("attachedMediaString")  String attachedMediaString,@ApiParam(value = "file name for attachedMediaString (optional)") @QueryParam("attachedMediaStringFileName")  String attachedMediaStringFileName,@ApiParam(value = "content type for attachedMediaString (optional)") @QueryParam("attachedMediaStringContentType")  String attachedMediaStringContentType,@ApiParam(value = "the attached media height (optional)") @QueryParam("attachedMediaHeight")  Integer attachedMediaHeight,@ApiParam(value = "the attached media width (optional)") @QueryParam("attachedMediaWidth")  Integer attachedMediaWidth,@ApiParam(value = "the location description (optional)") @QueryParam("locationDescription")  String locationDescription,@ApiParam(value = "Deprecated: app parameter") @QueryParam("app")  String app,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "the search tags") @QueryParam("searchTags")  String searchTags,@ApiParam(value = "the latitude (optional)") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the longitude (optional)") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createAsset(returnNulls, deviceId, accountId, albumId, collectionId, addToDefaultAlbum, addToMediaLibrary, versionCode, versionName, metaData, caption, assetType, approvalStatus, assignedAccountId, media, mediaUrl, mediaString, mediaStringFileName, mediaStringContentType, mediaHeight, mediaWidth, attachedMedia, attachedMediaUrl, attachedMediaString, attachedMediaStringFileName, attachedMediaStringContentType, attachedMediaHeight, attachedMediaWidth, locationDescription, app, appKey, searchTags, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Asset", notes = "Delete an asset.", response = SirqulResponse.class, tags={ "Asset", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteAsset(@ApiParam(value = "the id of the asset to delete", required = true) @QueryParam("assetId") @NotNull  String assetId,@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "latitude used to update the user's current location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "longitude used to update the user's current location") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteAsset(assetId, deviceId, accountId, latitude, longitude, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Asset", notes = "Gets the full asset response including attached likes and notes.", response = AssetFullResponse.class, tags={ "Asset", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssetFullResponse.class)
    })
    public Response getAsset(@ApiParam(value = "the asset ID", required = true) @QueryParam("assetId") @NotNull  Long assetId,@ApiParam(value = "a unique ID given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account ID of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "determines whether the notes on the asset are in descending order", defaultValue = "false") @DefaultValue("false") @QueryParam("noteDescending")  Boolean noteDescending,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAsset(assetId, deviceId, accountId, noteDescending, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/remove")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Remove Asset from Collection", notes = "Remove assets from collections", response = SirqulResponse.class, tags={ "Asset", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response removeAsset(@ApiParam(value = "the id of the asset to remove", required = true) @QueryParam("assetId") @NotNull  String assetId,@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the album id to remove the asset from") @QueryParam("albumId")  Long albumId,@ApiParam(value = "the collection id to remove the asset from") @QueryParam("collectionId")  Long collectionId,@ApiParam(value = "remove from the user's profile album") @QueryParam("removeFromDefaultAlbums")  Boolean removeFromDefaultAlbums,@ApiParam(value = "latitude used to update the user's current location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "longitude used to update the user's current location") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.removeAsset(assetId, deviceId, accountId, albumId, collectionId, removeFromDefaultAlbums, latitude, longitude, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Assets", notes = "Searches for assets", response = AssetResponse.class, responseContainer = "List", tags={ "Asset", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssetResponse.class, responseContainer = "List")
    })
    public Response searchAssets(@ApiParam(value = "a unique ID given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account ID of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "comma separated list of album ids to search on") @QueryParam("albumIds")  String albumIds,@ApiParam(value = "comma separated list of asset ids to search on") @QueryParam("assetIds")  String assetIds,@ApiParam(value = "the application key to filter results by application.") @QueryParam("appKey")  String appKey,@ApiParam(value = "filter results by media type. Possible values include: APPLICATION, IMAGE, AUDIO, VIDEO, MULTIPART, TEXT") @QueryParam("mediaType")  String mediaType,@ApiParam(value = "filter results by mime type") @QueryParam("mimeType")  String mimeType,@ApiParam(value = "keyword search string") @QueryParam("keyword")  String keyword,@ApiParam(value = "filter results by version code") @QueryParam("versionCode")  Integer versionCode,@ApiParam(value = "filter results by version name") @QueryParam("versionName")  String versionName,@ApiParam(value = "return items that have been updated since this date (time-stamp in milliseconds)") @QueryParam("updatedSince")  Long updatedSince,@ApiParam(value = "return items that have been updated before this date (time-stamp in milliseconds)") @QueryParam("updatedBefore")  Long updatedBefore,@ApiParam(value = "the field to sort by. See AssetApiMap") @QueryParam("sortField")  String sortField,@ApiParam(value = "determines whether the sorted list is in descending or ascending order") @QueryParam("descending")  Boolean descending,@ApiParam(value = "determines whether to search on the media library album") @QueryParam("searchMediaLibrary")  Boolean searchMediaLibrary,@ApiParam(value = "filter results by billable entity") @QueryParam("filterByBillable")  Boolean filterByBillable,@ApiParam(value = "if only searching for active assets") @QueryParam("activeOnly")  Boolean activeOnly,@ApiParam(value = "determines whether to include the application response as part of the asset response") @QueryParam("returnApp")  Boolean returnApp,@ApiParam(value = "the start index for pagination") @QueryParam("start")  Integer start,@ApiParam(value = "the limit for pagination (there is a hard limit of 200)") @QueryParam("limit")  Integer limit,@ApiParam(value = "search mode for index (SearchIndexMode)") @QueryParam("searchMode")  String searchMode,@ApiParam(value = "filter by asset type") @QueryParam("assetType")  String assetType,@ApiParam(value = "filter by approval status") @QueryParam("approvalStatus")  String approvalStatus,@ApiParam(value = "filter results by an assigned account id") @QueryParam("assignedAccountId")  Long assignedAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchAssets(deviceId, accountId, albumIds, assetIds, appKey, mediaType, mimeType, keyword, versionCode, versionName, updatedSince, updatedBefore, sortField, descending, searchMediaLibrary, filterByBillable, activeOnly, returnApp, start, limit, searchMode, assetType, approvalStatus, assignedAccountId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Asset", notes = "Updates an asset's meta data. If an album reference is passed in, the participants with write permissions are allowed to edit the asset. Otherwise, only the asset up-loader has permission to edit the data.", response = SirqulResponse.class, tags={ "Asset", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response updateAsset(@ApiParam(value = "the ID of the asset to update", required = true) @QueryParam("assetId") @NotNull  Long assetId,@ApiParam(value = "a unique ID given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account ID of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the ID of the album to check user permissions") @QueryParam("albumId")  Long albumId,@ApiParam(value = "the ID of the attached asset") @QueryParam("attachedAssetId")  Long attachedAssetId,@ApiParam(value = "the version code") @QueryParam("versionCode")  Integer versionCode,@ApiParam(value = "the version name") @QueryParam("versionName")  String versionName,@ApiParam(value = "External custom client defined data") @QueryParam("metaData")  String metaData,@ApiParam(value = "the caption") @QueryParam("caption")  String caption,@ApiParam(value = "the asset type") @QueryParam("assetType")  String assetType,@ApiParam(value = "approval status for the asset") @QueryParam("approvalStatus")  String approvalStatus,@ApiParam(value = "account id assigned to the asset") @QueryParam("assignedAccountId")  Long assignedAccountId,@ApiParam(value = "a MultipartFile containing the mimetype, etc") @QueryParam("media")  File media,@ApiParam(value = "this can be used if the \"media\" is a link (optional)") @QueryParam("mediaUrl")  String mediaUrl,@ApiParam(value = "the media content as a string (optional)") @QueryParam("mediaString")  String mediaString,@ApiParam(value = "file name for mediaString (optional)") @QueryParam("mediaStringFileName")  String mediaStringFileName,@ApiParam(value = "content type for mediaString (optional)") @QueryParam("mediaStringContentType")  String mediaStringContentType,@ApiParam(value = "the media height (optional)") @QueryParam("mediaHeight")  Integer mediaHeight,@ApiParam(value = "the media width (optional)") @QueryParam("mediaWidth")  Integer mediaWidth,@ApiParam(value = "a MultipartFile containing an asset that the \"media\" file references (optional). Example: to upload a video the \"media\" file should contain a screen capture and the \"attachedMedia\" should be the actual video.") @QueryParam("attachedMedia")  File attachedMedia,@ApiParam(value = "this can be used if the \"attachedMedia\" is a link (i.e. a Youtube video, etc) (optional)") @QueryParam("attachedMediaUrl")  String attachedMediaUrl,@ApiParam(value = "attached media content as a string (optional)") @QueryParam("attachedMediaString")  String attachedMediaString,@ApiParam(value = "file name for attachedMediaString (optional)") @QueryParam("attachedMediaStringFileName")  String attachedMediaStringFileName,@ApiParam(value = "content type for attachedMediaString (optional)") @QueryParam("attachedMediaStringContentType")  String attachedMediaStringContentType,@ApiParam(value = "the attached media height (optional)") @QueryParam("attachedMediaHeight")  Integer attachedMediaHeight,@ApiParam(value = "the attached media width (optional)") @QueryParam("attachedMediaWidth")  Integer attachedMediaWidth,@ApiParam(value = "the location description") @QueryParam("locationDescription")  String locationDescription,@ApiParam(value = "search tags") @QueryParam("searchTags")  String searchTags,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "latitude used to update the asset's location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "longitude used to update the asset's location") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateAsset(assetId, deviceId, accountId, albumId, attachedAssetId, versionCode, versionName, metaData, caption, assetType, approvalStatus, assignedAccountId, media, mediaUrl, mediaString, mediaStringFileName, mediaStringContentType, mediaHeight, mediaWidth, attachedMedia, attachedMediaUrl, attachedMediaString, attachedMediaStringFileName, attachedMediaStringContentType, attachedMediaHeight, attachedMediaWidth, locationDescription, searchTags, appKey, latitude, longitude, securityContext);
    }
}
