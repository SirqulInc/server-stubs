package org.openapitools.api.impl;

import org.openapitools.api.*;
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
public class RetailerV2ApiServiceImpl implements RetailerV2Api {
    /**
     * Get Retailer
     *
     * Gets a retailer. Only the owner and the employees of a retailer have access to view its information.
     *
     */
    public SirqulResponse getRetaokiler(BigDecimal version, Long retailerId, Boolean activeOnly, String keyword, String sortField, Long start, Long limit) {
        // TODO: Implement...

        return null;
    }

}
