package controllers;

import java.math.BigDecimal;
import apimodels.CargoType;

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
public class CargoTypeApiController extends Controller {
    private final CargoTypeApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private CargoTypeApiController(Config configuration, CargoTypeApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createCargoType(Http.Request request, BigDecimal version) throws Exception {
        JsonNode nodebody = request.body().asJson();
        CargoType body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), CargoType.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        return imp.createCargoTypeHttp(request, version, body);
    }

    @ApiAction
    public Result deleteCargoType(Http.Request request, BigDecimal version,Long cargoTypeId) throws Exception {
        return imp.deleteCargoTypeHttp(request, version, cargoTypeId);
    }

    @ApiAction
    public Result getCargoType(Http.Request request, BigDecimal version,Long cargoTypeId) throws Exception {
        return imp.getCargoTypeHttp(request, version, cargoTypeId);
    }

    @ApiAction
    public Result searchCargoTypes(Http.Request request, BigDecimal version) throws Exception {
        String valueretailerId = request.getQueryString("retailerId");
        Long retailerId;
        if (valueretailerId != null) {
            retailerId = Long.parseLong(valueretailerId);
        } else {
            retailerId = null;
        }
        String valuehubId = request.getQueryString("hubId");
        Long hubId;
        if (valuehubId != null) {
            hubId = Long.parseLong(valuehubId);
        } else {
            hubId = null;
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
        return imp.searchCargoTypesHttp(request, version, sortField, descending, start, limit, activeOnly, retailerId, hubId);
    }

    @ApiAction
    public Result updateCargoType(Http.Request request, BigDecimal version,Long cargoTypeId) throws Exception {
        JsonNode nodebody = request.body().asJson();
        CargoType body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), CargoType.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        return imp.updateCargoTypeHttp(request, version, cargoTypeId, body);
    }

}
