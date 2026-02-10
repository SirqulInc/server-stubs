package controllers;

import java.math.BigDecimal;
import apimodels.CsvImportResponse;
import java.io.InputStream;
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
public abstract class CsvImportApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result getStatusCSVHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long batchId, @NotNull String responseGroup, @NotNull Long start, @NotNull Long limit) throws Exception {
        SirqulResponse obj = getStatusCSV(request, version, accountId, batchId, responseGroup, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse getStatusCSV(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long batchId, @NotNull String responseGroup, @NotNull Long start, @NotNull Long limit) throws Exception;

    public Result listStatusCSVHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Integer start, @NotNull Integer limit) throws Exception {
        CsvImportResponse obj = listStatusCSV(request, version, accountId, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CsvImportResponse listStatusCSV(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Integer start, @NotNull Integer limit) throws Exception;

    public Result statusCSVHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long batchId) throws Exception {
        CsvImportResponse obj = statusCSV(request, version, accountId, batchId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CsvImportResponse statusCSV(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long batchId) throws Exception;

    public Result uploadCSVHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String uploadType, @NotNull InputStream importFile, @NotNull String fileFormat, String appKey) throws Exception {
        CsvImportResponse obj = uploadCSV(request, version, accountId, uploadType, importFile, fileFormat, appKey);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CsvImportResponse uploadCSV(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String uploadType, @NotNull InputStream importFile, @NotNull String fileFormat, String appKey) throws Exception;

}
