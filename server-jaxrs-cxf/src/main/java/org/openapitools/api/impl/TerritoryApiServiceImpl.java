package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TerritoryResponse;

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
public class TerritoryApiServiceImpl implements TerritoryApi {
    /**
     * Create Territory
     *
     * Creates a territory.
     *
     */
    public TerritoryResponse createTerritory(BigDecimal version, Long accountId, String name, Boolean active) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Territory
     *
     * Deletes a territory.
     *
     */
    public SirqulResponse deleteTerritory(BigDecimal version, Long accountId, Long territoryId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Territory
     *
     * Get a territory.
     *
     */
    public TerritoryResponse getTerritory(BigDecimal version, Long territoryId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Territories
     *
     * Searches on territories.
     *
     */
    public List<TerritoryResponse> searchTerritories(BigDecimal version, String sortField, Boolean descending, String keyword, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Territory
     *
     * Updates a territory.
     *
     */
    public TerritoryResponse updateTerritory(BigDecimal version, Long accountId, Long territoryId, String name, Boolean active) {
        // TODO: Implement...

        return null;
    }

}
