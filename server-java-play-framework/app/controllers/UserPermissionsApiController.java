package controllers;

import java.math.BigDecimal;
import apimodels.SirqulResponse;
import apimodels.UserPermissionsResponse;

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
public class UserPermissionsApiController extends Controller {
    private final UserPermissionsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private UserPermissionsApiController(Config configuration, UserPermissionsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result addUsersToPermissionable(Http.Request request, BigDecimal version) throws Exception {
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
        String valuepermissionableType = request.getQueryString("permissionableType");
        String permissionableType;
        if (valuepermissionableType != null) {
            permissionableType = valuepermissionableType;
        } else {
            throw new IllegalArgumentException("'permissionableType' parameter is required");
        }
        String valuepermissionableId = request.getQueryString("permissionableId");
        Long permissionableId;
        if (valuepermissionableId != null) {
            permissionableId = Long.parseLong(valuepermissionableId);
        } else {
            throw new IllegalArgumentException("'permissionableId' parameter is required");
        }
        String valueread = request.getQueryString("read");
        Boolean read;
        if (valueread != null) {
            read = Boolean.valueOf(valueread);
        } else {
            read = true;
        }
        String valuewrite = request.getQueryString("write");
        Boolean write;
        if (valuewrite != null) {
            write = Boolean.valueOf(valuewrite);
        } else {
            write = false;
        }
        String valuedelete = request.getQueryString("delete");
        Boolean delete;
        if (valuedelete != null) {
            delete = Boolean.valueOf(valuedelete);
        } else {
            delete = false;
        }
        String valueadd = request.getQueryString("add");
        Boolean add;
        if (valueadd != null) {
            add = Boolean.valueOf(valueadd);
        } else {
            add = false;
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
        String valueconnectionGroupIds = request.getQueryString("connectionGroupIds");
        String connectionGroupIds;
        if (valueconnectionGroupIds != null) {
            connectionGroupIds = valueconnectionGroupIds;
        } else {
            connectionGroupIds = null;
        }
        String valuepending = request.getQueryString("pending");
        Boolean pending;
        if (valuepending != null) {
            pending = Boolean.valueOf(valuepending);
        } else {
            pending = false;
        }
        String valueadmin = request.getQueryString("admin");
        Boolean admin;
        if (valueadmin != null) {
            admin = Boolean.valueOf(valueadmin);
        } else {
            admin = null;
        }
        String valueincludeFriendGroup = request.getQueryString("includeFriendGroup");
        Boolean includeFriendGroup;
        if (valueincludeFriendGroup != null) {
            includeFriendGroup = Boolean.valueOf(valueincludeFriendGroup);
        } else {
            includeFriendGroup = false;
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
        String valueaudienceIds = request.getQueryString("audienceIds");
        String audienceIds;
        if (valueaudienceIds != null) {
            audienceIds = valueaudienceIds;
        } else {
            audienceIds = null;
        }
        return imp.addUsersToPermissionableHttp(request, version, permissionableType, permissionableId, deviceId, accountId, read, write, delete, add, connectionIds, connectionAccountIds, connectionGroupIds, pending, admin, includeFriendGroup, latitude, longitude, audienceIds);
    }

    @ApiAction
    public Result approvePermissionable(Http.Request request, BigDecimal version) throws Exception {
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
        String valuepermissionableType = request.getQueryString("permissionableType");
        String permissionableType;
        if (valuepermissionableType != null) {
            permissionableType = valuepermissionableType;
        } else {
            throw new IllegalArgumentException("'permissionableType' parameter is required");
        }
        String valuepermissionableId = request.getQueryString("permissionableId");
        Long permissionableId;
        if (valuepermissionableId != null) {
            permissionableId = Long.parseLong(valuepermissionableId);
        } else {
            throw new IllegalArgumentException("'permissionableId' parameter is required");
        }
        String valueapprovalStatus = request.getQueryString("approvalStatus");
        String approvalStatus;
        if (valueapprovalStatus != null) {
            approvalStatus = valueapprovalStatus;
        } else {
            approvalStatus = "APPROVED";
        }
        return imp.approvePermissionableHttp(request, version, permissionableType, permissionableId, deviceId, accountId, approvalStatus);
    }

    @ApiAction
    public Result leaveFromPermissionable(Http.Request request, BigDecimal version) throws Exception {
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
        String valuepermissionableType = request.getQueryString("permissionableType");
        String permissionableType;
        if (valuepermissionableType != null) {
            permissionableType = valuepermissionableType;
        } else {
            throw new IllegalArgumentException("'permissionableType' parameter is required");
        }
        String valuepermissionableId = request.getQueryString("permissionableId");
        Long permissionableId;
        if (valuepermissionableId != null) {
            permissionableId = Long.parseLong(valuepermissionableId);
        } else {
            throw new IllegalArgumentException("'permissionableId' parameter is required");
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
        return imp.leaveFromPermissionableHttp(request, version, permissionableType, permissionableId, deviceId, accountId, latitude, longitude);
    }

    @ApiAction
    public Result removeUsersFromPermissionable(Http.Request request, BigDecimal version) throws Exception {
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
        String valuepermissionableType = request.getQueryString("permissionableType");
        String permissionableType;
        if (valuepermissionableType != null) {
            permissionableType = valuepermissionableType;
        } else {
            throw new IllegalArgumentException("'permissionableType' parameter is required");
        }
        String valuepermissionableId = request.getQueryString("permissionableId");
        Long permissionableId;
        if (valuepermissionableId != null) {
            permissionableId = Long.parseLong(valuepermissionableId);
        } else {
            throw new IllegalArgumentException("'permissionableId' parameter is required");
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
        String valueconnectionGroupIds = request.getQueryString("connectionGroupIds");
        String connectionGroupIds;
        if (valueconnectionGroupIds != null) {
            connectionGroupIds = valueconnectionGroupIds;
        } else {
            connectionGroupIds = null;
        }
        String valueremoveFriendGroup = request.getQueryString("removeFriendGroup");
        Boolean removeFriendGroup;
        if (valueremoveFriendGroup != null) {
            removeFriendGroup = Boolean.valueOf(valueremoveFriendGroup);
        } else {
            removeFriendGroup = false;
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
        String valueaudienceIds = request.getQueryString("audienceIds");
        String audienceIds;
        if (valueaudienceIds != null) {
            audienceIds = valueaudienceIds;
        } else {
            audienceIds = null;
        }
        return imp.removeUsersFromPermissionableHttp(request, version, permissionableType, permissionableId, deviceId, accountId, connectionIds, connectionAccountIds, connectionGroupIds, removeFriendGroup, latitude, longitude, audienceIds);
    }

    @ApiAction
    public Result searchPermissionables(Http.Request request, BigDecimal version) throws Exception {
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
        String valueconnectionAccountIds = request.getQueryString("connectionAccountIds");
        String connectionAccountIds;
        if (valueconnectionAccountIds != null) {
            connectionAccountIds = valueconnectionAccountIds;
        } else {
            connectionAccountIds = null;
        }
        String valuepermissionableType = request.getQueryString("permissionableType");
        String permissionableType;
        if (valuepermissionableType != null) {
            permissionableType = valuepermissionableType;
        } else {
            permissionableType = null;
        }
        String valuepermissionableId = request.getQueryString("permissionableId");
        Long permissionableId;
        if (valuepermissionableId != null) {
            permissionableId = Long.parseLong(valuepermissionableId);
        } else {
            permissionableId = null;
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
        String valuepending = request.getQueryString("pending");
        Boolean pending;
        if (valuepending != null) {
            pending = Boolean.valueOf(valuepending);
        } else {
            pending = null;
        }
        String valueadmin = request.getQueryString("admin");
        Boolean admin;
        if (valueadmin != null) {
            admin = Boolean.valueOf(valueadmin);
        } else {
            admin = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = 0;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        return imp.searchPermissionablesHttp(request, version, deviceId, accountId, connectionAccountId, connectionAccountIds, permissionableType, permissionableId, keyword, sortField, descending, pending, admin, start, limit);
    }

    @ApiAction
    public Result searchPermissionablesFollowingDistance(Http.Request request, BigDecimal version) throws Exception {
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
        String valueconnectionAccountIds = request.getQueryString("connectionAccountIds");
        String connectionAccountIds;
        if (valueconnectionAccountIds != null) {
            connectionAccountIds = valueconnectionAccountIds;
        } else {
            connectionAccountIds = null;
        }
        String valuepermissionableType = request.getQueryString("permissionableType");
        String permissionableType;
        if (valuepermissionableType != null) {
            permissionableType = valuepermissionableType;
        } else {
            permissionableType = null;
        }
        String valuepermissionableId = request.getQueryString("permissionableId");
        Long permissionableId;
        if (valuepermissionableId != null) {
            permissionableId = Long.parseLong(valuepermissionableId);
        } else {
            permissionableId = null;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            throw new IllegalArgumentException("'latitude' parameter is required");
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            throw new IllegalArgumentException("'longitude' parameter is required");
        }
        String valuesearchRange = request.getQueryString("searchRange");
        Double searchRange;
        if (valuesearchRange != null) {
            searchRange = Double.parseDouble(valuesearchRange);
        } else {
            searchRange = 5;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valuepending = request.getQueryString("pending");
        Boolean pending;
        if (valuepending != null) {
            pending = Boolean.valueOf(valuepending);
        } else {
            pending = null;
        }
        String valueadmin = request.getQueryString("admin");
        Boolean admin;
        if (valueadmin != null) {
            admin = Boolean.valueOf(valueadmin);
        } else {
            admin = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = 0;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        return imp.searchPermissionablesFollowingDistanceHttp(request, version, latitude, longitude, deviceId, accountId, connectionAccountId, connectionAccountIds, permissionableType, permissionableId, searchRange, keyword, pending, admin, start, limit);
    }

}
