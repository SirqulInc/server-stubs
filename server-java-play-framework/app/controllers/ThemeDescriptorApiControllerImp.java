package controllers;

import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.PurchaseItemListResponse;
import apimodels.SirqulResponse;
import apimodels.ThemeDescriptorResponse;

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
public class ThemeDescriptorApiControllerImp extends ThemeDescriptorApiControllerImpInterface {
    @Override
    public ThemeDescriptorResponse addOrUpdateThemeDescriptor(Http.Request request, BigDecimal version, @NotNull Boolean publicRead, @NotNull Boolean publicWrite, @NotNull Boolean publicDelete, @NotNull Boolean publicAdd, @NotNull String visibility, @NotNull Boolean includeFriendGroup, @NotNull Boolean completeWithDefaultValues, String deviceId, Long accountId, String gameType, Long themeDescriptorId, String title, String description, String connectionIdsToAdd, String connectionGroupIdsToAdd, String appVersion, String colorValueJson, String stringReplacerJson, String customJsonObjects, InputStream iconImage, InputStream sceneAtlasImage, InputStream bgImage, InputStream bgSound, String musicSelection, String locationDescription, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new ThemeDescriptorResponse();
    }

    @Override
    public PurchaseItemListResponse getThemeDescriptor(Http.Request request, BigDecimal version, @NotNull Long themeDescriptorId, String deviceId, Long accountId, String gameType, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new PurchaseItemListResponse();
    }

    @Override
    public PurchaseItemListResponse getThemeDescriptors(Http.Request request, BigDecimal version, @NotNull String filter, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, String deviceId, Long accountId, String gameType, String contestType, Long ownerId, String q, String keyword, Integer i, Integer l, Long dateCreated, String appVersion, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new PurchaseItemListResponse();
    }

    @Override
    public SirqulResponse removeThemeDescriptor(Http.Request request, BigDecimal version, @NotNull Long themeDescriptorId, String deviceId, Long accountId, String gameType, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

}
