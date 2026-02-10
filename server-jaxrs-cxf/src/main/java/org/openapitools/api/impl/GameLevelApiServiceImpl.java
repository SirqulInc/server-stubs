package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.GameLevelListResponse;
import org.openapitools.model.GameLevelResponse;
import org.openapitools.model.QuestionResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.WordzWordResponse;

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
public class GameLevelApiServiceImpl implements GameLevelApi {
    /**
     * Create Game Level
     *
     * Create a game level. Currently does NOT support game objects.
     *
     */
    public GameLevelResponse createGameLevel(BigDecimal version, Long accountId, String name, String gameData, String gameDataSuffix, String appKey, String description, String difficulty, String appVersion, Long assetImageId, Long assetIconId, String visibility, Boolean friendGroup, String connectionIds, String connectionGroupIds, Double balance, Boolean active, Boolean allocateTickets, Long ticketCount, String ticketType, Long points, String tutorialTitle, String tutorialMessage, String tutorialAlignment, Long tutorialImageAssetId, Long offerId, String metaData) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Game Level
     *
     * Delete a game level. The level and account must be valid and have the appropirate permissions to view the content.
     *
     */
    public SirqulResponse deleteGameLevel(BigDecimal version, Long accountId, Long levelId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Game Level
     *
     * Get a game level. The level and account must be valid and have the appropirate permissions to view the content.
     *
     */
    public GameLevelResponse getGameLevel(BigDecimal version, Long accountId, Long levelId, Boolean includeGameData) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Game Levels
     *
     * Get a list of levels for an application, just those the account has permissions to view.
     *
     */
    public GameLevelListResponse getGameLevelsByApplication(BigDecimal version, Long accountId, String appKey, String keyword, String sortField, Boolean descending, Integer start, Integer limit, String appVersion, Boolean includeGameData, String filters) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Game Level by Billable Entity
     *
     * Searches on game levels that the logged in user has access to. A user would have access if the creator of the game level is managed under the same BillableEntity.
     *
     */
    public GameLevelResponse getGameLevelsByBillableEntity(BigDecimal version, Long accountId, String appKey, String keyword, String sortField, Boolean descending, Boolean activeOnly, Long start, Long limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Level Questions
     *
     * Get questions within a level.
     *
     */
    public QuestionResponse getQuestionsInLevel(BigDecimal version, Long levelId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Level Words
     *
     * Get words within a level.
     *
     */
    public WordzWordResponse getWordsInLevel(BigDecimal version, Long levelId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Game Level
     *
     * Update a game level. Currently does NOT support game objects.
     *
     */
    public GameLevelResponse updateGameLevel(BigDecimal version, Long accountId, Long levelId, String appKey, String name, String description, String difficulty, String appVersion, Long assetImageId, Long assetIconId, String gameData, String gameDataSuffix, String visibility, Boolean friendGroup, String connectionIds, String connectionGroupIds, Double balance, Boolean active, Boolean allocateTickets, Long ticketCount, String ticketType, Long points, String tutorialTitle, String tutorialMessage, String tutorialAlignment, Long tutorialImageAssetId, Long offerId, String metaData) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Level Questions
     *
     * Updates a level with question game objects.
     *
     */
    public SirqulResponse updateQuestionsInLevel(BigDecimal version, Long levelId, Long accountId, String questionIds) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Level Words
     *
     * Updates a level with word game objects.
     *
     */
    public SirqulResponse updateWordsInLevel(BigDecimal version, Long levelId, Long accountId, String wordIds) {
        // TODO: Implement...

        return null;
    }

}
