package org.openapitools.api;

import org.openapitools.model.ScheduledNotificationFullResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
@Path("/notification/schedule")
@Api(value = "/", description = "")
public interface ScheduledNotificationApi  {

    /**
     * Create Scheduled Notification
     *
     * This endpoint creates a Scheduled Notification message that can be configured to process and send periodically at set time periods
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Scheduled Notification", tags={ "Scheduled Notification" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ScheduledNotificationFullResponse.class) })
    public ScheduledNotificationFullResponse createScheduledNotification(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("name") @NotNull String name, @QueryParam("type") @NotNull String type, @QueryParam("message") @NotNull String message, @QueryParam("contentId") Long contentId, @QueryParam("contentName") String contentName, @QueryParam("contentType") String contentType, @QueryParam("parentId") Long parentId, @QueryParam("parentType") String parentType, @QueryParam("appKey") String appKey, @QueryParam("groupingId") String groupingId, @QueryParam("connectionGroupIds") String connectionGroupIds, @QueryParam("connectionAccountIds") String connectionAccountIds, @QueryParam("audienceId") Long audienceId, @QueryParam("audienceIds") String audienceIds, @QueryParam("albumIds") String albumIds, @QueryParam("reportId") Long reportId, @QueryParam("reportParams") String reportParams, @QueryParam("endpointURL") String endpointURL, @QueryParam("payload") String payload, @QueryParam("scheduledDate") Long scheduledDate, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("cronExpression") String cronExpression, @QueryParam("cronType") String cronType, @QueryParam("metaData") String metaData, @QueryParam("conditionalInput") String conditionalInput, @QueryParam("templateType") String templateType, @QueryParam("visibility") String visibility, @QueryParam("active") Boolean active, @QueryParam("sendNow") Boolean sendNow, @QueryParam("eventType") @DefaultValue("CUSTOM")String eventType, @QueryParam("deepLinkURI") String deepLinkURI, @QueryParam("sendToAll") Boolean sendToAll);

    /**
     * Delete Scheduled Notification
     *
     * This endpoint deletes a Scheduled Notification. Only the original owner of the Scheduled Notification or someone with write permissions can use this endpoint. Permissions can be granted to other users by using the UserPermissionsApi.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Scheduled Notification", tags={ "Scheduled Notification" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ScheduledNotificationFullResponse.class) })
    public ScheduledNotificationFullResponse deleteScheduledNotification(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("scheduledNotificationId") @NotNull Long scheduledNotificationId, @QueryParam("deleteByGroupingId") Boolean deleteByGroupingId);

    /**
     * Get Scheduled Notification
     *
     * Get a ScheduledNotification
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Scheduled Notification", tags={ "Scheduled Notification" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ScheduledNotificationFullResponse.class) })
    public ScheduledNotificationFullResponse getScheduledNotification(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("scheduledNotificationId") @NotNull Long scheduledNotificationId);

    /**
     * Generate Schedule Notifications
     *
     * Use a report to identify events that are starting soon and then create a scheduled notification to push a message to matching users.
     *
     */
    @POST
    @Path("/generate")
    @Produces({ "*/*" })
    @ApiOperation(value = "Generate Schedule Notifications", tags={ "Scheduled Notification" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse scheduleNotificationListings(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("reportName") @NotNull String reportName, @QueryParam("message") @NotNull String message, @QueryParam("offset") @NotNull Integer offset, @QueryParam("recipientReportId") @NotNull Long recipientReportId, @QueryParam("reportParams") String reportParams, @QueryParam("type") String type);

    /**
     * Search Scheduled Notifications
     *
     * This endpoint searches on Scheduled Notifications. If a scheduled notification was created with the visibility parameter set to PUBLIC, then anyone can search on it if the filter parameter includes the PUBLIC value. PRIVATE visibility means that it can only be searched on by the owner or if it has been shared to the user using the UserPermissionsApi.  In addition, if a PUBLIC Scheduled Notification was created for an application that requires content approval (using the publicContentApproval parameter), then an administrator of the application needs to approve it before it can be search on by other users. Before this happens, it is in a PENDING state, and only the original creator or the owner of the application can search and see it. Also, only the owner of the application can use the UserPermissionsApi to approve or reject it. Scheduled notifications that have been rejected are only visible to the original creators.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Scheduled Notifications", tags={ "Scheduled Notification" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ScheduledNotificationFullResponse.class) })
    public ScheduledNotificationFullResponse searchScheduledNotifications(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("groupingId") String groupingId, @QueryParam("audienceId") Long audienceId, @QueryParam("filter") String filter, @QueryParam("types") String types, @QueryParam("contentIds") String contentIds, @QueryParam("contentTypes") String contentTypes, @QueryParam("parentIds") String parentIds, @QueryParam("parentTypes") String parentTypes, @QueryParam("statuses") String statuses, @QueryParam("templateTypes") String templateTypes, @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("groupByGroupingId") Boolean groupByGroupingId, @QueryParam("returnAudienceAccountCount") Boolean returnAudienceAccountCount);

    /**
     * Update Scheduled Notification
     *
     * This endpoint updates a Scheduled Notification message that can be configured to process and send periodically at set time periods. Please see createScheduledNotification for more details.  Only the original owner of the Scheduled Notification or someone with write permissions can use this endpoint. Permissions can be granted to other users by using theUserPermissionsApi.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Scheduled Notification", tags={ "Scheduled Notification" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ScheduledNotificationFullResponse.class) })
    public ScheduledNotificationFullResponse updateScheduledNotification(@QueryParam("scheduledNotificationId") @NotNull Long scheduledNotificationId, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("name") String name, @QueryParam("type") String type, @QueryParam("message") String message, @QueryParam("payload") String payload, @QueryParam("contentId") Long contentId, @QueryParam("contentName") String contentName, @QueryParam("contentType") String contentType, @QueryParam("parentId") Long parentId, @QueryParam("parentType") String parentType, @QueryParam("appKey") String appKey, @QueryParam("groupingId") String groupingId, @QueryParam("connectionGroupIds") String connectionGroupIds, @QueryParam("connectionAccountIds") String connectionAccountIds, @QueryParam("audienceId") Long audienceId, @QueryParam("audienceIds") String audienceIds, @QueryParam("albumIds") String albumIds, @QueryParam("reportId") Long reportId, @QueryParam("reportParams") String reportParams, @QueryParam("endpointURL") String endpointURL, @QueryParam("scheduledDate") Long scheduledDate, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("cronExpression") String cronExpression, @QueryParam("cronType") String cronType, @QueryParam("metaData") String metaData, @QueryParam("conditionalInput") String conditionalInput, @QueryParam("templateType") String templateType, @QueryParam("visibility") String visibility, @QueryParam("active") Boolean active, @QueryParam("errorMessage") String errorMessage, @QueryParam("status") String status, @QueryParam("updateByGroupingId") Boolean updateByGroupingId, @QueryParam("sendNow") Boolean sendNow, @QueryParam("eventType") @DefaultValue("CUSTOM")String eventType, @QueryParam("deepLinkURI") String deepLinkURI, @QueryParam("sendToAll") Boolean sendToAll);
}
