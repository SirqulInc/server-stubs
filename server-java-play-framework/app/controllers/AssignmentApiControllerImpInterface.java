package controllers;

import apimodels.AccountMiniResponse;
import apimodels.AssignmentResponse;
import apimodels.AssignmentStatusResponse;
import java.math.BigDecimal;
import apimodels.SirqulResponse;

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
public abstract class AssignmentApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result assigmentAssigneeAccountSearchHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, String keyword) throws Exception {
        List<AccountMiniResponse> obj = assigmentAssigneeAccountSearch(request, version, accountId, keyword);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (AccountMiniResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<AccountMiniResponse> assigmentAssigneeAccountSearch(Http.Request request, BigDecimal version, @NotNull Long accountId, String keyword) throws Exception;

    public Result assignmentCreateHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, @NotNull Long assigneeAccountId, String description, Long retailerLocationId, String tags, Boolean active) throws Exception {
        AssignmentResponse obj = assignmentCreate(request, version, accountId, name, assigneeAccountId, description, retailerLocationId, tags, active);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AssignmentResponse assignmentCreate(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, @NotNull Long assigneeAccountId, String description, Long retailerLocationId, String tags, Boolean active) throws Exception;

    public Result assignmentDeleteHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long assignmentId) throws Exception {
        SirqulResponse obj = assignmentDelete(request, version, accountId, assignmentId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse assignmentDelete(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long assignmentId) throws Exception;

    public Result assignmentGetHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long assignmentId) throws Exception {
        AssignmentResponse obj = assignmentGet(request, version, accountId, assignmentId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AssignmentResponse assignmentGet(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long assignmentId) throws Exception;

    public Result assignmentSearchHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Boolean activeOnly, @NotNull Integer start, @NotNull Integer limit, Long creatorAccountId, String assigneeAccountIds, String retailerLocationIds, String currentStatusType, String keyword) throws Exception {
        List<AssignmentResponse> obj = assignmentSearch(request, version, accountId, sortField, descending, activeOnly, start, limit, creatorAccountId, assigneeAccountIds, retailerLocationIds, currentStatusType, keyword);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (AssignmentResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<AssignmentResponse> assignmentSearch(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Boolean activeOnly, @NotNull Integer start, @NotNull Integer limit, Long creatorAccountId, String assigneeAccountIds, String retailerLocationIds, String currentStatusType, String keyword) throws Exception;

    public Result assignmentStatusCreateHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long assignmentId, Long scheduledNotificationId, String toDo, String connection, String method, String status, String closure, String message, Long followUp, Boolean active) throws Exception {
        AssignmentStatusResponse obj = assignmentStatusCreate(request, version, accountId, assignmentId, scheduledNotificationId, toDo, connection, method, status, closure, message, followUp, active);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AssignmentStatusResponse assignmentStatusCreate(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long assignmentId, Long scheduledNotificationId, String toDo, String connection, String method, String status, String closure, String message, Long followUp, Boolean active) throws Exception;

    public Result assignmentStatusDeleteHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long assignmentStatusId) throws Exception {
        SirqulResponse obj = assignmentStatusDelete(request, version, accountId, assignmentStatusId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse assignmentStatusDelete(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long assignmentStatusId) throws Exception;

    public Result assignmentStatusGetHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long assignmentStatusId) throws Exception {
        AssignmentStatusResponse obj = assignmentStatusGet(request, version, accountId, assignmentStatusId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AssignmentStatusResponse assignmentStatusGet(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long assignmentStatusId) throws Exception;

    public Result assignmentStatusSearchHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Boolean activeOnly, @NotNull Integer start, @NotNull Integer limit, Long assignmentId, Long creatorAccountId, Long assigneeAccountId, Long retailerLocationId, String statusType, String keyword) throws Exception {
        List<AssignmentStatusResponse> obj = assignmentStatusSearch(request, version, accountId, sortField, descending, activeOnly, start, limit, assignmentId, creatorAccountId, assigneeAccountId, retailerLocationId, statusType, keyword);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (AssignmentStatusResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<AssignmentStatusResponse> assignmentStatusSearch(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Boolean activeOnly, @NotNull Integer start, @NotNull Integer limit, Long assignmentId, Long creatorAccountId, Long assigneeAccountId, Long retailerLocationId, String statusType, String keyword) throws Exception;

    public Result assignmentStatusUpdateHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long assignmentStatusId, Long scheduledNotificationId, String toDo, String connection, String method, String status, String closure, String message, Long followUp, Boolean active) throws Exception {
        AssignmentStatusResponse obj = assignmentStatusUpdate(request, version, accountId, assignmentStatusId, scheduledNotificationId, toDo, connection, method, status, closure, message, followUp, active);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AssignmentStatusResponse assignmentStatusUpdate(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long assignmentStatusId, Long scheduledNotificationId, String toDo, String connection, String method, String status, String closure, String message, Long followUp, Boolean active) throws Exception;

    public Result assignmentUpdateHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long assignmentId, String name, String description, Long assigneeAccountId, Long retailerLocationId, String tags, Boolean active) throws Exception {
        AssignmentResponse obj = assignmentUpdate(request, version, accountId, assignmentId, name, description, assigneeAccountId, retailerLocationId, tags, active);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AssignmentResponse assignmentUpdate(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long assignmentId, String name, String description, Long assigneeAccountId, Long retailerLocationId, String tags, Boolean active) throws Exception;

}
