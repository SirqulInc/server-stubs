package controllers;

import java.math.BigDecimal;
import apimodels.ImportStatuses;
import java.util.Map;
import apimodels.Orders;
import apimodels.ShipmentOrder;

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
public class OptimizeApiController extends Controller {
    private final OptimizeApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private OptimizeApiController(Config configuration, OptimizeApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getOptimizationResult(Http.Request request, BigDecimal version,String batchID) throws Exception {
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            throw new IllegalArgumentException("'start' parameter is required");
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            throw new IllegalArgumentException("'limit' parameter is required");
        }
        return imp.getOptimizationResultHttp(request, version, batchID, start, limit);
    }

    @ApiAction
    public Result requestOptimization(Http.Request request, BigDecimal version) throws Exception {
        JsonNode nodebody = request.body().asJson();
        Orders body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), Orders.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        return imp.requestOptimizationHttp(request, version, body);
    }

}
