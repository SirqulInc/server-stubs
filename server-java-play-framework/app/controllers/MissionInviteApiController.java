package controllers;

import java.math.BigDecimal;
import apimodels.MissionResponse;
import apimodels.SirqulResponse;

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
public class MissionInviteApiController extends Controller {
    private final MissionInviteApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private MissionInviteApiController(Config configuration, MissionInviteApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createMissionInvite(Http.Request request, BigDecimal version) throws Exception {
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
            accountId = null;
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
        String valueincludeGameData = request.getQueryString("includeGameData");
        Boolean includeGameData;
        if (valueincludeGameData != null) {
            includeGameData = Boolean.valueOf(valueincludeGameData);
        } else {
            includeGameData = null;
        }
        return imp.createMissionInviteHttp(request, version, deviceId, accountId, missionId, joinCode, includeGameData);
    }

    @ApiAction
    public Result deleteMissionInvite(Http.Request request, BigDecimal version) throws Exception {
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
            accountId = null;
        }
        String valuemissionId = request.getQueryString("missionId");
        Long missionId;
        if (valuemissionId != null) {
            missionId = Long.parseLong(valuemissionId);
        } else {
            missionId = null;
        }
        String valuemissionInviteId = request.getQueryString("missionInviteId");
        Long missionInviteId;
        if (valuemissionInviteId != null) {
            missionInviteId = Long.parseLong(valuemissionInviteId);
        } else {
            missionInviteId = null;
        }
        String valueincludeGameData = request.getQueryString("includeGameData");
        Boolean includeGameData;
        if (valueincludeGameData != null) {
            includeGameData = Boolean.valueOf(valueincludeGameData);
        } else {
            includeGameData = null;
        }
        return imp.deleteMissionInviteHttp(request, version, deviceId, accountId, missionId, missionInviteId, includeGameData);
    }

    @ApiAction
    public Result getMissionInvite(Http.Request request, BigDecimal version) throws Exception {
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
            accountId = null;
        }
        String valuemissionId = request.getQueryString("missionId");
        Long missionId;
        if (valuemissionId != null) {
            missionId = Long.parseLong(valuemissionId);
        } else {
            missionId = null;
        }
        String valuemissionInviteId = request.getQueryString("missionInviteId");
        Long missionInviteId;
        if (valuemissionInviteId != null) {
            missionInviteId = Long.parseLong(valuemissionInviteId);
        } else {
            missionInviteId = null;
        }
        String valueincludeGameData = request.getQueryString("includeGameData");
        Boolean includeGameData;
        if (valueincludeGameData != null) {
            includeGameData = Boolean.valueOf(valueincludeGameData);
        } else {
            includeGameData = null;
        }
        String valueincludeScores = request.getQueryString("includeScores");
        String includeScores;
        if (valueincludeScores != null) {
            includeScores = valueincludeScores;
        } else {
            includeScores = null;
        }
        return imp.getMissionInviteHttp(request, version, deviceId, accountId, missionId, missionInviteId, includeGameData, includeScores);
    }

    @ApiAction
    public Result searchMissionInvites(Http.Request request, BigDecimal version) throws Exception {
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
            accountId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valueappVersion = request.getQueryString("appVersion");
        String appVersion;
        if (valueappVersion != null) {
            appVersion = valueappVersion;
        } else {
            appVersion = null;
        }
        String valuemissionId = request.getQueryString("missionId");
        Long missionId;
        if (valuemissionId != null) {
            missionId = Long.parseLong(valuemissionId);
        } else {
            missionId = null;
        }
        String valuestatus = request.getQueryString("status");
        String status;
        if (valuestatus != null) {
            status = valuestatus;
        } else {
            status = null;
        }
        String valuelastUpdated = request.getQueryString("lastUpdated");
        Long lastUpdated;
        if (valuelastUpdated != null) {
            lastUpdated = Long.parseLong(valuelastUpdated);
        } else {
            lastUpdated = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valuemissionTypes = request.getQueryString("missionTypes");
        String missionTypes;
        if (valuemissionTypes != null) {
            missionTypes = valuemissionTypes;
        } else {
            missionTypes = null;
        }
        String valuefilterByBillable = request.getQueryString("filterByBillable");
        Boolean filterByBillable;
        if (valuefilterByBillable != null) {
            filterByBillable = Boolean.valueOf(valuefilterByBillable);
        } else {
            filterByBillable = null;
        }
        String valueincludeGameData = request.getQueryString("includeGameData");
        Boolean includeGameData;
        if (valueincludeGameData != null) {
            includeGameData = Boolean.valueOf(valueincludeGameData);
        } else {
            includeGameData = null;
        }
        return imp.searchMissionInvitesHttp(request, version, deviceId, accountId, appKey, appVersion, missionId, status, lastUpdated, start, limit, keyword, missionTypes, filterByBillable, includeGameData);
    }

    @ApiAction
    public Result updateMissionInvite(Http.Request request, BigDecimal version) throws Exception {
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
            accountId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuemissionId = request.getQueryString("missionId");
        Long missionId;
        if (valuemissionId != null) {
            missionId = Long.parseLong(valuemissionId);
        } else {
            missionId = null;
        }
        String valuemissionInviteId = request.getQueryString("missionInviteId");
        Long missionInviteId;
        if (valuemissionInviteId != null) {
            missionInviteId = Long.parseLong(valuemissionInviteId);
        } else {
            missionInviteId = null;
        }
        String valuepackId = request.getQueryString("packId");
        Long packId;
        if (valuepackId != null) {
            packId = Long.parseLong(valuepackId);
        } else {
            packId = null;
        }
        String valuegameLevelId = request.getQueryString("gameLevelId");
        Long gameLevelId;
        if (valuegameLevelId != null) {
            gameLevelId = Long.parseLong(valuegameLevelId);
        } else {
            gameLevelId = null;
        }
        String valuestatus = request.getQueryString("status");
        String status;
        if (valuestatus != null) {
            status = valuestatus;
        } else {
            status = null;
        }
        String valuepermissionableType = request.getQueryString("permissionableType");
        String permissionableType;
        if (valuepermissionableType != null) {
            permissionableType = valuepermissionableType;
        } else {
            permissionableType = null;
        }
        String valuepermissionableId = request.getQueryString("permissionableId");
        Long permissionableId;
        if (valuepermissionableId != null) {
            permissionableId = Long.parseLong(valuepermissionableId);
        } else {
            permissionableId = null;
        }
        String valueincludeGameData = request.getQueryString("includeGameData");
        Boolean includeGameData;
        if (valueincludeGameData != null) {
            includeGameData = Boolean.valueOf(valueincludeGameData);
        } else {
            includeGameData = null;
        }
        return imp.updateMissionInviteHttp(request, version, deviceId, accountId, appKey, missionId, missionInviteId, packId, gameLevelId, status, permissionableType, permissionableId, includeGameData);
    }

}
