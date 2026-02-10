package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.ScoreResponse;

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
public class ScoreApiServiceImpl implements ScoreApi {
    /**
     * Create Score
     *
     * Create a score.  The response object will contain a series of   coded messages detailing what items were completed, the score registered,   and any tickets allocated.  Scoring a  level could complete the pack it   is in, completing that pack could complete the game, which  in turn could   complete the mission.  This completion chain is indicated to the client   via  a list of {@link MessageResponse}.
     *
     */
    public ScoreResponse createScore(BigDecimal version, Long accountId, String appKey, Integer points, Long missionId, Long gameId, Long packId, Long gameLevelId, Long gameObjectId, Integer timeTaken, Boolean highest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Score
     *
     * Get the high score for an item.  Pass in the full path IDs for the score.
     *
     */
    public ScoreResponse getScore(BigDecimal version, Long accountId, String appKey, Long missionId, Long gameId, Long packId, Long gameLevelId, Long gameObjectId, String scoreObjectType, String scoreStatus) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Score
     *
     * Search the scores for an item.  Pass in the full path IDs for the scores.
     *
     */
    public List<ScoreResponse> searchScores(BigDecimal version, Long accountId, String appKey, Long missionId, Long gameId, Long packId, Long gameLevelId, Long gameObjectId) {
        // TODO: Implement...

        return null;
    }

}
