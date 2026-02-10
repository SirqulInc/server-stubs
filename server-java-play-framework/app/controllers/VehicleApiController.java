package controllers;

import java.math.BigDecimal;
import apimodels.Vehicle;

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
public class VehicleApiController extends Controller {
    private final VehicleApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private VehicleApiController(Config configuration, VehicleApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createVehicle(Http.Request request, BigDecimal version) throws Exception {
        JsonNode nodebody = request.body().asJson();
        Vehicle body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), Vehicle.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        String valuevehicle = request.getQueryString("vehicle");
        String vehicle;
        if (valuevehicle != null) {
            vehicle = valuevehicle;
        } else {
            throw new IllegalArgumentException("'vehicle' parameter is required");
        }
        return imp.createVehicleHttp(request, version, vehicle, body);
    }

    @ApiAction
    public Result deleteVehicle(Http.Request request, BigDecimal version,Long id) throws Exception {
        return imp.deleteVehicleHttp(request, version, id);
    }

    @ApiAction
    public Result getVehicle(Http.Request request, BigDecimal version,Long id) throws Exception {
        return imp.getVehicleHttp(request, version, id);
    }

    @ApiAction
    public Result searchVehicle(Http.Request request, BigDecimal version) throws Exception {
        String valuehubId = request.getQueryString("hubId");
        Long hubId;
        if (valuehubId != null) {
            hubId = Long.parseLong(valuehubId);
        } else {
            throw new IllegalArgumentException("'hubId' parameter is required");
        }
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
        return imp.searchVehicleHttp(request, version, hubId, sortField, descending, start, limit, activeOnly, keyword);
    }

    @ApiAction
    public Result updateVehicle(Http.Request request, BigDecimal version,Long id) throws Exception {
        JsonNode nodebody = request.body().asJson();
        Vehicle body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), Vehicle.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        String valuevehicle = request.getQueryString("vehicle");
        String vehicle;
        if (valuevehicle != null) {
            vehicle = valuevehicle;
        } else {
            throw new IllegalArgumentException("'vehicle' parameter is required");
        }
        return imp.updateVehicleHttp(request, version, id, vehicle, body);
    }

}
