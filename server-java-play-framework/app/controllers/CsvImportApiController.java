package controllers;

import java.math.BigDecimal;
import apimodels.CsvImportResponse;
import java.io.InputStream;
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
public class CsvImportApiController extends Controller {
    private final CsvImportApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private CsvImportApiController(Config configuration, CsvImportApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getStatusCSV(Http.Request request, BigDecimal version) throws Exception {
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
        String valueresponseGroup = request.getQueryString("responseGroup");
        String responseGroup;
        if (valueresponseGroup != null) {
            responseGroup = valueresponseGroup;
        } else {
            throw new IllegalArgumentException("'responseGroup' parameter is required");
        }
        String valuestart = request.getQueryString("start");
        Long start;
        if (valuestart != null) {
            start = Long.parseLong(valuestart);
        } else {
            throw new IllegalArgumentException("'start' parameter is required");
        }
        String valuelimit = request.getQueryString("limit");
        Long limit;
        if (valuelimit != null) {
            limit = Long.parseLong(valuelimit);
        } else {
            throw new IllegalArgumentException("'limit' parameter is required");
        }
        return imp.getStatusCSVHttp(request, version, accountId, batchId, responseGroup, start, limit);
    }

    @ApiAction
    public Result listStatusCSV(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
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
        return imp.listStatusCSVHttp(request, version, accountId, start, limit);
    }

    @ApiAction
    public Result statusCSV(Http.Request request, BigDecimal version) throws Exception {
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
        return imp.statusCSVHttp(request, version, accountId, batchId);
    }

    @ApiAction
    public Result uploadCSV(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueuploadType = request.getQueryString("uploadType");
        String uploadType;
        if (valueuploadType != null) {
            uploadType = valueuploadType;
        } else {
            throw new IllegalArgumentException("'uploadType' parameter is required");
        }
        String valueimportFile = request.getQueryString("importFile");
        InputStream importFile;
        if (valueimportFile != null) {
            importFile = valueimportFile;
        } else {
            throw new IllegalArgumentException("'importFile' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuefileFormat = request.getQueryString("fileFormat");
        String fileFormat;
        if (valuefileFormat != null) {
            fileFormat = valuefileFormat;
        } else {
            throw new IllegalArgumentException("'fileFormat' parameter is required");
        }
        return imp.uploadCSVHttp(request, version, accountId, uploadType, importFile, fileFormat, appKey);
    }

}
