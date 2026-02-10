package controllers;

import java.math.BigDecimal;
import apimodels.ServiceHub;

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
public class ServiceHubApiController extends Controller {
    private final ServiceHubApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ServiceHubApiController(Config configuration, ServiceHubApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createServiceHub(Http.Request request, BigDecimal version) throws Exception {
        JsonNode nodebody = request.body().asJson();
        ServiceHub body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), ServiceHub.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        return imp.createServiceHubHttp(request, version, body);
    }

    @ApiAction
    public Result deleteServiceHub(Http.Request request, BigDecimal version,Long id) throws Exception {
        return imp.deleteServiceHubHttp(request, version, id);
    }

    @ApiAction
    public Result getServiceHub(Http.Request request, BigDecimal version,Long id) throws Exception {
        return imp.getServiceHubHttp(request, version, id);
    }

    @ApiAction
    public Result postServiceHub(Http.Request request, BigDecimal version,Long id) throws Exception {
        JsonNode nodebody = request.body().asJson();
        ServiceHub body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), ServiceHub.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        return imp.postServiceHubHttp(request, version, id, body);
    }

    @ApiAction
    public Result putServiceHub(Http.Request request, BigDecimal version,Long id) throws Exception {
        JsonNode nodebody = request.body().asJson();
        ServiceHub body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), ServiceHub.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        return imp.putServiceHubHttp(request, version, id, body);
    }

    @ApiAction
    public Result searchServiceHubs(Http.Request request, BigDecimal version) throws Exception {
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valueretailerId = request.getQueryString("retailerId");
        Long retailerId;
        if (valueretailerId != null) {
            retailerId = Long.parseLong(valueretailerId);
        } else {
            retailerId = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            throw new IllegalArgumentException("'sortField' parameter is required");
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            throw new IllegalArgumentException("'descending' parameter is required");
        }
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
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            throw new IllegalArgumentException("'activeOnly' parameter is required");
        }
        return imp.searchServiceHubsHttp(request, version, sortField, descending, start, limit, activeOnly, keyword, retailerId);
    }

}
