package controllers;

import java.math.BigDecimal;
import apimodels.MissionShortResponse;
import apimodels.SirqulResponse;
import apimodels.TournamentResponse;

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
public class TournamentApiController extends Controller {
    private final TournamentApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private TournamentApiController(Config configuration, TournamentApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createTournament(Http.Request request, BigDecimal version) throws Exception {
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
        String valuetitle = request.getQueryString("title");
        String title;
        if (valuetitle != null) {
            title = valuetitle;
        } else {
            throw new IllegalArgumentException("'title' parameter is required");
        }
        String valuesubType = request.getQueryString("subType");
        String subType;
        if (valuesubType != null) {
            subType = valuesubType;
        } else {
            subType = null;
        }
        String valueimageAssetId = request.getQueryString("imageAssetId");
        Long imageAssetId;
        if (valueimageAssetId != null) {
            imageAssetId = Long.parseLong(valueimageAssetId);
        } else {
            imageAssetId = null;
        }
        String valuesecondsBetweenLevels = request.getQueryString("secondsBetweenLevels");
        Integer secondsBetweenLevels;
        if (valuesecondsBetweenLevels != null) {
            secondsBetweenLevels = Integer.parseInt(valuesecondsBetweenLevels);
        } else {
            secondsBetweenLevels = 600;
        }
        String valuesecondsForTieBreaker = request.getQueryString("secondsForTieBreaker");
        Integer secondsForTieBreaker;
        if (valuesecondsForTieBreaker != null) {
            secondsForTieBreaker = Integer.parseInt(valuesecondsForTieBreaker);
        } else {
            secondsForTieBreaker = 600;
        }
        String valuesecondsBetweenPacks = request.getQueryString("secondsBetweenPacks");
        Integer secondsBetweenPacks;
        if (valuesecondsBetweenPacks != null) {
            secondsBetweenPacks = Integer.parseInt(valuesecondsBetweenPacks);
        } else {
            secondsBetweenPacks = 86400;
        }
        String valuemaximumLevelLength = request.getQueryString("maximumLevelLength");
        Integer maximumLevelLength;
        if (valuemaximumLevelLength != null) {
            maximumLevelLength = Integer.parseInt(valuemaximumLevelLength);
        } else {
            maximumLevelLength = 1800;
        }
        String valuecostToPlay = request.getQueryString("costToPlay");
        Integer costToPlay;
        if (valuecostToPlay != null) {
            costToPlay = Integer.parseInt(valuecostToPlay);
        } else {
            throw new IllegalArgumentException("'costToPlay' parameter is required");
        }
        String valuecostToPlayType = request.getQueryString("costToPlayType");
        String costToPlayType;
        if (valuecostToPlayType != null) {
            costToPlayType = valuecostToPlayType;
        } else {
            costToPlayType = null;
        }
        String valueminimumToPlay = request.getQueryString("minimumToPlay");
        Integer minimumToPlay;
        if (valueminimumToPlay != null) {
            minimumToPlay = Integer.parseInt(valueminimumToPlay);
        } else {
            minimumToPlay = 1;
        }
        String valuestartingLimit = request.getQueryString("startingLimit");
        Integer startingLimit;
        if (valuestartingLimit != null) {
            startingLimit = Integer.parseInt(valuestartingLimit);
        } else {
            startingLimit = null;
        }
        String valueavailableLimit = request.getQueryString("availableLimit");
        Integer availableLimit;
        if (valueavailableLimit != null) {
            availableLimit = Integer.parseInt(valueavailableLimit);
        } else {
            availableLimit = null;
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
        String valuestartDate = request.getQueryString("startDate");
        Long startDate;
        if (valuestartDate != null) {
            startDate = Long.parseLong(valuestartDate);
        } else {
            throw new IllegalArgumentException("'startDate' parameter is required");
        }
        String valueaudienceIds = request.getQueryString("audienceIds");
        String audienceIds;
        if (valueaudienceIds != null) {
            audienceIds = valueaudienceIds;
        } else {
            audienceIds = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valueenableBuyBack = request.getQueryString("enableBuyBack");
        Boolean enableBuyBack;
        if (valueenableBuyBack != null) {
            enableBuyBack = Boolean.valueOf(valueenableBuyBack);
        } else {
            enableBuyBack = false;
        }
        String valueofferIds = request.getQueryString("offerIds");
        String offerIds;
        if (valueofferIds != null) {
            offerIds = valueofferIds;
        } else {
            offerIds = null;
        }
        String valueofferAssetId = request.getQueryString("offerAssetId");
        Long offerAssetId;
        if (valueofferAssetId != null) {
            offerAssetId = Long.parseLong(valueofferAssetId);
        } else {
            offerAssetId = null;
        }
        String valuefixedReward = request.getQueryString("fixedReward");
        Boolean fixedReward;
        if (valuefixedReward != null) {
            fixedReward = Boolean.valueOf(valuefixedReward);
        } else {
            fixedReward = false;
        }
        String valuesplitReward = request.getQueryString("splitReward");
        String splitReward;
        if (valuesplitReward != null) {
            splitReward = valuesplitReward;
        } else {
            splitReward = "ALL";
        }
        String valueallocateTickets = request.getQueryString("allocateTickets");
        Boolean allocateTickets;
        if (valueallocateTickets != null) {
            allocateTickets = Boolean.valueOf(valueallocateTickets);
        } else {
            allocateTickets = null;
        }
        String valuetournamentData = request.getQueryString("tournamentData");
        String tournamentData;
        if (valuetournamentData != null) {
            tournamentData = valuetournamentData;
        } else {
            tournamentData = null;
        }
        String valuemissionType = request.getQueryString("missionType");
        String missionType;
        if (valuemissionType != null) {
            missionType = valuemissionType;
        } else {
            missionType = "MULTISTAGE";
        }
        String valuevisibility = request.getQueryString("visibility");
        String visibility;
        if (valuevisibility != null) {
            visibility = valuevisibility;
        } else {
            visibility = "PUBLIC";
        }
        String valuepreliminaryGroups = request.getQueryString("preliminaryGroups");
        Integer preliminaryGroups;
        if (valuepreliminaryGroups != null) {
            preliminaryGroups = Integer.parseInt(valuepreliminaryGroups);
        } else {
            preliminaryGroups = 1;
        }
        String valuepreliminaryGroupAdvancements = request.getQueryString("preliminaryGroupAdvancements");
        String preliminaryGroupAdvancements;
        if (valuepreliminaryGroupAdvancements != null) {
            preliminaryGroupAdvancements = valuepreliminaryGroupAdvancements;
        } else {
            preliminaryGroupAdvancements = "1";
        }
        String valueenableMultipleEntries = request.getQueryString("enableMultipleEntries");
        Boolean enableMultipleEntries;
        if (valueenableMultipleEntries != null) {
            enableMultipleEntries = Boolean.valueOf(valueenableMultipleEntries);
        } else {
            enableMultipleEntries = false;
        }
        String valueenableMultipleVotes = request.getQueryString("enableMultipleVotes");
        Boolean enableMultipleVotes;
        if (valueenableMultipleVotes != null) {
            enableMultipleVotes = Boolean.valueOf(valueenableMultipleVotes);
        } else {
            enableMultipleVotes = false;
        }
        String valuefeatured = request.getQueryString("featured");
        Boolean featured;
        if (valuefeatured != null) {
            featured = Boolean.valueOf(valuefeatured);
        } else {
            featured = false;
        }
        String valuewinnerTag = request.getQueryString("winnerTag");
        String winnerTag;
        if (valuewinnerTag != null) {
            winnerTag = valuewinnerTag;
        } else {
            winnerTag = null;
        }
        String valuetieTag = request.getQueryString("tieTag");
        String tieTag;
        if (valuetieTag != null) {
            tieTag = valuetieTag;
        } else {
            tieTag = null;
        }
        return imp.createTournamentHttp(request, version, accountId, appKey, title, costToPlay, startDate, subType, imageAssetId, secondsBetweenLevels, secondsForTieBreaker, secondsBetweenPacks, maximumLevelLength, costToPlayType, minimumToPlay, startingLimit, availableLimit, description, metaData, audienceIds, active, enableBuyBack, offerIds, offerAssetId, fixedReward, splitReward, allocateTickets, tournamentData, missionType, visibility, preliminaryGroups, preliminaryGroupAdvancements, enableMultipleEntries, enableMultipleVotes, featured, winnerTag, tieTag);
    }

    @ApiAction
    public Result deleteTournament(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuemissionId = request.getQueryString("missionId");
        Long missionId;
        if (valuemissionId != null) {
            missionId = Long.parseLong(valuemissionId);
        } else {
            throw new IllegalArgumentException("'missionId' parameter is required");
        }
        return imp.deleteTournamentHttp(request, version, accountId, missionId);
    }

    @ApiAction
    public Result getTournament(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuemissionId = request.getQueryString("missionId");
        Long missionId;
        if (valuemissionId != null) {
            missionId = Long.parseLong(valuemissionId);
        } else {
            missionId = null;
        }
        String valuejoinCode = request.getQueryString("joinCode");
        String joinCode;
        if (valuejoinCode != null) {
            joinCode = valuejoinCode;
        } else {
            joinCode = null;
        }
        String valueincludeScores = request.getQueryString("includeScores");
        String includeScores;
        if (valueincludeScores != null) {
            includeScores = valueincludeScores;
        } else {
            includeScores = null;
        }
        String valueobjectPreviewSize = request.getQueryString("objectPreviewSize");
        Integer objectPreviewSize;
        if (valueobjectPreviewSize != null) {
            objectPreviewSize = Integer.parseInt(valueobjectPreviewSize);
        } else {
            objectPreviewSize = 50;
        }
        return imp.getTournamentHttp(request, version, accountId, missionId, joinCode, includeScores, objectPreviewSize);
    }

    @ApiAction
    public Result searchObjects(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuegameLevelId = request.getQueryString("gameLevelId");
        Long gameLevelId;
        if (valuegameLevelId != null) {
            gameLevelId = Long.parseLong(valuegameLevelId);
        } else {
            throw new IllegalArgumentException("'gameLevelId' parameter is required");
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = "PLAYER_SCORE_COUNT";
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = true;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = 0;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        return imp.searchObjectsHttp(request, version, accountId, gameLevelId, sortField, descending, start, limit);
    }

    @ApiAction
    public Result searchRounds(Http.Request request, BigDecimal version) throws Exception {
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
        String valuestatus = request.getQueryString("status");
        String status;
        if (valuestatus != null) {
            status = valuestatus;
        } else {
            status = "ACCEPTED,ACTIVE";
        }
        String valuemissionType = request.getQueryString("missionType");
        String missionType;
        if (valuemissionType != null) {
            missionType = valuemissionType;
        } else {
            missionType = null;
        }
        String valuecurrentOnly = request.getQueryString("currentOnly");
        Boolean currentOnly;
        if (valuecurrentOnly != null) {
            currentOnly = Boolean.valueOf(valuecurrentOnly);
        } else {
            currentOnly = true;
        }
        String valuevisibilities = request.getQueryString("visibilities");
        String visibilities;
        if (valuevisibilities != null) {
            visibilities = valuevisibilities;
        } else {
            visibilities = "PUBLIC";
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = 0;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        return imp.searchRoundsHttp(request, version, accountId, appKey, status, missionType, currentOnly, visibilities, start, limit);
    }

    @ApiAction
    public Result searchTournaments(Http.Request request, BigDecimal version) throws Exception {
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
        String valuesubType = request.getQueryString("subType");
        String subType;
        if (valuesubType != null) {
            subType = valuesubType;
        } else {
            subType = null;
        }
        String valueincludeInactive = request.getQueryString("includeInactive");
        Boolean includeInactive;
        if (valueincludeInactive != null) {
            includeInactive = Boolean.valueOf(valueincludeInactive);
        } else {
            includeInactive = false;
        }
        String valuemissionTypes = request.getQueryString("missionTypes");
        String missionTypes;
        if (valuemissionTypes != null) {
            missionTypes = valuemissionTypes;
        } else {
            missionTypes = "MULTISTAGE,TOURNAMENT,POOLPLAY";
        }
        String valuefilter = request.getQueryString("filter");
        String filter;
        if (valuefilter != null) {
            filter = valuefilter;
        } else {
            filter = "UPCOMING";
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = "START_DATE";
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = null;
        }
        String valuevisibility = request.getQueryString("visibility");
        String visibility;
        if (valuevisibility != null) {
            visibility = valuevisibility;
        } else {
            visibility = "PUBLIC";
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = 0;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        return imp.searchTournamentsHttp(request, version, accountId, appKey, keyword, subType, includeInactive, missionTypes, filter, sortField, descending, visibility, start, limit);
    }

    @ApiAction
    public Result submitTournamentScore(Http.Request request, BigDecimal version) throws Exception {
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
            throw new IllegalArgumentException("'missionId' parameter is required");
        }
        String valuegameId = request.getQueryString("gameId");
        Long gameId;
        if (valuegameId != null) {
            gameId = Long.parseLong(valuegameId);
        } else {
            throw new IllegalArgumentException("'gameId' parameter is required");
        }
        String valuepackId = request.getQueryString("packId");
        Long packId;
        if (valuepackId != null) {
            packId = Long.parseLong(valuepackId);
        } else {
            throw new IllegalArgumentException("'packId' parameter is required");
        }
        String valuegameLevelId = request.getQueryString("gameLevelId");
        Long gameLevelId;
        if (valuegameLevelId != null) {
            gameLevelId = Long.parseLong(valuegameLevelId);
        } else {
            gameLevelId = null;
        }
        String valuescores = request.getQueryString("scores");
        String scores;
        if (valuescores != null) {
            scores = valuescores;
        } else {
            throw new IllegalArgumentException("'scores' parameter is required");
        }
        return imp.submitTournamentScoreHttp(request, version, accountId, appKey, missionId, gameId, packId, scores, gameLevelId);
    }

    @ApiAction
    public Result submitTournamentVote(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
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
            throw new IllegalArgumentException("'missionId' parameter is required");
        }
        String valuegameObjectId = request.getQueryString("gameObjectId");
        Long gameObjectId;
        if (valuegameObjectId != null) {
            gameObjectId = Long.parseLong(valuegameObjectId);
        } else {
            throw new IllegalArgumentException("'gameObjectId' parameter is required");
        }
        String valuecheckIfDeviceAlreadyVoted = request.getQueryString("checkIfDeviceAlreadyVoted");
        Boolean checkIfDeviceAlreadyVoted;
        if (valuecheckIfDeviceAlreadyVoted != null) {
            checkIfDeviceAlreadyVoted = Boolean.valueOf(valuecheckIfDeviceAlreadyVoted);
        } else {
            checkIfDeviceAlreadyVoted = false;
        }
        return imp.submitTournamentVoteHttp(request, version, accountId, appKey, missionId, gameObjectId, deviceId, checkIfDeviceAlreadyVoted);
    }

    @ApiAction
    public Result substituteTournamentPlayer(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuemissionId = request.getQueryString("missionId");
        Long missionId;
        if (valuemissionId != null) {
            missionId = Long.parseLong(valuemissionId);
        } else {
            throw new IllegalArgumentException("'missionId' parameter is required");
        }
        String valuepackId = request.getQueryString("packId");
        Long packId;
        if (valuepackId != null) {
            packId = Long.parseLong(valuepackId);
        } else {
            throw new IllegalArgumentException("'packId' parameter is required");
        }
        String valuegameLevelId = request.getQueryString("gameLevelId");
        Long gameLevelId;
        if (valuegameLevelId != null) {
            gameLevelId = Long.parseLong(valuegameLevelId);
        } else {
            throw new IllegalArgumentException("'gameLevelId' parameter is required");
        }
        return imp.substituteTournamentPlayerHttp(request, version, accountId, missionId, packId, gameLevelId);
    }

    @ApiAction
    public Result updateTournament(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuemissionId = request.getQueryString("missionId");
        Long missionId;
        if (valuemissionId != null) {
            missionId = Long.parseLong(valuemissionId);
        } else {
            throw new IllegalArgumentException("'missionId' parameter is required");
        }
        String valuetitle = request.getQueryString("title");
        String title;
        if (valuetitle != null) {
            title = valuetitle;
        } else {
            title = null;
        }
        String valuesubType = request.getQueryString("subType");
        String subType;
        if (valuesubType != null) {
            subType = valuesubType;
        } else {
            subType = null;
        }
        String valueimageAssetId = request.getQueryString("imageAssetId");
        Long imageAssetId;
        if (valueimageAssetId != null) {
            imageAssetId = Long.parseLong(valueimageAssetId);
        } else {
            imageAssetId = null;
        }
        String valuesecondsBetweenLevels = request.getQueryString("secondsBetweenLevels");
        Integer secondsBetweenLevels;
        if (valuesecondsBetweenLevels != null) {
            secondsBetweenLevels = Integer.parseInt(valuesecondsBetweenLevels);
        } else {
            secondsBetweenLevels = null;
        }
        String valuesecondsForTieBreaker = request.getQueryString("secondsForTieBreaker");
        Integer secondsForTieBreaker;
        if (valuesecondsForTieBreaker != null) {
            secondsForTieBreaker = Integer.parseInt(valuesecondsForTieBreaker);
        } else {
            secondsForTieBreaker = null;
        }
        String valuesecondsBetweenPacks = request.getQueryString("secondsBetweenPacks");
        Integer secondsBetweenPacks;
        if (valuesecondsBetweenPacks != null) {
            secondsBetweenPacks = Integer.parseInt(valuesecondsBetweenPacks);
        } else {
            secondsBetweenPacks = null;
        }
        String valuemaximumLevelLength = request.getQueryString("maximumLevelLength");
        Integer maximumLevelLength;
        if (valuemaximumLevelLength != null) {
            maximumLevelLength = Integer.parseInt(valuemaximumLevelLength);
        } else {
            maximumLevelLength = null;
        }
        String valuecostToPlay = request.getQueryString("costToPlay");
        Integer costToPlay;
        if (valuecostToPlay != null) {
            costToPlay = Integer.parseInt(valuecostToPlay);
        } else {
            costToPlay = null;
        }
        String valuecostToPlayType = request.getQueryString("costToPlayType");
        String costToPlayType;
        if (valuecostToPlayType != null) {
            costToPlayType = valuecostToPlayType;
        } else {
            costToPlayType = null;
        }
        String valueminimumToPlay = request.getQueryString("minimumToPlay");
        Integer minimumToPlay;
        if (valueminimumToPlay != null) {
            minimumToPlay = Integer.parseInt(valueminimumToPlay);
        } else {
            minimumToPlay = null;
        }
        String valuestartingLimit = request.getQueryString("startingLimit");
        Integer startingLimit;
        if (valuestartingLimit != null) {
            startingLimit = Integer.parseInt(valuestartingLimit);
        } else {
            startingLimit = null;
        }
        String valueavailableLimit = request.getQueryString("availableLimit");
        Integer availableLimit;
        if (valueavailableLimit != null) {
            availableLimit = Integer.parseInt(valueavailableLimit);
        } else {
            availableLimit = null;
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
        String valuestartDate = request.getQueryString("startDate");
        Long startDate;
        if (valuestartDate != null) {
            startDate = Long.parseLong(valuestartDate);
        } else {
            startDate = null;
        }
        String valueaudienceIds = request.getQueryString("audienceIds");
        String audienceIds;
        if (valueaudienceIds != null) {
            audienceIds = valueaudienceIds;
        } else {
            audienceIds = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valueenableBuyBack = request.getQueryString("enableBuyBack");
        Boolean enableBuyBack;
        if (valueenableBuyBack != null) {
            enableBuyBack = Boolean.valueOf(valueenableBuyBack);
        } else {
            enableBuyBack = null;
        }
        String valueofferIds = request.getQueryString("offerIds");
        String offerIds;
        if (valueofferIds != null) {
            offerIds = valueofferIds;
        } else {
            offerIds = null;
        }
        String valueofferAssetId = request.getQueryString("offerAssetId");
        Long offerAssetId;
        if (valueofferAssetId != null) {
            offerAssetId = Long.parseLong(valueofferAssetId);
        } else {
            offerAssetId = null;
        }
        String valuefixedReward = request.getQueryString("fixedReward");
        Boolean fixedReward;
        if (valuefixedReward != null) {
            fixedReward = Boolean.valueOf(valuefixedReward);
        } else {
            fixedReward = null;
        }
        String valuesplitReward = request.getQueryString("splitReward");
        String splitReward;
        if (valuesplitReward != null) {
            splitReward = valuesplitReward;
        } else {
            splitReward = null;
        }
        String valueallocateTickets = request.getQueryString("allocateTickets");
        Boolean allocateTickets;
        if (valueallocateTickets != null) {
            allocateTickets = Boolean.valueOf(valueallocateTickets);
        } else {
            allocateTickets = null;
        }
        String valuetournamentData = request.getQueryString("tournamentData");
        String tournamentData;
        if (valuetournamentData != null) {
            tournamentData = valuetournamentData;
        } else {
            tournamentData = null;
        }
        String valuevisibility = request.getQueryString("visibility");
        String visibility;
        if (valuevisibility != null) {
            visibility = valuevisibility;
        } else {
            visibility = null;
        }
        String valuepreliminaryGroups = request.getQueryString("preliminaryGroups");
        Integer preliminaryGroups;
        if (valuepreliminaryGroups != null) {
            preliminaryGroups = Integer.parseInt(valuepreliminaryGroups);
        } else {
            preliminaryGroups = null;
        }
        String valuepreliminaryGroupAdvancements = request.getQueryString("preliminaryGroupAdvancements");
        String preliminaryGroupAdvancements;
        if (valuepreliminaryGroupAdvancements != null) {
            preliminaryGroupAdvancements = valuepreliminaryGroupAdvancements;
        } else {
            preliminaryGroupAdvancements = null;
        }
        String valueenableMultipleEntries = request.getQueryString("enableMultipleEntries");
        Boolean enableMultipleEntries;
        if (valueenableMultipleEntries != null) {
            enableMultipleEntries = Boolean.valueOf(valueenableMultipleEntries);
        } else {
            enableMultipleEntries = null;
        }
        String valueenableMultipleVotes = request.getQueryString("enableMultipleVotes");
        Boolean enableMultipleVotes;
        if (valueenableMultipleVotes != null) {
            enableMultipleVotes = Boolean.valueOf(valueenableMultipleVotes);
        } else {
            enableMultipleVotes = null;
        }
        String valuefeatured = request.getQueryString("featured");
        Boolean featured;
        if (valuefeatured != null) {
            featured = Boolean.valueOf(valuefeatured);
        } else {
            featured = null;
        }
        String valuewinnerTag = request.getQueryString("winnerTag");
        String winnerTag;
        if (valuewinnerTag != null) {
            winnerTag = valuewinnerTag;
        } else {
            winnerTag = null;
        }
        String valuetieTag = request.getQueryString("tieTag");
        String tieTag;
        if (valuetieTag != null) {
            tieTag = valuetieTag;
        } else {
            tieTag = null;
        }
        return imp.updateTournamentHttp(request, version, accountId, missionId, title, subType, imageAssetId, secondsBetweenLevels, secondsForTieBreaker, secondsBetweenPacks, maximumLevelLength, costToPlay, costToPlayType, minimumToPlay, startingLimit, availableLimit, description, metaData, startDate, audienceIds, active, enableBuyBack, offerIds, offerAssetId, fixedReward, splitReward, allocateTickets, tournamentData, visibility, preliminaryGroups, preliminaryGroupAdvancements, enableMultipleEntries, enableMultipleVotes, featured, winnerTag, tieTag);
    }

}
