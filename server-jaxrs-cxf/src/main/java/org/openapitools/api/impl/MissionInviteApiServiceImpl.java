package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
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
public class MissionInviteApiServiceImpl implements MissionInviteApi {
    /**
     * Create Mission Invite
     *
     * Create the mission invite. An account can only be invited to a mission one time. For missions that require user submission and reviewing the permissionableType and permissionableId need to be provided.
     *
     */
    public MissionResponse createMissionInvite(BigDecimal version, String deviceId, Long accountId, Long missionId, String joinCode, Boolean includeGameData) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Mission Invite
     *
     * Update the mission invite status to quit.
     *
     */
    public SirqulResponse deleteMissionInvite(BigDecimal version, String deviceId, Long accountId, Long missionId, Long missionInviteId, Boolean includeGameData) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Mission Invite
     *
     * Get the mission invite. An account can only be invited to a mission one time.
     *
     */
    public MissionResponse getMissionInvite(BigDecimal version, String deviceId, Long accountId, Long missionId, Long missionInviteId, Boolean includeGameData, String includeScores) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Mission Invites
     *
     * Get a list of mission invites that the account has.
     *
     */
    public List<MissionResponse> searchMissionInvites(BigDecimal version, String deviceId, Long accountId, String appKey, String appVersion, Long missionId, String status, Long lastUpdated, Integer start, Integer limit, String keyword, String missionTypes, Boolean filterByBillable, Boolean includeGameData) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Mission Invite
     *
     * Update the mission invite status. An account can only be invited to a mission one time. For missions that require user submission and reviewing the permissionableType and permissionableId need to be provided.
     *
     */
    public MissionResponse updateMissionInvite(BigDecimal version, String deviceId, Long accountId, String appKey, Long missionId, Long missionInviteId, Long packId, Long gameLevelId, String status, String permissionableType, Long permissionableId, Boolean includeGameData) {
        // TODO: Implement...

        return null;
    }

}
