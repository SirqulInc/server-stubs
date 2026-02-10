package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.ScheduledNotificationFullResponse;
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
public class ScheduledNotificationApiServiceImpl implements ScheduledNotificationApi {
    /**
     * Create Scheduled Notification
     *
     * This endpoint creates a Scheduled Notification message that can be configured to process and send periodically at set time periods
     *
     */
    public ScheduledNotificationFullResponse createScheduledNotification(BigDecimal version, Long accountId, String name, String type, String message, Long contentId, String contentName, String contentType, Long parentId, String parentType, String appKey, String groupingId, String connectionGroupIds, String connectionAccountIds, Long audienceId, String audienceIds, String albumIds, Long reportId, String reportParams, String endpointURL, String payload, Long scheduledDate, Long startDate, Long endDate, String cronExpression, String cronType, String metaData, String conditionalInput, String templateType, String visibility, Boolean active, Boolean sendNow, String eventType, String deepLinkURI, Boolean sendToAll) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Scheduled Notification
     *
     * This endpoint deletes a Scheduled Notification. Only the original owner of the Scheduled Notification or someone with write permissions can use this endpoint. Permissions can be granted to other users by using the UserPermissionsApi.
     *
     */
    public ScheduledNotificationFullResponse deleteScheduledNotification(BigDecimal version, Long accountId, Long scheduledNotificationId, Boolean deleteByGroupingId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Scheduled Notification
     *
     * Get a ScheduledNotification
     *
     */
    public ScheduledNotificationFullResponse getScheduledNotification(BigDecimal version, Long accountId, Long scheduledNotificationId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Generate Schedule Notifications
     *
     * Use a report to identify events that are starting soon and then create a scheduled notification to push a message to matching users.
     *
     */
    public SirqulResponse scheduleNotificationListings(BigDecimal version, Long accountId, String appKey, String reportName, String message, Integer offset, Long recipientReportId, String reportParams, String type) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Scheduled Notifications
     *
     * This endpoint searches on Scheduled Notifications. If a scheduled notification was created with the visibility parameter set to PUBLIC, then anyone can search on it if the filter parameter includes the PUBLIC value. PRIVATE visibility means that it can only be searched on by the owner or if it has been shared to the user using the UserPermissionsApi.  In addition, if a PUBLIC Scheduled Notification was created for an application that requires content approval (using the publicContentApproval parameter), then an administrator of the application needs to approve it before it can be search on by other users. Before this happens, it is in a PENDING state, and only the original creator or the owner of the application can search and see it. Also, only the owner of the application can use the UserPermissionsApi to approve or reject it. Scheduled notifications that have been rejected are only visible to the original creators.
     *
     */
    public ScheduledNotificationFullResponse searchScheduledNotifications(BigDecimal version, Long accountId, String groupingId, Long audienceId, String filter, String types, String contentIds, String contentTypes, String parentIds, String parentTypes, String statuses, String templateTypes, String appKey, String keyword, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly, Boolean groupByGroupingId, Boolean returnAudienceAccountCount) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Scheduled Notification
     *
     * This endpoint updates a Scheduled Notification message that can be configured to process and send periodically at set time periods. Please see createScheduledNotification for more details.  Only the original owner of the Scheduled Notification or someone with write permissions can use this endpoint. Permissions can be granted to other users by using theUserPermissionsApi.
     *
     */
    public ScheduledNotificationFullResponse updateScheduledNotification(BigDecimal version, Long scheduledNotificationId, Long accountId, String name, String type, String message, String payload, Long contentId, String contentName, String contentType, Long parentId, String parentType, String appKey, String groupingId, String connectionGroupIds, String connectionAccountIds, Long audienceId, String audienceIds, String albumIds, Long reportId, String reportParams, String endpointURL, Long scheduledDate, Long startDate, Long endDate, String cronExpression, String cronType, String metaData, String conditionalInput, String templateType, String visibility, Boolean active, String errorMessage, String status, Boolean updateByGroupingId, Boolean sendNow, String eventType, String deepLinkURI, Boolean sendToAll) {
        // TODO: Implement...

        return null;
    }

}
