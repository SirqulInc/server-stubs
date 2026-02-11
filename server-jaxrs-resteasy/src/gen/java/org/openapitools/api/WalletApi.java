package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.WalletApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.OfferTransactionResponse;
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

@Path("/wallet")


@io.swagger.annotations.Api(description = "the wallet API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class WalletApi  {

    @Inject WalletApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Wallet Offers", notes = "Adds offers to the wallet", response = OfferTransactionResponse.class, responseContainer = "List", tags={ "Wallet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionResponse.class, responseContainer = "List") })
    public Response createOfferTransaction( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("offerId") Long offerId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("offerCart") String offerCart, @QueryParam("promoCode") String promoCode, @DefaultValue("CASH") @QueryParam("currencyType") String currencyType, @QueryParam("usePoints") Boolean usePoints, @QueryParam("metaData") String metaData, @QueryParam("appKey") String appKey, @QueryParam("status") Integer status,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createOfferTransaction(deviceId,accountId,offerId,offerLocationId,offerCart,promoCode,currencyType,usePoints,metaData,appKey,status,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Wallet Offer", notes = "Removes the transaction from the wallet by setting the deleted date to the current date/time.  Requires a valid account and transactionId.", response = SirqulResponse.class, tags={ "Wallet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteOfferTransaction( @NotNull @QueryParam("transactionId") Long transactionId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteOfferTransaction(transactionId,deviceId,accountId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Wallet Offer", notes = "", response = OfferTransactionResponse.class, tags={ "Wallet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionResponse.class) })
    public Response getOfferTransaction( @NotNull @QueryParam("transactionId") Long transactionId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @DefaultValue("false") @QueryParam("includeMission") Boolean includeMission, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @DefaultValue("true") @QueryParam("returnFullResponse") Boolean returnFullResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getOfferTransaction(transactionId,deviceId,accountId,includeMission,latitude,longitude,returnFullResponse,securityContext);
    }
    @POST
    @Path("/preview")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Preview Wallet Offers", notes = "Preview the final cost of a transaction without charging the user", response = OfferTransactionResponse.class, responseContainer = "List", tags={ "Wallet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionResponse.class, responseContainer = "List") })
    public Response previewOfferTransaction( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("offerId") Long offerId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("offerCart") String offerCart, @QueryParam("promoCode") String promoCode, @DefaultValue("CASH") @QueryParam("currencyType") String currencyType, @QueryParam("usePoints") Boolean usePoints, @QueryParam("metaData") String metaData, @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.previewOfferTransaction(deviceId,accountId,offerId,offerLocationId,offerCart,promoCode,currencyType,usePoints,metaData,appKey,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Wallet Offers", notes = "Search on active offers currently in the user's wallet, or past offers the user has already redeemed.", response = OfferTransactionResponse.class, responseContainer = "List", tags={ "Wallet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionResponse.class, responseContainer = "List") })
    public Response searchOfferTransactions( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerIds") String retailerIds, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("excludeRetailerLocationIds") String excludeRetailerLocationIds, @QueryParam("offerId") Long offerId, @QueryParam("offerIds") String offerIds, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("offerLocationIds") String offerLocationIds,, allowableValues="VOUCHER, COUPON, PRODUCT, MEDIA, EVENT, DEVICE" @QueryParam("offerType") String offerType, @QueryParam("offerTypes") String offerTypes, @QueryParam("specialOfferType") String specialOfferType, @QueryParam("specialOfferTypes") String specialOfferTypes, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("offerAudienceIds") String offerAudienceIds,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, REDEEMABLE_START, REDEEMABLE_END, CUSTOMER_ID, CUSTOMER_DISPLAY, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY" @DefaultValue("CREATED") @QueryParam("sortField") String sortField, @DefaultValue("true") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("redeemableStartDate") Long redeemableStartDate, @QueryParam("redeemableEndDate") Long redeemableEndDate, @DefaultValue("false") @QueryParam("filterByParentOffer") Boolean filterByParentOffer, @QueryParam("startedSince") Long startedSince, @QueryParam("startedBefore") Long startedBefore, @QueryParam("endedSince") Long endedSince, @QueryParam("endedBefore") Long endedBefore, @DefaultValue("false") @QueryParam("redeemed") Boolean redeemed, @QueryParam("statuses") String statuses, @DefaultValue("false") @QueryParam("reservationsOnly") Boolean reservationsOnly, @DefaultValue("false") @QueryParam("activeOnly") Boolean activeOnly, @DefaultValue("false") @QueryParam("returnFullResponse") Boolean returnFullResponse, @QueryParam("recurringStartedSince") Long recurringStartedSince, @QueryParam("recurringStartedBefore") Long recurringStartedBefore, @QueryParam("recurringExpirationSince") Long recurringExpirationSince, @QueryParam("recurringExpirationBefore") Long recurringExpirationBefore,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchOfferTransactions(deviceId,accountId,keyword,retailerId,retailerIds,retailerLocationId,retailerLocationIds,excludeRetailerLocationIds,offerId,offerIds,offerLocationId,offerLocationIds,offerType,offerTypes,specialOfferType,specialOfferTypes,categoryIds,filterIds,offerAudienceIds,sortField,descending,start,limit,latitude,longitude,redeemableStartDate,redeemableEndDate,filterByParentOffer,startedSince,startedBefore,endedSince,endedBefore,redeemed,statuses,reservationsOnly,activeOnly,returnFullResponse,recurringStartedSince,recurringStartedBefore,recurringExpirationSince,recurringExpirationBefore,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Wallet Offer", notes = "Update offer status. The status values are: 0 - not redeemable, 1 - redeemable.  Not redeemable means the customer has received the offer but has not decided to use (or print) it yet.  Until they choose to do this the merchant cannot redeem the offer (has not been given permission yet).   Redeemable means the customer has chosen to use the offer and wishes to redeem it.  Redeemed means the merchant has accepted the offer and the given the customer its value, then marked it a used in the system.  This status change is handled by a merchant end point.", response = OfferTransactionResponse.class, tags={ "Wallet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionResponse.class) })
    public Response updateOfferTransaction( @NotNull @QueryParam("transactionId") Long transactionId, @NotNull @QueryParam("status") Integer status, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("offerLocationId") Long offerLocationId, @DefaultValue("CASH") @QueryParam("currencyType") String currencyType, @QueryParam("usePoints") Boolean usePoints, @QueryParam("appKey") String appKey, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("metaData") String metaData, @DefaultValue("false") @QueryParam("returnFullResponse") Boolean returnFullResponse, @QueryParam("exceptionMembershipOfferIds") String exceptionMembershipOfferIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateOfferTransaction(transactionId,status,deviceId,accountId,offerLocationId,currencyType,usePoints,appKey,latitude,longitude,metaData,returnFullResponse,exceptionMembershipOfferIds,securityContext);
    }
}
