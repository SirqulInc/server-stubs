package controllers;

import java.math.BigDecimal;
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
public abstract class MissionInviteApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createMissionInviteHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long missionId, String joinCode, Boolean includeGameData) throws Exception {
        MissionResponse obj = createMissionInvite(request, version, deviceId, accountId, missionId, joinCode, includeGameData);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MissionResponse createMissionInvite(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long missionId, String joinCode, Boolean includeGameData) throws Exception;

    public Result deleteMissionInviteHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long missionId, Long missionInviteId, Boolean includeGameData) throws Exception {
        SirqulResponse obj = deleteMissionInvite(request, version, deviceId, accountId, missionId, missionInviteId, includeGameData);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteMissionInvite(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long missionId, Long missionInviteId, Boolean includeGameData) throws Exception;

    public Result getMissionInviteHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long missionId, Long missionInviteId, Boolean includeGameData, String includeScores) throws Exception {
        MissionResponse obj = getMissionInvite(request, version, deviceId, accountId, missionId, missionInviteId, includeGameData, includeScores);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MissionResponse getMissionInvite(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long missionId, Long missionInviteId, Boolean includeGameData, String includeScores) throws Exception;

    public Result searchMissionInvitesHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, String appKey, String appVersion, Long missionId, String status, Long lastUpdated, Integer start, Integer limit, String keyword, String missionTypes, Boolean filterByBillable, Boolean includeGameData) throws Exception {
        List<MissionResponse> obj = searchMissionInvites(request, version, deviceId, accountId, appKey, appVersion, missionId, status, lastUpdated, start, limit, keyword, missionTypes, filterByBillable, includeGameData);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (MissionResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<MissionResponse> searchMissionInvites(Http.Request request, BigDecimal version, String deviceId, Long accountId, String appKey, String appVersion, Long missionId, String status, Long lastUpdated, Integer start, Integer limit, String keyword, String missionTypes, Boolean filterByBillable, Boolean includeGameData) throws Exception;

    public Result updateMissionInviteHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, String appKey, Long missionId, Long missionInviteId, Long packId, Long gameLevelId, String status, String permissionableType, Long permissionableId, Boolean includeGameData) throws Exception {
        MissionResponse obj = updateMissionInvite(request, version, deviceId, accountId, appKey, missionId, missionInviteId, packId, gameLevelId, status, permissionableType, permissionableId, includeGameData);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MissionResponse updateMissionInvite(Http.Request request, BigDecimal version, String deviceId, Long accountId, String appKey, Long missionId, Long missionInviteId, Long packId, Long gameLevelId, String status, String permissionableType, Long permissionableId, Boolean includeGameData) throws Exception;

}
