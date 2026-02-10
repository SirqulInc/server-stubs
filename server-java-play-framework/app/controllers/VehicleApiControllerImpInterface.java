package controllers;

import java.math.BigDecimal;
import apimodels.Vehicle;

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
public abstract class VehicleApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createVehicleHttp(Http.Request request, BigDecimal version, @NotNull String vehicle, Vehicle body) throws Exception {
        Vehicle obj = createVehicle(request, version, vehicle, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Vehicle createVehicle(Http.Request request, BigDecimal version, @NotNull String vehicle, Vehicle body) throws Exception;

    public Result deleteVehicleHttp(Http.Request request, BigDecimal version, Long id) throws Exception {
        deleteVehicle(request, version, id);
        return ok();

    }

    public abstract void deleteVehicle(Http.Request request, BigDecimal version, Long id) throws Exception;

    public Result getVehicleHttp(Http.Request request, BigDecimal version, Long id) throws Exception {
        Vehicle obj = getVehicle(request, version, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Vehicle getVehicle(Http.Request request, BigDecimal version, Long id) throws Exception;

    public Result searchVehicleHttp(Http.Request request, BigDecimal version, @NotNull Long hubId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, String keyword) throws Exception {
        List<Vehicle> obj = searchVehicle(request, version, hubId, sortField, descending, start, limit, activeOnly, keyword);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Vehicle curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Vehicle> searchVehicle(Http.Request request, BigDecimal version, @NotNull Long hubId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, String keyword) throws Exception;

    public Result updateVehicleHttp(Http.Request request, BigDecimal version, Long id, @NotNull String vehicle, Vehicle body) throws Exception {
        Vehicle obj = updateVehicle(request, version, id, vehicle, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Vehicle updateVehicle(Http.Request request, BigDecimal version, Long id, @NotNull String vehicle, Vehicle body) throws Exception;

}
