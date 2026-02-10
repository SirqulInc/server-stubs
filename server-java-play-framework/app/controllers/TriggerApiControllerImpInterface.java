package controllers;

import java.math.BigDecimal;
import apimodels.SirqulResponse;
import apimodels.TriggerResponse;

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
public abstract class TriggerApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createTriggerHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, String appKey, String groupingId, String endpointURL, String payload, Long scheduledDate, Long startDate, Long endDate, String cronExpression, String conditionalInput, String visibility, Boolean active) throws Exception {
        TriggerResponse obj = createTrigger(request, version, accountId, name, appKey, groupingId, endpointURL, payload, scheduledDate, startDate, endDate, cronExpression, conditionalInput, visibility, active);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TriggerResponse createTrigger(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, String appKey, String groupingId, String endpointURL, String payload, Long scheduledDate, Long startDate, Long endDate, String cronExpression, String conditionalInput, String visibility, Boolean active) throws Exception;

    public Result deleteTriggerHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long triggerId) throws Exception {
        SirqulResponse obj = deleteTrigger(request, version, accountId, triggerId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteTrigger(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long triggerId) throws Exception;

    public Result getTriggerHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long triggerId) throws Exception {
        TriggerResponse obj = getTrigger(request, version, accountId, triggerId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TriggerResponse getTrigger(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long triggerId) throws Exception;

    public Result searchTriggersHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, String groupingId, String filter, String statuses, String templateTypes, String appKey, String keyword, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly) throws Exception {
        List<TriggerResponse> obj = searchTriggers(request, version, accountId, groupingId, filter, statuses, templateTypes, appKey, keyword, sortField, descending, start, limit, activeOnly);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (TriggerResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<TriggerResponse> searchTriggers(Http.Request request, BigDecimal version, @NotNull Long accountId, String groupingId, String filter, String statuses, String templateTypes, String appKey, String keyword, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly) throws Exception;

    public Result updateTriggerHttp(Http.Request request, BigDecimal version, @NotNull Long triggerId, @NotNull Long accountId, String name, String appKey, String groupingId, String endpointURL, String payload, Long scheduledDate, Long startDate, Long endDate, String cronExpression, String conditionalInput, String visibility, Boolean active) throws Exception {
        TriggerResponse obj = updateTrigger(request, version, triggerId, accountId, name, appKey, groupingId, endpointURL, payload, scheduledDate, startDate, endDate, cronExpression, conditionalInput, visibility, active);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TriggerResponse updateTrigger(Http.Request request, BigDecimal version, @NotNull Long triggerId, @NotNull Long accountId, String name, String appKey, String groupingId, String endpointURL, String payload, Long scheduledDate, Long startDate, Long endDate, String cronExpression, String conditionalInput, String visibility, Boolean active) throws Exception;

}
