package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AvailabilityResponse;
import java.math.BigDecimal;
import org.openapitools.model.ReservationResponse;
import org.openapitools.model.TimeSlotResponse;

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
public class ReservationApiServiceImpl implements ReservationApi {
    /**
     * Create Reservation
     *
     * Creates a reservation on an offer object
     *
     */
    public void createReservation(BigDecimal version, String deviceId, Long accountId, Long startDate, Long endDate, Long offerId, Long offerLocationId, String appKey, String metaData) {
        // TODO: Implement...

        
    }

    /**
     * Delete Reservation
     *
     * Deleted a reservation on a reservation object
     *
     */
    public void deleteReservation(BigDecimal version, Long reservationId, String deviceId, Long accountId) {
        // TODO: Implement...

        
    }

    /**
     * Update Availability
     *
     */
    public List<AvailabilityResponse> reservableAvailability(BigDecimal version, Long reservableId, String reservableType, String deviceId, Long accountId, String availability, String availabilitySummary) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Availability
     *
     */
    public List<AvailabilityResponse> searchAvailability(BigDecimal version, Long reservableId, String reservableType, String deviceId, Long accountId, Long startDate, Long endDate, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Reservations
     *
     */
    public List<ReservationResponse> searchReservations(BigDecimal version, String deviceId, String appKey, Long accountId, Long filterAccountId, Long reservableId, String reservableType, String keyword, Long startDate, Long endDate, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Schedule
     *
     */
    public List<TimeSlotResponse> searchSchedule(BigDecimal version, Long reservableId, String reservableType, Long startDate, Long endDate, String deviceId, Long accountId, Integer timeBucketMins) {
        // TODO: Implement...

        return null;
    }

}
