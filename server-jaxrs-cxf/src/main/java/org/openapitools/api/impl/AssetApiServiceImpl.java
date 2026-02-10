package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AssetFullResponse;
import org.openapitools.model.AssetResponse;
import org.openapitools.model.AssetShortResponse;
import java.math.BigDecimal;
import java.io.File;
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
public class AssetApiServiceImpl implements AssetApi {
    /**
     * Download Asset
     *
     * Downloads an asset from the server for assets that have been uploaded to the server.
     *
     */
    public SirqulResponse assetDownload(BigDecimal version, String filename) {
        // TODO: Implement...

        return null;
    }

    /**
     * Convert Offer to Creative
     *
     * Converts an offer image + text into a creative image.
     *
     */
    public AssetShortResponse assetMorph(BigDecimal version, Long offerId, String adSize, Long creativeId, Integer width, Integer height, String backgroundSize, String template) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Asset
     *
     * Uploads an asset to server and returns an asset id which can be used to assign to various objects.
     *
     */
    public AssetResponse createAsset(BigDecimal version, Boolean returnNulls, String deviceId, Long accountId, Long albumId, Long collectionId, String addToDefaultAlbum, Boolean addToMediaLibrary, Integer versionCode, String versionName, String metaData, String caption, String assetType, String approvalStatus, Long assignedAccountId, File media, String mediaUrl, String mediaString, String mediaStringFileName, String mediaStringContentType, Integer mediaHeight, Integer mediaWidth, File attachedMedia, String attachedMediaUrl, String attachedMediaString, String attachedMediaStringFileName, String attachedMediaStringContentType, Integer attachedMediaHeight, Integer attachedMediaWidth, String locationDescription, String app, String appKey, String searchTags, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Asset
     *
     * Delete an asset.
     *
     */
    public SirqulResponse deleteAsset(BigDecimal version, String assetId, String deviceId, Long accountId, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Asset
     *
     * Gets the full asset response including attached likes and notes.
     *
     */
    public AssetFullResponse getAsset(BigDecimal version, Long assetId, String deviceId, Long accountId, Boolean noteDescending) {
        // TODO: Implement...

        return null;
    }

    /**
     * Remove Asset from Collection
     *
     * Remove assets from collections
     *
     */
    public SirqulResponse removeAsset(BigDecimal version, String assetId, String deviceId, Long accountId, Long albumId, Long collectionId, Boolean removeFromDefaultAlbums, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Assets
     *
     * Searches for assets
     *
     */
    public List<AssetResponse> searchAssets(BigDecimal version, String deviceId, Long accountId, String albumIds, String assetIds, String appKey, String mediaType, String mimeType, String keyword, Integer versionCode, String versionName, Long updatedSince, Long updatedBefore, String sortField, Boolean descending, Boolean searchMediaLibrary, Boolean filterByBillable, Boolean activeOnly, Boolean returnApp, Integer start, Integer limit, String searchMode, String assetType, String approvalStatus, Long assignedAccountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Asset
     *
     * Updates an asset&#39;s meta data. If an album reference is passed in, the participants with write permissions are allowed to edit the asset. Otherwise, only the asset up-loader has permission to edit the data.
     *
     */
    public SirqulResponse updateAsset(BigDecimal version, Long assetId, String deviceId, Long accountId, Long albumId, Long attachedAssetId, Integer versionCode, String versionName, String metaData, String caption, String assetType, String approvalStatus, Long assignedAccountId, File media, String mediaUrl, String mediaString, String mediaStringFileName, String mediaStringContentType, Integer mediaHeight, Integer mediaWidth, File attachedMedia, String attachedMediaUrl, String attachedMediaString, String attachedMediaStringFileName, String attachedMediaStringContentType, Integer attachedMediaHeight, Integer attachedMediaWidth, String locationDescription, String searchTags, String appKey, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

}
