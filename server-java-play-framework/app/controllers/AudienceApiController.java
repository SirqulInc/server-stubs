package controllers;

import apimodels.AgeGroupResponse;
import apimodels.AudienceDeviceResponse;
import apimodels.AudienceResponse;
import java.math.BigDecimal;
import apimodels.OfferListResponse;
import apimodels.SearchResponse;
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
public class AudienceApiController extends Controller {
    private final AudienceApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private AudienceApiController(Config configuration, AudienceApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createAudience(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            throw new IllegalArgumentException("'name' parameter is required");
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuesearchTags = request.getQueryString("searchTags");
        String searchTags;
        if (valuesearchTags != null) {
            searchTags = valuesearchTags;
        } else {
            searchTags = null;
        }
        String valuegender = request.getQueryString("gender");
        String gender;
        if (valuegender != null) {
            gender = valuegender;
        } else {
            gender = null;
        }
        String valueageGroups = request.getQueryString("ageGroups");
        String ageGroups;
        if (valueageGroups != null) {
            ageGroups = valueageGroups;
        } else {
            ageGroups = null;
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valueapplicationIds = request.getQueryString("applicationIds");
        String applicationIds;
        if (valueapplicationIds != null) {
            applicationIds = valueapplicationIds;
        } else {
            applicationIds = null;
        }
        String valuegameExperienceLevel = request.getQueryString("gameExperienceLevel");
        String gameExperienceLevel;
        if (valuegameExperienceLevel != null) {
            gameExperienceLevel = valuegameExperienceLevel;
        } else {
            gameExperienceLevel = null;
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
        String valuestartTimeOffset = request.getQueryString("startTimeOffset");
        Integer startTimeOffset;
        if (valuestartTimeOffset != null) {
            startTimeOffset = Integer.parseInt(valuestartTimeOffset);
        } else {
            startTimeOffset = null;
        }
        String valueendTimeOffset = request.getQueryString("endTimeOffset");
        Integer endTimeOffset;
        if (valueendTimeOffset != null) {
            endTimeOffset = Integer.parseInt(valueendTimeOffset);
        } else {
            endTimeOffset = null;
        }
        String valuesendSuggestion = request.getQueryString("sendSuggestion");
        Boolean sendSuggestion;
        if (valuesendSuggestion != null) {
            sendSuggestion = Boolean.valueOf(valuesendSuggestion);
        } else {
            sendSuggestion = true;
        }
        String valueassociateDescription = request.getQueryString("associateDescription");
        String associateDescription;
        if (valueassociateDescription != null) {
            associateDescription = valueassociateDescription;
        } else {
            associateDescription = null;
        }
        String valueassociateType = request.getQueryString("associateType");
        String associateType;
        if (valueassociateType != null) {
            associateType = valueassociateType;
        } else {
            associateType = null;
        }
        String valueassociateId = request.getQueryString("associateId");
        Long associateId;
        if (valueassociateId != null) {
            associateId = Long.parseLong(valueassociateId);
        } else {
            associateId = null;
        }
        String valuegroupingId = request.getQueryString("groupingId");
        String groupingId;
        if (valuegroupingId != null) {
            groupingId = valuegroupingId;
        } else {
            groupingId = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        String valuevisibility = request.getQueryString("visibility");
        String visibility;
        if (valuevisibility != null) {
            visibility = valuevisibility;
        } else {
            visibility = null;
        }
        String valueaudienceType = request.getQueryString("audienceType");
        String audienceType;
        if (valueaudienceType != null) {
            audienceType = valueaudienceType;
        } else {
            audienceType = null;
        }
        String valueuseOrder = request.getQueryString("useOrder");
        Boolean useOrder;
        if (valueuseOrder != null) {
            useOrder = Boolean.valueOf(valueuseOrder);
        } else {
            useOrder = null;
        }
        String valuecohortRegionsData = request.getQueryString("cohortRegionsData");
        String cohortRegionsData;
        if (valuecohortRegionsData != null) {
            cohortRegionsData = valuecohortRegionsData;
        } else {
            cohortRegionsData = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuetrilaterationTypes = request.getQueryString("trilaterationTypes");
        String trilaterationTypes;
        if (valuetrilaterationTypes != null) {
            trilaterationTypes = valuetrilaterationTypes;
        } else {
            trilaterationTypes = null;
        }
        String valueuniqueName = request.getQueryString("uniqueName");
        Boolean uniqueName;
        if (valueuniqueName != null) {
            uniqueName = Boolean.valueOf(valueuniqueName);
        } else {
            uniqueName = null;
        }
        return imp.createAudienceHttp(request, version, accountId, name, description, searchTags, gender, ageGroups, categoryIds, applicationIds, gameExperienceLevel, devices, deviceIds, deviceVersions, locations, radius, startTimeOffset, endTimeOffset, sendSuggestion, associateDescription, associateType, associateId, groupingId, metaData, visibility, audienceType, useOrder, cohortRegionsData, appKey, trilaterationTypes, uniqueName);
    }

    @ApiAction
    public Result deleteAudience(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueaudienceId = request.getQueryString("audienceId");
        Long audienceId;
        if (valueaudienceId != null) {
            audienceId = Long.parseLong(valueaudienceId);
        } else {
            throw new IllegalArgumentException("'audienceId' parameter is required");
        }
        return imp.deleteAudienceHttp(request, version, accountId, audienceId);
    }

    @ApiAction
    public Result getAgeGroups(Http.Request request, BigDecimal version) throws Exception {
        return imp.getAgeGroupsHttp(request, version);
    }

    @ApiAction
    public Result getAudience(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueaudienceId = request.getQueryString("audienceId");
        Long audienceId;
        if (valueaudienceId != null) {
            audienceId = Long.parseLong(valueaudienceId);
        } else {
            throw new IllegalArgumentException("'audienceId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuereturnAccountCount = request.getQueryString("returnAccountCount");
        Boolean returnAccountCount;
        if (valuereturnAccountCount != null) {
            returnAccountCount = Boolean.valueOf(valuereturnAccountCount);
        } else {
            returnAccountCount = false;
        }
        String valuereturnAlbumCount = request.getQueryString("returnAlbumCount");
        Boolean returnAlbumCount;
        if (valuereturnAlbumCount != null) {
            returnAlbumCount = Boolean.valueOf(valuereturnAlbumCount);
        } else {
            returnAlbumCount = false;
        }
        String valuealbumTypesForCount = request.getQueryString("albumTypesForCount");
        String albumTypesForCount;
        if (valuealbumTypesForCount != null) {
            albumTypesForCount = valuealbumTypesForCount;
        } else {
            albumTypesForCount = null;
        }
        return imp.getAudienceHttp(request, version, accountId, audienceId, appKey, returnAccountCount, returnAlbumCount, albumTypesForCount);
    }

    @ApiAction
    public Result getAudienceList(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuealbumIds = request.getQueryString("albumIds");
        String albumIds;
        if (valuealbumIds != null) {
            albumIds = valuealbumIds;
        } else {
            albumIds = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valuekeywordFields = request.getQueryString("keywordFields");
        String keywordFields;
        if (valuekeywordFields != null) {
            keywordFields = valuekeywordFields;
        } else {
            keywordFields = "SEARCH_TAGS,NAME,DESCRIPTION";
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = "NAME";
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = false;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = 0;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        String valuesendSuggestion = request.getQueryString("sendSuggestion");
        Boolean sendSuggestion;
        if (valuesendSuggestion != null) {
            sendSuggestion = Boolean.valueOf(valuesendSuggestion);
        } else {
            sendSuggestion = null;
        }
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            activeOnly = null;
        }
        String valuegroupByGroupingId = request.getQueryString("groupByGroupingId");
        Boolean groupByGroupingId;
        if (valuegroupByGroupingId != null) {
            groupByGroupingId = Boolean.valueOf(valuegroupByGroupingId);
        } else {
            groupByGroupingId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuereturnGlobal = request.getQueryString("returnGlobal");
        Boolean returnGlobal;
        if (valuereturnGlobal != null) {
            returnGlobal = Boolean.valueOf(valuereturnGlobal);
        } else {
            returnGlobal = null;
        }
        String valueexactKeyword = request.getQueryString("exactKeyword");
        Boolean exactKeyword;
        if (valueexactKeyword != null) {
            exactKeyword = Boolean.valueOf(valueexactKeyword);
        } else {
            exactKeyword = null;
        }
        String valueaudienceType = request.getQueryString("audienceType");
        String audienceType;
        if (valueaudienceType != null) {
            audienceType = valueaudienceType;
        } else {
            audienceType = null;
        }
        String valueaudienceTypes = request.getQueryString("audienceTypes");
        String audienceTypes;
        if (valueaudienceTypes != null) {
            audienceTypes = valueaudienceTypes;
        } else {
            audienceTypes = null;
        }
        String valuereturnAccountCount = request.getQueryString("returnAccountCount");
        Boolean returnAccountCount;
        if (valuereturnAccountCount != null) {
            returnAccountCount = Boolean.valueOf(valuereturnAccountCount);
        } else {
            returnAccountCount = false;
        }
        String valuereturnAlbumCount = request.getQueryString("returnAlbumCount");
        Boolean returnAlbumCount;
        if (valuereturnAlbumCount != null) {
            returnAlbumCount = Boolean.valueOf(valuereturnAlbumCount);
        } else {
            returnAlbumCount = false;
        }
        String valuealbumTypesForCount = request.getQueryString("albumTypesForCount");
        String albumTypesForCount;
        if (valuealbumTypesForCount != null) {
            albumTypesForCount = valuealbumTypesForCount;
        } else {
            albumTypesForCount = null;
        }
        return imp.getAudienceListHttp(request, version, accountId, albumIds, keyword, keywordFields, sortField, descending, start, limit, sendSuggestion, activeOnly, groupByGroupingId, appKey, returnGlobal, exactKeyword, audienceType, audienceTypes, returnAccountCount, returnAlbumCount, albumTypesForCount);
    }

    @ApiAction
    public Result getDevices(Http.Request request, BigDecimal version) throws Exception {
        String valueincludeInactive = request.getQueryString("includeInactive");
        Boolean includeInactive;
        if (valueincludeInactive != null) {
            includeInactive = Boolean.valueOf(valueincludeInactive);
        } else {
            throw new IllegalArgumentException("'includeInactive' parameter is required");
        }
        return imp.getDevicesHttp(request, version, includeInactive);
    }

    @ApiAction
    public Result getExperiences(Http.Request request, BigDecimal version) throws Exception {
        return imp.getExperiencesHttp(request, version);
    }

    @ApiAction
    public Result getGroupedAudiences(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueaudienceGroupingId = request.getQueryString("audienceGroupingId");
        String audienceGroupingId;
        if (valueaudienceGroupingId != null) {
            audienceGroupingId = valueaudienceGroupingId;
        } else {
            throw new IllegalArgumentException("'audienceGroupingId' parameter is required");
        }
        return imp.getGroupedAudiencesHttp(request, version, accountId, audienceGroupingId);
    }

    @ApiAction
    public Result listByAccount(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            throw new IllegalArgumentException("'limit' parameter is required");
        }
        String valuesuggestionType = request.getQueryString("suggestionType");
        String suggestionType;
        if (valuesuggestionType != null) {
            suggestionType = valuesuggestionType;
        } else {
            throw new IllegalArgumentException("'suggestionType' parameter is required");
        }
        return imp.listByAccountHttp(request, version, accountId, limit, suggestionType);
    }

    @ApiAction
    public Result listByAudience(Http.Request request, BigDecimal version) throws Exception {
        String valuegender = request.getQueryString("gender");
        String gender;
        if (valuegender != null) {
            gender = valuegender;
        } else {
            gender = null;
        }
        String valueage = request.getQueryString("age");
        Integer age;
        if (valueage != null) {
            age = Integer.parseInt(valueage);
        } else {
            age = null;
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
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
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            throw new IllegalArgumentException("'limit' parameter is required");
        }
        return imp.listByAudienceHttp(request, version, limit, gender, age, categoryIds, latitude, longitude);
    }

    @ApiAction
    public Result listLastestByAccount(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuetimeframe = request.getQueryString("timeframe");
        Integer timeframe;
        if (valuetimeframe != null) {
            timeframe = Integer.parseInt(valuetimeframe);
        } else {
            throw new IllegalArgumentException("'timeframe' parameter is required");
        }
        String valuesuggestionType = request.getQueryString("suggestionType");
        String suggestionType;
        if (valuesuggestionType != null) {
            suggestionType = valuesuggestionType;
        } else {
            throw new IllegalArgumentException("'suggestionType' parameter is required");
        }
        return imp.listLastestByAccountHttp(request, version, accountId, timeframe, suggestionType);
    }

    @ApiAction
    public Result sendByAccount(Http.Request request, BigDecimal version) throws Exception {
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
        return imp.sendByAccountHttp(request, version, accountId, latitude, longitude);
    }

    @ApiAction
    public Result updateAudience(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueaudienceId = request.getQueryString("audienceId");
        Long audienceId;
        if (valueaudienceId != null) {
            audienceId = Long.parseLong(valueaudienceId);
        } else {
            throw new IllegalArgumentException("'audienceId' parameter is required");
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            name = null;
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuesearchTags = request.getQueryString("searchTags");
        String searchTags;
        if (valuesearchTags != null) {
            searchTags = valuesearchTags;
        } else {
            searchTags = null;
        }
        String valuegender = request.getQueryString("gender");
        String gender;
        if (valuegender != null) {
            gender = valuegender;
        } else {
            gender = null;
        }
        String valueageGroups = request.getQueryString("ageGroups");
        String ageGroups;
        if (valueageGroups != null) {
            ageGroups = valueageGroups;
        } else {
            ageGroups = null;
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valueapplicationIds = request.getQueryString("applicationIds");
        String applicationIds;
        if (valueapplicationIds != null) {
            applicationIds = valueapplicationIds;
        } else {
            applicationIds = null;
        }
        String valuegameExperienceLevel = request.getQueryString("gameExperienceLevel");
        String gameExperienceLevel;
        if (valuegameExperienceLevel != null) {
            gameExperienceLevel = valuegameExperienceLevel;
        } else {
            gameExperienceLevel = null;
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
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valuesendSuggestion = request.getQueryString("sendSuggestion");
        Boolean sendSuggestion;
        if (valuesendSuggestion != null) {
            sendSuggestion = Boolean.valueOf(valuesendSuggestion);
        } else {
            sendSuggestion = null;
        }
        String valuestartTimeOffset = request.getQueryString("startTimeOffset");
        Integer startTimeOffset;
        if (valuestartTimeOffset != null) {
            startTimeOffset = Integer.parseInt(valuestartTimeOffset);
        } else {
            startTimeOffset = null;
        }
        String valueendTimeOffset = request.getQueryString("endTimeOffset");
        Integer endTimeOffset;
        if (valueendTimeOffset != null) {
            endTimeOffset = Integer.parseInt(valueendTimeOffset);
        } else {
            endTimeOffset = null;
        }
        String valueassociateDescription = request.getQueryString("associateDescription");
        String associateDescription;
        if (valueassociateDescription != null) {
            associateDescription = valueassociateDescription;
        } else {
            associateDescription = null;
        }
        String valueassociateType = request.getQueryString("associateType");
        String associateType;
        if (valueassociateType != null) {
            associateType = valueassociateType;
        } else {
            associateType = null;
        }
        String valueassociateId = request.getQueryString("associateId");
        Long associateId;
        if (valueassociateId != null) {
            associateId = Long.parseLong(valueassociateId);
        } else {
            associateId = null;
        }
        String valuegroupingId = request.getQueryString("groupingId");
        String groupingId;
        if (valuegroupingId != null) {
            groupingId = valuegroupingId;
        } else {
            groupingId = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        String valuevisibility = request.getQueryString("visibility");
        String visibility;
        if (valuevisibility != null) {
            visibility = valuevisibility;
        } else {
            visibility = null;
        }
        String valueaudienceType = request.getQueryString("audienceType");
        String audienceType;
        if (valueaudienceType != null) {
            audienceType = valueaudienceType;
        } else {
            audienceType = null;
        }
        String valueuseOrder = request.getQueryString("useOrder");
        Boolean useOrder;
        if (valueuseOrder != null) {
            useOrder = Boolean.valueOf(valueuseOrder);
        } else {
            useOrder = null;
        }
        String valuecohortRegionsData = request.getQueryString("cohortRegionsData");
        String cohortRegionsData;
        if (valuecohortRegionsData != null) {
            cohortRegionsData = valuecohortRegionsData;
        } else {
            cohortRegionsData = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuetrilaterationTypes = request.getQueryString("trilaterationTypes");
        String trilaterationTypes;
        if (valuetrilaterationTypes != null) {
            trilaterationTypes = valuetrilaterationTypes;
        } else {
            trilaterationTypes = null;
        }
        String valueuniqueName = request.getQueryString("uniqueName");
        Boolean uniqueName;
        if (valueuniqueName != null) {
            uniqueName = Boolean.valueOf(valueuniqueName);
        } else {
            uniqueName = null;
        }
        return imp.updateAudienceHttp(request, version, accountId, audienceId, name, description, searchTags, gender, ageGroups, categoryIds, applicationIds, gameExperienceLevel, devices, deviceIds, deviceVersions, locations, radius, active, sendSuggestion, startTimeOffset, endTimeOffset, associateDescription, associateType, associateId, groupingId, metaData, visibility, audienceType, useOrder, cohortRegionsData, appKey, trilaterationTypes, uniqueName);
    }

}
