package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.OfferApiService;

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

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/offer")


@io.swagger.annotations.Api(description = "the offer API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OfferApi  {

    @Inject OfferApiService service;

    @POST
    @Path("/status/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Offer Status", notes = "Create an offer status record", response = OfferTransactionStatusResponse.class, tags={ "Offer Status", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionStatusResponse.class) })
    public Response createOfferTransactionStatus( @NotNull @QueryParam("name") String name, @NotNull @QueryParam("code") Integer code, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("description") String description, @DefaultValue("ANY") @QueryParam("role") String role, @DefaultValue("true") @QueryParam("active") Boolean active, @QueryParam("applicationIds") String applicationIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createOfferTransactionStatus(name,code,deviceId,accountId,latitude,longitude,description,role,active,applicationIds,securityContext);
    }
    @POST
    @Path("/status/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Offer Status", notes = "Mark an offer status record as deleted", response = SirqulResponse.class, tags={ "Offer Status", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteOfferTransactionStatus( @NotNull @QueryParam("statusId") Long statusId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteOfferTransactionStatus(statusId,deviceId,accountId,latitude,longitude,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Offer", notes = "Gets offer or offer location details as a consumer.  Will check if it is a favorite if the deviceId/accountId is provided.  If the offerId is provided it will look up the main offer and ignore the the offerLocationId. If no offerId is provided then an offerLocationId must be specified.", response = OfferResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferResponse.class) })
    public Response getOfferDetails( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("offerId") Long offerId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("distance") Double distance, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @DefaultValue("false") @QueryParam("includeOfferLocations") Boolean includeOfferLocations, @DefaultValue("false") @QueryParam("includeRetailerLocations") Boolean includeRetailerLocations, @DefaultValue("false") @QueryParam("includeChildOffers") Boolean includeChildOffers,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getOfferDetails(deviceId,accountId,offerId,offerLocationId,distance,latitude,longitude,includeOfferLocations,includeRetailerLocations,includeChildOffers,securityContext);
    }
    @GET
    @Path("/lists/count")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Offers (Counts)", notes = "Gets the offer list counts.", response = ListCountResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ListCountResponse.class) })
    public Response getOfferListCounts( @NotNull @QueryParam("latitude") Double latitude, @NotNull @QueryParam("longitude") Double longitude, @DefaultValue("5") @QueryParam("searchRange") BigDecimal searchRange,, allowableValues="MILES, KILOMETERS" @DefaultValue("MILES") @QueryParam("distanceUnit") String distanceUnit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getOfferListCounts(latitude,longitude,searchRange,distanceUnit,securityContext);
    }
    @GET
    @Path("/location/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Offer Location", notes = "Gets the offer location by offer location id or udid (of a device)", response = OfferShortResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferShortResponse.class) })
    public Response getOfferLocation( @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("udid") String udid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getOfferLocation(offerLocationId,udid,securityContext);
    }
    @GET
    @Path("/status/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Offer Status", notes = "Get an offer status record", response = OfferTransactionStatusResponse.class, tags={ "Offer Status", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionStatusResponse.class) })
    public Response getOfferTransactionStatus( @NotNull @QueryParam("statusId") Long statusId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getOfferTransactionStatus(statusId,deviceId,accountId,latitude,longitude,securityContext);
    }
    @GET
    @Path("/status/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Offer Status", notes = "Search for the available offer statuses", response = OfferTransactionStatusResponse.class, responseContainer = "List", tags={ "Offer Status", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionStatusResponse.class, responseContainer = "List") })
    public Response searchOfferTransactionStatuses( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("keyword") String keyword, @QueryParam("role") String role, @QueryParam("appKey") String appKey,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DESCRIPTION, CODE, ROLE" @DefaultValue("CODE") @QueryParam("sortField") String sortField, @DefaultValue("true") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("false") @QueryParam("includeInactive") Boolean includeInactive,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchOfferTransactionStatuses(deviceId,accountId,latitude,longitude,keyword,role,appKey,sortField,descending,start,limit,includeInactive,securityContext);
    }
    @GET
    @Path("/lists")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Offers", notes = "Searches for offers as a consumer.", response = OfferListResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferListResponse.class) })
    public Response searchOffersForConsumer( @NotNull @QueryParam("latitude") Double latitude, @NotNull @QueryParam("longitude") Double longitude, @NotNull, allowableValues="WALLET, CLICKS, BLENDED" @QueryParam("recommendationType") String recommendationType, @NotNull @QueryParam("locationId") Long locationId, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("maxRecommendations") Integer maxRecommendations, @NotNull, allowableValues="MILES, KILOMETERS" @QueryParam("distanceUnit") String distanceUnit, @QueryParam("appKey") String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @DefaultValue("5") @QueryParam("searchRange") Double searchRange, @QueryParam("tags") String tags, @QueryParam("supportedPostalCodes") String supportedPostalCodes, @QueryParam("keyword") String keyword, @QueryParam("categories") String categories, @QueryParam("filters") String filters, @DefaultValue("COUPON, VOUCHER") @QueryParam("offerTypes") String offerTypes, @QueryParam("type") String type, @QueryParam("sortField") String sortField, @QueryParam("recommendOfferIds") String recommendOfferIds, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("offerId") Long offerId, @QueryParam("includeMission") Boolean includeMission, @QueryParam("includeCategories") Boolean includeCategories, @QueryParam("includeFilters") Boolean includeFilters, @QueryParam("includeExpired") Boolean includeExpired, @QueryParam("includeFavorite") Boolean includeFavorite, @QueryParam("closestOfferOnly") Boolean closestOfferOnly, @QueryParam("searchExpression") String searchExpression,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, OFFER_ID, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, RETAILER_ID, RETAILER_LOCATION_ID, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY" @QueryParam("groupBy") String groupBy,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchOffersForConsumer(latitude,longitude,recommendationType,locationId,start,limit,maxRecommendations,distanceUnit,appKey,deviceId,accountId,searchRange,tags,supportedPostalCodes,keyword,categories,filters,offerTypes,type,sortField,recommendOfferIds,retailerLocationIds,offerId,includeMission,includeCategories,includeFilters,includeExpired,includeFavorite,closestOfferOnly,searchExpression,groupBy,securityContext);
    }
    @GET
    @Path("/top")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Offers (Top)", notes = "Gets the top active offers.", response = OfferListResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferListResponse.class) })
    public Response topOfferTransactions( @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.topOfferTransactions(start,limit,securityContext);
    }
    @POST
    @Path("/status/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Offer Status", notes = "Update an offer status record", response = OfferTransactionStatusResponse.class, tags={ "Offer Status", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionStatusResponse.class) })
    public Response updateOfferTransactionStatus( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("statusId") Long statusId, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("code") Integer code, @QueryParam("role") String role, @QueryParam("active") Boolean active, @QueryParam("applicationIds") String applicationIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateOfferTransactionStatus(deviceId,accountId,latitude,longitude,statusId,name,description,code,role,active,applicationIds,securityContext);
    }
}
