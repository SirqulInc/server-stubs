package controllers;

import apimodels.AccountMiniResponse;
import java.math.BigDecimal;
import apimodels.Leg;
import apimodels.LegResponse;
import apimodels.PredictedLocationResponse;
import apimodels.PreferredLocationResponse;
import apimodels.SirqulResponse;
import apimodels.StepResponse;

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
public class TrackingApiControllerImp extends TrackingApiControllerImpInterface {
    @Override
    public List<Leg> batchSaveTracking(Http.Request request, BigDecimal version, @NotNull String data, String deviceId, Long accountId, Boolean generateAccounts, Boolean updateAccountLocations, String defaultTag, String slaveUID) throws Exception {
        //Do your magic!!!
        return new ArrayList<Leg>();
    }

    @Override
    public PredictedLocationResponse getPredictedLocations(Http.Request request, BigDecimal version, @NotNull Long accountId, Double latitude, Double longitude, Long dateCheck, String hourCheck, Long threshold, String distanceUnit, Double searchRange, String sortOrder) throws Exception {
        //Do your magic!!!
        return new PredictedLocationResponse();
    }

    @Override
    public List<StepResponse> getPredictedPath(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long startStepId, @NotNull Long endStepId) throws Exception {
        //Do your magic!!!
        return new ArrayList<StepResponse>();
    }

    @Override
    public List<PreferredLocationResponse> getPreferredLocations(Http.Request request, BigDecimal version, @NotNull Long accountId, Double latitude, Double longitude, Long dateCheck, String hourCheck, String sortField, Boolean descending, Integer start, Integer limit, Double searchRange, String distanceUnit) throws Exception {
        //Do your magic!!!
        return new ArrayList<PreferredLocationResponse>();
    }

    @Override
    public List<LegResponse> getTrackingLegs(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long ownerId, String trackingDeviceId, Long startDate, Long endDate, String tags, Boolean getLastPoint) throws Exception {
        //Do your magic!!!
        return new ArrayList<LegResponse>();
    }

    @Override
    public SirqulResponse saveTrackingLeg(Http.Request request, BigDecimal version, @NotNull Double startLat, @NotNull Double startLng, @NotNull Long startDate, @NotNull Double endLat, @NotNull Double endLng, @NotNull Long endDate, String deviceId, Long accountId, Double distance, Long duration, String steps, String tags) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SirqulResponse saveTrackingStep(Http.Request request, BigDecimal version, @NotNull Long legId, @NotNull Double startLat, @NotNull Double startLng, @NotNull Long startDate, @NotNull Double endLat, @NotNull Double endLng, @NotNull Long endDate, String deviceId, Long accountId, Double distance, Long duration) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public List<AccountMiniResponse> searchAccountsWithTrackingLegs(Http.Request request, BigDecimal version, @NotNull Long accountId, String keyword, Long startDate, Long endDate, String tags, String audienceIds, Double latitude, Double longitude, Double range, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly) throws Exception {
        //Do your magic!!!
        return new ArrayList<AccountMiniResponse>();
    }

    @Override
    public List<LegResponse> searchTrackingLegs(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, String trackingDeviceId, Long startDate, Long endDate, String tags, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new ArrayList<LegResponse>();
    }

}
