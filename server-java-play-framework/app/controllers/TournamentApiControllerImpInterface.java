package controllers;

import java.math.BigDecimal;
import apimodels.MissionShortResponse;
import apimodels.SirqulResponse;
import apimodels.TournamentResponse;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class TournamentApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createTournamentHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String title, @NotNull Integer costToPlay, @NotNull Long startDate, String subType, Long imageAssetId, Integer secondsBetweenLevels, Integer secondsForTieBreaker, Integer secondsBetweenPacks, Integer maximumLevelLength, String costToPlayType, Integer minimumToPlay, Integer startingLimit, Integer availableLimit, String description, String metaData, String audienceIds, Boolean active, Boolean enableBuyBack, String offerIds, Long offerAssetId, Boolean fixedReward, String splitReward, Boolean allocateTickets, String tournamentData, String missionType, String visibility, Integer preliminaryGroups, String preliminaryGroupAdvancements, Boolean enableMultipleEntries, Boolean enableMultipleVotes, Boolean featured, String winnerTag, String tieTag) throws Exception {
        TournamentResponse obj = createTournament(request, version, accountId, appKey, title, costToPlay, startDate, subType, imageAssetId, secondsBetweenLevels, secondsForTieBreaker, secondsBetweenPacks, maximumLevelLength, costToPlayType, minimumToPlay, startingLimit, availableLimit, description, metaData, audienceIds, active, enableBuyBack, offerIds, offerAssetId, fixedReward, splitReward, allocateTickets, tournamentData, missionType, visibility, preliminaryGroups, preliminaryGroupAdvancements, enableMultipleEntries, enableMultipleVotes, featured, winnerTag, tieTag);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TournamentResponse createTournament(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String title, @NotNull Integer costToPlay, @NotNull Long startDate, String subType, Long imageAssetId, Integer secondsBetweenLevels, Integer secondsForTieBreaker, Integer secondsBetweenPacks, Integer maximumLevelLength, String costToPlayType, Integer minimumToPlay, Integer startingLimit, Integer availableLimit, String description, String metaData, String audienceIds, Boolean active, Boolean enableBuyBack, String offerIds, Long offerAssetId, Boolean fixedReward, String splitReward, Boolean allocateTickets, String tournamentData, String missionType, String visibility, Integer preliminaryGroups, String preliminaryGroupAdvancements, Boolean enableMultipleEntries, Boolean enableMultipleVotes, Boolean featured, String winnerTag, String tieTag) throws Exception;

    public Result deleteTournamentHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long missionId) throws Exception {
        SirqulResponse obj = deleteTournament(request, version, accountId, missionId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteTournament(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long missionId) throws Exception;

    public Result getTournamentHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, Long missionId, String joinCode, String includeScores, Integer objectPreviewSize) throws Exception {
        TournamentResponse obj = getTournament(request, version, accountId, missionId, joinCode, includeScores, objectPreviewSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TournamentResponse getTournament(Http.Request request, BigDecimal version, @NotNull Long accountId, Long missionId, String joinCode, String includeScores, Integer objectPreviewSize) throws Exception;

    public Result searchObjectsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long gameLevelId, String sortField, Boolean descending, Integer start, Integer limit) throws Exception {
        SirqulResponse obj = searchObjects(request, version, accountId, gameLevelId, sortField, descending, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse searchObjects(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long gameLevelId, String sortField, Boolean descending, Integer start, Integer limit) throws Exception;

    public Result searchRoundsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, String status, String missionType, Boolean currentOnly, String visibilities, Integer start, Integer limit) throws Exception {
        SirqulResponse obj = searchRounds(request, version, accountId, appKey, status, missionType, currentOnly, visibilities, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse searchRounds(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, String status, String missionType, Boolean currentOnly, String visibilities, Integer start, Integer limit) throws Exception;

    public Result searchTournamentsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, String keyword, String subType, Boolean includeInactive, String missionTypes, String filter, String sortField, Boolean descending, String visibility, Integer start, Integer limit) throws Exception {
        MissionShortResponse obj = searchTournaments(request, version, accountId, appKey, keyword, subType, includeInactive, missionTypes, filter, sortField, descending, visibility, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MissionShortResponse searchTournaments(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, String keyword, String subType, Boolean includeInactive, String missionTypes, String filter, String sortField, Boolean descending, String visibility, Integer start, Integer limit) throws Exception;

    public Result submitTournamentScoreHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Long missionId, @NotNull Long gameId, @NotNull Long packId, @NotNull String scores, Long gameLevelId) throws Exception {
        SirqulResponse obj = submitTournamentScore(request, version, accountId, appKey, missionId, gameId, packId, scores, gameLevelId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse submitTournamentScore(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Long missionId, @NotNull Long gameId, @NotNull Long packId, @NotNull String scores, Long gameLevelId) throws Exception;

    public Result submitTournamentVoteHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Long missionId, @NotNull Long gameObjectId, String deviceId, Boolean checkIfDeviceAlreadyVoted) throws Exception {
        SirqulResponse obj = submitTournamentVote(request, version, accountId, appKey, missionId, gameObjectId, deviceId, checkIfDeviceAlreadyVoted);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse submitTournamentVote(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Long missionId, @NotNull Long gameObjectId, String deviceId, Boolean checkIfDeviceAlreadyVoted) throws Exception;

    public Result substituteTournamentPlayerHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long missionId, @NotNull Long packId, @NotNull Long gameLevelId) throws Exception {
        SirqulResponse obj = substituteTournamentPlayer(request, version, accountId, missionId, packId, gameLevelId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse substituteTournamentPlayer(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long missionId, @NotNull Long packId, @NotNull Long gameLevelId) throws Exception;

    public Result updateTournamentHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long missionId, String title, String subType, Long imageAssetId, Integer secondsBetweenLevels, Integer secondsForTieBreaker, Integer secondsBetweenPacks, Integer maximumLevelLength, Integer costToPlay, String costToPlayType, Integer minimumToPlay, Integer startingLimit, Integer availableLimit, String description, String metaData, Long startDate, String audienceIds, Boolean active, Boolean enableBuyBack, String offerIds, Long offerAssetId, Boolean fixedReward, String splitReward, Boolean allocateTickets, String tournamentData, String visibility, Integer preliminaryGroups, String preliminaryGroupAdvancements, Boolean enableMultipleEntries, Boolean enableMultipleVotes, Boolean featured, String winnerTag, String tieTag) throws Exception {
        TournamentResponse obj = updateTournament(request, version, accountId, missionId, title, subType, imageAssetId, secondsBetweenLevels, secondsForTieBreaker, secondsBetweenPacks, maximumLevelLength, costToPlay, costToPlayType, minimumToPlay, startingLimit, availableLimit, description, metaData, startDate, audienceIds, active, enableBuyBack, offerIds, offerAssetId, fixedReward, splitReward, allocateTickets, tournamentData, visibility, preliminaryGroups, preliminaryGroupAdvancements, enableMultipleEntries, enableMultipleVotes, featured, winnerTag, tieTag);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TournamentResponse updateTournament(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long missionId, String title, String subType, Long imageAssetId, Integer secondsBetweenLevels, Integer secondsForTieBreaker, Integer secondsBetweenPacks, Integer maximumLevelLength, Integer costToPlay, String costToPlayType, Integer minimumToPlay, Integer startingLimit, Integer availableLimit, String description, String metaData, Long startDate, String audienceIds, Boolean active, Boolean enableBuyBack, String offerIds, Long offerAssetId, Boolean fixedReward, String splitReward, Boolean allocateTickets, String tournamentData, String visibility, Integer preliminaryGroups, String preliminaryGroupAdvancements, Boolean enableMultipleEntries, Boolean enableMultipleVotes, Boolean featured, String winnerTag, String tieTag) throws Exception;

}
