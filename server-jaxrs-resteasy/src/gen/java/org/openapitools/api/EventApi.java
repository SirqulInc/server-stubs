package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.EventApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.EventAttendanceResponse;
import org.openapitools.model.OfferResponse;
import org.openapitools.model.OfferShortResponse;
import org.openapitools.model.SirqulResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/event")


@io.swagger.annotations.Api(description = "the event API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class EventApi  {

    @Inject EventApiService service;

    @POST
    @Path("/attend")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Attend Event", notes = " Specify whether the user is attending an event at a particular location. This can also be used as a \"check-in\" action.", response = OfferResponse.class, tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferResponse.class) })
    public Response attendEvent( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("listingId") Long listingId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("transactionId") Long transactionId, @QueryParam("status") Integer status, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.attendEvent(deviceId,accountId,appKey,listingId,retailerLocationId,offerLocationId,transactionId,status,latitude,longitude,securityContext);
    }
    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Event", notes = "Create a private event to share with associates.", response = OfferResponse.class, tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferResponse.class) })
    public Response createEvent( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("title") String title, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("subTitle") String subTitle, @QueryParam("details") String details, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("active") Boolean active, @QueryParam("imageAssetId") Long imageAssetId, @QueryParam("redeemableStart") Long redeemableStart, @QueryParam("redeemableEnd") Long redeemableEnd, @QueryParam("metaData") String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createEvent(accountId,title,retailerLocationIds,subTitle,details,categoryIds,filterIds,active,imageAssetId,redeemableStart,redeemableEnd,metaData,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Event", notes = "Delete an event that the user has permissions to.", response = SirqulResponse.class, tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteEvent( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("eventId") Long eventId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteEvent(accountId,eventId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Event", notes = "Get an event.", response = OfferResponse.class, tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferResponse.class) })
    public Response getEvent( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("eventId") Long eventId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getEvent(accountId,eventId,securityContext);
    }
    @GET
    @Path("/attendance/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Event Attendance", notes = "Searches on event type transactions. This can be used to see who is attending an event.", response = EventAttendanceResponse.class, responseContainer = "List", tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = EventAttendanceResponse.class, responseContainer = "List") })
    public Response searchEventTransactions( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("excludeRetailerLocationId") Long excludeRetailerLocationId, @QueryParam("listingId") Long listingId, @QueryParam("offerId") Long offerId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("customerAccountIds") String customerAccountIds, @QueryParam("affiliatedCategoryIds") String affiliatedCategoryIds, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("statuses") String statuses,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, REDEEMABLE_START, REDEEMABLE_END, CUSTOMER_ID, CUSTOMER_DISPLAY, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY" @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchEventTransactions(deviceId,accountId,appKey,keyword,retailerId,retailerLocationId,excludeRetailerLocationId,listingId,offerId,offerLocationId,customerAccountIds,affiliatedCategoryIds,startDate,endDate,statuses,sortField,descending,start,limit,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Events", notes = "Searches on events that the account has access to.", response = OfferShortResponse.class, responseContainer = "List", tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferShortResponse.class, responseContainer = "List") })
    public Response searchEvents( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("offerAudienceIds") String offerAudienceIds, @QueryParam("transactionAudienceIds") String transactionAudienceIds,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, REDEEMABLE_START, REDEEMABLE_END, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, VOUCHER_DISCOUNT_PRICE, FULL_PRICE, DICOUNT_PRICE, TICKETS_REWARD, AVAILABILITY_DATE, RELEASE_DATE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY" @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchEvents(accountId,keyword,activeOnly,categoryIds,filterIds,offerAudienceIds,transactionAudienceIds,sortField,descending,startDate,endDate,start,limit,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Event", notes = "Update a private event to share with associates.", response = OfferResponse.class, tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferResponse.class) })
    public Response updateEvent( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("eventId") Long eventId, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("title") String title, @QueryParam("subTitle") String subTitle, @QueryParam("details") String details, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("active") Boolean active, @QueryParam("imageAssetId") Long imageAssetId, @QueryParam("redeemableStart") Long redeemableStart, @QueryParam("redeemableEnd") Long redeemableEnd,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateEvent(accountId,eventId,retailerLocationIds,title,subTitle,details,categoryIds,filterIds,active,imageAssetId,redeemableStart,redeemableEnd,securityContext);
    }
}
