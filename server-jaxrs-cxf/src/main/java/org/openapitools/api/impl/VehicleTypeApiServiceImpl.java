package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.VehicleType;

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
public class VehicleTypeApiServiceImpl implements VehicleTypeApi {
    /**
     * Create Vehicle Type
     *
     * Create a new vehicle type
     *
     */
    public VehicleType createVehicleType(BigDecimal version, String vehicleType, VehicleType body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Vehicle Type
     *
     * Delete a vehicle type
     *
     */
    public void deleteVehicleType(BigDecimal version, Long vehicleTypeId) {
        // TODO: Implement...

        
    }

    /**
     * Get Vehicle Type
     *
     * Get a vehicle type
     *
     */
    public VehicleType getVehicleType(BigDecimal version, Long vehicleTypeId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Vehicle Type
     *
     * Search for types of vehicles
     *
     */
    public List<VehicleType> searchVehicleTypes(BigDecimal version, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly, Long retailerId, Long hubId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Vehicle Type
     *
     * Update a vehicle type
     *
     */
    public VehicleType updateVehicleType(BigDecimal version, Long vehicleTypeId, String vehicleType, VehicleType body) {
        // TODO: Implement...

        return null;
    }

}
