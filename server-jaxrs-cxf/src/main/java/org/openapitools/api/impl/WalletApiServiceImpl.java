package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.OfferTransactionResponse;
import org.openapitools.model.SirqulResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
public class WalletApiServiceImpl implements WalletApi {
    /**
     * Create Wallet Offers
     *
     * Adds offers to the wallet
     *
     */
    public List<OfferTransactionResponse> createOfferTransaction(BigDecimal version, String deviceId, Long accountId, Long offerId, Long offerLocationId, String offerCart, String promoCode, String currencyType, Boolean usePoints, String metaData, String appKey, Integer status) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Wallet Offer
     *
     * Removes the transaction from the wallet by setting the deleted date to the current date/time.  Requires a valid account and transactionId.
     *
     */
    public SirqulResponse deleteOfferTransaction(BigDecimal version, Long transactionId, String deviceId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Wallet Offer
     *
     */
    public OfferTransactionResponse getOfferTransaction(BigDecimal version, Long transactionId, String deviceId, Long accountId, Boolean includeMission, Double latitude, Double longitude, Boolean returnFullResponse) {
        // TODO: Implement...

        return null;
    }

    /**
     * Preview Wallet Offers
     *
     * Preview the final cost of a transaction without charging the user
     *
     */
    public List<OfferTransactionResponse> previewOfferTransaction(BigDecimal version, String deviceId, Long accountId, Long offerId, Long offerLocationId, String offerCart, String promoCode, String currencyType, Boolean usePoints, String metaData, String appKey) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Wallet Offers
     *
     * Search on active offers currently in the user&#39;s wallet, or past offers the user has already redeemed.
     *
     */
    public List<OfferTransactionResponse> searchOfferTransactions(BigDecimal version, String deviceId, Long accountId, String keyword, Long retailerId, String retailerIds, Long retailerLocationId, String retailerLocationIds, String excludeRetailerLocationIds, Long offerId, String offerIds, Long offerLocationId, String offerLocationIds, String offerType, String offerTypes, String specialOfferType, String specialOfferTypes, String categoryIds, String filterIds, String offerAudienceIds, String sortField, Boolean descending, Integer start, Integer limit, Double latitude, Double longitude, Long redeemableStartDate, Long redeemableEndDate, Boolean filterByParentOffer, Long startedSince, Long startedBefore, Long endedSince, Long endedBefore, Boolean redeemed, String statuses, Boolean reservationsOnly, Boolean activeOnly, Boolean returnFullResponse, Long recurringStartedSince, Long recurringStartedBefore, Long recurringExpirationSince, Long recurringExpirationBefore) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Wallet Offer
     *
     * Update offer status. The status values are: 0 - not redeemable, 1 - redeemable.  Not redeemable means the customer has received the offer but has not decided to use (or print) it yet.  Until they choose to do this the merchant cannot redeem the offer (has not been given permission yet).   Redeemable means the customer has chosen to use the offer and wishes to redeem it.  Redeemed means the merchant has accepted the offer and the given the customer its value, then marked it a used in the system.  This status change is handled by a merchant end point.
     *
     */
    public OfferTransactionResponse updateOfferTransaction(BigDecimal version, Long transactionId, Integer status, String deviceId, Long accountId, Long offerLocationId, String currencyType, Boolean usePoints, String appKey, Double latitude, Double longitude, String metaData, Boolean returnFullResponse, String exceptionMembershipOfferIds) {
        // TODO: Implement...

        return null;
    }

}
