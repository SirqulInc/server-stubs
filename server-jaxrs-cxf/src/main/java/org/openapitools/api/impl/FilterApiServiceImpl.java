package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.FilterResponse;
import org.openapitools.model.FilterTreeResponse;
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
public class FilterApiServiceImpl implements FilterApi {
    /**
     * Create Filter
     *
     * Create a filter
     *
     */
    public FilterTreeResponse createFilter(BigDecimal version, Long accountId, String name, String appKey, Long parentFilterId, String description, String externalId, String externalType, Boolean active, String metaData) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Filter
     *
     * Delete a filter.
     *
     */
    public SirqulResponse deleteFilter(BigDecimal version, Long accountId, Long filterId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Filter
     *
     * Get the details of a specific filter. Recursively include all child filters and their children.
     *
     */
    public FilterTreeResponse getFilter(BigDecimal version, Long filterId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Filters
     *
     * Search for filters.
     *
     */
    public List<FilterResponse> searchFilters(BigDecimal version, Long accountId, String keyword, String appKey, String responseGroup, Boolean rootOnly, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Filter
     *
     * Update a filter.
     *
     */
    public FilterTreeResponse updateFilter(BigDecimal version, Long accountId, Long filterId, Long parentFilterId, String name, String description, String externalId, String externalType, Boolean active, String metaData) {
        // TODO: Implement...

        return null;
    }

}
