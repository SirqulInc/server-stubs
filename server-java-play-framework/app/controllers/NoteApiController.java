package controllers;

import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.NoteResponse;
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
public class NoteApiController extends Controller {
    private final NoteApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private NoteApiController(Config configuration, NoteApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result batchOperation(Http.Request request, BigDecimal version) throws Exception {
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
        String valuenotableId = request.getQueryString("notableId");
        Long notableId;
        if (valuenotableId != null) {
            notableId = Long.parseLong(valuenotableId);
        } else {
            throw new IllegalArgumentException("'notableId' parameter is required");
        }
        String valuenotableType = request.getQueryString("notableType");
        String notableType;
        if (valuenotableType != null) {
            notableType = valuenotableType;
        } else {
            throw new IllegalArgumentException("'notableType' parameter is required");
        }
        String valuebatchOperation = request.getQueryString("batchOperation");
        String batchOperation;
        if (valuebatchOperation != null) {
            batchOperation = valuebatchOperation;
        } else {
            batchOperation = null;
        }
        return imp.batchOperationHttp(request, version, notableId, notableType, deviceId, accountId, batchOperation);
    }

    @ApiAction
    public Result createNote(Http.Request request, BigDecimal version) throws Exception {
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
        String valuenotableType = request.getQueryString("notableType");
        String notableType;
        if (valuenotableType != null) {
            notableType = valuenotableType;
        } else {
            notableType = null;
        }
        String valuenotableId = request.getQueryString("notableId");
        Long notableId;
        if (valuenotableId != null) {
            notableId = Long.parseLong(valuenotableId);
        } else {
            notableId = null;
        }
        String valuecomment = request.getQueryString("comment");
        String comment;
        if (valuecomment != null) {
            comment = valuecomment;
        } else {
            throw new IllegalArgumentException("'comment' parameter is required");
        }
        String valuenoteType = request.getQueryString("noteType");
        String noteType;
        if (valuenoteType != null) {
            noteType = valuenoteType;
        } else {
            noteType = null;
        }
        String valueassetIds = request.getQueryString("assetIds");
        String assetIds;
        if (valueassetIds != null) {
            assetIds = valueassetIds;
        } else {
            assetIds = null;
        }
        String valuetags = request.getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            tags = null;
        }
        String valuepermissionableType = request.getQueryString("permissionableType");
        String permissionableType;
        if (valuepermissionableType != null) {
            permissionableType = valuepermissionableType;
        } else {
            permissionableType = null;
        }
        String valuepermissionableId = request.getQueryString("permissionableId");
        Long permissionableId;
        if (valuepermissionableId != null) {
            permissionableId = Long.parseLong(valuepermissionableId);
        } else {
            permissionableId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuelocationDescription = request.getQueryString("locationDescription");
        String locationDescription;
        if (valuelocationDescription != null) {
            locationDescription = valuelocationDescription;
        } else {
            locationDescription = null;
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
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        String valuereceiverAccountIds = request.getQueryString("receiverAccountIds");
        String receiverAccountIds;
        if (valuereceiverAccountIds != null) {
            receiverAccountIds = valuereceiverAccountIds;
        } else {
            receiverAccountIds = null;
        }
        String valuereturnFullResponse = request.getQueryString("returnFullResponse");
        Boolean returnFullResponse;
        if (valuereturnFullResponse != null) {
            returnFullResponse = Boolean.valueOf(valuereturnFullResponse);
        } else {
            returnFullResponse = null;
        }
        String valueinitializeAsset = request.getQueryString("initializeAsset");
        Boolean initializeAsset;
        if (valueinitializeAsset != null) {
            initializeAsset = Boolean.valueOf(valueinitializeAsset);
        } else {
            initializeAsset = null;
        }
        String valueassetReturnNulls = request.getQueryString("assetReturnNulls");
        Boolean assetReturnNulls;
        if (valueassetReturnNulls != null) {
            assetReturnNulls = Boolean.valueOf(valueassetReturnNulls);
        } else {
            assetReturnNulls = null;
        }
        String valueassetAlbumId = request.getQueryString("assetAlbumId");
        Long assetAlbumId;
        if (valueassetAlbumId != null) {
            assetAlbumId = Long.parseLong(valueassetAlbumId);
        } else {
            assetAlbumId = null;
        }
        String valueassetCollectionId = request.getQueryString("assetCollectionId");
        Long assetCollectionId;
        if (valueassetCollectionId != null) {
            assetCollectionId = Long.parseLong(valueassetCollectionId);
        } else {
            assetCollectionId = null;
        }
        String valueassetAddToDefaultAlbum = request.getQueryString("assetAddToDefaultAlbum");
        String assetAddToDefaultAlbum;
        if (valueassetAddToDefaultAlbum != null) {
            assetAddToDefaultAlbum = valueassetAddToDefaultAlbum;
        } else {
            assetAddToDefaultAlbum = null;
        }
        String valueassetAddToMediaLibrary = request.getQueryString("assetAddToMediaLibrary");
        Boolean assetAddToMediaLibrary;
        if (valueassetAddToMediaLibrary != null) {
            assetAddToMediaLibrary = Boolean.valueOf(valueassetAddToMediaLibrary);
        } else {
            assetAddToMediaLibrary = null;
        }
        String valueassetVersionCode = request.getQueryString("assetVersionCode");
        Integer assetVersionCode;
        if (valueassetVersionCode != null) {
            assetVersionCode = Integer.parseInt(valueassetVersionCode);
        } else {
            assetVersionCode = null;
        }
        String valueassetVersionName = request.getQueryString("assetVersionName");
        String assetVersionName;
        if (valueassetVersionName != null) {
            assetVersionName = valueassetVersionName;
        } else {
            assetVersionName = null;
        }
        String valueassetMetaData = request.getQueryString("assetMetaData");
        String assetMetaData;
        if (valueassetMetaData != null) {
            assetMetaData = valueassetMetaData;
        } else {
            assetMetaData = null;
        }
        String valueassetCaption = request.getQueryString("assetCaption");
        String assetCaption;
        if (valueassetCaption != null) {
            assetCaption = valueassetCaption;
        } else {
            assetCaption = null;
        }
        String valueassetMedia = request.getQueryString("assetMedia");
        InputStream assetMedia;
        if (valueassetMedia != null) {
            assetMedia = valueassetMedia;
        } else {
            assetMedia = null;
        }
        String valueassetMediaUrl = request.getQueryString("assetMediaUrl");
        String assetMediaUrl;
        if (valueassetMediaUrl != null) {
            assetMediaUrl = valueassetMediaUrl;
        } else {
            assetMediaUrl = null;
        }
        String valueassetMediaString = request.getQueryString("assetMediaString");
        String assetMediaString;
        if (valueassetMediaString != null) {
            assetMediaString = valueassetMediaString;
        } else {
            assetMediaString = null;
        }
        String valueassetMediaStringFileName = request.getQueryString("assetMediaStringFileName");
        String assetMediaStringFileName;
        if (valueassetMediaStringFileName != null) {
            assetMediaStringFileName = valueassetMediaStringFileName;
        } else {
            assetMediaStringFileName = null;
        }
        String valueassetMediaStringContentType = request.getQueryString("assetMediaStringContentType");
        String assetMediaStringContentType;
        if (valueassetMediaStringContentType != null) {
            assetMediaStringContentType = valueassetMediaStringContentType;
        } else {
            assetMediaStringContentType = null;
        }
        String valueassetAttachedMedia = request.getQueryString("assetAttachedMedia");
        InputStream assetAttachedMedia;
        if (valueassetAttachedMedia != null) {
            assetAttachedMedia = valueassetAttachedMedia;
        } else {
            assetAttachedMedia = null;
        }
        String valueassetAttachedMediaUrl = request.getQueryString("assetAttachedMediaUrl");
        String assetAttachedMediaUrl;
        if (valueassetAttachedMediaUrl != null) {
            assetAttachedMediaUrl = valueassetAttachedMediaUrl;
        } else {
            assetAttachedMediaUrl = null;
        }
        String valueassetAttachedMediaString = request.getQueryString("assetAttachedMediaString");
        String assetAttachedMediaString;
        if (valueassetAttachedMediaString != null) {
            assetAttachedMediaString = valueassetAttachedMediaString;
        } else {
            assetAttachedMediaString = null;
        }
        String valueassetAttachedMediaStringFileName = request.getQueryString("assetAttachedMediaStringFileName");
        String assetAttachedMediaStringFileName;
        if (valueassetAttachedMediaStringFileName != null) {
            assetAttachedMediaStringFileName = valueassetAttachedMediaStringFileName;
        } else {
            assetAttachedMediaStringFileName = null;
        }
        String valueassetAttachedMediaStringContentType = request.getQueryString("assetAttachedMediaStringContentType");
        String assetAttachedMediaStringContentType;
        if (valueassetAttachedMediaStringContentType != null) {
            assetAttachedMediaStringContentType = valueassetAttachedMediaStringContentType;
        } else {
            assetAttachedMediaStringContentType = null;
        }
        String valueassetLocationDescription = request.getQueryString("assetLocationDescription");
        String assetLocationDescription;
        if (valueassetLocationDescription != null) {
            assetLocationDescription = valueassetLocationDescription;
        } else {
            assetLocationDescription = null;
        }
        String valueassetApp = request.getQueryString("assetApp");
        String assetApp;
        if (valueassetApp != null) {
            assetApp = valueassetApp;
        } else {
            assetApp = null;
        }
        String valueassetSearchTags = request.getQueryString("assetSearchTags");
        String assetSearchTags;
        if (valueassetSearchTags != null) {
            assetSearchTags = valueassetSearchTags;
        } else {
            assetSearchTags = null;
        }
        String valueassetLatitude = request.getQueryString("assetLatitude");
        Double assetLatitude;
        if (valueassetLatitude != null) {
            assetLatitude = Double.parseDouble(valueassetLatitude);
        } else {
            assetLatitude = null;
        }
        String valueassetLongitude = request.getQueryString("assetLongitude");
        BigDecimal assetLongitude;
        if (valueassetLongitude != null) {
            assetLongitude = new BigDecimal(valueassetLongitude);
        } else {
            assetLongitude = null;
        }
        return imp.createNoteHttp(request, version, comment, deviceId, accountId, notableType, notableId, noteType, assetIds, tags, permissionableType, permissionableId, appKey, locationDescription, latitude, longitude, metaData, receiverAccountIds, returnFullResponse, initializeAsset, assetReturnNulls, assetAlbumId, assetCollectionId, assetAddToDefaultAlbum, assetAddToMediaLibrary, assetVersionCode, assetVersionName, assetMetaData, assetCaption, assetMedia, assetMediaUrl, assetMediaString, assetMediaStringFileName, assetMediaStringContentType, assetAttachedMedia, assetAttachedMediaUrl, assetAttachedMediaString, assetAttachedMediaStringFileName, assetAttachedMediaStringContentType, assetLocationDescription, assetApp, assetSearchTags, assetLatitude, assetLongitude);
    }

    @ApiAction
    public Result deleteNote(Http.Request request, BigDecimal version) throws Exception {
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
        String valuenoteId = request.getQueryString("noteId");
        Long noteId;
        if (valuenoteId != null) {
            noteId = Long.parseLong(valuenoteId);
        } else {
            throw new IllegalArgumentException("'noteId' parameter is required");
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
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        return imp.deleteNoteHttp(request, version, noteId, deviceId, accountId, latitude, longitude, appKey);
    }

    @ApiAction
    public Result getNote(Http.Request request, BigDecimal version) throws Exception {
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
        String valuereturnFullResponse = request.getQueryString("returnFullResponse");
        Boolean returnFullResponse;
        if (valuereturnFullResponse != null) {
            returnFullResponse = Boolean.valueOf(valuereturnFullResponse);
        } else {
            returnFullResponse = null;
        }
        String valuenoteId = request.getQueryString("noteId");
        Long noteId;
        if (valuenoteId != null) {
            noteId = Long.parseLong(valuenoteId);
        } else {
            throw new IllegalArgumentException("'noteId' parameter is required");
        }
        return imp.getNoteHttp(request, version, noteId, deviceId, accountId, returnFullResponse);
    }

    @ApiAction
    public Result searchNotes(Http.Request request, BigDecimal version) throws Exception {
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
        String valuenotableType = request.getQueryString("notableType");
        String notableType;
        if (valuenotableType != null) {
            notableType = valuenotableType;
        } else {
            notableType = null;
        }
        String valuenotableId = request.getQueryString("notableId");
        Long notableId;
        if (valuenotableId != null) {
            notableId = Long.parseLong(valuenotableId);
        } else {
            notableId = null;
        }
        String valuenoteTypes = request.getQueryString("noteTypes");
        String noteTypes;
        if (valuenoteTypes != null) {
            noteTypes = valuenoteTypes;
        } else {
            noteTypes = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valueflagCountMinimum = request.getQueryString("flagCountMinimum");
        Long flagCountMinimum;
        if (valueflagCountMinimum != null) {
            flagCountMinimum = Long.parseLong(valueflagCountMinimum);
        } else {
            flagCountMinimum = null;
        }
        String valueflagsExceedThreshold = request.getQueryString("flagsExceedThreshold");
        Boolean flagsExceedThreshold;
        if (valueflagsExceedThreshold != null) {
            flagsExceedThreshold = Boolean.valueOf(valueflagsExceedThreshold);
        } else {
            flagsExceedThreshold = null;
        }
        String valueincludeInactive = request.getQueryString("includeInactive");
        Boolean includeInactive;
        if (valueincludeInactive != null) {
            includeInactive = Boolean.valueOf(valueincludeInactive);
        } else {
            includeInactive = null;
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
        String valuereturnFullResponse = request.getQueryString("returnFullResponse");
        Boolean returnFullResponse;
        if (valuereturnFullResponse != null) {
            returnFullResponse = Boolean.valueOf(valuereturnFullResponse);
        } else {
            returnFullResponse = null;
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
        return imp.searchNotesHttp(request, version, deviceId, accountId, notableType, notableId, noteTypes, appKey, keyword, flagCountMinimum, flagsExceedThreshold, includeInactive, sortField, descending, returnFullResponse, updatedSince, updatedBefore, start, limit);
    }

    @ApiAction
    public Result updateNote(Http.Request request, BigDecimal version) throws Exception {
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
        String valuenoteId = request.getQueryString("noteId");
        Long noteId;
        if (valuenoteId != null) {
            noteId = Long.parseLong(valuenoteId);
        } else {
            throw new IllegalArgumentException("'noteId' parameter is required");
        }
        String valuecomment = request.getQueryString("comment");
        String comment;
        if (valuecomment != null) {
            comment = valuecomment;
        } else {
            comment = null;
        }
        String valuenoteType = request.getQueryString("noteType");
        String noteType;
        if (valuenoteType != null) {
            noteType = valuenoteType;
        } else {
            noteType = null;
        }
        String valueassetIds = request.getQueryString("assetIds");
        String assetIds;
        if (valueassetIds != null) {
            assetIds = valueassetIds;
        } else {
            assetIds = null;
        }
        String valuetags = request.getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            tags = null;
        }
        String valuepermissionableType = request.getQueryString("permissionableType");
        String permissionableType;
        if (valuepermissionableType != null) {
            permissionableType = valuepermissionableType;
        } else {
            permissionableType = null;
        }
        String valuepermissionableId = request.getQueryString("permissionableId");
        Long permissionableId;
        if (valuepermissionableId != null) {
            permissionableId = Long.parseLong(valuepermissionableId);
        } else {
            permissionableId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuelocationDescription = request.getQueryString("locationDescription");
        String locationDescription;
        if (valuelocationDescription != null) {
            locationDescription = valuelocationDescription;
        } else {
            locationDescription = null;
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
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        String valuereturnFullResponse = request.getQueryString("returnFullResponse");
        Boolean returnFullResponse;
        if (valuereturnFullResponse != null) {
            returnFullResponse = Boolean.valueOf(valuereturnFullResponse);
        } else {
            returnFullResponse = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valueupdateAsset = request.getQueryString("updateAsset");
        Boolean updateAsset;
        if (valueupdateAsset != null) {
            updateAsset = Boolean.valueOf(valueupdateAsset);
        } else {
            updateAsset = null;
        }
        String valueassetReturnNulls = request.getQueryString("assetReturnNulls");
        Boolean assetReturnNulls;
        if (valueassetReturnNulls != null) {
            assetReturnNulls = Boolean.valueOf(valueassetReturnNulls);
        } else {
            assetReturnNulls = null;
        }
        String valueassetAlbumId = request.getQueryString("assetAlbumId");
        Long assetAlbumId;
        if (valueassetAlbumId != null) {
            assetAlbumId = Long.parseLong(valueassetAlbumId);
        } else {
            assetAlbumId = null;
        }
        String valueassetCollectionId = request.getQueryString("assetCollectionId");
        Long assetCollectionId;
        if (valueassetCollectionId != null) {
            assetCollectionId = Long.parseLong(valueassetCollectionId);
        } else {
            assetCollectionId = null;
        }
        String valueassetAddToDefaultAlbum = request.getQueryString("assetAddToDefaultAlbum");
        String assetAddToDefaultAlbum;
        if (valueassetAddToDefaultAlbum != null) {
            assetAddToDefaultAlbum = valueassetAddToDefaultAlbum;
        } else {
            assetAddToDefaultAlbum = null;
        }
        String valueassetAddToMediaLibrary = request.getQueryString("assetAddToMediaLibrary");
        Boolean assetAddToMediaLibrary;
        if (valueassetAddToMediaLibrary != null) {
            assetAddToMediaLibrary = Boolean.valueOf(valueassetAddToMediaLibrary);
        } else {
            assetAddToMediaLibrary = null;
        }
        String valueassetVersionCode = request.getQueryString("assetVersionCode");
        Integer assetVersionCode;
        if (valueassetVersionCode != null) {
            assetVersionCode = Integer.parseInt(valueassetVersionCode);
        } else {
            assetVersionCode = null;
        }
        String valueassetVersionName = request.getQueryString("assetVersionName");
        String assetVersionName;
        if (valueassetVersionName != null) {
            assetVersionName = valueassetVersionName;
        } else {
            assetVersionName = null;
        }
        String valueassetMetaData = request.getQueryString("assetMetaData");
        String assetMetaData;
        if (valueassetMetaData != null) {
            assetMetaData = valueassetMetaData;
        } else {
            assetMetaData = null;
        }
        String valueassetCaption = request.getQueryString("assetCaption");
        String assetCaption;
        if (valueassetCaption != null) {
            assetCaption = valueassetCaption;
        } else {
            assetCaption = null;
        }
        String valueassetMedia = request.getQueryString("assetMedia");
        InputStream assetMedia;
        if (valueassetMedia != null) {
            assetMedia = valueassetMedia;
        } else {
            assetMedia = null;
        }
        String valueassetMediaUrl = request.getQueryString("assetMediaUrl");
        String assetMediaUrl;
        if (valueassetMediaUrl != null) {
            assetMediaUrl = valueassetMediaUrl;
        } else {
            assetMediaUrl = null;
        }
        String valueassetMediaString = request.getQueryString("assetMediaString");
        String assetMediaString;
        if (valueassetMediaString != null) {
            assetMediaString = valueassetMediaString;
        } else {
            assetMediaString = null;
        }
        String valueassetMediaStringFileName = request.getQueryString("assetMediaStringFileName");
        String assetMediaStringFileName;
        if (valueassetMediaStringFileName != null) {
            assetMediaStringFileName = valueassetMediaStringFileName;
        } else {
            assetMediaStringFileName = null;
        }
        String valueassetMediaStringContentType = request.getQueryString("assetMediaStringContentType");
        String assetMediaStringContentType;
        if (valueassetMediaStringContentType != null) {
            assetMediaStringContentType = valueassetMediaStringContentType;
        } else {
            assetMediaStringContentType = null;
        }
        String valueassetAttachedMedia = request.getQueryString("assetAttachedMedia");
        InputStream assetAttachedMedia;
        if (valueassetAttachedMedia != null) {
            assetAttachedMedia = valueassetAttachedMedia;
        } else {
            assetAttachedMedia = null;
        }
        String valueassetAttachedMediaUrl = request.getQueryString("assetAttachedMediaUrl");
        String assetAttachedMediaUrl;
        if (valueassetAttachedMediaUrl != null) {
            assetAttachedMediaUrl = valueassetAttachedMediaUrl;
        } else {
            assetAttachedMediaUrl = null;
        }
        String valueassetAttachedMediaString = request.getQueryString("assetAttachedMediaString");
        String assetAttachedMediaString;
        if (valueassetAttachedMediaString != null) {
            assetAttachedMediaString = valueassetAttachedMediaString;
        } else {
            assetAttachedMediaString = null;
        }
        String valueassetAttachedMediaStringFileName = request.getQueryString("assetAttachedMediaStringFileName");
        String assetAttachedMediaStringFileName;
        if (valueassetAttachedMediaStringFileName != null) {
            assetAttachedMediaStringFileName = valueassetAttachedMediaStringFileName;
        } else {
            assetAttachedMediaStringFileName = null;
        }
        String valueassetAttachedMediaStringContentType = request.getQueryString("assetAttachedMediaStringContentType");
        String assetAttachedMediaStringContentType;
        if (valueassetAttachedMediaStringContentType != null) {
            assetAttachedMediaStringContentType = valueassetAttachedMediaStringContentType;
        } else {
            assetAttachedMediaStringContentType = null;
        }
        String valueassetLocationDescription = request.getQueryString("assetLocationDescription");
        String assetLocationDescription;
        if (valueassetLocationDescription != null) {
            assetLocationDescription = valueassetLocationDescription;
        } else {
            assetLocationDescription = null;
        }
        String valueassetApp = request.getQueryString("assetApp");
        String assetApp;
        if (valueassetApp != null) {
            assetApp = valueassetApp;
        } else {
            assetApp = null;
        }
        String valueassetSearchTags = request.getQueryString("assetSearchTags");
        String assetSearchTags;
        if (valueassetSearchTags != null) {
            assetSearchTags = valueassetSearchTags;
        } else {
            assetSearchTags = null;
        }
        String valueassetLatitude = request.getQueryString("assetLatitude");
        Double assetLatitude;
        if (valueassetLatitude != null) {
            assetLatitude = Double.parseDouble(valueassetLatitude);
        } else {
            assetLatitude = null;
        }
        String valueassetLongitude = request.getQueryString("assetLongitude");
        Double assetLongitude;
        if (valueassetLongitude != null) {
            assetLongitude = Double.parseDouble(valueassetLongitude);
        } else {
            assetLongitude = null;
        }
        return imp.updateNoteHttp(request, version, noteId, deviceId, accountId, comment, noteType, assetIds, tags, permissionableType, permissionableId, appKey, locationDescription, latitude, longitude, metaData, returnFullResponse, active, updateAsset, assetReturnNulls, assetAlbumId, assetCollectionId, assetAddToDefaultAlbum, assetAddToMediaLibrary, assetVersionCode, assetVersionName, assetMetaData, assetCaption, assetMedia, assetMediaUrl, assetMediaString, assetMediaStringFileName, assetMediaStringContentType, assetAttachedMedia, assetAttachedMediaUrl, assetAttachedMediaString, assetAttachedMediaStringFileName, assetAttachedMediaStringContentType, assetLocationDescription, assetApp, assetSearchTags, assetLatitude, assetLongitude);
    }

}
