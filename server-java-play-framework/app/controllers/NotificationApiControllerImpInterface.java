package controllers;

import java.math.BigDecimal;
import apimodels.BlockedNotificationResponse;
import apimodels.NotificationMessageListResponse;
import apimodels.NotificationRecipientResponse;
import apimodels.NotificationRecipientResponseListResponse;
import apimodels.NotificationTemplateResponse;
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
public abstract class NotificationApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createNotificationTemplateHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String conduit, @NotNull String title, @NotNull String body, String appKey, String event, String tags) throws Exception {
        NotificationTemplateResponse obj = createNotificationTemplate(request, version, accountId, conduit, title, body, appKey, event, tags);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract NotificationTemplateResponse createNotificationTemplate(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String conduit, @NotNull String title, @NotNull String body, String appKey, String event, String tags) throws Exception;

    public Result createOrUpdateBlockedNotificationsHttp(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String data, Long accountId) throws Exception {
        BlockedNotificationResponse obj = createOrUpdateBlockedNotifications(request, version, appKey, data, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BlockedNotificationResponse createOrUpdateBlockedNotifications(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String data, Long accountId) throws Exception;

    public Result deleteNotificationTemplateHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long notificationTemplateId) throws Exception {
        NotificationTemplateResponse obj = deleteNotificationTemplate(request, version, accountId, notificationTemplateId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract NotificationTemplateResponse deleteNotificationTemplate(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long notificationTemplateId) throws Exception;

    public Result getNotificationTemplateHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long notificationTemplateId) throws Exception {
        NotificationTemplateResponse obj = getNotificationTemplate(request, version, accountId, notificationTemplateId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract NotificationTemplateResponse getNotificationTemplate(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long notificationTemplateId) throws Exception;

    public Result getNotificationsHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long connectionAccountId, String appKey, String eventType, String contentIds, String contentTypes, String parentIds, String parentTypes, String actionCategory, String conduits, String keyword, Boolean returnReadMessages, Boolean markAsRead, Long fromDate, Double latitude, Double longitude, Boolean returnSent, Boolean ignoreFlagged, Integer start, Integer limit) throws Exception {
        NotificationMessageListResponse obj = getNotifications(request, version, deviceId, accountId, connectionAccountId, appKey, eventType, contentIds, contentTypes, parentIds, parentTypes, actionCategory, conduits, keyword, returnReadMessages, markAsRead, fromDate, latitude, longitude, returnSent, ignoreFlagged, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract NotificationMessageListResponse getNotifications(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long connectionAccountId, String appKey, String eventType, String contentIds, String contentTypes, String parentIds, String parentTypes, String actionCategory, String conduits, String keyword, Boolean returnReadMessages, Boolean markAsRead, Long fromDate, Double latitude, Double longitude, Boolean returnSent, Boolean ignoreFlagged, Integer start, Integer limit) throws Exception;

    public Result registerNotificationTokenHttp(Http.Request request, BigDecimal version, @NotNull String token, @NotNull String pushType, String deviceId, Long accountId, String environment, String appKey, String gameType, Boolean active, Double latitude, Double longitude) throws Exception {
        SirqulResponse obj = registerNotificationToken(request, version, token, pushType, deviceId, accountId, environment, appKey, gameType, active, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse registerNotificationToken(Http.Request request, BigDecimal version, @NotNull String token, @NotNull String pushType, String deviceId, Long accountId, String environment, String appKey, String gameType, Boolean active, Double latitude, Double longitude) throws Exception;

    public Result searchBlockedNotificationsHttp(Http.Request request, BigDecimal version, @NotNull String appKey, Long accountId, String searchTags, String events, String conduits, String customTypes, String contentTypes, String contentIds, String sortField, Boolean descending, Integer start, Integer limit) throws Exception {
        BlockedNotificationResponse obj = searchBlockedNotifications(request, version, appKey, accountId, searchTags, events, conduits, customTypes, contentTypes, contentIds, sortField, descending, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BlockedNotificationResponse searchBlockedNotifications(Http.Request request, BigDecimal version, @NotNull String appKey, Long accountId, String searchTags, String events, String conduits, String customTypes, String contentTypes, String contentIds, String sortField, Boolean descending, Integer start, Integer limit) throws Exception;

    public Result searchNotificationTemplateHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, String appKey, String event, String conduit, Boolean globalOnly, Boolean reservedOnly, String keyword) throws Exception {
        NotificationTemplateResponse obj = searchNotificationTemplate(request, version, accountId, sortField, descending, start, limit, appKey, event, conduit, globalOnly, reservedOnly, keyword);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract NotificationTemplateResponse searchNotificationTemplate(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, String appKey, String event, String conduit, Boolean globalOnly, Boolean reservedOnly, String keyword) throws Exception;

    public Result searchRecipientsHttp(Http.Request request, BigDecimal version, @NotNull String sortField, String deviceId, Long accountId, String appKey, String conduit, String keyword, Long audienceId, String audienceIds, String connectionGroupIds, String recipientAccountIds, Boolean descending, Integer start, Integer limit) throws Exception {
        List<NotificationRecipientResponse> obj = searchRecipients(request, version, sortField, deviceId, accountId, appKey, conduit, keyword, audienceId, audienceIds, connectionGroupIds, recipientAccountIds, descending, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (NotificationRecipientResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<NotificationRecipientResponse> searchRecipients(Http.Request request, BigDecimal version, @NotNull String sortField, String deviceId, Long accountId, String appKey, String conduit, String keyword, Long audienceId, String audienceIds, String connectionGroupIds, String recipientAccountIds, Boolean descending, Integer start, Integer limit) throws Exception;

    public Result searchRecipientsCountHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, String appKey, String conduit, String keyword, Long audienceId, String audienceIds, String connectionGroupIds, String sortField, Boolean descending, Integer start, Integer limit) throws Exception {
        NotificationRecipientResponseListResponse obj = searchRecipientsCount(request, version, deviceId, accountId, appKey, conduit, keyword, audienceId, audienceIds, connectionGroupIds, sortField, descending, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract NotificationRecipientResponseListResponse searchRecipientsCount(Http.Request request, BigDecimal version, String deviceId, Long accountId, String appKey, String conduit, String keyword, Long audienceId, String audienceIds, String connectionGroupIds, String sortField, Boolean descending, Integer start, Integer limit) throws Exception;

    public Result sendBatchNotificationsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String customMessage, String conduit, Long contentId, String contentName, String contentType, Long parentId, String parentType) throws Exception {
        SirqulResponse obj = sendBatchNotifications(request, version, accountId, appKey, customMessage, conduit, contentId, contentName, contentType, parentId, parentType);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse sendBatchNotifications(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String customMessage, String conduit, Long contentId, String contentName, String contentType, Long parentId, String parentType) throws Exception;

    public Result sendCustomNotificationsHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, String receiverAccountIds, Boolean includeFriendGroup, String appKey, String gameType, String conduit, Long contentId, String contentName, String contentType, Long parentId, String parentType, String actionCategory, String subject, String customMessage, Boolean friendOnlyAPNS, Double latitude, Double longitude) throws Exception {
        SirqulResponse obj = sendCustomNotifications(request, version, deviceId, accountId, receiverAccountIds, includeFriendGroup, appKey, gameType, conduit, contentId, contentName, contentType, parentId, parentType, actionCategory, subject, customMessage, friendOnlyAPNS, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse sendCustomNotifications(Http.Request request, BigDecimal version, String deviceId, Long accountId, String receiverAccountIds, Boolean includeFriendGroup, String appKey, String gameType, String conduit, Long contentId, String contentName, String contentType, Long parentId, String parentType, String actionCategory, String subject, String customMessage, Boolean friendOnlyAPNS, Double latitude, Double longitude) throws Exception;

    public Result updateNotificationTemplateHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long notificationTemplateId, String title, String body, String tags) throws Exception {
        NotificationTemplateResponse obj = updateNotificationTemplate(request, version, accountId, notificationTemplateId, title, body, tags);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract NotificationTemplateResponse updateNotificationTemplate(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long notificationTemplateId, String title, String body, String tags) throws Exception;

}
