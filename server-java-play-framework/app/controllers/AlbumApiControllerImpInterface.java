package controllers;

import apimodels.AlbumFullResponse;
import apimodels.AlbumResponse;
import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.SearchResponse;
import apimodels.SirqulResponse;

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
public abstract class AlbumApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result addAlbumCollectionHttp(Http.Request request, BigDecimal version, @NotNull String title, @NotNull Boolean coverAssetNullable, @NotNull Boolean includeCoverInAssetList, @NotNull Boolean publicRead, @NotNull Boolean publicWrite, @NotNull Boolean publicDelete, @NotNull Boolean publicAdd, @NotNull Boolean anonymous, String deviceId, Long accountId, String assetsToAdd, InputStream media, String mediaURL, Long assetId, InputStream attachedMedia, String attachedMediaURL, Long startDate, Long endDate, String tags, String description, String albumType, Long albumTypeId, String subType, Double latitude, Double longitude, String locationDescription, String visibility, String gameType, String appKey, String cellPhone, String streetAddress, String streetAddress2, String city, String state, String postalCode, String fullAddress, String metaData, String categoryIds, String categoryFilterIds, String audienceIds, Boolean includeAllAppUsersAsMembers, Boolean includeAudiencesAsMembers, String audienceOperator, String approvalStatus, String linkedObjectType, Long linkedObjectId) throws Exception {
        SearchResponse obj = addAlbumCollection(request, version, title, coverAssetNullable, includeCoverInAssetList, publicRead, publicWrite, publicDelete, publicAdd, anonymous, deviceId, accountId, assetsToAdd, media, mediaURL, assetId, attachedMedia, attachedMediaURL, startDate, endDate, tags, description, albumType, albumTypeId, subType, latitude, longitude, locationDescription, visibility, gameType, appKey, cellPhone, streetAddress, streetAddress2, city, state, postalCode, fullAddress, metaData, categoryIds, categoryFilterIds, audienceIds, includeAllAppUsersAsMembers, includeAudiencesAsMembers, audienceOperator, approvalStatus, linkedObjectType, linkedObjectId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SearchResponse addAlbumCollection(Http.Request request, BigDecimal version, @NotNull String title, @NotNull Boolean coverAssetNullable, @NotNull Boolean includeCoverInAssetList, @NotNull Boolean publicRead, @NotNull Boolean publicWrite, @NotNull Boolean publicDelete, @NotNull Boolean publicAdd, @NotNull Boolean anonymous, String deviceId, Long accountId, String assetsToAdd, InputStream media, String mediaURL, Long assetId, InputStream attachedMedia, String attachedMediaURL, Long startDate, Long endDate, String tags, String description, String albumType, Long albumTypeId, String subType, Double latitude, Double longitude, String locationDescription, String visibility, String gameType, String appKey, String cellPhone, String streetAddress, String streetAddress2, String city, String state, String postalCode, String fullAddress, String metaData, String categoryIds, String categoryFilterIds, String audienceIds, Boolean includeAllAppUsersAsMembers, Boolean includeAudiencesAsMembers, String audienceOperator, String approvalStatus, String linkedObjectType, Long linkedObjectId) throws Exception;

    public Result addAlbumUsersHttp(Http.Request request, BigDecimal version, @NotNull Long albumId, @NotNull Boolean includeFriendGroup, String deviceId, Long accountId, Boolean read, Boolean write, Boolean delete, Boolean add, String connections, String connectionGroups) throws Exception {
        SirqulResponse obj = addAlbumUsers(request, version, albumId, includeFriendGroup, deviceId, accountId, read, write, delete, add, connections, connectionGroups);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse addAlbumUsers(Http.Request request, BigDecimal version, @NotNull Long albumId, @NotNull Boolean includeFriendGroup, String deviceId, Long accountId, Boolean read, Boolean write, Boolean delete, Boolean add, String connections, String connectionGroups) throws Exception;

    public Result approveAlbumHttp(Http.Request request, BigDecimal version, @NotNull Long albumId, String deviceId, Long accountId, String approvalStatus, Boolean verified) throws Exception {
        SirqulResponse obj = approveAlbum(request, version, albumId, deviceId, accountId, approvalStatus, verified);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse approveAlbum(Http.Request request, BigDecimal version, @NotNull Long albumId, String deviceId, Long accountId, String approvalStatus, Boolean verified) throws Exception;

    public Result getAlbumCollectionHttp(Http.Request request, BigDecimal version, @NotNull Boolean returnNulls, @NotNull Long albumId, String deviceId, Long accountId, Integer likePreviewSize, Integer assetPreviewSize, Integer notePreviewSize, Integer connectionPreviewSize, Integer audiencePreviewSize) throws Exception {
        AlbumFullResponse obj = getAlbumCollection(request, version, returnNulls, albumId, deviceId, accountId, likePreviewSize, assetPreviewSize, notePreviewSize, connectionPreviewSize, audiencePreviewSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AlbumFullResponse getAlbumCollection(Http.Request request, BigDecimal version, @NotNull Boolean returnNulls, @NotNull Long albumId, String deviceId, Long accountId, Integer likePreviewSize, Integer assetPreviewSize, Integer notePreviewSize, Integer connectionPreviewSize, Integer audiencePreviewSize) throws Exception;

    public Result leaveAlbumHttp(Http.Request request, BigDecimal version, @NotNull Long albumId, String deviceId, Long accountId) throws Exception {
        SirqulResponse obj = leaveAlbum(request, version, albumId, deviceId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse leaveAlbum(Http.Request request, BigDecimal version, @NotNull Long albumId, String deviceId, Long accountId) throws Exception;

    public Result removeAlbumHttp(Http.Request request, BigDecimal version, @NotNull Long albumId, String deviceId, Long accountId) throws Exception {
        SirqulResponse obj = removeAlbum(request, version, albumId, deviceId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse removeAlbum(Http.Request request, BigDecimal version, @NotNull Long albumId, String deviceId, Long accountId) throws Exception;

    public Result removeAlbumUsersHttp(Http.Request request, BigDecimal version, @NotNull Long albumId, @NotNull Boolean removeFriendGroup, String deviceId, Long accountId, String connections, String connectionGroups) throws Exception {
        SirqulResponse obj = removeAlbumUsers(request, version, albumId, removeFriendGroup, deviceId, accountId, connections, connectionGroups);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse removeAlbumUsers(Http.Request request, BigDecimal version, @NotNull Long albumId, @NotNull Boolean removeFriendGroup, String deviceId, Long accountId, String connections, String connectionGroups) throws Exception;

    public Result searchAlbumsHttp(Http.Request request, BigDecimal version, @NotNull String filter, @NotNull Long albumTypeId, @NotNull String subType, @NotNull Boolean includeInactive, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Double range, @NotNull Boolean includeLiked, @NotNull Boolean includeFavorited, @NotNull Boolean includePermissions, @NotNull Integer likePreviewSize, @NotNull Integer assetPreviewSize, @NotNull Integer notePreviewSize, @NotNull Integer connectionPreviewSize, @NotNull Integer audiencePreviewSize, String deviceId, Long accountId, Long connectionAccountId, Long ownerId, String albumIds, String excludeAlbumIds, Long mediaId, String keyword, String albumType, Integer limitPerAlbumType, Long dateCreated, Long updatedSince, Long updatedBefore, Long createdSince, Long createdBefore, Long startedSince, Long startedBefore, Long endedSince, Long endedBefore, Double latitude, Double longitude, String appKey, String categoryIds, String categoryFilterIds, String audienceIds, String excludeAudienceIds, Boolean includeCompletable, Boolean includeRating, String searchMode, Boolean stackSearch, Integer stackWindowSize, Integer minStackPerPage, String stackPaginationIdentifier, Boolean stackDetails, Long flagCountMinimum, Boolean removeFlaggedContent, Boolean verifiedFilter, String linkedObjectType, Long linkedObjectId, Long orderAudienceId, Boolean ignoreDefaultAppFilter, String searchExpression, Boolean generateAlbums) throws Exception {
        List<AlbumFullResponse> obj = searchAlbums(request, version, filter, albumTypeId, subType, includeInactive, sortField, descending, start, limit, range, includeLiked, includeFavorited, includePermissions, likePreviewSize, assetPreviewSize, notePreviewSize, connectionPreviewSize, audiencePreviewSize, deviceId, accountId, connectionAccountId, ownerId, albumIds, excludeAlbumIds, mediaId, keyword, albumType, limitPerAlbumType, dateCreated, updatedSince, updatedBefore, createdSince, createdBefore, startedSince, startedBefore, endedSince, endedBefore, latitude, longitude, appKey, categoryIds, categoryFilterIds, audienceIds, excludeAudienceIds, includeCompletable, includeRating, searchMode, stackSearch, stackWindowSize, minStackPerPage, stackPaginationIdentifier, stackDetails, flagCountMinimum, removeFlaggedContent, verifiedFilter, linkedObjectType, linkedObjectId, orderAudienceId, ignoreDefaultAppFilter, searchExpression, generateAlbums);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (AlbumFullResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<AlbumFullResponse> searchAlbums(Http.Request request, BigDecimal version, @NotNull String filter, @NotNull Long albumTypeId, @NotNull String subType, @NotNull Boolean includeInactive, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Double range, @NotNull Boolean includeLiked, @NotNull Boolean includeFavorited, @NotNull Boolean includePermissions, @NotNull Integer likePreviewSize, @NotNull Integer assetPreviewSize, @NotNull Integer notePreviewSize, @NotNull Integer connectionPreviewSize, @NotNull Integer audiencePreviewSize, String deviceId, Long accountId, Long connectionAccountId, Long ownerId, String albumIds, String excludeAlbumIds, Long mediaId, String keyword, String albumType, Integer limitPerAlbumType, Long dateCreated, Long updatedSince, Long updatedBefore, Long createdSince, Long createdBefore, Long startedSince, Long startedBefore, Long endedSince, Long endedBefore, Double latitude, Double longitude, String appKey, String categoryIds, String categoryFilterIds, String audienceIds, String excludeAudienceIds, Boolean includeCompletable, Boolean includeRating, String searchMode, Boolean stackSearch, Integer stackWindowSize, Integer minStackPerPage, String stackPaginationIdentifier, Boolean stackDetails, Long flagCountMinimum, Boolean removeFlaggedContent, Boolean verifiedFilter, String linkedObjectType, Long linkedObjectId, Long orderAudienceId, Boolean ignoreDefaultAppFilter, String searchExpression, Boolean generateAlbums) throws Exception;

    public Result updateAlbumCollectionHttp(Http.Request request, BigDecimal version, @NotNull Long albumId, String deviceId, Long accountId, String assetsToAdd, String assetsToRemove, Long assetId, InputStream media, String mediaURL, Boolean active, String title, Long startDate, Long endDate, String tags, String description, String albumType, Long albumTypeId, String subType, Boolean publicRead, Boolean publicWrite, Boolean publicDelete, Boolean publicAdd, Double latitude, Double longitude, String locationDescription, String visibility, String cellPhone, String streetAddress, String streetAddress2, String city, String state, String postalCode, String fullAddress, Boolean anonymous, String metaData, String categoryIds, String categoryFilterIds, String audienceIds, String audienceIdsToAdd, String audienceIdsToRemove, Boolean includeAllAppUsersAsMembers, Boolean includeAudiencesAsMembers, String audienceOperator, String linkedObjectType, Long linkedObjectId, Boolean indexNow) throws Exception {
        AlbumResponse obj = updateAlbumCollection(request, version, albumId, deviceId, accountId, assetsToAdd, assetsToRemove, assetId, media, mediaURL, active, title, startDate, endDate, tags, description, albumType, albumTypeId, subType, publicRead, publicWrite, publicDelete, publicAdd, latitude, longitude, locationDescription, visibility, cellPhone, streetAddress, streetAddress2, city, state, postalCode, fullAddress, anonymous, metaData, categoryIds, categoryFilterIds, audienceIds, audienceIdsToAdd, audienceIdsToRemove, includeAllAppUsersAsMembers, includeAudiencesAsMembers, audienceOperator, linkedObjectType, linkedObjectId, indexNow);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AlbumResponse updateAlbumCollection(Http.Request request, BigDecimal version, @NotNull Long albumId, String deviceId, Long accountId, String assetsToAdd, String assetsToRemove, Long assetId, InputStream media, String mediaURL, Boolean active, String title, Long startDate, Long endDate, String tags, String description, String albumType, Long albumTypeId, String subType, Boolean publicRead, Boolean publicWrite, Boolean publicDelete, Boolean publicAdd, Double latitude, Double longitude, String locationDescription, String visibility, String cellPhone, String streetAddress, String streetAddress2, String city, String state, String postalCode, String fullAddress, Boolean anonymous, String metaData, String categoryIds, String categoryFilterIds, String audienceIds, String audienceIdsToAdd, String audienceIdsToRemove, Boolean includeAllAppUsersAsMembers, Boolean includeAudiencesAsMembers, String audienceOperator, String linkedObjectType, Long linkedObjectId, Boolean indexNow) throws Exception;

}
