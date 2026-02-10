package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AgeGroupResponse;
import org.openapitools.model.AudienceDeviceResponse;
import org.openapitools.model.AudienceResponse;
import java.math.BigDecimal;
import org.openapitools.model.OfferListResponse;
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
public class AudienceApiServiceImpl implements AudienceApi {
    /**
     * Create Audience
     *
     * Create a user defined audience.
     *
     */
    public AudienceResponse createAudience(BigDecimal version, Long accountId, String name, String description, String searchTags, String gender, String ageGroups, String categoryIds, String applicationIds, String gameExperienceLevel, String devices, String deviceIds, String deviceVersions, String locations, String radius, Integer startTimeOffset, Integer endTimeOffset, Boolean sendSuggestion, String associateDescription, String associateType, Long associateId, String groupingId, String metaData, String visibility, String audienceType, Boolean useOrder, String cohortRegionsData, String appKey, String trilaterationTypes, Boolean uniqueName) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Audience
     *
     * Delete an audience. The audience and account must be valid and have the appropirate permissions to view the content.
     *
     */
    public SirqulResponse deleteAudience(BigDecimal version, Long accountId, Long audienceId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Age Groups
     *
     * Gets the list of available age groups that can be selected by consumers and retailers targeting offers.
     *
     */
    public List<AgeGroupResponse> getAgeGroups(BigDecimal version) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Audience
     *
     * Get an audience. The audience and account must be valid and have the appropriate permissions to view the content.
     *
     */
    public AudienceResponse getAudience(BigDecimal version, Long accountId, Long audienceId, String appKey, Boolean returnAccountCount, Boolean returnAlbumCount, String albumTypesForCount) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Audiences
     *
     * Get the list audiences owned by the account
     *
     */
    public List<SearchResponse> getAudienceList(BigDecimal version, Long accountId, String albumIds, String keyword, String keywordFields, String sortField, Boolean descending, Integer start, Integer limit, Boolean sendSuggestion, Boolean activeOnly, Boolean groupByGroupingId, String appKey, Boolean returnGlobal, Boolean exactKeyword, String audienceType, String audienceTypes, Boolean returnAccountCount, Boolean returnAlbumCount, String albumTypesForCount) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Devices
     *
     * Gets the list of available devices that can be selected by consumers and retailers.
     *
     */
    public List<AudienceDeviceResponse> getDevices(BigDecimal version, Boolean includeInactive) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Experiences
     *
     * Gets the list of available experiences that can be selected by consumers and retailers.
     *
     */
    public SirqulResponse getExperiences(BigDecimal version) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get GroupedAudiences
     *
     * Get a group of audiences. The audience and account must be valid and have the appropriate permissions to view the content.
     *
     */
    public AudienceResponse getGroupedAudiences(BigDecimal version, Long accountId, String audienceGroupingId) {
        // TODO: Implement...

        return null;
    }

    /**
     * List Suggestions by Audience
     *
     * List either Missions or Offers that the user matches the assigned audience.
     *
     */
    public OfferListResponse listByAccount(BigDecimal version, Long accountId, Integer limit, String suggestionType) {
        // TODO: Implement...

        return null;
    }

    /**
     * List Offers by Audience
     *
     * Get a list of offer locations based on audience information provided.
     *
     */
    public OfferListResponse listByAudience(BigDecimal version, Integer limit, String gender, Integer age, String categoryIds, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * List Sent Suggestions 
     *
     * Return list of recent trigger suggestions that have been sent to the user.
     *
     */
    public OfferListResponse listLastestByAccount(BigDecimal version, Long accountId, Integer timeframe, String suggestionType) {
        // TODO: Implement...

        return null;
    }

    /**
     * Send Suggestions
     *
     * Use the accountId to determine the associated BillableEntity. From there get a list of all triggers associated with the BillableEntity.
     *
     */
    public SirqulResponse sendByAccount(BigDecimal version, Long accountId, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Audience
     *
     * Update a user defined audience.
     *
     */
    public AudienceResponse updateAudience(BigDecimal version, Long accountId, Long audienceId, String name, String description, String searchTags, String gender, String ageGroups, String categoryIds, String applicationIds, String gameExperienceLevel, String devices, String deviceIds, String deviceVersions, String locations, String radius, Boolean active, Boolean sendSuggestion, Integer startTimeOffset, Integer endTimeOffset, String associateDescription, String associateType, Long associateId, String groupingId, String metaData, String visibility, String audienceType, Boolean useOrder, String cohortRegionsData, String appKey, String trilaterationTypes, Boolean uniqueName) {
        // TODO: Implement...

        return null;
    }

}
