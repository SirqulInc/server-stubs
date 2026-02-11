package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class ConsumerApiService {
    public abstract Response addConnectionToGroup( @NotNull Boolean returnNulls, @NotNull Long groupId,String deviceId,Long accountId,Long connectionId,Long connectionAccountId,Long pendingId,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response addOrUpdateAlbumContest( @NotNull Boolean publicRead, @NotNull Boolean publicWrite, @NotNull Boolean publicDelete, @NotNull Boolean publicAdd, @NotNull String visibility, @NotNull Boolean includeFriendGroup,String deviceId,Long accountId,String gameType,String appKey,String contestType,Long albumContestId,String title,String description,Long albumId1,Boolean removeAlbum1,Long albumId2,Boolean removeAlbum2,Long startDate,Long endDate,String locationDescription,String connectionIdsToAdd,String connectionGroupIdsToAdd,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response addOrUpdateThemeDescriptor( @NotNull Boolean publicRead, @NotNull Boolean publicWrite, @NotNull Boolean publicDelete, @NotNull Boolean publicAdd, @NotNull String visibility, @NotNull Boolean includeFriendGroup, @NotNull Boolean completeWithDefaultValues,String deviceId,Long accountId,String gameType,Long themeDescriptorId,String title,String description,String connectionIdsToAdd,String connectionGroupIdsToAdd,String appVersion,String colorValueJson,String stringReplacerJson,String customJsonObjects,File iconImage,File sceneAtlasImage,File bgImage,File bgSound,String musicSelection,String locationDescription,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response addSubGroups( @NotNull Boolean returnNulls, @NotNull Long groupId, @NotNull String subGroupIds,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response addUsersToPermissionable( @NotNull String permissionableType, @NotNull Long permissionableId,String deviceId,Long accountId,Boolean read,Boolean write,Boolean delete,Boolean add,String connectionIds,String connectionAccountIds,String connectionGroupIds,Boolean pending,Boolean admin,Boolean includeFriendGroup,Double latitude,Double longitude,String audienceIds,SecurityContext securityContext) throws NotFoundException;
    public abstract Response approveAlbumContest( @NotNull Long albumContestId, @NotNull String approvalStatus,String deviceId,Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createOrUpdateConnection(String deviceId,Long accountId,Long connectionId,Long connectionAccountId,Long pendingId,Long groupId,String gameType,String appKey,Boolean isTrusted,Boolean ignoreFriendRequest,Boolean isContact,Boolean isBlocked,Boolean isFollowing,Boolean connectionResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createOrUpdateGroup( @NotNull Boolean returnNulls,String deviceId,Long accountId,String name,Long groupId,Long assetId,String connections,String description,Boolean canViewProfileInfo,Boolean canViewGameInfo,Boolean canViewFriendInfo,Boolean active,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteContest( @NotNull Long albumContestId,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response followAccept( @NotNull Long accountId, @NotNull Long connectionAccountId, @NotNull String appKey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response followReject( @NotNull Long accountId, @NotNull Long connectionAccountId, @NotNull String appKey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response followRemove( @NotNull Long accountId, @NotNull Long connectionAccountId, @NotNull String appKey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response followRequest( @NotNull Long accountId, @NotNull Long connectionAccountId, @NotNull String appKey,Boolean approvalNeeded,SecurityContext securityContext) throws NotFoundException;
    public abstract Response friendAccept( @NotNull Long friendAccountId, @NotNull Boolean notifyFriend,String deviceId,Long accountId,String gameType,String appKey,String notificationMessage,SecurityContext securityContext) throws NotFoundException;
    public abstract Response friendReject( @NotNull Long friendAccountId,String deviceId,Long accountId,String gameType,String appKey,Boolean notifyFriend,String notificationMessage,SecurityContext securityContext) throws NotFoundException;
    public abstract Response friendRemove( @NotNull Long friendAccountId,String deviceId,Long accountId,Boolean notifyFriend,Boolean removeFromGroups,SecurityContext securityContext) throws NotFoundException;
    public abstract Response friendRequest( @NotNull Long friendAccountId,String deviceId,Long accountId,String gameType,String appKey,String notificationMessage,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAlbumContest( @NotNull Long albumContestId,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAlbumContests( @NotNull String filter, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit,String deviceId,Long accountId,String gameType,String appKey,String appType,String contestType,Long ownerId,String q,String keyword,Integer i,Integer l,Long dateCreated,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getConnectionSentFriendRequests(String deviceId,Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getConnections( @NotNull Boolean returnNulls, @NotNull String filter, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit,String deviceId,Long accountId,Long connectionAccountId,String q,String keyword,Integer i,Integer l,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getGroupDetails( @NotNull Boolean combineConnections,String deviceId,Long accountId,Long groupId,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getThemeDescriptor( @NotNull Long themeDescriptorId,String deviceId,Long accountId,String gameType,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getThemeDescriptors( @NotNull String filter, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit,String deviceId,Long accountId,String gameType,String contestType,Long ownerId,String q,String keyword,Integer i,Integer l,Long dateCreated,String appVersion,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response leaveFromPermissionable( @NotNull String permissionableType, @NotNull Long permissionableId,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response removeConnectionFromGroup( @NotNull Boolean returnNulls, @NotNull Long groupId,String deviceId,Long accountId,Long connectionId,Long connectionAccountId,Long pendingId,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response removeGroup( @NotNull Boolean returnNulls, @NotNull Long groupId,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response removeSubGroups( @NotNull Boolean returnNulls, @NotNull Long groupId, @NotNull String subGroupIds,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response removeThemeDescriptor( @NotNull Long themeDescriptorId,String deviceId,Long accountId,String gameType,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response removeUsersFromPermissionable( @NotNull String permissionableType, @NotNull Long permissionableId,String deviceId,Long accountId,String connectionIds,String connectionAccountIds,String connectionGroupIds,Boolean removeFriendGroup,Double latitude,Double longitude,String audienceIds,SecurityContext securityContext) throws NotFoundException;
    public abstract Response setMatchToken(String deviceId,Long accountId,String matchToken,String gameType,String appKey,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response voteOnAlbumContest( @NotNull Long albumContestId, @NotNull Long albumId,String deviceId,Long accountId,String contestType,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
}
