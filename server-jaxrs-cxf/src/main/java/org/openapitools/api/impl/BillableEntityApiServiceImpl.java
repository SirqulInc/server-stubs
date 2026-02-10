package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.BillableEntityResponse;
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
public class BillableEntityApiServiceImpl implements BillableEntityApi {
    /**
     * Create Billable
     *
     * reate a billable entity for an account. The creator is assumed to be the responsible account. An account can only have one billable entity
     *
     */
    public BillableEntityResponse createBillableEntity(BigDecimal version, String deviceId, Long accountId, String name, String streetAddress, String streetAddress2, String city, String state, String postalCode, String businessPhone, String businessPhoneExt, String authorizeNetApiKey, String authorizeNetTransactionKey) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Billable
     *
     * Mark the billable as deleted
     *
     */
    public SirqulResponse deleteBillableEntity(BigDecimal version, String deviceId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Billable
     *
     * Used to determine the associated BillableEntity of an account
     *
     */
    public BillableEntityResponse getBillableEntity(BigDecimal version, String deviceId, Long accountId, Boolean includeCounts, Boolean includePayments) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Billable
     *
     * Updates the billable record for an account
     *
     */
    public BillableEntityResponse updateBillableEntity(BigDecimal version, String deviceId, Long accountId, String name, String streetAddress, String streetAddress2, String city, String state, String postalCode, String businessPhone, String businessPhoneExt, String authorizeNetApiKey, String authorizeNetTransactionKey) {
        // TODO: Implement...

        return null;
    }

}
