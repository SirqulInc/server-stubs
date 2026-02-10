package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.Location;
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
public class LocationApiV2ApiServiceImpl implements LocationApiV2Api {
    /**
     * Create new location
     *
     * Create a new location from a real object location.
     *
     */
    public SirqulResponse createLocationV2(BigDecimal version, Location body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update an existing location
     *
     * Update an existing location
     *
     */
    public SirqulResponse updateLocationV2(BigDecimal version, Long id, Location body) {
        // TODO: Implement...

        return null;
    }

}
