package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AccountMiniResponse;
import org.openapitools.model.AssignmentResponse;
import org.openapitools.model.AssignmentStatusResponse;
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
public class AssignmentApiServiceImpl implements AssignmentApi {
    /**
     * Search Assignment Assignees
     *
     * Search for avaiable users for creating or updating assignment.
     *
     */
    public List<AccountMiniResponse> assigmentAssigneeAccountSearch(BigDecimal version, Long accountId, String keyword) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Assignment
     *
     * Create an assignment.
     *
     */
    public AssignmentResponse assignmentCreate(BigDecimal version, Long accountId, String name, Long assigneeAccountId, String description, Long retailerLocationId, String tags, Boolean active) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Assignment
     *
     * Delete an assignment.
     *
     */
    public SirqulResponse assignmentDelete(BigDecimal version, Long accountId, Long assignmentId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Assignment
     *
     * Get the details of an assignment.
     *
     */
    public AssignmentResponse assignmentGet(BigDecimal version, Long accountId, Long assignmentId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Assignments
     *
     * Search for assignments by the given parameters.
     *
     */
    public List<AssignmentResponse> assignmentSearch(BigDecimal version, Long accountId, String sortField, Boolean descending, Boolean activeOnly, Integer start, Integer limit, Long creatorAccountId, String assigneeAccountIds, String retailerLocationIds, String currentStatusType, String keyword) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Assignment Status
     *
     * Create an assignment status.
     *
     */
    public AssignmentStatusResponse assignmentStatusCreate(BigDecimal version, Long accountId, Long assignmentId, Long scheduledNotificationId, String toDo, String connection, String method, String status, String closure, String message, Long followUp, Boolean active) {
        // TODO: Implement...

        return null;
    }

    /**
     * Deletes Assignment Status
     *
     * Deletes an assignment status.
     *
     */
    public SirqulResponse assignmentStatusDelete(BigDecimal version, Long accountId, Long assignmentStatusId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Assignment Status
     *
     * Get an assignment status.
     *
     */
    public AssignmentStatusResponse assignmentStatusGet(BigDecimal version, Long accountId, Long assignmentStatusId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Assignment Statuses
     *
     * Search on assignment statuses.
     *
     */
    public List<AssignmentStatusResponse> assignmentStatusSearch(BigDecimal version, Long accountId, String sortField, Boolean descending, Boolean activeOnly, Integer start, Integer limit, Long assignmentId, Long creatorAccountId, Long assigneeAccountId, Long retailerLocationId, String statusType, String keyword) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Assignment Status
     *
     * Updates an assignment status.
     *
     */
    public AssignmentStatusResponse assignmentStatusUpdate(BigDecimal version, Long accountId, Long assignmentStatusId, Long scheduledNotificationId, String toDo, String connection, String method, String status, String closure, String message, Long followUp, Boolean active) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Assignment
     *
     * Updates an assignment.
     *
     */
    public AssignmentResponse assignmentUpdate(BigDecimal version, Long accountId, Long assignmentId, String name, String description, Long assigneeAccountId, Long retailerLocationId, String tags, Boolean active) {
        // TODO: Implement...

        return null;
    }

}
