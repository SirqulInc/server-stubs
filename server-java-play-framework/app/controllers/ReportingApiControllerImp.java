package controllers;

import java.math.BigDecimal;
import apimodels.RegionLegSummary;
import apimodels.ReportBatchResponse;
import apimodels.ReportRegionLegSummaryBatchResponse;
import apimodels.ReportResponse;
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
public class ReportingApiControllerImp extends ReportingApiControllerImpInterface {
    @Override
    public ReportBatchResponse createBatch(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String status, @NotNull Integer previewLimit, String appKey, String endpoint, String parameters, String name, Long startDate, Long endDate, String description, String pageUrl) throws Exception {
        //Do your magic!!!
        return new ReportBatchResponse();
    }

    @Override
    public ReportRegionLegSummaryBatchResponse createRegionLegSummaryBatch(Http.Request request, BigDecimal version, List<@Valid RegionLegSummary> body) throws Exception {
        //Do your magic!!!
        return new ReportRegionLegSummaryBatchResponse();
    }

    @Override
    public SirqulResponse deleteBatch(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long batchId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public ReportBatchResponse getReportBatch(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long batchId, @NotNull Boolean allResults) throws Exception {
        //Do your magic!!!
        return new ReportBatchResponse();
    }

    @Override
    public ReportResponse runReport(Http.Request request, BigDecimal version, @NotNull Boolean desc, Long accountId, String query, String parameters, String order, Long start, Long limit, String responseFormat) throws Exception {
        //Do your magic!!!
        return new ReportResponse();
    }

    @Override
    public List<ReportBatchResponse> searchBatch(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Integer start, @NotNull Integer limit, String names, String appKey, String status, Boolean globalAppSearch, Long startDate, Long endDate) throws Exception {
        //Do your magic!!!
        return new ArrayList<ReportBatchResponse>();
    }

}
