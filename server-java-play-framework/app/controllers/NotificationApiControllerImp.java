package controllers;

import java.math.BigDecimal;
import apimodels.BlockedNotificationResponse;
import apimodels.NotificationMessageListResponse;
import apimodels.NotificationRecipientResponse;
import apimodels.NotificationRecipientResponseListResponse;
import apimodels.NotificationTemplateResponse;
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
public class NotificationApiControllerImp extends NotificationApiControllerImpInterface {
    @Override
    public NotificationTemplateResponse createNotificationTemplate(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String conduit, @NotNull String title, @NotNull String body, String appKey, String event, String tags) throws Exception {
        //Do your magic!!!
        return new NotificationTemplateResponse();
    }

    @Override
    public BlockedNotificationResponse createOrUpdateBlockedNotifications(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String data, Long accountId) throws Exception {
        //Do your magic!!!
        return new BlockedNotificationResponse();
    }

    @Override
    public NotificationTemplateResponse deleteNotificationTemplate(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long notificationTemplateId) throws Exception {
        //Do your magic!!!
        return new NotificationTemplateResponse();
    }

    @Override
    public NotificationTemplateResponse getNotificationTemplate(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long notificationTemplateId) throws Exception {
        //Do your magic!!!
        return new NotificationTemplateResponse();
    }

    @Override
    public NotificationMessageListResponse getNotifications(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long connectionAccountId, String appKey, String eventType, String contentIds, String contentTypes, String parentIds, String parentTypes, String actionCategory, String conduits, String keyword, Boolean returnReadMessages, Boolean markAsRead, Long fromDate, Double latitude, Double longitude, Boolean returnSent, Boolean ignoreFlagged, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new NotificationMessageListResponse();
    }

    @Override
    public SirqulResponse registerNotificationToken(Http.Request request, BigDecimal version, @NotNull String token, @NotNull String pushType, String deviceId, Long accountId, String environment, String appKey, String gameType, Boolean active, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public BlockedNotificationResponse searchBlockedNotifications(Http.Request request, BigDecimal version, @NotNull String appKey, Long accountId, String searchTags, String events, String conduits, String customTypes, String contentTypes, String contentIds, String sortField, Boolean descending, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new BlockedNotificationResponse();
    }

    @Override
    public NotificationTemplateResponse searchNotificationTemplate(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, String appKey, String event, String conduit, Boolean globalOnly, Boolean reservedOnly, String keyword) throws Exception {
        //Do your magic!!!
        return new NotificationTemplateResponse();
    }

    @Override
    public List<NotificationRecipientResponse> searchRecipients(Http.Request request, BigDecimal version, @NotNull String sortField, String deviceId, Long accountId, String appKey, String conduit, String keyword, Long audienceId, String audienceIds, String connectionGroupIds, String recipientAccountIds, Boolean descending, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new ArrayList<NotificationRecipientResponse>();
    }

    @Override
    public NotificationRecipientResponseListResponse searchRecipientsCount(Http.Request request, BigDecimal version, String deviceId, Long accountId, String appKey, String conduit, String keyword, Long audienceId, String audienceIds, String connectionGroupIds, String sortField, Boolean descending, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new NotificationRecipientResponseListResponse();
    }

    @Override
    public SirqulResponse sendBatchNotifications(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String customMessage, String conduit, Long contentId, String contentName, String contentType, Long parentId, String parentType) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SirqulResponse sendCustomNotifications(Http.Request request, BigDecimal version, String deviceId, Long accountId, String receiverAccountIds, Boolean includeFriendGroup, String appKey, String gameType, String conduit, Long contentId, String contentName, String contentType, Long parentId, String parentType, String actionCategory, String subject, String customMessage, Boolean friendOnlyAPNS, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public NotificationTemplateResponse updateNotificationTemplate(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long notificationTemplateId, String title, String body, String tags) throws Exception {
        //Do your magic!!!
        return new NotificationTemplateResponse();
    }

}
