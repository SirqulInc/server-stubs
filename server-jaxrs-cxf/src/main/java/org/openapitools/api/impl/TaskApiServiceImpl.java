package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TaskResponse;

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
public class TaskApiServiceImpl implements TaskApi {
    /**
     * Create Task
     *
     * Create a Task
     *
     */
    public TaskResponse createTask(BigDecimal version, Long accountId, String name, String appKey, String groupingId, String endpointURL, String payload, Long scheduledDate, Long startDate, Long endDate, String cronExpression, String visibility, Boolean active) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Task
     *
     * Delete a Task
     *
     */
    public SirqulResponse deleteTask(BigDecimal version, Long accountId, Long taskId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Task
     *
     * Get a Task
     *
     */
    public TaskResponse getTask(BigDecimal version, Long accountId, Long taskId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Tasks
     *
     * Search on Tasks
     *
     */
    public List<TaskResponse> searchTasks(BigDecimal version, Long accountId, String groupingId, String filter, String statuses, String templateTypes, String appKey, String keyword, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Task
     *
     * Update a Task
     *
     */
    public TaskResponse updateTask(BigDecimal version, Long taskId, Long accountId, String name, String appKey, String groupingId, String endpointURL, String payload, Long scheduledDate, Long startDate, Long endDate, String cronExpression, String visibility, Boolean active) {
        // TODO: Implement...

        return null;
    }

}
