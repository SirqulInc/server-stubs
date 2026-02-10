package controllers;

import java.math.BigDecimal;
import java.util.Map;
import apimodels.Shipment;

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
public class ShipmentApiController extends Controller {
    private final ShipmentApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ShipmentApiController(Config configuration, ShipmentApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result cancelShipment(Http.Request request, BigDecimal version,Long id) throws Exception {
        return imp.cancelShipmentHttp(request, version, id);
    }

    @ApiAction
    public Result createShipment(Http.Request request, BigDecimal version) throws Exception {
        JsonNode nodebody = request.body().asJson();
        Shipment body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), Shipment.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        return imp.createShipmentHttp(request, version, body);
    }

    @ApiAction
    public Result deleteShipment(Http.Request request, BigDecimal version,Long id) throws Exception {
        return imp.deleteShipmentHttp(request, version, id);
    }

    @ApiAction
    public Result getShipment(Http.Request request, BigDecimal version,Long id) throws Exception {
        return imp.getShipmentHttp(request, version, id);
    }

    @ApiAction
    public Result searchShipments(Http.Request request, BigDecimal version) throws Exception {
        String valueownerId = request.getQueryString("ownerId");
        Long ownerId;
        if (valueownerId != null) {
            ownerId = Long.parseLong(valueownerId);
        } else {
            ownerId = null;
        }
        String valueriderId = request.getQueryString("riderId");
        Long riderId;
        if (valueriderId != null) {
            riderId = Long.parseLong(valueriderId);
        } else {
            riderId = null;
        }
        String valuerouteId = request.getQueryString("routeId");
        Long routeId;
        if (valuerouteId != null) {
            routeId = Long.parseLong(valuerouteId);
        } else {
            routeId = null;
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
        return imp.searchShipmentsHttp(request, version, sortField, descending, start, limit, activeOnly, ownerId, riderId, routeId);
    }

    @ApiAction
    public Result updateShipment(Http.Request request, BigDecimal version,Long id) throws Exception {
        JsonNode nodebody = request.body().asJson();
        Shipment body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), Shipment.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        return imp.updateShipmentHttp(request, version, id, body);
    }

    @ApiAction
    public Result updateShipmentStatus(Http.Request request, BigDecimal version,Long id) throws Exception {
        JsonNode nodebody = request.body().asJson();
        Map<String, Boolean> body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), new TypeReference<Map<String, Boolean>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (Map.Entry<String, Boolean> entry : body.entrySet()) {
                    OpenAPIUtils.validate(entry.getValue());
                }
            }
        } else {
            body = null;
        }
        return imp.updateShipmentStatusHttp(request, version, id, body);
    }

}
