package controllers;

import java.math.BigDecimal;
import apimodels.CsvImportResponse;
import java.io.InputStream;
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
public class CsvImportApiControllerImp extends CsvImportApiControllerImpInterface {
    @Override
    public SirqulResponse getStatusCSV(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long batchId, @NotNull String responseGroup, @NotNull Long start, @NotNull Long limit) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public CsvImportResponse listStatusCSV(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Integer start, @NotNull Integer limit) throws Exception {
        //Do your magic!!!
        return new CsvImportResponse();
    }

    @Override
    public CsvImportResponse statusCSV(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long batchId) throws Exception {
        //Do your magic!!!
        return new CsvImportResponse();
    }

    @Override
    public CsvImportResponse uploadCSV(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String uploadType, @NotNull InputStream importFile, @NotNull String fileFormat, String appKey) throws Exception {
        //Do your magic!!!
        return new CsvImportResponse();
    }

}
