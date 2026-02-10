package controllers;

import java.math.BigDecimal;
import apimodels.TwiMLResponse;

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
public abstract class TwilioApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result smsBuyOfferHttp(Http.Request request, BigDecimal version, String appKey, @NotNull String body, @NotNull String from, @NotNull String currencyType) throws Exception {
        TwiMLResponse obj = smsBuyOffer(request, version, appKey, body, from, currencyType);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TwiMLResponse smsBuyOffer(Http.Request request, BigDecimal version, String appKey, @NotNull String body, @NotNull String from, @NotNull String currencyType) throws Exception;

}
