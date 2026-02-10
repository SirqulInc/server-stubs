package controllers;

import apimodels.AssetFullResponse;
import apimodels.AssetResponse;
import apimodels.AssetShortResponse;
import java.math.BigDecimal;
import java.io.InputStream;
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
public abstract class AssetApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result assetDownloadHttp(Http.Request request, BigDecimal version,  @Pattern(regexp=".+")String filename) throws Exception {
        SirqulResponse obj = assetDownload(request, version, filename);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse assetDownload(Http.Request request, BigDecimal version,  @Pattern(regexp=".+")String filename) throws Exception;

    public Result assetMorphHttp(Http.Request request, BigDecimal version, @NotNull Long offerId, @NotNull String adSize, Long creativeId, Integer width, Integer height, String backgroundSize, String template) throws Exception {
        AssetShortResponse obj = assetMorph(request, version, offerId, adSize, creativeId, width, height, backgroundSize, template);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AssetShortResponse assetMorph(Http.Request request, BigDecimal version, @NotNull Long offerId, @NotNull String adSize, Long creativeId, Integer width, Integer height, String backgroundSize, String template) throws Exception;

    public Result createAssetHttp(Http.Request request, BigDecimal version, Boolean returnNulls, String deviceId, Long accountId, Long albumId, Long collectionId, String addToDefaultAlbum, Boolean addToMediaLibrary, Integer versionCode, String versionName, String metaData, String caption, String assetType, String approvalStatus, Long assignedAccountId, InputStream media, String mediaUrl, String mediaString, String mediaStringFileName, String mediaStringContentType, Integer mediaHeight, Integer mediaWidth, InputStream attachedMedia, String attachedMediaUrl, String attachedMediaString, String attachedMediaStringFileName, String attachedMediaStringContentType, Integer attachedMediaHeight, Integer attachedMediaWidth, String locationDescription, String app, String appKey, String searchTags, Double latitude, Double longitude) throws Exception {
        AssetResponse obj = createAsset(request, version, returnNulls, deviceId, accountId, albumId, collectionId, addToDefaultAlbum, addToMediaLibrary, versionCode, versionName, metaData, caption, assetType, approvalStatus, assignedAccountId, media, mediaUrl, mediaString, mediaStringFileName, mediaStringContentType, mediaHeight, mediaWidth, attachedMedia, attachedMediaUrl, attachedMediaString, attachedMediaStringFileName, attachedMediaStringContentType, attachedMediaHeight, attachedMediaWidth, locationDescription, app, appKey, searchTags, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AssetResponse createAsset(Http.Request request, BigDecimal version, Boolean returnNulls, String deviceId, Long accountId, Long albumId, Long collectionId, String addToDefaultAlbum, Boolean addToMediaLibrary, Integer versionCode, String versionName, String metaData, String caption, String assetType, String approvalStatus, Long assignedAccountId, InputStream media, String mediaUrl, String mediaString, String mediaStringFileName, String mediaStringContentType, Integer mediaHeight, Integer mediaWidth, InputStream attachedMedia, String attachedMediaUrl, String attachedMediaString, String attachedMediaStringFileName, String attachedMediaStringContentType, Integer attachedMediaHeight, Integer attachedMediaWidth, String locationDescription, String app, String appKey, String searchTags, Double latitude, Double longitude) throws Exception;

    public Result deleteAssetHttp(Http.Request request, BigDecimal version, @NotNull String assetId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception {
        SirqulResponse obj = deleteAsset(request, version, assetId, deviceId, accountId, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteAsset(Http.Request request, BigDecimal version, @NotNull String assetId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception;

    public Result getAssetHttp(Http.Request request, BigDecimal version, @NotNull Long assetId, String deviceId, Long accountId, Boolean noteDescending) throws Exception {
        AssetFullResponse obj = getAsset(request, version, assetId, deviceId, accountId, noteDescending);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AssetFullResponse getAsset(Http.Request request, BigDecimal version, @NotNull Long assetId, String deviceId, Long accountId, Boolean noteDescending) throws Exception;

    public Result removeAssetHttp(Http.Request request, BigDecimal version, @NotNull String assetId, String deviceId, Long accountId, Long albumId, Long collectionId, Boolean removeFromDefaultAlbums, Double latitude, Double longitude) throws Exception {
        SirqulResponse obj = removeAsset(request, version, assetId, deviceId, accountId, albumId, collectionId, removeFromDefaultAlbums, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse removeAsset(Http.Request request, BigDecimal version, @NotNull String assetId, String deviceId, Long accountId, Long albumId, Long collectionId, Boolean removeFromDefaultAlbums, Double latitude, Double longitude) throws Exception;

    public Result searchAssetsHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, String albumIds, String assetIds, String appKey, String mediaType, String mimeType, String keyword, Integer versionCode, String versionName, Long updatedSince, Long updatedBefore, String sortField, Boolean descending, Boolean searchMediaLibrary, Boolean filterByBillable, Boolean activeOnly, Boolean returnApp, Integer start, Integer limit, String searchMode, String assetType, String approvalStatus, Long assignedAccountId) throws Exception {
        List<AssetResponse> obj = searchAssets(request, version, deviceId, accountId, albumIds, assetIds, appKey, mediaType, mimeType, keyword, versionCode, versionName, updatedSince, updatedBefore, sortField, descending, searchMediaLibrary, filterByBillable, activeOnly, returnApp, start, limit, searchMode, assetType, approvalStatus, assignedAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (AssetResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<AssetResponse> searchAssets(Http.Request request, BigDecimal version, String deviceId, Long accountId, String albumIds, String assetIds, String appKey, String mediaType, String mimeType, String keyword, Integer versionCode, String versionName, Long updatedSince, Long updatedBefore, String sortField, Boolean descending, Boolean searchMediaLibrary, Boolean filterByBillable, Boolean activeOnly, Boolean returnApp, Integer start, Integer limit, String searchMode, String assetType, String approvalStatus, Long assignedAccountId) throws Exception;

    public Result updateAssetHttp(Http.Request request, BigDecimal version, @NotNull Long assetId, String deviceId, Long accountId, Long albumId, Long attachedAssetId, Integer versionCode, String versionName, String metaData, String caption, String assetType, String approvalStatus, Long assignedAccountId, InputStream media, String mediaUrl, String mediaString, String mediaStringFileName, String mediaStringContentType, Integer mediaHeight, Integer mediaWidth, InputStream attachedMedia, String attachedMediaUrl, String attachedMediaString, String attachedMediaStringFileName, String attachedMediaStringContentType, Integer attachedMediaHeight, Integer attachedMediaWidth, String locationDescription, String searchTags, String appKey, Double latitude, Double longitude) throws Exception {
        SirqulResponse obj = updateAsset(request, version, assetId, deviceId, accountId, albumId, attachedAssetId, versionCode, versionName, metaData, caption, assetType, approvalStatus, assignedAccountId, media, mediaUrl, mediaString, mediaStringFileName, mediaStringContentType, mediaHeight, mediaWidth, attachedMedia, attachedMediaUrl, attachedMediaString, attachedMediaStringFileName, attachedMediaStringContentType, attachedMediaHeight, attachedMediaWidth, locationDescription, searchTags, appKey, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse updateAsset(Http.Request request, BigDecimal version, @NotNull Long assetId, String deviceId, Long accountId, Long albumId, Long attachedAssetId, Integer versionCode, String versionName, String metaData, String caption, String assetType, String approvalStatus, Long assignedAccountId, InputStream media, String mediaUrl, String mediaString, String mediaStringFileName, String mediaStringContentType, Integer mediaHeight, Integer mediaWidth, InputStream attachedMedia, String attachedMediaUrl, String attachedMediaString, String attachedMediaStringFileName, String attachedMediaStringContentType, Integer attachedMediaHeight, Integer attachedMediaWidth, String locationDescription, String searchTags, String appKey, Double latitude, Double longitude) throws Exception;

}
