package controllers;

import java.math.BigDecimal;
import apimodels.GameResponse;
import apimodels.SirqulResponse;

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
public class GameApiController extends Controller {
    private final GameApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private GameApiController(Config configuration, GameApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createGame(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuetitle = request.getQueryString("title");
        String title;
        if (valuetitle != null) {
            title = valuetitle;
        } else {
            title = null;
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        String valuepackIds = request.getQueryString("packIds");
        String packIds;
        if (valuepackIds != null) {
            packIds = valuepackIds;
        } else {
            packIds = null;
        }
        String valueincludeGameData = request.getQueryString("includeGameData");
        Boolean includeGameData;
        if (valueincludeGameData != null) {
            includeGameData = Boolean.valueOf(valueincludeGameData);
        } else {
            includeGameData = null;
        }
        return imp.createGameHttp(request, version, accountId, appKey, title, description, metaData, packIds, includeGameData);
    }

    @ApiAction
    public Result deleteGame(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuegameId = request.getQueryString("gameId");
        Long gameId;
        if (valuegameId != null) {
            gameId = Long.parseLong(valuegameId);
        } else {
            throw new IllegalArgumentException("'gameId' parameter is required");
        }
        return imp.deleteGameHttp(request, version, accountId, gameId);
    }

    @ApiAction
    public Result getGame(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuegameId = request.getQueryString("gameId");
        Long gameId;
        if (valuegameId != null) {
            gameId = Long.parseLong(valuegameId);
        } else {
            throw new IllegalArgumentException("'gameId' parameter is required");
        }
        String valueincludeGameData = request.getQueryString("includeGameData");
        Boolean includeGameData;
        if (valueincludeGameData != null) {
            includeGameData = Boolean.valueOf(valueincludeGameData);
        } else {
            includeGameData = null;
        }
        return imp.getGameHttp(request, version, accountId, gameId, includeGameData);
    }

    @ApiAction
    public Result searchGames(Http.Request request, BigDecimal version) throws Exception {
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
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            throw new IllegalArgumentException("'start' parameter is required");
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            throw new IllegalArgumentException("'limit' parameter is required");
        }
        String valueappVersion = request.getQueryString("appVersion");
        String appVersion;
        if (valueappVersion != null) {
            appVersion = valueappVersion;
        } else {
            appVersion = null;
        }
        String valueincludeGameData = request.getQueryString("includeGameData");
        Boolean includeGameData;
        if (valueincludeGameData != null) {
            includeGameData = Boolean.valueOf(valueincludeGameData);
        } else {
            includeGameData = null;
        }
        String valueincludeInactive = request.getQueryString("includeInactive");
        Boolean includeInactive;
        if (valueincludeInactive != null) {
            includeInactive = Boolean.valueOf(valueincludeInactive);
        } else {
            includeInactive = null;
        }
        return imp.searchGamesHttp(request, version, accountId, appKey, start, limit, keyword, appVersion, includeGameData, includeInactive);
    }

    @ApiAction
    public Result updateGame(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuegameId = request.getQueryString("gameId");
        Long gameId;
        if (valuegameId != null) {
            gameId = Long.parseLong(valuegameId);
        } else {
            gameId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuetitle = request.getQueryString("title");
        String title;
        if (valuetitle != null) {
            title = valuetitle;
        } else {
            title = null;
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        String valuepackIds = request.getQueryString("packIds");
        String packIds;
        if (valuepackIds != null) {
            packIds = valuepackIds;
        } else {
            packIds = null;
        }
        String valueincludeGameData = request.getQueryString("includeGameData");
        Boolean includeGameData;
        if (valueincludeGameData != null) {
            includeGameData = Boolean.valueOf(valueincludeGameData);
        } else {
            includeGameData = null;
        }
        return imp.updateGameHttp(request, version, accountId, gameId, appKey, title, description, metaData, packIds, includeGameData);
    }

}
