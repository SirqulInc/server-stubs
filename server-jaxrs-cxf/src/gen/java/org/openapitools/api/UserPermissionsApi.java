package org.openapitools.api;

import org.openapitools.model.SirqulResponse;
import org.openapitools.model.UserPermissionsResponse;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
@Path("")
@Api(value = "/", description = "")
public interface UserPermissionsApi  {

    /**
     * Add User
     *
     * Adds a user to a permissionable object.
     *
     */
    @POST
    @Path("/consumer/permissions/add")
    @Produces({ "*/*" })
    @ApiOperation(value = "Add User", tags={ "User Permissions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse addUsersToPermissionable(@QueryParam("permissionableType") @NotNull String permissionableType, @QueryParam("permissionableId") @NotNull Long permissionableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("read") @DefaultValue("true")Boolean read, @QueryParam("write") @DefaultValue("false")Boolean write, @QueryParam("delete") @DefaultValue("false")Boolean delete, @QueryParam("add") @DefaultValue("false")Boolean add, @QueryParam("connectionIds") String connectionIds, @QueryParam("connectionAccountIds") String connectionAccountIds, @QueryParam("connectionGroupIds") String connectionGroupIds, @QueryParam("pending") @DefaultValue("false")Boolean pending, @QueryParam("admin") Boolean admin, @QueryParam("includeFriendGroup") @DefaultValue("false")Boolean includeFriendGroup, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("audienceIds") String audienceIds);

    /**
     * Approve Permissionable
     *
     * Sets the approval status of a permissionable object.
     *
     */
    @POST
    @Path("/permissionable/approve")
    @Produces({ "*/*" })
    @ApiOperation(value = "Approve Permissionable", tags={ "User Permissions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse approvePermissionable(@QueryParam("permissionableType") @NotNull String permissionableType, @QueryParam("permissionableId") @NotNull Long permissionableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("approvalStatus") @DefaultValue("APPROVED")String approvalStatus);

    /**
     * Leave
     *
     * Used when the user wants to leave from someone else&#39;s permissionable object
     *
     */
    @POST
    @Path("/consumer/permissions/leave")
    @Produces({ "*/*" })
    @ApiOperation(value = "Leave", tags={ "User Permissions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse leaveFromPermissionable(@QueryParam("permissionableType") @NotNull String permissionableType, @QueryParam("permissionableId") @NotNull Long permissionableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Remove User
     *
     * Used to remove someone (assuming they have permission) from a permissionable object
     *
     */
    @POST
    @Path("/consumer/permissions/remove")
    @Produces({ "*/*" })
    @ApiOperation(value = "Remove User", tags={ "User Permissions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse removeUsersFromPermissionable(@QueryParam("permissionableType") @NotNull String permissionableType, @QueryParam("permissionableId") @NotNull Long permissionableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionIds") String connectionIds, @QueryParam("connectionAccountIds") String connectionAccountIds, @QueryParam("connectionGroupIds") String connectionGroupIds, @QueryParam("removeFriendGroup") @DefaultValue("false")Boolean removeFriendGroup, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("audienceIds") String audienceIds);

    /**
     * Search Permissionables
     *
     * Search on UserPermissions
     *
     */
    @GET
    @Path("/permissions/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Permissionables", tags={ "User Permissions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = UserPermissionsResponse.class, responseContainer = "List") })
    public List<UserPermissionsResponse> searchPermissionables(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("connectionAccountIds") String connectionAccountIds, @QueryParam("permissionableType") String permissionableType, @QueryParam("permissionableId") Long permissionableId, @QueryParam("keyword") String keyword, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("pending") Boolean pending, @QueryParam("admin") Boolean admin, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("20")Integer limit);

    /**
     * Search Permissionables by Distnace
     *
     * Search on UserPermissions by distance
     *
     */
    @GET
    @Path("/permissions/distancesearch")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Permissionables by Distnace", tags={ "User Permissions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = UserPermissionsResponse.class, responseContainer = "List") })
    public List<UserPermissionsResponse> searchPermissionablesFollowingDistance(@QueryParam("latitude") @NotNull Double latitude, @QueryParam("longitude") @NotNull Double longitude, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("connectionAccountIds") String connectionAccountIds, @QueryParam("permissionableType") String permissionableType, @QueryParam("permissionableId") Long permissionableId, @QueryParam("searchRange") @DefaultValue("5")Double searchRange, @QueryParam("keyword") String keyword, @QueryParam("pending") Boolean pending, @QueryParam("admin") Boolean admin, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("20")Integer limit);
}
