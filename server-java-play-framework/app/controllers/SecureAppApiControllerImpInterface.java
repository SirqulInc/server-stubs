package controllers;

import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.PaymentRequest;
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
public abstract class SecureAppApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createSecureApplicationHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull InputStream keyCert, @NotNull InputStream trustStore, @NotNull String username, @NotNull String password, Boolean active, String biometricType, String biometricPosition, String biometricPosition2) throws Exception {
        SirqulResponse obj = createSecureApplication(request, version, accountId, appKey, keyCert, trustStore, username, password, active, biometricType, biometricPosition, biometricPosition2);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse createSecureApplication(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull InputStream keyCert, @NotNull InputStream trustStore, @NotNull String username, @NotNull String password, Boolean active, String biometricType, String biometricPosition, String biometricPosition2) throws Exception;

    public Result deleteSecureApplicationHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey) throws Exception {
        SirqulResponse obj = deleteSecureApplication(request, version, accountId, appKey);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteSecureApplication(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey) throws Exception;

    public Result loginSecureHttp(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull InputStream biometricFile, String deviceId, InputStream biometricFile2, Integer ageRestriction, Boolean returnProfile, String responseFilters, Double latitude, Double longitude) throws Exception {
        ProfileResponse obj = loginSecure(request, version, appKey, biometricFile, deviceId, biometricFile2, ageRestriction, returnProfile, responseFilters, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProfileResponse loginSecure(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull InputStream biometricFile, String deviceId, InputStream biometricFile2, Integer ageRestriction, Boolean returnProfile, String responseFilters, Double latitude, Double longitude) throws Exception;

    public Result purchaseSecureHttp(Http.Request request, BigDecimal version, PaymentRequest body) throws Exception {
        ProfileResponse obj = purchaseSecure(request, version, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProfileResponse purchaseSecure(Http.Request request, BigDecimal version, PaymentRequest body) throws Exception;

    public Result resetSecureHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey) throws Exception {
        SirqulResponse obj = resetSecure(request, version, accountId, appKey);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse resetSecure(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey) throws Exception;

    public Result updateSecureApplicationHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, Boolean active, InputStream keyCert, InputStream trustStore, String username, String password, String biometricType, String biometricPosition, String biometricPosition2) throws Exception {
        SirqulResponse obj = updateSecureApplication(request, version, accountId, appKey, active, keyCert, trustStore, username, password, biometricType, biometricPosition, biometricPosition2);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse updateSecureApplication(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, Boolean active, InputStream keyCert, InputStream trustStore, String username, String password, String biometricType, String biometricPosition, String biometricPosition2) throws Exception;

}
