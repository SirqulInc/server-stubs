package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.RouteSettings;

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
public class RouteSettingApiServiceImpl implements RouteSettingApi {
    /**
     * Create Route Setting
     *
     * Create a new route setting
     *
     */
    public RouteSettings createRouteSettings(BigDecimal version, RouteSettings body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Route Setting
     *
     * Delete an existing route setting
     *
     */
    public Object deleteRouteSettings(BigDecimal version, Long routeSettingsId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Route Setting
     *
     * Get an existing route settings
     *
     */
    public RouteSettings getRouteSettings(BigDecimal version, Long routeSettingsId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Route Settings
     *
     * Search for route settings
     *
     */
    public List<RouteSettings> searchRouteSettings(BigDecimal version, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly, Long hubId, Long programId, String keyword) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Route Setting
     *
     * Update an existing route setting
     *
     */
    public RouteSettings updateRouteSettings(BigDecimal version, Long routeSettingsId, RouteSettings body) {
        // TODO: Implement...

        return null;
    }

}
