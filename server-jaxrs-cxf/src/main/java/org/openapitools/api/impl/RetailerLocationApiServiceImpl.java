package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import java.io.File;
import org.openapitools.model.RetailerLocationResponse;
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
public class RetailerLocationApiServiceImpl implements RetailerLocationApi {
    /**
     * Create Retailer Location (Consumer)
     *
     * Creates a location record for an application that can support crowd sourced locations.
     *
     */
    public RetailerLocationResponse createRetailerLocationConsumer(BigDecimal version, String appKey, String name, String deviceId, Long accountId, String streetAddress, String streetAddress2, String city, String state, String postalCode, String country, String businessPhone, String businessPhoneExt, String website, String email, String detailsHeader, String detailsBody, String hours, String tags, Long logoAssetId, Long picture1AssetId, Long picture2AssetId, String categoryIds, String filterIds, String metaData, Boolean publicLocation, Boolean active, String locationType, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Retailer Location
     *
     * Creates a location record for a retailer. Only the owner and the employees of the retailer have access to do this.
     *
     */
    public RetailerLocationResponse createRetailerLocations(BigDecimal version, Long retailerId, String name, String streetAddress, String city, String state, String postalCode, String deviceId, Long accountId, String streetAddress2, String country, String businessPhone, String businessPhoneExt, String website, String email, String internalId, String detailsHeader, String detailsBody, String hours, File logo, Long logoAssetId, File picture1, Long picture1AssetId, File picture2, Long picture2AssetId, String categoryIds, String filterIds, Double latitude, Double longitude, String building, String googlePlaceId, String yelpId, Boolean active, Boolean publicLocation, String locationType, String audienceIds, String audienceIdsToAdd, String audienceIdsToRemove, String responseFormat, String responseIncludes) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Retailer Location
     *
     * Set the deleted timestamp to current time. This effectively deletes the retailer location since all queries should ignore any records with a deleted time stamp.
     *
     */
    public SirqulResponse deleteRetailerLocation(BigDecimal version, String deviceId, Long accountId, Long retailerLocationId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Retailer Location
     *
     * Gets a retailer location. Only the owner and the employees of the retailer have access to view its information.
     *
     */
    public RetailerLocationResponse getRetailerLocation(BigDecimal version, Long retailerLocationId, String deviceId, Long accountId, String retailerLocationToken) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Retailer Location (Consumer)
     *
     * Gets the details of a retailer location as a consumer.
     *
     */
    public RetailerLocationResponse getRetailerLocationConsumer(BigDecimal version, Long retailerLocationId, String deviceId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Distance Search Retailer Locations (Indexed)
     *
     * Retailer location indexed search by distance. This searches on any retailer location with location data and returns the results sorted by distance.
     *
     */
    public List<RetailerLocationResponse> indexedRetailerLocationDistanceSearch(BigDecimal version, Double latitude, Double longitude, Double searchRange, Integer start, Integer limit, Long accountId, String address, Boolean hasOffers, String categories, String filters, String audiences, String retailerIds, String retailerLocationIds, String tags, String locationType, String sortField, Boolean descending, String q, String keyword, String keywordOperator, String searchExpression, String distanceUnit, Boolean returnFavorited, Boolean returnRetailer, Boolean returnAssets, Boolean returnOffers, Boolean returnCategories, Boolean returnFilters, Boolean returnAudiences, Boolean returnQrCode, Boolean returnExternalCategoryData, Boolean includeFavorite, Boolean includeLiked, Boolean includeRating) {
        // TODO: Implement...

        return null;
    }

    /**
     * Keyword Search Retailer Locations (Indexed)
     *
     * Retailer location (faster) indexed search. This searches all retailer locations.
     *
     */
    public List<RetailerLocationResponse> indexedRetailerLocationSearch(BigDecimal version, Long accountId, Integer start, Integer limit, Boolean hasOffers, String categories, String filters, String audiences, String retailerIds, String retailerLocationIds, String tags, String locationType, String sortField, Boolean descending, String q, String keyword, String keywordOperator, String searchExpression, Boolean returnRetailer, Boolean returnAssets, Boolean returnOffers, Boolean returnCategories, Boolean returnFilters, Boolean returnAudiences, Boolean returnQrCode, Boolean returnExternalCategoryData, Boolean includeFavorite, Boolean includeLiked, Boolean includeRating) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Retailer Locations (Owned)
     *
     * Searches on retailer locations that the account has access to.
     *
     */
    public List<RetailerLocationResponse> searchRetailerLocations(BigDecimal version, String deviceId, Long accountId, String q, String keyword, String retailerIds, String retailerLocationIds, String locationType, String sortField, Boolean descending, Integer i, Integer start, Integer l, Integer limit, Boolean showPublicLocations, Boolean activeOnly, Boolean returnRetailer, Boolean returnAssets, Boolean returnOffers, Boolean returnCategories, Boolean returnFilters, Boolean returnAudiences, Boolean returnQrCode, Boolean includeFavorite, Boolean includeLiked, Boolean includeRating) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Retailer Location
     *
     * Updates a location record for a retailer. Only the owner and the employees of the retailer have access to do this.
     *
     */
    public RetailerLocationResponse updateRetailerLocations(BigDecimal version, Long retailerLocationId, String deviceId, Long accountId, String name, String streetAddress, String streetAddress2, String city, String state, String postalCode, String country, String businessPhone, String businessPhoneExt, String website, String email, String internalId, String detailsHeader, String detailsBody, String hours, File logo, Long logoAssetId, File picture1, Long picture1AssetId, File picture2, Long picture2AssetId, String categoryIds, String filterIds, Double latitude, Double longitude, String building, String googlePlaceId, String yelpId, String metaData, String paymentProvider, Boolean active, Boolean publicLocation, String locationType, String audienceIds, String audienceIdsToAdd, String audienceIdsToRemove, String responseFormat, String tags) {
        // TODO: Implement...

        return null;
    }

}
