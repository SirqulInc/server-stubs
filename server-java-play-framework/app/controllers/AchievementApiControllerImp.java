package controllers;

import apimodels.AchievementProgressResponse;
import apimodels.AchievementResponse;
import apimodels.AchievementShortResponse;
import apimodels.AchievementTierResponse;
import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.SirqulResponse;

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
public class AchievementApiControllerImp extends AchievementApiControllerImpInterface {
    @Override
    public AchievementTierResponse apiVersionAchievementTierSearchPost(Http.Request request, BigDecimal version, String deviceId, Long accountId, String appKey, String keyword, Long achievementType, String rankType, String sortField, Boolean descending, Boolean descendingGoal, Long start, Long limit) throws Exception {
        //Do your magic!!!
        return new AchievementTierResponse();
    }

    @Override
    public AchievementResponse createAchievement(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String title, String deviceId, Long accountId, String analyticsTag, String description, String rankType, Integer rankIncrement, Integer minIncrement, Integer maxIncrement, Boolean validate, Boolean active, String triggerDefinition) throws Exception {
        //Do your magic!!!
        return new AchievementResponse();
    }

    @Override
    public AchievementTierResponse createAchievementTier(Http.Request request, BigDecimal version, @NotNull Long achievementId, @NotNull Boolean scoreAllInstances, String deviceId, Long accountId, InputStream icon, Long iconAssetId, String title, String description, Long goalCount, Long missionId, Long gameId, Long packId, Long gameLevelId, Integer gameObjectId) throws Exception {
        //Do your magic!!!
        return new AchievementTierResponse();
    }

    @Override
    public SirqulResponse deleteAchievement(Http.Request request, BigDecimal version, @NotNull Long achievementId, Long accountId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SirqulResponse deleteAchievementTier(Http.Request request, BigDecimal version, @NotNull Long achievementTierId, Long accountId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public AchievementTierResponse getAchievement(Http.Request request, BigDecimal version, @NotNull Long achievementId, String deviceId, Long accountId, String achievementType) throws Exception {
        //Do your magic!!!
        return new AchievementTierResponse();
    }

    @Override
    public AchievementTierResponse getAchievementTier(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long achievementTierId) throws Exception {
        //Do your magic!!!
        return new AchievementTierResponse();
    }

    @Override
    public List<AchievementProgressResponse> getUserAchievements(Http.Request request, BigDecimal version, @NotNull Boolean returnNulls, @NotNull String appKey, @NotNull Boolean includeUndiscovered, String deviceId, Long accountId, String connectionAccountEmail, Long connectionAccountId, String rankType, String achievementType, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new ArrayList<AchievementProgressResponse>();
    }

    @Override
    public SirqulResponse listAchievementTags(Http.Request request, BigDecimal version, String appKey) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public List<AchievementShortResponse> listAchievements(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, String deviceId, Long accountId, String appKey, String keyword, String achievementType, String rankType) throws Exception {
        //Do your magic!!!
        return new ArrayList<AchievementShortResponse>();
    }

    @Override
    public List<AchievementShortResponse> searchAchievements(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String sortField, @NotNull Boolean descending, @NotNull Boolean includeTiers, @NotNull Boolean includeInactiveTiers, @NotNull Integer start, @NotNull Integer limit, String deviceId, Long accountId, String keyword, String achievementType, String rankType) throws Exception {
        //Do your magic!!!
        return new ArrayList<AchievementShortResponse>();
    }

    @Override
    public AchievementResponse updateAchievement(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long achievementId, String analyticsTag, String title, String description, String rankType, Integer rankIncrement, Integer minIncrement, Boolean nullMinIncrement, Integer maxIncrement, Boolean nullMaxIncrement, Boolean validate, Boolean active, String triggerDefinition) throws Exception {
        //Do your magic!!!
        return new AchievementResponse();
    }

    @Override
    public AchievementTierResponse updateAchievementTier(Http.Request request, BigDecimal version, @NotNull Long achievementTierId, String deviceId, Long accountId, InputStream icon, Long iconAssetId, String title, String description, Long goalCount, Long missionId, Long gameId, Long packId, Long gameLevelId, Long gameObjectId, Boolean scoreAllInstances) throws Exception {
        //Do your magic!!!
        return new AchievementTierResponse();
    }

    @Override
    public SirqulResponse updateUserAchievement(Http.Request request, BigDecimal version, @NotNull Long accountId, Long achievementId, String tag, Long customId, Long increment, Long startDate, Long endDate, Boolean returnProgress) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

}
