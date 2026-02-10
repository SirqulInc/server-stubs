package controllers;

import java.math.BigDecimal;
import apimodels.CargoType;

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
public abstract class CargoTypeApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createCargoTypeHttp(Http.Request request, BigDecimal version, CargoType body) throws Exception {
        CargoType obj = createCargoType(request, version, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CargoType createCargoType(Http.Request request, BigDecimal version, CargoType body) throws Exception;

    public Result deleteCargoTypeHttp(Http.Request request, BigDecimal version, Long cargoTypeId) throws Exception {
        deleteCargoType(request, version, cargoTypeId);
        return ok();

    }

    public abstract void deleteCargoType(Http.Request request, BigDecimal version, Long cargoTypeId) throws Exception;

    public Result getCargoTypeHttp(Http.Request request, BigDecimal version, Long cargoTypeId) throws Exception {
        CargoType obj = getCargoType(request, version, cargoTypeId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CargoType getCargoType(Http.Request request, BigDecimal version, Long cargoTypeId) throws Exception;

    public Result searchCargoTypesHttp(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Long retailerId, Long hubId) throws Exception {
        List<CargoType> obj = searchCargoTypes(request, version, sortField, descending, start, limit, activeOnly, retailerId, hubId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (CargoType curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<CargoType> searchCargoTypes(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Long retailerId, Long hubId) throws Exception;

    public Result updateCargoTypeHttp(Http.Request request, BigDecimal version, Long cargoTypeId, CargoType body) throws Exception {
        CargoType obj = updateCargoType(request, version, cargoTypeId, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CargoType updateCargoType(Http.Request request, BigDecimal version, Long cargoTypeId, CargoType body) throws Exception;

}
