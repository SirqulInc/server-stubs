package org.openapitools.api;

import org.openapitools.model.ConnectionGroupResponse;
import org.openapitools.model.ConnectionInfoResponse;
import org.openapitools.model.ConnectionListResponse;
import org.openapitools.model.ConnectionResponse;
import org.openapitools.model.SirqulResponse;

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
public interface ConnectionApi  {

    /**
     * Add Connection
     *
     * Adds a connection to a group.
     *
     */
    @POST
    @Path("/consumer/connection/group/addConnection")
    @Produces({ "*/*" })
    @ApiOperation(value = "Add Connection", tags={ "Connection" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse addConnectionToGroup(@QueryParam("returnNulls") @NotNull Boolean returnNulls, @QueryParam("groupId") @NotNull Long groupId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionId") Long connectionId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("pendingId") Long pendingId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Add Connections
     *
     * Adds a list of connections to a group.
     *
     */
    @POST
    @Path("/connection/group/addConnections")
    @Produces({ "*/*" })
    @ApiOperation(value = "Add Connections", tags={ "Connection" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse addConnectionsToGroup(@QueryParam("connectionGroupId") @NotNull Long connectionGroupId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionIds") String connectionIds, @QueryParam("connectionAccountIds") String connectionAccountIds, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Add Connection Groups
     *
     * Add sub groups to a group.
     *
     */
    @POST
    @Path("/consumer/connection/group/addSubGroup")
    @Produces({ "*/*" })
    @ApiOperation(value = "Add Connection Groups", tags={ "Connection" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ConnectionGroupResponse.class) })
    public ConnectionGroupResponse addSubGroups(@QueryParam("returnNulls") @NotNull Boolean returnNulls, @QueryParam("groupId") @NotNull Long groupId, @QueryParam("subGroupIds") @NotNull String subGroupIds, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Create or Update Connection
     *
     * Creates or updates the connection of the user and another account. Allows a user to follow, block, mark as trusted, and/or add someone to a group.
     *
     */
    @POST
    @Path("/consumer/connection/add")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create or Update Connection", tags={ "Connection" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ConnectionResponse.class) })
    public ConnectionResponse createOrUpdateConnection(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionId") Long connectionId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("pendingId") Long pendingId, @QueryParam("groupId") Long groupId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("isTrusted") Boolean isTrusted, @QueryParam("ignoreFriendRequest") Boolean ignoreFriendRequest, @QueryParam("isContact") Boolean isContact, @QueryParam("isBlocked") Boolean isBlocked, @QueryParam("isFollowing") Boolean isFollowing, @QueryParam("connectionResponse") Boolean connectionResponse);

    /**
     * Create or Update Connection Group
     *
     * Creates a new private group.
     *
     */
    @POST
    @Path("/consumer/connection/group")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create or Update Connection Group", tags={ "Connection" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse createOrUpdateGroup(@QueryParam("returnNulls") @NotNull Boolean returnNulls, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("groupId") Long groupId, @QueryParam("assetId") Long assetId, @QueryParam("connections") String connections, @QueryParam("description") String description, @QueryParam("canViewProfileInfo") Boolean canViewProfileInfo, @QueryParam("canViewGameInfo") Boolean canViewGameInfo, @QueryParam("canViewFriendInfo") Boolean canViewFriendInfo, @QueryParam("active") Boolean active, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Accept Follow Request
     *
     * Accept someone&#39;s follow request.
     *
     */
    @POST
    @Path("/consumer/follow/accept")
    @Produces({ "*/*" })
    @ApiOperation(value = "Accept Follow Request", tags={ "Connection" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse followAccept(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("connectionAccountId") @NotNull Long connectionAccountId, @QueryParam("appKey") @NotNull String appKey);

    /**
     * Reject Follow Request
     *
     * Reject someone&#39;s follow request or remove them as a follower.
     *
     */
    @POST
    @Path("/consumer/follow/reject")
    @Produces({ "*/*" })
    @ApiOperation(value = "Reject Follow Request", tags={ "Connection" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse followReject(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("connectionAccountId") @NotNull Long connectionAccountId, @QueryParam("appKey") @NotNull String appKey);

    /**
     * Remove Follower / Unfollow
     *
     * Unfollow someone you are following or remove them as a follower.
     *
     */
    @POST
    @Path("/consumer/follow/remove")
    @Produces({ "*/*" })
    @ApiOperation(value = "Remove Follower / Unfollow", tags={ "Connection" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse followRemove(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("connectionAccountId") @NotNull Long connectionAccountId, @QueryParam("appKey") @NotNull String appKey);

    /**
     * Send Follow Request
     *
     * Send a request to follow someone.
     *
     */
    @POST
    @Path("/consumer/follow/request")
    @Produces({ "*/*" })
    @ApiOperation(value = "Send Follow Request", tags={ "Connection" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse followRequest(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("connectionAccountId") @NotNull Long connectionAccountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("approvalNeeded") @DefaultValue("true")Boolean approvalNeeded);

    /**
     * Accept Friend
     *
     * Accept a friend request and optionally sends a notification.
     *
     */
    @POST
    @Path("/consumer/friend/accept")
    @Produces({ "*/*" })
    @ApiOperation(value = "Accept Friend", tags={ "Connection" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse friendAccept(@QueryParam("friendAccountId") @NotNull Long friendAccountId, @QueryParam("notifyFriend") @NotNull Boolean notifyFriend, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("notificationMessage") String notificationMessage);

    /**
     * Decline Friend
     *
     * Request a friend request and optionally sends a notification.
     *
     */
    @POST
    @Path("/consumer/friend/reject")
    @Produces({ "*/*" })
    @ApiOperation(value = "Decline Friend", tags={ "Connection" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse friendReject(@QueryParam("friendAccountId") @NotNull Long friendAccountId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("notifyFriend") Boolean notifyFriend, @QueryParam("notificationMessage") String notificationMessage);

    /**
     * Delete Friend
     *
     * Removes a friend from the user&#39;s friends list.
     *
     */
    @POST
    @Path("/consumer/friend/remove")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Friend", tags={ "Connection" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse friendRemove(@QueryParam("friendAccountId") @NotNull Long friendAccountId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("notifyFriend") Boolean notifyFriend, @QueryParam("removeFromGroups") Boolean removeFromGroups);

    /**
     * Request Friend
     *
     * Sends a friend request notification to another user.
     *
     */
    @POST
    @Path("/consumer/friend/request")
    @Produces({ "*/*" })
    @ApiOperation(value = "Request Friend", tags={ "Connection" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse friendRequest(@QueryParam("friendAccountId") @NotNull Long friendAccountId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("notificationMessage") String notificationMessage);

    /**
     * Get Sent Friend Requests
     *
     * Gets the connection sent friend requests.
     *
     */
    @GET
    @Path("/consumer/connection/getRequested")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Sent Friend Requests", tags={ "Connection" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ConnectionListResponse.class) })
    public ConnectionListResponse getConnectionSentFriendRequests(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId);

    /**
     * Search Connections
     *
     * Gets the connections.
     *
     */
    @GET
    @Path("/consumer/connection/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Connections", tags={ "Connection" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ConnectionListResponse.class) })
    public ConnectionListResponse getConnections(@QueryParam("returnNulls") @NotNull Boolean returnNulls, @QueryParam("filter") @NotNull String filter, @QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Get Connection Group
     *
     */
    @GET
    @Path("/consumer/connection/group/details/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Connection Group", tags={ "Connection" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ConnectionGroupResponse.class) })
    public ConnectionGroupResponse getGroupDetails(@QueryParam("combineConnections") @NotNull Boolean combineConnections, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("groupId") Long groupId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Search Connection Groups
     *
     * Gets a user&#39;s private groups and default groups.
     *
     */
    @GET
    @Path("/connection/group/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Connection Groups", tags={ "Connection" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ConnectionInfoResponse.class, responseContainer = "List") })
    public List<ConnectionInfoResponse> groupSearch(@QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("activeOnly") @NotNull Boolean activeOnly, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("keyword") String keyword);

    /**
     * Delete Connection
     *
     * Removes the connection from group.
     *
     */
    @POST
    @Path("/consumer/connection/group/removeConnection")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Connection", tags={ "Connection" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse removeConnectionFromGroup(@QueryParam("returnNulls") @NotNull Boolean returnNulls, @QueryParam("groupId") @NotNull Long groupId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionId") Long connectionId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("pendingId") Long pendingId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Remove Connections
     *
     * Remove a list of connections from a group.
     *
     */
    @POST
    @Path("/connection/group/removeConnections")
    @Produces({ "*/*" })
    @ApiOperation(value = "Remove Connections", tags={ "Connection" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse removeConnectionsFromGroup(@QueryParam("connectionGroupId") @NotNull Long connectionGroupId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionIds") String connectionIds, @QueryParam("connectionAccountIds") String connectionAccountIds, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Delete Connection Group
     *
     * Remove a user&#39;s group.
     *
     */
    @POST
    @Path("/consumer/connection/group/remove")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Connection Group", tags={ "Connection" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse removeGroup(@QueryParam("returnNulls") @NotNull Boolean returnNulls, @QueryParam("groupId") @NotNull Long groupId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Remove Connection Groups
     *
     * Remove sub groups from a group
     *
     */
    @POST
    @Path("/consumer/connection/group/removeSubGroup")
    @Produces({ "*/*" })
    @ApiOperation(value = "Remove Connection Groups", tags={ "Connection" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse removeSubGroups(@QueryParam("returnNulls") @NotNull Boolean returnNulls, @QueryParam("groupId") @NotNull Long groupId, @QueryParam("subGroupIds") @NotNull String subGroupIds, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Search Possible Connections
     *
     * Search for accounts that the user may not have a connection with.
     *
     */
    @GET
    @Path("/connection/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Possible Connections", tags={ "Connection" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ConnectionListResponse.class) })
    public ConnectionListResponse searchConnections(@QueryParam("returnNulls") @NotNull Boolean returnNulls, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l, @QueryParam("sortField") String sortField, @QueryParam("hasLocation") Boolean hasLocation);
}
