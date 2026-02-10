package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import java.io.File;
import org.openapitools.model.PaymentRequest;
import org.openapitools.model.ProfileResponse;
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
public class SecureAppApiServiceImpl implements SecureAppApi {
    /**
     * Create Secure Application
     *
     * Create a secure application record.
     *
     */
    public SirqulResponse createSecureApplication(BigDecimal version, Long accountId, String appKey, File keyCert, File trustStore, String username, String password, Boolean active, String biometricType, String biometricPosition, String biometricPosition2) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Secure Application
     *
     * Delete a secure application record.
     *
     */
    public SirqulResponse deleteSecureApplication(BigDecimal version, Long accountId, String appKey) {
        // TODO: Implement...

        return null;
    }

    /**
     * Login Clear
     *
     * Login via Clear.me. Creates a new account if logging in for the first time.
     *
     */
    public ProfileResponse loginSecure(BigDecimal version, String appKey, File biometricFile, String deviceId, File biometricFile2, Integer ageRestriction, Boolean returnProfile, String responseFilters, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Purchase Clear
     *
     * Purchase via Clear.me. Creates a new account if purchasing for the first time.
     *
     */
    public ProfileResponse purchaseSecure(BigDecimal version, PaymentRequest body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Rest Secure Application
     *
     * Reset a secure application client.
     *
     */
    public SirqulResponse resetSecure(BigDecimal version, Long accountId, String appKey) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Secure Application
     *
     * Update a secure application record.
     *
     */
    public SirqulResponse updateSecureApplication(BigDecimal version, Long accountId, String appKey, Boolean active, File keyCert, File trustStore, String username, String password, String biometricType, String biometricPosition, String biometricPosition2) {
        // TODO: Implement...

        return null;
    }

}
