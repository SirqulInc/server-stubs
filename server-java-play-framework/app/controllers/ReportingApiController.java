package controllers;

import java.math.BigDecimal;
import apimodels.RegionLegSummary;
import apimodels.ReportBatchResponse;
import apimodels.ReportRegionLegSummaryBatchResponse;
import apimodels.ReportResponse;
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
public class ReportingApiController extends Controller {
    private final ReportingApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ReportingApiController(Config configuration, ReportingApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createBatch(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuestatus = request.getQueryString("status");
        String status;
        if (valuestatus != null) {
            status = valuestatus;
        } else {
            throw new IllegalArgumentException("'status' parameter is required");
        }
        String valueendpoint = request.getQueryString("endpoint");
        String endpoint;
        if (valueendpoint != null) {
            endpoint = valueendpoint;
        } else {
            endpoint = null;
        }
        String valueparameters = request.getQueryString("parameters");
        String parameters;
        if (valueparameters != null) {
            parameters = valueparameters;
        } else {
            parameters = null;
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            name = null;
        }
        String valuestartDate = request.getQueryString("startDate");
        Long startDate;
        if (valuestartDate != null) {
            startDate = Long.parseLong(valuestartDate);
        } else {
            startDate = null;
        }
        String valueendDate = request.getQueryString("endDate");
        Long endDate;
        if (valueendDate != null) {
            endDate = Long.parseLong(valueendDate);
        } else {
            endDate = null;
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuepreviewLimit = request.getQueryString("previewLimit");
        Integer previewLimit;
        if (valuepreviewLimit != null) {
            previewLimit = Integer.parseInt(valuepreviewLimit);
        } else {
            throw new IllegalArgumentException("'previewLimit' parameter is required");
        }
        String valuepageUrl = request.getQueryString("pageUrl");
        String pageUrl;
        if (valuepageUrl != null) {
            pageUrl = valuepageUrl;
        } else {
            pageUrl = null;
        }
        return imp.createBatchHttp(request, version, accountId, status, previewLimit, appKey, endpoint, parameters, name, startDate, endDate, description, pageUrl);
    }

    @ApiAction
    public Result createRegionLegSummaryBatch(Http.Request request, BigDecimal version) throws Exception {
        JsonNode nodebody = request.body().asJson();
        List<@Valid RegionLegSummary> body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), new TypeReference<List<@Valid RegionLegSummary>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (RegionLegSummary curItem : body) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            body = null;
        }
        return imp.createRegionLegSummaryBatchHttp(request, version, body);
    }

    @ApiAction
    public Result deleteBatch(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuebatchId = request.getQueryString("batchId");
        Long batchId;
        if (valuebatchId != null) {
            batchId = Long.parseLong(valuebatchId);
        } else {
            throw new IllegalArgumentException("'batchId' parameter is required");
        }
        return imp.deleteBatchHttp(request, version, accountId, batchId);
    }

    @ApiAction
    public Result getReportBatch(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuebatchId = request.getQueryString("batchId");
        Long batchId;
        if (valuebatchId != null) {
            batchId = Long.parseLong(valuebatchId);
        } else {
            throw new IllegalArgumentException("'batchId' parameter is required");
        }
        String valueallResults = request.getQueryString("allResults");
        Boolean allResults;
        if (valueallResults != null) {
            allResults = Boolean.valueOf(valueallResults);
        } else {
            throw new IllegalArgumentException("'allResults' parameter is required");
        }
        return imp.getReportBatchHttp(request, version, accountId, batchId, allResults);
    }

    @ApiAction
    public Result runReport(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuequery = request.getQueryString("query");
        String query;
        if (valuequery != null) {
            query = valuequery;
        } else {
            query = null;
        }
        String valueparameters = request.getQueryString("parameters");
        String parameters;
        if (valueparameters != null) {
            parameters = valueparameters;
        } else {
            parameters = null;
        }
        String valueorder = request.getQueryString("order");
        String order;
        if (valueorder != null) {
            order = valueorder;
        } else {
            order = null;
        }
        String valuedesc = request.getQueryString("desc");
        Boolean desc;
        if (valuedesc != null) {
            desc = Boolean.valueOf(valuedesc);
        } else {
            throw new IllegalArgumentException("'desc' parameter is required");
        }
        String valuestart = request.getQueryString("start");
        Long start;
        if (valuestart != null) {
            start = Long.parseLong(valuestart);
        } else {
            start = null;
        }
        String valuelimit = request.getQueryString("limit");
        Long limit;
        if (valuelimit != null) {
            limit = Long.parseLong(valuelimit);
        } else {
            limit = null;
        }
        String valueresponseFormat = request.getQueryString("responseFormat");
        String responseFormat;
        if (valueresponseFormat != null) {
            responseFormat = valueresponseFormat;
        } else {
            responseFormat = null;
        }
        return imp.runReportHttp(request, version, desc, accountId, query, parameters, order, start, limit, responseFormat);
    }

    @ApiAction
    public Result searchBatch(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuenames = request.getQueryString("names");
        String names;
        if (valuenames != null) {
            names = valuenames;
        } else {
            names = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuestatus = request.getQueryString("status");
        String status;
        if (valuestatus != null) {
            status = valuestatus;
        } else {
            status = null;
        }
        String valueglobalAppSearch = request.getQueryString("globalAppSearch");
        Boolean globalAppSearch;
        if (valueglobalAppSearch != null) {
            globalAppSearch = Boolean.valueOf(valueglobalAppSearch);
        } else {
            globalAppSearch = null;
        }
        String valuestartDate = request.getQueryString("startDate");
        Long startDate;
        if (valuestartDate != null) {
            startDate = Long.parseLong(valuestartDate);
        } else {
            startDate = null;
        }
        String valueendDate = request.getQueryString("endDate");
        Long endDate;
        if (valueendDate != null) {
            endDate = Long.parseLong(valueendDate);
        } else {
            endDate = null;
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
        return imp.searchBatchHttp(request, version, accountId, start, limit, names, appKey, status, globalAppSearch, startDate, endDate);
    }

}
