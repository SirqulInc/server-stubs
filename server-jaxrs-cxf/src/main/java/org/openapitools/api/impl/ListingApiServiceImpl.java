package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.ListingFullResponse;
import org.openapitools.model.ListingGroupResponse;
import org.openapitools.model.ListingResponse;
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
public class ListingApiServiceImpl implements ListingApi {
    /**
     * Create Listing
     *
     * Creates a listing.
     *
     */
    public ListingFullResponse createListing(BigDecimal version, Long accountId, String name, String filterIds, String description, Long start, Long end, String locationName, String locationDescription, Boolean isPrivate, String externalId, String externalId2, String externalGroupId, Boolean active, String metaData) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Listing
     *
     * Delete a listing.
     *
     */
    public SirqulResponse deleteListing(BigDecimal version, Long accountId, Long listingId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Listing
     *
     * Get a listing by id.
     *
     */
    public ListingFullResponse getListing(BigDecimal version, Long listingId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Listings
     *
     * Search for event listings from the start time to end time
     *
     */
    public List<ListingResponse> searchListing(BigDecimal version, Long accountId, String keyword, Integer start, Integer limit, Boolean activeOnly, Double latitude, Double longitude, Long startDate, Long endDate, String categoryIds, String filterIds, Boolean useListingOrderIds, String externalId, String externalId2, String externalGroupId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Summary Listing
     *
     * Search for a list of summary listings from the start time up to 8 days out.
     *
     */
    public List<ListingGroupResponse> summaryListing(BigDecimal version, Long accountId, Long startDate, String categoryIds, Integer daysToInclude, Boolean useListingOrderIds) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Listing
     *
     * Updates a listing.
     *
     */
    public ListingFullResponse updateListing(BigDecimal version, Long accountId, Long listingId, String filterIds, String name, String description, Long start, Long end, String locationName, String locationDescription, Boolean isPrivate, String externalId, String externalId2, String externalGroupId, Boolean active, String metaData) {
        // TODO: Implement...

        return null;
    }

}
