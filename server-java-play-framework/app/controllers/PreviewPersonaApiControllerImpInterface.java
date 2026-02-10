package controllers;

import java.math.BigDecimal;
import apimodels.PreviewPersonaResponse;
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
public abstract class PreviewPersonaApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createPersonaHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String title, String previewAccounts, Long date, Integer age, String gender, String gameExperienceLevel, Double latitude, Double longitude) throws Exception {
        PreviewPersonaResponse obj = createPersona(request, version, accountId, title, previewAccounts, date, age, gender, gameExperienceLevel, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PreviewPersonaResponse createPersona(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String title, String previewAccounts, Long date, Integer age, String gender, String gameExperienceLevel, Double latitude, Double longitude) throws Exception;

    public Result deletePersonaHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long personaId) throws Exception {
        SirqulResponse obj = deletePersona(request, version, accountId, personaId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deletePersona(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long personaId) throws Exception;

    public Result getPersonaListHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long personaId) throws Exception {
        PreviewPersonaResponse obj = getPersonaList(request, version, accountId, personaId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PreviewPersonaResponse getPersonaList(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long personaId) throws Exception;

    public Result searchPersonaHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Integer start, @NotNull Integer limit) throws Exception {
        PreviewPersonaResponse obj = searchPersona(request, version, accountId, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PreviewPersonaResponse searchPersona(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Integer start, @NotNull Integer limit) throws Exception;

    public Result updatePersonaHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long personaId, String title, String previewAccounts, Boolean active, Long date, Integer age, String gender, String gameExperienceLevel, Double latitude, Double longitude) throws Exception {
        PreviewPersonaResponse obj = updatePersona(request, version, accountId, personaId, title, previewAccounts, active, date, age, gender, gameExperienceLevel, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PreviewPersonaResponse updatePersona(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long personaId, String title, String previewAccounts, Boolean active, Long date, Integer age, String gender, String gameExperienceLevel, Double latitude, Double longitude) throws Exception;

}
