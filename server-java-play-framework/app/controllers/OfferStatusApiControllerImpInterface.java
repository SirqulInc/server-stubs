package controllers;

import java.math.BigDecimal;
import apimodels.OfferTransactionStatusResponse;
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
public abstract class OfferStatusApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createOfferTransactionStatusHttp(Http.Request request, BigDecimal version, @NotNull String name, @NotNull Integer code, String deviceId, Long accountId, Double latitude, Double longitude, String description, String role, Boolean active, String applicationIds) throws Exception {
        OfferTransactionStatusResponse obj = createOfferTransactionStatus(request, version, name, code, deviceId, accountId, latitude, longitude, description, role, active, applicationIds);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OfferTransactionStatusResponse createOfferTransactionStatus(Http.Request request, BigDecimal version, @NotNull String name, @NotNull Integer code, String deviceId, Long accountId, Double latitude, Double longitude, String description, String role, Boolean active, String applicationIds) throws Exception;

    public Result deleteOfferTransactionStatusHttp(Http.Request request, BigDecimal version, @NotNull Long statusId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception {
        SirqulResponse obj = deleteOfferTransactionStatus(request, version, statusId, deviceId, accountId, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteOfferTransactionStatus(Http.Request request, BigDecimal version, @NotNull Long statusId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception;

    public Result getOfferTransactionStatusHttp(Http.Request request, BigDecimal version, @NotNull Long statusId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception {
        OfferTransactionStatusResponse obj = getOfferTransactionStatus(request, version, statusId, deviceId, accountId, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OfferTransactionStatusResponse getOfferTransactionStatus(Http.Request request, BigDecimal version, @NotNull Long statusId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception;

    public Result searchOfferTransactionStatusesHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Double latitude, Double longitude, String keyword, String role, String appKey, String sortField, Boolean descending, Integer start, Integer limit, Boolean includeInactive) throws Exception {
        List<OfferTransactionStatusResponse> obj = searchOfferTransactionStatuses(request, version, deviceId, accountId, latitude, longitude, keyword, role, appKey, sortField, descending, start, limit, includeInactive);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (OfferTransactionStatusResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<OfferTransactionStatusResponse> searchOfferTransactionStatuses(Http.Request request, BigDecimal version, String deviceId, Long accountId, Double latitude, Double longitude, String keyword, String role, String appKey, String sortField, Boolean descending, Integer start, Integer limit, Boolean includeInactive) throws Exception;

    public Result updateOfferTransactionStatusHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Double latitude, Double longitude, Long statusId, String name, String description, Integer code, String role, Boolean active, String applicationIds) throws Exception {
        OfferTransactionStatusResponse obj = updateOfferTransactionStatus(request, version, deviceId, accountId, latitude, longitude, statusId, name, description, code, role, active, applicationIds);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OfferTransactionStatusResponse updateOfferTransactionStatus(Http.Request request, BigDecimal version, String deviceId, Long accountId, Double latitude, Double longitude, Long statusId, String name, String description, Integer code, String role, Boolean active, String applicationIds) throws Exception;

}
