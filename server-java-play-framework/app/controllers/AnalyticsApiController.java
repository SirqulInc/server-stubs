package controllers;

import java.math.BigDecimal;
import apimodels.ChartData;
import apimodels.SirqulResponse;
import apimodels.UserActivityResponse;

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
public class AnalyticsApiController extends Controller {
    private final AnalyticsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private AnalyticsApiController(Config configuration, AnalyticsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result activities(Http.Request request, BigDecimal version) throws Exception {
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
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        return imp.activitiesHttp(request, version, start, limit, accountId);
    }

    @ApiAction
    public Result aggregatedFilteredUsage(Http.Request request, BigDecimal version) throws Exception {
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
        String valueapplicationId = request.getQueryString("applicationId");
        Long applicationId;
        if (valueapplicationId != null) {
            applicationId = Long.parseLong(valueapplicationId);
        } else {
            applicationId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
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
        String valuedeviceType = request.getQueryString("deviceType");
        String deviceType;
        if (valuedeviceType != null) {
            deviceType = valuedeviceType;
        } else {
            deviceType = null;
        }
        String valuedevice = request.getQueryString("device");
        String device;
        if (valuedevice != null) {
            device = valuedevice;
        } else {
            device = null;
        }
        String valuedeviceOS = request.getQueryString("deviceOS");
        String deviceOS;
        if (valuedeviceOS != null) {
            deviceOS = valuedeviceOS;
        } else {
            deviceOS = null;
        }
        String valuegender = request.getQueryString("gender");
        String gender;
        if (valuegender != null) {
            gender = valuegender;
        } else {
            gender = null;
        }
        String valueageGroup = request.getQueryString("ageGroup");
        String ageGroup;
        if (valueageGroup != null) {
            ageGroup = valueageGroup;
        } else {
            ageGroup = null;
        }
        String valuecountry = request.getQueryString("country");
        String country;
        if (valuecountry != null) {
            country = valuecountry;
        } else {
            country = null;
        }
        String valuestate = request.getQueryString("state");
        String state;
        if (valuestate != null) {
            state = valuestate;
        } else {
            state = null;
        }
        String valuecity = request.getQueryString("city");
        String city;
        if (valuecity != null) {
            city = valuecity;
        } else {
            city = null;
        }
        String valuezip = request.getQueryString("zip");
        String zip;
        if (valuezip != null) {
            zip = valuezip;
        } else {
            zip = null;
        }
        String valuemodel = request.getQueryString("model");
        String model;
        if (valuemodel != null) {
            model = valuemodel;
        } else {
            model = null;
        }
        String valuetag = request.getQueryString("tag");
        String tag;
        if (valuetag != null) {
            tag = valuetag;
        } else {
            tag = null;
        }
        String valueuserAccountId = request.getQueryString("userAccountId");
        Long userAccountId;
        if (valueuserAccountId != null) {
            userAccountId = Long.parseLong(valueuserAccountId);
        } else {
            userAccountId = null;
        }
        String valueuserAccountDisplay = request.getQueryString("userAccountDisplay");
        String userAccountDisplay;
        if (valueuserAccountDisplay != null) {
            userAccountDisplay = valueuserAccountDisplay;
        } else {
            userAccountDisplay = null;
        }
        String valueuserAccountUsername = request.getQueryString("userAccountUsername");
        String userAccountUsername;
        if (valueuserAccountUsername != null) {
            userAccountUsername = valueuserAccountUsername;
        } else {
            userAccountUsername = null;
        }
        String valuegroupByRoot = request.getQueryString("groupByRoot");
        String groupByRoot;
        if (valuegroupByRoot != null) {
            groupByRoot = valuegroupByRoot;
        } else {
            groupByRoot = null;
        }
        String valuegroupBy = request.getQueryString("groupBy");
        String groupBy;
        if (valuegroupBy != null) {
            groupBy = valuegroupBy;
        } else {
            groupBy = null;
        }
        String valuedistinctCount = request.getQueryString("distinctCount");
        String distinctCount;
        if (valuedistinctCount != null) {
            distinctCount = valuedistinctCount;
        } else {
            distinctCount = null;
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
        String valuehideUnknown = request.getQueryString("hideUnknown");
        Boolean hideUnknown;
        if (valuehideUnknown != null) {
            hideUnknown = Boolean.valueOf(valuehideUnknown);
        } else {
            hideUnknown = null;
        }
        String valueresponseFormat = request.getQueryString("responseFormat");
        String responseFormat;
        if (valueresponseFormat != null) {
            responseFormat = valueresponseFormat;
        } else {
            responseFormat = null;
        }
        String valuel = request.getQueryString("_l");
        Integer l;
        if (valuel != null) {
            l = Integer.parseInt(valuel);
        } else {
            l = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
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
        return imp.aggregatedFilteredUsageHttp(request, version, deviceId, accountId, applicationId, appKey, startDate, endDate, deviceType, device, deviceOS, gender, ageGroup, country, state, city, zip, model, tag, userAccountId, userAccountDisplay, userAccountUsername, groupByRoot, groupBy, distinctCount, sortField, descending, hideUnknown, responseFormat, l, limit, latitude, longitude);
    }

    @ApiAction
    public Result filteredUsage(Http.Request request, BigDecimal version) throws Exception {
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
        String valueapplicationId = request.getQueryString("applicationId");
        Long applicationId;
        if (valueapplicationId != null) {
            applicationId = Long.parseLong(valueapplicationId);
        } else {
            applicationId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
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
        String valuedeviceType = request.getQueryString("deviceType");
        String deviceType;
        if (valuedeviceType != null) {
            deviceType = valuedeviceType;
        } else {
            deviceType = null;
        }
        String valuedevice = request.getQueryString("device");
        String device;
        if (valuedevice != null) {
            device = valuedevice;
        } else {
            device = null;
        }
        String valuedeviceOS = request.getQueryString("deviceOS");
        String deviceOS;
        if (valuedeviceOS != null) {
            deviceOS = valuedeviceOS;
        } else {
            deviceOS = null;
        }
        String valuegender = request.getQueryString("gender");
        String gender;
        if (valuegender != null) {
            gender = valuegender;
        } else {
            gender = null;
        }
        String valueageGroup = request.getQueryString("ageGroup");
        String ageGroup;
        if (valueageGroup != null) {
            ageGroup = valueageGroup;
        } else {
            ageGroup = null;
        }
        String valuecountry = request.getQueryString("country");
        String country;
        if (valuecountry != null) {
            country = valuecountry;
        } else {
            country = null;
        }
        String valuestate = request.getQueryString("state");
        String state;
        if (valuestate != null) {
            state = valuestate;
        } else {
            state = null;
        }
        String valuecity = request.getQueryString("city");
        String city;
        if (valuecity != null) {
            city = valuecity;
        } else {
            city = null;
        }
        String valuezip = request.getQueryString("zip");
        String zip;
        if (valuezip != null) {
            zip = valuezip;
        } else {
            zip = null;
        }
        String valuemodel = request.getQueryString("model");
        String model;
        if (valuemodel != null) {
            model = valuemodel;
        } else {
            model = null;
        }
        String valuetag = request.getQueryString("tag");
        String tag;
        if (valuetag != null) {
            tag = valuetag;
        } else {
            tag = null;
        }
        String valueuserAccountId = request.getQueryString("userAccountId");
        Long userAccountId;
        if (valueuserAccountId != null) {
            userAccountId = Long.parseLong(valueuserAccountId);
        } else {
            userAccountId = null;
        }
        String valueuserAccountDisplay = request.getQueryString("userAccountDisplay");
        String userAccountDisplay;
        if (valueuserAccountDisplay != null) {
            userAccountDisplay = valueuserAccountDisplay;
        } else {
            userAccountDisplay = null;
        }
        String valueuserAccountUsername = request.getQueryString("userAccountUsername");
        String userAccountUsername;
        if (valueuserAccountUsername != null) {
            userAccountUsername = valueuserAccountUsername;
        } else {
            userAccountUsername = null;
        }
        String valuecustomId = request.getQueryString("customId");
        Long customId;
        if (valuecustomId != null) {
            customId = Long.parseLong(valuecustomId);
        } else {
            customId = null;
        }
        String valuecustomType = request.getQueryString("customType");
        String customType;
        if (valuecustomType != null) {
            customType = valuecustomType;
        } else {
            customType = null;
        }
        String valuecustomValue = request.getQueryString("customValue");
        Double customValue;
        if (valuecustomValue != null) {
            customValue = Double.parseDouble(valuecustomValue);
        } else {
            customValue = null;
        }
        String valuecustomValue2 = request.getQueryString("customValue2");
        Double customValue2;
        if (valuecustomValue2 != null) {
            customValue2 = Double.parseDouble(valuecustomValue2);
        } else {
            customValue2 = null;
        }
        String valuecustomLong = request.getQueryString("customLong");
        Long customLong;
        if (valuecustomLong != null) {
            customLong = Long.parseLong(valuecustomLong);
        } else {
            customLong = null;
        }
        String valuecustomLong2 = request.getQueryString("customLong2");
        Long customLong2;
        if (valuecustomLong2 != null) {
            customLong2 = Long.parseLong(valuecustomLong2);
        } else {
            customLong2 = null;
        }
        String valuecustomMessage = request.getQueryString("customMessage");
        String customMessage;
        if (valuecustomMessage != null) {
            customMessage = valuecustomMessage;
        } else {
            customMessage = null;
        }
        String valuecustomMessage2 = request.getQueryString("customMessage2");
        String customMessage2;
        if (valuecustomMessage2 != null) {
            customMessage2 = valuecustomMessage2;
        } else {
            customMessage2 = null;
        }
        String valuegroupBy = request.getQueryString("groupBy");
        String groupBy;
        if (valuegroupBy != null) {
            groupBy = valuegroupBy;
        } else {
            groupBy = null;
        }
        String valuedistinctCount = request.getQueryString("distinctCount");
        String distinctCount;
        if (valuedistinctCount != null) {
            distinctCount = valuedistinctCount;
        } else {
            distinctCount = null;
        }
        String valuesumColumn = request.getQueryString("sumColumn");
        String sumColumn;
        if (valuesumColumn != null) {
            sumColumn = valuesumColumn;
        } else {
            sumColumn = null;
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
        String valuehideUnknown = request.getQueryString("hideUnknown");
        Boolean hideUnknown;
        if (valuehideUnknown != null) {
            hideUnknown = Boolean.valueOf(valuehideUnknown);
        } else {
            hideUnknown = null;
        }
        String valueresponseFormat = request.getQueryString("responseFormat");
        String responseFormat;
        if (valueresponseFormat != null) {
            responseFormat = valueresponseFormat;
        } else {
            responseFormat = null;
        }
        String valuel = request.getQueryString("_l");
        Integer l;
        if (valuel != null) {
            l = Integer.parseInt(valuel);
        } else {
            l = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
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
        return imp.filteredUsageHttp(request, version, deviceId, accountId, applicationId, appKey, startDate, endDate, deviceType, device, deviceOS, gender, ageGroup, country, state, city, zip, model, tag, userAccountId, userAccountDisplay, userAccountUsername, customId, customType, customValue, customValue2, customLong, customLong2, customMessage, customMessage2, groupBy, distinctCount, sumColumn, sortField, descending, hideUnknown, responseFormat, l, limit, latitude, longitude);
    }

    @ApiAction
    public Result usage(Http.Request request, BigDecimal version) throws Exception {
        String valuetag = request.getQueryString("tag");
        String tag;
        if (valuetag != null) {
            tag = valuetag;
        } else {
            throw new IllegalArgumentException("'tag' parameter is required");
        }
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
        String valueapplicationId = request.getQueryString("applicationId");
        Long applicationId;
        if (valueapplicationId != null) {
            applicationId = Long.parseLong(valueapplicationId);
        } else {
            applicationId = null;
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
        String valuedevice = request.getQueryString("device");
        String device;
        if (valuedevice != null) {
            device = valuedevice;
        } else {
            device = null;
        }
        String valuedeviceType = request.getQueryString("deviceType");
        String deviceType;
        if (valuedeviceType != null) {
            deviceType = valuedeviceType;
        } else {
            deviceType = null;
        }
        String valuedeviceOS = request.getQueryString("deviceOS");
        String deviceOS;
        if (valuedeviceOS != null) {
            deviceOS = valuedeviceOS;
        } else {
            deviceOS = null;
        }
        String valuemodel = request.getQueryString("model");
        String model;
        if (valuemodel != null) {
            model = valuemodel;
        } else {
            model = null;
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
        String valuecustomId = request.getQueryString("customId");
        Long customId;
        if (valuecustomId != null) {
            customId = Long.parseLong(valuecustomId);
        } else {
            customId = null;
        }
        String valuecustomType = request.getQueryString("customType");
        String customType;
        if (valuecustomType != null) {
            customType = valuecustomType;
        } else {
            customType = null;
        }
        String valueachievementIncrement = request.getQueryString("achievementIncrement");
        Long achievementIncrement;
        if (valueachievementIncrement != null) {
            achievementIncrement = Long.parseLong(valueachievementIncrement);
        } else {
            achievementIncrement = null;
        }
        String valuecity = request.getQueryString("city");
        String city;
        if (valuecity != null) {
            city = valuecity;
        } else {
            city = null;
        }
        String valuestate = request.getQueryString("state");
        String state;
        if (valuestate != null) {
            state = valuestate;
        } else {
            state = null;
        }
        String valuecountry = request.getQueryString("country");
        String country;
        if (valuecountry != null) {
            country = valuecountry;
        } else {
            country = null;
        }
        String valuezip = request.getQueryString("zip");
        String zip;
        if (valuezip != null) {
            zip = valuezip;
        } else {
            zip = null;
        }
        String valuelocationDescription = request.getQueryString("locationDescription");
        String locationDescription;
        if (valuelocationDescription != null) {
            locationDescription = valuelocationDescription;
        } else {
            locationDescription = null;
        }
        String valueclientTime = request.getQueryString("clientTime");
        Long clientTime;
        if (valueclientTime != null) {
            clientTime = Long.parseLong(valueclientTime);
        } else {
            clientTime = null;
        }
        String valueerrorMessage = request.getQueryString("errorMessage");
        String errorMessage;
        if (valueerrorMessage != null) {
            errorMessage = valueerrorMessage;
        } else {
            errorMessage = null;
        }
        String valueip = request.getQueryString("ip");
        String ip;
        if (valueip != null) {
            ip = valueip;
        } else {
            ip = null;
        }
        String valueuserAgent = request.getQueryString("userAgent");
        String userAgent;
        if (valueuserAgent != null) {
            userAgent = valueuserAgent;
        } else {
            userAgent = null;
        }
        String valuebackgroundEvent = request.getQueryString("backgroundEvent");
        Boolean backgroundEvent;
        if (valuebackgroundEvent != null) {
            backgroundEvent = Boolean.valueOf(valuebackgroundEvent);
        } else {
            backgroundEvent = null;
        }
        String valuecustomMessage = request.getQueryString("customMessage");
        String customMessage;
        if (valuecustomMessage != null) {
            customMessage = valuecustomMessage;
        } else {
            customMessage = null;
        }
        String valuecustomMessage2 = request.getQueryString("customMessage2");
        String customMessage2;
        if (valuecustomMessage2 != null) {
            customMessage2 = valuecustomMessage2;
        } else {
            customMessage2 = null;
        }
        String valuecustomValue = request.getQueryString("customValue");
        Double customValue;
        if (valuecustomValue != null) {
            customValue = Double.parseDouble(valuecustomValue);
        } else {
            customValue = null;
        }
        String valuecustomValue2 = request.getQueryString("customValue2");
        Double customValue2;
        if (valuecustomValue2 != null) {
            customValue2 = Double.parseDouble(valuecustomValue2);
        } else {
            customValue2 = null;
        }
        String valuecustomLong = request.getQueryString("customLong");
        Long customLong;
        if (valuecustomLong != null) {
            customLong = Long.parseLong(valuecustomLong);
        } else {
            customLong = null;
        }
        String valuecustomLong2 = request.getQueryString("customLong2");
        Long customLong2;
        if (valuecustomLong2 != null) {
            customLong2 = Long.parseLong(valuecustomLong2);
        } else {
            customLong2 = null;
        }
        return imp.usageHttp(request, version, tag, deviceId, accountId, applicationId, appKey, appVersion, device, deviceType, deviceOS, model, latitude, longitude, customId, customType, achievementIncrement, city, state, country, zip, locationDescription, clientTime, errorMessage, ip, userAgent, backgroundEvent, customMessage, customMessage2, customValue, customValue2, customLong, customLong2);
    }

    @ApiAction
    public Result usageBatch(Http.Request request, BigDecimal version) throws Exception {
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
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valueappVersion = request.getQueryString("appVersion");
        String appVersion;
        if (valueappVersion != null) {
            appVersion = valueappVersion;
        } else {
            appVersion = null;
        }
        String valuedevice = request.getQueryString("device");
        String device;
        if (valuedevice != null) {
            device = valuedevice;
        } else {
            throw new IllegalArgumentException("'device' parameter is required");
        }
        String valuedeviceType = request.getQueryString("deviceType");
        String deviceType;
        if (valuedeviceType != null) {
            deviceType = valuedeviceType;
        } else {
            deviceType = null;
        }
        String valuedeviceOS = request.getQueryString("deviceOS");
        String deviceOS;
        if (valuedeviceOS != null) {
            deviceOS = valuedeviceOS;
        } else {
            deviceOS = null;
        }
        String valuemodel = request.getQueryString("model");
        String model;
        if (valuemodel != null) {
            model = valuemodel;
        } else {
            model = null;
        }
        String valuedata = request.getQueryString("data");
        String data;
        if (valuedata != null) {
            data = valuedata;
        } else {
            throw new IllegalArgumentException("'data' parameter is required");
        }
        String valueupdateRanking = request.getQueryString("updateRanking");
        Boolean updateRanking;
        if (valueupdateRanking != null) {
            updateRanking = Boolean.valueOf(valueupdateRanking);
        } else {
            updateRanking = null;
        }
        String valuereturnSummaryResponse = request.getQueryString("returnSummaryResponse");
        Boolean returnSummaryResponse;
        if (valuereturnSummaryResponse != null) {
            returnSummaryResponse = Boolean.valueOf(valuereturnSummaryResponse);
        } else {
            returnSummaryResponse = null;
        }
        return imp.usageBatchHttp(request, version, appKey, device, data, deviceId, accountId, appVersion, deviceType, deviceOS, model, updateRanking, returnSummaryResponse);
    }

}
