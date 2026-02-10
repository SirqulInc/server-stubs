package controllers;

import java.math.BigDecimal;
import java.util.Map;
import apimodels.Shipment;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class ShipmentApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result cancelShipmentHttp(Http.Request request, BigDecimal version, Long id) throws Exception {
        cancelShipment(request, version, id);
        return ok();

    }

    public abstract void cancelShipment(Http.Request request, BigDecimal version, Long id) throws Exception;

    public Result createShipmentHttp(Http.Request request, BigDecimal version, Shipment body) throws Exception {
        Shipment obj = createShipment(request, version, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Shipment createShipment(Http.Request request, BigDecimal version, Shipment body) throws Exception;

    public Result deleteShipmentHttp(Http.Request request, BigDecimal version, Long id) throws Exception {
        deleteShipment(request, version, id);
        return ok();

    }

    public abstract void deleteShipment(Http.Request request, BigDecimal version, Long id) throws Exception;

    public Result getShipmentHttp(Http.Request request, BigDecimal version, Long id) throws Exception {
        Shipment obj = getShipment(request, version, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Shipment getShipment(Http.Request request, BigDecimal version, Long id) throws Exception;

    public Result searchShipmentsHttp(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Long ownerId, Long riderId, Long routeId) throws Exception {
        List<Shipment> obj = searchShipments(request, version, sortField, descending, start, limit, activeOnly, ownerId, riderId, routeId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Shipment curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Shipment> searchShipments(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Long ownerId, Long riderId, Long routeId) throws Exception;

    public Result updateShipmentHttp(Http.Request request, BigDecimal version, Long id, Shipment body) throws Exception {
        Shipment obj = updateShipment(request, version, id, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Shipment updateShipment(Http.Request request, BigDecimal version, Long id, Shipment body) throws Exception;

    public Result updateShipmentStatusHttp(Http.Request request, BigDecimal version, Long id, Map<String, Boolean> body) throws Exception {
        updateShipmentStatus(request, version, id, body);
        return ok();

    }

    public abstract void updateShipmentStatus(Http.Request request, BigDecimal version, Long id, Map<String, Boolean> body) throws Exception;

}
