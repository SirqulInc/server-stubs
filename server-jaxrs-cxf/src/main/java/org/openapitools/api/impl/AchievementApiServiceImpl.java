package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AchievementProgressResponse;
import org.openapitools.model.AchievementResponse;
import org.openapitools.model.AchievementShortResponse;
import org.openapitools.model.AchievementTierResponse;
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
public class AchievementApiServiceImpl implements AchievementApi {
    /**
     * Searches an Achievement Tier
     *
     * Searches a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.
     *
     */
    public AchievementTierResponse apiVersionAchievementTierSearchPost(BigDecimal version, String deviceId, Long accountId, String appKey, String keyword, Long achievementType, String rankType, String sortField, Boolean descending, Boolean descendingGoal, Long start, Long limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Achievement
     *
     * Updates an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.
     *
     */
    public AchievementResponse createAchievement(BigDecimal version, String appKey, String title, String deviceId, Long accountId, String analyticsTag, String description, String rankType, Integer rankIncrement, Integer minIncrement, Integer maxIncrement, Boolean validate, Boolean active, String triggerDefinition) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Achievement Tier
     *
     * Create a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.
     *
     */
    public AchievementTierResponse createAchievementTier(BigDecimal version, Long achievementId, Boolean scoreAllInstances, String deviceId, Long accountId, File icon, Long iconAssetId, String title, String description, Long goalCount, Long missionId, Long gameId, Long packId, Long gameLevelId, Integer gameObjectId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Achievement
     *
     * Deletes an achievement (for developer/retailer use). User must have permissions to the application the achievement was created for.
     *
     */
    public SirqulResponse deleteAchievement(BigDecimal version, Long achievementId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Achievement Tier
     *
     * Deletes an achievement tier (for developer/retailer use). User must have permissions to the application the achievement was created for.
     *
     */
    public SirqulResponse deleteAchievementTier(BigDecimal version, Long achievementTierId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Achievement
     *
     * Get an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.
     *
     */
    public AchievementTierResponse getAchievement(BigDecimal version, Long achievementId, String deviceId, Long accountId, String achievementType) {
        // TODO: Implement...

        return null;
    }

    /**
     * Gets an achievement tier
     *
     * Gets an achievement tier (for developer/retailer use). User must have permissions to the application the achievement is created for.
     *
     */
    public AchievementTierResponse getAchievementTier(BigDecimal version, Long accountId, Long achievementTierId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Achievement Progress
     *
     * Gets a list of user achievements.
     *
     */
    public List<AchievementProgressResponse> getUserAchievements(BigDecimal version, Boolean returnNulls, String appKey, Boolean includeUndiscovered, String deviceId, Long accountId, String connectionAccountEmail, Long connectionAccountId, String rankType, String achievementType, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * List Achievement Tags
     *
     * List achievement tags by application
     *
     */
    public SirqulResponse listAchievementTags(BigDecimal version, String appKey) {
        // TODO: Implement...

        return null;
    }

    /**
     * List Achievements
     *
     * List achievements by billable.
     *
     */
    public List<AchievementShortResponse> listAchievements(BigDecimal version, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly, String deviceId, Long accountId, String appKey, String keyword, String achievementType, String rankType) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Achievements
     *
     * Searches achievements by application for consumers.
     *
     */
    public List<AchievementShortResponse> searchAchievements(BigDecimal version, String appKey, String sortField, Boolean descending, Boolean includeTiers, Boolean includeInactiveTiers, Integer start, Integer limit, String deviceId, Long accountId, String keyword, String achievementType, String rankType) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Achievement
     *
     * Updates an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.
     *
     */
    public AchievementResponse updateAchievement(BigDecimal version, String deviceId, Long accountId, Long achievementId, String analyticsTag, String title, String description, String rankType, Integer rankIncrement, Integer minIncrement, Boolean nullMinIncrement, Integer maxIncrement, Boolean nullMaxIncrement, Boolean validate, Boolean active, String triggerDefinition) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Achievement Tier
     *
     * Updates a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.
     *
     */
    public AchievementTierResponse updateAchievementTier(BigDecimal version, Long achievementTierId, String deviceId, Long accountId, File icon, Long iconAssetId, String title, String description, Long goalCount, Long missionId, Long gameId, Long packId, Long gameLevelId, Long gameObjectId, Boolean scoreAllInstances) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Achievement Progress
     *
     * Update user achievement progress.
     *
     */
    public SirqulResponse updateUserAchievement(BigDecimal version, Long accountId, Long achievementId, String tag, Long customId, Long increment, Long startDate, Long endDate, Boolean returnProgress) {
        // TODO: Implement...

        return null;
    }

}
