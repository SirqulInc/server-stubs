package controllers;

import java.math.BigDecimal;
import apimodels.WrappedProxyItemResponse;

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
public class OpenAiApiController extends Controller {
    private final OpenAiApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private OpenAiApiController(Config configuration, OpenAiApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result imageGeneration(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuepostBody = request.getQueryString("postBody");
        String postBody;
        if (valuepostBody != null) {
            postBody = valuepostBody;
        } else {
            throw new IllegalArgumentException("'postBody' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.imageGenerationHttp(request, version, accountId, postBody, returnRawResponse);
    }

}
