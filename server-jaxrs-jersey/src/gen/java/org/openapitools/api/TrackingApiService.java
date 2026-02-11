package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.AccountMiniResponse;
import org.openapitools.model.Leg;
import org.openapitools.model.LegResponse;
import org.openapitools.model.PredictedLocationResponse;
import org.openapitools.model.PreferredLocationResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.StepResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class TrackingApiService {
    public abstract Response batchSaveTracking( @NotNull String data,String deviceId,Long accountId,Boolean generateAccounts,Boolean updateAccountLocations,String defaultTag,String slaveUID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPredictedLocations( @NotNull Long accountId,Double latitude,Double longitude,Long dateCheck,String hourCheck,Long threshold,String distanceUnit,Double searchRange,String sortOrder,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPredictedPath( @NotNull Long accountId, @NotNull Long startStepId, @NotNull Long endStepId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPreferredLocations( @NotNull Long accountId,Double latitude,Double longitude,Long dateCheck,String hourCheck,String sortField,Boolean descending,Integer start,Integer limit,Double searchRange,String distanceUnit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getTrackingLegs(String deviceId,Long accountId,Long ownerId,String trackingDeviceId,Long startDate,Long endDate,String tags,Boolean getLastPoint,SecurityContext securityContext) throws NotFoundException;
    public abstract Response saveTrackingLeg( @NotNull Double startLat, @NotNull Double startLng, @NotNull Long startDate, @NotNull Double endLat, @NotNull Double endLng, @NotNull Long endDate,String deviceId,Long accountId,Double distance,Long duration,String steps,String tags,SecurityContext securityContext) throws NotFoundException;
    public abstract Response saveTrackingStep( @NotNull Long legId, @NotNull Double startLat, @NotNull Double startLng, @NotNull Long startDate, @NotNull Double endLat, @NotNull Double endLng, @NotNull Long endDate,String deviceId,Long accountId,Double distance,Long duration,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchAccountsWithTrackingLegs( @NotNull Long accountId,String keyword,Long startDate,Long endDate,String tags,String audienceIds,Double latitude,Double longitude,Double range,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchTrackingLegs( @NotNull Long accountId, @NotNull String appKey,String trackingDeviceId,Long startDate,Long endDate,String tags,Integer start,Integer limit,SecurityContext securityContext) throws NotFoundException;
}
