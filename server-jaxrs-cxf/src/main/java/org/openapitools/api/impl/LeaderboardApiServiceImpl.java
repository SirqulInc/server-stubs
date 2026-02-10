package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import java.io.File;
import org.openapitools.model.LeaderboardResponse;
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
public class LeaderboardApiServiceImpl implements LeaderboardApi {
    /**
     * Create a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation
     *
     * Create a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation
     *
     */
    public LeaderboardResponse createLeaderboard(BigDecimal version, Long accountId, String appKey, String rankType, String leaderboardMode, File iconMedia, Long iconAssetId, File bannerMedia, Long bannerAssetId, Integer limitation, String sortField, String title, String description, String metaData) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete the Leader Board
     *
     * Removes a leader board id.
     *
     */
    public SirqulResponse deleteLeaderboard(BigDecimal version, Long leaderboardId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Read a leaderboard by id and retrieve the matching ranking list
     *
     * Read a leaderboard by id and retrieve the matching ranking list
     *
     */
    public LeaderboardResponse getLeaderboard(BigDecimal version, Long leaderboardId, Long accountId, Boolean includeFullRankingList) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search leaderboard and retrieve the matching ranking list
     *
     * Search leaderboard and retrieve the matching ranking list
     *
     */
    public LeaderboardResponse searchLeaderboards(BigDecimal version, Long accountId, String appKey, Boolean globalOnly, String keyword, String leaderboardIds, String rankTypes, String sortField, Boolean descending, Boolean includeInactive, Boolean includeAppResponse, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation
     *
     * Update a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation
     *
     */
    public LeaderboardResponse updateLeaderboard(BigDecimal version, Long leaderboardId, Long accountId, String appKey, String rankType, String leaderboardMode, String sortField, File iconMedia, Long iconAssetId, File bannerMedia, Long bannerAssetId, Integer limitation, Boolean active, String title, String description, String metaData) {
        // TODO: Implement...

        return null;
    }

}
