package org.openapitools.api;

import org.openapitools.api.OfferApiService;
import org.openapitools.api.factories.OfferApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.math.BigDecimal;
import org.openapitools.model.ListCountResponse;
import org.openapitools.model.OfferListResponse;
import org.openapitools.model.OfferResponse;
import org.openapitools.model.OfferShortResponse;
import org.openapitools.model.OfferTransactionStatusResponse;
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

@Path("/offer")


@io.swagger.annotations.Api(description = "the offer API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OfferApi  {
   private final OfferApiService delegate;

   public OfferApi(@Context ServletConfig servletContext) {
      OfferApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("OfferApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (OfferApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = OfferApiServiceFactory.getOfferApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/status/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Offer Status", notes = "Create an offer status record", response = OfferTransactionStatusResponse.class, tags={ "Offer Status", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionStatusResponse.class)
    })
    public Response createOfferTransactionStatus(@ApiParam(value = "The name of the status", required = true) @QueryParam("name") @NotNull  String name,@ApiParam(value = "The status code, must be unique ", required = true) @QueryParam("code") @NotNull  Integer code,@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "Used to update the user's current location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "Used to update the user's current location") @QueryParam("longitude")  Double longitude,@ApiParam(value = "The description of the status") @QueryParam("description")  String description,@ApiParam(value = "The actor that uses the status", defaultValue = "ANY") @DefaultValue("ANY") @QueryParam("role")  String role,@ApiParam(value = "The active status", defaultValue = "true") @DefaultValue("true") @QueryParam("active")  Boolean active,@ApiParam(value = "The applications to associate the status with, if null then for all.") @QueryParam("applicationIds")  String applicationIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createOfferTransactionStatus(name, code, deviceId, accountId, latitude, longitude, description, role, active, applicationIds, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/status/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Offer Status", notes = "Mark an offer status record as deleted", response = SirqulResponse.class, tags={ "Offer Status", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteOfferTransactionStatus(@ApiParam(value = "The id of the record to delete", required = true) @QueryParam("statusId") @NotNull  Long statusId,@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "Used to update the user's current location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "Used to update the user's current location") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteOfferTransactionStatus(statusId, deviceId, accountId, latitude, longitude, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Offer", notes = "Gets offer or offer location details as a consumer.  Will check if it is a favorite if the deviceId/accountId is provided.  If the offerId is provided it will look up the main offer and ignore the the offerLocationId. If no offerId is provided then an offerLocationId must be specified.", response = OfferResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferResponse.class)
    })
    public Response getOfferDetails(@ApiParam(value = "The device id for returning account information (i.e. favorites)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id for returning account information (i.e. favorites)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The offer id (either offeLocationId or offerId must be provided)") @QueryParam("offerId")  Long offerId,@ApiParam(value = "The offer location id (either offeLocationId or offerId must be provided)") @QueryParam("offerLocationId")  Long offerLocationId,@ApiParam(value = "The distance of the offer from the user's current location (this is returned when the offer is searched)") @QueryParam("distance")  Double distance,@ApiParam(value = "The latitude to calculate distance from the offer") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The longitude to calculate distance from the offer") @QueryParam("longitude")  Double longitude,@ApiParam(value = "Determines whether to return offer locations for the offer", defaultValue = "false") @DefaultValue("false") @QueryParam("includeOfferLocations")  Boolean includeOfferLocations,@ApiParam(value = "Determines whether to return the retailer location info for each offer location response (includeOfferLocations must also be true for this to work)", defaultValue = "false") @DefaultValue("false") @QueryParam("includeRetailerLocations")  Boolean includeRetailerLocations,@ApiParam(value = "Determines whether to include child offers in the response", defaultValue = "false") @DefaultValue("false") @QueryParam("includeChildOffers")  Boolean includeChildOffers,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getOfferDetails(deviceId, accountId, offerId, offerLocationId, distance, latitude, longitude, includeOfferLocations, includeRetailerLocations, includeChildOffers, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/lists/count")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Offers (Counts)", notes = "Gets the offer list counts.", response = ListCountResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ListCountResponse.class)
    })
    public Response getOfferListCounts(@ApiParam(value = "The latitude of where the search will center at", required = true) @QueryParam("latitude") @NotNull  Double latitude,@ApiParam(value = "The longitude of where the search will center at", required = true) @QueryParam("longitude") @NotNull  Double longitude,@ApiParam(value = "The range of the search", defaultValue = "5") @DefaultValue("5") @QueryParam("searchRange")  BigDecimal searchRange,@ApiParam(value = "The units to use for distance calculations (e.g. MILES, KILOMETERS)", allowableValues="MILES, KILOMETERS", defaultValue = "MILES") @DefaultValue("MILES") @QueryParam("distanceUnit")  String distanceUnit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getOfferListCounts(latitude, longitude, searchRange, distanceUnit, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/location/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Offer Location", notes = "Gets the offer location by offer location id or udid (of a device)", response = OfferShortResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferShortResponse.class)
    })
    public Response getOfferLocation(@ApiParam(value = "the id of the offer location to get") @QueryParam("offerLocationId")  Long offerLocationId,@ApiParam(value = "the UDID of the device") @QueryParam("udid")  String udid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getOfferLocation(offerLocationId, udid, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/status/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Offer Status", notes = "Get an offer status record", response = OfferTransactionStatusResponse.class, tags={ "Offer Status", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionStatusResponse.class)
    })
    public Response getOfferTransactionStatus(@ApiParam(value = "The id of the record to get ", required = true) @QueryParam("statusId") @NotNull  Long statusId,@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "Used to update the user's current location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "Used to update the user's current location") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getOfferTransactionStatus(statusId, deviceId, accountId, latitude, longitude, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/status/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Offer Status", notes = "Search for the available offer statuses", response = OfferTransactionStatusResponse.class, responseContainer = "List", tags={ "Offer Status", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionStatusResponse.class, responseContainer = "List")
    })
    public Response searchOfferTransactionStatuses(@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "Used to update the user's current location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "Used to update the user's current location") @QueryParam("longitude")  Double longitude,@ApiParam(value = "Search the name and description fields") @QueryParam("keyword")  String keyword,@ApiParam(value = "The actors role, possible values are: CUSTOMER, RETAILER, or ANY") @QueryParam("role")  String role,@ApiParam(value = "The application making the request") @QueryParam("appKey")  String appKey,@ApiParam(value = "The field to sort on, possible values are: ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DESCRIPTION, CODE, ROLE", allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DESCRIPTION, CODE, ROLE", defaultValue = "CODE") @DefaultValue("CODE") @QueryParam("sortField")  String sortField,@ApiParam(value = "Determines whether the results are in descending order", defaultValue = "true") @DefaultValue("true") @QueryParam("descending")  Boolean descending,@ApiParam(value = "The start index for pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "The limit for pagination", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@ApiParam(value = "If true include inactive items", defaultValue = "false") @DefaultValue("false") @QueryParam("includeInactive")  Boolean includeInactive,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchOfferTransactionStatuses(deviceId, accountId, latitude, longitude, keyword, role, appKey, sortField, descending, start, limit, includeInactive, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/lists")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Offers", notes = "Searches for offers as a consumer.", response = OfferListResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferListResponse.class)
    })
    public Response searchOffersForConsumer(@ApiParam(value = "The latitude of where the search will center at", required = true) @QueryParam("latitude") @NotNull  Double latitude,@ApiParam(value = "The longitude of where the search will center at", required = true) @QueryParam("longitude") @NotNull  Double longitude,@ApiParam(value = "The method to use to gather recommendations: WALLET base relevance on items in users wallets CLICKS base relevance on items users have clicked on BLENDED blend using all methods available", required = true, allowableValues="WALLET, CLICKS, BLENDED") @QueryParam("recommendationType") @NotNull  String recommendationType,@ApiParam(value = "This parameter is deprecated. The location id", required = true) @QueryParam("locationId") @NotNull  Long locationId,@ApiParam(value = "The start index for pagination", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "The limit for pagination", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "", required = true) @QueryParam("maxRecommendations") @NotNull  Integer maxRecommendations,@ApiParam(value = "", required = true, allowableValues="MILES, KILOMETERS") @QueryParam("distanceUnit") @NotNull  String distanceUnit,@ApiParam(value = "The application key used to identify the application") @QueryParam("appKey")  String appKey,@ApiParam(value = "The device id for returning account information (i.e. offer transactions made by the user)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id for returning account information (i.e. offer transactions made by the user)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The range of the search", defaultValue = "5") @DefaultValue("5") @QueryParam("searchRange")  Double searchRange,@ApiParam(value = "Does a full-text search on tags") @QueryParam("tags")  String tags,@ApiParam(value = "supported postal codes") @QueryParam("supportedPostalCodes")  String supportedPostalCodes,@ApiParam(value = "The keyword to filter results by") @QueryParam("keyword")  String keyword,@ApiParam(value = "Comma separate list of category ids") @QueryParam("categories")  String categories,@ApiParam(value = "Comma separated list of filter ids") @QueryParam("filters")  String filters,@ApiParam(value = "Comma separated list of offer types {COUPON, VOUCHER, PRODUCT, MEDIA, EVENT, DEVICE}", defaultValue = "COUPON, VOUCHER") @DefaultValue("COUPON, VOUCHER") @QueryParam("offerTypes")  String offerTypes,@ApiParam(value = "The special offer type {ALL, RESERVABLE, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW}") @QueryParam("type")  String type,@ApiParam(value = "The field to sort the result set on:DISTANCE Sort the offers nearest to farthest BUSINESS_NAME Sort the offers alphabetically by location name SHUFFLE Sort the nearest offers randomly USERPREFS accountId must accompany this parameter. Gives the first X recommendations where X equals the parameter maxRecommendations") @QueryParam("sortField")  String sortField,@ApiParam(value = "Return recommendations based on these offers IDs") @QueryParam("recommendOfferIds")  String recommendOfferIds,@ApiParam(value = "Only return offer locations for the specific retailer locations.") @QueryParam("retailerLocationIds")  String retailerLocationIds,@ApiParam(value = "Only return offer locations for the specific offer.") @QueryParam("offerId")  Long offerId,@ApiParam(value = "If true include the mission response as part of the offer. Default is false.") @QueryParam("includeMission")  Boolean includeMission,@ApiParam(value = "If true include the category list response as part of the offer. Default is false.") @QueryParam("includeCategories")  Boolean includeCategories,@ApiParam(value = "If true include the filter list response as part of the offer. Default is false.") @QueryParam("includeFilters")  Boolean includeFilters,@ApiParam(value = "If true then ignore the expired dates. Default is false.") @QueryParam("includeExpired")  Boolean includeExpired,@ApiParam(value = "If true then ignore the favorite. Default is false.") @QueryParam("includeFavorite")  Boolean includeFavorite,@ApiParam(value = "This parameter is deprecated. see groupBy. If true then it only returns the offer location for an offer closest to the given lat/lon") @QueryParam("closestOfferOnly")  Boolean closestOfferOnly,@ApiParam(value = "") @QueryParam("searchExpression")  String searchExpression,@ApiParam(value = "groups the results by a certain field. For example, if you want to return the closest offer location of an offer, then pass in groupBy=OFFER_ID and sortField=DISTANCE (to sort by distance).", allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, OFFER_ID, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, RETAILER_ID, RETAILER_LOCATION_ID, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY") @QueryParam("groupBy")  String groupBy,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchOffersForConsumer(latitude, longitude, recommendationType, locationId, start, limit, maxRecommendations, distanceUnit, appKey, deviceId, accountId, searchRange, tags, supportedPostalCodes, keyword, categories, filters, offerTypes, type, sortField, recommendOfferIds, retailerLocationIds, offerId, includeMission, includeCategories, includeFilters, includeExpired, includeFavorite, closestOfferOnly, searchExpression, groupBy, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/top")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Offers (Top)", notes = "Gets the top active offers.", response = OfferListResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferListResponse.class)
    })
    public Response topOfferTransactions(@ApiParam(value = "The index into the record set to start with. Default is 0.", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "The total number of record to return. Default id 20.", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.topOfferTransactions(start, limit, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/status/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Offer Status", notes = "Update an offer status record", response = OfferTransactionStatusResponse.class, tags={ "Offer Status", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionStatusResponse.class)
    })
    public Response updateOfferTransactionStatus(@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "Used to update the user's current location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "Used to update the user's current location") @QueryParam("longitude")  Double longitude,@ApiParam(value = "The id of the record to update ") @QueryParam("statusId")  Long statusId,@ApiParam(value = "The name of th status") @QueryParam("name")  String name,@ApiParam(value = "The description of the status") @QueryParam("description")  String description,@ApiParam(value = "The status code, must be unique ") @QueryParam("code")  Integer code,@ApiParam(value = "The actor that uses the status") @QueryParam("role")  String role,@ApiParam(value = "The active status") @QueryParam("active")  Boolean active,@ApiParam(value = "The applications to associate the status with, if null then for all.") @QueryParam("applicationIds")  String applicationIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateOfferTransactionStatus(deviceId, accountId, latitude, longitude, statusId, name, description, code, role, active, applicationIds, securityContext);
    }
}
