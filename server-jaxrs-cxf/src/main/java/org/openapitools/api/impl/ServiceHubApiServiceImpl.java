package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.ServiceHub;

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
public class ServiceHubApiServiceImpl implements ServiceHubApi {
    /**
     * Create Service Hub
     *
     * Create new service hub
     *
     */
    public ServiceHub createServiceHub(BigDecimal version, ServiceHub body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Service Hub
     *
     * Delete an existing service hub
     *
     */
    public void deleteServiceHub(BigDecimal version, Long id) {
        // TODO: Implement...

        
    }

    /**
     * Get Service Hub
     *
     * Get an existing service hub
     *
     */
    public Object getServiceHub(BigDecimal version, Long id) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Service Hub
     *
     * Update an existing service hub
     *
     */
    public ServiceHub postServiceHub(BigDecimal version, Long id, ServiceHub body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Service Hub
     *
     * Update an existing service hub
     *
     */
    public ServiceHub putServiceHub(BigDecimal version, Long id, ServiceHub body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Service Hubs
     *
     * Search for service hubs.
     *
     */
    public List<ServiceHub> searchServiceHubs(BigDecimal version, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly, String keyword, Long retailerId) {
        // TODO: Implement...

        return null;
    }

}
