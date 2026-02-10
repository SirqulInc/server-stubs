package controllers;

import java.math.BigDecimal;
import apimodels.CountResponse;
import apimodels.FlagResponse;
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
public abstract class FlagApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createFlagHttp(Http.Request request, BigDecimal version, @NotNull String flagableType, @NotNull Long flagableId, String deviceId, Long accountId, String flagDescription, Double latitude, Double longitude) throws Exception {
        SirqulResponse obj = createFlag(request, version, flagableType, flagableId, deviceId, accountId, flagDescription, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse createFlag(Http.Request request, BigDecimal version, @NotNull String flagableType, @NotNull Long flagableId, String deviceId, Long accountId, String flagDescription, Double latitude, Double longitude) throws Exception;

    public Result deleteFlagHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, String itemBeingFlaggedType, Long itemBeingFlaggedId, String flagableType, Long flagableId) throws Exception {
        SirqulResponse obj = deleteFlag(request, version, deviceId, accountId, itemBeingFlaggedType, itemBeingFlaggedId, flagableType, flagableId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteFlag(Http.Request request, BigDecimal version, String deviceId, Long accountId, String itemBeingFlaggedType, Long itemBeingFlaggedId, String flagableType, Long flagableId) throws Exception;

    public Result getFlagHttp(Http.Request request, BigDecimal version, @NotNull String flagableType, @NotNull Long flagableId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception {
        FlagResponse obj = getFlag(request, version, flagableType, flagableId, deviceId, accountId, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract FlagResponse getFlag(Http.Request request, BigDecimal version, @NotNull String flagableType, @NotNull Long flagableId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception;

    public Result getFlagThresholdHttp(Http.Request request, BigDecimal version, @NotNull String itemBeingFlaggedType, @NotNull String appKey) throws Exception {
        CountResponse obj = getFlagThreshold(request, version, itemBeingFlaggedType, appKey);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CountResponse getFlagThreshold(Http.Request request, BigDecimal version, @NotNull String itemBeingFlaggedType, @NotNull String appKey) throws Exception;

    public Result updateFlagThresholdHttp(Http.Request request, BigDecimal version, @NotNull String itemBeingFlaggedType, @NotNull Long threshold, @NotNull String appKey, String deviceId, Long accountId) throws Exception {
        CountResponse obj = updateFlagThreshold(request, version, itemBeingFlaggedType, threshold, appKey, deviceId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CountResponse updateFlagThreshold(Http.Request request, BigDecimal version, @NotNull String itemBeingFlaggedType, @NotNull Long threshold, @NotNull String appKey, String deviceId, Long accountId) throws Exception;

}
