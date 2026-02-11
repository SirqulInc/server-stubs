package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.RegionLegSummary;
import org.openapitools.model.ReportBatchResponse;
import org.openapitools.model.ReportRegionLegSummaryBatchResponse;
import org.openapitools.model.ReportResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface ReportApiService {
      Response createBatch(Long accountId,String status,Integer previewLimit,String appKey,String endpoint,String parameters,String name,Long startDate,Long endDate,String description,String pageUrl,SecurityContext securityContext)
      throws NotFoundException;
      Response createRegionLegSummaryBatch(List<@Valid RegionLegSummary> body,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteBatch(Long accountId,Long batchId,SecurityContext securityContext)
      throws NotFoundException;
      Response getReportBatch(Long accountId,Long batchId,Boolean allResults,SecurityContext securityContext)
      throws NotFoundException;
      Response runReport(Boolean desc,Long accountId,String query,String parameters,String order,Long start,Long limit,String responseFormat,SecurityContext securityContext)
      throws NotFoundException;
      Response searchBatch(Long accountId,Integer start,Integer limit,String names,String appKey,String status,Boolean globalAppSearch,Long startDate,Long endDate,SecurityContext securityContext)
      throws NotFoundException;


}
