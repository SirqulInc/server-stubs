package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import java.io.File;
import org.openapitools.model.NoteResponse;
import org.openapitools.model.SirqulResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
public class NoteApiServiceImpl implements NoteApi {
    /**
     * Batch Note Operation
     *
     * Perform a batch operation on notes for a notable object (for example: DELETE_ALL_NOTES_IN_NOTABLE). 
     *
     */
    public SirqulResponse batchOperation(BigDecimal version, Long notableId, String notableType, String deviceId, Long accountId, String batchOperation) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Note
     *
     * This is used to leave a comment (note) on a notable object (i.e. albums, album contests, assets, game levels, offers, offer locations, retailers, retailer locations, and theme descriptors). Leaving a comment on a notable object will be visiable to everyone who has access to view the object.
     *
     */
    public NoteResponse createNote(BigDecimal version, String comment, String deviceId, Long accountId, String notableType, Long notableId, String noteType, String assetIds, String tags, String permissionableType, Long permissionableId, String appKey, String locationDescription, Double latitude, Double longitude, String metaData, String receiverAccountIds, Boolean returnFullResponse, Boolean initializeAsset, Boolean assetReturnNulls, Long assetAlbumId, Long assetCollectionId, String assetAddToDefaultAlbum, Boolean assetAddToMediaLibrary, Integer assetVersionCode, String assetVersionName, String assetMetaData, String assetCaption, File assetMedia, String assetMediaUrl, String assetMediaString, String assetMediaStringFileName, String assetMediaStringContentType, File assetAttachedMedia, String assetAttachedMediaUrl, String assetAttachedMediaString, String assetAttachedMediaStringFileName, String assetAttachedMediaStringContentType, String assetLocationDescription, String assetApp, String assetSearchTags, Double assetLatitude, BigDecimal assetLongitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Note
     *
     * Sets a comment (note) as deleted.
     *
     */
    public SirqulResponse deleteNote(BigDecimal version, Long noteId, String deviceId, Long accountId, Double latitude, Double longitude, String appKey) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Note
     *
     * Get for a note based on its Id.
     *
     */
    public SirqulResponse getNote(BigDecimal version, Long noteId, String deviceId, Long accountId, Boolean returnFullResponse) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Notes
     *
     * Search for notes on a notable object.
     *
     */
    public List<NoteResponse> searchNotes(BigDecimal version, String deviceId, Long accountId, String notableType, Long notableId, String noteTypes, String appKey, String keyword, Long flagCountMinimum, Boolean flagsExceedThreshold, Boolean includeInactive, String sortField, Boolean descending, Boolean returnFullResponse, Long updatedSince, Long updatedBefore, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Note
     *
     * Update an existing comment (note). Only the creator of the note have permission to update.
     *
     */
    public NoteResponse updateNote(BigDecimal version, Long noteId, String deviceId, Long accountId, String comment, String noteType, String assetIds, String tags, String permissionableType, Long permissionableId, String appKey, String locationDescription, Double latitude, Double longitude, String metaData, Boolean returnFullResponse, Boolean active, Boolean updateAsset, Boolean assetReturnNulls, Long assetAlbumId, Long assetCollectionId, String assetAddToDefaultAlbum, Boolean assetAddToMediaLibrary, Integer assetVersionCode, String assetVersionName, String assetMetaData, String assetCaption, File assetMedia, String assetMediaUrl, String assetMediaString, String assetMediaStringFileName, String assetMediaStringContentType, File assetAttachedMedia, String assetAttachedMediaUrl, String assetAttachedMediaString, String assetAttachedMediaStringFileName, String assetAttachedMediaStringContentType, String assetLocationDescription, String assetApp, String assetSearchTags, Double assetLatitude, Double assetLongitude) {
        // TODO: Implement...

        return null;
    }

}
