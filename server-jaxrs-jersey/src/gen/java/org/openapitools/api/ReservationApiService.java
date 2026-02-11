package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.ReservationResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class ReservationApiService {
    public abstract Response createReservation(String deviceId,Long accountId,Long startDate,Long endDate,Long offerId,Long offerLocationId,String appKey,String metaData,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteReservation( @NotNull Long reservationId,String deviceId,Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchReservations(String deviceId,String appKey,Long accountId,Long filterAccountId,Long reservableId,String reservableType,String keyword,Long startDate,Long endDate,Integer start,Integer limit,SecurityContext securityContext) throws NotFoundException;
}
