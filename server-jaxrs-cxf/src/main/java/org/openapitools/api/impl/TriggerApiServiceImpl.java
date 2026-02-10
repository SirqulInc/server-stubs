package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TriggerResponse;

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
public class TriggerApiServiceImpl implements TriggerApi {
    /**
     * Create Trigger
     *
     * Create a trigger
     *
     */
    public TriggerResponse createTrigger(BigDecimal version, Long accountId, String name, String appKey, String groupingId, String endpointURL, String payload, Long scheduledDate, Long startDate, Long endDate, String cronExpression, String conditionalInput, String visibility, Boolean active) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Trigger
     *
     * Mark a trigger as deleted.
     *
     */
    public SirqulResponse deleteTrigger(BigDecimal version, Long accountId, Long triggerId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Trigger
     *
     * Get a trigger
     *
     */
    public TriggerResponse getTrigger(BigDecimal version, Long accountId, Long triggerId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Triggers
     *
     * Search for triggers
     *
     */
    public List<TriggerResponse> searchTriggers(BigDecimal version, Long accountId, String groupingId, String filter, String statuses, String templateTypes, String appKey, String keyword, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Trigger
     *
     * Update a trigger
     *
     */
    public TriggerResponse updateTrigger(BigDecimal version, Long triggerId, Long accountId, String name, String appKey, String groupingId, String endpointURL, String payload, Long scheduledDate, Long startDate, Long endDate, String cronExpression, String conditionalInput, String visibility, Boolean active) {
        // TODO: Implement...

        return null;
    }

}
