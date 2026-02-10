package controllers;

import java.math.BigDecimal;
import apimodels.SirqulResponse;
import apimodels.UserPermissionsResponse;

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
public class UserPermissionsApiControllerImp extends UserPermissionsApiControllerImpInterface {
    @Override
    public SirqulResponse addUsersToPermissionable(Http.Request request, BigDecimal version, @NotNull String permissionableType, @NotNull Long permissionableId, String deviceId, Long accountId, Boolean read, Boolean write, Boolean delete, Boolean add, String connectionIds, String connectionAccountIds, String connectionGroupIds, Boolean pending, Boolean admin, Boolean includeFriendGroup, Double latitude, Double longitude, String audienceIds) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SirqulResponse approvePermissionable(Http.Request request, BigDecimal version, @NotNull String permissionableType, @NotNull Long permissionableId, String deviceId, Long accountId, String approvalStatus) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SirqulResponse leaveFromPermissionable(Http.Request request, BigDecimal version, @NotNull String permissionableType, @NotNull Long permissionableId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SirqulResponse removeUsersFromPermissionable(Http.Request request, BigDecimal version, @NotNull String permissionableType, @NotNull Long permissionableId, String deviceId, Long accountId, String connectionIds, String connectionAccountIds, String connectionGroupIds, Boolean removeFriendGroup, Double latitude, Double longitude, String audienceIds) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public List<UserPermissionsResponse> searchPermissionables(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long connectionAccountId, String connectionAccountIds, String permissionableType, Long permissionableId, String keyword, String sortField, Boolean descending, Boolean pending, Boolean admin, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new ArrayList<UserPermissionsResponse>();
    }

    @Override
    public List<UserPermissionsResponse> searchPermissionablesFollowingDistance(Http.Request request, BigDecimal version, @NotNull Double latitude, @NotNull Double longitude, String deviceId, Long accountId, Long connectionAccountId, String connectionAccountIds, String permissionableType, Long permissionableId, Double searchRange, String keyword, Boolean pending, Boolean admin, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new ArrayList<UserPermissionsResponse>();
    }

}
