package controllers;

import java.math.BigDecimal;
import apimodels.TwiMLResponse;

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
public class TwilioApiController extends Controller {
    private final TwilioApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private TwilioApiController(Config configuration, TwilioApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result smsBuyOffer(Http.Request request, BigDecimal version,String appKey) throws Exception {
        String valuebody = request.getQueryString("Body");
        String body;
        if (valuebody != null) {
            body = valuebody;
        } else {
            throw new IllegalArgumentException("'Body' parameter is required");
        }
        String valuefrom = request.getQueryString("From");
        String from;
        if (valuefrom != null) {
            from = valuefrom;
        } else {
            throw new IllegalArgumentException("'From' parameter is required");
        }
        String valuecurrencyType = request.getQueryString("currencyType");
        String currencyType;
        if (valuecurrencyType != null) {
            currencyType = valuecurrencyType;
        } else {
            throw new IllegalArgumentException("'currencyType' parameter is required");
        }
        return imp.smsBuyOfferHttp(request, version, appKey, body, from, currencyType);
    }

}
