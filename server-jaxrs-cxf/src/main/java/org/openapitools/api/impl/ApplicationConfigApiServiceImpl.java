package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.ApplicationConfigResponse;
import java.math.BigDecimal;
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
public class ApplicationConfigApiServiceImpl implements ApplicationConfigApi {
    /**
     * Create AppConfig
     *
     * Creates a new application configuration. If the configVersion provided already exists for the given app, an invalid response is returned and the application configuration won&#39;t be created.
     *
     */
    public ApplicationConfigResponse createApplicationConfig(BigDecimal version, Long accountId, String appKey, String configVersion, Long assetId, Long retailerId, Long retailerLocationId, String udid) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete AppConfig
     *
     * Mark the application configuration for deletion.
     *
     */
    public SirqulResponse deleteApplicationConfig(BigDecimal version, Long accountId, Long configId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get AppConfig
     *
     * Gets the appConfig data by the given configId. If appConfig cannot be found, it returns an invalid response.
     *
     */
    public ApplicationConfigResponse getApplicationConfig(BigDecimal version, Long accountId, Long configId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get AppConfig by Version
     *
     * Gets the appConfig data by the given appKey and app configVersion number.If the appKey is is invalid or appConfig is not found, it returns an invalid response. 
     *
     */
    public ApplicationConfigResponse getApplicationConfigByConfigVersion(BigDecimal version, String appKey, String configVersion, Long retailerId, Long retailerLocationId, String udid, Boolean allowOlderVersions) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search AppConfigs
     *
     * Gets all versions of application configurations in a particular app by the given appKey.
     *
     */
    public List<ApplicationConfigResponse> searchApplicationConfig(BigDecimal version, Long accountId, String appKey, Long retailerId, Long retailerLocationId, String udid, String configVersion, String sortField, Boolean descending, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update AppConfig
     *
     * pdates an existing application configuration. If the configVersion provided already exists for the given app the application configuration won&#39;t be updated.
     *
     */
    public ApplicationConfigResponse updateApplicationConfig(BigDecimal version, Long accountId, Long configId, String appKey, String configVersion, Long assetId, Long retailerId, Long retailerLocationId, String udid) {
        // TODO: Implement...

        return null;
    }

}
