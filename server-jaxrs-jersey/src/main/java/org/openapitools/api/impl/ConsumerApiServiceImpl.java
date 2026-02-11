package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AlbumContestListResponse;
import org.openapitools.model.AlbumContestResponse;
import org.openapitools.model.ConnectionGroupResponse;
import org.openapitools.model.ConnectionListResponse;
import org.openapitools.model.ConnectionResponse;
import java.io.File;
import org.openapitools.model.PurchaseItemListResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.ThemeDescriptorResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ConsumerApiServiceImpl extends ConsumerApiService {
    @Override
    public Response addConnectionToGroup( @NotNull Boolean returnNulls,  @NotNull Long groupId, String deviceId, Long accountId, Long connectionId, Long connectionAccountId, Long pendingId, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response addOrUpdateAlbumContest( @NotNull Boolean publicRead,  @NotNull Boolean publicWrite,  @NotNull Boolean publicDelete,  @NotNull Boolean publicAdd,  @NotNull String visibility,  @NotNull Boolean includeFriendGroup, String deviceId, Long accountId, String gameType, String appKey, String contestType, Long albumContestId, String title, String description, Long albumId1, Boolean removeAlbum1, Long albumId2, Boolean removeAlbum2, Long startDate, Long endDate, String locationDescription, String connectionIdsToAdd, String connectionGroupIdsToAdd, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response addOrUpdateThemeDescriptor( @NotNull Boolean publicRead,  @NotNull Boolean publicWrite,  @NotNull Boolean publicDelete,  @NotNull Boolean publicAdd,  @NotNull String visibility,  @NotNull Boolean includeFriendGroup,  @NotNull Boolean completeWithDefaultValues, String deviceId, Long accountId, String gameType, Long themeDescriptorId, String title, String description, String connectionIdsToAdd, String connectionGroupIdsToAdd, String appVersion, String colorValueJson, String stringReplacerJson, String customJsonObjects, File iconImage, File sceneAtlasImage, File bgImage, File bgSound, String musicSelection, String locationDescription, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response addSubGroups( @NotNull Boolean returnNulls,  @NotNull Long groupId,  @NotNull String subGroupIds, String deviceId, Long accountId, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response addUsersToPermissionable( @NotNull String permissionableType,  @NotNull Long permissionableId, String deviceId, Long accountId, Boolean read, Boolean write, Boolean delete, Boolean add, String connectionIds, String connectionAccountIds, String connectionGroupIds, Boolean pending, Boolean admin, Boolean includeFriendGroup, Double latitude, Double longitude, String audienceIds, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response approveAlbumContest( @NotNull Long albumContestId,  @NotNull String approvalStatus, String deviceId, Long accountId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response createOrUpdateConnection(String deviceId, Long accountId, Long connectionId, Long connectionAccountId, Long pendingId, Long groupId, String gameType, String appKey, Boolean isTrusted, Boolean ignoreFriendRequest, Boolean isContact, Boolean isBlocked, Boolean isFollowing, Boolean connectionResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response createOrUpdateGroup( @NotNull Boolean returnNulls, String deviceId, Long accountId, String name, Long groupId, Long assetId, String connections, String description, Boolean canViewProfileInfo, Boolean canViewGameInfo, Boolean canViewFriendInfo, Boolean active, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteContest( @NotNull Long albumContestId, String deviceId, Long accountId, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response followAccept( @NotNull Long accountId,  @NotNull Long connectionAccountId,  @NotNull String appKey, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response followReject( @NotNull Long accountId,  @NotNull Long connectionAccountId,  @NotNull String appKey, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response followRemove( @NotNull Long accountId,  @NotNull Long connectionAccountId,  @NotNull String appKey, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response followRequest( @NotNull Long accountId,  @NotNull Long connectionAccountId,  @NotNull String appKey, Boolean approvalNeeded, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response friendAccept( @NotNull Long friendAccountId,  @NotNull Boolean notifyFriend, String deviceId, Long accountId, String gameType, String appKey, String notificationMessage, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response friendReject( @NotNull Long friendAccountId, String deviceId, Long accountId, String gameType, String appKey, Boolean notifyFriend, String notificationMessage, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response friendRemove( @NotNull Long friendAccountId, String deviceId, Long accountId, Boolean notifyFriend, Boolean removeFromGroups, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response friendRequest( @NotNull Long friendAccountId, String deviceId, Long accountId, String gameType, String appKey, String notificationMessage, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getAlbumContest( @NotNull Long albumContestId, String deviceId, Long accountId, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getAlbumContests( @NotNull String filter,  @NotNull String sortField,  @NotNull Boolean descending,  @NotNull Integer start,  @NotNull Integer limit, String deviceId, Long accountId, String gameType, String appKey, String appType, String contestType, Long ownerId, String q, String keyword, Integer i, Integer l, Long dateCreated, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getConnectionSentFriendRequests(String deviceId, Long accountId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getConnections( @NotNull Boolean returnNulls,  @NotNull String filter,  @NotNull String sortField,  @NotNull Boolean descending,  @NotNull Integer start,  @NotNull Integer limit, String deviceId, Long accountId, Long connectionAccountId, String q, String keyword, Integer i, Integer l, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getGroupDetails( @NotNull Boolean combineConnections, String deviceId, Long accountId, Long groupId, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getThemeDescriptor( @NotNull Long themeDescriptorId, String deviceId, Long accountId, String gameType, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getThemeDescriptors( @NotNull String filter,  @NotNull String sortField,  @NotNull Boolean descending,  @NotNull Integer start,  @NotNull Integer limit, String deviceId, Long accountId, String gameType, String contestType, Long ownerId, String q, String keyword, Integer i, Integer l, Long dateCreated, String appVersion, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response leaveFromPermissionable( @NotNull String permissionableType,  @NotNull Long permissionableId, String deviceId, Long accountId, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response removeConnectionFromGroup( @NotNull Boolean returnNulls,  @NotNull Long groupId, String deviceId, Long accountId, Long connectionId, Long connectionAccountId, Long pendingId, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response removeGroup( @NotNull Boolean returnNulls,  @NotNull Long groupId, String deviceId, Long accountId, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response removeSubGroups( @NotNull Boolean returnNulls,  @NotNull Long groupId,  @NotNull String subGroupIds, String deviceId, Long accountId, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response removeThemeDescriptor( @NotNull Long themeDescriptorId, String deviceId, Long accountId, String gameType, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response removeUsersFromPermissionable( @NotNull String permissionableType,  @NotNull Long permissionableId, String deviceId, Long accountId, String connectionIds, String connectionAccountIds, String connectionGroupIds, Boolean removeFriendGroup, Double latitude, Double longitude, String audienceIds, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response setMatchToken(String deviceId, Long accountId, String matchToken, String gameType, String appKey, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response voteOnAlbumContest( @NotNull Long albumContestId,  @NotNull Long albumId, String deviceId, Long accountId, String contestType, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
