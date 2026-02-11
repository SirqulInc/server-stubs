package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.AchievementProgressResponse;
import org.openapitools.model.AchievementResponse;
import org.openapitools.model.AchievementShortResponse;
import org.openapitools.model.AchievementTierResponse;
import java.io.File;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class AchievementApiService {
    public abstract Response achievementTierSearchPost(String deviceId,Long accountId,String appKey,String keyword,Long achievementType,String rankType,String sortField,Boolean descending,Boolean descendingGoal,Long start,Long limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createAchievement( @NotNull String appKey, @NotNull String title,String deviceId,Long accountId,String analyticsTag,String description,String rankType,Integer rankIncrement,Integer minIncrement,Integer maxIncrement,Boolean validate,Boolean active,String triggerDefinition,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createAchievementTier( @NotNull Long achievementId, @NotNull Boolean scoreAllInstances,String deviceId,Long accountId,File icon,Long iconAssetId,String title,String description,Long goalCount,Long missionId,Long gameId,Long packId,Long gameLevelId,Integer gameObjectId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteAchievement( @NotNull Long achievementId,Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteAchievementTier( @NotNull Long achievementTierId,Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAchievement( @NotNull Long achievementId,String deviceId,Long accountId,String achievementType,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAchievementTier( @NotNull Long accountId, @NotNull Long achievementTierId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getUserAchievements( @NotNull Boolean returnNulls, @NotNull String appKey, @NotNull Boolean includeUndiscovered,String deviceId,Long accountId,String connectionAccountEmail,Long connectionAccountId,String rankType,String achievementType,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listAchievementTags(String appKey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listAchievements( @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly,String deviceId,Long accountId,String appKey,String keyword,String achievementType,String rankType,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchAchievements( @NotNull String appKey, @NotNull String sortField, @NotNull Boolean descending, @NotNull Boolean includeTiers, @NotNull Boolean includeInactiveTiers, @NotNull Integer start, @NotNull Integer limit,String deviceId,Long accountId,String keyword,String achievementType,String rankType,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateAchievement(String deviceId,Long accountId,Long achievementId,String analyticsTag,String title,String description,String rankType,Integer rankIncrement,Integer minIncrement,Boolean nullMinIncrement,Integer maxIncrement,Boolean nullMaxIncrement,Boolean validate,Boolean active,String triggerDefinition,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateAchievementTier( @NotNull Long achievementTierId,String deviceId,Long accountId,File icon,Long iconAssetId,String title,String description,Long goalCount,Long missionId,Long gameId,Long packId,Long gameLevelId,Long gameObjectId,Boolean scoreAllInstances,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateUserAchievement( @NotNull Long accountId,Long achievementId,String tag,Long customId,Long increment,Long startDate,Long endDate,Boolean returnProgress,SecurityContext securityContext) throws NotFoundException;
}
