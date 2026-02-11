package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.ChartData;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.UserActivityResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AnalyticsApiServiceImpl extends AnalyticsApiService {
    @Override
    public Response activities( @NotNull Integer start,  @NotNull Integer limit,  @NotNull Long accountId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response aggregatedFilteredUsage(String deviceId, Long accountId, Long applicationId, String appKey, Long startDate, Long endDate, String deviceType, String device, String deviceOS, String gender, String ageGroup, String country, String state, String city, String zip, String model, String tag, Long userAccountId, String userAccountDisplay, String userAccountUsername, String groupByRoot, String groupBy, String distinctCount, String sortField, Boolean descending, Boolean hideUnknown, String responseFormat, Integer l, Integer limit, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response filteredUsage(String deviceId, Long accountId, Long applicationId, String appKey, Long startDate, Long endDate, String deviceType, String device, String deviceOS, String gender, String ageGroup, String country, String state, String city, String zip, String model, String tag, Long userAccountId, String userAccountDisplay, String userAccountUsername, Long customId, String customType, Double customValue, Double customValue2, Long customLong, Long customLong2, String customMessage, String customMessage2, String groupBy, String distinctCount, String sumColumn, String sortField, Boolean descending, Boolean hideUnknown, String responseFormat, Integer l, Integer limit, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response usage( @NotNull String tag, String deviceId, Long accountId, Long applicationId, String appKey, String appVersion, String device, String deviceType, String deviceOS, String model, Double latitude, Double longitude, Long customId, String customType, Long achievementIncrement, String city, String state, String country, String zip, String locationDescription, Long clientTime, String errorMessage, String ip, String userAgent, Boolean backgroundEvent, String customMessage, String customMessage2, Double customValue, Double customValue2, Long customLong, Long customLong2, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response usageBatch( @NotNull String appKey,  @NotNull String device,  @NotNull String data, String deviceId, Long accountId, String appVersion, String deviceType, String deviceOS, String model, Boolean updateRanking, Boolean returnSummaryResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
