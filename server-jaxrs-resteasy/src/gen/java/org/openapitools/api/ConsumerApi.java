package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ConsumerApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AlbumContestListResponse;
import org.openapitools.model.AlbumContestResponse;
import org.openapitools.model.ConnectionGroupResponse;
import org.openapitools.model.ConnectionListResponse;
import org.openapitools.model.ConnectionResponse;
import java.io.File;
import org.openapitools.model.PurchaseItemListResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.ThemeDescriptorResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/consumer")


@io.swagger.annotations.Api(description = "the consumer API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ConsumerApi  {

    @Inject ConsumerApiService service;

    @POST
    @Path("/connection/group/addConnection")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Add Connection", notes = "Adds a connection to a group.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response addConnectionToGroup( @NotNull @QueryParam("returnNulls") Boolean returnNulls, @NotNull @QueryParam("groupId") Long groupId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionId") Long connectionId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("pendingId") Long pendingId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addConnectionToGroup(returnNulls,groupId,deviceId,accountId,connectionId,connectionAccountId,pendingId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/album/contest")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create or Update Contest", notes = "Creates or updates a contest.", response = AlbumContestResponse.class, tags={ "Contest", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AlbumContestResponse.class) })
    public Response addOrUpdateAlbumContest( @NotNull @QueryParam("publicRead") Boolean publicRead, @NotNull @QueryParam("publicWrite") Boolean publicWrite, @NotNull @QueryParam("publicDelete") Boolean publicDelete, @NotNull @QueryParam("publicAdd") Boolean publicAdd, @NotNull, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @NotNull @QueryParam("includeFriendGroup") Boolean includeFriendGroup, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("contestType") String contestType, @QueryParam("albumContestId") Long albumContestId, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("albumId1") Long albumId1, @QueryParam("removeAlbum1") Boolean removeAlbum1, @QueryParam("albumId2") Long albumId2, @QueryParam("removeAlbum2") Boolean removeAlbum2, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("locationDescription") String locationDescription, @QueryParam("connectionIdsToAdd") String connectionIdsToAdd, @QueryParam("connectionGroupIdsToAdd") String connectionGroupIdsToAdd, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addOrUpdateAlbumContest(publicRead,publicWrite,publicDelete,publicAdd,visibility,includeFriendGroup,deviceId,accountId,gameType,appKey,contestType,albumContestId,title,description,albumId1,removeAlbum1,albumId2,removeAlbum2,startDate,endDate,locationDescription,connectionIdsToAdd,connectionGroupIdsToAdd,latitude,longitude,securityContext);
    }
    @POST
    @Path("/theme")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create/Update Theme", notes = "Creates or updates a theme descriptor that can be used to give applications a customized look and feel. The theme can be created by consumers and shared to other users, allowing them to use and/or collaborate on making the theme.", response = ThemeDescriptorResponse.class, tags={ "Theme Descriptor", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ThemeDescriptorResponse.class) })
    public Response addOrUpdateThemeDescriptor( @NotNull @QueryParam("publicRead") Boolean publicRead, @NotNull @QueryParam("publicWrite") Boolean publicWrite, @NotNull @QueryParam("publicDelete") Boolean publicDelete, @NotNull @QueryParam("publicAdd") Boolean publicAdd, @NotNull, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @NotNull @QueryParam("includeFriendGroup") Boolean includeFriendGroup, @NotNull @QueryParam("completeWithDefaultValues") Boolean completeWithDefaultValues, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("themeDescriptorId") Long themeDescriptorId, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("connectionIdsToAdd") String connectionIdsToAdd, @QueryParam("connectionGroupIdsToAdd") String connectionGroupIdsToAdd, @QueryParam("appVersion") String appVersion, @QueryParam("colorValueJson") String colorValueJson, @QueryParam("stringReplacerJson") String stringReplacerJson, @QueryParam("customJsonObjects") String customJsonObjects, @QueryParam("iconImage") File iconImage, @QueryParam("sceneAtlasImage") File sceneAtlasImage, @QueryParam("bgImage") File bgImage, @QueryParam("bgSound") File bgSound, @QueryParam("musicSelection") String musicSelection, @QueryParam("locationDescription") String locationDescription, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addOrUpdateThemeDescriptor(publicRead,publicWrite,publicDelete,publicAdd,visibility,includeFriendGroup,completeWithDefaultValues,deviceId,accountId,gameType,themeDescriptorId,title,description,connectionIdsToAdd,connectionGroupIdsToAdd,appVersion,colorValueJson,stringReplacerJson,customJsonObjects,iconImage,sceneAtlasImage,bgImage,bgSound,musicSelection,locationDescription,latitude,longitude,securityContext);
    }
    @POST
    @Path("/connection/group/addSubGroup")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Add Connection Groups", notes = "Add sub groups to a group.", response = ConnectionGroupResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ConnectionGroupResponse.class) })
    public Response addSubGroups( @NotNull @QueryParam("returnNulls") Boolean returnNulls, @NotNull @QueryParam("groupId") Long groupId, @NotNull @QueryParam("subGroupIds") String subGroupIds, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addSubGroups(returnNulls,groupId,subGroupIds,deviceId,accountId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/permissions/add")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Add User", notes = "Adds a user to a permissionable object.", response = SirqulResponse.class, tags={ "User Permissions", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response addUsersToPermissionable( @NotNull, allowableValues="ACCOUNT, GAMELEVEL, ALBUM_CONTEST, THEME_DESCRIPTOR, SCHEDULED_NOTIFICATION, TASK, TRIGGER" @QueryParam("permissionableType") String permissionableType, @NotNull @QueryParam("permissionableId") Long permissionableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @DefaultValue("true") @QueryParam("read") Boolean read, @DefaultValue("false") @QueryParam("write") Boolean write, @DefaultValue("false") @QueryParam("delete") Boolean delete, @DefaultValue("false") @QueryParam("add") Boolean add, @QueryParam("connectionIds") String connectionIds, @QueryParam("connectionAccountIds") String connectionAccountIds, @QueryParam("connectionGroupIds") String connectionGroupIds, @DefaultValue("false") @QueryParam("pending") Boolean pending, @QueryParam("admin") Boolean admin, @DefaultValue("false") @QueryParam("includeFriendGroup") Boolean includeFriendGroup, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("audienceIds") String audienceIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addUsersToPermissionable(permissionableType,permissionableId,deviceId,accountId,read,write,delete,add,connectionIds,connectionAccountIds,connectionGroupIds,pending,admin,includeFriendGroup,latitude,longitude,audienceIds,securityContext);
    }
    @POST
    @Path("/album/contest/approve")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Approve Contest", notes = "Sets the approval status of a contest.", response = SirqulResponse.class, tags={ "Contest", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response approveAlbumContest( @NotNull @QueryParam("albumContestId") Long albumContestId, @NotNull, allowableValues="PENDING, REJECTED, APPROVED, FEATURED" @QueryParam("approvalStatus") String approvalStatus, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.approveAlbumContest(albumContestId,approvalStatus,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/connection/add")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create or Update Connection", notes = "Creates or updates the connection of the user and another account. Allows a user to follow, block, mark as trusted, and/or add someone to a group.", response = ConnectionResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ConnectionResponse.class) })
    public Response createOrUpdateConnection( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionId") Long connectionId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("pendingId") Long pendingId, @QueryParam("groupId") Long groupId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("isTrusted") Boolean isTrusted, @QueryParam("ignoreFriendRequest") Boolean ignoreFriendRequest, @QueryParam("isContact") Boolean isContact, @QueryParam("isBlocked") Boolean isBlocked, @QueryParam("isFollowing") Boolean isFollowing, @QueryParam("connectionResponse") Boolean connectionResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createOrUpdateConnection(deviceId,accountId,connectionId,connectionAccountId,pendingId,groupId,gameType,appKey,isTrusted,ignoreFriendRequest,isContact,isBlocked,isFollowing,connectionResponse,securityContext);
    }
    @POST
    @Path("/connection/group")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create or Update Connection Group", notes = "Creates a new private group.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response createOrUpdateGroup( @NotNull @QueryParam("returnNulls") Boolean returnNulls, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("groupId") Long groupId, @QueryParam("assetId") Long assetId, @QueryParam("connections") String connections, @QueryParam("description") String description, @QueryParam("canViewProfileInfo") Boolean canViewProfileInfo, @QueryParam("canViewGameInfo") Boolean canViewGameInfo, @QueryParam("canViewFriendInfo") Boolean canViewFriendInfo, @QueryParam("active") Boolean active, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createOrUpdateGroup(returnNulls,deviceId,accountId,name,groupId,assetId,connections,description,canViewProfileInfo,canViewGameInfo,canViewFriendInfo,active,latitude,longitude,securityContext);
    }
    @POST
    @Path("/album/contest/remove")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Contest", notes = "Deletes a contest.", response = SirqulResponse.class, tags={ "Contest", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteContest( @NotNull @QueryParam("albumContestId") Long albumContestId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteContest(albumContestId,deviceId,accountId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/follow/accept")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Accept Follow Request", notes = "Accept someone's follow request.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response followAccept( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("connectionAccountId") Long connectionAccountId, @NotNull @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.followAccept(accountId,connectionAccountId,appKey,securityContext);
    }
    @POST
    @Path("/follow/reject")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Reject Follow Request", notes = "Reject someone's follow request or remove them as a follower.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response followReject( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("connectionAccountId") Long connectionAccountId, @NotNull @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.followReject(accountId,connectionAccountId,appKey,securityContext);
    }
    @POST
    @Path("/follow/remove")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Remove Follower / Unfollow", notes = "Unfollow someone you are following or remove them as a follower.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response followRemove( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("connectionAccountId") Long connectionAccountId, @NotNull @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.followRemove(accountId,connectionAccountId,appKey,securityContext);
    }
    @POST
    @Path("/follow/request")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Send Follow Request", notes = "Send a request to follow someone.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response followRequest( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("connectionAccountId") Long connectionAccountId, @NotNull @QueryParam("appKey") String appKey, @DefaultValue("true") @QueryParam("approvalNeeded") Boolean approvalNeeded,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.followRequest(accountId,connectionAccountId,appKey,approvalNeeded,securityContext);
    }
    @POST
    @Path("/friend/accept")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Accept Friend", notes = "Accept a friend request and optionally sends a notification.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response friendAccept( @NotNull @QueryParam("friendAccountId") Long friendAccountId, @NotNull @QueryParam("notifyFriend") Boolean notifyFriend, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("notificationMessage") String notificationMessage,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.friendAccept(friendAccountId,notifyFriend,deviceId,accountId,gameType,appKey,notificationMessage,securityContext);
    }
    @POST
    @Path("/friend/reject")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Decline Friend", notes = "Request a friend request and optionally sends a notification.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response friendReject( @NotNull @QueryParam("friendAccountId") Long friendAccountId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("notifyFriend") Boolean notifyFriend, @QueryParam("notificationMessage") String notificationMessage,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.friendReject(friendAccountId,deviceId,accountId,gameType,appKey,notifyFriend,notificationMessage,securityContext);
    }
    @POST
    @Path("/friend/remove")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Friend", notes = "Removes a friend from the user's friends list.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response friendRemove( @NotNull @QueryParam("friendAccountId") Long friendAccountId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("notifyFriend") Boolean notifyFriend, @QueryParam("removeFromGroups") Boolean removeFromGroups,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.friendRemove(friendAccountId,deviceId,accountId,notifyFriend,removeFromGroups,securityContext);
    }
    @POST
    @Path("/friend/request")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Request Friend", notes = "Sends a friend request notification to another user.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response friendRequest( @NotNull @QueryParam("friendAccountId") Long friendAccountId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("notificationMessage") String notificationMessage,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.friendRequest(friendAccountId,deviceId,accountId,gameType,appKey,notificationMessage,securityContext);
    }
    @GET
    @Path("/album/contest/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Contest", notes = "Gets the contest object including the likes and notes", response = AlbumContestResponse.class, tags={ "Contest", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AlbumContestResponse.class) })
    public Response getAlbumContest( @NotNull @QueryParam("albumContestId") Long albumContestId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAlbumContest(albumContestId,deviceId,accountId,latitude,longitude,securityContext);
    }
    @GET
    @Path("/album/contest/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Contests", notes = "Searches on contests.", response = AlbumContestListResponse.class, tags={ "Contest", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AlbumContestListResponse.class) })
    public Response getAlbumContests( @NotNull @QueryParam("filter") String filter, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("appType") String appType, @QueryParam("contestType") String contestType, @QueryParam("ownerId") Long ownerId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l, @QueryParam("dateCreated") Long dateCreated, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAlbumContests(filter,sortField,descending,start,limit,deviceId,accountId,gameType,appKey,appType,contestType,ownerId,q,keyword,i,l,dateCreated,latitude,longitude,securityContext);
    }
    @GET
    @Path("/connection/getRequested")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Sent Friend Requests", notes = "Gets the connection sent friend requests.", response = ConnectionListResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ConnectionListResponse.class) })
    public Response getConnectionSentFriendRequests( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getConnectionSentFriendRequests(deviceId,accountId,securityContext);
    }
    @GET
    @Path("/connection/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Connections", notes = "Gets the connections.", response = ConnectionListResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ConnectionListResponse.class) })
    public Response getConnections( @NotNull @QueryParam("returnNulls") Boolean returnNulls, @NotNull @QueryParam("filter") String filter, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getConnections(returnNulls,filter,sortField,descending,start,limit,deviceId,accountId,connectionAccountId,q,keyword,i,l,latitude,longitude,securityContext);
    }
    @GET
    @Path("/connection/group/details/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Connection Group", notes = "", response = ConnectionGroupResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ConnectionGroupResponse.class) })
    public Response getGroupDetails( @NotNull @QueryParam("combineConnections") Boolean combineConnections, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("groupId") Long groupId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getGroupDetails(combineConnections,deviceId,accountId,groupId,latitude,longitude,securityContext);
    }
    @GET
    @Path("/theme/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Theme", notes = "Gets a theme.", response = PurchaseItemListResponse.class, tags={ "Theme Descriptor", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PurchaseItemListResponse.class) })
    public Response getThemeDescriptor( @NotNull @QueryParam("themeDescriptorId") Long themeDescriptorId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getThemeDescriptor(themeDescriptorId,deviceId,accountId,gameType,latitude,longitude,securityContext);
    }
    @GET
    @Path("/theme/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Themes", notes = "Searches for themes.", response = PurchaseItemListResponse.class, tags={ "Theme Descriptor", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PurchaseItemListResponse.class) })
    public Response getThemeDescriptors( @NotNull @QueryParam("filter") String filter, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("contestType") String contestType, @QueryParam("ownerId") Long ownerId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l, @QueryParam("dateCreated") Long dateCreated, @QueryParam("appVersion") String appVersion, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getThemeDescriptors(filter,sortField,descending,start,limit,deviceId,accountId,gameType,contestType,ownerId,q,keyword,i,l,dateCreated,appVersion,latitude,longitude,securityContext);
    }
    @POST
    @Path("/permissions/leave")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Leave", notes = "Used when the user wants to leave from someone else's permissionable object", response = SirqulResponse.class, tags={ "User Permissions", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response leaveFromPermissionable( @NotNull @QueryParam("permissionableType") String permissionableType, @NotNull @QueryParam("permissionableId") Long permissionableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.leaveFromPermissionable(permissionableType,permissionableId,deviceId,accountId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/connection/group/removeConnection")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Connection", notes = "Removes the connection from group.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response removeConnectionFromGroup( @NotNull @QueryParam("returnNulls") Boolean returnNulls, @NotNull @QueryParam("groupId") Long groupId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionId") Long connectionId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("pendingId") Long pendingId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeConnectionFromGroup(returnNulls,groupId,deviceId,accountId,connectionId,connectionAccountId,pendingId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/connection/group/remove")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Connection Group", notes = "Remove a user's group.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response removeGroup( @NotNull @QueryParam("returnNulls") Boolean returnNulls, @NotNull @QueryParam("groupId") Long groupId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeGroup(returnNulls,groupId,deviceId,accountId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/connection/group/removeSubGroup")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Remove Connection Groups", notes = "Remove sub groups from a group", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response removeSubGroups( @NotNull @QueryParam("returnNulls") Boolean returnNulls, @NotNull @QueryParam("groupId") Long groupId, @NotNull @QueryParam("subGroupIds") String subGroupIds, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeSubGroups(returnNulls,groupId,subGroupIds,deviceId,accountId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/theme/remove")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Theme", notes = "Removes a theme.", response = SirqulResponse.class, tags={ "Theme Descriptor", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response removeThemeDescriptor( @NotNull @QueryParam("themeDescriptorId") Long themeDescriptorId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeThemeDescriptor(themeDescriptorId,deviceId,accountId,gameType,latitude,longitude,securityContext);
    }
    @POST
    @Path("/permissions/remove")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Remove User", notes = "Used to remove someone (assuming they have permission) from a permissionable object", response = SirqulResponse.class, tags={ "User Permissions", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response removeUsersFromPermissionable( @NotNull, allowableValues="ACCOUNT, GAMELEVEL, ALBUM_CONTEST, THEME_DESCRIPTOR, SCHEDULED_NOTIFICATION, TASK, TRIGGER" @QueryParam("permissionableType") String permissionableType, @NotNull @QueryParam("permissionableId") Long permissionableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionIds") String connectionIds, @QueryParam("connectionAccountIds") String connectionAccountIds, @QueryParam("connectionGroupIds") String connectionGroupIds, @DefaultValue("false") @QueryParam("removeFriendGroup") Boolean removeFriendGroup, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("audienceIds") String audienceIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeUsersFromPermissionable(permissionableType,permissionableId,deviceId,accountId,connectionIds,connectionAccountIds,connectionGroupIds,removeFriendGroup,latitude,longitude,audienceIds,securityContext);
    }
    @POST
    @Path("/profile/matchToken")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Save Match Token", notes = "Save user's match token to be used for profile match making", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response setMatchToken( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("matchToken") String matchToken, @DefaultValue("BOOPY") @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.setMatchToken(deviceId,accountId,matchToken,gameType,appKey,latitude,longitude,securityContext);
    }
    @POST
    @Path("/album/contest/vote")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Vote on Contest", notes = "Vote on a collection in a contest.", response = AlbumContestResponse.class, tags={ "Contest", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AlbumContestResponse.class) })
    public Response voteOnAlbumContest( @NotNull @QueryParam("albumContestId") Long albumContestId, @NotNull @QueryParam("albumId") Long albumId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("contestType") String contestType, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.voteOnAlbumContest(albumContestId,albumId,deviceId,accountId,contestType,latitude,longitude,securityContext);
    }
}
