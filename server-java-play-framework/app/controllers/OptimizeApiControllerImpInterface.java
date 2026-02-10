package controllers;

import java.math.BigDecimal;
import apimodels.ImportStatuses;
import java.util.Map;
import apimodels.Orders;
import apimodels.ShipmentOrder;

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
public abstract class OptimizeApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result getOptimizationResultHttp(Http.Request request, BigDecimal version, String batchID, @NotNull Integer start, @NotNull Integer limit) throws Exception {
        Map<String, ShipmentOrder> obj = getOptimizationResult(request, version, batchID, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Map.Entry<String, ShipmentOrder> entry : obj.entrySet()) {
                OpenAPIUtils.validate(entry.getValue());
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Map<String, ShipmentOrder> getOptimizationResult(Http.Request request, BigDecimal version, String batchID, @NotNull Integer start, @NotNull Integer limit) throws Exception;

    public Result requestOptimizationHttp(Http.Request request, BigDecimal version, Orders body) throws Exception {
        ImportStatuses obj = requestOptimization(request, version, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ImportStatuses requestOptimization(Http.Request request, BigDecimal version, Orders body) throws Exception;

}
