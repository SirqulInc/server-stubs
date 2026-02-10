package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.RegionResponse;

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
public class RegionApiServiceImpl implements RegionApi {
    /**
     * Create Region
     *
     * Create a region.
     *
     */
    public RegionResponse createRegion(BigDecimal version, Long accountId, String regionClass, String shortName, String fullName, String parentIds, String childrenIds, String postalCodeIds, String locations, Long retailerLocationId, String visibility, String categoryIds, String filterIds, Long start, Long end, String polygon, String metaData, Double latitude, Double longitude, Integer versionCode, Boolean root, Boolean active) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Region
     *
     * Delete a region.
     *
     */
    public RegionResponse deleteRegion(BigDecimal version, Long accountId, Long regionId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Region
     *
     * Get a region.
     *
     */
    public RegionResponse getRegion(BigDecimal version, Long regionId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Regions
     *
     * Get the list of regions.
     *
     */
    public List<RegionResponse> searchRegions(BigDecimal version, Long accountId, String query, String keyword, Double latitude, Double longitude, Double range, String regionClass, String visibility, String searchMode, String sortField, Boolean descending, Boolean includeParent, Boolean includeChildren, Boolean includePostalCodes, String categoryIds, String filterIds, Integer versionCode, Boolean activeOnly, Boolean showDeleted, Long lastUpdatedSince, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Region
     *
     * Update a region.
     *
     */
    public RegionResponse updateRegion(BigDecimal version, Long accountId, Long regionId, String regionClass, String shortName, String fullName, String parentIds, String childrenIds, String postalCodeIds, String locations, Long retailerLocationId, String visibility, String categoryIds, String filterIds, Long start, Long end, String polygon, String metaData, Double latitude, Double longitude, Integer versionCode, Boolean root, Boolean active, Boolean clearLists) {
        // TODO: Implement...

        return null;
    }

}
