package org.openapitools.api;

import org.openapitools.api.NoteApiService;
import org.openapitools.api.factories.NoteApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.math.BigDecimal;
import java.io.File;
import org.openapitools.model.NoteResponse;
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

@Path("/note")


@io.swagger.annotations.Api(description = "the note API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class NoteApi  {
   private final NoteApiService delegate;

   public NoteApi(@Context ServletConfig servletContext) {
      NoteApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("NoteApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (NoteApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = NoteApiServiceFactory.getNoteApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/batch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Batch Note Operation", notes = "Perform a batch operation on notes for a notable object (for example: DELETE_ALL_NOTES_IN_NOTABLE). ", response = SirqulResponse.class, tags={ "Note", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response batchOperation(@ApiParam(value = "The id of the notable object the batch operation will affect", required = true) @QueryParam("notableId") @NotNull  Long notableId,@ApiParam(value = "The notable object type (for example ALBUM, ASSET, OFFER, etc.)", required = true) @QueryParam("notableType") @NotNull  String notableType,@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The batch operation to perform (e.g., DELETE_ALL_NOTES_IN_NOTABLE). Optional.") @QueryParam("batchOperation")  String batchOperation,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.batchOperation(notableId, notableType, deviceId, accountId, batchOperation, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Note", notes = "This is used to leave a comment (note) on a notable object (i.e. albums, album contests, assets, game levels, offers, offer locations, retailers, retailer locations, and theme descriptors). Leaving a comment on a notable object will be visiable to everyone who has access to view the object.", response = NoteResponse.class, tags={ "Note", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NoteResponse.class)
    })
    public Response createNote(@ApiParam(value = "The message the user wishes to leave a comment on", required = true) @QueryParam("comment") @NotNull  String comment,@ApiParam(value = "The unique device identifier that made the request (either deviceId or accountId must be used)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The unique accountId that made the request (either deviceId or accountId must be used)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The notable object type {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, OFFER, OFFER_LOCATION, RETAILER, RETAILER_LOCATION, THEME_DESCRIPTOR}") @QueryParam("notableType")  String notableType,@ApiParam(value = "The id of the notable object") @QueryParam("notableId")  Long notableId,@ApiParam(value = "The custom string defined by the client (used for differentiating various note types)") @QueryParam("noteType")  String noteType,@ApiParam(value = "A comma separated list of asset IDs to add with the note") @QueryParam("assetIds")  String assetIds,@ApiParam(value = "search tags") @QueryParam("tags")  String tags,@ApiParam(value = "This is used for sending out group notifications. For example, when someone adds a note to an asset which is also a part of an album, everyone in the album will receive a notification. This is achieved by passing in the permissionable type (in this case \"album\"), and the permissionable id (the album id). Possible types: {ALBUM, ALBUM_CONTEST, GAME_LEVEL, THEME_DESCRIPTOR}") @QueryParam("permissionableType")  String permissionableType,@ApiParam(value = "The id of the permissionable object (for sending group notifications)") @QueryParam("permissionableId")  Long permissionableId,@ApiParam(value = "The application key used to identify the application") @QueryParam("appKey")  String appKey,@ApiParam(value = "The description of the location") @QueryParam("locationDescription")  String locationDescription,@ApiParam(value = "The current location of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current location of the user") @QueryParam("longitude")  Double longitude,@ApiParam(value = "External custom client defined data") @QueryParam("metaData")  String metaData,@ApiParam(value = "Comma separated list of additional account IDs that will receive the note notifications") @QueryParam("receiverAccountIds")  String receiverAccountIds,@ApiParam(value = "whether to return the full response or not") @QueryParam("returnFullResponse")  Boolean returnFullResponse,@ApiParam(value = "Check true if need to initialize an asset and assign to current note") @QueryParam("initializeAsset")  Boolean initializeAsset,@ApiParam(value = "Return null fields for asset response when creating an asset") @QueryParam("assetReturnNulls")  Boolean assetReturnNulls,@ApiParam(value = "the album the asset will be added to (optional)") @QueryParam("assetAlbumId")  Long assetAlbumId,@ApiParam(value = "the collection ID that the asset is associated with") @QueryParam("assetCollectionId")  Long assetCollectionId,@ApiParam(value = "the default album to add the asset to") @QueryParam("assetAddToDefaultAlbum")  String assetAddToDefaultAlbum,@ApiParam(value = "the media library to add the asset to") @QueryParam("assetAddToMediaLibrary")  Boolean assetAddToMediaLibrary,@ApiParam(value = "the version code of the asset") @QueryParam("assetVersionCode")  Integer assetVersionCode,@ApiParam(value = "the version name of the asset") @QueryParam("assetVersionName")  String assetVersionName,@ApiParam(value = "the meta data of the asset") @QueryParam("assetMetaData")  String assetMetaData,@ApiParam(value = "the caption of the asset") @QueryParam("assetCaption")  String assetCaption,@ApiParam(value = "the media of the asset") @QueryParam("assetMedia")  File assetMedia,@ApiParam(value = "the media URL of the asset") @QueryParam("assetMediaUrl")  String assetMediaUrl,@ApiParam(value = "the media string of the asset") @QueryParam("assetMediaString")  String assetMediaString,@ApiParam(value = "the media string file name of the asset") @QueryParam("assetMediaStringFileName")  String assetMediaStringFileName,@ApiParam(value = "the media string content type of the asset") @QueryParam("assetMediaStringContentType")  String assetMediaStringContentType,@ApiParam(value = "the attached media of the asset") @QueryParam("assetAttachedMedia")  File assetAttachedMedia,@ApiParam(value = "the attached media URL of the asset") @QueryParam("assetAttachedMediaUrl")  String assetAttachedMediaUrl,@ApiParam(value = "the attached media string of the asset") @QueryParam("assetAttachedMediaString")  String assetAttachedMediaString,@ApiParam(value = "the attached media string file name of the asset") @QueryParam("assetAttachedMediaStringFileName")  String assetAttachedMediaStringFileName,@ApiParam(value = "the attached media string content type of the asset") @QueryParam("assetAttachedMediaStringContentType")  String assetAttachedMediaStringContentType,@ApiParam(value = "the location description for the asset") @QueryParam("assetLocationDescription")  String assetLocationDescription,@ApiParam(value = "the application for the asset") @QueryParam("assetApp")  String assetApp,@ApiParam(value = "the search tags used for the asset") @QueryParam("assetSearchTags")  String assetSearchTags,@ApiParam(value = "the latitude of the asset") @QueryParam("assetLatitude")  Double assetLatitude,@ApiParam(value = "the longitude of the asset") @QueryParam("assetLongitude")  BigDecimal assetLongitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createNote(comment, deviceId, accountId, notableType, notableId, noteType, assetIds, tags, permissionableType, permissionableId, appKey, locationDescription, latitude, longitude, metaData, receiverAccountIds, returnFullResponse, initializeAsset, assetReturnNulls, assetAlbumId, assetCollectionId, assetAddToDefaultAlbum, assetAddToMediaLibrary, assetVersionCode, assetVersionName, assetMetaData, assetCaption, assetMedia, assetMediaUrl, assetMediaString, assetMediaStringFileName, assetMediaStringContentType, assetAttachedMedia, assetAttachedMediaUrl, assetAttachedMediaString, assetAttachedMediaStringFileName, assetAttachedMediaStringContentType, assetLocationDescription, assetApp, assetSearchTags, assetLatitude, assetLongitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Note", notes = "Sets a comment (note) as deleted.", response = SirqulResponse.class, tags={ "Note", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteNote(@ApiParam(value = "The ID of the note to delete", required = true) @QueryParam("noteId") @NotNull  Long noteId,@ApiParam(value = "The unique device identifier that made the request (either deviceId or accountId must be used)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The unique accountId that made the request (either deviceId or accountId must be used)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The current location of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current location of the user") @QueryParam("longitude")  Double longitude,@ApiParam(value = "The application key used to identify the application") @QueryParam("appKey")  String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteNote(noteId, deviceId, accountId, latitude, longitude, appKey, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Note", notes = "Get for a note based on its Id.", response = SirqulResponse.class, tags={ "Note", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response getNote(@ApiParam(value = "the id of the note to get", required = true) @QueryParam("noteId") @NotNull  Long noteId,@ApiParam(value = "The unique device identifier that made the request (either deviceId or accountId must be used)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The unique accountId that made the request (either deviceId or accountId must be used)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "Determines whether to return the NoteFullResponse for the item") @QueryParam("returnFullResponse")  Boolean returnFullResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getNote(noteId, deviceId, accountId, returnFullResponse, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Notes", notes = "Search for notes on a notable object.", response = NoteResponse.class, responseContainer = "List", tags={ "Note", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NoteResponse.class, responseContainer = "List")
    })
    public Response searchNotes(@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The notable object type {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, OFFER, OFFER_LOCATION, RETAILER, RETAILER_LOCATION, THEME_DESCRIPTOR}") @QueryParam("notableType")  String notableType,@ApiParam(value = "The id of the notable object") @QueryParam("notableId")  Long notableId,@ApiParam(value = "Comma separated list of noteType strings to filter results with") @QueryParam("noteTypes")  String noteTypes,@ApiParam(value = "The application key used to identify the application") @QueryParam("appKey")  String appKey,@ApiParam(value = "The keyword used to search") @QueryParam("keyword")  String keyword,@ApiParam(value = "return items that has flagCount >= flagCountMinimum if this is set, return all items, even ones with flagCount >= flagThreshold") @QueryParam("flagCountMinimum")  Long flagCountMinimum,@ApiParam(value = "return items that has flagCount >= flagThreshold, which are hidden by default") @QueryParam("flagsExceedThreshold")  Boolean flagsExceedThreshold,@ApiParam(value = "include inactive in the result") @QueryParam("includeInactive")  Boolean includeInactive,@ApiParam(value = "The column to sort the search on", allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, OWNER_DISPLAY, NOTABLE_TYPE, NOTE_TAG, NOTE_COUNT, LIKES, DISLIKES") @QueryParam("sortField")  String sortField,@ApiParam(value = "The order to return the search results") @QueryParam("descending")  Boolean descending,@ApiParam(value = "Determines whether to return the NoteFullResponse for each search item") @QueryParam("returnFullResponse")  Boolean returnFullResponse,@ApiParam(value = "return items that have been updated since this date (time-stamp in milliseconds)") @QueryParam("updatedSince")  Long updatedSince,@ApiParam(value = "return items that have been updated before this date (time-stamp in milliseconds)") @QueryParam("updatedBefore")  Long updatedBefore,@ApiParam(value = "The record to begin the return set on") @QueryParam("start")  Integer start,@ApiParam(value = "The number of records to return") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchNotes(deviceId, accountId, notableType, notableId, noteTypes, appKey, keyword, flagCountMinimum, flagsExceedThreshold, includeInactive, sortField, descending, returnFullResponse, updatedSince, updatedBefore, start, limit, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Note", notes = "Update an existing comment (note). Only the creator of the note have permission to update.", response = NoteResponse.class, tags={ "Note", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NoteResponse.class)
    })
    public Response updateNote(@ApiParam(value = "The id of the note, used when editing a comment", required = true) @QueryParam("noteId") @NotNull  Long noteId,@ApiParam(value = "The unique device identifier that made the request (either deviceId or accountId must be used)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The unique accountId that made the request (either deviceId or accountId must be used)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The message the user wishes to leave a comment on") @QueryParam("comment")  String comment,@ApiParam(value = "The custom string defined by the client (used for differentiating on various note types)") @QueryParam("noteType")  String noteType,@ApiParam(value = "A comma separated list of asset IDs to add with the note") @QueryParam("assetIds")  String assetIds,@ApiParam(value = "search tags") @QueryParam("tags")  String tags,@ApiParam(value = "This is used for sending out group notifications. For example, when someone adds a note to an asset which is also a part of an album, everyone in the album will receive a notification. This is achieved by passing in the permissionable type (in this case \"album\"), and the permissionable id (the album id). Possible types: {ALBUM, ALBUM_CONTEST, GAME_LEVEL, THEME_DESCRIPTOR}") @QueryParam("permissionableType")  String permissionableType,@ApiParam(value = "The id of the permissionable object (for sending group notifications)") @QueryParam("permissionableId")  Long permissionableId,@ApiParam(value = "The application key used to identify the application") @QueryParam("appKey")  String appKey,@ApiParam(value = "The description of the location") @QueryParam("locationDescription")  String locationDescription,@ApiParam(value = "The current location of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current location of the user") @QueryParam("longitude")  Double longitude,@ApiParam(value = "meta data to update with the note") @QueryParam("metaData")  String metaData,@ApiParam(value = "whether to return the full response or not") @QueryParam("returnFullResponse")  Boolean returnFullResponse,@ApiParam(value = "Sets the active flag for the note") @QueryParam("active")  Boolean active,@ApiParam(value = "main flag for updating asset in note, must set to true if you want to update the note's asset") @QueryParam("updateAsset")  Boolean updateAsset,@ApiParam(value = "Return null fields for asset response when updating an asset") @QueryParam("assetReturnNulls")  Boolean assetReturnNulls,@ApiParam(value = "the album the asset will be added to (optional)") @QueryParam("assetAlbumId")  Long assetAlbumId,@ApiParam(value = "the collection ID that the asset is associated with") @QueryParam("assetCollectionId")  Long assetCollectionId,@ApiParam(value = "the default album to add the asset to") @QueryParam("assetAddToDefaultAlbum")  String assetAddToDefaultAlbum,@ApiParam(value = "the media library to add the asset to") @QueryParam("assetAddToMediaLibrary")  Boolean assetAddToMediaLibrary,@ApiParam(value = "the version code of the asset") @QueryParam("assetVersionCode")  Integer assetVersionCode,@ApiParam(value = "the version name of the asset") @QueryParam("assetVersionName")  String assetVersionName,@ApiParam(value = "the meta data of the asset") @QueryParam("assetMetaData")  String assetMetaData,@ApiParam(value = "the caption of the asset") @QueryParam("assetCaption")  String assetCaption,@ApiParam(value = "the media of the asset") @QueryParam("assetMedia")  File assetMedia,@ApiParam(value = "the media URL of the asset") @QueryParam("assetMediaUrl")  String assetMediaUrl,@ApiParam(value = "the media string of the asset") @QueryParam("assetMediaString")  String assetMediaString,@ApiParam(value = "the media string file name of the asset") @QueryParam("assetMediaStringFileName")  String assetMediaStringFileName,@ApiParam(value = "the media string content type of the asset") @QueryParam("assetMediaStringContentType")  String assetMediaStringContentType,@ApiParam(value = "the attached media of the asset") @QueryParam("assetAttachedMedia")  File assetAttachedMedia,@ApiParam(value = "the attached media URL of the asset") @QueryParam("assetAttachedMediaUrl")  String assetAttachedMediaUrl,@ApiParam(value = "the attached media string of the asset") @QueryParam("assetAttachedMediaString")  String assetAttachedMediaString,@ApiParam(value = "the attached media string file name of the asset") @QueryParam("assetAttachedMediaStringFileName")  String assetAttachedMediaStringFileName,@ApiParam(value = "the attached media string content type of the asset") @QueryParam("assetAttachedMediaStringContentType")  String assetAttachedMediaStringContentType,@ApiParam(value = "the location description for the asset") @QueryParam("assetLocationDescription")  String assetLocationDescription,@ApiParam(value = "the application for the asset") @QueryParam("assetApp")  String assetApp,@ApiParam(value = "the search tags used for the asset") @QueryParam("assetSearchTags")  String assetSearchTags,@ApiParam(value = "the latitude of the asset") @QueryParam("assetLatitude")  Double assetLatitude,@ApiParam(value = "the longitude of the asset") @QueryParam("assetLongitude")  Double assetLongitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateNote(noteId, deviceId, accountId, comment, noteType, assetIds, tags, permissionableType, permissionableId, appKey, locationDescription, latitude, longitude, metaData, returnFullResponse, active, updateAsset, assetReturnNulls, assetAlbumId, assetCollectionId, assetAddToDefaultAlbum, assetAddToMediaLibrary, assetVersionCode, assetVersionName, assetMetaData, assetCaption, assetMedia, assetMediaUrl, assetMediaString, assetMediaStringFileName, assetMediaStringContentType, assetAttachedMedia, assetAttachedMediaUrl, assetAttachedMediaString, assetAttachedMediaStringFileName, assetAttachedMediaStringContentType, assetLocationDescription, assetApp, assetSearchTags, assetLatitude, assetLongitude, securityContext);
    }
}
