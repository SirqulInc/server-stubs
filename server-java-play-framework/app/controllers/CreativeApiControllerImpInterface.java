package controllers;

import java.math.BigDecimal;
import apimodels.CreativeResponse;
import apimodels.MissionResponse;
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
public abstract class CreativeApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result addPreviewHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long creativeId) throws Exception {
        SirqulResponse obj = addPreview(request, version, accountId, creativeId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse addPreview(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long creativeId) throws Exception;

    public Result adsFindHttp(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull Boolean randomize, @NotNull Boolean targetedAdsOnly, String type, Long accountId, String appVersion, Double latitude, Double longitude, String device, Long deviceIdentifier, String deviceVersion, Integer start, Integer limit, Boolean includeAudiences, Boolean allocatesTickets, String missionIds) throws Exception {
        List<MissionResponse> obj = adsFind(request, version, appKey, randomize, targetedAdsOnly, type, accountId, appVersion, latitude, longitude, device, deviceIdentifier, deviceVersion, start, limit, includeAudiences, allocatesTickets, missionIds);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (MissionResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<MissionResponse> adsFind(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull Boolean randomize, @NotNull Boolean targetedAdsOnly, String type, Long accountId, String appVersion, Double latitude, Double longitude, String device, Long deviceIdentifier, String deviceVersion, Integer start, Integer limit, Boolean includeAudiences, Boolean allocatesTickets, String missionIds) throws Exception;

    public Result createCreativeHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, @NotNull Boolean active, @NotNull Boolean waitForAsset, String description, Long assetImageId, String action, String data, String suffix, String type, Double balance, Long referenceId, String appVersion, Long missionId, Long offerId) throws Exception {
        CreativeResponse obj = createCreative(request, version, accountId, name, active, waitForAsset, description, assetImageId, action, data, suffix, type, balance, referenceId, appVersion, missionId, offerId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CreativeResponse createCreative(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, @NotNull Boolean active, @NotNull Boolean waitForAsset, String description, Long assetImageId, String action, String data, String suffix, String type, Double balance, Long referenceId, String appVersion, Long missionId, Long offerId) throws Exception;

    public Result deleteCreativeHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long creativeId) throws Exception {
        SirqulResponse obj = deleteCreative(request, version, accountId, creativeId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteCreative(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long creativeId) throws Exception;

    public Result getCreativeHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long creativeId) throws Exception {
        CreativeResponse obj = getCreative(request, version, accountId, creativeId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CreativeResponse getCreative(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long creativeId) throws Exception;

    public Result getCreativesByApplicationHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Integer start, @NotNull Integer limit, Long missionId, String keyword) throws Exception {
        List<CreativeResponse> obj = getCreativesByApplication(request, version, accountId, appKey, start, limit, missionId, keyword);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (CreativeResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<CreativeResponse> getCreativesByApplication(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Integer start, @NotNull Integer limit, Long missionId, String keyword) throws Exception;

    public Result removePreviewHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long creativeId) throws Exception {
        SirqulResponse obj = removePreview(request, version, accountId, creativeId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse removePreview(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long creativeId) throws Exception;

    public Result updateCreativeHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long creativeId, String name, String description, Long assetImageId, String action, String data, String suffix, String type, Double balance, Boolean active, Long referenceId, String appVersion, Long missionId) throws Exception {
        CreativeResponse obj = updateCreative(request, version, accountId, creativeId, name, description, assetImageId, action, data, suffix, type, balance, active, referenceId, appVersion, missionId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CreativeResponse updateCreative(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long creativeId, String name, String description, Long assetImageId, String action, String data, String suffix, String type, Double balance, Boolean active, Long referenceId, String appVersion, Long missionId) throws Exception;

}
