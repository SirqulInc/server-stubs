package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AlbumFullResponse;
import org.openapitools.model.AlbumResponse;
import java.math.BigDecimal;
import java.io.File;
import org.openapitools.model.SearchResponse;
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
public class AlbumApiServiceImpl implements AlbumApi {
    /**
     * Create Album
     *
     * Create an Album.
     *
     */
    public SearchResponse addAlbumCollection(BigDecimal version, String title, Boolean coverAssetNullable, Boolean includeCoverInAssetList, Boolean publicRead, Boolean publicWrite, Boolean publicDelete, Boolean publicAdd, Boolean anonymous, String deviceId, Long accountId, String assetsToAdd, File media, String mediaURL, Long assetId, File attachedMedia, String attachedMediaURL, Long startDate, Long endDate, String tags, String description, String albumType, Long albumTypeId, String subType, Double latitude, Double longitude, String locationDescription, String visibility, String gameType, String appKey, String cellPhone, String streetAddress, String streetAddress2, String city, String state, String postalCode, String fullAddress, String metaData, String categoryIds, String categoryFilterIds, String audienceIds, Boolean includeAllAppUsersAsMembers, Boolean includeAudiencesAsMembers, String audienceOperator, String approvalStatus, String linkedObjectType, Long linkedObjectId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Add Album Users
     *
     * Add users to an album as participants.
     *
     */
    public SirqulResponse addAlbumUsers(BigDecimal version, Long albumId, Boolean includeFriendGroup, String deviceId, Long accountId, Boolean read, Boolean write, Boolean delete, Boolean add, String connections, String connectionGroups) {
        // TODO: Implement...

        return null;
    }

    /**
     * Approve Album
     *
     * Sets the approval status of an Album.
     *
     */
    public SirqulResponse approveAlbum(BigDecimal version, Long albumId, String deviceId, Long accountId, String approvalStatus, Boolean verified) {
        // TODO: Implement...

        return null;
    }

    /**
     *  Get Album
     *
     * Get an Album.
     *
     */
    public AlbumFullResponse getAlbumCollection(BigDecimal version, Boolean returnNulls, Long albumId, String deviceId, Long accountId, Integer likePreviewSize, Integer assetPreviewSize, Integer notePreviewSize, Integer connectionPreviewSize, Integer audiencePreviewSize) {
        // TODO: Implement...

        return null;
    }

    /**
     * Leave Album
     *
     *  Allows a user to leave an album (they are no longer considered a participant). The album creator cannot leave their own albums.
     *
     */
    public SirqulResponse leaveAlbum(BigDecimal version, Long albumId, String deviceId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Album
     *
     * Deletes an Album
     *
     */
    public SirqulResponse removeAlbum(BigDecimal version, Long albumId, String deviceId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Remove Album Users
     *
     * Remove participants of an album.
     *
     */
    public SirqulResponse removeAlbumUsers(BigDecimal version, Long albumId, Boolean removeFriendGroup, String deviceId, Long accountId, String connections, String connectionGroups) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Albums
     *
     * Searches on Albums.
     *
     */
    public List<AlbumFullResponse> searchAlbums(BigDecimal version, String filter, Long albumTypeId, String subType, Boolean includeInactive, String sortField, Boolean descending, Integer start, Integer limit, Double range, Boolean includeLiked, Boolean includeFavorited, Boolean includePermissions, Integer likePreviewSize, Integer assetPreviewSize, Integer notePreviewSize, Integer connectionPreviewSize, Integer audiencePreviewSize, String deviceId, Long accountId, Long connectionAccountId, Long ownerId, String albumIds, String excludeAlbumIds, Long mediaId, String keyword, String albumType, Integer limitPerAlbumType, Long dateCreated, Long updatedSince, Long updatedBefore, Long createdSince, Long createdBefore, Long startedSince, Long startedBefore, Long endedSince, Long endedBefore, Double latitude, Double longitude, String appKey, String categoryIds, String categoryFilterIds, String audienceIds, String excludeAudienceIds, Boolean includeCompletable, Boolean includeRating, String searchMode, Boolean stackSearch, Integer stackWindowSize, Integer minStackPerPage, String stackPaginationIdentifier, Boolean stackDetails, Long flagCountMinimum, Boolean removeFlaggedContent, Boolean verifiedFilter, String linkedObjectType, Long linkedObjectId, Long orderAudienceId, Boolean ignoreDefaultAppFilter, String searchExpression, Boolean generateAlbums) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Album
     *
     * Update an Album.
     *
     */
    public AlbumResponse updateAlbumCollection(BigDecimal version, Long albumId, String deviceId, Long accountId, String assetsToAdd, String assetsToRemove, Long assetId, File media, String mediaURL, Boolean active, String title, Long startDate, Long endDate, String tags, String description, String albumType, Long albumTypeId, String subType, Boolean publicRead, Boolean publicWrite, Boolean publicDelete, Boolean publicAdd, Double latitude, Double longitude, String locationDescription, String visibility, String cellPhone, String streetAddress, String streetAddress2, String city, String state, String postalCode, String fullAddress, Boolean anonymous, String metaData, String categoryIds, String categoryFilterIds, String audienceIds, String audienceIdsToAdd, String audienceIdsToRemove, Boolean includeAllAppUsersAsMembers, Boolean includeAudiencesAsMembers, String audienceOperator, String linkedObjectType, Long linkedObjectId, Boolean indexNow) {
        // TODO: Implement...

        return null;
    }

}
