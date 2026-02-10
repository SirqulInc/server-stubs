package controllers;

import java.math.BigDecimal;
import apimodels.Program;

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
public class ProgramApiController extends Controller {
    private final ProgramApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ProgramApiController(Config configuration, ProgramApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createProgram(Http.Request request, BigDecimal version) throws Exception {
        JsonNode nodebody = request.body().asJson();
        Program body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), Program.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        return imp.createProgramHttp(request, version, body);
    }

    @ApiAction
    public Result deleteProgram(Http.Request request, BigDecimal version,Long id) throws Exception {
        return imp.deleteProgramHttp(request, version, id);
    }

    @ApiAction
    public Result getProgram(Http.Request request, BigDecimal version,Long id) throws Exception {
        return imp.getProgramHttp(request, version, id);
    }

    @ApiAction
    public Result postProgram(Http.Request request, BigDecimal version,Long id) throws Exception {
        JsonNode nodebody = request.body().asJson();
        Program body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), Program.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        return imp.postProgramHttp(request, version, id, body);
    }

    @ApiAction
    public Result putProgram(Http.Request request, BigDecimal version,Long id) throws Exception {
        JsonNode nodebody = request.body().asJson();
        Program body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), Program.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        return imp.putProgramHttp(request, version, id, body);
    }

    @ApiAction
    public Result searchPrograms(Http.Request request, BigDecimal version) throws Exception {
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
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
        return imp.searchProgramsHttp(request, version, sortField, descending, start, limit, activeOnly, keyword);
    }

}
