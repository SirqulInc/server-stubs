package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



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

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface TrackingApiService {
      Response batchSaveTracking(String data,String deviceId,Long accountId,Boolean generateAccounts,Boolean updateAccountLocations,String defaultTag,String slaveUID,SecurityContext securityContext)
      throws NotFoundException;
      Response getPredictedLocations(Long accountId,Double latitude,Double longitude,Long dateCheck,String hourCheck,Long threshold,String distanceUnit,Double searchRange,String sortOrder,SecurityContext securityContext)
      throws NotFoundException;
      Response getPredictedPath(Long accountId,Long startStepId,Long endStepId,SecurityContext securityContext)
      throws NotFoundException;
      Response getPreferredLocations(Long accountId,Double latitude,Double longitude,Long dateCheck,String hourCheck,String sortField,Boolean descending,Integer start,Integer limit,Double searchRange,String distanceUnit,SecurityContext securityContext)
      throws NotFoundException;
      Response getTrackingLegs(String deviceId,Long accountId,Long ownerId,String trackingDeviceId,Long startDate,Long endDate,String tags,Boolean getLastPoint,SecurityContext securityContext)
      throws NotFoundException;
      Response saveTrackingLeg(Double startLat,Double startLng,Long startDate,Double endLat,Double endLng,Long endDate,String deviceId,Long accountId,Double distance,Long duration,String steps,String tags,SecurityContext securityContext)
      throws NotFoundException;
      Response saveTrackingStep(Long legId,Double startLat,Double startLng,Long startDate,Double endLat,Double endLng,Long endDate,String deviceId,Long accountId,Double distance,Long duration,SecurityContext securityContext)
      throws NotFoundException;
      Response searchAccountsWithTrackingLegs(Long accountId,String keyword,Long startDate,Long endDate,String tags,String audienceIds,Double latitude,Double longitude,Double range,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,SecurityContext securityContext)
      throws NotFoundException;
      Response searchTrackingLegs(Long accountId,String appKey,String trackingDeviceId,Long startDate,Long endDate,String tags,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;


}
