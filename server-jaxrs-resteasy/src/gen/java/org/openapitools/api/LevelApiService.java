package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.GameLevelListResponse;
import org.openapitools.model.GameLevelResponse;
import org.openapitools.model.QuestionResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.WordzWordResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface LevelApiService {
      Response createGameLevel(Long accountId,String name,String gameData,String gameDataSuffix,String appKey,String description,String difficulty,String appVersion,Long assetImageId,Long assetIconId,String visibility,Boolean friendGroup,String connectionIds,String connectionGroupIds,Double balance,Boolean active,Boolean allocateTickets,Long ticketCount,String ticketType,Long points,String tutorialTitle,String tutorialMessage,String tutorialAlignment,Long tutorialImageAssetId,Long offerId,String metaData,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteGameLevel(Long accountId,Long levelId,SecurityContext securityContext)
      throws NotFoundException;
      Response getGameLevel(Long accountId,Long levelId,Boolean includeGameData,SecurityContext securityContext)
      throws NotFoundException;
      Response getGameLevelsByApplication(Long accountId,String appKey,String keyword,String sortField,Boolean descending,Integer start,Integer limit,String appVersion,Boolean includeGameData,String filters,SecurityContext securityContext)
      throws NotFoundException;
      Response getGameLevelsByBillableEntity(Long accountId,String appKey,String keyword,String sortField,Boolean descending,Boolean activeOnly,Long start,Long limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getQuestionsInLevel(Long levelId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getWordsInLevel(Long levelId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response updateGameLevel(Long accountId,Long levelId,String appKey,String name,String description,String difficulty,String appVersion,Long assetImageId,Long assetIconId,String gameData,String gameDataSuffix,String visibility,Boolean friendGroup,String connectionIds,String connectionGroupIds,Double balance,Boolean active,Boolean allocateTickets,Long ticketCount,String ticketType,Long points,String tutorialTitle,String tutorialMessage,String tutorialAlignment,Long tutorialImageAssetId,Long offerId,String metaData,SecurityContext securityContext)
      throws NotFoundException;
      Response updateQuestionsInLevel(Long levelId,Long accountId,String questionIds,SecurityContext securityContext)
      throws NotFoundException;
      Response updateWordsInLevel(Long levelId,Long accountId,String wordIds,SecurityContext securityContext)
      throws NotFoundException;


}
