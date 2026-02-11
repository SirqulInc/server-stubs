package org.openapitools.api;

import org.openapitools.api.ConsumerApiService;
import org.openapitools.api.factories.ConsumerApiServiceFactory;

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

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/consumer")


@io.swagger.annotations.Api(description = "the consumer API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ConsumerApi  {
   private final ConsumerApiService delegate;

   public ConsumerApi(@Context ServletConfig servletContext) {
      ConsumerApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ConsumerApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ConsumerApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = ConsumerApiServiceFactory.getConsumerApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/connection/group/addConnection")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Add Connection", notes = "Adds a connection to a group.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response addConnectionToGroup(@ApiParam(value = "whether to return nulls or not", required = true) @QueryParam("returnNulls") @NotNull  Boolean returnNulls,@ApiParam(value = "the group id", required = true) @QueryParam("groupId") @NotNull  Long groupId,@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the connection id") @QueryParam("connectionId")  Long connectionId,@ApiParam(value = "the connection account id") @QueryParam("connectionAccountId")  Long connectionAccountId,@ApiParam(value = "the pending id") @QueryParam("pendingId")  Long pendingId,@ApiParam(value = "the current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the current longitude of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addConnectionToGroup(returnNulls, groupId, deviceId, accountId, connectionId, connectionAccountId, pendingId, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/album/contest")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create or Update Contest", notes = "Creates or updates a contest.", response = AlbumContestResponse.class, tags={ "Contest", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AlbumContestResponse.class)
    })
    public Response addOrUpdateAlbumContest(@ApiParam(value = "determines whether the contest's participants has read permissions", required = true) @QueryParam("publicRead") @NotNull  Boolean publicRead,@ApiParam(value = "determines whether the contest's participants has write permissions", required = true) @QueryParam("publicWrite") @NotNull  Boolean publicWrite,@ApiParam(value = "determines whether the contest's participants has delete permissions", required = true) @QueryParam("publicDelete") @NotNull  Boolean publicDelete,@ApiParam(value = "determines whether the contest's participants has add permissions", required = true) @QueryParam("publicAdd") @NotNull  Boolean publicAdd,@ApiParam(value = "the determines the album's participants (PUBLIC - includes everyone in the system as a potential participant, PRIVATE - only considers people who have been invited as participants)", required = true, allowableValues="PUBLIC, PRIVATE, FRIENDS") @QueryParam("visibility") @NotNull  String visibility,@ApiParam(value = "determines whether to include all friends as participants", required = true) @QueryParam("includeFriendGroup") @NotNull  Boolean includeFriendGroup,@ApiParam(value = "a unique ID given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account ID of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "This parameter is deprecated. the application key") @QueryParam("gameType")  String gameType,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "a custom field used for aggregation and searching") @QueryParam("contestType")  String contestType,@ApiParam(value = "the album contest ID for updating (don't pass in if creating)") @QueryParam("albumContestId")  Long albumContestId,@ApiParam(value = "the title of the contest") @QueryParam("title")  String title,@ApiParam(value = "the description of the contest") @QueryParam("description")  String description,@ApiParam(value = "the album ID for the first album") @QueryParam("albumId1")  Long albumId1,@ApiParam(value = "removes album1 from the contest") @QueryParam("removeAlbum1")  Boolean removeAlbum1,@ApiParam(value = "the album ID for the second album") @QueryParam("albumId2")  Long albumId2,@ApiParam(value = "removes album2 from the contest") @QueryParam("removeAlbum2")  Boolean removeAlbum2,@ApiParam(value = "the start date of the contest (time-stamp in milliseconds)") @QueryParam("startDate")  Long startDate,@ApiParam(value = "the end date of the contest (time-stamp in milliseconds)") @QueryParam("endDate")  Long endDate,@ApiParam(value = "the location description of the contest taking place") @QueryParam("locationDescription")  String locationDescription,@ApiParam(value = "comma separated list of connection IDs") @QueryParam("connectionIdsToAdd")  String connectionIdsToAdd,@ApiParam(value = "comma separated list of connection group IDs") @QueryParam("connectionGroupIdsToAdd")  String connectionGroupIdsToAdd,@ApiParam(value = "latitude used to update the user's current location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "longitude used to update the user's current location") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addOrUpdateAlbumContest(publicRead, publicWrite, publicDelete, publicAdd, visibility, includeFriendGroup, deviceId, accountId, gameType, appKey, contestType, albumContestId, title, description, albumId1, removeAlbum1, albumId2, removeAlbum2, startDate, endDate, locationDescription, connectionIdsToAdd, connectionGroupIdsToAdd, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/theme")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create/Update Theme", notes = "Creates or updates a theme descriptor that can be used to give applications a customized look and feel. The theme can be created by consumers and shared to other users, allowing them to use and/or collaborate on making the theme.", response = ThemeDescriptorResponse.class, tags={ "Theme Descriptor", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ThemeDescriptorResponse.class)
    })
    public Response addOrUpdateThemeDescriptor(@ApiParam(value = "determines whether the theme's participants have read permissions", required = true) @QueryParam("publicRead") @NotNull  Boolean publicRead,@ApiParam(value = "determines whether the theme's participants have write permissions", required = true) @QueryParam("publicWrite") @NotNull  Boolean publicWrite,@ApiParam(value = "determines whether the theme's participants have delete permissions", required = true) @QueryParam("publicDelete") @NotNull  Boolean publicDelete,@ApiParam(value = "", required = true) @QueryParam("publicAdd") @NotNull  Boolean publicAdd,@ApiParam(value = "the determines the theme's participants (PUBLIC - includes everyone in the system as a potential participant, PRIVATE - only considers people who have been invited as participants)", required = true, allowableValues="PUBLIC, PRIVATE, FRIENDS") @QueryParam("visibility") @NotNull  String visibility,@ApiParam(value = "flag to determine whether to share to the user's \"friends\" group", required = true) @QueryParam("includeFriendGroup") @NotNull  Boolean includeFriendGroup,@ApiParam(value = "determines whether to use default values to complete the theme", required = true) @QueryParam("completeWithDefaultValues") @NotNull  Boolean completeWithDefaultValues,@ApiParam(value = "a unique ID given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account ID of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the application key") @QueryParam("gameType")  String gameType,@ApiParam(value = "the theme descriptor id used to update an existing theme, leave empty for creating a new theme") @QueryParam("themeDescriptorId")  Long themeDescriptorId,@ApiParam(value = "the title of the theme") @QueryParam("title")  String title,@ApiParam(value = "the description of the theme") @QueryParam("description")  String description,@ApiParam(value = "a comma separated list of connection IDs to share to users") @QueryParam("connectionIdsToAdd")  String connectionIdsToAdd,@ApiParam(value = "a comma separated list of connection group IDs to share to groups") @QueryParam("connectionGroupIdsToAdd")  String connectionGroupIdsToAdd,@ApiParam(value = "the application version the theme was created for") @QueryParam("appVersion")  String appVersion,@ApiParam(value = "a json array used to replace colors within the application. Example: ```json [   {     \"name\": \"sceneAtlas\",     \"valueString\": \"100,100,100,255\"   },   {     \"name\": \"bg\",     \"valueString\": \"100,100,100,255\"   } ] ``` ") @QueryParam("colorValueJson")  String colorValueJson,@ApiParam(value = "a json array used to replace strings within the application. Example: ```json [   {     \"name\": \"coins\",     \"valueString\": \"Gems\"   },   {     \"name\": \"lives\",     \"valueString\": \"lives\"   } ] ``` ") @QueryParam("stringReplacerJson")  String stringReplacerJson,@ApiParam(value = "a json object used by the scene atlas to position sprites. Example: ```json {   \"pShootingOffset\": [     {       \"name\": \"x\",       \"valueString\": \"2.2\"     },     {       \"name\": \"y\",       \"valueString\": \"-0.3\"     }   ],   \"e1ShootingOffset\": [     {       \"name\": \"x\",       \"valueString\": \"0.25\"     },     {       \"name\": \"y\",       \"valueString\": \"0.5\"     }   ] } ``` ") @QueryParam("customJsonObjects")  String customJsonObjects,@ApiParam(value = "a MultipartFile containing the image used as the theme icon") @QueryParam("iconImage")  File iconImage,@ApiParam(value = "a MultipartFile containing the scene atlas") @QueryParam("sceneAtlasImage")  File sceneAtlasImage,@ApiParam(value = "a MultipartFile containing the background image") @QueryParam("bgImage")  File bgImage,@ApiParam(value = "a MultipartFile containing the background sound file (preferably in MP3 format)") @QueryParam("bgSound")  File bgSound,@ApiParam(value = "used to select a default sound file that already exists in the application") @QueryParam("musicSelection")  String musicSelection,@ApiParam(value = "the description of the user's current location") @QueryParam("locationDescription")  String locationDescription,@ApiParam(value = "the current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the current longitude of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addOrUpdateThemeDescriptor(publicRead, publicWrite, publicDelete, publicAdd, visibility, includeFriendGroup, completeWithDefaultValues, deviceId, accountId, gameType, themeDescriptorId, title, description, connectionIdsToAdd, connectionGroupIdsToAdd, appVersion, colorValueJson, stringReplacerJson, customJsonObjects, iconImage, sceneAtlasImage, bgImage, bgSound, musicSelection, locationDescription, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/connection/group/addSubGroup")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Add Connection Groups", notes = "Add sub groups to a group.", response = ConnectionGroupResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ConnectionGroupResponse.class)
    })
    public Response addSubGroups(@ApiParam(value = "whether to return nulls or not", required = true) @QueryParam("returnNulls") @NotNull  Boolean returnNulls,@ApiParam(value = "the parent group id", required = true) @QueryParam("groupId") @NotNull  Long groupId,@ApiParam(value = "comma separated list of group IDs to add to the parent group", required = true) @QueryParam("subGroupIds") @NotNull  String subGroupIds,@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the current longitude of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addSubGroups(returnNulls, groupId, subGroupIds, deviceId, accountId, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/permissions/add")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Add User", notes = "Adds a user to a permissionable object.", response = SirqulResponse.class, tags={ "User Permissions", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response addUsersToPermissionable(@ApiParam(value = "the permissionable type of the object", required = true, allowableValues="ACCOUNT, GAMELEVEL, ALBUM_CONTEST, THEME_DESCRIPTOR, SCHEDULED_NOTIFICATION, TASK, TRIGGER") @QueryParam("permissionableType") @NotNull  String permissionableType,@ApiParam(value = "the id of the permissionable object", required = true) @QueryParam("permissionableId") @NotNull  Long permissionableId,@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the read permission of the users/groups", defaultValue = "true") @DefaultValue("true") @QueryParam("read")  Boolean read,@ApiParam(value = "the write permission of the users/groups", defaultValue = "false") @DefaultValue("false") @QueryParam("write")  Boolean write,@ApiParam(value = "the delete permission of the users/groups", defaultValue = "false") @DefaultValue("false") @QueryParam("delete")  Boolean delete,@ApiParam(value = "the add permission of the users/groups", defaultValue = "false") @DefaultValue("false") @QueryParam("add")  Boolean add,@ApiParam(value = "a comma separated list of connection ids (NOT the account ids)") @QueryParam("connectionIds")  String connectionIds,@ApiParam(value = "a comma separated list of account ids") @QueryParam("connectionAccountIds")  String connectionAccountIds,@ApiParam(value = "a comma separated list of connection group ids (these are groups made by the user)") @QueryParam("connectionGroupIds")  String connectionGroupIds,@ApiParam(value = "sets whether the added users are marked as pending (and will require the album admins to accept) - admins can set this to false (to accept)", defaultValue = "false") @DefaultValue("false") @QueryParam("pending")  Boolean pending,@ApiParam(value = "sets whether the added users will become admins or not") @QueryParam("admin")  Boolean admin,@ApiParam(value = "flag to determine whether to include the built-in \"friends\" group", defaultValue = "false") @DefaultValue("false") @QueryParam("includeFriendGroup")  Boolean includeFriendGroup,@ApiParam(value = "the current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the current longitude of the user") @QueryParam("longitude")  Double longitude,@ApiParam(value = "comma separated list of audience ids. This is a feature only available to the permissionable's application owner (and its employees). This will add all users from these audiences to the permissionable object. Notifications will not be sent to users if this feature is used.") @QueryParam("audienceIds")  String audienceIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addUsersToPermissionable(permissionableType, permissionableId, deviceId, accountId, read, write, delete, add, connectionIds, connectionAccountIds, connectionGroupIds, pending, admin, includeFriendGroup, latitude, longitude, audienceIds, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/album/contest/approve")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Approve Contest", notes = "Sets the approval status of a contest.", response = SirqulResponse.class, tags={ "Contest", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response approveAlbumContest(@ApiParam(value = "The ID of the album contest", required = true) @QueryParam("albumContestId") @NotNull  Long albumContestId,@ApiParam(value = "The approval status to set {PENDING, REJECTED, APPROVED, FEATURED}", required = true, allowableValues="PENDING, REJECTED, APPROVED, FEATURED") @QueryParam("approvalStatus") @NotNull  String approvalStatus,@ApiParam(value = "A unique ID given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account ID of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.approveAlbumContest(albumContestId, approvalStatus, deviceId, accountId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/connection/add")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create or Update Connection", notes = "Creates or updates the connection of the user and another account. Allows a user to follow, block, mark as trusted, and/or add someone to a group.", response = ConnectionResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ConnectionResponse.class)
    })
    public Response createOrUpdateConnection(@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the connection id for editing") @QueryParam("connectionId")  Long connectionId,@ApiParam(value = "the connection account id (i.e. the account id of another user)") @QueryParam("connectionAccountId")  Long connectionAccountId,@ApiParam(value = "the pending id (usually for people who do not have a Sirqul account but are already friends via other third party apps)") @QueryParam("pendingId")  Long pendingId,@ApiParam(value = "optional group id if the user wants to add this person into a group") @QueryParam("groupId")  Long groupId,@ApiParam(value = "This parameter is deprecated.") @QueryParam("gameType")  String gameType,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "determines whether the user is trusting this account") @QueryParam("isTrusted")  Boolean isTrusted,@ApiParam(value = "determines whether the user has set to ignore the user's friend request") @QueryParam("ignoreFriendRequest")  Boolean ignoreFriendRequest,@ApiParam(value = "determines whether the user is a contact of this account") @QueryParam("isContact")  Boolean isContact,@ApiParam(value = "determines whether the user is blocking this account") @QueryParam("isBlocked")  Boolean isBlocked,@ApiParam(value = "determines whether the user is following this account") @QueryParam("isFollowing")  Boolean isFollowing,@ApiParam(value = "whether to return the connection response or not") @QueryParam("connectionResponse")  Boolean connectionResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createOrUpdateConnection(deviceId, accountId, connectionId, connectionAccountId, pendingId, groupId, gameType, appKey, isTrusted, ignoreFriendRequest, isContact, isBlocked, isFollowing, connectionResponse, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/connection/group")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create or Update Connection Group", notes = "Creates a new private group.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response createOrUpdateGroup(@ApiParam(value = "whether to return nulls or not", required = true) @QueryParam("returnNulls") @NotNull  Boolean returnNulls,@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the name of the group") @QueryParam("name")  String name,@ApiParam(value = "the group id to update a group (don't pass anything in if you want to create a new group)") @QueryParam("groupId")  Long groupId,@ApiParam(value = "the asset to attach to the group") @QueryParam("assetId")  Long assetId,@ApiParam(value = "comma separated list of connection IDs") @QueryParam("connections")  String connections,@ApiParam(value = "the description of the group") @QueryParam("description")  String description,@ApiParam(value = "determines whether the connections in the group can see the user's profile info") @QueryParam("canViewProfileInfo")  Boolean canViewProfileInfo,@ApiParam(value = "determines whether the connections in the group can see the user's game info") @QueryParam("canViewGameInfo")  Boolean canViewGameInfo,@ApiParam(value = "determines whether the connections in the group can see the user's friends/connections") @QueryParam("canViewFriendInfo")  Boolean canViewFriendInfo,@ApiParam(value = "Sets whether the connection group is active or inactive") @QueryParam("active")  Boolean active,@ApiParam(value = "the latitude of the group") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the longitude of the group") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createOrUpdateGroup(returnNulls, deviceId, accountId, name, groupId, assetId, connections, description, canViewProfileInfo, canViewGameInfo, canViewFriendInfo, active, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/album/contest/remove")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Contest", notes = "Deletes a contest.", response = SirqulResponse.class, tags={ "Contest", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteContest(@ApiParam(value = "the album contest ID", required = true) @QueryParam("albumContestId") @NotNull  Long albumContestId,@ApiParam(value = "a unique ID given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account ID of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "latitude used to update the user's current location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "longitude used to update the user's current location") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteContest(albumContestId, deviceId, accountId, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/follow/accept")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Accept Follow Request", notes = "Accept someone's follow request.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response followAccept(@ApiParam(value = "the account id of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the account ID of the user who initiated the follow", required = true) @QueryParam("connectionAccountId") @NotNull  Long connectionAccountId,@ApiParam(value = "the application key for sending notifications", required = true) @QueryParam("appKey") @NotNull  String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.followAccept(accountId, connectionAccountId, appKey, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/follow/reject")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Reject Follow Request", notes = "Reject someone's follow request or remove them as a follower.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response followReject(@ApiParam(value = "the account id of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the account ID of the user who initiated the follow", required = true) @QueryParam("connectionAccountId") @NotNull  Long connectionAccountId,@ApiParam(value = "the application key for sending notifications", required = true) @QueryParam("appKey") @NotNull  String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.followReject(accountId, connectionAccountId, appKey, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/follow/remove")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Remove Follower / Unfollow", notes = "Unfollow someone you are following or remove them as a follower.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response followRemove(@ApiParam(value = "the account id of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the account ID of the user who you want to unfollow", required = true) @QueryParam("connectionAccountId") @NotNull  Long connectionAccountId,@ApiParam(value = "the application key for sending notifications", required = true) @QueryParam("appKey") @NotNull  String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.followRemove(accountId, connectionAccountId, appKey, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/follow/request")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Send Follow Request", notes = "Send a request to follow someone.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response followRequest(@ApiParam(value = "the account id of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the account ID of the user who you want to follow", required = true) @QueryParam("connectionAccountId") @NotNull  Long connectionAccountId,@ApiParam(value = "the application key for sending notifications", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "determines if the other user needs to confirm the follow request", defaultValue = "true") @DefaultValue("true") @QueryParam("approvalNeeded")  Boolean approvalNeeded,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.followRequest(accountId, connectionAccountId, appKey, approvalNeeded, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/friend/accept")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Accept Friend", notes = "Accept a friend request and optionally sends a notification.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response friendAccept(@ApiParam(value = "the friend's account id", required = true) @QueryParam("friendAccountId") @NotNull  Long friendAccountId,@ApiParam(value = "determines whether to send a notification to the afflicting party", required = true) @QueryParam("notifyFriend") @NotNull  Boolean notifyFriend,@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "This parameter is deprecated.") @QueryParam("gameType")  String gameType,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "optional message to send in a notification") @QueryParam("notificationMessage")  String notificationMessage,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.friendAccept(friendAccountId, notifyFriend, deviceId, accountId, gameType, appKey, notificationMessage, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/friend/reject")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Decline Friend", notes = "Request a friend request and optionally sends a notification.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response friendReject(@ApiParam(value = "the friend's account id", required = true) @QueryParam("friendAccountId") @NotNull  Long friendAccountId,@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "This parameter is deprecated.") @QueryParam("gameType")  String gameType,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "determines whether to send a notification to the afflicting party") @QueryParam("notifyFriend")  Boolean notifyFriend,@ApiParam(value = "optional message to send in a notification") @QueryParam("notificationMessage")  String notificationMessage,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.friendReject(friendAccountId, deviceId, accountId, gameType, appKey, notifyFriend, notificationMessage, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/friend/remove")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Friend", notes = "Removes a friend from the user's friends list.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response friendRemove(@ApiParam(value = "the account ID of the friend to remove", required = true) @QueryParam("friendAccountId") @NotNull  Long friendAccountId,@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "optionally notifies the connection that they have been removed as a friend") @QueryParam("notifyFriend")  Boolean notifyFriend,@ApiParam(value = "optionally removes the connection from the user's groups") @QueryParam("removeFromGroups")  Boolean removeFromGroups,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.friendRemove(friendAccountId, deviceId, accountId, notifyFriend, removeFromGroups, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/friend/request")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Request Friend", notes = "Sends a friend request notification to another user.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response friendRequest(@ApiParam(value = "the friend's account id", required = true) @QueryParam("friendAccountId") @NotNull  Long friendAccountId,@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "This parameter is deprecated.") @QueryParam("gameType")  String gameType,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "optional message to send in a notification") @QueryParam("notificationMessage")  String notificationMessage,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.friendRequest(friendAccountId, deviceId, accountId, gameType, appKey, notificationMessage, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/album/contest/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Contest", notes = "Gets the contest object including the likes and notes", response = AlbumContestResponse.class, tags={ "Contest", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AlbumContestResponse.class)
    })
    public Response getAlbumContest(@ApiParam(value = "the album contest ID", required = true) @QueryParam("albumContestId") @NotNull  Long albumContestId,@ApiParam(value = "a unique ID given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account ID of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "latitude used to update the user's current location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "longitude used to update the user's current location") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAlbumContest(albumContestId, deviceId, accountId, latitude, longitude, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/album/contest/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Contests", notes = "Searches on contests.", response = AlbumContestListResponse.class, tags={ "Contest", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AlbumContestListResponse.class)
    })
    public Response getAlbumContests(@ApiParam(value = "a comma separated list of Ownership", required = true) @QueryParam("filter") @NotNull  String filter,@ApiParam(value = "the field to sort by. See AlbumContestApiMap", required = true) @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "determines whether the sorted list is in descending or ascending order", required = true) @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "the start index for pagination", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "the limit for pagination (there is a hard limit of 30)", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "a unique ID given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account ID of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "This parameter is deprecated.") @QueryParam("gameType")  String gameType,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "the application type") @QueryParam("appType")  String appType,@ApiParam(value = "filter contests with this contest type") @QueryParam("contestType")  String contestType,@ApiParam(value = "search on contests that have been created by this account (that the user has permissions to)") @QueryParam("ownerId")  Long ownerId,@ApiParam(value = "This parameter is deprecated.") @QueryParam("q")  String q,@ApiParam(value = "keyword search string") @QueryParam("keyword")  String keyword,@ApiParam(value = "This parameter is deprecated.") @QueryParam("_i")  Integer i,@ApiParam(value = "This parameter is deprecated.") @QueryParam("_l")  Integer l,@ApiParam(value = "filter on items that have been created before this date") @QueryParam("dateCreated")  Long dateCreated,@ApiParam(value = "latitude used to update the user's current location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "longitude used to update the user's current location") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAlbumContests(filter, sortField, descending, start, limit, deviceId, accountId, gameType, appKey, appType, contestType, ownerId, q, keyword, i, l, dateCreated, latitude, longitude, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/connection/getRequested")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Sent Friend Requests", notes = "Gets the connection sent friend requests.", response = ConnectionListResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ConnectionListResponse.class)
    })
    public Response getConnectionSentFriendRequests(@ApiParam(value = "the ID of the device") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the id of the account") @QueryParam("accountId")  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getConnectionSentFriendRequests(deviceId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/connection/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Connections", notes = "Gets the connections.", response = ConnectionListResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ConnectionListResponse.class)
    })
    public Response getConnections(@ApiParam(value = "whether to return nulls or not", required = true) @QueryParam("returnNulls") @NotNull  Boolean returnNulls,@ApiParam(value = "a comma separated list of ConnectionApiMap. (NOTE on FOLLOWER vs FOLLOWING: FOLLOWER will get me a list of followers, FOLLOWING will get me a list of people I am following)", required = true) @QueryParam("filter") @NotNull  String filter,@ApiParam(value = "sorts the response list by ConnectionApiMap", required = true) @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "sorts the response list by descending order if true", required = true) @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "start index of the pagination", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "limit of the pagination", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "optional parameter to search on other account's connections") @QueryParam("connectionAccountId")  Long connectionAccountId,@ApiParam(value = "This parameter is deprecated.") @QueryParam("q")  String q,@ApiParam(value = "an optional keyword to search on, this parameter is ignored if empty") @QueryParam("keyword")  String keyword,@ApiParam(value = "This parameter is deprecated.") @QueryParam("_i")  Integer i,@ApiParam(value = "This parameter is deprecated.") @QueryParam("_l")  Integer l,@ApiParam(value = "the current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the current longitude of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getConnections(returnNulls, filter, sortField, descending, start, limit, deviceId, accountId, connectionAccountId, q, keyword, i, l, latitude, longitude, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/connection/group/details/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Connection Group", notes = "", response = ConnectionGroupResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ConnectionGroupResponse.class)
    })
    public Response getGroupDetails(@ApiParam(value = "whether to combine connections or not", required = true) @QueryParam("combineConnections") @NotNull  Boolean combineConnections,@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the group id") @QueryParam("groupId")  Long groupId,@ApiParam(value = "the current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the current longitude of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getGroupDetails(combineConnections, deviceId, accountId, groupId, latitude, longitude, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/theme/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Theme", notes = "Gets a theme.", response = PurchaseItemListResponse.class, tags={ "Theme Descriptor", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PurchaseItemListResponse.class)
    })
    public Response getThemeDescriptor(@ApiParam(value = "the theme id", required = true) @QueryParam("themeDescriptorId") @NotNull  Long themeDescriptorId,@ApiParam(value = "a unique ID given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account ID of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the application key") @QueryParam("gameType")  String gameType,@ApiParam(value = "latitude used to update the user's current location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "longitude used to update the user's current location") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getThemeDescriptor(themeDescriptorId, deviceId, accountId, gameType, latitude, longitude, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/theme/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Themes", notes = "Searches for themes.", response = PurchaseItemListResponse.class, tags={ "Theme Descriptor", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PurchaseItemListResponse.class)
    })
    public Response getThemeDescriptors(@ApiParam(value = "a comma separated list of Ownership", required = true) @QueryParam("filter") @NotNull  String filter,@ApiParam(value = "the field to sort by. See ThemeDescriptorApiMap", required = true) @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "determines whether the sorted list is in descending or ascending order", required = true) @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "the start parameter for pagination", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "the limit parameter for pagination", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "a unique id given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the unique title of an application given from the admin tool") @QueryParam("gameType")  String gameType,@ApiParam(value = "contest type") @QueryParam("contestType")  String contestType,@ApiParam(value = "search on contests that an account has access to") @QueryParam("ownerId")  Long ownerId,@ApiParam(value = "This parameter is deprecated.") @QueryParam("q")  String q,@ApiParam(value = "a keyword to search on") @QueryParam("keyword")  String keyword,@ApiParam(value = "This parameter is deprecated.") @QueryParam("_i")  Integer i,@ApiParam(value = "This parameter is deprecated.") @QueryParam("_l")  Integer l,@ApiParam(value = "filter on items that have been created before this date") @QueryParam("dateCreated")  Long dateCreated,@ApiParam(value = "application version of the theme to filter by") @QueryParam("appVersion")  String appVersion,@ApiParam(value = "latitude used to update the user's current location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "longitude used to update the user's current location") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getThemeDescriptors(filter, sortField, descending, start, limit, deviceId, accountId, gameType, contestType, ownerId, q, keyword, i, l, dateCreated, appVersion, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/permissions/leave")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Leave", notes = "Used when the user wants to leave from someone else's permissionable object", response = SirqulResponse.class, tags={ "User Permissions", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response leaveFromPermissionable(@ApiParam(value = "the permissionable type PermissionableType", required = true) @QueryParam("permissionableType") @NotNull  String permissionableType,@ApiParam(value = "the id of the permissionable object", required = true) @QueryParam("permissionableId") @NotNull  Long permissionableId,@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the current longitude of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.leaveFromPermissionable(permissionableType, permissionableId, deviceId, accountId, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/connection/group/removeConnection")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Connection", notes = "Removes the connection from group.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response removeConnectionFromGroup(@ApiParam(value = "whether to return nulls or not", required = true) @QueryParam("returnNulls") @NotNull  Boolean returnNulls,@ApiParam(value = "the group id", required = true) @QueryParam("groupId") @NotNull  Long groupId,@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the connection id") @QueryParam("connectionId")  Long connectionId,@ApiParam(value = "the connection account id") @QueryParam("connectionAccountId")  Long connectionAccountId,@ApiParam(value = "the pending id") @QueryParam("pendingId")  Long pendingId,@ApiParam(value = "the current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the current longitude of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.removeConnectionFromGroup(returnNulls, groupId, deviceId, accountId, connectionId, connectionAccountId, pendingId, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/connection/group/remove")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Connection Group", notes = "Remove a user's group.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response removeGroup(@ApiParam(value = "whether to return nulls or not", required = true) @QueryParam("returnNulls") @NotNull  Boolean returnNulls,@ApiParam(value = "the group id", required = true) @QueryParam("groupId") @NotNull  Long groupId,@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the current longitude of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.removeGroup(returnNulls, groupId, deviceId, accountId, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/connection/group/removeSubGroup")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Remove Connection Groups", notes = "Remove sub groups from a group", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response removeSubGroups(@ApiParam(value = "whether to return nulls or not", required = true) @QueryParam("returnNulls") @NotNull  Boolean returnNulls,@ApiParam(value = "the parent group id", required = true) @QueryParam("groupId") @NotNull  Long groupId,@ApiParam(value = "comma separated list of group IDs to remove from the parent group", required = true) @QueryParam("subGroupIds") @NotNull  String subGroupIds,@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the current longitude of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.removeSubGroups(returnNulls, groupId, subGroupIds, deviceId, accountId, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/theme/remove")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Theme", notes = "Removes a theme.", response = SirqulResponse.class, tags={ "Theme Descriptor", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response removeThemeDescriptor(@ApiParam(value = "the theme id to remove", required = true) @QueryParam("themeDescriptorId") @NotNull  Long themeDescriptorId,@ApiParam(value = "a unique id given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the unique title of an application given from the admin tool") @QueryParam("gameType")  String gameType,@ApiParam(value = "latitude used to update the user's current location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "longitude used to update the user's current location") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.removeThemeDescriptor(themeDescriptorId, deviceId, accountId, gameType, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/permissions/remove")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Remove User", notes = "Used to remove someone (assuming they have permission) from a permissionable object", response = SirqulResponse.class, tags={ "User Permissions", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response removeUsersFromPermissionable(@ApiParam(value = "the permissionable type of the object", required = true, allowableValues="ACCOUNT, GAMELEVEL, ALBUM_CONTEST, THEME_DESCRIPTOR, SCHEDULED_NOTIFICATION, TASK, TRIGGER") @QueryParam("permissionableType") @NotNull  String permissionableType,@ApiParam(value = "the id of the permissionable object", required = true) @QueryParam("permissionableId") @NotNull  Long permissionableId,@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "a comma separated list of connection ids (NOT the account ids)") @QueryParam("connectionIds")  String connectionIds,@ApiParam(value = "a comma separated list of account ids") @QueryParam("connectionAccountIds")  String connectionAccountIds,@ApiParam(value = "a comma separated list of connection group ids (these are groups made by the user)") @QueryParam("connectionGroupIds")  String connectionGroupIds,@ApiParam(value = "flag to determine whether to remove the built-in \"friends\" group", defaultValue = "false") @DefaultValue("false") @QueryParam("removeFriendGroup")  Boolean removeFriendGroup,@ApiParam(value = "the current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the current longitude of the user") @QueryParam("longitude")  Double longitude,@ApiParam(value = "comma separated list of audience ids. This will remove all users from these audiences from the permissionable object. Notifications will not be sent to users if this feature is used.") @QueryParam("audienceIds")  String audienceIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.removeUsersFromPermissionable(permissionableType, permissionableId, deviceId, accountId, connectionIds, connectionAccountIds, connectionGroupIds, removeFriendGroup, latitude, longitude, audienceIds, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/profile/matchToken")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Save Match Token", notes = "Save user's match token to be used for profile match making", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response setMatchToken(@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "A string of numbers") @QueryParam("matchToken")  String matchToken,@ApiParam(value = "Game Type (deprecated)", defaultValue = "BOOPY") @DefaultValue("BOOPY") @QueryParam("gameType")  String gameType,@ApiParam(value = "The application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "The current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current longitude of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.setMatchToken(deviceId, accountId, matchToken, gameType, appKey, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/album/contest/vote")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Vote on Contest", notes = "Vote on a collection in a contest.", response = AlbumContestResponse.class, tags={ "Contest", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AlbumContestResponse.class)
    })
    public Response voteOnAlbumContest(@ApiParam(value = "the album contest ID", required = true) @QueryParam("albumContestId") @NotNull  Long albumContestId,@ApiParam(value = "the ID of the album to vote on", required = true) @QueryParam("albumId") @NotNull  Long albumId,@ApiParam(value = "a unique ID given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account ID of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "a custom field used for aggregation and searching") @QueryParam("contestType")  String contestType,@ApiParam(value = "latitude used to update the user's current location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "longitude used to update the user's current location") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.voteOnAlbumContest(albumContestId, albumId, deviceId, accountId, contestType, latitude, longitude, securityContext);
    }
}
