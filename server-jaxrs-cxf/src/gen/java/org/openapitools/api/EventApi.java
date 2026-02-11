package org.openapitools.api;

import org.openapitools.model.EventAttendanceResponse;
import org.openapitools.model.OfferResponse;
import org.openapitools.model.OfferShortResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
@Path("/event")
@Api(value = "/", description = "")
public interface EventApi  {

    /**
     * Attend Event
     *
     *  Specify whether the user is attending an event at a particular location. This can also be used as a \&quot;check-in\&quot; action.
     *
     */
    @POST
    @Path("/attend")
    @Produces({ "*/*" })
    @ApiOperation(value = "Attend Event", tags={ "Event" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OfferResponse.class) })
    public OfferResponse attendEvent(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("listingId") Long listingId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("transactionId") Long transactionId, @QueryParam("status") Integer status, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Create Event
     *
     * Create a private event to share with associates.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Event", tags={ "Event" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OfferResponse.class) })
    public OfferResponse createEvent(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("title") @NotNull String title, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("subTitle") String subTitle, @QueryParam("details") String details, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("active") Boolean active, @QueryParam("imageAssetId") Long imageAssetId, @QueryParam("redeemableStart") Long redeemableStart, @QueryParam("redeemableEnd") Long redeemableEnd, @QueryParam("metaData") String metaData);

    /**
     * Delete Event
     *
     * Delete an event that the user has permissions to.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Event", tags={ "Event" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteEvent(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("eventId") @NotNull Long eventId);

    /**
     * Get Event
     *
     * Get an event.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Event", tags={ "Event" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OfferResponse.class) })
    public OfferResponse getEvent(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("eventId") @NotNull Long eventId);

    /**
     * Search Event Attendance
     *
     * Searches on event type transactions. This can be used to see who is attending an event.
     *
     */
    @GET
    @Path("/attendance/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Event Attendance", tags={ "Event" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = EventAttendanceResponse.class, responseContainer = "List") })
    public List<EventAttendanceResponse> searchEventTransactions(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("excludeRetailerLocationId") Long excludeRetailerLocationId, @QueryParam("listingId") Long listingId, @QueryParam("offerId") Long offerId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("customerAccountIds") String customerAccountIds, @QueryParam("affiliatedCategoryIds") String affiliatedCategoryIds, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("statuses") String statuses, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit);

    /**
     * Search Events
     *
     * Searches on events that the account has access to.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Events", tags={ "Event" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OfferShortResponse.class, responseContainer = "List") })
    public List<OfferShortResponse> searchEvents(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("keyword") String keyword, @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("offerAudienceIds") String offerAudienceIds, @QueryParam("transactionAudienceIds") String transactionAudienceIds, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit);

    /**
     * Update Event
     *
     * Update a private event to share with associates.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Event", tags={ "Event" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OfferResponse.class) })
    public OfferResponse updateEvent(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("eventId") @NotNull Long eventId, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("title") String title, @QueryParam("subTitle") String subTitle, @QueryParam("details") String details, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("active") Boolean active, @QueryParam("imageAssetId") Long imageAssetId, @QueryParam("redeemableStart") Long redeemableStart, @QueryParam("redeemableEnd") Long redeemableEnd);
}
