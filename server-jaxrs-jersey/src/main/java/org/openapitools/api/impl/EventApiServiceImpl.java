package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.EventAttendanceResponse;
import org.openapitools.model.OfferResponse;
import org.openapitools.model.OfferShortResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class EventApiServiceImpl extends EventApiService {
    @Override
    public Response attendEvent(String deviceId, Long accountId, String appKey, Long listingId, Long retailerLocationId, Long offerLocationId, Long transactionId, Integer status, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response createEvent( @NotNull Long accountId,  @NotNull String title, String retailerLocationIds, String subTitle, String details, String categoryIds, String filterIds, Boolean active, Long imageAssetId, Long redeemableStart, Long redeemableEnd, String metaData, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteEvent( @NotNull Long accountId,  @NotNull Long eventId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getEvent( @NotNull Long accountId,  @NotNull Long eventId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response searchEventTransactions(String deviceId, Long accountId, String appKey, String keyword, Long retailerId, Long retailerLocationId, Long excludeRetailerLocationId, Long listingId, Long offerId, Long offerLocationId, String customerAccountIds, String affiliatedCategoryIds, Long startDate, Long endDate, String statuses, String sortField, Boolean descending, Integer start, Integer limit, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response searchEvents( @NotNull Long accountId, String keyword, Boolean activeOnly, String categoryIds, String filterIds, String offerAudienceIds, String transactionAudienceIds, String sortField, Boolean descending, Long startDate, Long endDate, Integer start, Integer limit, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateEvent( @NotNull Long accountId,  @NotNull Long eventId, String retailerLocationIds, String title, String subTitle, String details, String categoryIds, String filterIds, Boolean active, Long imageAssetId, Long redeemableStart, Long redeemableEnd, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
