package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.BlockedNotificationResponse;
import org.openapitools.model.NotificationMessageListResponse;
import org.openapitools.model.NotificationRecipientResponse;
import org.openapitools.model.NotificationRecipientResponseListResponse;
import org.openapitools.model.NotificationTemplateResponse;
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
public class NotificationApiServiceImpl implements NotificationApi {
    /**
     * Create Notification Template
     *
     * Create a notification template. Developers will only be able to create notification templates for their own applications.
     *
     */
    public NotificationTemplateResponse createNotificationTemplate(BigDecimal version, Long accountId, String conduit, String title, String body, String appKey, String event, String tags) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create or update blocked notification settings
     *
     * Create or update blocked notification settings
     *
     */
    public BlockedNotificationResponse createOrUpdateBlockedNotifications(BigDecimal version, String appKey, String data, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Notification Template
     *
     * Deletes a notification template. Developers will only be able to delete notification templates for their own applications.
     *
     */
    public NotificationTemplateResponse deleteNotificationTemplate(BigDecimal version, Long accountId, Long notificationTemplateId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Notification Template
     *
     * Get the details of a notification template. Developers will only be able to see notification templates for their own applications.
     *
     */
    public NotificationTemplateResponse getNotificationTemplate(BigDecimal version, Long accountId, Long notificationTemplateId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Notifications
     *
     * Get a list of notifications for a user. If the \&quot;markAsRead\&quot; parameter is set to true, the returned notifications will be marked as \&quot;read\&quot; after the response has been sent. By default, read messages will not be returned, so to see read messages, set \&quot;returnReadMessages\&quot; to true.
     *
     */
    public NotificationMessageListResponse getNotifications(BigDecimal version, String deviceId, Long accountId, Long connectionAccountId, String appKey, String eventType, String contentIds, String contentTypes, String parentIds, String parentTypes, String actionCategory, String conduits, String keyword, Boolean returnReadMessages, Boolean markAsRead, Long fromDate, Double latitude, Double longitude, Boolean returnSent, Boolean ignoreFlagged, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Register Notification Token
     *
     * Register a token to send application dependent notifications like Google Cloud Messaging, or Apple Push Notifications.
     *
     */
    public SirqulResponse registerNotificationToken(BigDecimal version, String token, String pushType, String deviceId, Long accountId, String environment, String appKey, String gameType, Boolean active, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search on the user&#39;s blocked notification settings
     *
     * Search on the user&#39;s blocked notification settings
     *
     */
    public BlockedNotificationResponse searchBlockedNotifications(BigDecimal version, String appKey, Long accountId, String searchTags, String events, String conduits, String customTypes, String contentTypes, String contentIds, String sortField, Boolean descending, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Notification Templates
     *
     * Search for notification templates on owned applications.
     *
     */
    public NotificationTemplateResponse searchNotificationTemplate(BigDecimal version, Long accountId, String sortField, Boolean descending, Integer start, Integer limit, String appKey, String event, String conduit, Boolean globalOnly, Boolean reservedOnly, String keyword) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search for Recipients
     *
     * Search for application users to send notifications.
     *
     */
    public List<NotificationRecipientResponse> searchRecipients(BigDecimal version, String sortField, String deviceId, Long accountId, String appKey, String conduit, String keyword, Long audienceId, String audienceIds, String connectionGroupIds, String recipientAccountIds, Boolean descending, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search for Recipients (Counts/Grouped)
     *
     * Search for application users to send notifications (count/grouped variant).
     *
     */
    public NotificationRecipientResponseListResponse searchRecipientsCount(BigDecimal version, String deviceId, Long accountId, String appKey, String conduit, String keyword, Long audienceId, String audienceIds, String connectionGroupIds, String sortField, Boolean descending, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Send Batch Notifications
     *
     * Send notifications to all users of an application. Only someone with permissions to the application can do this.
     *
     */
    public SirqulResponse sendBatchNotifications(BigDecimal version, Long accountId, String appKey, String customMessage, String conduit, Long contentId, String contentName, String contentType, Long parentId, String parentType) {
        // TODO: Implement...

        return null;
    }

    /**
     * Send Custom Notifications
     *
     * Send your own custom notification to a user. NOTE: the EventType of these notifications will be CUSTOM. Notifications sent to yourself will currently be ignored.
     *
     */
    public SirqulResponse sendCustomNotifications(BigDecimal version, String deviceId, Long accountId, String receiverAccountIds, Boolean includeFriendGroup, String appKey, String gameType, String conduit, Long contentId, String contentName, String contentType, Long parentId, String parentType, String actionCategory, String subject, String customMessage, Boolean friendOnlyAPNS, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Notification Template
     *
     * Update a notification template. Developers will only be able to update notification templates for their own applications.
     *
     */
    public NotificationTemplateResponse updateNotificationTemplate(BigDecimal version, Long accountId, Long notificationTemplateId, String title, String body, String tags) {
        // TODO: Implement...

        return null;
    }

}
