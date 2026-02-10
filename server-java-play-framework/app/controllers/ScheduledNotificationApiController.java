package controllers;

import java.math.BigDecimal;
import apimodels.ScheduledNotificationFullResponse;
import apimodels.SirqulResponse;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ScheduledNotificationApiController extends Controller {
    private final ScheduledNotificationApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ScheduledNotificationApiController(Config configuration, ScheduledNotificationApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createScheduledNotification(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            throw new IllegalArgumentException("'name' parameter is required");
        }
        String valuetype = request.getQueryString("type");
        String type;
        if (valuetype != null) {
            type = valuetype;
        } else {
            throw new IllegalArgumentException("'type' parameter is required");
        }
        String valuemessage = request.getQueryString("message");
        String message;
        if (valuemessage != null) {
            message = valuemessage;
        } else {
            throw new IllegalArgumentException("'message' parameter is required");
        }
        String valuecontentId = request.getQueryString("contentId");
        Long contentId;
        if (valuecontentId != null) {
            contentId = Long.parseLong(valuecontentId);
        } else {
            contentId = null;
        }
        String valuecontentName = request.getQueryString("contentName");
        String contentName;
        if (valuecontentName != null) {
            contentName = valuecontentName;
        } else {
            contentName = null;
        }
        String valuecontentType = request.getQueryString("contentType");
        String contentType;
        if (valuecontentType != null) {
            contentType = valuecontentType;
        } else {
            contentType = null;
        }
        String valueparentId = request.getQueryString("parentId");
        Long parentId;
        if (valueparentId != null) {
            parentId = Long.parseLong(valueparentId);
        } else {
            parentId = null;
        }
        String valueparentType = request.getQueryString("parentType");
        String parentType;
        if (valueparentType != null) {
            parentType = valueparentType;
        } else {
            parentType = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuegroupingId = request.getQueryString("groupingId");
        String groupingId;
        if (valuegroupingId != null) {
            groupingId = valuegroupingId;
        } else {
            groupingId = null;
        }
        String valueconnectionGroupIds = request.getQueryString("connectionGroupIds");
        String connectionGroupIds;
        if (valueconnectionGroupIds != null) {
            connectionGroupIds = valueconnectionGroupIds;
        } else {
            connectionGroupIds = null;
        }
        String valueconnectionAccountIds = request.getQueryString("connectionAccountIds");
        String connectionAccountIds;
        if (valueconnectionAccountIds != null) {
            connectionAccountIds = valueconnectionAccountIds;
        } else {
            connectionAccountIds = null;
        }
        String valueaudienceId = request.getQueryString("audienceId");
        Long audienceId;
        if (valueaudienceId != null) {
            audienceId = Long.parseLong(valueaudienceId);
        } else {
            audienceId = null;
        }
        String valueaudienceIds = request.getQueryString("audienceIds");
        String audienceIds;
        if (valueaudienceIds != null) {
            audienceIds = valueaudienceIds;
        } else {
            audienceIds = null;
        }
        String valuealbumIds = request.getQueryString("albumIds");
        String albumIds;
        if (valuealbumIds != null) {
            albumIds = valuealbumIds;
        } else {
            albumIds = null;
        }
        String valuereportId = request.getQueryString("reportId");
        Long reportId;
        if (valuereportId != null) {
            reportId = Long.parseLong(valuereportId);
        } else {
            reportId = null;
        }
        String valuereportParams = request.getQueryString("reportParams");
        String reportParams;
        if (valuereportParams != null) {
            reportParams = valuereportParams;
        } else {
            reportParams = null;
        }
        String valueendpointURL = request.getQueryString("endpointURL");
        String endpointURL;
        if (valueendpointURL != null) {
            endpointURL = valueendpointURL;
        } else {
            endpointURL = null;
        }
        String valuepayload = request.getQueryString("payload");
        String payload;
        if (valuepayload != null) {
            payload = valuepayload;
        } else {
            payload = null;
        }
        String valuescheduledDate = request.getQueryString("scheduledDate");
        Long scheduledDate;
        if (valuescheduledDate != null) {
            scheduledDate = Long.parseLong(valuescheduledDate);
        } else {
            scheduledDate = null;
        }
        String valuestartDate = request.getQueryString("startDate");
        Long startDate;
        if (valuestartDate != null) {
            startDate = Long.parseLong(valuestartDate);
        } else {
            startDate = null;
        }
        String valueendDate = request.getQueryString("endDate");
        Long endDate;
        if (valueendDate != null) {
            endDate = Long.parseLong(valueendDate);
        } else {
            endDate = null;
        }
        String valuecronExpression = request.getQueryString("cronExpression");
        String cronExpression;
        if (valuecronExpression != null) {
            cronExpression = valuecronExpression;
        } else {
            cronExpression = null;
        }
        String valuecronType = request.getQueryString("cronType");
        String cronType;
        if (valuecronType != null) {
            cronType = valuecronType;
        } else {
            cronType = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        String valueconditionalInput = request.getQueryString("conditionalInput");
        String conditionalInput;
        if (valueconditionalInput != null) {
            conditionalInput = valueconditionalInput;
        } else {
            conditionalInput = null;
        }
        String valuetemplateType = request.getQueryString("templateType");
        String templateType;
        if (valuetemplateType != null) {
            templateType = valuetemplateType;
        } else {
            templateType = null;
        }
        String valuevisibility = request.getQueryString("visibility");
        String visibility;
        if (valuevisibility != null) {
            visibility = valuevisibility;
        } else {
            visibility = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valuesendNow = request.getQueryString("sendNow");
        Boolean sendNow;
        if (valuesendNow != null) {
            sendNow = Boolean.valueOf(valuesendNow);
        } else {
            sendNow = null;
        }
        String valueeventType = request.getQueryString("eventType");
        String eventType;
        if (valueeventType != null) {
            eventType = valueeventType;
        } else {
            eventType = "CUSTOM";
        }
        String valuedeepLinkURI = request.getQueryString("deepLinkURI");
        String deepLinkURI;
        if (valuedeepLinkURI != null) {
            deepLinkURI = valuedeepLinkURI;
        } else {
            deepLinkURI = null;
        }
        String valuesendToAll = request.getQueryString("sendToAll");
        Boolean sendToAll;
        if (valuesendToAll != null) {
            sendToAll = Boolean.valueOf(valuesendToAll);
        } else {
            sendToAll = null;
        }
        return imp.createScheduledNotificationHttp(request, version, accountId, name, type, message, contentId, contentName, contentType, parentId, parentType, appKey, groupingId, connectionGroupIds, connectionAccountIds, audienceId, audienceIds, albumIds, reportId, reportParams, endpointURL, payload, scheduledDate, startDate, endDate, cronExpression, cronType, metaData, conditionalInput, templateType, visibility, active, sendNow, eventType, deepLinkURI, sendToAll);
    }

    @ApiAction
    public Result deleteScheduledNotification(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuescheduledNotificationId = request.getQueryString("scheduledNotificationId");
        Long scheduledNotificationId;
        if (valuescheduledNotificationId != null) {
            scheduledNotificationId = Long.parseLong(valuescheduledNotificationId);
        } else {
            throw new IllegalArgumentException("'scheduledNotificationId' parameter is required");
        }
        String valuedeleteByGroupingId = request.getQueryString("deleteByGroupingId");
        Boolean deleteByGroupingId;
        if (valuedeleteByGroupingId != null) {
            deleteByGroupingId = Boolean.valueOf(valuedeleteByGroupingId);
        } else {
            deleteByGroupingId = null;
        }
        return imp.deleteScheduledNotificationHttp(request, version, accountId, scheduledNotificationId, deleteByGroupingId);
    }

    @ApiAction
    public Result getScheduledNotification(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuescheduledNotificationId = request.getQueryString("scheduledNotificationId");
        Long scheduledNotificationId;
        if (valuescheduledNotificationId != null) {
            scheduledNotificationId = Long.parseLong(valuescheduledNotificationId);
        } else {
            throw new IllegalArgumentException("'scheduledNotificationId' parameter is required");
        }
        return imp.getScheduledNotificationHttp(request, version, accountId, scheduledNotificationId);
    }

    @ApiAction
    public Result scheduleNotificationListings(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuereportName = request.getQueryString("reportName");
        String reportName;
        if (valuereportName != null) {
            reportName = valuereportName;
        } else {
            throw new IllegalArgumentException("'reportName' parameter is required");
        }
        String valuereportParams = request.getQueryString("reportParams");
        String reportParams;
        if (valuereportParams != null) {
            reportParams = valuereportParams;
        } else {
            reportParams = null;
        }
        String valuemessage = request.getQueryString("message");
        String message;
        if (valuemessage != null) {
            message = valuemessage;
        } else {
            throw new IllegalArgumentException("'message' parameter is required");
        }
        String valueoffset = request.getQueryString("offset");
        Integer offset;
        if (valueoffset != null) {
            offset = Integer.parseInt(valueoffset);
        } else {
            throw new IllegalArgumentException("'offset' parameter is required");
        }
        String valuetype = request.getQueryString("type");
        String type;
        if (valuetype != null) {
            type = valuetype;
        } else {
            type = null;
        }
        String valuerecipientReportId = request.getQueryString("recipientReportId");
        Long recipientReportId;
        if (valuerecipientReportId != null) {
            recipientReportId = Long.parseLong(valuerecipientReportId);
        } else {
            throw new IllegalArgumentException("'recipientReportId' parameter is required");
        }
        return imp.scheduleNotificationListingsHttp(request, version, accountId, appKey, reportName, message, offset, recipientReportId, reportParams, type);
    }

    @ApiAction
    public Result searchScheduledNotifications(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuegroupingId = request.getQueryString("groupingId");
        String groupingId;
        if (valuegroupingId != null) {
            groupingId = valuegroupingId;
        } else {
            groupingId = null;
        }
        String valueaudienceId = request.getQueryString("audienceId");
        Long audienceId;
        if (valueaudienceId != null) {
            audienceId = Long.parseLong(valueaudienceId);
        } else {
            audienceId = null;
        }
        String valuefilter = request.getQueryString("filter");
        String filter;
        if (valuefilter != null) {
            filter = valuefilter;
        } else {
            filter = null;
        }
        String valuetypes = request.getQueryString("types");
        String types;
        if (valuetypes != null) {
            types = valuetypes;
        } else {
            types = null;
        }
        String valuecontentIds = request.getQueryString("contentIds");
        String contentIds;
        if (valuecontentIds != null) {
            contentIds = valuecontentIds;
        } else {
            contentIds = null;
        }
        String valuecontentTypes = request.getQueryString("contentTypes");
        String contentTypes;
        if (valuecontentTypes != null) {
            contentTypes = valuecontentTypes;
        } else {
            contentTypes = null;
        }
        String valueparentIds = request.getQueryString("parentIds");
        String parentIds;
        if (valueparentIds != null) {
            parentIds = valueparentIds;
        } else {
            parentIds = null;
        }
        String valueparentTypes = request.getQueryString("parentTypes");
        String parentTypes;
        if (valueparentTypes != null) {
            parentTypes = valueparentTypes;
        } else {
            parentTypes = null;
        }
        String valuestatuses = request.getQueryString("statuses");
        String statuses;
        if (valuestatuses != null) {
            statuses = valuestatuses;
        } else {
            statuses = null;
        }
        String valuetemplateTypes = request.getQueryString("templateTypes");
        String templateTypes;
        if (valuetemplateTypes != null) {
            templateTypes = valuetemplateTypes;
        } else {
            templateTypes = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = null;
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            activeOnly = null;
        }
        String valuegroupByGroupingId = request.getQueryString("groupByGroupingId");
        Boolean groupByGroupingId;
        if (valuegroupByGroupingId != null) {
            groupByGroupingId = Boolean.valueOf(valuegroupByGroupingId);
        } else {
            groupByGroupingId = null;
        }
        String valuereturnAudienceAccountCount = request.getQueryString("returnAudienceAccountCount");
        Boolean returnAudienceAccountCount;
        if (valuereturnAudienceAccountCount != null) {
            returnAudienceAccountCount = Boolean.valueOf(valuereturnAudienceAccountCount);
        } else {
            returnAudienceAccountCount = null;
        }
        return imp.searchScheduledNotificationsHttp(request, version, accountId, groupingId, audienceId, filter, types, contentIds, contentTypes, parentIds, parentTypes, statuses, templateTypes, appKey, keyword, sortField, descending, start, limit, activeOnly, groupByGroupingId, returnAudienceAccountCount);
    }

    @ApiAction
    public Result updateScheduledNotification(Http.Request request, BigDecimal version) throws Exception {
        String valuescheduledNotificationId = request.getQueryString("scheduledNotificationId");
        Long scheduledNotificationId;
        if (valuescheduledNotificationId != null) {
            scheduledNotificationId = Long.parseLong(valuescheduledNotificationId);
        } else {
            throw new IllegalArgumentException("'scheduledNotificationId' parameter is required");
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            name = null;
        }
        String valuetype = request.getQueryString("type");
        String type;
        if (valuetype != null) {
            type = valuetype;
        } else {
            type = null;
        }
        String valuemessage = request.getQueryString("message");
        String message;
        if (valuemessage != null) {
            message = valuemessage;
        } else {
            message = null;
        }
        String valuepayload = request.getQueryString("payload");
        String payload;
        if (valuepayload != null) {
            payload = valuepayload;
        } else {
            payload = null;
        }
        String valuecontentId = request.getQueryString("contentId");
        Long contentId;
        if (valuecontentId != null) {
            contentId = Long.parseLong(valuecontentId);
        } else {
            contentId = null;
        }
        String valuecontentName = request.getQueryString("contentName");
        String contentName;
        if (valuecontentName != null) {
            contentName = valuecontentName;
        } else {
            contentName = null;
        }
        String valuecontentType = request.getQueryString("contentType");
        String contentType;
        if (valuecontentType != null) {
            contentType = valuecontentType;
        } else {
            contentType = null;
        }
        String valueparentId = request.getQueryString("parentId");
        Long parentId;
        if (valueparentId != null) {
            parentId = Long.parseLong(valueparentId);
        } else {
            parentId = null;
        }
        String valueparentType = request.getQueryString("parentType");
        String parentType;
        if (valueparentType != null) {
            parentType = valueparentType;
        } else {
            parentType = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuegroupingId = request.getQueryString("groupingId");
        String groupingId;
        if (valuegroupingId != null) {
            groupingId = valuegroupingId;
        } else {
            groupingId = null;
        }
        String valueconnectionGroupIds = request.getQueryString("connectionGroupIds");
        String connectionGroupIds;
        if (valueconnectionGroupIds != null) {
            connectionGroupIds = valueconnectionGroupIds;
        } else {
            connectionGroupIds = null;
        }
        String valueconnectionAccountIds = request.getQueryString("connectionAccountIds");
        String connectionAccountIds;
        if (valueconnectionAccountIds != null) {
            connectionAccountIds = valueconnectionAccountIds;
        } else {
            connectionAccountIds = null;
        }
        String valueaudienceId = request.getQueryString("audienceId");
        Long audienceId;
        if (valueaudienceId != null) {
            audienceId = Long.parseLong(valueaudienceId);
        } else {
            audienceId = null;
        }
        String valueaudienceIds = request.getQueryString("audienceIds");
        String audienceIds;
        if (valueaudienceIds != null) {
            audienceIds = valueaudienceIds;
        } else {
            audienceIds = null;
        }
        String valuealbumIds = request.getQueryString("albumIds");
        String albumIds;
        if (valuealbumIds != null) {
            albumIds = valuealbumIds;
        } else {
            albumIds = null;
        }
        String valuereportId = request.getQueryString("reportId");
        Long reportId;
        if (valuereportId != null) {
            reportId = Long.parseLong(valuereportId);
        } else {
            reportId = null;
        }
        String valuereportParams = request.getQueryString("reportParams");
        String reportParams;
        if (valuereportParams != null) {
            reportParams = valuereportParams;
        } else {
            reportParams = null;
        }
        String valueendpointURL = request.getQueryString("endpointURL");
        String endpointURL;
        if (valueendpointURL != null) {
            endpointURL = valueendpointURL;
        } else {
            endpointURL = null;
        }
        String valuescheduledDate = request.getQueryString("scheduledDate");
        Long scheduledDate;
        if (valuescheduledDate != null) {
            scheduledDate = Long.parseLong(valuescheduledDate);
        } else {
            scheduledDate = null;
        }
        String valuestartDate = request.getQueryString("startDate");
        Long startDate;
        if (valuestartDate != null) {
            startDate = Long.parseLong(valuestartDate);
        } else {
            startDate = null;
        }
        String valueendDate = request.getQueryString("endDate");
        Long endDate;
        if (valueendDate != null) {
            endDate = Long.parseLong(valueendDate);
        } else {
            endDate = null;
        }
        String valuecronExpression = request.getQueryString("cronExpression");
        String cronExpression;
        if (valuecronExpression != null) {
            cronExpression = valuecronExpression;
        } else {
            cronExpression = null;
        }
        String valuecronType = request.getQueryString("cronType");
        String cronType;
        if (valuecronType != null) {
            cronType = valuecronType;
        } else {
            cronType = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        String valueconditionalInput = request.getQueryString("conditionalInput");
        String conditionalInput;
        if (valueconditionalInput != null) {
            conditionalInput = valueconditionalInput;
        } else {
            conditionalInput = null;
        }
        String valuetemplateType = request.getQueryString("templateType");
        String templateType;
        if (valuetemplateType != null) {
            templateType = valuetemplateType;
        } else {
            templateType = null;
        }
        String valuevisibility = request.getQueryString("visibility");
        String visibility;
        if (valuevisibility != null) {
            visibility = valuevisibility;
        } else {
            visibility = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valueerrorMessage = request.getQueryString("errorMessage");
        String errorMessage;
        if (valueerrorMessage != null) {
            errorMessage = valueerrorMessage;
        } else {
            errorMessage = null;
        }
        String valuestatus = request.getQueryString("status");
        String status;
        if (valuestatus != null) {
            status = valuestatus;
        } else {
            status = null;
        }
        String valueupdateByGroupingId = request.getQueryString("updateByGroupingId");
        Boolean updateByGroupingId;
        if (valueupdateByGroupingId != null) {
            updateByGroupingId = Boolean.valueOf(valueupdateByGroupingId);
        } else {
            updateByGroupingId = null;
        }
        String valuesendNow = request.getQueryString("sendNow");
        Boolean sendNow;
        if (valuesendNow != null) {
            sendNow = Boolean.valueOf(valuesendNow);
        } else {
            sendNow = null;
        }
        String valueeventType = request.getQueryString("eventType");
        String eventType;
        if (valueeventType != null) {
            eventType = valueeventType;
        } else {
            eventType = "CUSTOM";
        }
        String valuedeepLinkURI = request.getQueryString("deepLinkURI");
        String deepLinkURI;
        if (valuedeepLinkURI != null) {
            deepLinkURI = valuedeepLinkURI;
        } else {
            deepLinkURI = null;
        }
        String valuesendToAll = request.getQueryString("sendToAll");
        Boolean sendToAll;
        if (valuesendToAll != null) {
            sendToAll = Boolean.valueOf(valuesendToAll);
        } else {
            sendToAll = null;
        }
        return imp.updateScheduledNotificationHttp(request, version, scheduledNotificationId, accountId, name, type, message, payload, contentId, contentName, contentType, parentId, parentType, appKey, groupingId, connectionGroupIds, connectionAccountIds, audienceId, audienceIds, albumIds, reportId, reportParams, endpointURL, scheduledDate, startDate, endDate, cronExpression, cronType, metaData, conditionalInput, templateType, visibility, active, errorMessage, status, updateByGroupingId, sendNow, eventType, deepLinkURI, sendToAll);
    }

}
