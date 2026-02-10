package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AlbumContestListResponse;
import org.openapitools.model.AlbumContestResponse;
import java.math.BigDecimal;
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
public class ContestApiServiceImpl implements ContestApi {
    /**
     * Create or Update Contest
     *
     * Creates or updates a contest.
     *
     */
    public AlbumContestResponse addOrUpdateAlbumContest(BigDecimal version, Boolean publicRead, Boolean publicWrite, Boolean publicDelete, Boolean publicAdd, String visibility, Boolean includeFriendGroup, String deviceId, Long accountId, String gameType, String appKey, String contestType, Long albumContestId, String title, String description, Long albumId1, Boolean removeAlbum1, Long albumId2, Boolean removeAlbum2, Long startDate, Long endDate, String locationDescription, String connectionIdsToAdd, String connectionGroupIdsToAdd, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Approve Contest
     *
     * Sets the approval status of a contest.
     *
     */
    public SirqulResponse approveAlbumContest(BigDecimal version, Long albumContestId, String approvalStatus, String deviceId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Contest
     *
     * Deletes a contest.
     *
     */
    public SirqulResponse deleteContest(BigDecimal version, Long albumContestId, String deviceId, Long accountId, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Contest
     *
     * Gets the contest object including the likes and notes
     *
     */
    public AlbumContestResponse getAlbumContest(BigDecimal version, Long albumContestId, String deviceId, Long accountId, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Contests
     *
     * Searches on contests.
     *
     */
    public AlbumContestListResponse getAlbumContests(BigDecimal version, String filter, String sortField, Boolean descending, Integer start, Integer limit, String deviceId, Long accountId, String gameType, String appKey, String appType, String contestType, Long ownerId, String q, String keyword, Integer i, Integer l, Long dateCreated, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Vote on Contest
     *
     * Vote on a collection in a contest.
     *
     */
    public AlbumContestResponse voteOnAlbumContest(BigDecimal version, Long albumContestId, Long albumId, String deviceId, Long accountId, String contestType, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

}
