package controllers;

import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.PurchaseItemListResponse;
import apimodels.SirqulResponse;
import apimodels.ThemeDescriptorResponse;

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
public abstract class ThemeDescriptorApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result addOrUpdateThemeDescriptorHttp(Http.Request request, BigDecimal version, @NotNull Boolean publicRead, @NotNull Boolean publicWrite, @NotNull Boolean publicDelete, @NotNull Boolean publicAdd, @NotNull String visibility, @NotNull Boolean includeFriendGroup, @NotNull Boolean completeWithDefaultValues, String deviceId, Long accountId, String gameType, Long themeDescriptorId, String title, String description, String connectionIdsToAdd, String connectionGroupIdsToAdd, String appVersion, String colorValueJson, String stringReplacerJson, String customJsonObjects, InputStream iconImage, InputStream sceneAtlasImage, InputStream bgImage, InputStream bgSound, String musicSelection, String locationDescription, Double latitude, Double longitude) throws Exception {
        ThemeDescriptorResponse obj = addOrUpdateThemeDescriptor(request, version, publicRead, publicWrite, publicDelete, publicAdd, visibility, includeFriendGroup, completeWithDefaultValues, deviceId, accountId, gameType, themeDescriptorId, title, description, connectionIdsToAdd, connectionGroupIdsToAdd, appVersion, colorValueJson, stringReplacerJson, customJsonObjects, iconImage, sceneAtlasImage, bgImage, bgSound, musicSelection, locationDescription, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ThemeDescriptorResponse addOrUpdateThemeDescriptor(Http.Request request, BigDecimal version, @NotNull Boolean publicRead, @NotNull Boolean publicWrite, @NotNull Boolean publicDelete, @NotNull Boolean publicAdd, @NotNull String visibility, @NotNull Boolean includeFriendGroup, @NotNull Boolean completeWithDefaultValues, String deviceId, Long accountId, String gameType, Long themeDescriptorId, String title, String description, String connectionIdsToAdd, String connectionGroupIdsToAdd, String appVersion, String colorValueJson, String stringReplacerJson, String customJsonObjects, InputStream iconImage, InputStream sceneAtlasImage, InputStream bgImage, InputStream bgSound, String musicSelection, String locationDescription, Double latitude, Double longitude) throws Exception;

    public Result getThemeDescriptorHttp(Http.Request request, BigDecimal version, @NotNull Long themeDescriptorId, String deviceId, Long accountId, String gameType, Double latitude, Double longitude) throws Exception {
        PurchaseItemListResponse obj = getThemeDescriptor(request, version, themeDescriptorId, deviceId, accountId, gameType, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PurchaseItemListResponse getThemeDescriptor(Http.Request request, BigDecimal version, @NotNull Long themeDescriptorId, String deviceId, Long accountId, String gameType, Double latitude, Double longitude) throws Exception;

    public Result getThemeDescriptorsHttp(Http.Request request, BigDecimal version, @NotNull String filter, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, String deviceId, Long accountId, String gameType, String contestType, Long ownerId, String q, String keyword, Integer i, Integer l, Long dateCreated, String appVersion, Double latitude, Double longitude) throws Exception {
        PurchaseItemListResponse obj = getThemeDescriptors(request, version, filter, sortField, descending, start, limit, deviceId, accountId, gameType, contestType, ownerId, q, keyword, i, l, dateCreated, appVersion, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PurchaseItemListResponse getThemeDescriptors(Http.Request request, BigDecimal version, @NotNull String filter, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, String deviceId, Long accountId, String gameType, String contestType, Long ownerId, String q, String keyword, Integer i, Integer l, Long dateCreated, String appVersion, Double latitude, Double longitude) throws Exception;

    public Result removeThemeDescriptorHttp(Http.Request request, BigDecimal version, @NotNull Long themeDescriptorId, String deviceId, Long accountId, String gameType, Double latitude, Double longitude) throws Exception {
        SirqulResponse obj = removeThemeDescriptor(request, version, themeDescriptorId, deviceId, accountId, gameType, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse removeThemeDescriptor(Http.Request request, BigDecimal version, @NotNull Long themeDescriptorId, String deviceId, Long accountId, String gameType, Double latitude, Double longitude) throws Exception;

}
