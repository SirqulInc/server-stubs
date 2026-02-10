package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.DisbursementResponse;

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
public class DisbursementApiServiceImpl implements DisbursementApi {
    /**
     * Check Disbursements
     *
     * Checks the status of a captured disbrusement to see if it has been settled.
     *
     */
    public DisbursementResponse checkDisbursements(BigDecimal version, Long disbursementId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Disbursement
     *
     * Creates a Disbursement for sending money to a retailer
     *
     */
    public DisbursementResponse createDisbursement(BigDecimal version, Long accountId, Long receiverAccountId, Long originalSenderAccountId, BigDecimal amount, String provider, Long scheduledDate, String title, String comment, String externalId, String introspectionParams) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Disbursement
     *
     * Get Disbursement details
     *
     */
    public DisbursementResponse getDisbursement(BigDecimal version, Long accountId, Long disbursementId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Disbursements
     *
     * Search Disbursements
     *
     */
    public List<DisbursementResponse> searchDisbursements(BigDecimal version, Long accountId, Long receiverAccountId, String statuses, String providers, Long beforeDate, Long afterDate, Integer start, Integer limit, Boolean activeOnly, String externalId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Disbursement
     *
     * Update Disbursement
     *
     */
    public DisbursementResponse updateDisbursement(BigDecimal version, Long accountId, Long disbursementId, BigDecimal amount, String provider, Long scheduledDate, String title, String comment, String externalId, Boolean retry, String introspectionParams) {
        // TODO: Implement...

        return null;
    }

}
