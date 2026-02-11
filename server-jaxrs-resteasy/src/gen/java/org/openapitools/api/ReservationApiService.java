package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.ReservationResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface ReservationApiService {
      Response createReservation(String deviceId,Long accountId,Long startDate,Long endDate,Long offerId,Long offerLocationId,String appKey,String metaData,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteReservation(Long reservationId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response searchReservations(String deviceId,String appKey,Long accountId,Long filterAccountId,Long reservableId,String reservableType,String keyword,Long startDate,Long endDate,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;


}
