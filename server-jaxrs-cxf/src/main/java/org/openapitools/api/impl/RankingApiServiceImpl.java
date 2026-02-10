package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.RankFullResponse;
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
public class RankingApiServiceImpl implements RankingApi {
    /**
     * Search Historical Rankings
     *
     * Get historical leaderboard rankings by time-frame.
     *
     */
    public RankFullResponse getHistoricalRankings(BigDecimal version, String appKey, String rankType, Long startDate, Long endDate, String deviceId, Long accountId, String sortField, Boolean descending, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Rankings
     *
     * Get leader board rankings. This is an all in one endpoint that can return multiple ranking types and also the current user rank.
     *
     */
    public RankFullResponse getRankings(BigDecimal version, String deviceId, Long accountId, String gameType, String appKey, String q, String keyword, String rankType, String leaderboardMode, String withinAccountIds, Boolean returnUserRank, Long albumId, Long audienceId, String sortField, Boolean descending, Integer i, Integer start, Integer l, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Personal Rankings
     *
     * Returns the user&#39;s ranks for one or more rank types and modes.
     *
     */
    public Object getUserRank(BigDecimal version, String deviceId, Long accountId, String appKey, String rankType, Boolean returnUserRank, String leaderboardMode, String sortField, String keyword, Boolean descending, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Override User Rank
     *
     * Allows an admin of an application to override a user&#39;s scores for a leaderboard.
     *
     */
    public SirqulResponse overrideUserRank(BigDecimal version, Long accountId, Long ownerAccountId, String appKey, String rankType, Long totalScore, Long totalCount, Long totalTime, Long dailyScore, Long dailyCount, Long dailyTime, Long weeklyScore, Long weeklyCount, Long weeklyTime, Long monthlyScore, Long monthlyCount, Long monthlyTime, Long topScore, Long lowestScore, Long streakCount, Long streakBestCount, Long startDate, Long endDate) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Ranking
     *
     * Update the rank value 
     *
     */
    public SirqulResponse updateRankings(BigDecimal version, Long accountId, String appKey, String rankType, Long increment, Long timeIncrement, String tag, Long startDate, Long endDate, Boolean updateGlobal, Boolean createLeaderboard) {
        // TODO: Implement...

        return null;
    }

}
