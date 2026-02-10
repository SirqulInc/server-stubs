package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.Vehicle;

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
public class VehicleApiServiceImpl implements VehicleApi {
    /**
     * Create Vehicle
     *
     * Create new vehicle
     *
     */
    public Vehicle createVehicle(BigDecimal version, String vehicle, Vehicle body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Vehicle
     *
     * Delete an existing vehicle
     *
     */
    public void deleteVehicle(BigDecimal version, Long id) {
        // TODO: Implement...

        
    }

    /**
     * Get Vehicle
     *
     * Get an existing vehicle
     *
     */
    public Vehicle getVehicle(BigDecimal version, Long id) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Vehicle
     *
     * Search for vehicles
     *
     */
    public List<Vehicle> searchVehicle(BigDecimal version, Long hubId, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly, String keyword) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Vehicle
     *
     * Update an existing vehicle
     *
     */
    public Vehicle updateVehicle(BigDecimal version, Long id, String vehicle, Vehicle body) {
        // TODO: Implement...

        return null;
    }

}
