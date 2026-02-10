package controllers;

import java.math.BigDecimal;
import apimodels.MissionFormatResponse;
import apimodels.MissionResponse;
import apimodels.SirqulResponse;

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
public abstract class MissionApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createMissionHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String title, String description, String subType, Long startDate, Long endDate, Boolean active, String gameLevelIds, String creativeIds, String audienceIds, String missionTask, String formatType, Long offerId, Double balance, Boolean advancedReporting, Boolean allocateTickets, Long ticketCount, String ticketType, Long points, String metaData, String applicationIds, String devices, String deviceIds, String deviceVersions, String locations, String radius) throws Exception {
        MissionResponse obj = createMission(request, version, accountId, title, description, subType, startDate, endDate, active, gameLevelIds, creativeIds, audienceIds, missionTask, formatType, offerId, balance, advancedReporting, allocateTickets, ticketCount, ticketType, points, metaData, applicationIds, devices, deviceIds, deviceVersions, locations, radius);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MissionResponse createMission(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String title, String description, String subType, Long startDate, Long endDate, Boolean active, String gameLevelIds, String creativeIds, String audienceIds, String missionTask, String formatType, Long offerId, Double balance, Boolean advancedReporting, Boolean allocateTickets, Long ticketCount, String ticketType, Long points, String metaData, String applicationIds, String devices, String deviceIds, String deviceVersions, String locations, String radius) throws Exception;

    public Result deleteMissionHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long missionId) throws Exception {
        SirqulResponse obj = deleteMission(request, version, accountId, missionId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteMission(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long missionId) throws Exception;

    public Result findMissionsHttp(Http.Request request, BigDecimal version, @NotNull String appKey, String suffix, String type, Long accountId, String appVersion, Double latitude, Double longitude, String device, Long deviceIdentifier, String deviceVersion, Integer start, Integer limit, Boolean includeGameData, Boolean includeAudiences, Boolean allocatesTickets, Boolean randomize, Boolean targetedAdsOnly, String missionIds, String audienceOperator) throws Exception {
        MissionResponse obj = findMissions(request, version, appKey, suffix, type, accountId, appVersion, latitude, longitude, device, deviceIdentifier, deviceVersion, start, limit, includeGameData, includeAudiences, allocatesTickets, randomize, targetedAdsOnly, missionIds, audienceOperator);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MissionResponse findMissions(Http.Request request, BigDecimal version, @NotNull String appKey, String suffix, String type, Long accountId, String appVersion, Double latitude, Double longitude, String device, Long deviceIdentifier, String deviceVersion, Integer start, Integer limit, Boolean includeGameData, Boolean includeAudiences, Boolean allocatesTickets, Boolean randomize, Boolean targetedAdsOnly, String missionIds, String audienceOperator) throws Exception;

    public Result getMissionHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long missionId, Boolean returnCreative) throws Exception {
        MissionResponse obj = getMission(request, version, accountId, missionId, returnCreative);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MissionResponse getMission(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long missionId, Boolean returnCreative) throws Exception;

    public Result importMissionHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Double latitude, @NotNull Double longitude, @NotNull String appKey, String keyword, Integer start, Integer limit, String adSize) throws Exception {
        SirqulResponse obj = importMission(request, version, accountId, latitude, longitude, appKey, keyword, start, limit, adSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse importMission(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Double latitude, @NotNull Double longitude, @NotNull String appKey, String keyword, Integer start, Integer limit, String adSize) throws Exception;

    public Result searchMissionFormatsHttp(Http.Request request, BigDecimal version, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly) throws Exception {
        List<MissionFormatResponse> obj = searchMissionFormats(request, version, start, limit, activeOnly);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (MissionFormatResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<MissionFormatResponse> searchMissionFormats(Http.Request request, BigDecimal version, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly) throws Exception;

    public Result searchMissionsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, String keyword, String subType, Integer start, Integer limit, Boolean includeGameData, Boolean includeAudiences, Boolean includeInactive, String suffix, String sortField, Boolean descending) throws Exception {
        List<MissionResponse> obj = searchMissions(request, version, accountId, keyword, subType, start, limit, includeGameData, includeAudiences, includeInactive, suffix, sortField, descending);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (MissionResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<MissionResponse> searchMissions(Http.Request request, BigDecimal version, @NotNull Long accountId, String keyword, String subType, Integer start, Integer limit, Boolean includeGameData, Boolean includeAudiences, Boolean includeInactive, String suffix, String sortField, Boolean descending) throws Exception;

    public Result searchMissionsByBillableEntityHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, String keyword, Integer start, Integer limit, Boolean includeGameData, Boolean includeAudiences, Boolean includeInactive, String suffix, String sortField, Boolean descending) throws Exception {
        List<MissionResponse> obj = searchMissionsByBillableEntity(request, version, accountId, keyword, start, limit, includeGameData, includeAudiences, includeInactive, suffix, sortField, descending);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (MissionResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<MissionResponse> searchMissionsByBillableEntity(Http.Request request, BigDecimal version, @NotNull Long accountId, String keyword, Integer start, Integer limit, Boolean includeGameData, Boolean includeAudiences, Boolean includeInactive, String suffix, String sortField, Boolean descending) throws Exception;

    public Result updateMissionHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long missionId, String title, String description, String subType, String metaData, Long startDate, Long endDate, Boolean active, String gameLevelIds, String creativeIds, String audienceIds, Long offerId, Double balance, Boolean advancedReporting, Boolean allocateTickets, Long ticketCount, String ticketType, Long points, String applicationIds, String devices, String deviceIds, String deviceVersions, String locations, String radius) throws Exception {
        MissionResponse obj = updateMission(request, version, accountId, missionId, title, description, subType, metaData, startDate, endDate, active, gameLevelIds, creativeIds, audienceIds, offerId, balance, advancedReporting, allocateTickets, ticketCount, ticketType, points, applicationIds, devices, deviceIds, deviceVersions, locations, radius);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MissionResponse updateMission(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long missionId, String title, String description, String subType, String metaData, Long startDate, Long endDate, Boolean active, String gameLevelIds, String creativeIds, String audienceIds, Long offerId, Double balance, Boolean advancedReporting, Boolean allocateTickets, Long ticketCount, String ticketType, Long points, String applicationIds, String devices, String deviceIds, String deviceVersions, String locations, String radius) throws Exception;

}
