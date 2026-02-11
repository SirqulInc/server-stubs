package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.NoteApiService;

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

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/note")


@io.swagger.annotations.Api(description = "the note API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class NoteApi  {

    @Inject NoteApiService service;

    @POST
    @Path("/batch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Batch Note Operation", notes = "Perform a batch operation on notes for a notable object (for example: DELETE_ALL_NOTES_IN_NOTABLE). ", response = SirqulResponse.class, tags={ "Note", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response batchOperation( @NotNull @QueryParam("notableId") Long notableId, @NotNull @QueryParam("notableType") String notableType, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("batchOperation") String batchOperation,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.batchOperation(notableId,notableType,deviceId,accountId,batchOperation,securityContext);
    }
    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Note", notes = "This is used to leave a comment (note) on a notable object (i.e. albums, album contests, assets, game levels, offers, offer locations, retailers, retailer locations, and theme descriptors). Leaving a comment on a notable object will be visiable to everyone who has access to view the object.", response = NoteResponse.class, tags={ "Note", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NoteResponse.class) })
    public Response createNote( @NotNull @QueryParam("comment") String comment, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("notableType") String notableType, @QueryParam("notableId") Long notableId, @QueryParam("noteType") String noteType, @QueryParam("assetIds") String assetIds, @QueryParam("tags") String tags, @QueryParam("permissionableType") String permissionableType, @QueryParam("permissionableId") Long permissionableId, @QueryParam("appKey") String appKey, @QueryParam("locationDescription") String locationDescription, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("metaData") String metaData, @QueryParam("receiverAccountIds") String receiverAccountIds, @QueryParam("returnFullResponse") Boolean returnFullResponse, @QueryParam("initializeAsset") Boolean initializeAsset, @QueryParam("assetReturnNulls") Boolean assetReturnNulls, @QueryParam("assetAlbumId") Long assetAlbumId, @QueryParam("assetCollectionId") Long assetCollectionId, @QueryParam("assetAddToDefaultAlbum") String assetAddToDefaultAlbum, @QueryParam("assetAddToMediaLibrary") Boolean assetAddToMediaLibrary, @QueryParam("assetVersionCode") Integer assetVersionCode, @QueryParam("assetVersionName") String assetVersionName, @QueryParam("assetMetaData") String assetMetaData, @QueryParam("assetCaption") String assetCaption, @QueryParam("assetMedia") File assetMedia, @QueryParam("assetMediaUrl") String assetMediaUrl, @QueryParam("assetMediaString") String assetMediaString, @QueryParam("assetMediaStringFileName") String assetMediaStringFileName, @QueryParam("assetMediaStringContentType") String assetMediaStringContentType, @QueryParam("assetAttachedMedia") File assetAttachedMedia, @QueryParam("assetAttachedMediaUrl") String assetAttachedMediaUrl, @QueryParam("assetAttachedMediaString") String assetAttachedMediaString, @QueryParam("assetAttachedMediaStringFileName") String assetAttachedMediaStringFileName, @QueryParam("assetAttachedMediaStringContentType") String assetAttachedMediaStringContentType, @QueryParam("assetLocationDescription") String assetLocationDescription, @QueryParam("assetApp") String assetApp, @QueryParam("assetSearchTags") String assetSearchTags, @QueryParam("assetLatitude") Double assetLatitude, @QueryParam("assetLongitude") BigDecimal assetLongitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createNote(comment,deviceId,accountId,notableType,notableId,noteType,assetIds,tags,permissionableType,permissionableId,appKey,locationDescription,latitude,longitude,metaData,receiverAccountIds,returnFullResponse,initializeAsset,assetReturnNulls,assetAlbumId,assetCollectionId,assetAddToDefaultAlbum,assetAddToMediaLibrary,assetVersionCode,assetVersionName,assetMetaData,assetCaption,assetMedia,assetMediaUrl,assetMediaString,assetMediaStringFileName,assetMediaStringContentType,assetAttachedMedia,assetAttachedMediaUrl,assetAttachedMediaString,assetAttachedMediaStringFileName,assetAttachedMediaStringContentType,assetLocationDescription,assetApp,assetSearchTags,assetLatitude,assetLongitude,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Note", notes = "Sets a comment (note) as deleted.", response = SirqulResponse.class, tags={ "Note", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteNote( @NotNull @QueryParam("noteId") Long noteId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteNote(noteId,deviceId,accountId,latitude,longitude,appKey,securityContext);
    }
    @POST
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Note", notes = "Get for a note based on its Id.", response = SirqulResponse.class, tags={ "Note", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response getNote( @NotNull @QueryParam("noteId") Long noteId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("returnFullResponse") Boolean returnFullResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getNote(noteId,deviceId,accountId,returnFullResponse,securityContext);
    }
    @POST
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Notes", notes = "Search for notes on a notable object.", response = NoteResponse.class, responseContainer = "List", tags={ "Note", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NoteResponse.class, responseContainer = "List") })
    public Response searchNotes( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("notableType") String notableType, @QueryParam("notableId") Long notableId, @QueryParam("noteTypes") String noteTypes, @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @QueryParam("flagCountMinimum") Long flagCountMinimum, @QueryParam("flagsExceedThreshold") Boolean flagsExceedThreshold, @QueryParam("includeInactive") Boolean includeInactive,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, OWNER_DISPLAY, NOTABLE_TYPE, NOTE_TAG, NOTE_COUNT, LIKES, DISLIKES" @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("returnFullResponse") Boolean returnFullResponse, @QueryParam("updatedSince") Long updatedSince, @QueryParam("updatedBefore") Long updatedBefore, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchNotes(deviceId,accountId,notableType,notableId,noteTypes,appKey,keyword,flagCountMinimum,flagsExceedThreshold,includeInactive,sortField,descending,returnFullResponse,updatedSince,updatedBefore,start,limit,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Note", notes = "Update an existing comment (note). Only the creator of the note have permission to update.", response = NoteResponse.class, tags={ "Note", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NoteResponse.class) })
    public Response updateNote( @NotNull @QueryParam("noteId") Long noteId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("comment") String comment, @QueryParam("noteType") String noteType, @QueryParam("assetIds") String assetIds, @QueryParam("tags") String tags, @QueryParam("permissionableType") String permissionableType, @QueryParam("permissionableId") Long permissionableId, @QueryParam("appKey") String appKey, @QueryParam("locationDescription") String locationDescription, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("metaData") String metaData, @QueryParam("returnFullResponse") Boolean returnFullResponse, @QueryParam("active") Boolean active, @QueryParam("updateAsset") Boolean updateAsset, @QueryParam("assetReturnNulls") Boolean assetReturnNulls, @QueryParam("assetAlbumId") Long assetAlbumId, @QueryParam("assetCollectionId") Long assetCollectionId, @QueryParam("assetAddToDefaultAlbum") String assetAddToDefaultAlbum, @QueryParam("assetAddToMediaLibrary") Boolean assetAddToMediaLibrary, @QueryParam("assetVersionCode") Integer assetVersionCode, @QueryParam("assetVersionName") String assetVersionName, @QueryParam("assetMetaData") String assetMetaData, @QueryParam("assetCaption") String assetCaption, @QueryParam("assetMedia") File assetMedia, @QueryParam("assetMediaUrl") String assetMediaUrl, @QueryParam("assetMediaString") String assetMediaString, @QueryParam("assetMediaStringFileName") String assetMediaStringFileName, @QueryParam("assetMediaStringContentType") String assetMediaStringContentType, @QueryParam("assetAttachedMedia") File assetAttachedMedia, @QueryParam("assetAttachedMediaUrl") String assetAttachedMediaUrl, @QueryParam("assetAttachedMediaString") String assetAttachedMediaString, @QueryParam("assetAttachedMediaStringFileName") String assetAttachedMediaStringFileName, @QueryParam("assetAttachedMediaStringContentType") String assetAttachedMediaStringContentType, @QueryParam("assetLocationDescription") String assetLocationDescription, @QueryParam("assetApp") String assetApp, @QueryParam("assetSearchTags") String assetSearchTags, @QueryParam("assetLatitude") Double assetLatitude, @QueryParam("assetLongitude") Double assetLongitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateNote(noteId,deviceId,accountId,comment,noteType,assetIds,tags,permissionableType,permissionableId,appKey,locationDescription,latitude,longitude,metaData,returnFullResponse,active,updateAsset,assetReturnNulls,assetAlbumId,assetCollectionId,assetAddToDefaultAlbum,assetAddToMediaLibrary,assetVersionCode,assetVersionName,assetMetaData,assetCaption,assetMedia,assetMediaUrl,assetMediaString,assetMediaStringFileName,assetMediaStringContentType,assetAttachedMedia,assetAttachedMediaUrl,assetAttachedMediaString,assetAttachedMediaStringFileName,assetAttachedMediaStringContentType,assetLocationDescription,assetApp,assetSearchTags,assetLatitude,assetLongitude,securityContext);
    }
}
