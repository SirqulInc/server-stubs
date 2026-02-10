package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.OfferTransactionStatusResponse;
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
public class OfferStatusApiServiceImpl implements OfferStatusApi {
    /**
     * Create Offer Status
     *
     * Create an offer status record
     *
     */
    public OfferTransactionStatusResponse createOfferTransactionStatus(BigDecimal version, String name, Integer code, String deviceId, Long accountId, Double latitude, Double longitude, String description, String role, Boolean active, String applicationIds) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Offer Status
     *
     * Mark an offer status record as deleted
     *
     */
    public SirqulResponse deleteOfferTransactionStatus(BigDecimal version, Long statusId, String deviceId, Long accountId, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Offer Status
     *
     * Get an offer status record
     *
     */
    public OfferTransactionStatusResponse getOfferTransactionStatus(BigDecimal version, Long statusId, String deviceId, Long accountId, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Offer Status
     *
     * Search for the available offer statuses
     *
     */
    public List<OfferTransactionStatusResponse> searchOfferTransactionStatuses(BigDecimal version, String deviceId, Long accountId, Double latitude, Double longitude, String keyword, String role, String appKey, String sortField, Boolean descending, Integer start, Integer limit, Boolean includeInactive) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Offer Status
     *
     * Update an offer status record
     *
     */
    public OfferTransactionStatusResponse updateOfferTransactionStatus(BigDecimal version, String deviceId, Long accountId, Double latitude, Double longitude, Long statusId, String name, String description, Integer code, String role, Boolean active, String applicationIds) {
        // TODO: Implement...

        return null;
    }

}
