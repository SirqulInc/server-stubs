package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.Trip;

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
public class TripApiServiceImpl implements TripApi {
    /**
     * Create Trip
     *
     * Create a new trip
     *
     */
    public Trip createTrip(BigDecimal version, Trip body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Trip
     *
     * Delete an existing trip
     *
     */
    public void delete(BigDecimal version, Long id) {
        // TODO: Implement...

        
    }

    /**
     * Set Trip Preference Driver
     *
     * Update trip preference to drive, also create a route and assign the trip to the route
     *
     */
    public Trip driveTrip(BigDecimal version, Long id, Boolean recurrence) {
        // TODO: Implement...

        return null;
    }

    /**
     * Set Trip Preference Flexible
     *
     * Update trip preference to flexible.
     *
     */
    public Trip flexibleTrip(BigDecimal version, Long id, Boolean recurrence) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Trip
     *
     * Get an existing trip
     *
     */
    public Trip getTrip(BigDecimal version, Long id) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Trip Matches
     *
     * Get matching trips of specific trip
     *
     */
    public List<Trip> getTripMatches(BigDecimal version, Long id, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly, Boolean matchedHasRoute, Boolean matchedHasDriver) {
        // TODO: Implement...

        return null;
    }

    /**
     * Process Trip Matches
     *
     * Process trip matching, assign trips with no route to matched trips with route.
     *
     */
    public List<Trip> processTripMatches(BigDecimal version, Long startDate, Long endDate, Long tripId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Set Trip Preference Rider
     *
     * Update trip preference to ride.
     *
     */
    public Trip ride(BigDecimal version, Long id, Boolean recurrence) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Trips
     *
     * Search for trips
     *
     */
    public List<Trip> search(BigDecimal version, Long accountId, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly, Long startDate, Long endDate, Boolean hasNotifications) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Trips
     *
     * Search for trips with matching information.
     *
     */
    public List<Trip> searchTrips(BigDecimal version, Long accountId, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly, Long startDate, Long endDate, Boolean matchedHasRoute, Boolean matchedHasDriver) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Trip Locations
     *
     */
    public Trip updateLocations(BigDecimal version, Long id, Trip body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Recurrence Locations
     *
     */
    public List<Trip> updateRecurrenceLocations(BigDecimal version, Long id, Trip body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Recurrence Shipments
     *
     */
    public List<Trip> updateRecurrenceShipments(BigDecimal version, Long id, Trip body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Trip Shipments
     *
     */
    public Trip updateShipments(BigDecimal version, Long id, Trip body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Trip
     *
     * Update an existing trip. Does not support recurring trip update.
     *
     */
    public Trip updateTrip(BigDecimal version, Long id, Trip body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Trip Notifications
     *
     * Update the trip notifications
     *
     */
    public Trip updateTripNotifications(BigDecimal version, Long id, String notifications) {
        // TODO: Implement...

        return null;
    }

}
