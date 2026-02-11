package org.openapitools.api;

import java.math.BigDecimal;
import java.io.File;
import org.openapitools.model.NoteResponse;
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
@Path("/note")
@Api(value = "/", description = "")
public interface NoteApi  {

    /**
     * Batch Note Operation
     *
     * Perform a batch operation on notes for a notable object (for example: DELETE_ALL_NOTES_IN_NOTABLE). 
     *
     */
    @POST
    @Path("/batch")
    @Produces({ "*/*" })
    @ApiOperation(value = "Batch Note Operation", tags={ "Note" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse batchOperation(@QueryParam("notableId") @NotNull Long notableId, @QueryParam("notableType") @NotNull String notableType, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("batchOperation") String batchOperation);

    /**
     * Create Note
     *
     * This is used to leave a comment (note) on a notable object (i.e. albums, album contests, assets, game levels, offers, offer locations, retailers, retailer locations, and theme descriptors). Leaving a comment on a notable object will be visiable to everyone who has access to view the object.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Note", tags={ "Note" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = NoteResponse.class) })
    public NoteResponse createNote(@QueryParam("comment") @NotNull String comment, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("notableType") String notableType, @QueryParam("notableId") Long notableId, @QueryParam("noteType") String noteType, @QueryParam("assetIds") String assetIds, @QueryParam("tags") String tags, @QueryParam("permissionableType") String permissionableType, @QueryParam("permissionableId") Long permissionableId, @QueryParam("appKey") String appKey, @QueryParam("locationDescription") String locationDescription, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("metaData") String metaData, @QueryParam("receiverAccountIds") String receiverAccountIds, @QueryParam("returnFullResponse") Boolean returnFullResponse, @QueryParam("initializeAsset") Boolean initializeAsset, @QueryParam("assetReturnNulls") Boolean assetReturnNulls, @QueryParam("assetAlbumId") Long assetAlbumId, @QueryParam("assetCollectionId") Long assetCollectionId, @QueryParam("assetAddToDefaultAlbum") String assetAddToDefaultAlbum, @QueryParam("assetAddToMediaLibrary") Boolean assetAddToMediaLibrary, @QueryParam("assetVersionCode") Integer assetVersionCode, @QueryParam("assetVersionName") String assetVersionName, @QueryParam("assetMetaData") String assetMetaData, @QueryParam("assetCaption") String assetCaption, @QueryParam("assetMedia") File assetMedia, @QueryParam("assetMediaUrl") String assetMediaUrl, @QueryParam("assetMediaString") String assetMediaString, @QueryParam("assetMediaStringFileName") String assetMediaStringFileName, @QueryParam("assetMediaStringContentType") String assetMediaStringContentType, @QueryParam("assetAttachedMedia") File assetAttachedMedia, @QueryParam("assetAttachedMediaUrl") String assetAttachedMediaUrl, @QueryParam("assetAttachedMediaString") String assetAttachedMediaString, @QueryParam("assetAttachedMediaStringFileName") String assetAttachedMediaStringFileName, @QueryParam("assetAttachedMediaStringContentType") String assetAttachedMediaStringContentType, @QueryParam("assetLocationDescription") String assetLocationDescription, @QueryParam("assetApp") String assetApp, @QueryParam("assetSearchTags") String assetSearchTags, @QueryParam("assetLatitude") Double assetLatitude, @QueryParam("assetLongitude") BigDecimal assetLongitude);

    /**
     * Delete Note
     *
     * Sets a comment (note) as deleted.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Note", tags={ "Note" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteNote(@QueryParam("noteId") @NotNull Long noteId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("appKey") String appKey);

    /**
     * Get Note
     *
     * Get for a note based on its Id.
     *
     */
    @POST
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Note", tags={ "Note" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse getNote(@QueryParam("noteId") @NotNull Long noteId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("returnFullResponse") Boolean returnFullResponse);

    /**
     * Search Notes
     *
     * Search for notes on a notable object.
     *
     */
    @POST
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Notes", tags={ "Note" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = NoteResponse.class, responseContainer = "List") })
    public List<NoteResponse> searchNotes(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("notableType") String notableType, @QueryParam("notableId") Long notableId, @QueryParam("noteTypes") String noteTypes, @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @QueryParam("flagCountMinimum") Long flagCountMinimum, @QueryParam("flagsExceedThreshold") Boolean flagsExceedThreshold, @QueryParam("includeInactive") Boolean includeInactive, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("returnFullResponse") Boolean returnFullResponse, @QueryParam("updatedSince") Long updatedSince, @QueryParam("updatedBefore") Long updatedBefore, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit);

    /**
     * Update Note
     *
     * Update an existing comment (note). Only the creator of the note have permission to update.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Note", tags={ "Note" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = NoteResponse.class) })
    public NoteResponse updateNote(@QueryParam("noteId") @NotNull Long noteId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("comment") String comment, @QueryParam("noteType") String noteType, @QueryParam("assetIds") String assetIds, @QueryParam("tags") String tags, @QueryParam("permissionableType") String permissionableType, @QueryParam("permissionableId") Long permissionableId, @QueryParam("appKey") String appKey, @QueryParam("locationDescription") String locationDescription, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("metaData") String metaData, @QueryParam("returnFullResponse") Boolean returnFullResponse, @QueryParam("active") Boolean active, @QueryParam("updateAsset") Boolean updateAsset, @QueryParam("assetReturnNulls") Boolean assetReturnNulls, @QueryParam("assetAlbumId") Long assetAlbumId, @QueryParam("assetCollectionId") Long assetCollectionId, @QueryParam("assetAddToDefaultAlbum") String assetAddToDefaultAlbum, @QueryParam("assetAddToMediaLibrary") Boolean assetAddToMediaLibrary, @QueryParam("assetVersionCode") Integer assetVersionCode, @QueryParam("assetVersionName") String assetVersionName, @QueryParam("assetMetaData") String assetMetaData, @QueryParam("assetCaption") String assetCaption, @QueryParam("assetMedia") File assetMedia, @QueryParam("assetMediaUrl") String assetMediaUrl, @QueryParam("assetMediaString") String assetMediaString, @QueryParam("assetMediaStringFileName") String assetMediaStringFileName, @QueryParam("assetMediaStringContentType") String assetMediaStringContentType, @QueryParam("assetAttachedMedia") File assetAttachedMedia, @QueryParam("assetAttachedMediaUrl") String assetAttachedMediaUrl, @QueryParam("assetAttachedMediaString") String assetAttachedMediaString, @QueryParam("assetAttachedMediaStringFileName") String assetAttachedMediaStringFileName, @QueryParam("assetAttachedMediaStringContentType") String assetAttachedMediaStringContentType, @QueryParam("assetLocationDescription") String assetLocationDescription, @QueryParam("assetApp") String assetApp, @QueryParam("assetSearchTags") String assetSearchTags, @QueryParam("assetLatitude") Double assetLatitude, @QueryParam("assetLongitude") Double assetLongitude);
}
