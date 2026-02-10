package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AccountMiniResponse;
import java.math.BigDecimal;
import org.openapitools.model.Leg;
import org.openapitools.model.LegResponse;
import org.openapitools.model.PredictedLocationResponse;
import org.openapitools.model.PreferredLocationResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.StepResponse;

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
public class TrackingApiServiceImpl implements TrackingApi {
    /**
     * Create Batch Tracking
     *
     * Batch create tracking legs
     *
     */
    public List<Leg> batchSaveTracking(BigDecimal version, String data, String deviceId, Long accountId, Boolean generateAccounts, Boolean updateAccountLocations, String defaultTag, String slaveUID) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Predicted Locations
     *
     * Get the predicted location for a customer based on previous behavior.  If a customer resides in a place for a period of time this is marked as a preferred location.  We look back over the previous few days and the previous days of the week from the day specified.  If for instance the day was a Wednesday then this would check the days before, including: Tuesday, Monday, Sunday, etc. It will also check some number of previous Wednesdays in the past few weeks.
     *
     */
    public PredictedLocationResponse getPredictedLocations(BigDecimal version, Long accountId, Double latitude, Double longitude, Long dateCheck, String hourCheck, Long threshold, String distanceUnit, Double searchRange, String sortOrder) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Tracking Path
     *
     * Get the path (lat/long coordinates) between 2 steps previously logged for a customer.
     *
     */
    public List<StepResponse> getPredictedPath(BigDecimal version, Long accountId, Long startStepId, Long endStepId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Preferred Locations
     *
     * Search on preferred locations for a user, which is created when a customer resides in a place for a period of time.
     *
     */
    public List<PreferredLocationResponse> getPreferredLocations(BigDecimal version, Long accountId, Double latitude, Double longitude, Long dateCheck, String hourCheck, String sortField, Boolean descending, Integer start, Integer limit, Double searchRange, String distanceUnit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Tracking
     *
     * Retrieve tracking data to be able to show where a user has been.
     *
     */
    public List<LegResponse> getTrackingLegs(BigDecimal version, String deviceId, Long accountId, Long ownerId, String trackingDeviceId, Long startDate, Long endDate, String tags, Boolean getLastPoint) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Tracking Leg
     *
     * Send tracking points to be able to generate pathing data
     *
     */
    public SirqulResponse saveTrackingLeg(BigDecimal version, Double startLat, Double startLng, Long startDate, Double endLat, Double endLng, Long endDate, String deviceId, Long accountId, Double distance, Long duration, String steps, String tags) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Tracking Step
     *
     * Send tracking points to be able to generate pathing data
     *
     */
    public SirqulResponse saveTrackingStep(BigDecimal version, Long legId, Double startLat, Double startLng, Long startDate, Double endLat, Double endLng, Long endDate, String deviceId, Long accountId, Double distance, Long duration) {
        // TODO: Implement...

        return null;
    }

    /**
     * List Tracking
     *
     * Search for all accounts that have tracking legs data by the given constraints.
     *
     */
    public List<AccountMiniResponse> searchAccountsWithTrackingLegs(BigDecimal version, Long accountId, String keyword, Long startDate, Long endDate, String tags, String audienceIds, Double latitude, Double longitude, Double range, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Tracking (Billable)
     *
     * Retrieve tracking data for billable/account scoped queries.
     *
     */
    public List<LegResponse> searchTrackingLegs(BigDecimal version, Long accountId, String appKey, String trackingDeviceId, Long startDate, Long endDate, String tags, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

}
