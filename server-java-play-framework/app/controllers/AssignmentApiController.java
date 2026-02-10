package controllers;

import apimodels.AccountMiniResponse;
import apimodels.AssignmentResponse;
import apimodels.AssignmentStatusResponse;
import java.math.BigDecimal;
import apimodels.SirqulResponse;

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
public class AssignmentApiController extends Controller {
    private final AssignmentApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private AssignmentApiController(Config configuration, AssignmentApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result assigmentAssigneeAccountSearch(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        return imp.assigmentAssigneeAccountSearchHttp(request, version, accountId, keyword);
    }

    @ApiAction
    public Result assignmentCreate(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            throw new IllegalArgumentException("'name' parameter is required");
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valueassigneeAccountId = request.getQueryString("assigneeAccountId");
        Long assigneeAccountId;
        if (valueassigneeAccountId != null) {
            assigneeAccountId = Long.parseLong(valueassigneeAccountId);
        } else {
            throw new IllegalArgumentException("'assigneeAccountId' parameter is required");
        }
        String valueretailerLocationId = request.getQueryString("retailerLocationId");
        Long retailerLocationId;
        if (valueretailerLocationId != null) {
            retailerLocationId = Long.parseLong(valueretailerLocationId);
        } else {
            retailerLocationId = null;
        }
        String valuetags = request.getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            tags = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        return imp.assignmentCreateHttp(request, version, accountId, name, assigneeAccountId, description, retailerLocationId, tags, active);
    }

    @ApiAction
    public Result assignmentDelete(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueassignmentId = request.getQueryString("assignmentId");
        Long assignmentId;
        if (valueassignmentId != null) {
            assignmentId = Long.parseLong(valueassignmentId);
        } else {
            throw new IllegalArgumentException("'assignmentId' parameter is required");
        }
        return imp.assignmentDeleteHttp(request, version, accountId, assignmentId);
    }

    @ApiAction
    public Result assignmentGet(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueassignmentId = request.getQueryString("assignmentId");
        Long assignmentId;
        if (valueassignmentId != null) {
            assignmentId = Long.parseLong(valueassignmentId);
        } else {
            throw new IllegalArgumentException("'assignmentId' parameter is required");
        }
        return imp.assignmentGetHttp(request, version, accountId, assignmentId);
    }

    @ApiAction
    public Result assignmentSearch(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuecreatorAccountId = request.getQueryString("creatorAccountId");
        Long creatorAccountId;
        if (valuecreatorAccountId != null) {
            creatorAccountId = Long.parseLong(valuecreatorAccountId);
        } else {
            creatorAccountId = null;
        }
        String valueassigneeAccountIds = request.getQueryString("assigneeAccountIds");
        String assigneeAccountIds;
        if (valueassigneeAccountIds != null) {
            assigneeAccountIds = valueassigneeAccountIds;
        } else {
            assigneeAccountIds = null;
        }
        String valueretailerLocationIds = request.getQueryString("retailerLocationIds");
        String retailerLocationIds;
        if (valueretailerLocationIds != null) {
            retailerLocationIds = valueretailerLocationIds;
        } else {
            retailerLocationIds = null;
        }
        String valuecurrentStatusType = request.getQueryString("currentStatusType");
        String currentStatusType;
        if (valuecurrentStatusType != null) {
            currentStatusType = valuecurrentStatusType;
        } else {
            currentStatusType = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
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
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            throw new IllegalArgumentException("'activeOnly' parameter is required");
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
        return imp.assignmentSearchHttp(request, version, accountId, sortField, descending, activeOnly, start, limit, creatorAccountId, assigneeAccountIds, retailerLocationIds, currentStatusType, keyword);
    }

    @ApiAction
    public Result assignmentStatusCreate(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueassignmentId = request.getQueryString("assignmentId");
        Long assignmentId;
        if (valueassignmentId != null) {
            assignmentId = Long.parseLong(valueassignmentId);
        } else {
            throw new IllegalArgumentException("'assignmentId' parameter is required");
        }
        String valuescheduledNotificationId = request.getQueryString("scheduledNotificationId");
        Long scheduledNotificationId;
        if (valuescheduledNotificationId != null) {
            scheduledNotificationId = Long.parseLong(valuescheduledNotificationId);
        } else {
            scheduledNotificationId = null;
        }
        String valuetoDo = request.getQueryString("toDo");
        String toDo;
        if (valuetoDo != null) {
            toDo = valuetoDo;
        } else {
            toDo = null;
        }
        String valueconnection = request.getQueryString("connection");
        String connection;
        if (valueconnection != null) {
            connection = valueconnection;
        } else {
            connection = null;
        }
        String valuemethod = request.getQueryString("method");
        String method;
        if (valuemethod != null) {
            method = valuemethod;
        } else {
            method = null;
        }
        String valuestatus = request.getQueryString("status");
        String status;
        if (valuestatus != null) {
            status = valuestatus;
        } else {
            status = null;
        }
        String valueclosure = request.getQueryString("closure");
        String closure;
        if (valueclosure != null) {
            closure = valueclosure;
        } else {
            closure = null;
        }
        String valuemessage = request.getQueryString("message");
        String message;
        if (valuemessage != null) {
            message = valuemessage;
        } else {
            message = null;
        }
        String valuefollowUp = request.getQueryString("followUp");
        Long followUp;
        if (valuefollowUp != null) {
            followUp = Long.parseLong(valuefollowUp);
        } else {
            followUp = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        return imp.assignmentStatusCreateHttp(request, version, accountId, assignmentId, scheduledNotificationId, toDo, connection, method, status, closure, message, followUp, active);
    }

    @ApiAction
    public Result assignmentStatusDelete(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueassignmentStatusId = request.getQueryString("assignmentStatusId");
        Long assignmentStatusId;
        if (valueassignmentStatusId != null) {
            assignmentStatusId = Long.parseLong(valueassignmentStatusId);
        } else {
            throw new IllegalArgumentException("'assignmentStatusId' parameter is required");
        }
        return imp.assignmentStatusDeleteHttp(request, version, accountId, assignmentStatusId);
    }

    @ApiAction
    public Result assignmentStatusGet(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueassignmentStatusId = request.getQueryString("assignmentStatusId");
        Long assignmentStatusId;
        if (valueassignmentStatusId != null) {
            assignmentStatusId = Long.parseLong(valueassignmentStatusId);
        } else {
            throw new IllegalArgumentException("'assignmentStatusId' parameter is required");
        }
        return imp.assignmentStatusGetHttp(request, version, accountId, assignmentStatusId);
    }

    @ApiAction
    public Result assignmentStatusSearch(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueassignmentId = request.getQueryString("assignmentId");
        Long assignmentId;
        if (valueassignmentId != null) {
            assignmentId = Long.parseLong(valueassignmentId);
        } else {
            assignmentId = null;
        }
        String valuecreatorAccountId = request.getQueryString("creatorAccountId");
        Long creatorAccountId;
        if (valuecreatorAccountId != null) {
            creatorAccountId = Long.parseLong(valuecreatorAccountId);
        } else {
            creatorAccountId = null;
        }
        String valueassigneeAccountId = request.getQueryString("assigneeAccountId");
        Long assigneeAccountId;
        if (valueassigneeAccountId != null) {
            assigneeAccountId = Long.parseLong(valueassigneeAccountId);
        } else {
            assigneeAccountId = null;
        }
        String valueretailerLocationId = request.getQueryString("retailerLocationId");
        Long retailerLocationId;
        if (valueretailerLocationId != null) {
            retailerLocationId = Long.parseLong(valueretailerLocationId);
        } else {
            retailerLocationId = null;
        }
        String valuestatusType = request.getQueryString("statusType");
        String statusType;
        if (valuestatusType != null) {
            statusType = valuestatusType;
        } else {
            statusType = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
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
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            throw new IllegalArgumentException("'activeOnly' parameter is required");
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
        return imp.assignmentStatusSearchHttp(request, version, accountId, sortField, descending, activeOnly, start, limit, assignmentId, creatorAccountId, assigneeAccountId, retailerLocationId, statusType, keyword);
    }

    @ApiAction
    public Result assignmentStatusUpdate(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueassignmentStatusId = request.getQueryString("assignmentStatusId");
        Long assignmentStatusId;
        if (valueassignmentStatusId != null) {
            assignmentStatusId = Long.parseLong(valueassignmentStatusId);
        } else {
            throw new IllegalArgumentException("'assignmentStatusId' parameter is required");
        }
        String valuescheduledNotificationId = request.getQueryString("scheduledNotificationId");
        Long scheduledNotificationId;
        if (valuescheduledNotificationId != null) {
            scheduledNotificationId = Long.parseLong(valuescheduledNotificationId);
        } else {
            scheduledNotificationId = null;
        }
        String valuetoDo = request.getQueryString("toDo");
        String toDo;
        if (valuetoDo != null) {
            toDo = valuetoDo;
        } else {
            toDo = null;
        }
        String valueconnection = request.getQueryString("connection");
        String connection;
        if (valueconnection != null) {
            connection = valueconnection;
        } else {
            connection = null;
        }
        String valuemethod = request.getQueryString("method");
        String method;
        if (valuemethod != null) {
            method = valuemethod;
        } else {
            method = null;
        }
        String valuestatus = request.getQueryString("status");
        String status;
        if (valuestatus != null) {
            status = valuestatus;
        } else {
            status = null;
        }
        String valueclosure = request.getQueryString("closure");
        String closure;
        if (valueclosure != null) {
            closure = valueclosure;
        } else {
            closure = null;
        }
        String valuemessage = request.getQueryString("message");
        String message;
        if (valuemessage != null) {
            message = valuemessage;
        } else {
            message = null;
        }
        String valuefollowUp = request.getQueryString("followUp");
        Long followUp;
        if (valuefollowUp != null) {
            followUp = Long.parseLong(valuefollowUp);
        } else {
            followUp = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        return imp.assignmentStatusUpdateHttp(request, version, accountId, assignmentStatusId, scheduledNotificationId, toDo, connection, method, status, closure, message, followUp, active);
    }

    @ApiAction
    public Result assignmentUpdate(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueassignmentId = request.getQueryString("assignmentId");
        Long assignmentId;
        if (valueassignmentId != null) {
            assignmentId = Long.parseLong(valueassignmentId);
        } else {
            throw new IllegalArgumentException("'assignmentId' parameter is required");
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            name = null;
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valueassigneeAccountId = request.getQueryString("assigneeAccountId");
        Long assigneeAccountId;
        if (valueassigneeAccountId != null) {
            assigneeAccountId = Long.parseLong(valueassigneeAccountId);
        } else {
            assigneeAccountId = null;
        }
        String valueretailerLocationId = request.getQueryString("retailerLocationId");
        Long retailerLocationId;
        if (valueretailerLocationId != null) {
            retailerLocationId = Long.parseLong(valueretailerLocationId);
        } else {
            retailerLocationId = null;
        }
        String valuetags = request.getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            tags = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        return imp.assignmentUpdateHttp(request, version, accountId, assignmentId, name, description, assigneeAccountId, retailerLocationId, tags, active);
    }

}
