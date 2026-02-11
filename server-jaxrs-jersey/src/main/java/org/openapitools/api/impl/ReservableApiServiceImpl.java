package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AvailabilityResponse;
import org.openapitools.model.TimeSlotResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ReservableApiServiceImpl extends ReservableApiService {
    @Override
    public Response reservableAvailability( @NotNull Long reservableId,  @NotNull String reservableType, String deviceId, Long accountId, String availability, String availabilitySummary, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response searchAvailability( @NotNull Long reservableId,  @NotNull String reservableType, String deviceId, Long accountId, Long startDate, Long endDate, Integer start, Integer limit, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response searchSchedule( @NotNull Long reservableId,  @NotNull String reservableType,  @NotNull Long startDate,  @NotNull Long endDate, String deviceId, Long accountId, Integer timeBucketMins, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
