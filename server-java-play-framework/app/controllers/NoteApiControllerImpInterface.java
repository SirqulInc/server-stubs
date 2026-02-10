package controllers;

import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.NoteResponse;
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
public abstract class NoteApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result batchOperationHttp(Http.Request request, BigDecimal version, @NotNull Long notableId, @NotNull String notableType, String deviceId, Long accountId, String batchOperation) throws Exception {
        SirqulResponse obj = batchOperation(request, version, notableId, notableType, deviceId, accountId, batchOperation);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse batchOperation(Http.Request request, BigDecimal version, @NotNull Long notableId, @NotNull String notableType, String deviceId, Long accountId, String batchOperation) throws Exception;

    public Result createNoteHttp(Http.Request request, BigDecimal version, @NotNull String comment, String deviceId, Long accountId, String notableType, Long notableId, String noteType, String assetIds, String tags, String permissionableType, Long permissionableId, String appKey, String locationDescription, Double latitude, Double longitude, String metaData, String receiverAccountIds, Boolean returnFullResponse, Boolean initializeAsset, Boolean assetReturnNulls, Long assetAlbumId, Long assetCollectionId, String assetAddToDefaultAlbum, Boolean assetAddToMediaLibrary, Integer assetVersionCode, String assetVersionName, String assetMetaData, String assetCaption, InputStream assetMedia, String assetMediaUrl, String assetMediaString, String assetMediaStringFileName, String assetMediaStringContentType, InputStream assetAttachedMedia, String assetAttachedMediaUrl, String assetAttachedMediaString, String assetAttachedMediaStringFileName, String assetAttachedMediaStringContentType, String assetLocationDescription, String assetApp, String assetSearchTags, Double assetLatitude, BigDecimal assetLongitude) throws Exception {
        NoteResponse obj = createNote(request, version, comment, deviceId, accountId, notableType, notableId, noteType, assetIds, tags, permissionableType, permissionableId, appKey, locationDescription, latitude, longitude, metaData, receiverAccountIds, returnFullResponse, initializeAsset, assetReturnNulls, assetAlbumId, assetCollectionId, assetAddToDefaultAlbum, assetAddToMediaLibrary, assetVersionCode, assetVersionName, assetMetaData, assetCaption, assetMedia, assetMediaUrl, assetMediaString, assetMediaStringFileName, assetMediaStringContentType, assetAttachedMedia, assetAttachedMediaUrl, assetAttachedMediaString, assetAttachedMediaStringFileName, assetAttachedMediaStringContentType, assetLocationDescription, assetApp, assetSearchTags, assetLatitude, assetLongitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract NoteResponse createNote(Http.Request request, BigDecimal version, @NotNull String comment, String deviceId, Long accountId, String notableType, Long notableId, String noteType, String assetIds, String tags, String permissionableType, Long permissionableId, String appKey, String locationDescription, Double latitude, Double longitude, String metaData, String receiverAccountIds, Boolean returnFullResponse, Boolean initializeAsset, Boolean assetReturnNulls, Long assetAlbumId, Long assetCollectionId, String assetAddToDefaultAlbum, Boolean assetAddToMediaLibrary, Integer assetVersionCode, String assetVersionName, String assetMetaData, String assetCaption, InputStream assetMedia, String assetMediaUrl, String assetMediaString, String assetMediaStringFileName, String assetMediaStringContentType, InputStream assetAttachedMedia, String assetAttachedMediaUrl, String assetAttachedMediaString, String assetAttachedMediaStringFileName, String assetAttachedMediaStringContentType, String assetLocationDescription, String assetApp, String assetSearchTags, Double assetLatitude, BigDecimal assetLongitude) throws Exception;

    public Result deleteNoteHttp(Http.Request request, BigDecimal version, @NotNull Long noteId, String deviceId, Long accountId, Double latitude, Double longitude, String appKey) throws Exception {
        SirqulResponse obj = deleteNote(request, version, noteId, deviceId, accountId, latitude, longitude, appKey);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteNote(Http.Request request, BigDecimal version, @NotNull Long noteId, String deviceId, Long accountId, Double latitude, Double longitude, String appKey) throws Exception;

    public Result getNoteHttp(Http.Request request, BigDecimal version, @NotNull Long noteId, String deviceId, Long accountId, Boolean returnFullResponse) throws Exception {
        SirqulResponse obj = getNote(request, version, noteId, deviceId, accountId, returnFullResponse);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse getNote(Http.Request request, BigDecimal version, @NotNull Long noteId, String deviceId, Long accountId, Boolean returnFullResponse) throws Exception;

    public Result searchNotesHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, String notableType, Long notableId, String noteTypes, String appKey, String keyword, Long flagCountMinimum, Boolean flagsExceedThreshold, Boolean includeInactive, String sortField, Boolean descending, Boolean returnFullResponse, Long updatedSince, Long updatedBefore, Integer start, Integer limit) throws Exception {
        List<NoteResponse> obj = searchNotes(request, version, deviceId, accountId, notableType, notableId, noteTypes, appKey, keyword, flagCountMinimum, flagsExceedThreshold, includeInactive, sortField, descending, returnFullResponse, updatedSince, updatedBefore, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (NoteResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<NoteResponse> searchNotes(Http.Request request, BigDecimal version, String deviceId, Long accountId, String notableType, Long notableId, String noteTypes, String appKey, String keyword, Long flagCountMinimum, Boolean flagsExceedThreshold, Boolean includeInactive, String sortField, Boolean descending, Boolean returnFullResponse, Long updatedSince, Long updatedBefore, Integer start, Integer limit) throws Exception;

    public Result updateNoteHttp(Http.Request request, BigDecimal version, @NotNull Long noteId, String deviceId, Long accountId, String comment, String noteType, String assetIds, String tags, String permissionableType, Long permissionableId, String appKey, String locationDescription, Double latitude, Double longitude, String metaData, Boolean returnFullResponse, Boolean active, Boolean updateAsset, Boolean assetReturnNulls, Long assetAlbumId, Long assetCollectionId, String assetAddToDefaultAlbum, Boolean assetAddToMediaLibrary, Integer assetVersionCode, String assetVersionName, String assetMetaData, String assetCaption, InputStream assetMedia, String assetMediaUrl, String assetMediaString, String assetMediaStringFileName, String assetMediaStringContentType, InputStream assetAttachedMedia, String assetAttachedMediaUrl, String assetAttachedMediaString, String assetAttachedMediaStringFileName, String assetAttachedMediaStringContentType, String assetLocationDescription, String assetApp, String assetSearchTags, Double assetLatitude, Double assetLongitude) throws Exception {
        NoteResponse obj = updateNote(request, version, noteId, deviceId, accountId, comment, noteType, assetIds, tags, permissionableType, permissionableId, appKey, locationDescription, latitude, longitude, metaData, returnFullResponse, active, updateAsset, assetReturnNulls, assetAlbumId, assetCollectionId, assetAddToDefaultAlbum, assetAddToMediaLibrary, assetVersionCode, assetVersionName, assetMetaData, assetCaption, assetMedia, assetMediaUrl, assetMediaString, assetMediaStringFileName, assetMediaStringContentType, assetAttachedMedia, assetAttachedMediaUrl, assetAttachedMediaString, assetAttachedMediaStringFileName, assetAttachedMediaStringContentType, assetLocationDescription, assetApp, assetSearchTags, assetLatitude, assetLongitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract NoteResponse updateNote(Http.Request request, BigDecimal version, @NotNull Long noteId, String deviceId, Long accountId, String comment, String noteType, String assetIds, String tags, String permissionableType, Long permissionableId, String appKey, String locationDescription, Double latitude, Double longitude, String metaData, Boolean returnFullResponse, Boolean active, Boolean updateAsset, Boolean assetReturnNulls, Long assetAlbumId, Long assetCollectionId, String assetAddToDefaultAlbum, Boolean assetAddToMediaLibrary, Integer assetVersionCode, String assetVersionName, String assetMetaData, String assetCaption, InputStream assetMedia, String assetMediaUrl, String assetMediaString, String assetMediaStringFileName, String assetMediaStringContentType, InputStream assetAttachedMedia, String assetAttachedMediaUrl, String assetAttachedMediaString, String assetAttachedMediaStringFileName, String assetAttachedMediaStringContentType, String assetLocationDescription, String assetApp, String assetSearchTags, Double assetLatitude, Double assetLongitude) throws Exception;

}
