package controllers;

import java.math.BigDecimal;
import apimodels.DisbursementResponse;

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
public class DisbursementApiControllerImp extends DisbursementApiControllerImpInterface {
    @Override
    public DisbursementResponse checkDisbursements(Http.Request request, BigDecimal version, @NotNull Long disbursementId) throws Exception {
        //Do your magic!!!
        return new DisbursementResponse();
    }

    @Override
    public DisbursementResponse createDisbursement(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long receiverAccountId, @NotNull Long originalSenderAccountId, @NotNull BigDecimal amount, @NotNull String provider, Long scheduledDate, String title, String comment, String externalId, String introspectionParams) throws Exception {
        //Do your magic!!!
        return new DisbursementResponse();
    }

    @Override
    public DisbursementResponse getDisbursement(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long disbursementId) throws Exception {
        //Do your magic!!!
        return new DisbursementResponse();
    }

    @Override
    public List<DisbursementResponse> searchDisbursements(Http.Request request, BigDecimal version, @NotNull Long accountId, Long receiverAccountId, String statuses, String providers, Long beforeDate, Long afterDate, Integer start, Integer limit, Boolean activeOnly, String externalId) throws Exception {
        //Do your magic!!!
        return new ArrayList<DisbursementResponse>();
    }

    @Override
    public DisbursementResponse updateDisbursement(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long disbursementId, BigDecimal amount, String provider, Long scheduledDate, String title, String comment, String externalId, Boolean retry, String introspectionParams) throws Exception {
        //Do your magic!!!
        return new DisbursementResponse();
    }

}
