package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.MissionShortResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TournamentResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface TournamentApiService {
      Response createTournament(Long accountId,String appKey,String title,Integer costToPlay,Long startDate,String subType,Long imageAssetId,Integer secondsBetweenLevels,Integer secondsForTieBreaker,Integer secondsBetweenPacks,Integer maximumLevelLength,String costToPlayType,Integer minimumToPlay,Integer startingLimit,Integer availableLimit,String description,String metaData,String audienceIds,Boolean active,Boolean enableBuyBack,String offerIds,Long offerAssetId,Boolean fixedReward,String splitReward,Boolean allocateTickets,String tournamentData,String missionType,String visibility,Integer preliminaryGroups,String preliminaryGroupAdvancements,Boolean enableMultipleEntries,Boolean enableMultipleVotes,Boolean featured,String winnerTag,String tieTag,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteTournament(Long accountId,Long missionId,SecurityContext securityContext)
      throws NotFoundException;
      Response getTournament(Long accountId,Long missionId,String joinCode,String includeScores,Integer objectPreviewSize,SecurityContext securityContext)
      throws NotFoundException;
      Response searchObjects(Long accountId,Long gameLevelId,String sortField,Boolean descending,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchRounds(Long accountId,String appKey,String status,String missionType,Boolean currentOnly,String visibilities,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchTournaments(Long accountId,String appKey,String keyword,String subType,Boolean includeInactive,String missionTypes,String filter,String sortField,Boolean descending,String visibility,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response submitTournamentScore(Long accountId,String appKey,Long missionId,Long gameId,Long packId,String scores,Long gameLevelId,SecurityContext securityContext)
      throws NotFoundException;
      Response submitTournamentVote(Long accountId,String appKey,Long missionId,Long gameObjectId,String deviceId,Boolean checkIfDeviceAlreadyVoted,SecurityContext securityContext)
      throws NotFoundException;
      Response substituteTournamentPlayer(Long accountId,Long missionId,Long packId,Long gameLevelId,SecurityContext securityContext)
      throws NotFoundException;
      Response updateTournament(Long accountId,Long missionId,String title,String subType,Long imageAssetId,Integer secondsBetweenLevels,Integer secondsForTieBreaker,Integer secondsBetweenPacks,Integer maximumLevelLength,Integer costToPlay,String costToPlayType,Integer minimumToPlay,Integer startingLimit,Integer availableLimit,String description,String metaData,Long startDate,String audienceIds,Boolean active,Boolean enableBuyBack,String offerIds,Long offerAssetId,Boolean fixedReward,String splitReward,Boolean allocateTickets,String tournamentData,String visibility,Integer preliminaryGroups,String preliminaryGroupAdvancements,Boolean enableMultipleEntries,Boolean enableMultipleVotes,Boolean featured,String winnerTag,String tieTag,SecurityContext securityContext)
      throws NotFoundException;


}
