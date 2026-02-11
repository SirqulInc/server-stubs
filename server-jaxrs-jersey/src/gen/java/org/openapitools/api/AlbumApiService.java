package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.AlbumFullResponse;
import org.openapitools.model.AlbumResponse;
import java.io.File;
import org.openapitools.model.SearchResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class AlbumApiService {
    public abstract Response addAlbumCollection( @NotNull String title, @NotNull Boolean coverAssetNullable, @NotNull Boolean includeCoverInAssetList, @NotNull Boolean publicRead, @NotNull Boolean publicWrite, @NotNull Boolean publicDelete, @NotNull Boolean publicAdd, @NotNull Boolean anonymous,String deviceId,Long accountId,String assetsToAdd,File media,String mediaURL,Long assetId,File attachedMedia,String attachedMediaURL,Long startDate,Long endDate,String tags,String description,String albumType,Long albumTypeId,String subType,Double latitude,Double longitude,String locationDescription,String visibility,String gameType,String appKey,String cellPhone,String streetAddress,String streetAddress2,String city,String state,String postalCode,String fullAddress,String metaData,String categoryIds,String categoryFilterIds,String audienceIds,Boolean includeAllAppUsersAsMembers,Boolean includeAudiencesAsMembers,String audienceOperator,String approvalStatus,String linkedObjectType,Long linkedObjectId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response addAlbumUsers( @NotNull Long albumId, @NotNull Boolean includeFriendGroup,String deviceId,Long accountId,Boolean read,Boolean write,Boolean delete,Boolean add,String connections,String connectionGroups,SecurityContext securityContext) throws NotFoundException;
    public abstract Response approveAlbum( @NotNull Long albumId,String deviceId,Long accountId,String approvalStatus,Boolean verified,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAlbumCollection( @NotNull Boolean returnNulls, @NotNull Long albumId,String deviceId,Long accountId,Integer likePreviewSize,Integer assetPreviewSize,Integer notePreviewSize,Integer connectionPreviewSize,Integer audiencePreviewSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response leaveAlbum( @NotNull Long albumId,String deviceId,Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response removeAlbum( @NotNull Long albumId,String deviceId,Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response removeAlbumUsers( @NotNull Long albumId, @NotNull Boolean removeFriendGroup,String deviceId,Long accountId,String connections,String connectionGroups,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchAlbums( @NotNull String filter, @NotNull Long albumTypeId, @NotNull String subType, @NotNull Boolean includeInactive, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Double range, @NotNull Boolean includeLiked, @NotNull Boolean includeFavorited, @NotNull Boolean includePermissions, @NotNull Integer likePreviewSize, @NotNull Integer assetPreviewSize, @NotNull Integer notePreviewSize, @NotNull Integer connectionPreviewSize, @NotNull Integer audiencePreviewSize,String deviceId,Long accountId,Long connectionAccountId,Long ownerId,String albumIds,String excludeAlbumIds,Long mediaId,String keyword,String albumType,Integer limitPerAlbumType,Long dateCreated,Long updatedSince,Long updatedBefore,Long createdSince,Long createdBefore,Long startedSince,Long startedBefore,Long endedSince,Long endedBefore,Double latitude,Double longitude,String appKey,String categoryIds,String categoryFilterIds,String audienceIds,String excludeAudienceIds,Boolean includeCompletable,Boolean includeRating,String searchMode,Boolean stackSearch,Integer stackWindowSize,Integer minStackPerPage,String stackPaginationIdentifier,Boolean stackDetails,Long flagCountMinimum,Boolean removeFlaggedContent,Boolean verifiedFilter,String linkedObjectType,Long linkedObjectId,Long orderAudienceId,Boolean ignoreDefaultAppFilter,String searchExpression,Boolean generateAlbums,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateAlbumCollection( @NotNull Long albumId,String deviceId,Long accountId,String assetsToAdd,String assetsToRemove,Long assetId,File media,String mediaURL,Boolean active,String title,Long startDate,Long endDate,String tags,String description,String albumType,Long albumTypeId,String subType,Boolean publicRead,Boolean publicWrite,Boolean publicDelete,Boolean publicAdd,Double latitude,Double longitude,String locationDescription,String visibility,String cellPhone,String streetAddress,String streetAddress2,String city,String state,String postalCode,String fullAddress,Boolean anonymous,String metaData,String categoryIds,String categoryFilterIds,String audienceIds,String audienceIdsToAdd,String audienceIdsToRemove,Boolean includeAllAppUsersAsMembers,Boolean includeAudiencesAsMembers,String audienceOperator,String linkedObjectType,Long linkedObjectId,Boolean indexNow,SecurityContext securityContext) throws NotFoundException;
}
