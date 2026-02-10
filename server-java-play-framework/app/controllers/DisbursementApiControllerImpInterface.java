package controllers;

import java.math.BigDecimal;
import apimodels.DisbursementResponse;

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
public abstract class DisbursementApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result checkDisbursementsHttp(Http.Request request, BigDecimal version, @NotNull Long disbursementId) throws Exception {
        DisbursementResponse obj = checkDisbursements(request, version, disbursementId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DisbursementResponse checkDisbursements(Http.Request request, BigDecimal version, @NotNull Long disbursementId) throws Exception;

    public Result createDisbursementHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long receiverAccountId, @NotNull Long originalSenderAccountId, @NotNull BigDecimal amount, @NotNull String provider, Long scheduledDate, String title, String comment, String externalId, String introspectionParams) throws Exception {
        DisbursementResponse obj = createDisbursement(request, version, accountId, receiverAccountId, originalSenderAccountId, amount, provider, scheduledDate, title, comment, externalId, introspectionParams);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DisbursementResponse createDisbursement(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long receiverAccountId, @NotNull Long originalSenderAccountId, @NotNull BigDecimal amount, @NotNull String provider, Long scheduledDate, String title, String comment, String externalId, String introspectionParams) throws Exception;

    public Result getDisbursementHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long disbursementId) throws Exception {
        DisbursementResponse obj = getDisbursement(request, version, accountId, disbursementId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DisbursementResponse getDisbursement(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long disbursementId) throws Exception;

    public Result searchDisbursementsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, Long receiverAccountId, String statuses, String providers, Long beforeDate, Long afterDate, Integer start, Integer limit, Boolean activeOnly, String externalId) throws Exception {
        List<DisbursementResponse> obj = searchDisbursements(request, version, accountId, receiverAccountId, statuses, providers, beforeDate, afterDate, start, limit, activeOnly, externalId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (DisbursementResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<DisbursementResponse> searchDisbursements(Http.Request request, BigDecimal version, @NotNull Long accountId, Long receiverAccountId, String statuses, String providers, Long beforeDate, Long afterDate, Integer start, Integer limit, Boolean activeOnly, String externalId) throws Exception;

    public Result updateDisbursementHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long disbursementId, BigDecimal amount, String provider, Long scheduledDate, String title, String comment, String externalId, Boolean retry, String introspectionParams) throws Exception {
        DisbursementResponse obj = updateDisbursement(request, version, accountId, disbursementId, amount, provider, scheduledDate, title, comment, externalId, retry, introspectionParams);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DisbursementResponse updateDisbursement(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long disbursementId, BigDecimal amount, String provider, Long scheduledDate, String title, String comment, String externalId, Boolean retry, String introspectionParams) throws Exception;

}
