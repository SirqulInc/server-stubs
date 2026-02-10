package controllers;

import apimodels.AccountMiniResponse;
import apimodels.AssignmentResponse;
import apimodels.AssignmentStatusResponse;
import java.math.BigDecimal;
import apimodels.SirqulResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AssignmentApiControllerImp extends AssignmentApiControllerImpInterface {
    @Override
    public List<AccountMiniResponse> assigmentAssigneeAccountSearch(Http.Request request, BigDecimal version, @NotNull Long accountId, String keyword) throws Exception {
        //Do your magic!!!
        return new ArrayList<AccountMiniResponse>();
    }

    @Override
    public AssignmentResponse assignmentCreate(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, @NotNull Long assigneeAccountId, String description, Long retailerLocationId, String tags, Boolean active) throws Exception {
        //Do your magic!!!
        return new AssignmentResponse();
    }

    @Override
    public SirqulResponse assignmentDelete(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long assignmentId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public AssignmentResponse assignmentGet(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long assignmentId) throws Exception {
        //Do your magic!!!
        return new AssignmentResponse();
    }

    @Override
    public List<AssignmentResponse> assignmentSearch(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Boolean activeOnly, @NotNull Integer start, @NotNull Integer limit, Long creatorAccountId, String assigneeAccountIds, String retailerLocationIds, String currentStatusType, String keyword) throws Exception {
        //Do your magic!!!
        return new ArrayList<AssignmentResponse>();
    }

    @Override
    public AssignmentStatusResponse assignmentStatusCreate(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long assignmentId, Long scheduledNotificationId, String toDo, String connection, String method, String status, String closure, String message, Long followUp, Boolean active) throws Exception {
        //Do your magic!!!
        return new AssignmentStatusResponse();
    }

    @Override
    public SirqulResponse assignmentStatusDelete(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long assignmentStatusId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public AssignmentStatusResponse assignmentStatusGet(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long assignmentStatusId) throws Exception {
        //Do your magic!!!
        return new AssignmentStatusResponse();
    }

    @Override
    public List<AssignmentStatusResponse> assignmentStatusSearch(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Boolean activeOnly, @NotNull Integer start, @NotNull Integer limit, Long assignmentId, Long creatorAccountId, Long assigneeAccountId, Long retailerLocationId, String statusType, String keyword) throws Exception {
        //Do your magic!!!
        return new ArrayList<AssignmentStatusResponse>();
    }

    @Override
    public AssignmentStatusResponse assignmentStatusUpdate(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long assignmentStatusId, Long scheduledNotificationId, String toDo, String connection, String method, String status, String closure, String message, Long followUp, Boolean active) throws Exception {
        //Do your magic!!!
        return new AssignmentStatusResponse();
    }

    @Override
    public AssignmentResponse assignmentUpdate(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long assignmentId, String name, String description, Long assigneeAccountId, Long retailerLocationId, String tags, Boolean active) throws Exception {
        //Do your magic!!!
        return new AssignmentResponse();
    }

}
