package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import java.util.Map;
import org.openapitools.model.Shipment;

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
public class ShipmentApiServiceImpl implements ShipmentApi {
    /**
     * Cancel Shipment
     *
     * Remove shipment from route
     *
     */
    public void cancelShipment(BigDecimal version, Long id) {
        // TODO: Implement...

        
    }

    /**
     * Create Shipment
     *
     * Create new shipment
     *
     */
    public Shipment createShipment(BigDecimal version, Shipment body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Shipment
     *
     * Delete an existing shipment
     *
     */
    public void deleteShipment(BigDecimal version, Long id) {
        // TODO: Implement...

        
    }

    /**
     * Get Shipment
     *
     * Get an existing shipment
     *
     */
    public Shipment getShipment(BigDecimal version, Long id) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Shipments
     *
     * Search for shipments
     *
     */
    public List<Shipment> searchShipments(BigDecimal version, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly, Long ownerId, Long riderId, Long routeId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Shipment
     *
     * Update an existing shipment
     *
     */
    public Shipment updateShipment(BigDecimal version, Long id, Shipment body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Uupdate Shipment Status
     *
     * Update status of an existing shipment
     *
     */
    public void updateShipmentStatus(BigDecimal version, Long id, Map<String, Boolean> body) {
        // TODO: Implement...

        
    }

}
