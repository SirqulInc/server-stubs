package org.openapitools.api;

import org.openapitools.api.EventApiService;
import org.openapitools.api.factories.EventApiServiceFactory;

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

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/event")


@io.swagger.annotations.Api(description = "the event API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class EventApi  {
   private final EventApiService delegate;

   public EventApi(@Context ServletConfig servletContext) {
      EventApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("EventApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (EventApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = EventApiServiceFactory.getEventApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/attend")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Attend Event", notes = " Specify whether the user is attending an event at a particular location. This can also be used as a \"check-in\" action.", response = OfferResponse.class, tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferResponse.class)
    })
    public Response attendEvent(@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The application of where to send notifications about the attend action") @QueryParam("appKey")  String appKey,@ApiParam(value = "The scheduled broadcast or marketing experience id") @QueryParam("listingId")  Long listingId,@ApiParam(value = "The retailer location where the event is being held") @QueryParam("retailerLocationId")  Long retailerLocationId,@ApiParam(value = "The actual event being held") @QueryParam("offerLocationId")  Long offerLocationId,@ApiParam(value = "The wallet item to update the status of, if provided then ignore the listingId, retailerLocationId, and the offerLocationId") @QueryParam("transactionId")  Long transactionId,@ApiParam(value = "Sets whether the user is: undecided (0), attending (1), attending and checked in (2), or not attending (3)") @QueryParam("status")  Integer status,@ApiParam(value = "The location of the status update") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The location of the status update") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.attendEvent(deviceId, accountId, appKey, listingId, retailerLocationId, offerLocationId, transactionId, status, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Event", notes = "Create a private event to share with associates.", response = OfferResponse.class, tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferResponse.class)
    })
    public Response createEvent(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The event title", required = true) @QueryParam("title") @NotNull  String title,@ApiParam(value = "The retailer location to have the event at") @QueryParam("retailerLocationIds")  String retailerLocationIds,@ApiParam(value = "The event sub title") @QueryParam("subTitle")  String subTitle,@ApiParam(value = "The event details") @QueryParam("details")  String details,@ApiParam(value = "The categories the associate the event with") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "The filters the associate the event with") @QueryParam("filterIds")  String filterIds,@ApiParam(value = "Is this event active") @QueryParam("active")  Boolean active,@ApiParam(value = "The image to show for the event") @QueryParam("imageAssetId")  Long imageAssetId,@ApiParam(value = "The event start date/time") @QueryParam("redeemableStart")  Long redeemableStart,@ApiParam(value = "The event end date/time") @QueryParam("redeemableEnd")  Long redeemableEnd,@ApiParam(value = "external custom client defined data") @QueryParam("metaData")  String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createEvent(accountId, title, retailerLocationIds, subTitle, details, categoryIds, filterIds, active, imageAssetId, redeemableStart, redeemableEnd, metaData, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Event", notes = "Delete an event that the user has permissions to.", response = SirqulResponse.class, tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteEvent(@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the event to update", required = true) @QueryParam("eventId") @NotNull  Long eventId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteEvent(accountId, eventId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Event", notes = "Get an event.", response = OfferResponse.class, tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferResponse.class)
    })
    public Response getEvent(@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The id of the event to return", required = true) @QueryParam("eventId") @NotNull  Long eventId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getEvent(accountId, eventId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/attendance/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Event Attendance", notes = "Searches on event type transactions. This can be used to see who is attending an event.", response = EventAttendanceResponse.class, responseContainer = "List", tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = EventAttendanceResponse.class, responseContainer = "List")
    })
    public Response searchEventTransactions(@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "The keyword to search for") @QueryParam("keyword")  String keyword,@ApiParam(value = "Filter results for this retailer") @QueryParam("retailerId")  Long retailerId,@ApiParam(value = "Filter results for this retailer location") @QueryParam("retailerLocationId")  Long retailerLocationId,@ApiParam(value = "Exclude results from this retailer location") @QueryParam("excludeRetailerLocationId")  Long excludeRetailerLocationId,@ApiParam(value = "Filter results for this event listing") @QueryParam("listingId")  Long listingId,@ApiParam(value = "Filter results for this offer") @QueryParam("offerId")  Long offerId,@ApiParam(value = "Filter results for this offer location") @QueryParam("offerLocationId")  Long offerLocationId,@ApiParam(value = "Filter results by accounts") @QueryParam("customerAccountIds")  String customerAccountIds,@ApiParam(value = "Comma separated list of category ids to determine whether the attendee is affiliated with the category") @QueryParam("affiliatedCategoryIds")  String affiliatedCategoryIds,@ApiParam(value = "Filter on attendance starting on or after this date (milliseconds since epoch)") @QueryParam("startDate")  Long startDate,@ApiParam(value = "Filter on attendance starting on or before this date (milliseconds since epoch)") @QueryParam("endDate")  Long endDate,@ApiParam(value = "Comma separated list of transaction statuses to filter on") @QueryParam("statuses")  String statuses,@ApiParam(value = "Determines what to sort the results by {CREATED, UPDATED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, CUSTOMER_ID, CUSTOMER_DISPLAY, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY}", allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, REDEEMABLE_START, REDEEMABLE_END, CUSTOMER_ID, CUSTOMER_DISPLAY, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY") @QueryParam("sortField")  String sortField,@ApiParam(value = "Determines whether the results are in descending order") @QueryParam("descending")  Boolean descending,@ApiParam(value = "The start index for pagination") @QueryParam("start")  Integer start,@ApiParam(value = "The limit for pagination") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchEventTransactions(deviceId, accountId, appKey, keyword, retailerId, retailerLocationId, excludeRetailerLocationId, listingId, offerId, offerLocationId, customerAccountIds, affiliatedCategoryIds, startDate, endDate, statuses, sortField, descending, start, limit, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Events", notes = "Searches on events that the account has access to.", response = OfferShortResponse.class, responseContainer = "List", tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferShortResponse.class, responseContainer = "List")
    })
    public Response searchEvents(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The keyword used to search") @QueryParam("keyword")  String keyword,@ApiParam(value = "Return only active results") @QueryParam("activeOnly")  Boolean activeOnly,@ApiParam(value = "the IDs of the categories that this event is associated with") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "the IDs of the filters that this event is associated with") @QueryParam("filterIds")  String filterIds,@ApiParam(value = "Offer audience ids to filter on") @QueryParam("offerAudienceIds")  String offerAudienceIds,@ApiParam(value = "Transaction audience ids to filter on") @QueryParam("transactionAudienceIds")  String transactionAudienceIds,@ApiParam(value = "The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY", allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, REDEEMABLE_START, REDEEMABLE_END, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, VOUCHER_DISCOUNT_PRICE, FULL_PRICE, DICOUNT_PRICE, TICKETS_REWARD, AVAILABILITY_DATE, RELEASE_DATE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY") @QueryParam("sortField")  String sortField,@ApiParam(value = "The order to return the search results") @QueryParam("descending")  Boolean descending,@ApiParam(value = "Filter the events to return only those that start on or after the date") @QueryParam("startDate")  Long startDate,@ApiParam(value = "Filter the events to return only those that start on or before the date") @QueryParam("endDate")  Long endDate,@ApiParam(value = "The record to begin the return set on") @QueryParam("start")  Integer start,@ApiParam(value = "The number of records to return") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchEvents(accountId, keyword, activeOnly, categoryIds, filterIds, offerAudienceIds, transactionAudienceIds, sortField, descending, startDate, endDate, start, limit, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Event", notes = "Update a private event to share with associates.", response = OfferResponse.class, tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferResponse.class)
    })
    public Response updateEvent(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The id of the event to update", required = true) @QueryParam("eventId") @NotNull  Long eventId,@ApiParam(value = "The retailer location to have the event at") @QueryParam("retailerLocationIds")  String retailerLocationIds,@ApiParam(value = "The event title") @QueryParam("title")  String title,@ApiParam(value = "The event sub title") @QueryParam("subTitle")  String subTitle,@ApiParam(value = "The event details") @QueryParam("details")  String details,@ApiParam(value = "The categories the associate the event with") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "The filters the associate the event with") @QueryParam("filterIds")  String filterIds,@ApiParam(value = "Is this event active") @QueryParam("active")  Boolean active,@ApiParam(value = "The image to show for the event") @QueryParam("imageAssetId")  Long imageAssetId,@ApiParam(value = "The event start date/time") @QueryParam("redeemableStart")  Long redeemableStart,@ApiParam(value = "The event end date/time") @QueryParam("redeemableEnd")  Long redeemableEnd,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateEvent(accountId, eventId, retailerLocationIds, title, subTitle, details, categoryIds, filterIds, active, imageAssetId, redeemableStart, redeemableEnd, securityContext);
    }
}
