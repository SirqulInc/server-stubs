package controllers;

import java.math.BigDecimal;
import apimodels.RegionLegSummary;
import apimodels.ReportBatchResponse;
import apimodels.ReportRegionLegSummaryBatchResponse;
import apimodels.ReportResponse;
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
public abstract class ReportingApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createBatchHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String status, @NotNull Integer previewLimit, String appKey, String endpoint, String parameters, String name, Long startDate, Long endDate, String description, String pageUrl) throws Exception {
        ReportBatchResponse obj = createBatch(request, version, accountId, status, previewLimit, appKey, endpoint, parameters, name, startDate, endDate, description, pageUrl);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ReportBatchResponse createBatch(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String status, @NotNull Integer previewLimit, String appKey, String endpoint, String parameters, String name, Long startDate, Long endDate, String description, String pageUrl) throws Exception;

    public Result createRegionLegSummaryBatchHttp(Http.Request request, BigDecimal version, List<@Valid RegionLegSummary> body) throws Exception {
        ReportRegionLegSummaryBatchResponse obj = createRegionLegSummaryBatch(request, version, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ReportRegionLegSummaryBatchResponse createRegionLegSummaryBatch(Http.Request request, BigDecimal version, List<@Valid RegionLegSummary> body) throws Exception;

    public Result deleteBatchHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long batchId) throws Exception {
        SirqulResponse obj = deleteBatch(request, version, accountId, batchId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteBatch(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long batchId) throws Exception;

    public Result getReportBatchHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long batchId, @NotNull Boolean allResults) throws Exception {
        ReportBatchResponse obj = getReportBatch(request, version, accountId, batchId, allResults);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ReportBatchResponse getReportBatch(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long batchId, @NotNull Boolean allResults) throws Exception;

    public Result runReportHttp(Http.Request request, BigDecimal version, @NotNull Boolean desc, Long accountId, String query, String parameters, String order, Long start, Long limit, String responseFormat) throws Exception {
        ReportResponse obj = runReport(request, version, desc, accountId, query, parameters, order, start, limit, responseFormat);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ReportResponse runReport(Http.Request request, BigDecimal version, @NotNull Boolean desc, Long accountId, String query, String parameters, String order, Long start, Long limit, String responseFormat) throws Exception;

    public Result searchBatchHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Integer start, @NotNull Integer limit, String names, String appKey, String status, Boolean globalAppSearch, Long startDate, Long endDate) throws Exception {
        List<ReportBatchResponse> obj = searchBatch(request, version, accountId, start, limit, names, appKey, status, globalAppSearch, startDate, endDate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (ReportBatchResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<ReportBatchResponse> searchBatch(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Integer start, @NotNull Integer limit, String names, String appKey, String status, Boolean globalAppSearch, Long startDate, Long endDate) throws Exception;

}
