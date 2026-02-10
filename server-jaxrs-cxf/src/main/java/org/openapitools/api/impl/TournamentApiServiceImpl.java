package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.MissionShortResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TournamentResponse;

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
public class TournamentApiServiceImpl implements TournamentApi {
    /**
     * Create Tournament
     *
     * Create a tournament.
     *
     */
    public TournamentResponse createTournament(BigDecimal version, Long accountId, String appKey, String title, Integer costToPlay, Long startDate, String subType, Long imageAssetId, Integer secondsBetweenLevels, Integer secondsForTieBreaker, Integer secondsBetweenPacks, Integer maximumLevelLength, String costToPlayType, Integer minimumToPlay, Integer startingLimit, Integer availableLimit, String description, String metaData, String audienceIds, Boolean active, Boolean enableBuyBack, String offerIds, Long offerAssetId, Boolean fixedReward, String splitReward, Boolean allocateTickets, String tournamentData, String missionType, String visibility, Integer preliminaryGroups, String preliminaryGroupAdvancements, Boolean enableMultipleEntries, Boolean enableMultipleVotes, Boolean featured, String winnerTag, String tieTag) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Tournament
     *
     * Delete a tournament.
     *
     */
    public SirqulResponse deleteTournament(BigDecimal version, Long accountId, Long missionId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Tournament
     *
     * Get a tournament.
     *
     */
    public TournamentResponse getTournament(BigDecimal version, Long accountId, Long missionId, String joinCode, String includeScores, Integer objectPreviewSize) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Tournament Objects
     *
     * Search on game objects of tournaments
     *
     */
    public SirqulResponse searchObjects(BigDecimal version, Long accountId, Long gameLevelId, String sortField, Boolean descending, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Tournament Rounds
     *
     * Search for the user&#39;s tournament games.
     *
     */
    public SirqulResponse searchRounds(BigDecimal version, Long accountId, String appKey, String status, String missionType, Boolean currentOnly, String visibilities, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Tournaments
     *
     * Search for tournaments
     *
     */
    public MissionShortResponse searchTournaments(BigDecimal version, Long accountId, String appKey, String keyword, String subType, Boolean includeInactive, String missionTypes, String filter, String sortField, Boolean descending, String visibility, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Submit Tournament Score
     *
     * Submit an array of scores for a tournament match. 
     *
     */
    public SirqulResponse submitTournamentScore(BigDecimal version, Long accountId, String appKey, Long missionId, Long gameId, Long packId, String scores, Long gameLevelId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Submit a vote for a multi-stage album tournament.
     *
     * Submit a vote for a multi-stage album tournament.
     *
     */
    public SirqulResponse submitTournamentVote(BigDecimal version, Long accountId, String appKey, Long missionId, Long gameObjectId, String deviceId, Boolean checkIfDeviceAlreadyVoted) {
        // TODO: Implement...

        return null;
    }

    /**
     * Substitute Tournament Player
     *
     * Service to replace the user&#39;s opponent in the current level - pack - mission with an AI account.
     *
     */
    public SirqulResponse substituteTournamentPlayer(BigDecimal version, Long accountId, Long missionId, Long packId, Long gameLevelId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Tournament
     *
     * Update a tournament.
     *
     */
    public TournamentResponse updateTournament(BigDecimal version, Long accountId, Long missionId, String title, String subType, Long imageAssetId, Integer secondsBetweenLevels, Integer secondsForTieBreaker, Integer secondsBetweenPacks, Integer maximumLevelLength, Integer costToPlay, String costToPlayType, Integer minimumToPlay, Integer startingLimit, Integer availableLimit, String description, String metaData, Long startDate, String audienceIds, Boolean active, Boolean enableBuyBack, String offerIds, Long offerAssetId, Boolean fixedReward, String splitReward, Boolean allocateTickets, String tournamentData, String visibility, Integer preliminaryGroups, String preliminaryGroupAdvancements, Boolean enableMultipleEntries, Boolean enableMultipleVotes, Boolean featured, String winnerTag, String tieTag) {
        // TODO: Implement...

        return null;
    }

}
