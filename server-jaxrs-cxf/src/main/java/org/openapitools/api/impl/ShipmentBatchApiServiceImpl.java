package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.ShipmentBatch;
import org.openapitools.model.ShipmentImportStatus;

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
public class ShipmentBatchApiServiceImpl implements ShipmentBatchApi {
    /**
     * Create Shipment Batch
     *
     * Create a new shipment batch
     *
     */
    public ShipmentBatch createShipmentBatch(BigDecimal version, ShipmentBatch body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Shipment Batch
     *
     * Search for shipment batches
     *
     */
    public void deleteShipmentBatch(BigDecimal version, Long batchId) {
        // TODO: Implement...

        
    }

    /**
     * Get Shipment Batch
     *
     * Get an existing shipment batch
     *
     */
    public ShipmentBatch getShipmentBatch(BigDecimal version, Long batchId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Shipment Batch Status
     *
     * Get the import status list of the import shipment batch
     *
     */
    public List<ShipmentImportStatus> getShipmentBatchStatus(BigDecimal version, Long batchId, Long accountId, String sortField, Boolean descending, Integer start, Integer limit, Boolean valid, Boolean started, Boolean completed, Boolean hasShipment, Boolean hasRoute, String keyword) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Shipment Batch
     *
     * Search for shipment batches
     *
     */
    public List<ShipmentBatch> searchShipmentBatch(BigDecimal version, Long hubId, String sortField, Boolean descending, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

}
