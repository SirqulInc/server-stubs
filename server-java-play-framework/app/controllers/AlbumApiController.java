package controllers;

import apimodels.AlbumFullResponse;
import apimodels.AlbumResponse;
import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.SearchResponse;
import apimodels.SirqulResponse;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AlbumApiController extends Controller {
    private final AlbumApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private AlbumApiController(Config configuration, AlbumApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result addAlbumCollection(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuetitle = request.getQueryString("title");
        String title;
        if (valuetitle != null) {
            title = valuetitle;
        } else {
            throw new IllegalArgumentException("'title' parameter is required");
        }
        String valueassetsToAdd = request.getQueryString("assetsToAdd");
        String assetsToAdd;
        if (valueassetsToAdd != null) {
            assetsToAdd = valueassetsToAdd;
        } else {
            assetsToAdd = null;
        }
        String valuemedia = request.getQueryString("media");
        InputStream media;
        if (valuemedia != null) {
            media = valuemedia;
        } else {
            media = null;
        }
        String valuemediaURL = request.getQueryString("mediaURL");
        String mediaURL;
        if (valuemediaURL != null) {
            mediaURL = valuemediaURL;
        } else {
            mediaURL = null;
        }
        String valueassetId = request.getQueryString("assetId");
        Long assetId;
        if (valueassetId != null) {
            assetId = Long.parseLong(valueassetId);
        } else {
            assetId = null;
        }
        String valueattachedMedia = request.getQueryString("attachedMedia");
        InputStream attachedMedia;
        if (valueattachedMedia != null) {
            attachedMedia = valueattachedMedia;
        } else {
            attachedMedia = null;
        }
        String valueattachedMediaURL = request.getQueryString("attachedMediaURL");
        String attachedMediaURL;
        if (valueattachedMediaURL != null) {
            attachedMediaURL = valueattachedMediaURL;
        } else {
            attachedMediaURL = null;
        }
        String valuecoverAssetNullable = request.getQueryString("coverAssetNullable");
        Boolean coverAssetNullable;
        if (valuecoverAssetNullable != null) {
            coverAssetNullable = Boolean.valueOf(valuecoverAssetNullable);
        } else {
            throw new IllegalArgumentException("'coverAssetNullable' parameter is required");
        }
        String valueincludeCoverInAssetList = request.getQueryString("includeCoverInAssetList");
        Boolean includeCoverInAssetList;
        if (valueincludeCoverInAssetList != null) {
            includeCoverInAssetList = Boolean.valueOf(valueincludeCoverInAssetList);
        } else {
            throw new IllegalArgumentException("'includeCoverInAssetList' parameter is required");
        }
        String valuestartDate = request.getQueryString("startDate");
        Long startDate;
        if (valuestartDate != null) {
            startDate = Long.parseLong(valuestartDate);
        } else {
            startDate = null;
        }
        String valueendDate = request.getQueryString("endDate");
        Long endDate;
        if (valueendDate != null) {
            endDate = Long.parseLong(valueendDate);
        } else {
            endDate = null;
        }
        String valuetags = request.getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            tags = null;
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuealbumType = request.getQueryString("albumType");
        String albumType;
        if (valuealbumType != null) {
            albumType = valuealbumType;
        } else {
            albumType = null;
        }
        String valuealbumTypeId = request.getQueryString("albumTypeId");
        Long albumTypeId;
        if (valuealbumTypeId != null) {
            albumTypeId = Long.parseLong(valuealbumTypeId);
        } else {
            albumTypeId = null;
        }
        String valuesubType = request.getQueryString("subType");
        String subType;
        if (valuesubType != null) {
            subType = valuesubType;
        } else {
            subType = null;
        }
        String valuepublicRead = request.getQueryString("publicRead");
        Boolean publicRead;
        if (valuepublicRead != null) {
            publicRead = Boolean.valueOf(valuepublicRead);
        } else {
            throw new IllegalArgumentException("'publicRead' parameter is required");
        }
        String valuepublicWrite = request.getQueryString("publicWrite");
        Boolean publicWrite;
        if (valuepublicWrite != null) {
            publicWrite = Boolean.valueOf(valuepublicWrite);
        } else {
            throw new IllegalArgumentException("'publicWrite' parameter is required");
        }
        String valuepublicDelete = request.getQueryString("publicDelete");
        Boolean publicDelete;
        if (valuepublicDelete != null) {
            publicDelete = Boolean.valueOf(valuepublicDelete);
        } else {
            throw new IllegalArgumentException("'publicDelete' parameter is required");
        }
        String valuepublicAdd = request.getQueryString("publicAdd");
        Boolean publicAdd;
        if (valuepublicAdd != null) {
            publicAdd = Boolean.valueOf(valuepublicAdd);
        } else {
            throw new IllegalArgumentException("'publicAdd' parameter is required");
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        String valuelocationDescription = request.getQueryString("locationDescription");
        String locationDescription;
        if (valuelocationDescription != null) {
            locationDescription = valuelocationDescription;
        } else {
            locationDescription = null;
        }
        String valuevisibility = request.getQueryString("visibility");
        String visibility;
        if (valuevisibility != null) {
            visibility = valuevisibility;
        } else {
            visibility = null;
        }
        String valuegameType = request.getQueryString("gameType");
        String gameType;
        if (valuegameType != null) {
            gameType = valuegameType;
        } else {
            gameType = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuecellPhone = request.getQueryString("cellPhone");
        String cellPhone;
        if (valuecellPhone != null) {
            cellPhone = valuecellPhone;
        } else {
            cellPhone = null;
        }
        String valuestreetAddress = request.getQueryString("streetAddress");
        String streetAddress;
        if (valuestreetAddress != null) {
            streetAddress = valuestreetAddress;
        } else {
            streetAddress = null;
        }
        String valuestreetAddress2 = request.getQueryString("streetAddress2");
        String streetAddress2;
        if (valuestreetAddress2 != null) {
            streetAddress2 = valuestreetAddress2;
        } else {
            streetAddress2 = null;
        }
        String valuecity = request.getQueryString("city");
        String city;
        if (valuecity != null) {
            city = valuecity;
        } else {
            city = null;
        }
        String valuestate = request.getQueryString("state");
        String state;
        if (valuestate != null) {
            state = valuestate;
        } else {
            state = null;
        }
        String valuepostalCode = request.getQueryString("postalCode");
        String postalCode;
        if (valuepostalCode != null) {
            postalCode = valuepostalCode;
        } else {
            postalCode = null;
        }
        String valuefullAddress = request.getQueryString("fullAddress");
        String fullAddress;
        if (valuefullAddress != null) {
            fullAddress = valuefullAddress;
        } else {
            fullAddress = null;
        }
        String valueanonymous = request.getQueryString("anonymous");
        Boolean anonymous;
        if (valueanonymous != null) {
            anonymous = Boolean.valueOf(valueanonymous);
        } else {
            throw new IllegalArgumentException("'anonymous' parameter is required");
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valuecategoryFilterIds = request.getQueryString("categoryFilterIds");
        String categoryFilterIds;
        if (valuecategoryFilterIds != null) {
            categoryFilterIds = valuecategoryFilterIds;
        } else {
            categoryFilterIds = null;
        }
        String valueaudienceIds = request.getQueryString("audienceIds");
        String audienceIds;
        if (valueaudienceIds != null) {
            audienceIds = valueaudienceIds;
        } else {
            audienceIds = null;
        }
        String valueincludeAllAppUsersAsMembers = request.getQueryString("includeAllAppUsersAsMembers");
        Boolean includeAllAppUsersAsMembers;
        if (valueincludeAllAppUsersAsMembers != null) {
            includeAllAppUsersAsMembers = Boolean.valueOf(valueincludeAllAppUsersAsMembers);
        } else {
            includeAllAppUsersAsMembers = null;
        }
        String valueincludeAudiencesAsMembers = request.getQueryString("includeAudiencesAsMembers");
        Boolean includeAudiencesAsMembers;
        if (valueincludeAudiencesAsMembers != null) {
            includeAudiencesAsMembers = Boolean.valueOf(valueincludeAudiencesAsMembers);
        } else {
            includeAudiencesAsMembers = null;
        }
        String valueaudienceOperator = request.getQueryString("audienceOperator");
        String audienceOperator;
        if (valueaudienceOperator != null) {
            audienceOperator = valueaudienceOperator;
        } else {
            audienceOperator = null;
        }
        String valueapprovalStatus = request.getQueryString("approvalStatus");
        String approvalStatus;
        if (valueapprovalStatus != null) {
            approvalStatus = valueapprovalStatus;
        } else {
            approvalStatus = null;
        }
        String valuelinkedObjectType = request.getQueryString("linkedObjectType");
        String linkedObjectType;
        if (valuelinkedObjectType != null) {
            linkedObjectType = valuelinkedObjectType;
        } else {
            linkedObjectType = null;
        }
        String valuelinkedObjectId = request.getQueryString("linkedObjectId");
        Long linkedObjectId;
        if (valuelinkedObjectId != null) {
            linkedObjectId = Long.parseLong(valuelinkedObjectId);
        } else {
            linkedObjectId = null;
        }
        return imp.addAlbumCollectionHttp(request, version, title, coverAssetNullable, includeCoverInAssetList, publicRead, publicWrite, publicDelete, publicAdd, anonymous, deviceId, accountId, assetsToAdd, media, mediaURL, assetId, attachedMedia, attachedMediaURL, startDate, endDate, tags, description, albumType, albumTypeId, subType, latitude, longitude, locationDescription, visibility, gameType, appKey, cellPhone, streetAddress, streetAddress2, city, state, postalCode, fullAddress, metaData, categoryIds, categoryFilterIds, audienceIds, includeAllAppUsersAsMembers, includeAudiencesAsMembers, audienceOperator, approvalStatus, linkedObjectType, linkedObjectId);
    }

    @ApiAction
    public Result addAlbumUsers(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuealbumId = request.getQueryString("albumId");
        Long albumId;
        if (valuealbumId != null) {
            albumId = Long.parseLong(valuealbumId);
        } else {
            throw new IllegalArgumentException("'albumId' parameter is required");
        }
        String valueread = request.getQueryString("read");
        Boolean read;
        if (valueread != null) {
            read = Boolean.valueOf(valueread);
        } else {
            read = null;
        }
        String valuewrite = request.getQueryString("write");
        Boolean write;
        if (valuewrite != null) {
            write = Boolean.valueOf(valuewrite);
        } else {
            write = null;
        }
        String valuedelete = request.getQueryString("delete");
        Boolean delete;
        if (valuedelete != null) {
            delete = Boolean.valueOf(valuedelete);
        } else {
            delete = null;
        }
        String valueadd = request.getQueryString("add");
        Boolean add;
        if (valueadd != null) {
            add = Boolean.valueOf(valueadd);
        } else {
            add = null;
        }
        String valueconnections = request.getQueryString("connections");
        String connections;
        if (valueconnections != null) {
            connections = valueconnections;
        } else {
            connections = null;
        }
        String valueconnectionGroups = request.getQueryString("connectionGroups");
        String connectionGroups;
        if (valueconnectionGroups != null) {
            connectionGroups = valueconnectionGroups;
        } else {
            connectionGroups = null;
        }
        String valueincludeFriendGroup = request.getQueryString("includeFriendGroup");
        Boolean includeFriendGroup;
        if (valueincludeFriendGroup != null) {
            includeFriendGroup = Boolean.valueOf(valueincludeFriendGroup);
        } else {
            throw new IllegalArgumentException("'includeFriendGroup' parameter is required");
        }
        return imp.addAlbumUsersHttp(request, version, albumId, includeFriendGroup, deviceId, accountId, read, write, delete, add, connections, connectionGroups);
    }

    @ApiAction
    public Result approveAlbum(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuealbumId = request.getQueryString("albumId");
        Long albumId;
        if (valuealbumId != null) {
            albumId = Long.parseLong(valuealbumId);
        } else {
            throw new IllegalArgumentException("'albumId' parameter is required");
        }
        String valueapprovalStatus = request.getQueryString("approvalStatus");
        String approvalStatus;
        if (valueapprovalStatus != null) {
            approvalStatus = valueapprovalStatus;
        } else {
            approvalStatus = null;
        }
        String valueverified = request.getQueryString("verified");
        Boolean verified;
        if (valueverified != null) {
            verified = Boolean.valueOf(valueverified);
        } else {
            verified = null;
        }
        return imp.approveAlbumHttp(request, version, albumId, deviceId, accountId, approvalStatus, verified);
    }

    @ApiAction
    public Result getAlbumCollection(Http.Request request, BigDecimal version) throws Exception {
        String valuereturnNulls = request.getQueryString("returnNulls");
        Boolean returnNulls;
        if (valuereturnNulls != null) {
            returnNulls = Boolean.valueOf(valuereturnNulls);
        } else {
            throw new IllegalArgumentException("'returnNulls' parameter is required");
        }
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuealbumId = request.getQueryString("albumId");
        Long albumId;
        if (valuealbumId != null) {
            albumId = Long.parseLong(valuealbumId);
        } else {
            throw new IllegalArgumentException("'albumId' parameter is required");
        }
        String valuelikePreviewSize = request.getQueryString("likePreviewSize");
        Integer likePreviewSize;
        if (valuelikePreviewSize != null) {
            likePreviewSize = Integer.parseInt(valuelikePreviewSize);
        } else {
            likePreviewSize = null;
        }
        String valueassetPreviewSize = request.getQueryString("assetPreviewSize");
        Integer assetPreviewSize;
        if (valueassetPreviewSize != null) {
            assetPreviewSize = Integer.parseInt(valueassetPreviewSize);
        } else {
            assetPreviewSize = null;
        }
        String valuenotePreviewSize = request.getQueryString("notePreviewSize");
        Integer notePreviewSize;
        if (valuenotePreviewSize != null) {
            notePreviewSize = Integer.parseInt(valuenotePreviewSize);
        } else {
            notePreviewSize = null;
        }
        String valueconnectionPreviewSize = request.getQueryString("connectionPreviewSize");
        Integer connectionPreviewSize;
        if (valueconnectionPreviewSize != null) {
            connectionPreviewSize = Integer.parseInt(valueconnectionPreviewSize);
        } else {
            connectionPreviewSize = null;
        }
        String valueaudiencePreviewSize = request.getQueryString("audiencePreviewSize");
        Integer audiencePreviewSize;
        if (valueaudiencePreviewSize != null) {
            audiencePreviewSize = Integer.parseInt(valueaudiencePreviewSize);
        } else {
            audiencePreviewSize = null;
        }
        return imp.getAlbumCollectionHttp(request, version, returnNulls, albumId, deviceId, accountId, likePreviewSize, assetPreviewSize, notePreviewSize, connectionPreviewSize, audiencePreviewSize);
    }

    @ApiAction
    public Result leaveAlbum(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuealbumId = request.getQueryString("albumId");
        Long albumId;
        if (valuealbumId != null) {
            albumId = Long.parseLong(valuealbumId);
        } else {
            throw new IllegalArgumentException("'albumId' parameter is required");
        }
        return imp.leaveAlbumHttp(request, version, albumId, deviceId, accountId);
    }

    @ApiAction
    public Result removeAlbum(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuealbumId = request.getQueryString("albumId");
        Long albumId;
        if (valuealbumId != null) {
            albumId = Long.parseLong(valuealbumId);
        } else {
            throw new IllegalArgumentException("'albumId' parameter is required");
        }
        return imp.removeAlbumHttp(request, version, albumId, deviceId, accountId);
    }

    @ApiAction
    public Result removeAlbumUsers(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuealbumId = request.getQueryString("albumId");
        Long albumId;
        if (valuealbumId != null) {
            albumId = Long.parseLong(valuealbumId);
        } else {
            throw new IllegalArgumentException("'albumId' parameter is required");
        }
        String valueconnections = request.getQueryString("connections");
        String connections;
        if (valueconnections != null) {
            connections = valueconnections;
        } else {
            connections = null;
        }
        String valueconnectionGroups = request.getQueryString("connectionGroups");
        String connectionGroups;
        if (valueconnectionGroups != null) {
            connectionGroups = valueconnectionGroups;
        } else {
            connectionGroups = null;
        }
        String valueremoveFriendGroup = request.getQueryString("removeFriendGroup");
        Boolean removeFriendGroup;
        if (valueremoveFriendGroup != null) {
            removeFriendGroup = Boolean.valueOf(valueremoveFriendGroup);
        } else {
            throw new IllegalArgumentException("'removeFriendGroup' parameter is required");
        }
        return imp.removeAlbumUsersHttp(request, version, albumId, removeFriendGroup, deviceId, accountId, connections, connectionGroups);
    }

    @ApiAction
    public Result searchAlbums(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueconnectionAccountId = request.getQueryString("connectionAccountId");
        Long connectionAccountId;
        if (valueconnectionAccountId != null) {
            connectionAccountId = Long.parseLong(valueconnectionAccountId);
        } else {
            connectionAccountId = null;
        }
        String valueownerId = request.getQueryString("ownerId");
        Long ownerId;
        if (valueownerId != null) {
            ownerId = Long.parseLong(valueownerId);
        } else {
            ownerId = null;
        }
        String valuealbumIds = request.getQueryString("albumIds");
        String albumIds;
        if (valuealbumIds != null) {
            albumIds = valuealbumIds;
        } else {
            albumIds = null;
        }
        String valueexcludeAlbumIds = request.getQueryString("excludeAlbumIds");
        String excludeAlbumIds;
        if (valueexcludeAlbumIds != null) {
            excludeAlbumIds = valueexcludeAlbumIds;
        } else {
            excludeAlbumIds = null;
        }
        String valuemediaId = request.getQueryString("mediaId");
        Long mediaId;
        if (valuemediaId != null) {
            mediaId = Long.parseLong(valuemediaId);
        } else {
            mediaId = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valuefilter = request.getQueryString("filter");
        String filter;
        if (valuefilter != null) {
            filter = valuefilter;
        } else {
            throw new IllegalArgumentException("'filter' parameter is required");
        }
        String valuealbumType = request.getQueryString("albumType");
        String albumType;
        if (valuealbumType != null) {
            albumType = valuealbumType;
        } else {
            albumType = null;
        }
        String valuealbumTypeId = request.getQueryString("albumTypeId");
        Long albumTypeId;
        if (valuealbumTypeId != null) {
            albumTypeId = Long.parseLong(valuealbumTypeId);
        } else {
            throw new IllegalArgumentException("'albumTypeId' parameter is required");
        }
        String valuesubType = request.getQueryString("subType");
        String subType;
        if (valuesubType != null) {
            subType = valuesubType;
        } else {
            throw new IllegalArgumentException("'subType' parameter is required");
        }
        String valueincludeInactive = request.getQueryString("includeInactive");
        Boolean includeInactive;
        if (valueincludeInactive != null) {
            includeInactive = Boolean.valueOf(valueincludeInactive);
        } else {
            throw new IllegalArgumentException("'includeInactive' parameter is required");
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            throw new IllegalArgumentException("'sortField' parameter is required");
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            throw new IllegalArgumentException("'descending' parameter is required");
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            throw new IllegalArgumentException("'start' parameter is required");
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            throw new IllegalArgumentException("'limit' parameter is required");
        }
        String valuelimitPerAlbumType = request.getQueryString("limitPerAlbumType");
        Integer limitPerAlbumType;
        if (valuelimitPerAlbumType != null) {
            limitPerAlbumType = Integer.parseInt(valuelimitPerAlbumType);
        } else {
            limitPerAlbumType = null;
        }
        String valuedateCreated = request.getQueryString("dateCreated");
        Long dateCreated;
        if (valuedateCreated != null) {
            dateCreated = Long.parseLong(valuedateCreated);
        } else {
            dateCreated = null;
        }
        String valueupdatedSince = request.getQueryString("updatedSince");
        Long updatedSince;
        if (valueupdatedSince != null) {
            updatedSince = Long.parseLong(valueupdatedSince);
        } else {
            updatedSince = null;
        }
        String valueupdatedBefore = request.getQueryString("updatedBefore");
        Long updatedBefore;
        if (valueupdatedBefore != null) {
            updatedBefore = Long.parseLong(valueupdatedBefore);
        } else {
            updatedBefore = null;
        }
        String valuecreatedSince = request.getQueryString("createdSince");
        Long createdSince;
        if (valuecreatedSince != null) {
            createdSince = Long.parseLong(valuecreatedSince);
        } else {
            createdSince = null;
        }
        String valuecreatedBefore = request.getQueryString("createdBefore");
        Long createdBefore;
        if (valuecreatedBefore != null) {
            createdBefore = Long.parseLong(valuecreatedBefore);
        } else {
            createdBefore = null;
        }
        String valuestartedSince = request.getQueryString("startedSince");
        Long startedSince;
        if (valuestartedSince != null) {
            startedSince = Long.parseLong(valuestartedSince);
        } else {
            startedSince = null;
        }
        String valuestartedBefore = request.getQueryString("startedBefore");
        Long startedBefore;
        if (valuestartedBefore != null) {
            startedBefore = Long.parseLong(valuestartedBefore);
        } else {
            startedBefore = null;
        }
        String valueendedSince = request.getQueryString("endedSince");
        Long endedSince;
        if (valueendedSince != null) {
            endedSince = Long.parseLong(valueendedSince);
        } else {
            endedSince = null;
        }
        String valueendedBefore = request.getQueryString("endedBefore");
        Long endedBefore;
        if (valueendedBefore != null) {
            endedBefore = Long.parseLong(valueendedBefore);
        } else {
            endedBefore = null;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        String valuerange = request.getQueryString("range");
        Double range;
        if (valuerange != null) {
            range = Double.parseDouble(valuerange);
        } else {
            throw new IllegalArgumentException("'range' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valuecategoryFilterIds = request.getQueryString("categoryFilterIds");
        String categoryFilterIds;
        if (valuecategoryFilterIds != null) {
            categoryFilterIds = valuecategoryFilterIds;
        } else {
            categoryFilterIds = null;
        }
        String valueaudienceIds = request.getQueryString("audienceIds");
        String audienceIds;
        if (valueaudienceIds != null) {
            audienceIds = valueaudienceIds;
        } else {
            audienceIds = null;
        }
        String valueexcludeAudienceIds = request.getQueryString("excludeAudienceIds");
        String excludeAudienceIds;
        if (valueexcludeAudienceIds != null) {
            excludeAudienceIds = valueexcludeAudienceIds;
        } else {
            excludeAudienceIds = null;
        }
        String valueincludeLiked = request.getQueryString("includeLiked");
        Boolean includeLiked;
        if (valueincludeLiked != null) {
            includeLiked = Boolean.valueOf(valueincludeLiked);
        } else {
            throw new IllegalArgumentException("'includeLiked' parameter is required");
        }
        String valueincludeFavorited = request.getQueryString("includeFavorited");
        Boolean includeFavorited;
        if (valueincludeFavorited != null) {
            includeFavorited = Boolean.valueOf(valueincludeFavorited);
        } else {
            throw new IllegalArgumentException("'includeFavorited' parameter is required");
        }
        String valueincludePermissions = request.getQueryString("includePermissions");
        Boolean includePermissions;
        if (valueincludePermissions != null) {
            includePermissions = Boolean.valueOf(valueincludePermissions);
        } else {
            throw new IllegalArgumentException("'includePermissions' parameter is required");
        }
        String valueincludeCompletable = request.getQueryString("includeCompletable");
        Boolean includeCompletable;
        if (valueincludeCompletable != null) {
            includeCompletable = Boolean.valueOf(valueincludeCompletable);
        } else {
            includeCompletable = null;
        }
        String valueincludeRating = request.getQueryString("includeRating");
        Boolean includeRating;
        if (valueincludeRating != null) {
            includeRating = Boolean.valueOf(valueincludeRating);
        } else {
            includeRating = null;
        }
        String valuelikePreviewSize = request.getQueryString("likePreviewSize");
        Integer likePreviewSize;
        if (valuelikePreviewSize != null) {
            likePreviewSize = Integer.parseInt(valuelikePreviewSize);
        } else {
            throw new IllegalArgumentException("'likePreviewSize' parameter is required");
        }
        String valueassetPreviewSize = request.getQueryString("assetPreviewSize");
        Integer assetPreviewSize;
        if (valueassetPreviewSize != null) {
            assetPreviewSize = Integer.parseInt(valueassetPreviewSize);
        } else {
            throw new IllegalArgumentException("'assetPreviewSize' parameter is required");
        }
        String valuenotePreviewSize = request.getQueryString("notePreviewSize");
        Integer notePreviewSize;
        if (valuenotePreviewSize != null) {
            notePreviewSize = Integer.parseInt(valuenotePreviewSize);
        } else {
            throw new IllegalArgumentException("'notePreviewSize' parameter is required");
        }
        String valueconnectionPreviewSize = request.getQueryString("connectionPreviewSize");
        Integer connectionPreviewSize;
        if (valueconnectionPreviewSize != null) {
            connectionPreviewSize = Integer.parseInt(valueconnectionPreviewSize);
        } else {
            throw new IllegalArgumentException("'connectionPreviewSize' parameter is required");
        }
        String valueaudiencePreviewSize = request.getQueryString("audiencePreviewSize");
        Integer audiencePreviewSize;
        if (valueaudiencePreviewSize != null) {
            audiencePreviewSize = Integer.parseInt(valueaudiencePreviewSize);
        } else {
            throw new IllegalArgumentException("'audiencePreviewSize' parameter is required");
        }
        String valuesearchMode = request.getQueryString("searchMode");
        String searchMode;
        if (valuesearchMode != null) {
            searchMode = valuesearchMode;
        } else {
            searchMode = null;
        }
        String valuestackSearch = request.getQueryString("stackSearch");
        Boolean stackSearch;
        if (valuestackSearch != null) {
            stackSearch = Boolean.valueOf(valuestackSearch);
        } else {
            stackSearch = null;
        }
        String valuestackWindowSize = request.getQueryString("stackWindowSize");
        Integer stackWindowSize;
        if (valuestackWindowSize != null) {
            stackWindowSize = Integer.parseInt(valuestackWindowSize);
        } else {
            stackWindowSize = null;
        }
        String valueminStackPerPage = request.getQueryString("minStackPerPage");
        Integer minStackPerPage;
        if (valueminStackPerPage != null) {
            minStackPerPage = Integer.parseInt(valueminStackPerPage);
        } else {
            minStackPerPage = null;
        }
        String valuestackPaginationIdentifier = request.getQueryString("stackPaginationIdentifier");
        String stackPaginationIdentifier;
        if (valuestackPaginationIdentifier != null) {
            stackPaginationIdentifier = valuestackPaginationIdentifier;
        } else {
            stackPaginationIdentifier = null;
        }
        String valuestackDetails = request.getQueryString("stackDetails");
        Boolean stackDetails;
        if (valuestackDetails != null) {
            stackDetails = Boolean.valueOf(valuestackDetails);
        } else {
            stackDetails = null;
        }
        String valueflagCountMinimum = request.getQueryString("flagCountMinimum");
        Long flagCountMinimum;
        if (valueflagCountMinimum != null) {
            flagCountMinimum = Long.parseLong(valueflagCountMinimum);
        } else {
            flagCountMinimum = null;
        }
        String valueremoveFlaggedContent = request.getQueryString("removeFlaggedContent");
        Boolean removeFlaggedContent;
        if (valueremoveFlaggedContent != null) {
            removeFlaggedContent = Boolean.valueOf(valueremoveFlaggedContent);
        } else {
            removeFlaggedContent = true;
        }
        String valueverifiedFilter = request.getQueryString("verifiedFilter");
        Boolean verifiedFilter;
        if (valueverifiedFilter != null) {
            verifiedFilter = Boolean.valueOf(valueverifiedFilter);
        } else {
            verifiedFilter = null;
        }
        String valuelinkedObjectType = request.getQueryString("linkedObjectType");
        String linkedObjectType;
        if (valuelinkedObjectType != null) {
            linkedObjectType = valuelinkedObjectType;
        } else {
            linkedObjectType = null;
        }
        String valuelinkedObjectId = request.getQueryString("linkedObjectId");
        Long linkedObjectId;
        if (valuelinkedObjectId != null) {
            linkedObjectId = Long.parseLong(valuelinkedObjectId);
        } else {
            linkedObjectId = null;
        }
        String valueorderAudienceId = request.getQueryString("orderAudienceId");
        Long orderAudienceId;
        if (valueorderAudienceId != null) {
            orderAudienceId = Long.parseLong(valueorderAudienceId);
        } else {
            orderAudienceId = null;
        }
        String valueignoreDefaultAppFilter = request.getQueryString("ignoreDefaultAppFilter");
        Boolean ignoreDefaultAppFilter;
        if (valueignoreDefaultAppFilter != null) {
            ignoreDefaultAppFilter = Boolean.valueOf(valueignoreDefaultAppFilter);
        } else {
            ignoreDefaultAppFilter = null;
        }
        String valuesearchExpression = request.getQueryString("searchExpression");
        String searchExpression;
        if (valuesearchExpression != null) {
            searchExpression = valuesearchExpression;
        } else {
            searchExpression = null;
        }
        String valuegenerateAlbums = request.getQueryString("generateAlbums");
        Boolean generateAlbums;
        if (valuegenerateAlbums != null) {
            generateAlbums = Boolean.valueOf(valuegenerateAlbums);
        } else {
            generateAlbums = null;
        }
        return imp.searchAlbumsHttp(request, version, filter, albumTypeId, subType, includeInactive, sortField, descending, start, limit, range, includeLiked, includeFavorited, includePermissions, likePreviewSize, assetPreviewSize, notePreviewSize, connectionPreviewSize, audiencePreviewSize, deviceId, accountId, connectionAccountId, ownerId, albumIds, excludeAlbumIds, mediaId, keyword, albumType, limitPerAlbumType, dateCreated, updatedSince, updatedBefore, createdSince, createdBefore, startedSince, startedBefore, endedSince, endedBefore, latitude, longitude, appKey, categoryIds, categoryFilterIds, audienceIds, excludeAudienceIds, includeCompletable, includeRating, searchMode, stackSearch, stackWindowSize, minStackPerPage, stackPaginationIdentifier, stackDetails, flagCountMinimum, removeFlaggedContent, verifiedFilter, linkedObjectType, linkedObjectId, orderAudienceId, ignoreDefaultAppFilter, searchExpression, generateAlbums);
    }

    @ApiAction
    public Result updateAlbumCollection(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuealbumId = request.getQueryString("albumId");
        Long albumId;
        if (valuealbumId != null) {
            albumId = Long.parseLong(valuealbumId);
        } else {
            throw new IllegalArgumentException("'albumId' parameter is required");
        }
        String valueassetsToAdd = request.getQueryString("assetsToAdd");
        String assetsToAdd;
        if (valueassetsToAdd != null) {
            assetsToAdd = valueassetsToAdd;
        } else {
            assetsToAdd = null;
        }
        String valueassetsToRemove = request.getQueryString("assetsToRemove");
        String assetsToRemove;
        if (valueassetsToRemove != null) {
            assetsToRemove = valueassetsToRemove;
        } else {
            assetsToRemove = null;
        }
        String valueassetId = request.getQueryString("assetId");
        Long assetId;
        if (valueassetId != null) {
            assetId = Long.parseLong(valueassetId);
        } else {
            assetId = null;
        }
        String valuemedia = request.getQueryString("media");
        InputStream media;
        if (valuemedia != null) {
            media = valuemedia;
        } else {
            media = null;
        }
        String valuemediaURL = request.getQueryString("mediaURL");
        String mediaURL;
        if (valuemediaURL != null) {
            mediaURL = valuemediaURL;
        } else {
            mediaURL = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valuetitle = request.getQueryString("title");
        String title;
        if (valuetitle != null) {
            title = valuetitle;
        } else {
            title = null;
        }
        String valuestartDate = request.getQueryString("startDate");
        Long startDate;
        if (valuestartDate != null) {
            startDate = Long.parseLong(valuestartDate);
        } else {
            startDate = null;
        }
        String valueendDate = request.getQueryString("endDate");
        Long endDate;
        if (valueendDate != null) {
            endDate = Long.parseLong(valueendDate);
        } else {
            endDate = null;
        }
        String valuetags = request.getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            tags = null;
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuealbumType = request.getQueryString("albumType");
        String albumType;
        if (valuealbumType != null) {
            albumType = valuealbumType;
        } else {
            albumType = null;
        }
        String valuealbumTypeId = request.getQueryString("albumTypeId");
        Long albumTypeId;
        if (valuealbumTypeId != null) {
            albumTypeId = Long.parseLong(valuealbumTypeId);
        } else {
            albumTypeId = null;
        }
        String valuesubType = request.getQueryString("subType");
        String subType;
        if (valuesubType != null) {
            subType = valuesubType;
        } else {
            subType = null;
        }
        String valuepublicRead = request.getQueryString("publicRead");
        Boolean publicRead;
        if (valuepublicRead != null) {
            publicRead = Boolean.valueOf(valuepublicRead);
        } else {
            publicRead = null;
        }
        String valuepublicWrite = request.getQueryString("publicWrite");
        Boolean publicWrite;
        if (valuepublicWrite != null) {
            publicWrite = Boolean.valueOf(valuepublicWrite);
        } else {
            publicWrite = null;
        }
        String valuepublicDelete = request.getQueryString("publicDelete");
        Boolean publicDelete;
        if (valuepublicDelete != null) {
            publicDelete = Boolean.valueOf(valuepublicDelete);
        } else {
            publicDelete = null;
        }
        String valuepublicAdd = request.getQueryString("publicAdd");
        Boolean publicAdd;
        if (valuepublicAdd != null) {
            publicAdd = Boolean.valueOf(valuepublicAdd);
        } else {
            publicAdd = null;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        String valuelocationDescription = request.getQueryString("locationDescription");
        String locationDescription;
        if (valuelocationDescription != null) {
            locationDescription = valuelocationDescription;
        } else {
            locationDescription = null;
        }
        String valuevisibility = request.getQueryString("visibility");
        String visibility;
        if (valuevisibility != null) {
            visibility = valuevisibility;
        } else {
            visibility = null;
        }
        String valuecellPhone = request.getQueryString("cellPhone");
        String cellPhone;
        if (valuecellPhone != null) {
            cellPhone = valuecellPhone;
        } else {
            cellPhone = null;
        }
        String valuestreetAddress = request.getQueryString("streetAddress");
        String streetAddress;
        if (valuestreetAddress != null) {
            streetAddress = valuestreetAddress;
        } else {
            streetAddress = null;
        }
        String valuestreetAddress2 = request.getQueryString("streetAddress2");
        String streetAddress2;
        if (valuestreetAddress2 != null) {
            streetAddress2 = valuestreetAddress2;
        } else {
            streetAddress2 = null;
        }
        String valuecity = request.getQueryString("city");
        String city;
        if (valuecity != null) {
            city = valuecity;
        } else {
            city = null;
        }
        String valuestate = request.getQueryString("state");
        String state;
        if (valuestate != null) {
            state = valuestate;
        } else {
            state = null;
        }
        String valuepostalCode = request.getQueryString("postalCode");
        String postalCode;
        if (valuepostalCode != null) {
            postalCode = valuepostalCode;
        } else {
            postalCode = null;
        }
        String valuefullAddress = request.getQueryString("fullAddress");
        String fullAddress;
        if (valuefullAddress != null) {
            fullAddress = valuefullAddress;
        } else {
            fullAddress = null;
        }
        String valueanonymous = request.getQueryString("anonymous");
        Boolean anonymous;
        if (valueanonymous != null) {
            anonymous = Boolean.valueOf(valueanonymous);
        } else {
            anonymous = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valuecategoryFilterIds = request.getQueryString("categoryFilterIds");
        String categoryFilterIds;
        if (valuecategoryFilterIds != null) {
            categoryFilterIds = valuecategoryFilterIds;
        } else {
            categoryFilterIds = null;
        }
        String valueaudienceIds = request.getQueryString("audienceIds");
        String audienceIds;
        if (valueaudienceIds != null) {
            audienceIds = valueaudienceIds;
        } else {
            audienceIds = null;
        }
        String valueaudienceIdsToAdd = request.getQueryString("audienceIdsToAdd");
        String audienceIdsToAdd;
        if (valueaudienceIdsToAdd != null) {
            audienceIdsToAdd = valueaudienceIdsToAdd;
        } else {
            audienceIdsToAdd = null;
        }
        String valueaudienceIdsToRemove = request.getQueryString("audienceIdsToRemove");
        String audienceIdsToRemove;
        if (valueaudienceIdsToRemove != null) {
            audienceIdsToRemove = valueaudienceIdsToRemove;
        } else {
            audienceIdsToRemove = null;
        }
        String valueincludeAllAppUsersAsMembers = request.getQueryString("includeAllAppUsersAsMembers");
        Boolean includeAllAppUsersAsMembers;
        if (valueincludeAllAppUsersAsMembers != null) {
            includeAllAppUsersAsMembers = Boolean.valueOf(valueincludeAllAppUsersAsMembers);
        } else {
            includeAllAppUsersAsMembers = null;
        }
        String valueincludeAudiencesAsMembers = request.getQueryString("includeAudiencesAsMembers");
        Boolean includeAudiencesAsMembers;
        if (valueincludeAudiencesAsMembers != null) {
            includeAudiencesAsMembers = Boolean.valueOf(valueincludeAudiencesAsMembers);
        } else {
            includeAudiencesAsMembers = null;
        }
        String valueaudienceOperator = request.getQueryString("audienceOperator");
        String audienceOperator;
        if (valueaudienceOperator != null) {
            audienceOperator = valueaudienceOperator;
        } else {
            audienceOperator = null;
        }
        String valuelinkedObjectType = request.getQueryString("linkedObjectType");
        String linkedObjectType;
        if (valuelinkedObjectType != null) {
            linkedObjectType = valuelinkedObjectType;
        } else {
            linkedObjectType = null;
        }
        String valuelinkedObjectId = request.getQueryString("linkedObjectId");
        Long linkedObjectId;
        if (valuelinkedObjectId != null) {
            linkedObjectId = Long.parseLong(valuelinkedObjectId);
        } else {
            linkedObjectId = null;
        }
        String valueindexNow = request.getQueryString("indexNow");
        Boolean indexNow;
        if (valueindexNow != null) {
            indexNow = Boolean.valueOf(valueindexNow);
        } else {
            indexNow = null;
        }
        return imp.updateAlbumCollectionHttp(request, version, albumId, deviceId, accountId, assetsToAdd, assetsToRemove, assetId, media, mediaURL, active, title, startDate, endDate, tags, description, albumType, albumTypeId, subType, publicRead, publicWrite, publicDelete, publicAdd, latitude, longitude, locationDescription, visibility, cellPhone, streetAddress, streetAddress2, city, state, postalCode, fullAddress, anonymous, metaData, categoryIds, categoryFilterIds, audienceIds, audienceIdsToAdd, audienceIdsToRemove, includeAllAppUsersAsMembers, includeAudiencesAsMembers, audienceOperator, linkedObjectType, linkedObjectId, indexNow);
    }

}
