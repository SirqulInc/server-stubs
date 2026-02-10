package controllers;

import java.math.BigDecimal;
import apimodels.BillableEntityResponse;
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
public class BillableEntityApiController extends Controller {
    private final BillableEntityApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private BillableEntityApiController(Config configuration, BillableEntityApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createBillableEntity(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            name = null;
        }
        String valuestreetAddress = request.getQueryString("streetAddress");
        String streetAddress;
        if (valuestreetAddress != null) {
            streetAddress = valuestreetAddress;
        } else {
            streetAddress = null;
        }
        String valuestreetAddress2 = request.getQueryString("streetAddress2");
        String streetAddress2;
        if (valuestreetAddress2 != null) {
            streetAddress2 = valuestreetAddress2;
        } else {
            streetAddress2 = null;
        }
        String valuecity = request.getQueryString("city");
        String city;
        if (valuecity != null) {
            city = valuecity;
        } else {
            city = null;
        }
        String valuestate = request.getQueryString("state");
        String state;
        if (valuestate != null) {
            state = valuestate;
        } else {
            state = null;
        }
        String valuepostalCode = request.getQueryString("postalCode");
        String postalCode;
        if (valuepostalCode != null) {
            postalCode = valuepostalCode;
        } else {
            postalCode = null;
        }
        String valuebusinessPhone = request.getQueryString("businessPhone");
        String businessPhone;
        if (valuebusinessPhone != null) {
            businessPhone = valuebusinessPhone;
        } else {
            businessPhone = null;
        }
        String valuebusinessPhoneExt = request.getQueryString("businessPhoneExt");
        String businessPhoneExt;
        if (valuebusinessPhoneExt != null) {
            businessPhoneExt = valuebusinessPhoneExt;
        } else {
            businessPhoneExt = null;
        }
        String valueauthorizeNetApiKey = request.getQueryString("authorizeNetApiKey");
        String authorizeNetApiKey;
        if (valueauthorizeNetApiKey != null) {
            authorizeNetApiKey = valueauthorizeNetApiKey;
        } else {
            authorizeNetApiKey = null;
        }
        String valueauthorizeNetTransactionKey = request.getQueryString("authorizeNetTransactionKey");
        String authorizeNetTransactionKey;
        if (valueauthorizeNetTransactionKey != null) {
            authorizeNetTransactionKey = valueauthorizeNetTransactionKey;
        } else {
            authorizeNetTransactionKey = null;
        }
        return imp.createBillableEntityHttp(request, version, deviceId, accountId, name, streetAddress, streetAddress2, city, state, postalCode, businessPhone, businessPhoneExt, authorizeNetApiKey, authorizeNetTransactionKey);
    }

    @ApiAction
    public Result deleteBillableEntity(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        return imp.deleteBillableEntityHttp(request, version, deviceId, accountId);
    }

    @ApiAction
    public Result getBillableEntity(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueincludeCounts = request.getQueryString("includeCounts");
        Boolean includeCounts;
        if (valueincludeCounts != null) {
            includeCounts = Boolean.valueOf(valueincludeCounts);
        } else {
            includeCounts = false;
        }
        String valueincludePayments = request.getQueryString("includePayments");
        Boolean includePayments;
        if (valueincludePayments != null) {
            includePayments = Boolean.valueOf(valueincludePayments);
        } else {
            includePayments = true;
        }
        return imp.getBillableEntityHttp(request, version, deviceId, accountId, includeCounts, includePayments);
    }

    @ApiAction
    public Result updateBillableEntity(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            name = null;
        }
        String valuestreetAddress = request.getQueryString("streetAddress");
        String streetAddress;
        if (valuestreetAddress != null) {
            streetAddress = valuestreetAddress;
        } else {
            streetAddress = null;
        }
        String valuestreetAddress2 = request.getQueryString("streetAddress2");
        String streetAddress2;
        if (valuestreetAddress2 != null) {
            streetAddress2 = valuestreetAddress2;
        } else {
            streetAddress2 = null;
        }
        String valuecity = request.getQueryString("city");
        String city;
        if (valuecity != null) {
            city = valuecity;
        } else {
            city = null;
        }
        String valuestate = request.getQueryString("state");
        String state;
        if (valuestate != null) {
            state = valuestate;
        } else {
            state = null;
        }
        String valuepostalCode = request.getQueryString("postalCode");
        String postalCode;
        if (valuepostalCode != null) {
            postalCode = valuepostalCode;
        } else {
            postalCode = null;
        }
        String valuebusinessPhone = request.getQueryString("businessPhone");
        String businessPhone;
        if (valuebusinessPhone != null) {
            businessPhone = valuebusinessPhone;
        } else {
            businessPhone = null;
        }
        String valuebusinessPhoneExt = request.getQueryString("businessPhoneExt");
        String businessPhoneExt;
        if (valuebusinessPhoneExt != null) {
            businessPhoneExt = valuebusinessPhoneExt;
        } else {
            businessPhoneExt = null;
        }
        String valueauthorizeNetApiKey = request.getQueryString("authorizeNetApiKey");
        String authorizeNetApiKey;
        if (valueauthorizeNetApiKey != null) {
            authorizeNetApiKey = valueauthorizeNetApiKey;
        } else {
            authorizeNetApiKey = null;
        }
        String valueauthorizeNetTransactionKey = request.getQueryString("authorizeNetTransactionKey");
        String authorizeNetTransactionKey;
        if (valueauthorizeNetTransactionKey != null) {
            authorizeNetTransactionKey = valueauthorizeNetTransactionKey;
        } else {
            authorizeNetTransactionKey = null;
        }
        return imp.updateBillableEntityHttp(request, version, deviceId, accountId, name, streetAddress, streetAddress2, city, state, postalCode, businessPhone, businessPhoneExt, authorizeNetApiKey, authorizeNetTransactionKey);
    }

}
