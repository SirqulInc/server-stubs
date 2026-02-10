package controllers;

import java.math.BigDecimal;
import apimodels.MissionFormatResponse;
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
public class MissionApiController extends Controller {
    private final MissionApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private MissionApiController(Config configuration, MissionApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createMission(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuetitle = request.getQueryString("title");
        String title;
        if (valuetitle != null) {
            title = valuetitle;
        } else {
            throw new IllegalArgumentException("'title' parameter is required");
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuesubType = request.getQueryString("subType");
        String subType;
        if (valuesubType != null) {
            subType = valuesubType;
        } else {
            subType = null;
        }
        String valuestartDate = request.getQueryString("startDate");
        Long startDate;
        if (valuestartDate != null) {
            startDate = Long.parseLong(valuestartDate);
        } else {
            startDate = null;
        }
        String valueendDate = request.getQueryString("endDate");
        Long endDate;
        if (valueendDate != null) {
            endDate = Long.parseLong(valueendDate);
        } else {
            endDate = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valuegameLevelIds = request.getQueryString("gameLevelIds");
        String gameLevelIds;
        if (valuegameLevelIds != null) {
            gameLevelIds = valuegameLevelIds;
        } else {
            gameLevelIds = null;
        }
        String valuecreativeIds = request.getQueryString("creativeIds");
        String creativeIds;
        if (valuecreativeIds != null) {
            creativeIds = valuecreativeIds;
        } else {
            creativeIds = null;
        }
        String valueaudienceIds = request.getQueryString("audienceIds");
        String audienceIds;
        if (valueaudienceIds != null) {
            audienceIds = valueaudienceIds;
        } else {
            audienceIds = null;
        }
        String valuemissionTask = request.getQueryString("missionTask");
        String missionTask;
        if (valuemissionTask != null) {
            missionTask = valuemissionTask;
        } else {
            missionTask = null;
        }
        String valueformatType = request.getQueryString("formatType");
        String formatType;
        if (valueformatType != null) {
            formatType = valueformatType;
        } else {
            formatType = null;
        }
        String valueofferId = request.getQueryString("offerId");
        Long offerId;
        if (valueofferId != null) {
            offerId = Long.parseLong(valueofferId);
        } else {
            offerId = null;
        }
        String valuebalance = request.getQueryString("balance");
        Double balance;
        if (valuebalance != null) {
            balance = Double.parseDouble(valuebalance);
        } else {
            balance = null;
        }
        String valueadvancedReporting = request.getQueryString("advancedReporting");
        Boolean advancedReporting;
        if (valueadvancedReporting != null) {
            advancedReporting = Boolean.valueOf(valueadvancedReporting);
        } else {
            advancedReporting = null;
        }
        String valueallocateTickets = request.getQueryString("allocateTickets");
        Boolean allocateTickets;
        if (valueallocateTickets != null) {
            allocateTickets = Boolean.valueOf(valueallocateTickets);
        } else {
            allocateTickets = null;
        }
        String valueticketCount = request.getQueryString("ticketCount");
        Long ticketCount;
        if (valueticketCount != null) {
            ticketCount = Long.parseLong(valueticketCount);
        } else {
            ticketCount = null;
        }
        String valueticketType = request.getQueryString("ticketType");
        String ticketType;
        if (valueticketType != null) {
            ticketType = valueticketType;
        } else {
            ticketType = null;
        }
        String valuepoints = request.getQueryString("points");
        Long points;
        if (valuepoints != null) {
            points = Long.parseLong(valuepoints);
        } else {
            points = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        String valueapplicationIds = request.getQueryString("applicationIds");
        String applicationIds;
        if (valueapplicationIds != null) {
            applicationIds = valueapplicationIds;
        } else {
            applicationIds = null;
        }
        String valuedevices = request.getQueryString("devices");
        String devices;
        if (valuedevices != null) {
            devices = valuedevices;
        } else {
            devices = null;
        }
        String valuedeviceIds = request.getQueryString("deviceIds");
        String deviceIds;
        if (valuedeviceIds != null) {
            deviceIds = valuedeviceIds;
        } else {
            deviceIds = null;
        }
        String valuedeviceVersions = request.getQueryString("deviceVersions");
        String deviceVersions;
        if (valuedeviceVersions != null) {
            deviceVersions = valuedeviceVersions;
        } else {
            deviceVersions = null;
        }
        String valuelocations = request.getQueryString("locations");
        String locations;
        if (valuelocations != null) {
            locations = valuelocations;
        } else {
            locations = null;
        }
        String valueradius = request.getQueryString("radius");
        String radius;
        if (valueradius != null) {
            radius = valueradius;
        } else {
            radius = null;
        }
        return imp.createMissionHttp(request, version, accountId, title, description, subType, startDate, endDate, active, gameLevelIds, creativeIds, audienceIds, missionTask, formatType, offerId, balance, advancedReporting, allocateTickets, ticketCount, ticketType, points, metaData, applicationIds, devices, deviceIds, deviceVersions, locations, radius);
    }

    @ApiAction
    public Result deleteMission(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuemissionId = request.getQueryString("missionId");
        Long missionId;
        if (valuemissionId != null) {
            missionId = Long.parseLong(valuemissionId);
        } else {
            throw new IllegalArgumentException("'missionId' parameter is required");
        }
        return imp.deleteMissionHttp(request, version, accountId, missionId);
    }

    @ApiAction
    public Result findMissions(Http.Request request, BigDecimal version) throws Exception {
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuesuffix = request.getQueryString("suffix");
        String suffix;
        if (valuesuffix != null) {
            suffix = valuesuffix;
        } else {
            suffix = null;
        }
        String valuetype = request.getQueryString("type");
        String type;
        if (valuetype != null) {
            type = valuetype;
        } else {
            type = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueappVersion = request.getQueryString("appVersion");
        String appVersion;
        if (valueappVersion != null) {
            appVersion = valueappVersion;
        } else {
            appVersion = null;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        String valuedevice = request.getQueryString("device");
        String device;
        if (valuedevice != null) {
            device = valuedevice;
        } else {
            device = null;
        }
        String valuedeviceIdentifier = request.getQueryString("deviceIdentifier");
        Long deviceIdentifier;
        if (valuedeviceIdentifier != null) {
            deviceIdentifier = Long.parseLong(valuedeviceIdentifier);
        } else {
            deviceIdentifier = null;
        }
        String valuedeviceVersion = request.getQueryString("deviceVersion");
        String deviceVersion;
        if (valuedeviceVersion != null) {
            deviceVersion = valuedeviceVersion;
        } else {
            deviceVersion = null;
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
        String valueincludeGameData = request.getQueryString("includeGameData");
        Boolean includeGameData;
        if (valueincludeGameData != null) {
            includeGameData = Boolean.valueOf(valueincludeGameData);
        } else {
            includeGameData = null;
        }
        String valueincludeAudiences = request.getQueryString("includeAudiences");
        Boolean includeAudiences;
        if (valueincludeAudiences != null) {
            includeAudiences = Boolean.valueOf(valueincludeAudiences);
        } else {
            includeAudiences = null;
        }
        String valueallocatesTickets = request.getQueryString("allocatesTickets");
        Boolean allocatesTickets;
        if (valueallocatesTickets != null) {
            allocatesTickets = Boolean.valueOf(valueallocatesTickets);
        } else {
            allocatesTickets = null;
        }
        String valuerandomize = request.getQueryString("randomize");
        Boolean randomize;
        if (valuerandomize != null) {
            randomize = Boolean.valueOf(valuerandomize);
        } else {
            randomize = null;
        }
        String valuetargetedAdsOnly = request.getQueryString("targetedAdsOnly");
        Boolean targetedAdsOnly;
        if (valuetargetedAdsOnly != null) {
            targetedAdsOnly = Boolean.valueOf(valuetargetedAdsOnly);
        } else {
            targetedAdsOnly = null;
        }
        String valuemissionIds = request.getQueryString("missionIds");
        String missionIds;
        if (valuemissionIds != null) {
            missionIds = valuemissionIds;
        } else {
            missionIds = null;
        }
        String valueaudienceOperator = request.getQueryString("audienceOperator");
        String audienceOperator;
        if (valueaudienceOperator != null) {
            audienceOperator = valueaudienceOperator;
        } else {
            audienceOperator = null;
        }
        return imp.findMissionsHttp(request, version, appKey, suffix, type, accountId, appVersion, latitude, longitude, device, deviceIdentifier, deviceVersion, start, limit, includeGameData, includeAudiences, allocatesTickets, randomize, targetedAdsOnly, missionIds, audienceOperator);
    }

    @ApiAction
    public Result getMission(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuemissionId = request.getQueryString("missionId");
        Long missionId;
        if (valuemissionId != null) {
            missionId = Long.parseLong(valuemissionId);
        } else {
            throw new IllegalArgumentException("'missionId' parameter is required");
        }
        String valuereturnCreative = request.getQueryString("returnCreative");
        Boolean returnCreative;
        if (valuereturnCreative != null) {
            returnCreative = Boolean.valueOf(valuereturnCreative);
        } else {
            returnCreative = null;
        }
        return imp.getMissionHttp(request, version, accountId, missionId, returnCreative);
    }

    @ApiAction
    public Result importMission(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            throw new IllegalArgumentException("'latitude' parameter is required");
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            throw new IllegalArgumentException("'longitude' parameter is required");
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
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
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valueadSize = request.getQueryString("adSize");
        String adSize;
        if (valueadSize != null) {
            adSize = valueadSize;
        } else {
            adSize = null;
        }
        return imp.importMissionHttp(request, version, accountId, latitude, longitude, appKey, keyword, start, limit, adSize);
    }

    @ApiAction
    public Result searchMissionFormats(Http.Request request, BigDecimal version) throws Exception {
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            throw new IllegalArgumentException("'start' parameter is required");
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            throw new IllegalArgumentException("'limit' parameter is required");
        }
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            throw new IllegalArgumentException("'activeOnly' parameter is required");
        }
        return imp.searchMissionFormatsHttp(request, version, start, limit, activeOnly);
    }

    @ApiAction
    public Result searchMissions(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valuesubType = request.getQueryString("subType");
        String subType;
        if (valuesubType != null) {
            subType = valuesubType;
        } else {
            subType = null;
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
        String valueincludeGameData = request.getQueryString("includeGameData");
        Boolean includeGameData;
        if (valueincludeGameData != null) {
            includeGameData = Boolean.valueOf(valueincludeGameData);
        } else {
            includeGameData = null;
        }
        String valueincludeAudiences = request.getQueryString("includeAudiences");
        Boolean includeAudiences;
        if (valueincludeAudiences != null) {
            includeAudiences = Boolean.valueOf(valueincludeAudiences);
        } else {
            includeAudiences = null;
        }
        String valueincludeInactive = request.getQueryString("includeInactive");
        Boolean includeInactive;
        if (valueincludeInactive != null) {
            includeInactive = Boolean.valueOf(valueincludeInactive);
        } else {
            includeInactive = null;
        }
        String valuesuffix = request.getQueryString("suffix");
        String suffix;
        if (valuesuffix != null) {
            suffix = valuesuffix;
        } else {
            suffix = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = null;
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = null;
        }
        return imp.searchMissionsHttp(request, version, accountId, keyword, subType, start, limit, includeGameData, includeAudiences, includeInactive, suffix, sortField, descending);
    }

    @ApiAction
    public Result searchMissionsByBillableEntity(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
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
        String valueincludeGameData = request.getQueryString("includeGameData");
        Boolean includeGameData;
        if (valueincludeGameData != null) {
            includeGameData = Boolean.valueOf(valueincludeGameData);
        } else {
            includeGameData = null;
        }
        String valueincludeAudiences = request.getQueryString("includeAudiences");
        Boolean includeAudiences;
        if (valueincludeAudiences != null) {
            includeAudiences = Boolean.valueOf(valueincludeAudiences);
        } else {
            includeAudiences = null;
        }
        String valueincludeInactive = request.getQueryString("includeInactive");
        Boolean includeInactive;
        if (valueincludeInactive != null) {
            includeInactive = Boolean.valueOf(valueincludeInactive);
        } else {
            includeInactive = null;
        }
        String valuesuffix = request.getQueryString("suffix");
        String suffix;
        if (valuesuffix != null) {
            suffix = valuesuffix;
        } else {
            suffix = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = null;
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = null;
        }
        return imp.searchMissionsByBillableEntityHttp(request, version, accountId, keyword, start, limit, includeGameData, includeAudiences, includeInactive, suffix, sortField, descending);
    }

    @ApiAction
    public Result updateMission(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuemissionId = request.getQueryString("missionId");
        Long missionId;
        if (valuemissionId != null) {
            missionId = Long.parseLong(valuemissionId);
        } else {
            throw new IllegalArgumentException("'missionId' parameter is required");
        }
        String valuetitle = request.getQueryString("title");
        String title;
        if (valuetitle != null) {
            title = valuetitle;
        } else {
            title = null;
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuesubType = request.getQueryString("subType");
        String subType;
        if (valuesubType != null) {
            subType = valuesubType;
        } else {
            subType = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        String valuestartDate = request.getQueryString("startDate");
        Long startDate;
        if (valuestartDate != null) {
            startDate = Long.parseLong(valuestartDate);
        } else {
            startDate = null;
        }
        String valueendDate = request.getQueryString("endDate");
        Long endDate;
        if (valueendDate != null) {
            endDate = Long.parseLong(valueendDate);
        } else {
            endDate = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valuegameLevelIds = request.getQueryString("gameLevelIds");
        String gameLevelIds;
        if (valuegameLevelIds != null) {
            gameLevelIds = valuegameLevelIds;
        } else {
            gameLevelIds = null;
        }
        String valuecreativeIds = request.getQueryString("creativeIds");
        String creativeIds;
        if (valuecreativeIds != null) {
            creativeIds = valuecreativeIds;
        } else {
            creativeIds = null;
        }
        String valueaudienceIds = request.getQueryString("audienceIds");
        String audienceIds;
        if (valueaudienceIds != null) {
            audienceIds = valueaudienceIds;
        } else {
            audienceIds = null;
        }
        String valueofferId = request.getQueryString("offerId");
        Long offerId;
        if (valueofferId != null) {
            offerId = Long.parseLong(valueofferId);
        } else {
            offerId = null;
        }
        String valuebalance = request.getQueryString("balance");
        Double balance;
        if (valuebalance != null) {
            balance = Double.parseDouble(valuebalance);
        } else {
            balance = null;
        }
        String valueadvancedReporting = request.getQueryString("advancedReporting");
        Boolean advancedReporting;
        if (valueadvancedReporting != null) {
            advancedReporting = Boolean.valueOf(valueadvancedReporting);
        } else {
            advancedReporting = null;
        }
        String valueallocateTickets = request.getQueryString("allocateTickets");
        Boolean allocateTickets;
        if (valueallocateTickets != null) {
            allocateTickets = Boolean.valueOf(valueallocateTickets);
        } else {
            allocateTickets = null;
        }
        String valueticketCount = request.getQueryString("ticketCount");
        Long ticketCount;
        if (valueticketCount != null) {
            ticketCount = Long.parseLong(valueticketCount);
        } else {
            ticketCount = null;
        }
        String valueticketType = request.getQueryString("ticketType");
        String ticketType;
        if (valueticketType != null) {
            ticketType = valueticketType;
        } else {
            ticketType = null;
        }
        String valuepoints = request.getQueryString("points");
        Long points;
        if (valuepoints != null) {
            points = Long.parseLong(valuepoints);
        } else {
            points = null;
        }
        String valueapplicationIds = request.getQueryString("applicationIds");
        String applicationIds;
        if (valueapplicationIds != null) {
            applicationIds = valueapplicationIds;
        } else {
            applicationIds = null;
        }
        String valuedevices = request.getQueryString("devices");
        String devices;
        if (valuedevices != null) {
            devices = valuedevices;
        } else {
            devices = null;
        }
        String valuedeviceIds = request.getQueryString("deviceIds");
        String deviceIds;
        if (valuedeviceIds != null) {
            deviceIds = valuedeviceIds;
        } else {
            deviceIds = null;
        }
        String valuedeviceVersions = request.getQueryString("deviceVersions");
        String deviceVersions;
        if (valuedeviceVersions != null) {
            deviceVersions = valuedeviceVersions;
        } else {
            deviceVersions = null;
        }
        String valuelocations = request.getQueryString("locations");
        String locations;
        if (valuelocations != null) {
            locations = valuelocations;
        } else {
            locations = null;
        }
        String valueradius = request.getQueryString("radius");
        String radius;
        if (valueradius != null) {
            radius = valueradius;
        } else {
            radius = null;
        }
        return imp.updateMissionHttp(request, version, accountId, missionId, title, description, subType, metaData, startDate, endDate, active, gameLevelIds, creativeIds, audienceIds, offerId, balance, advancedReporting, allocateTickets, ticketCount, ticketType, points, applicationIds, devices, deviceIds, deviceVersions, locations, radius);
    }

}
