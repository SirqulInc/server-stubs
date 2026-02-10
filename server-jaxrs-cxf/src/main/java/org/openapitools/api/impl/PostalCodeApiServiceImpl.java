package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.PostalCodeResponse;
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
public class PostalCodeApiServiceImpl implements PostalCodeApi {
    /**
     * Create Postal Code
     *
     * Create a Postal Code
     *
     */
    public PostalCodeResponse createPostalCode(BigDecimal version, Long accountId, String code, Double latitude, Double longitude, String stateCode, String city, Boolean active) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Postal Code
     *
     * Delete a Postal Code
     *
     */
    public SirqulResponse deletePostalCode(BigDecimal version, Long accountId, Long postalCodeId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Postal Code
     *
     * Get a Postal Code
     *
     */
    public PostalCodeResponse getPostalCode(BigDecimal version, Long postalCodeId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Postal Codes
     *
     * Get the list of regions. If latitude or longitude is null, will return all postal codes in the system with paginated response.
     *
     */
    public List<PostalCodeResponse> getPostalCodes(BigDecimal version, String sortField, Boolean descending, Double latitude, Double longitude, String keyword, Double miles, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Postal Code
     *
     * Update a Postal Code
     *
     */
    public PostalCodeResponse updatePostalCode(BigDecimal version, Long accountId, Long postalCodeId, String code, Double latitude, Double longitude, String stateCode, String city, Boolean active) {
        // TODO: Implement...

        return null;
    }

}
