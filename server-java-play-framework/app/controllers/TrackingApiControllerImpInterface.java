package controllers;

import apimodels.AccountMiniResponse;
import java.math.BigDecimal;
import apimodels.Leg;
import apimodels.LegResponse;
import apimodels.PredictedLocationResponse;
import apimodels.PreferredLocationResponse;
import apimodels.SirqulResponse;
import apimodels.StepResponse;

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
public abstract class TrackingApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result batchSaveTrackingHttp(Http.Request request, BigDecimal version, @NotNull String data, String deviceId, Long accountId, Boolean generateAccounts, Boolean updateAccountLocations, String defaultTag, String slaveUID) throws Exception {
        List<Leg> obj = batchSaveTracking(request, version, data, deviceId, accountId, generateAccounts, updateAccountLocations, defaultTag, slaveUID);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Leg curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Leg> batchSaveTracking(Http.Request request, BigDecimal version, @NotNull String data, String deviceId, Long accountId, Boolean generateAccounts, Boolean updateAccountLocations, String defaultTag, String slaveUID) throws Exception;

    public Result getPredictedLocationsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, Double latitude, Double longitude, Long dateCheck, String hourCheck, Long threshold, String distanceUnit, Double searchRange, String sortOrder) throws Exception {
        PredictedLocationResponse obj = getPredictedLocations(request, version, accountId, latitude, longitude, dateCheck, hourCheck, threshold, distanceUnit, searchRange, sortOrder);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PredictedLocationResponse getPredictedLocations(Http.Request request, BigDecimal version, @NotNull Long accountId, Double latitude, Double longitude, Long dateCheck, String hourCheck, Long threshold, String distanceUnit, Double searchRange, String sortOrder) throws Exception;

    public Result getPredictedPathHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long startStepId, @NotNull Long endStepId) throws Exception {
        List<StepResponse> obj = getPredictedPath(request, version, accountId, startStepId, endStepId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (StepResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<StepResponse> getPredictedPath(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long startStepId, @NotNull Long endStepId) throws Exception;

    public Result getPreferredLocationsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, Double latitude, Double longitude, Long dateCheck, String hourCheck, String sortField, Boolean descending, Integer start, Integer limit, Double searchRange, String distanceUnit) throws Exception {
        List<PreferredLocationResponse> obj = getPreferredLocations(request, version, accountId, latitude, longitude, dateCheck, hourCheck, sortField, descending, start, limit, searchRange, distanceUnit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (PreferredLocationResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<PreferredLocationResponse> getPreferredLocations(Http.Request request, BigDecimal version, @NotNull Long accountId, Double latitude, Double longitude, Long dateCheck, String hourCheck, String sortField, Boolean descending, Integer start, Integer limit, Double searchRange, String distanceUnit) throws Exception;

    public Result getTrackingLegsHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long ownerId, String trackingDeviceId, Long startDate, Long endDate, String tags, Boolean getLastPoint) throws Exception {
        List<LegResponse> obj = getTrackingLegs(request, version, deviceId, accountId, ownerId, trackingDeviceId, startDate, endDate, tags, getLastPoint);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (LegResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<LegResponse> getTrackingLegs(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long ownerId, String trackingDeviceId, Long startDate, Long endDate, String tags, Boolean getLastPoint) throws Exception;

    public Result saveTrackingLegHttp(Http.Request request, BigDecimal version, @NotNull Double startLat, @NotNull Double startLng, @NotNull Long startDate, @NotNull Double endLat, @NotNull Double endLng, @NotNull Long endDate, String deviceId, Long accountId, Double distance, Long duration, String steps, String tags) throws Exception {
        SirqulResponse obj = saveTrackingLeg(request, version, startLat, startLng, startDate, endLat, endLng, endDate, deviceId, accountId, distance, duration, steps, tags);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse saveTrackingLeg(Http.Request request, BigDecimal version, @NotNull Double startLat, @NotNull Double startLng, @NotNull Long startDate, @NotNull Double endLat, @NotNull Double endLng, @NotNull Long endDate, String deviceId, Long accountId, Double distance, Long duration, String steps, String tags) throws Exception;

    public Result saveTrackingStepHttp(Http.Request request, BigDecimal version, @NotNull Long legId, @NotNull Double startLat, @NotNull Double startLng, @NotNull Long startDate, @NotNull Double endLat, @NotNull Double endLng, @NotNull Long endDate, String deviceId, Long accountId, Double distance, Long duration) throws Exception {
        SirqulResponse obj = saveTrackingStep(request, version, legId, startLat, startLng, startDate, endLat, endLng, endDate, deviceId, accountId, distance, duration);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse saveTrackingStep(Http.Request request, BigDecimal version, @NotNull Long legId, @NotNull Double startLat, @NotNull Double startLng, @NotNull Long startDate, @NotNull Double endLat, @NotNull Double endLng, @NotNull Long endDate, String deviceId, Long accountId, Double distance, Long duration) throws Exception;

    public Result searchAccountsWithTrackingLegsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, String keyword, Long startDate, Long endDate, String tags, String audienceIds, Double latitude, Double longitude, Double range, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly) throws Exception {
        List<AccountMiniResponse> obj = searchAccountsWithTrackingLegs(request, version, accountId, keyword, startDate, endDate, tags, audienceIds, latitude, longitude, range, sortField, descending, start, limit, activeOnly);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (AccountMiniResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<AccountMiniResponse> searchAccountsWithTrackingLegs(Http.Request request, BigDecimal version, @NotNull Long accountId, String keyword, Long startDate, Long endDate, String tags, String audienceIds, Double latitude, Double longitude, Double range, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly) throws Exception;

    public Result searchTrackingLegsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, String trackingDeviceId, Long startDate, Long endDate, String tags, Integer start, Integer limit) throws Exception {
        List<LegResponse> obj = searchTrackingLegs(request, version, accountId, appKey, trackingDeviceId, startDate, endDate, tags, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (LegResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<LegResponse> searchTrackingLegs(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, String trackingDeviceId, Long startDate, Long endDate, String tags, Integer start, Integer limit) throws Exception;

}
