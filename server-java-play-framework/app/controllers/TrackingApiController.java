package controllers;

import apimodels.AccountMiniResponse;
import java.math.BigDecimal;
import apimodels.Leg;
import apimodels.LegResponse;
import apimodels.PredictedLocationResponse;
import apimodels.PreferredLocationResponse;
import apimodels.SirqulResponse;
import apimodels.StepResponse;

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
public class TrackingApiController extends Controller {
    private final TrackingApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private TrackingApiController(Config configuration, TrackingApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result batchSaveTracking(Http.Request request, BigDecimal version) throws Exception {
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
        String valuedata = request.getQueryString("data");
        String data;
        if (valuedata != null) {
            data = valuedata;
        } else {
            throw new IllegalArgumentException("'data' parameter is required");
        }
        String valuegenerateAccounts = request.getQueryString("generateAccounts");
        Boolean generateAccounts;
        if (valuegenerateAccounts != null) {
            generateAccounts = Boolean.valueOf(valuegenerateAccounts);
        } else {
            generateAccounts = null;
        }
        String valueupdateAccountLocations = request.getQueryString("updateAccountLocations");
        Boolean updateAccountLocations;
        if (valueupdateAccountLocations != null) {
            updateAccountLocations = Boolean.valueOf(valueupdateAccountLocations);
        } else {
            updateAccountLocations = null;
        }
        String valuedefaultTag = request.getQueryString("defaultTag");
        String defaultTag;
        if (valuedefaultTag != null) {
            defaultTag = valuedefaultTag;
        } else {
            defaultTag = "PASSIVE";
        }
        String valueslaveUID = request.getQueryString("slaveUID");
        String slaveUID;
        if (valueslaveUID != null) {
            slaveUID = valueslaveUID;
        } else {
            slaveUID = null;
        }
        return imp.batchSaveTrackingHttp(request, version, data, deviceId, accountId, generateAccounts, updateAccountLocations, defaultTag, slaveUID);
    }

    @ApiAction
    public Result getPredictedLocations(Http.Request request, BigDecimal version) throws Exception {
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
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        String valuedateCheck = request.getQueryString("dateCheck");
        Long dateCheck;
        if (valuedateCheck != null) {
            dateCheck = Long.parseLong(valuedateCheck);
        } else {
            dateCheck = null;
        }
        String valuehourCheck = request.getQueryString("hourCheck");
        String hourCheck;
        if (valuehourCheck != null) {
            hourCheck = valuehourCheck;
        } else {
            hourCheck = null;
        }
        String valuethreshold = request.getQueryString("threshold");
        Long threshold;
        if (valuethreshold != null) {
            threshold = Long.parseLong(valuethreshold);
        } else {
            threshold = 1;
        }
        String valuedistanceUnit = request.getQueryString("distanceUnit");
        String distanceUnit;
        if (valuedistanceUnit != null) {
            distanceUnit = valuedistanceUnit;
        } else {
            distanceUnit = "MILES";
        }
        String valuesearchRange = request.getQueryString("searchRange");
        Double searchRange;
        if (valuesearchRange != null) {
            searchRange = Double.parseDouble(valuesearchRange);
        } else {
            searchRange = 0;
        }
        String valuesortOrder = request.getQueryString("sortOrder");
        String sortOrder;
        if (valuesortOrder != null) {
            sortOrder = valuesortOrder;
        } else {
            sortOrder = "MATCHES";
        }
        return imp.getPredictedLocationsHttp(request, version, accountId, latitude, longitude, dateCheck, hourCheck, threshold, distanceUnit, searchRange, sortOrder);
    }

    @ApiAction
    public Result getPredictedPath(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuestartStepId = request.getQueryString("startStepId");
        Long startStepId;
        if (valuestartStepId != null) {
            startStepId = Long.parseLong(valuestartStepId);
        } else {
            throw new IllegalArgumentException("'startStepId' parameter is required");
        }
        String valueendStepId = request.getQueryString("endStepId");
        Long endStepId;
        if (valueendStepId != null) {
            endStepId = Long.parseLong(valueendStepId);
        } else {
            throw new IllegalArgumentException("'endStepId' parameter is required");
        }
        return imp.getPredictedPathHttp(request, version, accountId, startStepId, endStepId);
    }

    @ApiAction
    public Result getPreferredLocations(Http.Request request, BigDecimal version) throws Exception {
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
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        String valuedateCheck = request.getQueryString("dateCheck");
        Long dateCheck;
        if (valuedateCheck != null) {
            dateCheck = Long.parseLong(valuedateCheck);
        } else {
            dateCheck = null;
        }
        String valuehourCheck = request.getQueryString("hourCheck");
        String hourCheck;
        if (valuehourCheck != null) {
            hourCheck = valuehourCheck;
        } else {
            hourCheck = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = "PREFERRED_DATE";
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = true;
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
        String valuesearchRange = request.getQueryString("searchRange");
        Double searchRange;
        if (valuesearchRange != null) {
            searchRange = Double.parseDouble(valuesearchRange);
        } else {
            searchRange = 0;
        }
        String valuedistanceUnit = request.getQueryString("distanceUnit");
        String distanceUnit;
        if (valuedistanceUnit != null) {
            distanceUnit = valuedistanceUnit;
        } else {
            distanceUnit = "MILES";
        }
        return imp.getPreferredLocationsHttp(request, version, accountId, latitude, longitude, dateCheck, hourCheck, sortField, descending, start, limit, searchRange, distanceUnit);
    }

    @ApiAction
    public Result getTrackingLegs(Http.Request request, BigDecimal version) throws Exception {
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
        String valueownerId = request.getQueryString("ownerId");
        Long ownerId;
        if (valueownerId != null) {
            ownerId = Long.parseLong(valueownerId);
        } else {
            ownerId = null;
        }
        String valuetrackingDeviceId = request.getQueryString("trackingDeviceId");
        String trackingDeviceId;
        if (valuetrackingDeviceId != null) {
            trackingDeviceId = valuetrackingDeviceId;
        } else {
            trackingDeviceId = null;
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
        String valuetags = request.getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            tags = null;
        }
        String valuegetLastPoint = request.getQueryString("getLastPoint");
        Boolean getLastPoint;
        if (valuegetLastPoint != null) {
            getLastPoint = Boolean.valueOf(valuegetLastPoint);
        } else {
            getLastPoint = false;
        }
        return imp.getTrackingLegsHttp(request, version, deviceId, accountId, ownerId, trackingDeviceId, startDate, endDate, tags, getLastPoint);
    }

    @ApiAction
    public Result saveTrackingLeg(Http.Request request, BigDecimal version) throws Exception {
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
        String valuedistance = request.getQueryString("distance");
        Double distance;
        if (valuedistance != null) {
            distance = Double.parseDouble(valuedistance);
        } else {
            distance = null;
        }
        String valueduration = request.getQueryString("duration");
        Long duration;
        if (valueduration != null) {
            duration = Long.parseLong(valueduration);
        } else {
            duration = null;
        }
        String valuestartLat = request.getQueryString("startLat");
        Double startLat;
        if (valuestartLat != null) {
            startLat = Double.parseDouble(valuestartLat);
        } else {
            throw new IllegalArgumentException("'startLat' parameter is required");
        }
        String valuestartLng = request.getQueryString("startLng");
        Double startLng;
        if (valuestartLng != null) {
            startLng = Double.parseDouble(valuestartLng);
        } else {
            throw new IllegalArgumentException("'startLng' parameter is required");
        }
        String valuestartDate = request.getQueryString("startDate");
        Long startDate;
        if (valuestartDate != null) {
            startDate = Long.parseLong(valuestartDate);
        } else {
            throw new IllegalArgumentException("'startDate' parameter is required");
        }
        String valueendLat = request.getQueryString("endLat");
        Double endLat;
        if (valueendLat != null) {
            endLat = Double.parseDouble(valueendLat);
        } else {
            throw new IllegalArgumentException("'endLat' parameter is required");
        }
        String valueendLng = request.getQueryString("endLng");
        Double endLng;
        if (valueendLng != null) {
            endLng = Double.parseDouble(valueendLng);
        } else {
            throw new IllegalArgumentException("'endLng' parameter is required");
        }
        String valueendDate = request.getQueryString("endDate");
        Long endDate;
        if (valueendDate != null) {
            endDate = Long.parseLong(valueendDate);
        } else {
            throw new IllegalArgumentException("'endDate' parameter is required");
        }
        String valuesteps = request.getQueryString("steps");
        String steps;
        if (valuesteps != null) {
            steps = valuesteps;
        } else {
            steps = null;
        }
        String valuetags = request.getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            tags = null;
        }
        return imp.saveTrackingLegHttp(request, version, startLat, startLng, startDate, endLat, endLng, endDate, deviceId, accountId, distance, duration, steps, tags);
    }

    @ApiAction
    public Result saveTrackingStep(Http.Request request, BigDecimal version) throws Exception {
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
        String valuelegId = request.getQueryString("legId");
        Long legId;
        if (valuelegId != null) {
            legId = Long.parseLong(valuelegId);
        } else {
            throw new IllegalArgumentException("'legId' parameter is required");
        }
        String valuedistance = request.getQueryString("distance");
        Double distance;
        if (valuedistance != null) {
            distance = Double.parseDouble(valuedistance);
        } else {
            distance = null;
        }
        String valueduration = request.getQueryString("duration");
        Long duration;
        if (valueduration != null) {
            duration = Long.parseLong(valueduration);
        } else {
            duration = null;
        }
        String valuestartLat = request.getQueryString("startLat");
        Double startLat;
        if (valuestartLat != null) {
            startLat = Double.parseDouble(valuestartLat);
        } else {
            throw new IllegalArgumentException("'startLat' parameter is required");
        }
        String valuestartLng = request.getQueryString("startLng");
        Double startLng;
        if (valuestartLng != null) {
            startLng = Double.parseDouble(valuestartLng);
        } else {
            throw new IllegalArgumentException("'startLng' parameter is required");
        }
        String valuestartDate = request.getQueryString("startDate");
        Long startDate;
        if (valuestartDate != null) {
            startDate = Long.parseLong(valuestartDate);
        } else {
            throw new IllegalArgumentException("'startDate' parameter is required");
        }
        String valueendLat = request.getQueryString("endLat");
        Double endLat;
        if (valueendLat != null) {
            endLat = Double.parseDouble(valueendLat);
        } else {
            throw new IllegalArgumentException("'endLat' parameter is required");
        }
        String valueendLng = request.getQueryString("endLng");
        Double endLng;
        if (valueendLng != null) {
            endLng = Double.parseDouble(valueendLng);
        } else {
            throw new IllegalArgumentException("'endLng' parameter is required");
        }
        String valueendDate = request.getQueryString("endDate");
        Long endDate;
        if (valueendDate != null) {
            endDate = Long.parseLong(valueendDate);
        } else {
            throw new IllegalArgumentException("'endDate' parameter is required");
        }
        return imp.saveTrackingStepHttp(request, version, legId, startLat, startLng, startDate, endLat, endLng, endDate, deviceId, accountId, distance, duration);
    }

    @ApiAction
    public Result searchAccountsWithTrackingLegs(Http.Request request, BigDecimal version) throws Exception {
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
        String valuetags = request.getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            tags = null;
        }
        String valueaudienceIds = request.getQueryString("audienceIds");
        String audienceIds;
        if (valueaudienceIds != null) {
            audienceIds = valueaudienceIds;
        } else {
            audienceIds = null;
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
        String valuerange = request.getQueryString("range");
        Double range;
        if (valuerange != null) {
            range = Double.parseDouble(valuerange);
        } else {
            range = 5;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = "LEG_START_DATE";
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = true;
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
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            activeOnly = false;
        }
        return imp.searchAccountsWithTrackingLegsHttp(request, version, accountId, keyword, startDate, endDate, tags, audienceIds, latitude, longitude, range, sortField, descending, start, limit, activeOnly);
    }

    @ApiAction
    public Result searchTrackingLegs(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuetrackingDeviceId = request.getQueryString("trackingDeviceId");
        String trackingDeviceId;
        if (valuetrackingDeviceId != null) {
            trackingDeviceId = valuetrackingDeviceId;
        } else {
            trackingDeviceId = null;
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
        String valuetags = request.getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            tags = null;
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
            limit = 100;
        }
        return imp.searchTrackingLegsHttp(request, version, accountId, appKey, trackingDeviceId, startDate, endDate, tags, start, limit);
    }

}
