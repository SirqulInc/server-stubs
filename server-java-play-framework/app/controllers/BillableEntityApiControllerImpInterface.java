package controllers;

import java.math.BigDecimal;
import apimodels.BillableEntityResponse;
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
public abstract class BillableEntityApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createBillableEntityHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, String name, String streetAddress, String streetAddress2, String city, String state, String postalCode, String businessPhone, String businessPhoneExt, String authorizeNetApiKey, String authorizeNetTransactionKey) throws Exception {
        BillableEntityResponse obj = createBillableEntity(request, version, deviceId, accountId, name, streetAddress, streetAddress2, city, state, postalCode, businessPhone, businessPhoneExt, authorizeNetApiKey, authorizeNetTransactionKey);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BillableEntityResponse createBillableEntity(Http.Request request, BigDecimal version, String deviceId, Long accountId, String name, String streetAddress, String streetAddress2, String city, String state, String postalCode, String businessPhone, String businessPhoneExt, String authorizeNetApiKey, String authorizeNetTransactionKey) throws Exception;

    public Result deleteBillableEntityHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId) throws Exception {
        SirqulResponse obj = deleteBillableEntity(request, version, deviceId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteBillableEntity(Http.Request request, BigDecimal version, String deviceId, Long accountId) throws Exception;

    public Result getBillableEntityHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Boolean includeCounts, Boolean includePayments) throws Exception {
        BillableEntityResponse obj = getBillableEntity(request, version, deviceId, accountId, includeCounts, includePayments);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BillableEntityResponse getBillableEntity(Http.Request request, BigDecimal version, String deviceId, Long accountId, Boolean includeCounts, Boolean includePayments) throws Exception;

    public Result updateBillableEntityHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, String name, String streetAddress, String streetAddress2, String city, String state, String postalCode, String businessPhone, String businessPhoneExt, String authorizeNetApiKey, String authorizeNetTransactionKey) throws Exception {
        BillableEntityResponse obj = updateBillableEntity(request, version, deviceId, accountId, name, streetAddress, streetAddress2, city, state, postalCode, businessPhone, businessPhoneExt, authorizeNetApiKey, authorizeNetTransactionKey);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BillableEntityResponse updateBillableEntity(Http.Request request, BigDecimal version, String deviceId, Long accountId, String name, String streetAddress, String streetAddress2, String city, String state, String postalCode, String businessPhone, String businessPhoneExt, String authorizeNetApiKey, String authorizeNetTransactionKey) throws Exception;

}
