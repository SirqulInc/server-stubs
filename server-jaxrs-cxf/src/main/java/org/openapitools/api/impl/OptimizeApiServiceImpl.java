package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.ImportStatuses;
import java.util.Map;
import org.openapitools.model.Orders;
import org.openapitools.model.ShipmentOrder;

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
public class OptimizeApiServiceImpl implements OptimizeApi {
    /**
     * Get Optimization Result
     *
     * Get the results of the import batch.
     *
     */
    public Map<String, ShipmentOrder> getOptimizationResult(BigDecimal version, String batchID, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Request Optimization
     *
     * Request and upload of shipment orders and create ShipmentImportBatch for optimization.
     *
     */
    public ImportStatuses requestOptimization(BigDecimal version, Orders body) {
        // TODO: Implement...

        return null;
    }

}
