package controllers;

import java.math.BigDecimal;
import apimodels.ShipmentBatch;
import apimodels.ShipmentImportStatus;

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
public abstract class ShipmentBatchApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createShipmentBatchHttp(Http.Request request, BigDecimal version, ShipmentBatch body) throws Exception {
        ShipmentBatch obj = createShipmentBatch(request, version, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ShipmentBatch createShipmentBatch(Http.Request request, BigDecimal version, ShipmentBatch body) throws Exception;

    public Result deleteShipmentBatchHttp(Http.Request request, BigDecimal version, Long batchId) throws Exception {
        deleteShipmentBatch(request, version, batchId);
        return ok();

    }

    public abstract void deleteShipmentBatch(Http.Request request, BigDecimal version, Long batchId) throws Exception;

    public Result getShipmentBatchHttp(Http.Request request, BigDecimal version, Long batchId) throws Exception {
        ShipmentBatch obj = getShipmentBatch(request, version, batchId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ShipmentBatch getShipmentBatch(Http.Request request, BigDecimal version, Long batchId) throws Exception;

    public Result getShipmentBatchStatusHttp(Http.Request request, BigDecimal version, Long batchId, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, Boolean valid, Boolean started, Boolean completed, Boolean hasShipment, Boolean hasRoute, String keyword) throws Exception {
        List<ShipmentImportStatus> obj = getShipmentBatchStatus(request, version, batchId, accountId, sortField, descending, start, limit, valid, started, completed, hasShipment, hasRoute, keyword);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (ShipmentImportStatus curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<ShipmentImportStatus> getShipmentBatchStatus(Http.Request request, BigDecimal version, Long batchId, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, Boolean valid, Boolean started, Boolean completed, Boolean hasShipment, Boolean hasRoute, String keyword) throws Exception;

    public Result searchShipmentBatchHttp(Http.Request request, BigDecimal version, @NotNull Long hubId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit) throws Exception {
        List<ShipmentBatch> obj = searchShipmentBatch(request, version, hubId, sortField, descending, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (ShipmentBatch curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<ShipmentBatch> searchShipmentBatch(Http.Request request, BigDecimal version, @NotNull Long hubId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit) throws Exception;

}
