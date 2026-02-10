package controllers;

import java.math.BigDecimal;
import apimodels.ConnectionGroupResponse;
import apimodels.ConnectionInfoResponse;
import apimodels.ConnectionListResponse;
import apimodels.ConnectionResponse;
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
public abstract class ConnectionApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result addConnectionToGroupHttp(Http.Request request, BigDecimal version, @NotNull Boolean returnNulls, @NotNull Long groupId, String deviceId, Long accountId, Long connectionId, Long connectionAccountId, Long pendingId, Double latitude, Double longitude) throws Exception {
        SirqulResponse obj = addConnectionToGroup(request, version, returnNulls, groupId, deviceId, accountId, connectionId, connectionAccountId, pendingId, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse addConnectionToGroup(Http.Request request, BigDecimal version, @NotNull Boolean returnNulls, @NotNull Long groupId, String deviceId, Long accountId, Long connectionId, Long connectionAccountId, Long pendingId, Double latitude, Double longitude) throws Exception;

    public Result addConnectionsToGroupHttp(Http.Request request, BigDecimal version, @NotNull Long connectionGroupId, String deviceId, Long accountId, String connectionIds, String connectionAccountIds, Double latitude, Double longitude) throws Exception {
        SirqulResponse obj = addConnectionsToGroup(request, version, connectionGroupId, deviceId, accountId, connectionIds, connectionAccountIds, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse addConnectionsToGroup(Http.Request request, BigDecimal version, @NotNull Long connectionGroupId, String deviceId, Long accountId, String connectionIds, String connectionAccountIds, Double latitude, Double longitude) throws Exception;

    public Result addSubGroupsHttp(Http.Request request, BigDecimal version, @NotNull Boolean returnNulls, @NotNull Long groupId, @NotNull String subGroupIds, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception {
        ConnectionGroupResponse obj = addSubGroups(request, version, returnNulls, groupId, subGroupIds, deviceId, accountId, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ConnectionGroupResponse addSubGroups(Http.Request request, BigDecimal version, @NotNull Boolean returnNulls, @NotNull Long groupId, @NotNull String subGroupIds, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception;

    public Result createOrUpdateConnectionHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long connectionId, Long connectionAccountId, Long pendingId, Long groupId, String gameType, String appKey, Boolean isTrusted, Boolean ignoreFriendRequest, Boolean isContact, Boolean isBlocked, Boolean isFollowing, Boolean connectionResponse) throws Exception {
        ConnectionResponse obj = createOrUpdateConnection(request, version, deviceId, accountId, connectionId, connectionAccountId, pendingId, groupId, gameType, appKey, isTrusted, ignoreFriendRequest, isContact, isBlocked, isFollowing, connectionResponse);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ConnectionResponse createOrUpdateConnection(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long connectionId, Long connectionAccountId, Long pendingId, Long groupId, String gameType, String appKey, Boolean isTrusted, Boolean ignoreFriendRequest, Boolean isContact, Boolean isBlocked, Boolean isFollowing, Boolean connectionResponse) throws Exception;

    public Result createOrUpdateGroupHttp(Http.Request request, BigDecimal version, @NotNull Boolean returnNulls, String deviceId, Long accountId, String name, Long groupId, Long assetId, String connections, String description, Boolean canViewProfileInfo, Boolean canViewGameInfo, Boolean canViewFriendInfo, Boolean active, Double latitude, Double longitude) throws Exception {
        SirqulResponse obj = createOrUpdateGroup(request, version, returnNulls, deviceId, accountId, name, groupId, assetId, connections, description, canViewProfileInfo, canViewGameInfo, canViewFriendInfo, active, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse createOrUpdateGroup(Http.Request request, BigDecimal version, @NotNull Boolean returnNulls, String deviceId, Long accountId, String name, Long groupId, Long assetId, String connections, String description, Boolean canViewProfileInfo, Boolean canViewGameInfo, Boolean canViewFriendInfo, Boolean active, Double latitude, Double longitude) throws Exception;

    public Result followAcceptHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long connectionAccountId, @NotNull String appKey) throws Exception {
        SirqulResponse obj = followAccept(request, version, accountId, connectionAccountId, appKey);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse followAccept(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long connectionAccountId, @NotNull String appKey) throws Exception;

    public Result followRejectHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long connectionAccountId, @NotNull String appKey) throws Exception {
        SirqulResponse obj = followReject(request, version, accountId, connectionAccountId, appKey);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse followReject(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long connectionAccountId, @NotNull String appKey) throws Exception;

    public Result followRemoveHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long connectionAccountId, @NotNull String appKey) throws Exception {
        SirqulResponse obj = followRemove(request, version, accountId, connectionAccountId, appKey);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse followRemove(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long connectionAccountId, @NotNull String appKey) throws Exception;

    public Result followRequestHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long connectionAccountId, @NotNull String appKey, Boolean approvalNeeded) throws Exception {
        SirqulResponse obj = followRequest(request, version, accountId, connectionAccountId, appKey, approvalNeeded);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse followRequest(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long connectionAccountId, @NotNull String appKey, Boolean approvalNeeded) throws Exception;

    public Result friendAcceptHttp(Http.Request request, BigDecimal version, @NotNull Long friendAccountId, @NotNull Boolean notifyFriend, String deviceId, Long accountId, String gameType, String appKey, String notificationMessage) throws Exception {
        SirqulResponse obj = friendAccept(request, version, friendAccountId, notifyFriend, deviceId, accountId, gameType, appKey, notificationMessage);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse friendAccept(Http.Request request, BigDecimal version, @NotNull Long friendAccountId, @NotNull Boolean notifyFriend, String deviceId, Long accountId, String gameType, String appKey, String notificationMessage) throws Exception;

    public Result friendRejectHttp(Http.Request request, BigDecimal version, @NotNull Long friendAccountId, String deviceId, Long accountId, String gameType, String appKey, Boolean notifyFriend, String notificationMessage) throws Exception {
        SirqulResponse obj = friendReject(request, version, friendAccountId, deviceId, accountId, gameType, appKey, notifyFriend, notificationMessage);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse friendReject(Http.Request request, BigDecimal version, @NotNull Long friendAccountId, String deviceId, Long accountId, String gameType, String appKey, Boolean notifyFriend, String notificationMessage) throws Exception;

    public Result friendRemoveHttp(Http.Request request, BigDecimal version, @NotNull Long friendAccountId, String deviceId, Long accountId, Boolean notifyFriend, Boolean removeFromGroups) throws Exception {
        SirqulResponse obj = friendRemove(request, version, friendAccountId, deviceId, accountId, notifyFriend, removeFromGroups);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse friendRemove(Http.Request request, BigDecimal version, @NotNull Long friendAccountId, String deviceId, Long accountId, Boolean notifyFriend, Boolean removeFromGroups) throws Exception;

    public Result friendRequestHttp(Http.Request request, BigDecimal version, @NotNull Long friendAccountId, String deviceId, Long accountId, String gameType, String appKey, String notificationMessage) throws Exception {
        SirqulResponse obj = friendRequest(request, version, friendAccountId, deviceId, accountId, gameType, appKey, notificationMessage);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse friendRequest(Http.Request request, BigDecimal version, @NotNull Long friendAccountId, String deviceId, Long accountId, String gameType, String appKey, String notificationMessage) throws Exception;

    public Result getConnectionSentFriendRequestsHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId) throws Exception {
        ConnectionListResponse obj = getConnectionSentFriendRequests(request, version, deviceId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ConnectionListResponse getConnectionSentFriendRequests(Http.Request request, BigDecimal version, String deviceId, Long accountId) throws Exception;

    public Result getConnectionsHttp(Http.Request request, BigDecimal version, @NotNull Boolean returnNulls, @NotNull String filter, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, String deviceId, Long accountId, Long connectionAccountId, String q, String keyword, Integer i, Integer l, Double latitude, Double longitude) throws Exception {
        ConnectionListResponse obj = getConnections(request, version, returnNulls, filter, sortField, descending, start, limit, deviceId, accountId, connectionAccountId, q, keyword, i, l, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ConnectionListResponse getConnections(Http.Request request, BigDecimal version, @NotNull Boolean returnNulls, @NotNull String filter, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, String deviceId, Long accountId, Long connectionAccountId, String q, String keyword, Integer i, Integer l, Double latitude, Double longitude) throws Exception;

    public Result getGroupDetailsHttp(Http.Request request, BigDecimal version, @NotNull Boolean combineConnections, String deviceId, Long accountId, Long groupId, Double latitude, Double longitude) throws Exception {
        ConnectionGroupResponse obj = getGroupDetails(request, version, combineConnections, deviceId, accountId, groupId, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ConnectionGroupResponse getGroupDetails(Http.Request request, BigDecimal version, @NotNull Boolean combineConnections, String deviceId, Long accountId, Long groupId, Double latitude, Double longitude) throws Exception;

    public Result groupSearchHttp(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Boolean activeOnly, @NotNull Integer start, @NotNull Integer limit, String deviceId, Long accountId, Double latitude, Double longitude, String keyword) throws Exception {
        List<ConnectionInfoResponse> obj = groupSearch(request, version, sortField, descending, activeOnly, start, limit, deviceId, accountId, latitude, longitude, keyword);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (ConnectionInfoResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<ConnectionInfoResponse> groupSearch(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Boolean activeOnly, @NotNull Integer start, @NotNull Integer limit, String deviceId, Long accountId, Double latitude, Double longitude, String keyword) throws Exception;

    public Result removeConnectionFromGroupHttp(Http.Request request, BigDecimal version, @NotNull Boolean returnNulls, @NotNull Long groupId, String deviceId, Long accountId, Long connectionId, Long connectionAccountId, Long pendingId, Double latitude, Double longitude) throws Exception {
        SirqulResponse obj = removeConnectionFromGroup(request, version, returnNulls, groupId, deviceId, accountId, connectionId, connectionAccountId, pendingId, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse removeConnectionFromGroup(Http.Request request, BigDecimal version, @NotNull Boolean returnNulls, @NotNull Long groupId, String deviceId, Long accountId, Long connectionId, Long connectionAccountId, Long pendingId, Double latitude, Double longitude) throws Exception;

    public Result removeConnectionsFromGroupHttp(Http.Request request, BigDecimal version, @NotNull Long connectionGroupId, String deviceId, Long accountId, String connectionIds, String connectionAccountIds, Double latitude, Double longitude) throws Exception {
        SirqulResponse obj = removeConnectionsFromGroup(request, version, connectionGroupId, deviceId, accountId, connectionIds, connectionAccountIds, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse removeConnectionsFromGroup(Http.Request request, BigDecimal version, @NotNull Long connectionGroupId, String deviceId, Long accountId, String connectionIds, String connectionAccountIds, Double latitude, Double longitude) throws Exception;

    public Result removeGroupHttp(Http.Request request, BigDecimal version, @NotNull Boolean returnNulls, @NotNull Long groupId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception {
        SirqulResponse obj = removeGroup(request, version, returnNulls, groupId, deviceId, accountId, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse removeGroup(Http.Request request, BigDecimal version, @NotNull Boolean returnNulls, @NotNull Long groupId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception;

    public Result removeSubGroupsHttp(Http.Request request, BigDecimal version, @NotNull Boolean returnNulls, @NotNull Long groupId, @NotNull String subGroupIds, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception {
        SirqulResponse obj = removeSubGroups(request, version, returnNulls, groupId, subGroupIds, deviceId, accountId, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse removeSubGroups(Http.Request request, BigDecimal version, @NotNull Boolean returnNulls, @NotNull Long groupId, @NotNull String subGroupIds, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception;

    public Result searchConnectionsHttp(Http.Request request, BigDecimal version, @NotNull Boolean returnNulls, @NotNull Integer start, @NotNull Integer limit, String deviceId, Long accountId, String q, String keyword, Double latitude, Double longitude, String gameType, String appKey, Integer i, Integer l, String sortField, Boolean hasLocation) throws Exception {
        ConnectionListResponse obj = searchConnections(request, version, returnNulls, start, limit, deviceId, accountId, q, keyword, latitude, longitude, gameType, appKey, i, l, sortField, hasLocation);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ConnectionListResponse searchConnections(Http.Request request, BigDecimal version, @NotNull Boolean returnNulls, @NotNull Integer start, @NotNull Integer limit, String deviceId, Long accountId, String q, String keyword, Double latitude, Double longitude, String gameType, String appKey, Integer i, Integer l, String sortField, Boolean hasLocation) throws Exception;

}
