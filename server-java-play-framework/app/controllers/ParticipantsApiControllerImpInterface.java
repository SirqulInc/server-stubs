package controllers;

import java.math.BigDecimal;
import java.io.InputStream;
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
public abstract class ParticipantsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result processAllParticipantsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, String appKey, Boolean useShortNameAsID) throws Exception {
        SirqulResponse obj = processAllParticipants(request, version, accountId, appKey, useShortNameAsID);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse processAllParticipants(Http.Request request, BigDecimal version, @NotNull Long accountId, String appKey, Boolean useShortNameAsID) throws Exception;

    public Result processParticipantsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String league, String appKey, Boolean useShortNameAsID, InputStream _file) throws Exception {
        SirqulResponse obj = processParticipants(request, version, accountId, league, appKey, useShortNameAsID, _file);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse processParticipants(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String league, String appKey, Boolean useShortNameAsID, InputStream _file) throws Exception;

}
