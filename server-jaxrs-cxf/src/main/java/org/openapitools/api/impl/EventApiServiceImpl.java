package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.EventAttendanceResponse;
import org.openapitools.model.OfferResponse;
import org.openapitools.model.OfferShortResponse;
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
public class EventApiServiceImpl implements EventApi {
    /**
     * Attend Event
     *
     *  Specify whether the user is attending an event at a particular location. This can also be used as a \&quot;check-in\&quot; action.
     *
     */
    public OfferResponse attendEvent(BigDecimal version, String deviceId, Long accountId, String appKey, Long listingId, Long retailerLocationId, Long offerLocationId, Long transactionId, Integer status, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Event
     *
     * Create a private event to share with associates.
     *
     */
    public OfferResponse createEvent(BigDecimal version, Long accountId, String title, String retailerLocationIds, String subTitle, String details, String categoryIds, String filterIds, Boolean active, Long imageAssetId, Long redeemableStart, Long redeemableEnd, String metaData) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Event
     *
     * Delete an event that the user has permissions to.
     *
     */
    public SirqulResponse deleteEvent(BigDecimal version, Long accountId, Long eventId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Event
     *
     * Get an event.
     *
     */
    public OfferResponse getEvent(BigDecimal version, Long accountId, Long eventId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Event Attendance
     *
     * Searches on event type transactions. This can be used to see who is attending an event.
     *
     */
    public List<EventAttendanceResponse> searchEventTransactions(BigDecimal version, String deviceId, Long accountId, String appKey, String keyword, Long retailerId, Long retailerLocationId, Long excludeRetailerLocationId, Long listingId, Long offerId, Long offerLocationId, String customerAccountIds, String affiliatedCategoryIds, Long startDate, Long endDate, String statuses, String sortField, Boolean descending, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Events
     *
     * Searches on events that the account has access to.
     *
     */
    public List<OfferShortResponse> searchEvents(BigDecimal version, Long accountId, String keyword, Boolean activeOnly, String categoryIds, String filterIds, String offerAudienceIds, String transactionAudienceIds, String sortField, Boolean descending, Long startDate, Long endDate, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Event
     *
     * Update a private event to share with associates.
     *
     */
    public OfferResponse updateEvent(BigDecimal version, Long accountId, Long eventId, String retailerLocationIds, String title, String subTitle, String details, String categoryIds, String filterIds, Boolean active, Long imageAssetId, Long redeemableStart, Long redeemableEnd) {
        // TODO: Implement...

        return null;
    }

}
