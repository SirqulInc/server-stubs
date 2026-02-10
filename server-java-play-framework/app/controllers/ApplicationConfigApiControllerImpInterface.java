package controllers;

import apimodels.ApplicationConfigResponse;
import java.math.BigDecimal;
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
public abstract class ApplicationConfigApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createApplicationConfigHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String configVersion, @NotNull Long assetId, Long retailerId, Long retailerLocationId, String udid) throws Exception {
        ApplicationConfigResponse obj = createApplicationConfig(request, version, accountId, appKey, configVersion, assetId, retailerId, retailerLocationId, udid);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ApplicationConfigResponse createApplicationConfig(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String configVersion, @NotNull Long assetId, Long retailerId, Long retailerLocationId, String udid) throws Exception;

    public Result deleteApplicationConfigHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long configId) throws Exception {
        SirqulResponse obj = deleteApplicationConfig(request, version, accountId, configId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteApplicationConfig(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long configId) throws Exception;

    public Result getApplicationConfigHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long configId) throws Exception {
        ApplicationConfigResponse obj = getApplicationConfig(request, version, accountId, configId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ApplicationConfigResponse getApplicationConfig(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long configId) throws Exception;

    public Result getApplicationConfigByConfigVersionHttp(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String configVersion, Long retailerId, Long retailerLocationId, String udid, Boolean allowOlderVersions) throws Exception {
        ApplicationConfigResponse obj = getApplicationConfigByConfigVersion(request, version, appKey, configVersion, retailerId, retailerLocationId, udid, allowOlderVersions);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ApplicationConfigResponse getApplicationConfigByConfigVersion(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String configVersion, Long retailerId, Long retailerLocationId, String udid, Boolean allowOlderVersions) throws Exception;

    public Result searchApplicationConfigHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, String appKey, Long retailerId, Long retailerLocationId, String udid, String configVersion, String sortField, Boolean descending, Integer start, Integer limit) throws Exception {
        List<ApplicationConfigResponse> obj = searchApplicationConfig(request, version, accountId, appKey, retailerId, retailerLocationId, udid, configVersion, sortField, descending, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (ApplicationConfigResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<ApplicationConfigResponse> searchApplicationConfig(Http.Request request, BigDecimal version, @NotNull Long accountId, String appKey, Long retailerId, Long retailerLocationId, String udid, String configVersion, String sortField, Boolean descending, Integer start, Integer limit) throws Exception;

    public Result updateApplicationConfigHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long configId, String appKey, String configVersion, Long assetId, Long retailerId, Long retailerLocationId, String udid) throws Exception {
        ApplicationConfigResponse obj = updateApplicationConfig(request, version, accountId, configId, appKey, configVersion, assetId, retailerId, retailerLocationId, udid);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ApplicationConfigResponse updateApplicationConfig(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long configId, String appKey, String configVersion, Long assetId, Long retailerId, Long retailerLocationId, String udid) throws Exception;

}
