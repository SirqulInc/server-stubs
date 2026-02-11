package controllers;

import apimodels.VehicleType;

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
public abstract class VehicleTypeApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createVehicleTypeHttp(Http.Request request, @NotNull String vehicleType, VehicleType body) throws Exception {
        VehicleType obj = createVehicleType(request, vehicleType, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract VehicleType createVehicleType(Http.Request request, @NotNull String vehicleType, VehicleType body) throws Exception;

    public Result deleteVehicleTypeHttp(Http.Request request, Long vehicleTypeId) throws Exception {
        deleteVehicleType(request, vehicleTypeId);
        return ok();

    }

    public abstract void deleteVehicleType(Http.Request request, Long vehicleTypeId) throws Exception;

    public Result getVehicleTypeHttp(Http.Request request, Long vehicleTypeId) throws Exception {
        VehicleType obj = getVehicleType(request, vehicleTypeId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract VehicleType getVehicleType(Http.Request request, Long vehicleTypeId) throws Exception;

    public Result searchVehicleTypesHttp(Http.Request request, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Long retailerId, Long hubId) throws Exception {
        List<VehicleType> obj = searchVehicleTypes(request, sortField, descending, start, limit, activeOnly, retailerId, hubId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (VehicleType curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<VehicleType> searchVehicleTypes(Http.Request request, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Long retailerId, Long hubId) throws Exception;

    public Result updateVehicleTypeHttp(Http.Request request, Long vehicleTypeId, @NotNull String vehicleType, VehicleType body) throws Exception {
        VehicleType obj = updateVehicleType(request, vehicleTypeId, vehicleType, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract VehicleType updateVehicleType(Http.Request request, Long vehicleTypeId, @NotNull String vehicleType, VehicleType body) throws Exception;

}
