package controllers;

import java.math.BigDecimal;
import apimodels.SirqulResponse;
import apimodels.TokenResponse;

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
public abstract class FacebookApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result getTokenHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception {
        TokenResponse obj = getToken(request, version, deviceId, accountId, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TokenResponse getToken(Http.Request request, BigDecimal version, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception;

    public Result graphInterfaceHttp(Http.Request request, BigDecimal version, @NotNull String event, String deviceId, Long accountId, String permissionableType, Long permissionableId, Long assetId, String gameType, String appKey, Double latitude, Double longitude) throws Exception {
        SirqulResponse obj = graphInterface(request, version, event, deviceId, accountId, permissionableType, permissionableId, assetId, gameType, appKey, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse graphInterface(Http.Request request, BigDecimal version, @NotNull String event, String deviceId, Long accountId, String permissionableType, Long permissionableId, Long assetId, String gameType, String appKey, Double latitude, Double longitude) throws Exception;

}
