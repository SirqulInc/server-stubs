package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AppResponse;
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
public class AppDataApiServiceImpl implements AppDataApi {
    /**
     * Get App Data
     *
     * Get the application data structure.  The basic structure is a   node tree, with the root node being a AppResponse.  The response contains   the user&#39;s profile, messages from the system, and a list of MissionResponse.    A mission can have any number of GameResponses but typically is a single   game type.  A game then has any number of PackResponses which help group   the game levels. Packs are then composed of any number of GameLevelResponses.     Using the various parameters can return the applications default mission   (built-in packs to play), the list of community levels published, the user&#39;s   saved levels, or explicity levels desired.  You can choose to include the   profile or not, or just return parts of the profile.  You can also filter   out game levels that have been published with a higher version of the application.
     *
     */
    public AppResponse getAppData(BigDecimal version, Integer start, Integer limit, String deviceId, Long accountId, String gameType, Boolean includeGameData, String q, String keyword, String sortField, Boolean descending, Integer i, Integer l, Boolean gameObjectCount, String filter, Long dateCreated, Long ownerId, String missionIds, String gameIds, String packIds, String gameLevelIds, String appVersion, Boolean includeHigherVersionPacks, Boolean includeHigherVersionLevels, String responseGroups, String purchaseType) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create App Data
     *
     * Publish the application data structure.  Can be used to save levels   and scores.  It then returns the application data structure.  The basic   structure is a node tree, with the root node being a AppResponse.  The response   contains the user&#39;s profile, messages from the system, and a list of MissionResponse.    A mission can have any number of GameResponses but typically is a single   game type.  A game then has any number of PackResponses which help group   the game levels. Packs are then composed of any number of GameLevelResponses.      Using the various parameters can return the applications default mission   (built-in packs to play), the list of community levels published, the user&#39;s   saved levels, or explicity levels desired.  You can choose to include the   profile or not, or just return parts of the profile.  You can also filter   out game levels that have been published with a higher version of the application
     *
     */
    public AppResponse postAppData(BigDecimal version, String gameType, Integer start, Integer limit, String data, String deviceId, Long accountId, Boolean includeGameData, String q, String keyword, String sortField, Boolean descending, Integer i, Integer l, Boolean gameObjectCount, String filter, Long dateCreated, Long ownerId, String missionIds, String gameIds, String packIds, String gameLevelIds, String appVersion, Boolean includeHigherVersionPacks, Boolean includeHigherVersionLevels, String responseGroups, String purchaseType) {
        // TODO: Implement...

        return null;
    }

    /**
     * Regenerate App Data
     *
     * Regenerate the app data cache for apps
     *
     */
    public SirqulResponse regenAppData(BigDecimal version, Long accountId, String appKey, String buildVersion, String apiVersion) {
        // TODO: Implement...

        return null;
    }

}
