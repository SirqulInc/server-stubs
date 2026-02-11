package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.AvailabilityResponse;
import org.openapitools.model.TimeSlotResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface ReservableApiService {
      Response reservableAvailability(Long reservableId,String reservableType,String deviceId,Long accountId,String availability,String availabilitySummary,SecurityContext securityContext)
      throws NotFoundException;
      Response searchAvailability(Long reservableId,String reservableType,String deviceId,Long accountId,Long startDate,Long endDate,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchSchedule(Long reservableId,String reservableType,Long startDate,Long endDate,String deviceId,Long accountId,Integer timeBucketMins,SecurityContext securityContext)
      throws NotFoundException;


}
