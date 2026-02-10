package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.CsvImportResponse;
import java.io.File;
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
public class CsvImportApiServiceImpl implements CsvImportApi {
    /**
     * Detail Status
     *
     */
    public SirqulResponse getStatusCSV(BigDecimal version, Long accountId, Long batchId, String responseGroup, Long start, Long limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Status
     *
     * Retrieves batches for a user.
     *
     */
    public CsvImportResponse listStatusCSV(BigDecimal version, Long accountId, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Batch Status
     *
     * Checks status of batch upload.
     *
     */
    public CsvImportResponse statusCSV(BigDecimal version, Long accountId, Long batchId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Upload CSV
     *
     * Uploads a CSV import file.
     *
     */
    public CsvImportResponse uploadCSV(BigDecimal version, Long accountId, String uploadType, File importFile, String fileFormat, String appKey) {
        // TODO: Implement...

        return null;
    }

}
