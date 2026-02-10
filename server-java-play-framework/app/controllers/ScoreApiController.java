package controllers;

import java.math.BigDecimal;
import apimodels.ScoreResponse;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ScoreApiController extends Controller {
    private final ScoreApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ScoreApiController(Config configuration, ScoreApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createScore(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuemissionId = request.getQueryString("missionId");
        Long missionId;
        if (valuemissionId != null) {
            missionId = Long.parseLong(valuemissionId);
        } else {
            missionId = null;
        }
        String valuegameId = request.getQueryString("gameId");
        Long gameId;
        if (valuegameId != null) {
            gameId = Long.parseLong(valuegameId);
        } else {
            gameId = null;
        }
        String valuepackId = request.getQueryString("packId");
        Long packId;
        if (valuepackId != null) {
            packId = Long.parseLong(valuepackId);
        } else {
            packId = null;
        }
        String valuegameLevelId = request.getQueryString("gameLevelId");
        Long gameLevelId;
        if (valuegameLevelId != null) {
            gameLevelId = Long.parseLong(valuegameLevelId);
        } else {
            gameLevelId = null;
        }
        String valuegameObjectId = request.getQueryString("gameObjectId");
        Long gameObjectId;
        if (valuegameObjectId != null) {
            gameObjectId = Long.parseLong(valuegameObjectId);
        } else {
            gameObjectId = null;
        }
        String valuepoints = request.getQueryString("points");
        Integer points;
        if (valuepoints != null) {
            points = Integer.parseInt(valuepoints);
        } else {
            throw new IllegalArgumentException("'points' parameter is required");
        }
        String valuetimeTaken = request.getQueryString("timeTaken");
        Integer timeTaken;
        if (valuetimeTaken != null) {
            timeTaken = Integer.parseInt(valuetimeTaken);
        } else {
            timeTaken = null;
        }
        String valuehighest = request.getQueryString("highest");
        Boolean highest;
        if (valuehighest != null) {
            highest = Boolean.valueOf(valuehighest);
        } else {
            highest = null;
        }
        return imp.createScoreHttp(request, version, accountId, appKey, points, missionId, gameId, packId, gameLevelId, gameObjectId, timeTaken, highest);
    }

    @ApiAction
    public Result getScore(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuemissionId = request.getQueryString("missionId");
        Long missionId;
        if (valuemissionId != null) {
            missionId = Long.parseLong(valuemissionId);
        } else {
            missionId = null;
        }
        String valuegameId = request.getQueryString("gameId");
        Long gameId;
        if (valuegameId != null) {
            gameId = Long.parseLong(valuegameId);
        } else {
            gameId = null;
        }
        String valuepackId = request.getQueryString("packId");
        Long packId;
        if (valuepackId != null) {
            packId = Long.parseLong(valuepackId);
        } else {
            packId = null;
        }
        String valuegameLevelId = request.getQueryString("gameLevelId");
        Long gameLevelId;
        if (valuegameLevelId != null) {
            gameLevelId = Long.parseLong(valuegameLevelId);
        } else {
            gameLevelId = null;
        }
        String valuegameObjectId = request.getQueryString("gameObjectId");
        Long gameObjectId;
        if (valuegameObjectId != null) {
            gameObjectId = Long.parseLong(valuegameObjectId);
        } else {
            gameObjectId = null;
        }
        String valuescoreObjectType = request.getQueryString("scoreObjectType");
        String scoreObjectType;
        if (valuescoreObjectType != null) {
            scoreObjectType = valuescoreObjectType;
        } else {
            scoreObjectType = null;
        }
        String valuescoreStatus = request.getQueryString("scoreStatus");
        String scoreStatus;
        if (valuescoreStatus != null) {
            scoreStatus = valuescoreStatus;
        } else {
            scoreStatus = null;
        }
        return imp.getScoreHttp(request, version, accountId, appKey, missionId, gameId, packId, gameLevelId, gameObjectId, scoreObjectType, scoreStatus);
    }

    @ApiAction
    public Result searchScores(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuemissionId = request.getQueryString("missionId");
        Long missionId;
        if (valuemissionId != null) {
            missionId = Long.parseLong(valuemissionId);
        } else {
            missionId = null;
        }
        String valuegameId = request.getQueryString("gameId");
        Long gameId;
        if (valuegameId != null) {
            gameId = Long.parseLong(valuegameId);
        } else {
            gameId = null;
        }
        String valuepackId = request.getQueryString("packId");
        Long packId;
        if (valuepackId != null) {
            packId = Long.parseLong(valuepackId);
        } else {
            packId = null;
        }
        String valuegameLevelId = request.getQueryString("gameLevelId");
        Long gameLevelId;
        if (valuegameLevelId != null) {
            gameLevelId = Long.parseLong(valuegameLevelId);
        } else {
            gameLevelId = null;
        }
        String valuegameObjectId = request.getQueryString("gameObjectId");
        Long gameObjectId;
        if (valuegameObjectId != null) {
            gameObjectId = Long.parseLong(valuegameObjectId);
        } else {
            gameObjectId = null;
        }
        return imp.searchScoresHttp(request, version, accountId, appKey, missionId, gameId, packId, gameLevelId, gameObjectId);
    }

}
