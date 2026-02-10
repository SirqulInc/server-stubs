package controllers;

import apimodels.AssetFullResponse;
import apimodels.AssetResponse;
import apimodels.AssetShortResponse;
import java.math.BigDecimal;
import java.io.InputStream;
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
public class AssetApiController extends Controller {
    private final AssetApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private AssetApiController(Config configuration, AssetApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result assetDownload(Http.Request request, BigDecimal version, @Pattern(regexp=".+")String filename) throws Exception {
        return imp.assetDownloadHttp(request, version, filename);
    }

    @ApiAction
    public Result assetMorph(Http.Request request, BigDecimal version) throws Exception {
        String valueofferId = request.getQueryString("offerId");
        Long offerId;
        if (valueofferId != null) {
            offerId = Long.parseLong(valueofferId);
        } else {
            throw new IllegalArgumentException("'offerId' parameter is required");
        }
        String valuecreativeId = request.getQueryString("creativeId");
        Long creativeId;
        if (valuecreativeId != null) {
            creativeId = Long.parseLong(valuecreativeId);
        } else {
            creativeId = null;
        }
        String valueadSize = request.getQueryString("adSize");
        String adSize;
        if (valueadSize != null) {
            adSize = valueadSize;
        } else {
            throw new IllegalArgumentException("'adSize' parameter is required");
        }
        String valuewidth = request.getQueryString("width");
        Integer width;
        if (valuewidth != null) {
            width = Integer.parseInt(valuewidth);
        } else {
            width = null;
        }
        String valueheight = request.getQueryString("height");
        Integer height;
        if (valueheight != null) {
            height = Integer.parseInt(valueheight);
        } else {
            height = null;
        }
        String valuebackgroundSize = request.getQueryString("backgroundSize");
        String backgroundSize;
        if (valuebackgroundSize != null) {
            backgroundSize = valuebackgroundSize;
        } else {
            backgroundSize = null;
        }
        String valuetemplate = request.getQueryString("template");
        String template;
        if (valuetemplate != null) {
            template = valuetemplate;
        } else {
            template = null;
        }
        return imp.assetMorphHttp(request, version, offerId, adSize, creativeId, width, height, backgroundSize, template);
    }

    @ApiAction
    public Result createAsset(Http.Request request, BigDecimal version) throws Exception {
        String valuereturnNulls = request.getQueryString("returnNulls");
        Boolean returnNulls;
        if (valuereturnNulls != null) {
            returnNulls = Boolean.valueOf(valuereturnNulls);
        } else {
            returnNulls = null;
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
            albumId = null;
        }
        String valuecollectionId = request.getQueryString("collectionId");
        Long collectionId;
        if (valuecollectionId != null) {
            collectionId = Long.parseLong(valuecollectionId);
        } else {
            collectionId = null;
        }
        String valueaddToDefaultAlbum = request.getQueryString("addToDefaultAlbum");
        String addToDefaultAlbum;
        if (valueaddToDefaultAlbum != null) {
            addToDefaultAlbum = valueaddToDefaultAlbum;
        } else {
            addToDefaultAlbum = null;
        }
        String valueaddToMediaLibrary = request.getQueryString("addToMediaLibrary");
        Boolean addToMediaLibrary;
        if (valueaddToMediaLibrary != null) {
            addToMediaLibrary = Boolean.valueOf(valueaddToMediaLibrary);
        } else {
            addToMediaLibrary = null;
        }
        String valueversionCode = request.getQueryString("versionCode");
        Integer versionCode;
        if (valueversionCode != null) {
            versionCode = Integer.parseInt(valueversionCode);
        } else {
            versionCode = null;
        }
        String valueversionName = request.getQueryString("versionName");
        String versionName;
        if (valueversionName != null) {
            versionName = valueversionName;
        } else {
            versionName = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        String valuecaption = request.getQueryString("caption");
        String caption;
        if (valuecaption != null) {
            caption = valuecaption;
        } else {
            caption = null;
        }
        String valueassetType = request.getQueryString("assetType");
        String assetType;
        if (valueassetType != null) {
            assetType = valueassetType;
        } else {
            assetType = null;
        }
        String valueapprovalStatus = request.getQueryString("approvalStatus");
        String approvalStatus;
        if (valueapprovalStatus != null) {
            approvalStatus = valueapprovalStatus;
        } else {
            approvalStatus = null;
        }
        String valueassignedAccountId = request.getQueryString("assignedAccountId");
        Long assignedAccountId;
        if (valueassignedAccountId != null) {
            assignedAccountId = Long.parseLong(valueassignedAccountId);
        } else {
            assignedAccountId = null;
        }
        String valuemedia = request.getQueryString("media");
        InputStream media;
        if (valuemedia != null) {
            media = valuemedia;
        } else {
            media = null;
        }
        String valuemediaUrl = request.getQueryString("mediaUrl");
        String mediaUrl;
        if (valuemediaUrl != null) {
            mediaUrl = valuemediaUrl;
        } else {
            mediaUrl = null;
        }
        String valuemediaString = request.getQueryString("mediaString");
        String mediaString;
        if (valuemediaString != null) {
            mediaString = valuemediaString;
        } else {
            mediaString = null;
        }
        String valuemediaStringFileName = request.getQueryString("mediaStringFileName");
        String mediaStringFileName;
        if (valuemediaStringFileName != null) {
            mediaStringFileName = valuemediaStringFileName;
        } else {
            mediaStringFileName = null;
        }
        String valuemediaStringContentType = request.getQueryString("mediaStringContentType");
        String mediaStringContentType;
        if (valuemediaStringContentType != null) {
            mediaStringContentType = valuemediaStringContentType;
        } else {
            mediaStringContentType = null;
        }
        String valuemediaHeight = request.getQueryString("mediaHeight");
        Integer mediaHeight;
        if (valuemediaHeight != null) {
            mediaHeight = Integer.parseInt(valuemediaHeight);
        } else {
            mediaHeight = null;
        }
        String valuemediaWidth = request.getQueryString("mediaWidth");
        Integer mediaWidth;
        if (valuemediaWidth != null) {
            mediaWidth = Integer.parseInt(valuemediaWidth);
        } else {
            mediaWidth = null;
        }
        String valueattachedMedia = request.getQueryString("attachedMedia");
        InputStream attachedMedia;
        if (valueattachedMedia != null) {
            attachedMedia = valueattachedMedia;
        } else {
            attachedMedia = null;
        }
        String valueattachedMediaUrl = request.getQueryString("attachedMediaUrl");
        String attachedMediaUrl;
        if (valueattachedMediaUrl != null) {
            attachedMediaUrl = valueattachedMediaUrl;
        } else {
            attachedMediaUrl = null;
        }
        String valueattachedMediaString = request.getQueryString("attachedMediaString");
        String attachedMediaString;
        if (valueattachedMediaString != null) {
            attachedMediaString = valueattachedMediaString;
        } else {
            attachedMediaString = null;
        }
        String valueattachedMediaStringFileName = request.getQueryString("attachedMediaStringFileName");
        String attachedMediaStringFileName;
        if (valueattachedMediaStringFileName != null) {
            attachedMediaStringFileName = valueattachedMediaStringFileName;
        } else {
            attachedMediaStringFileName = null;
        }
        String valueattachedMediaStringContentType = request.getQueryString("attachedMediaStringContentType");
        String attachedMediaStringContentType;
        if (valueattachedMediaStringContentType != null) {
            attachedMediaStringContentType = valueattachedMediaStringContentType;
        } else {
            attachedMediaStringContentType = null;
        }
        String valueattachedMediaHeight = request.getQueryString("attachedMediaHeight");
        Integer attachedMediaHeight;
        if (valueattachedMediaHeight != null) {
            attachedMediaHeight = Integer.parseInt(valueattachedMediaHeight);
        } else {
            attachedMediaHeight = null;
        }
        String valueattachedMediaWidth = request.getQueryString("attachedMediaWidth");
        Integer attachedMediaWidth;
        if (valueattachedMediaWidth != null) {
            attachedMediaWidth = Integer.parseInt(valueattachedMediaWidth);
        } else {
            attachedMediaWidth = null;
        }
        String valuelocationDescription = request.getQueryString("locationDescription");
        String locationDescription;
        if (valuelocationDescription != null) {
            locationDescription = valuelocationDescription;
        } else {
            locationDescription = null;
        }
        String valueapp = request.getQueryString("app");
        String app;
        if (valueapp != null) {
            app = valueapp;
        } else {
            app = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuesearchTags = request.getQueryString("searchTags");
        String searchTags;
        if (valuesearchTags != null) {
            searchTags = valuesearchTags;
        } else {
            searchTags = null;
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
        return imp.createAssetHttp(request, version, returnNulls, deviceId, accountId, albumId, collectionId, addToDefaultAlbum, addToMediaLibrary, versionCode, versionName, metaData, caption, assetType, approvalStatus, assignedAccountId, media, mediaUrl, mediaString, mediaStringFileName, mediaStringContentType, mediaHeight, mediaWidth, attachedMedia, attachedMediaUrl, attachedMediaString, attachedMediaStringFileName, attachedMediaStringContentType, attachedMediaHeight, attachedMediaWidth, locationDescription, app, appKey, searchTags, latitude, longitude);
    }

    @ApiAction
    public Result deleteAsset(Http.Request request, BigDecimal version) throws Exception {
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
        String valueassetId = request.getQueryString("assetId");
        String assetId;
        if (valueassetId != null) {
            assetId = valueassetId;
        } else {
            throw new IllegalArgumentException("'assetId' parameter is required");
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
        return imp.deleteAssetHttp(request, version, assetId, deviceId, accountId, latitude, longitude);
    }

    @ApiAction
    public Result getAsset(Http.Request request, BigDecimal version) throws Exception {
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
        String valueassetId = request.getQueryString("assetId");
        Long assetId;
        if (valueassetId != null) {
            assetId = Long.parseLong(valueassetId);
        } else {
            throw new IllegalArgumentException("'assetId' parameter is required");
        }
        String valuenoteDescending = request.getQueryString("noteDescending");
        Boolean noteDescending;
        if (valuenoteDescending != null) {
            noteDescending = Boolean.valueOf(valuenoteDescending);
        } else {
            noteDescending = false;
        }
        return imp.getAssetHttp(request, version, assetId, deviceId, accountId, noteDescending);
    }

    @ApiAction
    public Result removeAsset(Http.Request request, BigDecimal version) throws Exception {
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
            albumId = null;
        }
        String valuecollectionId = request.getQueryString("collectionId");
        Long collectionId;
        if (valuecollectionId != null) {
            collectionId = Long.parseLong(valuecollectionId);
        } else {
            collectionId = null;
        }
        String valueassetId = request.getQueryString("assetId");
        String assetId;
        if (valueassetId != null) {
            assetId = valueassetId;
        } else {
            throw new IllegalArgumentException("'assetId' parameter is required");
        }
        String valueremoveFromDefaultAlbums = request.getQueryString("removeFromDefaultAlbums");
        Boolean removeFromDefaultAlbums;
        if (valueremoveFromDefaultAlbums != null) {
            removeFromDefaultAlbums = Boolean.valueOf(valueremoveFromDefaultAlbums);
        } else {
            removeFromDefaultAlbums = null;
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
        return imp.removeAssetHttp(request, version, assetId, deviceId, accountId, albumId, collectionId, removeFromDefaultAlbums, latitude, longitude);
    }

    @ApiAction
    public Result searchAssets(Http.Request request, BigDecimal version) throws Exception {
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
        String valuealbumIds = request.getQueryString("albumIds");
        String albumIds;
        if (valuealbumIds != null) {
            albumIds = valuealbumIds;
        } else {
            albumIds = null;
        }
        String valueassetIds = request.getQueryString("assetIds");
        String assetIds;
        if (valueassetIds != null) {
            assetIds = valueassetIds;
        } else {
            assetIds = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuemediaType = request.getQueryString("mediaType");
        String mediaType;
        if (valuemediaType != null) {
            mediaType = valuemediaType;
        } else {
            mediaType = null;
        }
        String valuemimeType = request.getQueryString("mimeType");
        String mimeType;
        if (valuemimeType != null) {
            mimeType = valuemimeType;
        } else {
            mimeType = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valueversionCode = request.getQueryString("versionCode");
        Integer versionCode;
        if (valueversionCode != null) {
            versionCode = Integer.parseInt(valueversionCode);
        } else {
            versionCode = null;
        }
        String valueversionName = request.getQueryString("versionName");
        String versionName;
        if (valueversionName != null) {
            versionName = valueversionName;
        } else {
            versionName = null;
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
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = null;
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = null;
        }
        String valuesearchMediaLibrary = request.getQueryString("searchMediaLibrary");
        Boolean searchMediaLibrary;
        if (valuesearchMediaLibrary != null) {
            searchMediaLibrary = Boolean.valueOf(valuesearchMediaLibrary);
        } else {
            searchMediaLibrary = null;
        }
        String valuefilterByBillable = request.getQueryString("filterByBillable");
        Boolean filterByBillable;
        if (valuefilterByBillable != null) {
            filterByBillable = Boolean.valueOf(valuefilterByBillable);
        } else {
            filterByBillable = null;
        }
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            activeOnly = null;
        }
        String valuereturnApp = request.getQueryString("returnApp");
        Boolean returnApp;
        if (valuereturnApp != null) {
            returnApp = Boolean.valueOf(valuereturnApp);
        } else {
            returnApp = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valuesearchMode = request.getQueryString("searchMode");
        String searchMode;
        if (valuesearchMode != null) {
            searchMode = valuesearchMode;
        } else {
            searchMode = null;
        }
        String valueassetType = request.getQueryString("assetType");
        String assetType;
        if (valueassetType != null) {
            assetType = valueassetType;
        } else {
            assetType = null;
        }
        String valueapprovalStatus = request.getQueryString("approvalStatus");
        String approvalStatus;
        if (valueapprovalStatus != null) {
            approvalStatus = valueapprovalStatus;
        } else {
            approvalStatus = null;
        }
        String valueassignedAccountId = request.getQueryString("assignedAccountId");
        Long assignedAccountId;
        if (valueassignedAccountId != null) {
            assignedAccountId = Long.parseLong(valueassignedAccountId);
        } else {
            assignedAccountId = null;
        }
        return imp.searchAssetsHttp(request, version, deviceId, accountId, albumIds, assetIds, appKey, mediaType, mimeType, keyword, versionCode, versionName, updatedSince, updatedBefore, sortField, descending, searchMediaLibrary, filterByBillable, activeOnly, returnApp, start, limit, searchMode, assetType, approvalStatus, assignedAccountId);
    }

    @ApiAction
    public Result updateAsset(Http.Request request, BigDecimal version) throws Exception {
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
        String valueassetId = request.getQueryString("assetId");
        Long assetId;
        if (valueassetId != null) {
            assetId = Long.parseLong(valueassetId);
        } else {
            throw new IllegalArgumentException("'assetId' parameter is required");
        }
        String valuealbumId = request.getQueryString("albumId");
        Long albumId;
        if (valuealbumId != null) {
            albumId = Long.parseLong(valuealbumId);
        } else {
            albumId = null;
        }
        String valueattachedAssetId = request.getQueryString("attachedAssetId");
        Long attachedAssetId;
        if (valueattachedAssetId != null) {
            attachedAssetId = Long.parseLong(valueattachedAssetId);
        } else {
            attachedAssetId = null;
        }
        String valueversionCode = request.getQueryString("versionCode");
        Integer versionCode;
        if (valueversionCode != null) {
            versionCode = Integer.parseInt(valueversionCode);
        } else {
            versionCode = null;
        }
        String valueversionName = request.getQueryString("versionName");
        String versionName;
        if (valueversionName != null) {
            versionName = valueversionName;
        } else {
            versionName = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        String valuecaption = request.getQueryString("caption");
        String caption;
        if (valuecaption != null) {
            caption = valuecaption;
        } else {
            caption = null;
        }
        String valueassetType = request.getQueryString("assetType");
        String assetType;
        if (valueassetType != null) {
            assetType = valueassetType;
        } else {
            assetType = null;
        }
        String valueapprovalStatus = request.getQueryString("approvalStatus");
        String approvalStatus;
        if (valueapprovalStatus != null) {
            approvalStatus = valueapprovalStatus;
        } else {
            approvalStatus = null;
        }
        String valueassignedAccountId = request.getQueryString("assignedAccountId");
        Long assignedAccountId;
        if (valueassignedAccountId != null) {
            assignedAccountId = Long.parseLong(valueassignedAccountId);
        } else {
            assignedAccountId = null;
        }
        String valuemedia = request.getQueryString("media");
        InputStream media;
        if (valuemedia != null) {
            media = valuemedia;
        } else {
            media = null;
        }
        String valuemediaUrl = request.getQueryString("mediaUrl");
        String mediaUrl;
        if (valuemediaUrl != null) {
            mediaUrl = valuemediaUrl;
        } else {
            mediaUrl = null;
        }
        String valuemediaString = request.getQueryString("mediaString");
        String mediaString;
        if (valuemediaString != null) {
            mediaString = valuemediaString;
        } else {
            mediaString = null;
        }
        String valuemediaStringFileName = request.getQueryString("mediaStringFileName");
        String mediaStringFileName;
        if (valuemediaStringFileName != null) {
            mediaStringFileName = valuemediaStringFileName;
        } else {
            mediaStringFileName = null;
        }
        String valuemediaStringContentType = request.getQueryString("mediaStringContentType");
        String mediaStringContentType;
        if (valuemediaStringContentType != null) {
            mediaStringContentType = valuemediaStringContentType;
        } else {
            mediaStringContentType = null;
        }
        String valuemediaHeight = request.getQueryString("mediaHeight");
        Integer mediaHeight;
        if (valuemediaHeight != null) {
            mediaHeight = Integer.parseInt(valuemediaHeight);
        } else {
            mediaHeight = null;
        }
        String valuemediaWidth = request.getQueryString("mediaWidth");
        Integer mediaWidth;
        if (valuemediaWidth != null) {
            mediaWidth = Integer.parseInt(valuemediaWidth);
        } else {
            mediaWidth = null;
        }
        String valueattachedMedia = request.getQueryString("attachedMedia");
        InputStream attachedMedia;
        if (valueattachedMedia != null) {
            attachedMedia = valueattachedMedia;
        } else {
            attachedMedia = null;
        }
        String valueattachedMediaUrl = request.getQueryString("attachedMediaUrl");
        String attachedMediaUrl;
        if (valueattachedMediaUrl != null) {
            attachedMediaUrl = valueattachedMediaUrl;
        } else {
            attachedMediaUrl = null;
        }
        String valueattachedMediaString = request.getQueryString("attachedMediaString");
        String attachedMediaString;
        if (valueattachedMediaString != null) {
            attachedMediaString = valueattachedMediaString;
        } else {
            attachedMediaString = null;
        }
        String valueattachedMediaStringFileName = request.getQueryString("attachedMediaStringFileName");
        String attachedMediaStringFileName;
        if (valueattachedMediaStringFileName != null) {
            attachedMediaStringFileName = valueattachedMediaStringFileName;
        } else {
            attachedMediaStringFileName = null;
        }
        String valueattachedMediaStringContentType = request.getQueryString("attachedMediaStringContentType");
        String attachedMediaStringContentType;
        if (valueattachedMediaStringContentType != null) {
            attachedMediaStringContentType = valueattachedMediaStringContentType;
        } else {
            attachedMediaStringContentType = null;
        }
        String valueattachedMediaHeight = request.getQueryString("attachedMediaHeight");
        Integer attachedMediaHeight;
        if (valueattachedMediaHeight != null) {
            attachedMediaHeight = Integer.parseInt(valueattachedMediaHeight);
        } else {
            attachedMediaHeight = null;
        }
        String valueattachedMediaWidth = request.getQueryString("attachedMediaWidth");
        Integer attachedMediaWidth;
        if (valueattachedMediaWidth != null) {
            attachedMediaWidth = Integer.parseInt(valueattachedMediaWidth);
        } else {
            attachedMediaWidth = null;
        }
        String valuelocationDescription = request.getQueryString("locationDescription");
        String locationDescription;
        if (valuelocationDescription != null) {
            locationDescription = valuelocationDescription;
        } else {
            locationDescription = null;
        }
        String valuesearchTags = request.getQueryString("searchTags");
        String searchTags;
        if (valuesearchTags != null) {
            searchTags = valuesearchTags;
        } else {
            searchTags = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
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
        return imp.updateAssetHttp(request, version, assetId, deviceId, accountId, albumId, attachedAssetId, versionCode, versionName, metaData, caption, assetType, approvalStatus, assignedAccountId, media, mediaUrl, mediaString, mediaStringFileName, mediaStringContentType, mediaHeight, mediaWidth, attachedMedia, attachedMediaUrl, attachedMediaString, attachedMediaStringFileName, attachedMediaStringContentType, attachedMediaHeight, attachedMediaWidth, locationDescription, searchTags, appKey, latitude, longitude);
    }

}
