package controllers;

import java.math.BigDecimal;
import apimodels.ScheduledNotificationFullResponse;
import apimodels.SirqulResponse;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class ScheduledNotificationApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createScheduledNotificationHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, @NotNull String type, @NotNull String message, Long contentId, String contentName, String contentType, Long parentId, String parentType, String appKey, String groupingId, String connectionGroupIds, String connectionAccountIds, Long audienceId, String audienceIds, String albumIds, Long reportId, String reportParams, String endpointURL, String payload, Long scheduledDate, Long startDate, Long endDate, String cronExpression, String cronType, String metaData, String conditionalInput, String templateType, String visibility, Boolean active, Boolean sendNow, String eventType, String deepLinkURI, Boolean sendToAll) throws Exception {
        ScheduledNotificationFullResponse obj = createScheduledNotification(request, version, accountId, name, type, message, contentId, contentName, contentType, parentId, parentType, appKey, groupingId, connectionGroupIds, connectionAccountIds, audienceId, audienceIds, albumIds, reportId, reportParams, endpointURL, payload, scheduledDate, startDate, endDate, cronExpression, cronType, metaData, conditionalInput, templateType, visibility, active, sendNow, eventType, deepLinkURI, sendToAll);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ScheduledNotificationFullResponse createScheduledNotification(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, @NotNull String type, @NotNull String message, Long contentId, String contentName, String contentType, Long parentId, String parentType, String appKey, String groupingId, String connectionGroupIds, String connectionAccountIds, Long audienceId, String audienceIds, String albumIds, Long reportId, String reportParams, String endpointURL, String payload, Long scheduledDate, Long startDate, Long endDate, String cronExpression, String cronType, String metaData, String conditionalInput, String templateType, String visibility, Boolean active, Boolean sendNow, String eventType, String deepLinkURI, Boolean sendToAll) throws Exception;

    public Result deleteScheduledNotificationHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long scheduledNotificationId, Boolean deleteByGroupingId) throws Exception {
        ScheduledNotificationFullResponse obj = deleteScheduledNotification(request, version, accountId, scheduledNotificationId, deleteByGroupingId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ScheduledNotificationFullResponse deleteScheduledNotification(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long scheduledNotificationId, Boolean deleteByGroupingId) throws Exception;

    public Result getScheduledNotificationHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long scheduledNotificationId) throws Exception {
        ScheduledNotificationFullResponse obj = getScheduledNotification(request, version, accountId, scheduledNotificationId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ScheduledNotificationFullResponse getScheduledNotification(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long scheduledNotificationId) throws Exception;

    public Result scheduleNotificationListingsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String reportName, @NotNull String message, @NotNull Integer offset, @NotNull Long recipientReportId, String reportParams, String type) throws Exception {
        SirqulResponse obj = scheduleNotificationListings(request, version, accountId, appKey, reportName, message, offset, recipientReportId, reportParams, type);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse scheduleNotificationListings(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String reportName, @NotNull String message, @NotNull Integer offset, @NotNull Long recipientReportId, String reportParams, String type) throws Exception;

    public Result searchScheduledNotificationsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, String groupingId, Long audienceId, String filter, String types, String contentIds, String contentTypes, String parentIds, String parentTypes, String statuses, String templateTypes, String appKey, String keyword, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly, Boolean groupByGroupingId, Boolean returnAudienceAccountCount) throws Exception {
        ScheduledNotificationFullResponse obj = searchScheduledNotifications(request, version, accountId, groupingId, audienceId, filter, types, contentIds, contentTypes, parentIds, parentTypes, statuses, templateTypes, appKey, keyword, sortField, descending, start, limit, activeOnly, groupByGroupingId, returnAudienceAccountCount);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ScheduledNotificationFullResponse searchScheduledNotifications(Http.Request request, BigDecimal version, @NotNull Long accountId, String groupingId, Long audienceId, String filter, String types, String contentIds, String contentTypes, String parentIds, String parentTypes, String statuses, String templateTypes, String appKey, String keyword, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly, Boolean groupByGroupingId, Boolean returnAudienceAccountCount) throws Exception;

    public Result updateScheduledNotificationHttp(Http.Request request, BigDecimal version, @NotNull Long scheduledNotificationId, @NotNull Long accountId, String name, String type, String message, String payload, Long contentId, String contentName, String contentType, Long parentId, String parentType, String appKey, String groupingId, String connectionGroupIds, String connectionAccountIds, Long audienceId, String audienceIds, String albumIds, Long reportId, String reportParams, String endpointURL, Long scheduledDate, Long startDate, Long endDate, String cronExpression, String cronType, String metaData, String conditionalInput, String templateType, String visibility, Boolean active, String errorMessage, String status, Boolean updateByGroupingId, Boolean sendNow, String eventType, String deepLinkURI, Boolean sendToAll) throws Exception {
        ScheduledNotificationFullResponse obj = updateScheduledNotification(request, version, scheduledNotificationId, accountId, name, type, message, payload, contentId, contentName, contentType, parentId, parentType, appKey, groupingId, connectionGroupIds, connectionAccountIds, audienceId, audienceIds, albumIds, reportId, reportParams, endpointURL, scheduledDate, startDate, endDate, cronExpression, cronType, metaData, conditionalInput, templateType, visibility, active, errorMessage, status, updateByGroupingId, sendNow, eventType, deepLinkURI, sendToAll);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ScheduledNotificationFullResponse updateScheduledNotification(Http.Request request, BigDecimal version, @NotNull Long scheduledNotificationId, @NotNull Long accountId, String name, String type, String message, String payload, Long contentId, String contentName, String contentType, Long parentId, String parentType, String appKey, String groupingId, String connectionGroupIds, String connectionAccountIds, Long audienceId, String audienceIds, String albumIds, Long reportId, String reportParams, String endpointURL, Long scheduledDate, Long startDate, Long endDate, String cronExpression, String cronType, String metaData, String conditionalInput, String templateType, String visibility, Boolean active, String errorMessage, String status, Boolean updateByGroupingId, Boolean sendNow, String eventType, String deepLinkURI, Boolean sendToAll) throws Exception;

}
