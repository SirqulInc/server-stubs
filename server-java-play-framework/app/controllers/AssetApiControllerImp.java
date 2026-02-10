package controllers;

import apimodels.AssetFullResponse;
import apimodels.AssetResponse;
import apimodels.AssetShortResponse;
import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.SirqulResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AssetApiControllerImp extends AssetApiControllerImpInterface {
    @Override
    public SirqulResponse assetDownload(Http.Request request, BigDecimal version,  @Pattern(regexp=".+")String filename) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public AssetShortResponse assetMorph(Http.Request request, BigDecimal version, @NotNull Long offerId, @NotNull String adSize, Long creativeId, Integer width, Integer height, String backgroundSize, String template) throws Exception {
        //Do your magic!!!
        return new AssetShortResponse();
    }

    @Override
    public AssetResponse createAsset(Http.Request request, BigDecimal version, Boolean returnNulls, String deviceId, Long accountId, Long albumId, Long collectionId, String addToDefaultAlbum, Boolean addToMediaLibrary, Integer versionCode, String versionName, String metaData, String caption, String assetType, String approvalStatus, Long assignedAccountId, InputStream media, String mediaUrl, String mediaString, String mediaStringFileName, String mediaStringContentType, Integer mediaHeight, Integer mediaWidth, InputStream attachedMedia, String attachedMediaUrl, String attachedMediaString, String attachedMediaStringFileName, String attachedMediaStringContentType, Integer attachedMediaHeight, Integer attachedMediaWidth, String locationDescription, String app, String appKey, String searchTags, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new AssetResponse();
    }

    @Override
    public SirqulResponse deleteAsset(Http.Request request, BigDecimal version, @NotNull String assetId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public AssetFullResponse getAsset(Http.Request request, BigDecimal version, @NotNull Long assetId, String deviceId, Long accountId, Boolean noteDescending) throws Exception {
        //Do your magic!!!
        return new AssetFullResponse();
    }

    @Override
    public SirqulResponse removeAsset(Http.Request request, BigDecimal version, @NotNull String assetId, String deviceId, Long accountId, Long albumId, Long collectionId, Boolean removeFromDefaultAlbums, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public List<AssetResponse> searchAssets(Http.Request request, BigDecimal version, String deviceId, Long accountId, String albumIds, String assetIds, String appKey, String mediaType, String mimeType, String keyword, Integer versionCode, String versionName, Long updatedSince, Long updatedBefore, String sortField, Boolean descending, Boolean searchMediaLibrary, Boolean filterByBillable, Boolean activeOnly, Boolean returnApp, Integer start, Integer limit, String searchMode, String assetType, String approvalStatus, Long assignedAccountId) throws Exception {
        //Do your magic!!!
        return new ArrayList<AssetResponse>();
    }

    @Override
    public SirqulResponse updateAsset(Http.Request request, BigDecimal version, @NotNull Long assetId, String deviceId, Long accountId, Long albumId, Long attachedAssetId, Integer versionCode, String versionName, String metaData, String caption, String assetType, String approvalStatus, Long assignedAccountId, InputStream media, String mediaUrl, String mediaString, String mediaStringFileName, String mediaStringContentType, Integer mediaHeight, Integer mediaWidth, InputStream attachedMedia, String attachedMediaUrl, String attachedMediaString, String attachedMediaStringFileName, String attachedMediaStringContentType, Integer attachedMediaHeight, Integer attachedMediaWidth, String locationDescription, String searchTags, String appKey, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

}
