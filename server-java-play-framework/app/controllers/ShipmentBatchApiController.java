package controllers;

import java.math.BigDecimal;
import apimodels.ShipmentBatch;
import apimodels.ShipmentImportStatus;

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
public class ShipmentBatchApiController extends Controller {
    private final ShipmentBatchApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ShipmentBatchApiController(Config configuration, ShipmentBatchApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createShipmentBatch(Http.Request request, BigDecimal version) throws Exception {
        JsonNode nodebody = request.body().asJson();
        ShipmentBatch body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), ShipmentBatch.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        return imp.createShipmentBatchHttp(request, version, body);
    }

    @ApiAction
    public Result deleteShipmentBatch(Http.Request request, BigDecimal version,Long batchId) throws Exception {
        return imp.deleteShipmentBatchHttp(request, version, batchId);
    }

    @ApiAction
    public Result getShipmentBatch(Http.Request request, BigDecimal version,Long batchId) throws Exception {
        return imp.getShipmentBatchHttp(request, version, batchId);
    }

    @ApiAction
    public Result getShipmentBatchStatus(Http.Request request, BigDecimal version,Long batchId) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuevalid = request.getQueryString("valid");
        Boolean valid;
        if (valuevalid != null) {
            valid = Boolean.valueOf(valuevalid);
        } else {
            valid = null;
        }
        String valuestarted = request.getQueryString("started");
        Boolean started;
        if (valuestarted != null) {
            started = Boolean.valueOf(valuestarted);
        } else {
            started = null;
        }
        String valuecompleted = request.getQueryString("completed");
        Boolean completed;
        if (valuecompleted != null) {
            completed = Boolean.valueOf(valuecompleted);
        } else {
            completed = null;
        }
        String valuehasShipment = request.getQueryString("hasShipment");
        Boolean hasShipment;
        if (valuehasShipment != null) {
            hasShipment = Boolean.valueOf(valuehasShipment);
        } else {
            hasShipment = null;
        }
        String valuehasRoute = request.getQueryString("hasRoute");
        Boolean hasRoute;
        if (valuehasRoute != null) {
            hasRoute = Boolean.valueOf(valuehasRoute);
        } else {
            hasRoute = null;
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
        return imp.getShipmentBatchStatusHttp(request, version, batchId, accountId, sortField, descending, start, limit, valid, started, completed, hasShipment, hasRoute, keyword);
    }

    @ApiAction
    public Result searchShipmentBatch(Http.Request request, BigDecimal version) throws Exception {
        String valuehubId = request.getQueryString("hubId");
        Long hubId;
        if (valuehubId != null) {
            hubId = Long.parseLong(valuehubId);
        } else {
            throw new IllegalArgumentException("'hubId' parameter is required");
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
        return imp.searchShipmentBatchHttp(request, version, hubId, sortField, descending, start, limit);
    }

}
