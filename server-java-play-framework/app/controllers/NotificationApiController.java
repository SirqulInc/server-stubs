package controllers;

import java.math.BigDecimal;
import apimodels.BlockedNotificationResponse;
import apimodels.NotificationMessageListResponse;
import apimodels.NotificationRecipientResponse;
import apimodels.NotificationRecipientResponseListResponse;
import apimodels.NotificationTemplateResponse;
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
public class NotificationApiController extends Controller {
    private final NotificationApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private NotificationApiController(Config configuration, NotificationApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createNotificationTemplate(Http.Request request, BigDecimal version) throws Exception {
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
            appKey = null;
        }
        String valueevent = request.getQueryString("event");
        String event;
        if (valueevent != null) {
            event = valueevent;
        } else {
            event = null;
        }
        String valueconduit = request.getQueryString("conduit");
        String conduit;
        if (valueconduit != null) {
            conduit = valueconduit;
        } else {
            throw new IllegalArgumentException("'conduit' parameter is required");
        }
        String valuetitle = request.getQueryString("title");
        String title;
        if (valuetitle != null) {
            title = valuetitle;
        } else {
            throw new IllegalArgumentException("'title' parameter is required");
        }
        String valuebody = request.getQueryString("body");
        String body;
        if (valuebody != null) {
            body = valuebody;
        } else {
            throw new IllegalArgumentException("'body' parameter is required");
        }
        String valuetags = request.getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            tags = null;
        }
        return imp.createNotificationTemplateHttp(request, version, accountId, conduit, title, body, appKey, event, tags);
    }

    @ApiAction
    public Result createOrUpdateBlockedNotifications(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuedata = request.getQueryString("data");
        String data;
        if (valuedata != null) {
            data = valuedata;
        } else {
            throw new IllegalArgumentException("'data' parameter is required");
        }
        return imp.createOrUpdateBlockedNotificationsHttp(request, version, appKey, data, accountId);
    }

    @ApiAction
    public Result deleteNotificationTemplate(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuenotificationTemplateId = request.getQueryString("notificationTemplateId");
        Long notificationTemplateId;
        if (valuenotificationTemplateId != null) {
            notificationTemplateId = Long.parseLong(valuenotificationTemplateId);
        } else {
            throw new IllegalArgumentException("'notificationTemplateId' parameter is required");
        }
        return imp.deleteNotificationTemplateHttp(request, version, accountId, notificationTemplateId);
    }

    @ApiAction
    public Result getNotificationTemplate(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuenotificationTemplateId = request.getQueryString("notificationTemplateId");
        Long notificationTemplateId;
        if (valuenotificationTemplateId != null) {
            notificationTemplateId = Long.parseLong(valuenotificationTemplateId);
        } else {
            throw new IllegalArgumentException("'notificationTemplateId' parameter is required");
        }
        return imp.getNotificationTemplateHttp(request, version, accountId, notificationTemplateId);
    }

    @ApiAction
    public Result getNotifications(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueconnectionAccountId = request.getQueryString("connectionAccountId");
        Long connectionAccountId;
        if (valueconnectionAccountId != null) {
            connectionAccountId = Long.parseLong(valueconnectionAccountId);
        } else {
            connectionAccountId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valueeventType = request.getQueryString("eventType");
        String eventType;
        if (valueeventType != null) {
            eventType = valueeventType;
        } else {
            eventType = null;
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
        String valueactionCategory = request.getQueryString("actionCategory");
        String actionCategory;
        if (valueactionCategory != null) {
            actionCategory = valueactionCategory;
        } else {
            actionCategory = null;
        }
        String valueconduits = request.getQueryString("conduits");
        String conduits;
        if (valueconduits != null) {
            conduits = valueconduits;
        } else {
            conduits = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valuereturnReadMessages = request.getQueryString("returnReadMessages");
        Boolean returnReadMessages;
        if (valuereturnReadMessages != null) {
            returnReadMessages = Boolean.valueOf(valuereturnReadMessages);
        } else {
            returnReadMessages = null;
        }
        String valuemarkAsRead = request.getQueryString("markAsRead");
        Boolean markAsRead;
        if (valuemarkAsRead != null) {
            markAsRead = Boolean.valueOf(valuemarkAsRead);
        } else {
            markAsRead = null;
        }
        String valuefromDate = request.getQueryString("fromDate");
        Long fromDate;
        if (valuefromDate != null) {
            fromDate = Long.parseLong(valuefromDate);
        } else {
            fromDate = null;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        String valuereturnSent = request.getQueryString("returnSent");
        Boolean returnSent;
        if (valuereturnSent != null) {
            returnSent = Boolean.valueOf(valuereturnSent);
        } else {
            returnSent = null;
        }
        String valueignoreFlagged = request.getQueryString("ignoreFlagged");
        Boolean ignoreFlagged;
        if (valueignoreFlagged != null) {
            ignoreFlagged = Boolean.valueOf(valueignoreFlagged);
        } else {
            ignoreFlagged = null;
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
        return imp.getNotificationsHttp(request, version, deviceId, accountId, connectionAccountId, appKey, eventType, contentIds, contentTypes, parentIds, parentTypes, actionCategory, conduits, keyword, returnReadMessages, markAsRead, fromDate, latitude, longitude, returnSent, ignoreFlagged, start, limit);
    }

    @ApiAction
    public Result registerNotificationToken(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuetoken = request.getQueryString("token");
        String token;
        if (valuetoken != null) {
            token = valuetoken;
        } else {
            throw new IllegalArgumentException("'token' parameter is required");
        }
        String valuepushType = request.getQueryString("pushType");
        String pushType;
        if (valuepushType != null) {
            pushType = valuepushType;
        } else {
            throw new IllegalArgumentException("'pushType' parameter is required");
        }
        String valueenvironment = request.getQueryString("environment");
        String environment;
        if (valueenvironment != null) {
            environment = valueenvironment;
        } else {
            environment = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuegameType = request.getQueryString("gameType");
        String gameType;
        if (valuegameType != null) {
            gameType = valuegameType;
        } else {
            gameType = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        return imp.registerNotificationTokenHttp(request, version, token, pushType, deviceId, accountId, environment, appKey, gameType, active, latitude, longitude);
    }

    @ApiAction
    public Result searchBlockedNotifications(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuesearchTags = request.getQueryString("searchTags");
        String searchTags;
        if (valuesearchTags != null) {
            searchTags = valuesearchTags;
        } else {
            searchTags = null;
        }
        String valueevents = request.getQueryString("events");
        String events;
        if (valueevents != null) {
            events = valueevents;
        } else {
            events = null;
        }
        String valueconduits = request.getQueryString("conduits");
        String conduits;
        if (valueconduits != null) {
            conduits = valueconduits;
        } else {
            conduits = null;
        }
        String valuecustomTypes = request.getQueryString("customTypes");
        String customTypes;
        if (valuecustomTypes != null) {
            customTypes = valuecustomTypes;
        } else {
            customTypes = null;
        }
        String valuecontentTypes = request.getQueryString("contentTypes");
        String contentTypes;
        if (valuecontentTypes != null) {
            contentTypes = valuecontentTypes;
        } else {
            contentTypes = null;
        }
        String valuecontentIds = request.getQueryString("contentIds");
        String contentIds;
        if (valuecontentIds != null) {
            contentIds = valuecontentIds;
        } else {
            contentIds = null;
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
        return imp.searchBlockedNotificationsHttp(request, version, appKey, accountId, searchTags, events, conduits, customTypes, contentTypes, contentIds, sortField, descending, start, limit);
    }

    @ApiAction
    public Result searchNotificationTemplate(Http.Request request, BigDecimal version) throws Exception {
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
            appKey = null;
        }
        String valueevent = request.getQueryString("event");
        String event;
        if (valueevent != null) {
            event = valueevent;
        } else {
            event = null;
        }
        String valueconduit = request.getQueryString("conduit");
        String conduit;
        if (valueconduit != null) {
            conduit = valueconduit;
        } else {
            conduit = null;
        }
        String valueglobalOnly = request.getQueryString("globalOnly");
        Boolean globalOnly;
        if (valueglobalOnly != null) {
            globalOnly = Boolean.valueOf(valueglobalOnly);
        } else {
            globalOnly = null;
        }
        String valuereservedOnly = request.getQueryString("reservedOnly");
        Boolean reservedOnly;
        if (valuereservedOnly != null) {
            reservedOnly = Boolean.valueOf(valuereservedOnly);
        } else {
            reservedOnly = null;
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
            throw new IllegalArgumentException("'sortField' parameter is required");
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            throw new IllegalArgumentException("'descending' parameter is required");
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            throw new IllegalArgumentException("'start' parameter is required");
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            throw new IllegalArgumentException("'limit' parameter is required");
        }
        return imp.searchNotificationTemplateHttp(request, version, accountId, sortField, descending, start, limit, appKey, event, conduit, globalOnly, reservedOnly, keyword);
    }

    @ApiAction
    public Result searchRecipients(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valueconduit = request.getQueryString("conduit");
        String conduit;
        if (valueconduit != null) {
            conduit = valueconduit;
        } else {
            conduit = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
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
        String valueconnectionGroupIds = request.getQueryString("connectionGroupIds");
        String connectionGroupIds;
        if (valueconnectionGroupIds != null) {
            connectionGroupIds = valueconnectionGroupIds;
        } else {
            connectionGroupIds = null;
        }
        String valuerecipientAccountIds = request.getQueryString("recipientAccountIds");
        String recipientAccountIds;
        if (valuerecipientAccountIds != null) {
            recipientAccountIds = valuerecipientAccountIds;
        } else {
            recipientAccountIds = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            throw new IllegalArgumentException("'sortField' parameter is required");
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
        return imp.searchRecipientsHttp(request, version, sortField, deviceId, accountId, appKey, conduit, keyword, audienceId, audienceIds, connectionGroupIds, recipientAccountIds, descending, start, limit);
    }

    @ApiAction
    public Result searchRecipientsCount(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valueconduit = request.getQueryString("conduit");
        String conduit;
        if (valueconduit != null) {
            conduit = valueconduit;
        } else {
            conduit = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
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
        String valueconnectionGroupIds = request.getQueryString("connectionGroupIds");
        String connectionGroupIds;
        if (valueconnectionGroupIds != null) {
            connectionGroupIds = valueconnectionGroupIds;
        } else {
            connectionGroupIds = null;
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
        return imp.searchRecipientsCountHttp(request, version, deviceId, accountId, appKey, conduit, keyword, audienceId, audienceIds, connectionGroupIds, sortField, descending, start, limit);
    }

    @ApiAction
    public Result sendBatchNotifications(Http.Request request, BigDecimal version) throws Exception {
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
        String valueconduit = request.getQueryString("conduit");
        String conduit;
        if (valueconduit != null) {
            conduit = valueconduit;
        } else {
            conduit = null;
        }
        String valuecustomMessage = request.getQueryString("customMessage");
        String customMessage;
        if (valuecustomMessage != null) {
            customMessage = valuecustomMessage;
        } else {
            throw new IllegalArgumentException("'customMessage' parameter is required");
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
        return imp.sendBatchNotificationsHttp(request, version, accountId, appKey, customMessage, conduit, contentId, contentName, contentType, parentId, parentType);
    }

    @ApiAction
    public Result sendCustomNotifications(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuereceiverAccountIds = request.getQueryString("receiverAccountIds");
        String receiverAccountIds;
        if (valuereceiverAccountIds != null) {
            receiverAccountIds = valuereceiverAccountIds;
        } else {
            receiverAccountIds = null;
        }
        String valueincludeFriendGroup = request.getQueryString("includeFriendGroup");
        Boolean includeFriendGroup;
        if (valueincludeFriendGroup != null) {
            includeFriendGroup = Boolean.valueOf(valueincludeFriendGroup);
        } else {
            includeFriendGroup = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuegameType = request.getQueryString("gameType");
        String gameType;
        if (valuegameType != null) {
            gameType = valuegameType;
        } else {
            gameType = null;
        }
        String valueconduit = request.getQueryString("conduit");
        String conduit;
        if (valueconduit != null) {
            conduit = valueconduit;
        } else {
            conduit = null;
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
        String valueactionCategory = request.getQueryString("actionCategory");
        String actionCategory;
        if (valueactionCategory != null) {
            actionCategory = valueactionCategory;
        } else {
            actionCategory = null;
        }
        String valuesubject = request.getQueryString("subject");
        String subject;
        if (valuesubject != null) {
            subject = valuesubject;
        } else {
            subject = null;
        }
        String valuecustomMessage = request.getQueryString("customMessage");
        String customMessage;
        if (valuecustomMessage != null) {
            customMessage = valuecustomMessage;
        } else {
            customMessage = null;
        }
        String valuefriendOnlyAPNS = request.getQueryString("friendOnlyAPNS");
        Boolean friendOnlyAPNS;
        if (valuefriendOnlyAPNS != null) {
            friendOnlyAPNS = Boolean.valueOf(valuefriendOnlyAPNS);
        } else {
            friendOnlyAPNS = null;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        return imp.sendCustomNotificationsHttp(request, version, deviceId, accountId, receiverAccountIds, includeFriendGroup, appKey, gameType, conduit, contentId, contentName, contentType, parentId, parentType, actionCategory, subject, customMessage, friendOnlyAPNS, latitude, longitude);
    }

    @ApiAction
    public Result updateNotificationTemplate(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuenotificationTemplateId = request.getQueryString("notificationTemplateId");
        Long notificationTemplateId;
        if (valuenotificationTemplateId != null) {
            notificationTemplateId = Long.parseLong(valuenotificationTemplateId);
        } else {
            throw new IllegalArgumentException("'notificationTemplateId' parameter is required");
        }
        String valuetitle = request.getQueryString("title");
        String title;
        if (valuetitle != null) {
            title = valuetitle;
        } else {
            title = null;
        }
        String valuebody = request.getQueryString("body");
        String body;
        if (valuebody != null) {
            body = valuebody;
        } else {
            body = null;
        }
        String valuetags = request.getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            tags = null;
        }
        return imp.updateNotificationTemplateHttp(request, version, accountId, notificationTemplateId, title, body, tags);
    }

}
