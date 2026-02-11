package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.AchievementProgressResponse;
import org.openapitools.model.AchievementResponse;
import org.openapitools.model.AchievementShortResponse;
import org.openapitools.model.AchievementTierResponse;
import java.io.File;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface AchievementApiService {
      Response achievementTierSearchPost(String deviceId,Long accountId,String appKey,String keyword,Long achievementType,String rankType,String sortField,Boolean descending,Boolean descendingGoal,Long start,Long limit,SecurityContext securityContext)
      throws NotFoundException;
      Response createAchievement(String appKey,String title,String deviceId,Long accountId,String analyticsTag,String description,String rankType,Integer rankIncrement,Integer minIncrement,Integer maxIncrement,Boolean validate,Boolean active,String triggerDefinition,SecurityContext securityContext)
      throws NotFoundException;
      Response createAchievementTier(Long achievementId,Boolean scoreAllInstances,String deviceId,Long accountId,File icon,Long iconAssetId,String title,String description,Long goalCount,Long missionId,Long gameId,Long packId,Long gameLevelId,Integer gameObjectId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteAchievement(Long achievementId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteAchievementTier(Long achievementTierId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getAchievement(Long achievementId,String deviceId,Long accountId,String achievementType,SecurityContext securityContext)
      throws NotFoundException;
      Response getAchievementTier(Long accountId,Long achievementTierId,SecurityContext securityContext)
      throws NotFoundException;
      Response getUserAchievements(Boolean returnNulls,String appKey,Boolean includeUndiscovered,String deviceId,Long accountId,String connectionAccountEmail,Long connectionAccountId,String rankType,String achievementType,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response listAchievementTags(String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response listAchievements(String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,String deviceId,Long accountId,String appKey,String keyword,String achievementType,String rankType,SecurityContext securityContext)
      throws NotFoundException;
      Response searchAchievements(String appKey,String sortField,Boolean descending,Boolean includeTiers,Boolean includeInactiveTiers,Integer start,Integer limit,String deviceId,Long accountId,String keyword,String achievementType,String rankType,SecurityContext securityContext)
      throws NotFoundException;
      Response updateAchievement(String deviceId,Long accountId,Long achievementId,String analyticsTag,String title,String description,String rankType,Integer rankIncrement,Integer minIncrement,Boolean nullMinIncrement,Integer maxIncrement,Boolean nullMaxIncrement,Boolean validate,Boolean active,String triggerDefinition,SecurityContext securityContext)
      throws NotFoundException;
      Response updateAchievementTier(Long achievementTierId,String deviceId,Long accountId,File icon,Long iconAssetId,String title,String description,Long goalCount,Long missionId,Long gameId,Long packId,Long gameLevelId,Long gameObjectId,Boolean scoreAllInstances,SecurityContext securityContext)
      throws NotFoundException;
      Response updateUserAchievement(Long accountId,Long achievementId,String tag,Long customId,Long increment,Long startDate,Long endDate,Boolean returnProgress,SecurityContext securityContext)
      throws NotFoundException;


}
