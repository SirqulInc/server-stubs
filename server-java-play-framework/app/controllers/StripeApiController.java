package controllers;

import java.math.BigDecimal;
import apimodels.SirqulResponse;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class StripeApiController extends Controller {
    private final StripeApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private StripeApiController(Config configuration, StripeApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createStripeCheckoutSession(Http.Request request, BigDecimal version) throws Exception {
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuestripeParameters = request.getQueryString("stripeParameters");
        String stripeParameters;
        if (valuestripeParameters != null) {
            stripeParameters = valuestripeParameters;
        } else {
            throw new IllegalArgumentException("'stripeParameters' parameter is required");
        }
        return imp.createStripeCheckoutSessionHttp(request, version, appKey, stripeParameters);
    }

}
