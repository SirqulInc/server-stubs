package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.GameResponse;
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
public class GameApiServiceImpl implements GameApi {
    /**
     * Create a Game
     *
     * Create a Game.
     *
     */
    public GameResponse createGame(BigDecimal version, Long accountId, String appKey, String title, String description, String metaData, String packIds, Boolean includeGameData) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete a Game
     *
     * Delete a game.
     *
     */
    public SirqulResponse deleteGame(BigDecimal version, Long accountId, Long gameId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get a Game by id
     *
     * Get a Game by id.
     *
     */
    public GameResponse getGame(BigDecimal version, Long accountId, Long gameId, Boolean includeGameData) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search a Game
     *
     * Get a list of games for an application, just those the account has permissions to view.
     *
     */
    public GameResponse searchGames(BigDecimal version, Long accountId, String appKey, Integer start, Integer limit, String keyword, String appVersion, Boolean includeGameData, Boolean includeInactive) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update a Game
     *
     * Update a Game
     *
     */
    public GameResponse updateGame(BigDecimal version, Long accountId, Long gameId, String appKey, String title, String description, String metaData, String packIds, Boolean includeGameData) {
        // TODO: Implement...

        return null;
    }

}
