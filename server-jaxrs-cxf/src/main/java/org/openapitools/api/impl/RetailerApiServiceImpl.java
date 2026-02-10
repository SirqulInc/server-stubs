package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AccountLoginResponse;
import java.math.BigDecimal;
import java.io.File;
import org.openapitools.model.RetailerFullResponse;
import org.openapitools.model.RetailerResponse;
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
public class RetailerApiServiceImpl implements RetailerApi {
    /**
     * Create Retailer
     *
     * Create a retailer record. A billable entity must be created first before a retailer record can be made.
     *
     */
    public RetailerFullResponse createRetailer(BigDecimal version, String name, String deviceId, Long accountId, String streetAddress, String streetAddress2, String city, String state, String postalCode, String country, String businessPhone, String businessPhoneExt, String website, String email, String facebookUrl, String twitterUrl, File logo, Long logoAssetId, File picture1, Long picture1AssetId, File picture2, Long picture2AssetId, String categoryIds, String categoryIdsToAdd, String categoryIdsToRemove, String filterIds, Double latitude, Double longitude, String metaData, String searchTags, String retailerType, String visibility, Boolean createDefaultLocation, String responseFormat) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Retailer
     *
     * Set the deleted timestamp to current time.
     *
     */
    public SirqulResponse deleteRetailer(BigDecimal version, String deviceId, Long accountId, Long retailerId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Retailer
     *
     * Gets a retailer. Only the owner and the employees of a retailer have access to view its information.
     *
     */
    public RetailerFullResponse getRetailer(BigDecimal version, Long retailerId, String deviceId, Long accountId, Boolean includeCounts) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Retailers
     *
     * earches on retailers that the account has access to.
     *
     */
    public List<RetailerResponse> getRetailers(BigDecimal version, String visibility, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly, String deviceId, Long accountId, String q, String keyword, String categoryIds, String filterIds, Integer i, Integer l) {
        // TODO: Implement...

        return null;
    }

    /**
     * Login Retailer
     *
     * Retailer login check.
     *
     */
    public AccountLoginResponse retailerLoginCheck(BigDecimal version, String username, String password, String deviceId, Double latitude, Double longitude, String appKey) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Retailer
     *
     * Update a retailer record. Only the owner and the employees of the retailer have access to update its information.
     *
     */
    public RetailerFullResponse updateRetailer(BigDecimal version, Long retailerId, String deviceId, Long accountId, String name, String streetAddress, String streetAddress2, String city, String state, String postalCode, String country, String businessPhone, String businessPhoneExt, String website, String email, String facebookUrl, String twitterUrl, File logo, Long logoAssetId, File picture1, Long picture1AssetId, File picture2, Long picture2AssetId, String categoryIds, String filterIds, Double latitude, Double longitude, String metaData, String searchTags, String retailerType, String visibility, Boolean active, String responseFormat) {
        // TODO: Implement...

        return null;
    }

}
