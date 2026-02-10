package controllers;

import java.math.BigDecimal;
import apimodels.ConnectionGroupResponse;
import apimodels.ConnectionInfoResponse;
import apimodels.ConnectionListResponse;
import apimodels.ConnectionResponse;
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
public class ConnectionApiController extends Controller {
    private final ConnectionApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ConnectionApiController(Config configuration, ConnectionApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result addConnectionToGroup(Http.Request request, BigDecimal version) throws Exception {
        String valuereturnNulls = request.getQueryString("returnNulls");
        Boolean returnNulls;
        if (valuereturnNulls != null) {
            returnNulls = Boolean.valueOf(valuereturnNulls);
        } else {
            throw new IllegalArgumentException("'returnNulls' parameter is required");
        }
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
        String valueconnectionId = request.getQueryString("connectionId");
        Long connectionId;
        if (valueconnectionId != null) {
            connectionId = Long.parseLong(valueconnectionId);
        } else {
            connectionId = null;
        }
        String valueconnectionAccountId = request.getQueryString("connectionAccountId");
        Long connectionAccountId;
        if (valueconnectionAccountId != null) {
            connectionAccountId = Long.parseLong(valueconnectionAccountId);
        } else {
            connectionAccountId = null;
        }
        String valuependingId = request.getQueryString("pendingId");
        Long pendingId;
        if (valuependingId != null) {
            pendingId = Long.parseLong(valuependingId);
        } else {
            pendingId = null;
        }
        String valuegroupId = request.getQueryString("groupId");
        Long groupId;
        if (valuegroupId != null) {
            groupId = Long.parseLong(valuegroupId);
        } else {
            throw new IllegalArgumentException("'groupId' parameter is required");
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
        return imp.addConnectionToGroupHttp(request, version, returnNulls, groupId, deviceId, accountId, connectionId, connectionAccountId, pendingId, latitude, longitude);
    }

    @ApiAction
    public Result addConnectionsToGroup(Http.Request request, BigDecimal version) throws Exception {
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
        String valueconnectionIds = request.getQueryString("connectionIds");
        String connectionIds;
        if (valueconnectionIds != null) {
            connectionIds = valueconnectionIds;
        } else {
            connectionIds = null;
        }
        String valueconnectionAccountIds = request.getQueryString("connectionAccountIds");
        String connectionAccountIds;
        if (valueconnectionAccountIds != null) {
            connectionAccountIds = valueconnectionAccountIds;
        } else {
            connectionAccountIds = null;
        }
        String valueconnectionGroupId = request.getQueryString("connectionGroupId");
        Long connectionGroupId;
        if (valueconnectionGroupId != null) {
            connectionGroupId = Long.parseLong(valueconnectionGroupId);
        } else {
            throw new IllegalArgumentException("'connectionGroupId' parameter is required");
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
        return imp.addConnectionsToGroupHttp(request, version, connectionGroupId, deviceId, accountId, connectionIds, connectionAccountIds, latitude, longitude);
    }

    @ApiAction
    public Result addSubGroups(Http.Request request, BigDecimal version) throws Exception {
        String valuereturnNulls = request.getQueryString("returnNulls");
        Boolean returnNulls;
        if (valuereturnNulls != null) {
            returnNulls = Boolean.valueOf(valuereturnNulls);
        } else {
            throw new IllegalArgumentException("'returnNulls' parameter is required");
        }
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
        String valuegroupId = request.getQueryString("groupId");
        Long groupId;
        if (valuegroupId != null) {
            groupId = Long.parseLong(valuegroupId);
        } else {
            throw new IllegalArgumentException("'groupId' parameter is required");
        }
        String valuesubGroupIds = request.getQueryString("subGroupIds");
        String subGroupIds;
        if (valuesubGroupIds != null) {
            subGroupIds = valuesubGroupIds;
        } else {
            throw new IllegalArgumentException("'subGroupIds' parameter is required");
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
        return imp.addSubGroupsHttp(request, version, returnNulls, groupId, subGroupIds, deviceId, accountId, latitude, longitude);
    }

    @ApiAction
    public Result createOrUpdateConnection(Http.Request request, BigDecimal version) throws Exception {
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
        String valueconnectionId = request.getQueryString("connectionId");
        Long connectionId;
        if (valueconnectionId != null) {
            connectionId = Long.parseLong(valueconnectionId);
        } else {
            connectionId = null;
        }
        String valueconnectionAccountId = request.getQueryString("connectionAccountId");
        Long connectionAccountId;
        if (valueconnectionAccountId != null) {
            connectionAccountId = Long.parseLong(valueconnectionAccountId);
        } else {
            connectionAccountId = null;
        }
        String valuependingId = request.getQueryString("pendingId");
        Long pendingId;
        if (valuependingId != null) {
            pendingId = Long.parseLong(valuependingId);
        } else {
            pendingId = null;
        }
        String valuegroupId = request.getQueryString("groupId");
        Long groupId;
        if (valuegroupId != null) {
            groupId = Long.parseLong(valuegroupId);
        } else {
            groupId = null;
        }
        String valuegameType = request.getQueryString("gameType");
        String gameType;
        if (valuegameType != null) {
            gameType = valuegameType;
        } else {
            gameType = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valueisTrusted = request.getQueryString("isTrusted");
        Boolean isTrusted;
        if (valueisTrusted != null) {
            isTrusted = Boolean.valueOf(valueisTrusted);
        } else {
            isTrusted = null;
        }
        String valueignoreFriendRequest = request.getQueryString("ignoreFriendRequest");
        Boolean ignoreFriendRequest;
        if (valueignoreFriendRequest != null) {
            ignoreFriendRequest = Boolean.valueOf(valueignoreFriendRequest);
        } else {
            ignoreFriendRequest = null;
        }
        String valueisContact = request.getQueryString("isContact");
        Boolean isContact;
        if (valueisContact != null) {
            isContact = Boolean.valueOf(valueisContact);
        } else {
            isContact = null;
        }
        String valueisBlocked = request.getQueryString("isBlocked");
        Boolean isBlocked;
        if (valueisBlocked != null) {
            isBlocked = Boolean.valueOf(valueisBlocked);
        } else {
            isBlocked = null;
        }
        String valueisFollowing = request.getQueryString("isFollowing");
        Boolean isFollowing;
        if (valueisFollowing != null) {
            isFollowing = Boolean.valueOf(valueisFollowing);
        } else {
            isFollowing = null;
        }
        String valueconnectionResponse = request.getQueryString("connectionResponse");
        Boolean connectionResponse;
        if (valueconnectionResponse != null) {
            connectionResponse = Boolean.valueOf(valueconnectionResponse);
        } else {
            connectionResponse = null;
        }
        return imp.createOrUpdateConnectionHttp(request, version, deviceId, accountId, connectionId, connectionAccountId, pendingId, groupId, gameType, appKey, isTrusted, ignoreFriendRequest, isContact, isBlocked, isFollowing, connectionResponse);
    }

    @ApiAction
    public Result createOrUpdateGroup(Http.Request request, BigDecimal version) throws Exception {
        String valuereturnNulls = request.getQueryString("returnNulls");
        Boolean returnNulls;
        if (valuereturnNulls != null) {
            returnNulls = Boolean.valueOf(valuereturnNulls);
        } else {
            throw new IllegalArgumentException("'returnNulls' parameter is required");
        }
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
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            name = null;
        }
        String valuegroupId = request.getQueryString("groupId");
        Long groupId;
        if (valuegroupId != null) {
            groupId = Long.parseLong(valuegroupId);
        } else {
            groupId = null;
        }
        String valueassetId = request.getQueryString("assetId");
        Long assetId;
        if (valueassetId != null) {
            assetId = Long.parseLong(valueassetId);
        } else {
            assetId = null;
        }
        String valueconnections = request.getQueryString("connections");
        String connections;
        if (valueconnections != null) {
            connections = valueconnections;
        } else {
            connections = null;
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuecanViewProfileInfo = request.getQueryString("canViewProfileInfo");
        Boolean canViewProfileInfo;
        if (valuecanViewProfileInfo != null) {
            canViewProfileInfo = Boolean.valueOf(valuecanViewProfileInfo);
        } else {
            canViewProfileInfo = null;
        }
        String valuecanViewGameInfo = request.getQueryString("canViewGameInfo");
        Boolean canViewGameInfo;
        if (valuecanViewGameInfo != null) {
            canViewGameInfo = Boolean.valueOf(valuecanViewGameInfo);
        } else {
            canViewGameInfo = null;
        }
        String valuecanViewFriendInfo = request.getQueryString("canViewFriendInfo");
        Boolean canViewFriendInfo;
        if (valuecanViewFriendInfo != null) {
            canViewFriendInfo = Boolean.valueOf(valuecanViewFriendInfo);
        } else {
            canViewFriendInfo = null;
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
        return imp.createOrUpdateGroupHttp(request, version, returnNulls, deviceId, accountId, name, groupId, assetId, connections, description, canViewProfileInfo, canViewGameInfo, canViewFriendInfo, active, latitude, longitude);
    }

    @ApiAction
    public Result followAccept(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueconnectionAccountId = request.getQueryString("connectionAccountId");
        Long connectionAccountId;
        if (valueconnectionAccountId != null) {
            connectionAccountId = Long.parseLong(valueconnectionAccountId);
        } else {
            throw new IllegalArgumentException("'connectionAccountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        return imp.followAcceptHttp(request, version, accountId, connectionAccountId, appKey);
    }

    @ApiAction
    public Result followReject(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueconnectionAccountId = request.getQueryString("connectionAccountId");
        Long connectionAccountId;
        if (valueconnectionAccountId != null) {
            connectionAccountId = Long.parseLong(valueconnectionAccountId);
        } else {
            throw new IllegalArgumentException("'connectionAccountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        return imp.followRejectHttp(request, version, accountId, connectionAccountId, appKey);
    }

    @ApiAction
    public Result followRemove(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueconnectionAccountId = request.getQueryString("connectionAccountId");
        Long connectionAccountId;
        if (valueconnectionAccountId != null) {
            connectionAccountId = Long.parseLong(valueconnectionAccountId);
        } else {
            throw new IllegalArgumentException("'connectionAccountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        return imp.followRemoveHttp(request, version, accountId, connectionAccountId, appKey);
    }

    @ApiAction
    public Result followRequest(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueconnectionAccountId = request.getQueryString("connectionAccountId");
        Long connectionAccountId;
        if (valueconnectionAccountId != null) {
            connectionAccountId = Long.parseLong(valueconnectionAccountId);
        } else {
            throw new IllegalArgumentException("'connectionAccountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valueapprovalNeeded = request.getQueryString("approvalNeeded");
        Boolean approvalNeeded;
        if (valueapprovalNeeded != null) {
            approvalNeeded = Boolean.valueOf(valueapprovalNeeded);
        } else {
            approvalNeeded = true;
        }
        return imp.followRequestHttp(request, version, accountId, connectionAccountId, appKey, approvalNeeded);
    }

    @ApiAction
    public Result friendAccept(Http.Request request, BigDecimal version) throws Exception {
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
        String valuefriendAccountId = request.getQueryString("friendAccountId");
        Long friendAccountId;
        if (valuefriendAccountId != null) {
            friendAccountId = Long.parseLong(valuefriendAccountId);
        } else {
            throw new IllegalArgumentException("'friendAccountId' parameter is required");
        }
        String valuegameType = request.getQueryString("gameType");
        String gameType;
        if (valuegameType != null) {
            gameType = valuegameType;
        } else {
            gameType = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuenotifyFriend = request.getQueryString("notifyFriend");
        Boolean notifyFriend;
        if (valuenotifyFriend != null) {
            notifyFriend = Boolean.valueOf(valuenotifyFriend);
        } else {
            throw new IllegalArgumentException("'notifyFriend' parameter is required");
        }
        String valuenotificationMessage = request.getQueryString("notificationMessage");
        String notificationMessage;
        if (valuenotificationMessage != null) {
            notificationMessage = valuenotificationMessage;
        } else {
            notificationMessage = null;
        }
        return imp.friendAcceptHttp(request, version, friendAccountId, notifyFriend, deviceId, accountId, gameType, appKey, notificationMessage);
    }

    @ApiAction
    public Result friendReject(Http.Request request, BigDecimal version) throws Exception {
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
        String valuefriendAccountId = request.getQueryString("friendAccountId");
        Long friendAccountId;
        if (valuefriendAccountId != null) {
            friendAccountId = Long.parseLong(valuefriendAccountId);
        } else {
            throw new IllegalArgumentException("'friendAccountId' parameter is required");
        }
        String valuegameType = request.getQueryString("gameType");
        String gameType;
        if (valuegameType != null) {
            gameType = valuegameType;
        } else {
            gameType = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuenotifyFriend = request.getQueryString("notifyFriend");
        Boolean notifyFriend;
        if (valuenotifyFriend != null) {
            notifyFriend = Boolean.valueOf(valuenotifyFriend);
        } else {
            notifyFriend = null;
        }
        String valuenotificationMessage = request.getQueryString("notificationMessage");
        String notificationMessage;
        if (valuenotificationMessage != null) {
            notificationMessage = valuenotificationMessage;
        } else {
            notificationMessage = null;
        }
        return imp.friendRejectHttp(request, version, friendAccountId, deviceId, accountId, gameType, appKey, notifyFriend, notificationMessage);
    }

    @ApiAction
    public Result friendRemove(Http.Request request, BigDecimal version) throws Exception {
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
        String valuefriendAccountId = request.getQueryString("friendAccountId");
        Long friendAccountId;
        if (valuefriendAccountId != null) {
            friendAccountId = Long.parseLong(valuefriendAccountId);
        } else {
            throw new IllegalArgumentException("'friendAccountId' parameter is required");
        }
        String valuenotifyFriend = request.getQueryString("notifyFriend");
        Boolean notifyFriend;
        if (valuenotifyFriend != null) {
            notifyFriend = Boolean.valueOf(valuenotifyFriend);
        } else {
            notifyFriend = null;
        }
        String valueremoveFromGroups = request.getQueryString("removeFromGroups");
        Boolean removeFromGroups;
        if (valueremoveFromGroups != null) {
            removeFromGroups = Boolean.valueOf(valueremoveFromGroups);
        } else {
            removeFromGroups = null;
        }
        return imp.friendRemoveHttp(request, version, friendAccountId, deviceId, accountId, notifyFriend, removeFromGroups);
    }

    @ApiAction
    public Result friendRequest(Http.Request request, BigDecimal version) throws Exception {
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
        String valuefriendAccountId = request.getQueryString("friendAccountId");
        Long friendAccountId;
        if (valuefriendAccountId != null) {
            friendAccountId = Long.parseLong(valuefriendAccountId);
        } else {
            throw new IllegalArgumentException("'friendAccountId' parameter is required");
        }
        String valuegameType = request.getQueryString("gameType");
        String gameType;
        if (valuegameType != null) {
            gameType = valuegameType;
        } else {
            gameType = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuenotificationMessage = request.getQueryString("notificationMessage");
        String notificationMessage;
        if (valuenotificationMessage != null) {
            notificationMessage = valuenotificationMessage;
        } else {
            notificationMessage = null;
        }
        return imp.friendRequestHttp(request, version, friendAccountId, deviceId, accountId, gameType, appKey, notificationMessage);
    }

    @ApiAction
    public Result getConnectionSentFriendRequests(Http.Request request, BigDecimal version) throws Exception {
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
        return imp.getConnectionSentFriendRequestsHttp(request, version, deviceId, accountId);
    }

    @ApiAction
    public Result getConnections(Http.Request request, BigDecimal version) throws Exception {
        String valuereturnNulls = request.getQueryString("returnNulls");
        Boolean returnNulls;
        if (valuereturnNulls != null) {
            returnNulls = Boolean.valueOf(valuereturnNulls);
        } else {
            throw new IllegalArgumentException("'returnNulls' parameter is required");
        }
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
        String valuefilter = request.getQueryString("filter");
        String filter;
        if (valuefilter != null) {
            filter = valuefilter;
        } else {
            throw new IllegalArgumentException("'filter' parameter is required");
        }
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
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
        String valuei = request.getQueryString("_i");
        Integer i;
        if (valuei != null) {
            i = Integer.parseInt(valuei);
        } else {
            i = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            throw new IllegalArgumentException("'start' parameter is required");
        }
        String valuel = request.getQueryString("_l");
        Integer l;
        if (valuel != null) {
            l = Integer.parseInt(valuel);
        } else {
            l = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            throw new IllegalArgumentException("'limit' parameter is required");
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
        return imp.getConnectionsHttp(request, version, returnNulls, filter, sortField, descending, start, limit, deviceId, accountId, connectionAccountId, q, keyword, i, l, latitude, longitude);
    }

    @ApiAction
    public Result getGroupDetails(Http.Request request, BigDecimal version) throws Exception {
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
        String valuegroupId = request.getQueryString("groupId");
        Long groupId;
        if (valuegroupId != null) {
            groupId = Long.parseLong(valuegroupId);
        } else {
            groupId = null;
        }
        String valuecombineConnections = request.getQueryString("combineConnections");
        Boolean combineConnections;
        if (valuecombineConnections != null) {
            combineConnections = Boolean.valueOf(valuecombineConnections);
        } else {
            throw new IllegalArgumentException("'combineConnections' parameter is required");
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
        return imp.getGroupDetailsHttp(request, version, combineConnections, deviceId, accountId, groupId, latitude, longitude);
    }

    @ApiAction
    public Result groupSearch(Http.Request request, BigDecimal version) throws Exception {
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
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            throw new IllegalArgumentException("'activeOnly' parameter is required");
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
        return imp.groupSearchHttp(request, version, sortField, descending, activeOnly, start, limit, deviceId, accountId, latitude, longitude, keyword);
    }

    @ApiAction
    public Result removeConnectionFromGroup(Http.Request request, BigDecimal version) throws Exception {
        String valuereturnNulls = request.getQueryString("returnNulls");
        Boolean returnNulls;
        if (valuereturnNulls != null) {
            returnNulls = Boolean.valueOf(valuereturnNulls);
        } else {
            throw new IllegalArgumentException("'returnNulls' parameter is required");
        }
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
        String valueconnectionId = request.getQueryString("connectionId");
        Long connectionId;
        if (valueconnectionId != null) {
            connectionId = Long.parseLong(valueconnectionId);
        } else {
            connectionId = null;
        }
        String valueconnectionAccountId = request.getQueryString("connectionAccountId");
        Long connectionAccountId;
        if (valueconnectionAccountId != null) {
            connectionAccountId = Long.parseLong(valueconnectionAccountId);
        } else {
            connectionAccountId = null;
        }
        String valuependingId = request.getQueryString("pendingId");
        Long pendingId;
        if (valuependingId != null) {
            pendingId = Long.parseLong(valuependingId);
        } else {
            pendingId = null;
        }
        String valuegroupId = request.getQueryString("groupId");
        Long groupId;
        if (valuegroupId != null) {
            groupId = Long.parseLong(valuegroupId);
        } else {
            throw new IllegalArgumentException("'groupId' parameter is required");
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
        return imp.removeConnectionFromGroupHttp(request, version, returnNulls, groupId, deviceId, accountId, connectionId, connectionAccountId, pendingId, latitude, longitude);
    }

    @ApiAction
    public Result removeConnectionsFromGroup(Http.Request request, BigDecimal version) throws Exception {
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
        String valueconnectionIds = request.getQueryString("connectionIds");
        String connectionIds;
        if (valueconnectionIds != null) {
            connectionIds = valueconnectionIds;
        } else {
            connectionIds = null;
        }
        String valueconnectionAccountIds = request.getQueryString("connectionAccountIds");
        String connectionAccountIds;
        if (valueconnectionAccountIds != null) {
            connectionAccountIds = valueconnectionAccountIds;
        } else {
            connectionAccountIds = null;
        }
        String valueconnectionGroupId = request.getQueryString("connectionGroupId");
        Long connectionGroupId;
        if (valueconnectionGroupId != null) {
            connectionGroupId = Long.parseLong(valueconnectionGroupId);
        } else {
            throw new IllegalArgumentException("'connectionGroupId' parameter is required");
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
        return imp.removeConnectionsFromGroupHttp(request, version, connectionGroupId, deviceId, accountId, connectionIds, connectionAccountIds, latitude, longitude);
    }

    @ApiAction
    public Result removeGroup(Http.Request request, BigDecimal version) throws Exception {
        String valuereturnNulls = request.getQueryString("returnNulls");
        Boolean returnNulls;
        if (valuereturnNulls != null) {
            returnNulls = Boolean.valueOf(valuereturnNulls);
        } else {
            throw new IllegalArgumentException("'returnNulls' parameter is required");
        }
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
        String valuegroupId = request.getQueryString("groupId");
        Long groupId;
        if (valuegroupId != null) {
            groupId = Long.parseLong(valuegroupId);
        } else {
            throw new IllegalArgumentException("'groupId' parameter is required");
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
        return imp.removeGroupHttp(request, version, returnNulls, groupId, deviceId, accountId, latitude, longitude);
    }

    @ApiAction
    public Result removeSubGroups(Http.Request request, BigDecimal version) throws Exception {
        String valuereturnNulls = request.getQueryString("returnNulls");
        Boolean returnNulls;
        if (valuereturnNulls != null) {
            returnNulls = Boolean.valueOf(valuereturnNulls);
        } else {
            throw new IllegalArgumentException("'returnNulls' parameter is required");
        }
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
        String valuegroupId = request.getQueryString("groupId");
        Long groupId;
        if (valuegroupId != null) {
            groupId = Long.parseLong(valuegroupId);
        } else {
            throw new IllegalArgumentException("'groupId' parameter is required");
        }
        String valuesubGroupIds = request.getQueryString("subGroupIds");
        String subGroupIds;
        if (valuesubGroupIds != null) {
            subGroupIds = valuesubGroupIds;
        } else {
            throw new IllegalArgumentException("'subGroupIds' parameter is required");
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
        return imp.removeSubGroupsHttp(request, version, returnNulls, groupId, subGroupIds, deviceId, accountId, latitude, longitude);
    }

    @ApiAction
    public Result searchConnections(Http.Request request, BigDecimal version) throws Exception {
        String valuereturnNulls = request.getQueryString("returnNulls");
        Boolean returnNulls;
        if (valuereturnNulls != null) {
            returnNulls = Boolean.valueOf(valuereturnNulls);
        } else {
            throw new IllegalArgumentException("'returnNulls' parameter is required");
        }
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
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
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
        String valuegameType = request.getQueryString("gameType");
        String gameType;
        if (valuegameType != null) {
            gameType = valuegameType;
        } else {
            gameType = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuei = request.getQueryString("_i");
        Integer i;
        if (valuei != null) {
            i = Integer.parseInt(valuei);
        } else {
            i = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            throw new IllegalArgumentException("'start' parameter is required");
        }
        String valuel = request.getQueryString("_l");
        Integer l;
        if (valuel != null) {
            l = Integer.parseInt(valuel);
        } else {
            l = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            throw new IllegalArgumentException("'limit' parameter is required");
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = null;
        }
        String valuehasLocation = request.getQueryString("hasLocation");
        Boolean hasLocation;
        if (valuehasLocation != null) {
            hasLocation = Boolean.valueOf(valuehasLocation);
        } else {
            hasLocation = null;
        }
        return imp.searchConnectionsHttp(request, version, returnNulls, start, limit, deviceId, accountId, q, keyword, latitude, longitude, gameType, appKey, i, l, sortField, hasLocation);
    }

}
