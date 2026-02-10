package controllers;

import java.math.BigDecimal;
import apimodels.SirqulResponse;
import apimodels.TaskResponse;

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
public abstract class TaskApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createTaskHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, String appKey, String groupingId, String endpointURL, String payload, Long scheduledDate, Long startDate, Long endDate, String cronExpression, String visibility, Boolean active) throws Exception {
        TaskResponse obj = createTask(request, version, accountId, name, appKey, groupingId, endpointURL, payload, scheduledDate, startDate, endDate, cronExpression, visibility, active);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TaskResponse createTask(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, String appKey, String groupingId, String endpointURL, String payload, Long scheduledDate, Long startDate, Long endDate, String cronExpression, String visibility, Boolean active) throws Exception;

    public Result deleteTaskHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long taskId) throws Exception {
        SirqulResponse obj = deleteTask(request, version, accountId, taskId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteTask(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long taskId) throws Exception;

    public Result getTaskHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long taskId) throws Exception {
        TaskResponse obj = getTask(request, version, accountId, taskId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TaskResponse getTask(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long taskId) throws Exception;

    public Result searchTasksHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, String groupingId, String filter, String statuses, String templateTypes, String appKey, String keyword, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly) throws Exception {
        List<TaskResponse> obj = searchTasks(request, version, accountId, groupingId, filter, statuses, templateTypes, appKey, keyword, sortField, descending, start, limit, activeOnly);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (TaskResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<TaskResponse> searchTasks(Http.Request request, BigDecimal version, @NotNull Long accountId, String groupingId, String filter, String statuses, String templateTypes, String appKey, String keyword, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly) throws Exception;

    public Result updateTaskHttp(Http.Request request, BigDecimal version, @NotNull Long taskId, @NotNull Long accountId, String name, String appKey, String groupingId, String endpointURL, String payload, Long scheduledDate, Long startDate, Long endDate, String cronExpression, String visibility, Boolean active) throws Exception {
        TaskResponse obj = updateTask(request, version, taskId, accountId, name, appKey, groupingId, endpointURL, payload, scheduledDate, startDate, endDate, cronExpression, visibility, active);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TaskResponse updateTask(Http.Request request, BigDecimal version, @NotNull Long taskId, @NotNull Long accountId, String name, String appKey, String groupingId, String endpointURL, String payload, Long scheduledDate, Long startDate, Long endDate, String cronExpression, String visibility, Boolean active) throws Exception;

}
