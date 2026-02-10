package controllers;

import java.math.BigDecimal;
import apimodels.SirqulResponse;
import apimodels.TaskResponse;

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
public class TaskApiControllerImp extends TaskApiControllerImpInterface {
    @Override
    public TaskResponse createTask(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, String appKey, String groupingId, String endpointURL, String payload, Long scheduledDate, Long startDate, Long endDate, String cronExpression, String visibility, Boolean active) throws Exception {
        //Do your magic!!!
        return new TaskResponse();
    }

    @Override
    public SirqulResponse deleteTask(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long taskId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public TaskResponse getTask(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long taskId) throws Exception {
        //Do your magic!!!
        return new TaskResponse();
    }

    @Override
    public List<TaskResponse> searchTasks(Http.Request request, BigDecimal version, @NotNull Long accountId, String groupingId, String filter, String statuses, String templateTypes, String appKey, String keyword, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly) throws Exception {
        //Do your magic!!!
        return new ArrayList<TaskResponse>();
    }

    @Override
    public TaskResponse updateTask(Http.Request request, BigDecimal version, @NotNull Long taskId, @NotNull Long accountId, String name, String appKey, String groupingId, String endpointURL, String payload, Long scheduledDate, Long startDate, Long endDate, String cronExpression, String visibility, Boolean active) throws Exception {
        //Do your magic!!!
        return new TaskResponse();
    }

}
