package controllers;

import java.math.BigDecimal;
import apimodels.SirqulResponse;
import apimodels.UserPermissionsResponse;

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
public abstract class UserPermissionsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result addUsersToPermissionableHttp(Http.Request request, BigDecimal version, @NotNull String permissionableType, @NotNull Long permissionableId, String deviceId, Long accountId, Boolean read, Boolean write, Boolean delete, Boolean add, String connectionIds, String connectionAccountIds, String connectionGroupIds, Boolean pending, Boolean admin, Boolean includeFriendGroup, Double latitude, Double longitude, String audienceIds) throws Exception {
        SirqulResponse obj = addUsersToPermissionable(request, version, permissionableType, permissionableId, deviceId, accountId, read, write, delete, add, connectionIds, connectionAccountIds, connectionGroupIds, pending, admin, includeFriendGroup, latitude, longitude, audienceIds);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse addUsersToPermissionable(Http.Request request, BigDecimal version, @NotNull String permissionableType, @NotNull Long permissionableId, String deviceId, Long accountId, Boolean read, Boolean write, Boolean delete, Boolean add, String connectionIds, String connectionAccountIds, String connectionGroupIds, Boolean pending, Boolean admin, Boolean includeFriendGroup, Double latitude, Double longitude, String audienceIds) throws Exception;

    public Result approvePermissionableHttp(Http.Request request, BigDecimal version, @NotNull String permissionableType, @NotNull Long permissionableId, String deviceId, Long accountId, String approvalStatus) throws Exception {
        SirqulResponse obj = approvePermissionable(request, version, permissionableType, permissionableId, deviceId, accountId, approvalStatus);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse approvePermissionable(Http.Request request, BigDecimal version, @NotNull String permissionableType, @NotNull Long permissionableId, String deviceId, Long accountId, String approvalStatus) throws Exception;

    public Result leaveFromPermissionableHttp(Http.Request request, BigDecimal version, @NotNull String permissionableType, @NotNull Long permissionableId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception {
        SirqulResponse obj = leaveFromPermissionable(request, version, permissionableType, permissionableId, deviceId, accountId, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse leaveFromPermissionable(Http.Request request, BigDecimal version, @NotNull String permissionableType, @NotNull Long permissionableId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception;

    public Result removeUsersFromPermissionableHttp(Http.Request request, BigDecimal version, @NotNull String permissionableType, @NotNull Long permissionableId, String deviceId, Long accountId, String connectionIds, String connectionAccountIds, String connectionGroupIds, Boolean removeFriendGroup, Double latitude, Double longitude, String audienceIds) throws Exception {
        SirqulResponse obj = removeUsersFromPermissionable(request, version, permissionableType, permissionableId, deviceId, accountId, connectionIds, connectionAccountIds, connectionGroupIds, removeFriendGroup, latitude, longitude, audienceIds);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse removeUsersFromPermissionable(Http.Request request, BigDecimal version, @NotNull String permissionableType, @NotNull Long permissionableId, String deviceId, Long accountId, String connectionIds, String connectionAccountIds, String connectionGroupIds, Boolean removeFriendGroup, Double latitude, Double longitude, String audienceIds) throws Exception;

    public Result searchPermissionablesHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long connectionAccountId, String connectionAccountIds, String permissionableType, Long permissionableId, String keyword, String sortField, Boolean descending, Boolean pending, Boolean admin, Integer start, Integer limit) throws Exception {
        List<UserPermissionsResponse> obj = searchPermissionables(request, version, deviceId, accountId, connectionAccountId, connectionAccountIds, permissionableType, permissionableId, keyword, sortField, descending, pending, admin, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (UserPermissionsResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<UserPermissionsResponse> searchPermissionables(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long connectionAccountId, String connectionAccountIds, String permissionableType, Long permissionableId, String keyword, String sortField, Boolean descending, Boolean pending, Boolean admin, Integer start, Integer limit) throws Exception;

    public Result searchPermissionablesFollowingDistanceHttp(Http.Request request, BigDecimal version, @NotNull Double latitude, @NotNull Double longitude, String deviceId, Long accountId, Long connectionAccountId, String connectionAccountIds, String permissionableType, Long permissionableId, Double searchRange, String keyword, Boolean pending, Boolean admin, Integer start, Integer limit) throws Exception {
        List<UserPermissionsResponse> obj = searchPermissionablesFollowingDistance(request, version, latitude, longitude, deviceId, accountId, connectionAccountId, connectionAccountIds, permissionableType, permissionableId, searchRange, keyword, pending, admin, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (UserPermissionsResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<UserPermissionsResponse> searchPermissionablesFollowingDistance(Http.Request request, BigDecimal version, @NotNull Double latitude, @NotNull Double longitude, String deviceId, Long accountId, Long connectionAccountId, String connectionAccountIds, String permissionableType, Long permissionableId, Double searchRange, String keyword, Boolean pending, Boolean admin, Integer start, Integer limit) throws Exception;

}
