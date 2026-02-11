package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



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

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface ConsumerApiService {
      Response addConnectionToGroup(Boolean returnNulls,Long groupId,String deviceId,Long accountId,Long connectionId,Long connectionAccountId,Long pendingId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response addOrUpdateAlbumContest(Boolean publicRead,Boolean publicWrite,Boolean publicDelete,Boolean publicAdd,String visibility,Boolean includeFriendGroup,String deviceId,Long accountId,String gameType,String appKey,String contestType,Long albumContestId,String title,String description,Long albumId1,Boolean removeAlbum1,Long albumId2,Boolean removeAlbum2,Long startDate,Long endDate,String locationDescription,String connectionIdsToAdd,String connectionGroupIdsToAdd,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response addOrUpdateThemeDescriptor(Boolean publicRead,Boolean publicWrite,Boolean publicDelete,Boolean publicAdd,String visibility,Boolean includeFriendGroup,Boolean completeWithDefaultValues,String deviceId,Long accountId,String gameType,Long themeDescriptorId,String title,String description,String connectionIdsToAdd,String connectionGroupIdsToAdd,String appVersion,String colorValueJson,String stringReplacerJson,String customJsonObjects,File iconImage,File sceneAtlasImage,File bgImage,File bgSound,String musicSelection,String locationDescription,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response addSubGroups(Boolean returnNulls,Long groupId,String subGroupIds,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response addUsersToPermissionable(String permissionableType,Long permissionableId,String deviceId,Long accountId,Boolean read,Boolean write,Boolean delete,Boolean add,String connectionIds,String connectionAccountIds,String connectionGroupIds,Boolean pending,Boolean admin,Boolean includeFriendGroup,Double latitude,Double longitude,String audienceIds,SecurityContext securityContext)
      throws NotFoundException;
      Response approveAlbumContest(Long albumContestId,String approvalStatus,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response createOrUpdateConnection(String deviceId,Long accountId,Long connectionId,Long connectionAccountId,Long pendingId,Long groupId,String gameType,String appKey,Boolean isTrusted,Boolean ignoreFriendRequest,Boolean isContact,Boolean isBlocked,Boolean isFollowing,Boolean connectionResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response createOrUpdateGroup(Boolean returnNulls,String deviceId,Long accountId,String name,Long groupId,Long assetId,String connections,String description,Boolean canViewProfileInfo,Boolean canViewGameInfo,Boolean canViewFriendInfo,Boolean active,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteContest(Long albumContestId,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response followAccept(Long accountId,Long connectionAccountId,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response followReject(Long accountId,Long connectionAccountId,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response followRemove(Long accountId,Long connectionAccountId,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response followRequest(Long accountId,Long connectionAccountId,String appKey,Boolean approvalNeeded,SecurityContext securityContext)
      throws NotFoundException;
      Response friendAccept(Long friendAccountId,Boolean notifyFriend,String deviceId,Long accountId,String gameType,String appKey,String notificationMessage,SecurityContext securityContext)
      throws NotFoundException;
      Response friendReject(Long friendAccountId,String deviceId,Long accountId,String gameType,String appKey,Boolean notifyFriend,String notificationMessage,SecurityContext securityContext)
      throws NotFoundException;
      Response friendRemove(Long friendAccountId,String deviceId,Long accountId,Boolean notifyFriend,Boolean removeFromGroups,SecurityContext securityContext)
      throws NotFoundException;
      Response friendRequest(Long friendAccountId,String deviceId,Long accountId,String gameType,String appKey,String notificationMessage,SecurityContext securityContext)
      throws NotFoundException;
      Response getAlbumContest(Long albumContestId,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response getAlbumContests(String filter,String sortField,Boolean descending,Integer start,Integer limit,String deviceId,Long accountId,String gameType,String appKey,String appType,String contestType,Long ownerId,String q,String keyword,Integer i,Integer l,Long dateCreated,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response getConnectionSentFriendRequests(String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getConnections(Boolean returnNulls,String filter,String sortField,Boolean descending,Integer start,Integer limit,String deviceId,Long accountId,Long connectionAccountId,String q,String keyword,Integer i,Integer l,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response getGroupDetails(Boolean combineConnections,String deviceId,Long accountId,Long groupId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response getThemeDescriptor(Long themeDescriptorId,String deviceId,Long accountId,String gameType,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response getThemeDescriptors(String filter,String sortField,Boolean descending,Integer start,Integer limit,String deviceId,Long accountId,String gameType,String contestType,Long ownerId,String q,String keyword,Integer i,Integer l,Long dateCreated,String appVersion,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response leaveFromPermissionable(String permissionableType,Long permissionableId,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response removeConnectionFromGroup(Boolean returnNulls,Long groupId,String deviceId,Long accountId,Long connectionId,Long connectionAccountId,Long pendingId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response removeGroup(Boolean returnNulls,Long groupId,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response removeSubGroups(Boolean returnNulls,Long groupId,String subGroupIds,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response removeThemeDescriptor(Long themeDescriptorId,String deviceId,Long accountId,String gameType,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response removeUsersFromPermissionable(String permissionableType,Long permissionableId,String deviceId,Long accountId,String connectionIds,String connectionAccountIds,String connectionGroupIds,Boolean removeFriendGroup,Double latitude,Double longitude,String audienceIds,SecurityContext securityContext)
      throws NotFoundException;
      Response setMatchToken(String deviceId,Long accountId,String matchToken,String gameType,String appKey,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response voteOnAlbumContest(Long albumContestId,Long albumId,String deviceId,Long accountId,String contestType,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;


}
