package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.RegionLegSummary;
import org.openapitools.model.ReportBatchResponse;
import org.openapitools.model.ReportRegionLegSummaryBatchResponse;
import org.openapitools.model.ReportResponse;
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
public class ReportingApiServiceImpl implements ReportingApi {
    /**
     * Create Offline Report
     *
     * Create an entry for the batch for offline report
     *
     */
    public ReportBatchResponse createBatch(BigDecimal version, Long accountId, String status, Integer previewLimit, String appKey, String endpoint, String parameters, String name, Long startDate, Long endDate, String description, String pageUrl) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Offline Report
     *
     * Create an entry for the batch for offline report
     *
     */
    public ReportRegionLegSummaryBatchResponse createRegionLegSummaryBatch(BigDecimal version, List<@Valid RegionLegSummary> body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Offline Report
     *
     * Deletes a batch report.
     *
     */
    public SirqulResponse deleteBatch(BigDecimal version, Long accountId, Long batchId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Offline Report
     *
     * Checks status of batch report.
     *
     */
    public ReportBatchResponse getReportBatch(BigDecimal version, Long accountId, Long batchId, Boolean allResults) {
        // TODO: Implement...

        return null;
    }

    /**
     * Run Report
     *
     *  This endpoint allows you to run a set of predefined reports that can be used to understand your users&#39; behavior as well as trends within your application.
     *
     */
    public ReportResponse runReport(BigDecimal version, Boolean desc, Long accountId, String query, String parameters, String order, Long start, Long limit, String responseFormat) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Offline Reports
     *
     * Retrieves batches for a user..
     *
     */
    public List<ReportBatchResponse> searchBatch(BigDecimal version, Long accountId, Integer start, Integer limit, String names, String appKey, String status, Boolean globalAppSearch, Long startDate, Long endDate) {
        // TODO: Implement...

        return null;
    }

}
