package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.RatingIndexResponse;
import org.openapitools.model.RatingResponse;
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
public class RatingApiServiceImpl implements RatingApi {
    /**
     * Create Rating
     *
     * This is used to leave rating on a ratable object (i.e. retailer locations). Each user can only rate on a ratable object once per category. If a user rates on the same object and category, the previous rating will be overwritten. Leaving a rating on a ratable object will be visible to everyone who has access to view the object.
     *
     */
    public RatingResponse createRating(BigDecimal version, String ratableType, Long ratableId, Integer ratingValue, String deviceId, Long accountId, Long categoryId, String display, String description, String locationDescription, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Rating
     *
     * Sets a rating as deleted.
     *
     */
    public SirqulResponse deleteRating(BigDecimal version, Long ratingId, String deviceId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Location Rating Indexes
     *
     * Search for retailer locations by averages near you.
     *
     */
    public List<RatingIndexResponse> searchLocationRatingIndexes(BigDecimal version, String categoryIds, String keyword, String locationType, String sortField, Boolean descending, Integer start, Integer limit, Double searchRange, Double latitude, Double longitude, Boolean returnOverallRating, String distanceUnit, Boolean returnRetailer, Boolean returnAssets, Boolean returnOffers, Boolean returnCategories, Boolean returnFilters) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Rating Indexes
     *
     * Search for ratable items by averages.
     *
     */
    public List<RatingIndexResponse> searchRatingIndexes(BigDecimal version, String ratableType, String ratableIds, String categoryIds, String secondaryType, String keyword, String sortField, Boolean descending, Integer start, Integer limit, Double latitude, Double longitude, Boolean returnRatable, Boolean returnOverallRating) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Ratings
     *
     * Search for ratings on a ratable object.
     *
     */
    public List<RatingResponse> searchRatings(BigDecimal version, String deviceId, Long accountId, Long filterAccountId, String ratableType, Long ratableId, String categoryIds, String keyword, String sortField, Boolean descending, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Rating
     *
     * Update an existing rating. Only the creator of the rating have permission to update.
     *
     */
    public RatingResponse updateRating(BigDecimal version, Long ratingId, String deviceId, Long accountId, Integer ratingValue, Long categoryId, String display, String description, String locationDescription, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

}
