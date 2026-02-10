package controllers;

import java.math.BigDecimal;
import apimodels.MissionShortResponse;
import apimodels.SirqulResponse;
import apimodels.TournamentResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TournamentApiControllerImp extends TournamentApiControllerImpInterface {
    @Override
    public TournamentResponse createTournament(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String title, @NotNull Integer costToPlay, @NotNull Long startDate, String subType, Long imageAssetId, Integer secondsBetweenLevels, Integer secondsForTieBreaker, Integer secondsBetweenPacks, Integer maximumLevelLength, String costToPlayType, Integer minimumToPlay, Integer startingLimit, Integer availableLimit, String description, String metaData, String audienceIds, Boolean active, Boolean enableBuyBack, String offerIds, Long offerAssetId, Boolean fixedReward, String splitReward, Boolean allocateTickets, String tournamentData, String missionType, String visibility, Integer preliminaryGroups, String preliminaryGroupAdvancements, Boolean enableMultipleEntries, Boolean enableMultipleVotes, Boolean featured, String winnerTag, String tieTag) throws Exception {
        //Do your magic!!!
        return new TournamentResponse();
    }

    @Override
    public SirqulResponse deleteTournament(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long missionId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public TournamentResponse getTournament(Http.Request request, BigDecimal version, @NotNull Long accountId, Long missionId, String joinCode, String includeScores, Integer objectPreviewSize) throws Exception {
        //Do your magic!!!
        return new TournamentResponse();
    }

    @Override
    public SirqulResponse searchObjects(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long gameLevelId, String sortField, Boolean descending, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SirqulResponse searchRounds(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, String status, String missionType, Boolean currentOnly, String visibilities, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public MissionShortResponse searchTournaments(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, String keyword, String subType, Boolean includeInactive, String missionTypes, String filter, String sortField, Boolean descending, String visibility, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new MissionShortResponse();
    }

    @Override
    public SirqulResponse submitTournamentScore(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Long missionId, @NotNull Long gameId, @NotNull Long packId, @NotNull String scores, Long gameLevelId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SirqulResponse submitTournamentVote(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Long missionId, @NotNull Long gameObjectId, String deviceId, Boolean checkIfDeviceAlreadyVoted) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SirqulResponse substituteTournamentPlayer(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long missionId, @NotNull Long packId, @NotNull Long gameLevelId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public TournamentResponse updateTournament(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long missionId, String title, String subType, Long imageAssetId, Integer secondsBetweenLevels, Integer secondsForTieBreaker, Integer secondsBetweenPacks, Integer maximumLevelLength, Integer costToPlay, String costToPlayType, Integer minimumToPlay, Integer startingLimit, Integer availableLimit, String description, String metaData, Long startDate, String audienceIds, Boolean active, Boolean enableBuyBack, String offerIds, Long offerAssetId, Boolean fixedReward, String splitReward, Boolean allocateTickets, String tournamentData, String visibility, Integer preliminaryGroups, String preliminaryGroupAdvancements, Boolean enableMultipleEntries, Boolean enableMultipleVotes, Boolean featured, String winnerTag, String tieTag) throws Exception {
        //Do your magic!!!
        return new TournamentResponse();
    }

}
