package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.OfferTransactionResponse;
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
@Path("/api/{version}/wallet")
@Api(value = "/", description = "")
public interface WalletApi  {

    /**
     * Create Wallet Offers
     *
     * Adds offers to the wallet
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Wallet Offers", tags={ "Wallet" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OfferTransactionResponse.class, responseContainer = "List") })
    public List<OfferTransactionResponse> createOfferTransaction(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("offerId") Long offerId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("offerCart") String offerCart, @QueryParam("promoCode") String promoCode, @QueryParam("currencyType") @DefaultValue("CASH")String currencyType, @QueryParam("usePoints") Boolean usePoints, @QueryParam("metaData") String metaData, @QueryParam("appKey") String appKey, @QueryParam("status") Integer status);

    /**
     * Delete Wallet Offer
     *
     * Removes the transaction from the wallet by setting the deleted date to the current date/time.  Requires a valid account and transactionId.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Wallet Offer", tags={ "Wallet" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteOfferTransaction(@PathParam("version") BigDecimal version, @QueryParam("transactionId") @NotNull Long transactionId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId);

    /**
     * Get Wallet Offer
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Wallet Offer", tags={ "Wallet" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OfferTransactionResponse.class) })
    public OfferTransactionResponse getOfferTransaction(@PathParam("version") BigDecimal version, @QueryParam("transactionId") @NotNull Long transactionId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("includeMission") @DefaultValue("false")Boolean includeMission, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("returnFullResponse") @DefaultValue("true")Boolean returnFullResponse);

    /**
     * Preview Wallet Offers
     *
     * Preview the final cost of a transaction without charging the user
     *
     */
    @POST
    @Path("/preview")
    @Produces({ "*/*" })
    @ApiOperation(value = "Preview Wallet Offers", tags={ "Wallet" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OfferTransactionResponse.class, responseContainer = "List") })
    public List<OfferTransactionResponse> previewOfferTransaction(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("offerId") Long offerId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("offerCart") String offerCart, @QueryParam("promoCode") String promoCode, @QueryParam("currencyType") @DefaultValue("CASH")String currencyType, @QueryParam("usePoints") Boolean usePoints, @QueryParam("metaData") String metaData, @QueryParam("appKey") String appKey);

    /**
     * Search Wallet Offers
     *
     * Search on active offers currently in the user&#39;s wallet, or past offers the user has already redeemed.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Wallet Offers", tags={ "Wallet" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OfferTransactionResponse.class, responseContainer = "List") })
    public List<OfferTransactionResponse> searchOfferTransactions(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerIds") String retailerIds, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("excludeRetailerLocationIds") String excludeRetailerLocationIds, @QueryParam("offerId") Long offerId, @QueryParam("offerIds") String offerIds, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("offerLocationIds") String offerLocationIds, @QueryParam("offerType") String offerType, @QueryParam("offerTypes") String offerTypes, @QueryParam("specialOfferType") String specialOfferType, @QueryParam("specialOfferTypes") String specialOfferTypes, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("offerAudienceIds") String offerAudienceIds, @QueryParam("sortField") @DefaultValue("CREATED")String sortField, @QueryParam("descending") @DefaultValue("true")Boolean descending, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("redeemableStartDate") Long redeemableStartDate, @QueryParam("redeemableEndDate") Long redeemableEndDate, @QueryParam("filterByParentOffer") @DefaultValue("false")Boolean filterByParentOffer, @QueryParam("startedSince") Long startedSince, @QueryParam("startedBefore") Long startedBefore, @QueryParam("endedSince") Long endedSince, @QueryParam("endedBefore") Long endedBefore, @QueryParam("redeemed") @DefaultValue("false")Boolean redeemed, @QueryParam("statuses") String statuses, @QueryParam("reservationsOnly") @DefaultValue("false")Boolean reservationsOnly, @QueryParam("activeOnly") @DefaultValue("false")Boolean activeOnly, @QueryParam("returnFullResponse") @DefaultValue("false")Boolean returnFullResponse, @QueryParam("recurringStartedSince") Long recurringStartedSince, @QueryParam("recurringStartedBefore") Long recurringStartedBefore, @QueryParam("recurringExpirationSince") Long recurringExpirationSince, @QueryParam("recurringExpirationBefore") Long recurringExpirationBefore);

    /**
     * Update Wallet Offer
     *
     * Update offer status. The status values are: 0 - not redeemable, 1 - redeemable.  Not redeemable means the customer has received the offer but has not decided to use (or print) it yet.  Until they choose to do this the merchant cannot redeem the offer (has not been given permission yet).   Redeemable means the customer has chosen to use the offer and wishes to redeem it.  Redeemed means the merchant has accepted the offer and the given the customer its value, then marked it a used in the system.  This status change is handled by a merchant end point.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Wallet Offer", tags={ "Wallet" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OfferTransactionResponse.class) })
    public OfferTransactionResponse updateOfferTransaction(@PathParam("version") BigDecimal version, @QueryParam("transactionId") @NotNull Long transactionId, @QueryParam("status") @NotNull Integer status, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("currencyType") @DefaultValue("CASH")String currencyType, @QueryParam("usePoints") Boolean usePoints, @QueryParam("appKey") String appKey, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("metaData") String metaData, @QueryParam("returnFullResponse") @DefaultValue("false")Boolean returnFullResponse, @QueryParam("exceptionMembershipOfferIds") String exceptionMembershipOfferIds);
}
