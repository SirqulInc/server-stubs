package controllers;

import java.math.BigDecimal;
import apimodels.ScheduledNotificationFullResponse;
import apimodels.SirqulResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ScheduledNotificationApiControllerImp extends ScheduledNotificationApiControllerImpInterface {
    @Override
    public ScheduledNotificationFullResponse createScheduledNotification(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, @NotNull String type, @NotNull String message, Long contentId, String contentName, String contentType, Long parentId, String parentType, String appKey, String groupingId, String connectionGroupIds, String connectionAccountIds, Long audienceId, String audienceIds, String albumIds, Long reportId, String reportParams, String endpointURL, String payload, Long scheduledDate, Long startDate, Long endDate, String cronExpression, String cronType, String metaData, String conditionalInput, String templateType, String visibility, Boolean active, Boolean sendNow, String eventType, String deepLinkURI, Boolean sendToAll) throws Exception {
        //Do your magic!!!
        return new ScheduledNotificationFullResponse();
    }

    @Override
    public ScheduledNotificationFullResponse deleteScheduledNotification(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long scheduledNotificationId, Boolean deleteByGroupingId) throws Exception {
        //Do your magic!!!
        return new ScheduledNotificationFullResponse();
    }

    @Override
    public ScheduledNotificationFullResponse getScheduledNotification(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long scheduledNotificationId) throws Exception {
        //Do your magic!!!
        return new ScheduledNotificationFullResponse();
    }

    @Override
    public SirqulResponse scheduleNotificationListings(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String reportName, @NotNull String message, @NotNull Integer offset, @NotNull Long recipientReportId, String reportParams, String type) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public ScheduledNotificationFullResponse searchScheduledNotifications(Http.Request request, BigDecimal version, @NotNull Long accountId, String groupingId, Long audienceId, String filter, String types, String contentIds, String contentTypes, String parentIds, String parentTypes, String statuses, String templateTypes, String appKey, String keyword, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly, Boolean groupByGroupingId, Boolean returnAudienceAccountCount) throws Exception {
        //Do your magic!!!
        return new ScheduledNotificationFullResponse();
    }

    @Override
    public ScheduledNotificationFullResponse updateScheduledNotification(Http.Request request, BigDecimal version, @NotNull Long scheduledNotificationId, @NotNull Long accountId, String name, String type, String message, String payload, Long contentId, String contentName, String contentType, Long parentId, String parentType, String appKey, String groupingId, String connectionGroupIds, String connectionAccountIds, Long audienceId, String audienceIds, String albumIds, Long reportId, String reportParams, String endpointURL, Long scheduledDate, Long startDate, Long endDate, String cronExpression, String cronType, String metaData, String conditionalInput, String templateType, String visibility, Boolean active, String errorMessage, String status, Boolean updateByGroupingId, Boolean sendNow, String eventType, String deepLinkURI, Boolean sendToAll) throws Exception {
        //Do your magic!!!
        return new ScheduledNotificationFullResponse();
    }

}
