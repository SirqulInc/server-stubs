package org.openapitools.api;

import org.openapitools.api.WalletApiService;
import org.openapitools.api.factories.WalletApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.OfferTransactionResponse;
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

@Path("/wallet")


@io.swagger.annotations.Api(description = "the wallet API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class WalletApi  {
   private final WalletApiService delegate;

   public WalletApi(@Context ServletConfig servletContext) {
      WalletApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("WalletApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (WalletApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = WalletApiServiceFactory.getWalletApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Wallet Offers", notes = "Adds offers to the wallet", response = OfferTransactionResponse.class, responseContainer = "List", tags={ "Wallet", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionResponse.class, responseContainer = "List")
    })
    public Response createOfferTransaction(@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The id of the offer being added (offerId or offeLocationId required)") @QueryParam("offerId")  Long offerId,@ApiParam(value = "The id of the offer location being added (offerId or offeLocationId required)") @QueryParam("offerLocationId")  Long offerLocationId,@ApiParam(value = "A JSON list of offers to purchase. ```json [   {     \"offerId\": 123,     \"offerLocationId\": 234,     \"quantity\": 2   },   {     \"offerId\": 456,     \"offerLocationId\": 567,     \"quantity\": 1   } ] ``` ") @QueryParam("offerCart")  String offerCart,@ApiParam(value = "The promoCode") @QueryParam("promoCode")  String promoCode,@ApiParam(value = "Determines the method of purchasing offer. CASH = use card on file, POINTS = use points, TICKETS = use tickets", defaultValue = "CASH") @DefaultValue("CASH") @QueryParam("currencyType")  String currencyType,@ApiParam(value = "Sets the currencyType to POINTS") @QueryParam("usePoints")  Boolean usePoints,@ApiParam(value = "External custom client defined data") @QueryParam("metaData")  String metaData,@ApiParam(value = "The application requesting the purchase, required when currencyType is TICKETS") @QueryParam("appKey")  String appKey,@ApiParam(value = "Custom status value to change to (0 or 1 for redeem, 5 or 6 for membership)") @QueryParam("status")  Integer status,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createOfferTransaction(deviceId, accountId, offerId, offerLocationId, offerCart, promoCode, currencyType, usePoints, metaData, appKey, status, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Wallet Offer", notes = "Removes the transaction from the wallet by setting the deleted date to the current date/time.  Requires a valid account and transactionId.", response = SirqulResponse.class, tags={ "Wallet", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteOfferTransaction(@ApiParam(value = "The offer transaction id to remove", required = true) @QueryParam("transactionId") @NotNull  Long transactionId,@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteOfferTransaction(transactionId, deviceId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Wallet Offer", notes = "", response = OfferTransactionResponse.class, tags={ "Wallet", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionResponse.class)
    })
    public Response getOfferTransaction(@ApiParam(value = "The offer transaction id to get details of", required = true) @QueryParam("transactionId") @NotNull  Long transactionId,@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "If true then include mission data, false to not include", defaultValue = "false") @DefaultValue("false") @QueryParam("includeMission")  Boolean includeMission,@ApiParam(value = "The latitude location of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The latitude location of the user") @QueryParam("longitude")  Double longitude,@ApiParam(value = "Determines whether to return a detailed version of the response", defaultValue = "true") @DefaultValue("true") @QueryParam("returnFullResponse")  Boolean returnFullResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getOfferTransaction(transactionId, deviceId, accountId, includeMission, latitude, longitude, returnFullResponse, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/preview")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Preview Wallet Offers", notes = "Preview the final cost of a transaction without charging the user", response = OfferTransactionResponse.class, responseContainer = "List", tags={ "Wallet", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionResponse.class, responseContainer = "List")
    })
    public Response previewOfferTransaction(@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The id of the offer being added (offerId or offeLocationId required)") @QueryParam("offerId")  Long offerId,@ApiParam(value = "The id of the offer location being added (offerId or offeLocationId required)") @QueryParam("offerLocationId")  Long offerLocationId,@ApiParam(value = "A JSON list of offers to purchase.") @QueryParam("offerCart")  String offerCart,@ApiParam(value = "The promoCode") @QueryParam("promoCode")  String promoCode,@ApiParam(value = "Determines the method of purchasing offer. CASH = use card on file, POINTS = use points, TICKETS = use tickets", defaultValue = "CASH") @DefaultValue("CASH") @QueryParam("currencyType")  String currencyType,@ApiParam(value = "Sets the currencyType to POINTS") @QueryParam("usePoints")  Boolean usePoints,@ApiParam(value = "External custom client defined data") @QueryParam("metaData")  String metaData,@ApiParam(value = "The application requesting the purchase, required when currencyType is TICKETS") @QueryParam("appKey")  String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.previewOfferTransaction(deviceId, accountId, offerId, offerLocationId, offerCart, promoCode, currencyType, usePoints, metaData, appKey, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Wallet Offers", notes = "Search on active offers currently in the user's wallet, or past offers the user has already redeemed.", response = OfferTransactionResponse.class, responseContainer = "List", tags={ "Wallet", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionResponse.class, responseContainer = "List")
    })
    public Response searchOfferTransactions(@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The keyword to search for") @QueryParam("keyword")  String keyword,@ApiParam(value = "Filter results for this retailer") @QueryParam("retailerId")  Long retailerId,@ApiParam(value = "Filter results for a list of retailers") @QueryParam("retailerIds")  String retailerIds,@ApiParam(value = "Filter results for this retailer location") @QueryParam("retailerLocationId")  Long retailerLocationId,@ApiParam(value = "Filter results for a list of retailer locations") @QueryParam("retailerLocationIds")  String retailerLocationIds,@ApiParam(value = "Filter results to exclude retailer locations") @QueryParam("excludeRetailerLocationIds")  String excludeRetailerLocationIds,@ApiParam(value = "Filter results for this offer") @QueryParam("offerId")  Long offerId,@ApiParam(value = "Filter results for a list of offer") @QueryParam("offerIds")  String offerIds,@ApiParam(value = "Filter results for this offer location") @QueryParam("offerLocationId")  Long offerLocationId,@ApiParam(value = "Filter results for a list of offer locations") @QueryParam("offerLocationIds")  String offerLocationIds,@ApiParam(value = "Filter results to return a specific offer type", allowableValues="VOUCHER, COUPON, PRODUCT, MEDIA, EVENT, DEVICE") @QueryParam("offerType")  String offerType,@ApiParam(value = "Filter results to return specific offer types") @QueryParam("offerTypes")  String offerTypes,@ApiParam(value = "Filter results to return a specific special offer type") @QueryParam("specialOfferType")  String specialOfferType,@ApiParam(value = "Filter results to return specific special offer types") @QueryParam("specialOfferTypes")  String specialOfferTypes,@ApiParam(value = "Category Ids") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "Filter Ids") @QueryParam("filterIds")  String filterIds,@ApiParam(value = "Offer Audience Ids") @QueryParam("offerAudienceIds")  String offerAudienceIds,@ApiParam(value = "Determines what to sort the results by", allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, REDEEMABLE_START, REDEEMABLE_END, CUSTOMER_ID, CUSTOMER_DISPLAY, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY", defaultValue = "CREATED") @DefaultValue("CREATED") @QueryParam("sortField")  String sortField,@ApiParam(value = "Determines whether the results are in descending order", defaultValue = "true") @DefaultValue("true") @QueryParam("descending")  Boolean descending,@ApiParam(value = "The start index for pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "The limit for pagination", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@ApiParam(value = "The latitude location of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The latitude location of the user") @QueryParam("longitude")  Double longitude,@ApiParam(value = "Filter results by the offer redeemable date") @QueryParam("redeemableStartDate")  Long redeemableStartDate,@ApiParam(value = "Filter results by the offer redeemable date") @QueryParam("redeemableEndDate")  Long redeemableEndDate,@ApiParam(value = "Apply params to offer's parent", defaultValue = "false") @DefaultValue("false") @QueryParam("filterByParentOffer")  Boolean filterByParentOffer,@ApiParam(value = "Filter results by the offer start date") @QueryParam("startedSince")  Long startedSince,@ApiParam(value = "Filter results by the offer start date") @QueryParam("startedBefore")  Long startedBefore,@ApiParam(value = "Filter results by the offer end date") @QueryParam("endedSince")  Long endedSince,@ApiParam(value = "Filter results by the offer end date") @QueryParam("endedBefore")  Long endedBefore,@ApiParam(value = "If true return redeemed transactions (status 2), otherwise return active transactions (status 0 or 1)", defaultValue = "false") @DefaultValue("false") @QueryParam("redeemed")  Boolean redeemed,@ApiParam(value = "Custom status value to change to (0 or 1 for redeem, 5 or 6 for membership)") @QueryParam("statuses")  String statuses,@ApiParam(value = "Returns only reservation transactions if true", defaultValue = "false") @DefaultValue("false") @QueryParam("reservationsOnly")  Boolean reservationsOnly,@ApiParam(value = "Active Only", defaultValue = "false") @DefaultValue("false") @QueryParam("activeOnly")  Boolean activeOnly,@ApiParam(value = "Determines whether to return a detailed version of the response", defaultValue = "false") @DefaultValue("false") @QueryParam("returnFullResponse")  Boolean returnFullResponse,@ApiParam(value = "Filter results by the recurring billing start date") @QueryParam("recurringStartedSince")  Long recurringStartedSince,@ApiParam(value = "Filter results by the recurring billing start date") @QueryParam("recurringStartedBefore")  Long recurringStartedBefore,@ApiParam(value = "Filter results by the recurring billing expiration date") @QueryParam("recurringExpirationSince")  Long recurringExpirationSince,@ApiParam(value = "Filter results by the recurring billing expiration date") @QueryParam("recurringExpirationBefore")  Long recurringExpirationBefore,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchOfferTransactions(deviceId, accountId, keyword, retailerId, retailerIds, retailerLocationId, retailerLocationIds, excludeRetailerLocationIds, offerId, offerIds, offerLocationId, offerLocationIds, offerType, offerTypes, specialOfferType, specialOfferTypes, categoryIds, filterIds, offerAudienceIds, sortField, descending, start, limit, latitude, longitude, redeemableStartDate, redeemableEndDate, filterByParentOffer, startedSince, startedBefore, endedSince, endedBefore, redeemed, statuses, reservationsOnly, activeOnly, returnFullResponse, recurringStartedSince, recurringStartedBefore, recurringExpirationSince, recurringExpirationBefore, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Wallet Offer", notes = "Update offer status. The status values are: 0 - not redeemable, 1 - redeemable.  Not redeemable means the customer has received the offer but has not decided to use (or print) it yet.  Until they choose to do this the merchant cannot redeem the offer (has not been given permission yet).   Redeemable means the customer has chosen to use the offer and wishes to redeem it.  Redeemed means the merchant has accepted the offer and the given the customer its value, then marked it a used in the system.  This status change is handled by a merchant end point.", response = OfferTransactionResponse.class, tags={ "Wallet", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionResponse.class)
    })
    public Response updateOfferTransaction(@ApiParam(value = "The offer transaction id to remove", required = true) @QueryParam("transactionId") @NotNull  Long transactionId,@ApiParam(value = "The status value to change to (0 or 1)", required = true) @QueryParam("status") @NotNull  Integer status,@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "Offer Location Id") @QueryParam("offerLocationId")  Long offerLocationId,@ApiParam(value = "Currency Type", defaultValue = "CASH") @DefaultValue("CASH") @QueryParam("currencyType")  String currencyType,@ApiParam(value = "Use Points") @QueryParam("usePoints")  Boolean usePoints,@ApiParam(value = "App Key") @QueryParam("appKey")  String appKey,@ApiParam(value = "The latitude location of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The latitude location of the user") @QueryParam("longitude")  Double longitude,@ApiParam(value = "External custom client defined data") @QueryParam("metaData")  String metaData,@ApiParam(value = "Determines whether to return a detailed version of the response", defaultValue = "false") @DefaultValue("false") @QueryParam("returnFullResponse")  Boolean returnFullResponse,@ApiParam(value = "Exception Offers, transaction audiences of these offers won't be removed out of the account when up") @QueryParam("exceptionMembershipOfferIds")  String exceptionMembershipOfferIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateOfferTransaction(transactionId, status, deviceId, accountId, offerLocationId, currencyType, usePoints, appKey, latitude, longitude, metaData, returnFullResponse, exceptionMembershipOfferIds, securityContext);
    }
}
