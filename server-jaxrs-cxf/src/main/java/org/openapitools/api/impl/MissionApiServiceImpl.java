package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.MissionFormatResponse;
import org.openapitools.model.MissionResponse;
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
public class MissionApiServiceImpl implements MissionApi {
    /**
     * Create Mission
     *
     * Create a user defined mission.
     *
     */
    public MissionResponse createMission(BigDecimal version, Long accountId, String title, String description, String subType, Long startDate, Long endDate, Boolean active, String gameLevelIds, String creativeIds, String audienceIds, String missionTask, String formatType, Long offerId, Double balance, Boolean advancedReporting, Boolean allocateTickets, Long ticketCount, String ticketType, Long points, String metaData, String applicationIds, String devices, String deviceIds, String deviceVersions, String locations, String radius) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Mission
     *
     * Delete a mission.
     *
     */
    public SirqulResponse deleteMission(BigDecimal version, Long accountId, Long missionId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Find Missions
     *
     * Get a set of ad filtered by the parameters provided.
     *
     */
    public MissionResponse findMissions(BigDecimal version, String appKey, String suffix, String type, Long accountId, String appVersion, Double latitude, Double longitude, String device, Long deviceIdentifier, String deviceVersion, Integer start, Integer limit, Boolean includeGameData, Boolean includeAudiences, Boolean allocatesTickets, Boolean randomize, Boolean targetedAdsOnly, String missionIds, String audienceOperator) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Mission
     *
     * Get a mission.
     *
     */
    public MissionResponse getMission(BigDecimal version, Long accountId, Long missionId, Boolean returnCreative) {
        // TODO: Implement...

        return null;
    }

    /**
     * Import Mission
     *
     * Create a mission using a source item such as an offer location.
     *
     */
    public SirqulResponse importMission(BigDecimal version, Long accountId, Double latitude, Double longitude, String appKey, String keyword, Integer start, Integer limit, String adSize) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Mission Formats
     *
     * Searches on pre-defined mission formats
     *
     */
    public List<MissionFormatResponse> searchMissionFormats(BigDecimal version, Integer start, Integer limit, Boolean activeOnly) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Missions
     *
     * Get the list missions available to the account.  
     *
     */
    public List<MissionResponse> searchMissions(BigDecimal version, Long accountId, String keyword, String subType, Integer start, Integer limit, Boolean includeGameData, Boolean includeAudiences, Boolean includeInactive, String suffix, String sortField, Boolean descending) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Missions by Billable Entity
     *
     * Use the accountId to determine the associated BillableEntity.  From there get a list of all accounts associated as managers.  Get the list missions owned by all associated managers.
     *
     */
    public List<MissionResponse> searchMissionsByBillableEntity(BigDecimal version, Long accountId, String keyword, Integer start, Integer limit, Boolean includeGameData, Boolean includeAudiences, Boolean includeInactive, String suffix, String sortField, Boolean descending) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Mission
     *
     * Update a mission.
     *
     */
    public MissionResponse updateMission(BigDecimal version, Long accountId, Long missionId, String title, String description, String subType, String metaData, Long startDate, Long endDate, Boolean active, String gameLevelIds, String creativeIds, String audienceIds, Long offerId, Double balance, Boolean advancedReporting, Boolean allocateTickets, Long ticketCount, String ticketType, Long points, String applicationIds, String devices, String deviceIds, String deviceVersions, String locations, String radius) {
        // TODO: Implement...

        return null;
    }

}
