package controllers;

import java.math.BigDecimal;
import apimodels.ProfileResponse;
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
public abstract class TwitterApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result authorizeTwitterHttp(Http.Request request, BigDecimal version, @NotNull String appKey) throws Exception {
        SirqulResponse obj = authorizeTwitter(request, version, appKey);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse authorizeTwitter(Http.Request request, BigDecimal version, @NotNull String appKey) throws Exception;

    public Result loginTwitterHttp(Http.Request request, BigDecimal version, @NotNull String accessToken, @NotNull String accessTokenSecret, @NotNull String appKey, @NotNull String responseFilters, String deviceId, Double latitude, Double longitude) throws Exception {
        ProfileResponse obj = loginTwitter(request, version, accessToken, accessTokenSecret, appKey, responseFilters, deviceId, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProfileResponse loginTwitter(Http.Request request, BigDecimal version, @NotNull String accessToken, @NotNull String accessTokenSecret, @NotNull String appKey, @NotNull String responseFilters, String deviceId, Double latitude, Double longitude) throws Exception;

}
