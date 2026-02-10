package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.MediaOfferResponse;
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
public class MediaApiServiceImpl implements MediaApi {
    /**
     * Create Media
     *
     * Create a media offering.
     *
     */
    public MediaOfferResponse createMedia(BigDecimal version, Long accountId, String title, String barcodeType, Boolean noExpiration, Integer availableLimit, Integer availableLimitPerUser, Integer addedLimit, Integer viewLimit, Integer maxPrints, Long ticketPrice, Double fullPrice, Double discountPrice, String specialOfferType, String offerVisibility, Boolean active, String retailerLocationIds, String subTitle, String details, String subDetails, String finePrint, String barcodeEntry, String externalRedeemOptions, String externalUrl, String ticketsRewardType, Long ticketsReward, Long activated, Long expires, String ticketPriceType, Boolean showRemaining, Boolean showRedeemed, Boolean replaced, Boolean featured, String categoryIds, String filterIds, Long barcodeAssetId, Long imageAssetId, Long imageAssetId1, Long imageAssetId2, Long imageAssetId3, Long imageAssetId4, Long imageAssetId5, String publisher, Long redeemableStart, Long redeemableEnd, String conditionType, String isbn, String asin, String catalogNumbers, String parentalRating, Long availabilityDate, String mediaType, Integer duration, String author, Long releaseDate, String collectionIds, String availability, String availabilitySummary) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Media
     *
     * Delete a media offering that the user has permissions to.
     *
     */
    public SirqulResponse deleteMedia(BigDecimal version, Long accountId, Long mediaId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Media Get
     *
     * Get a media offering.
     *
     */
    public MediaOfferResponse getMedia(BigDecimal version, Long accountId, Long mediaId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Media
     *
     * Searches on events that the account has access to.
     *
     */
    public List<MediaOfferResponse> searchMedia(BigDecimal version, Long accountId, Boolean activeOnly, String sortField, Boolean descending, String keyword, String categoryIds, String filterIds, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Media
     *
     * Update a media offering.
     *
     */
    public MediaOfferResponse updateMedia(BigDecimal version, Long accountId, Long mediaId, String retailerLocationIds, String offerLocations, String title, String subTitle, String details, String subDetails, String finePrint, String barcodeType, String barcodeEntry, String externalRedeemOptions, String externalUrl, String ticketsRewardType, Long ticketsReward, Long activated, Long expires, Boolean noExpiration, Integer availableLimit, Integer availableLimitPerUser, Integer addedLimit, Integer viewLimit, Integer maxPrints, String ticketPriceType, Long ticketPrice, Double fullPrice, Double discountPrice, Boolean showRemaining, Boolean showRedeemed, Boolean replaced, Boolean featured, String specialOfferType, String offerVisibility, String categoryIds, String filterIds, Boolean active, Long barcodeAssetId, Long imageAssetId, Long imageAssetId1, Long imageAssetId2, Long imageAssetId3, Long imageAssetId4, Long imageAssetId5, String publisher, Long redeemableStart, Long redeemableEnd, String conditionType, String isbn, String asin, String catalogNumbers, Long availabilityDate, String parentalRating, String mediaType, Integer duration, String author, Long releaseDate, String collectionIds, String availability, String availabilitySummary) {
        // TODO: Implement...

        return null;
    }

}
