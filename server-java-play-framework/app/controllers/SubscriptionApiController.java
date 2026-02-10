package controllers;

import apimodels.ApplicationUsageResponse;
import java.math.BigDecimal;
import apimodels.SirqulResponse;
import apimodels.SubscriptionPlanResponse;
import apimodels.SubscriptionResponse;

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
public class SubscriptionApiController extends Controller {
    private final SubscriptionApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private SubscriptionApiController(Config configuration, SubscriptionApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createSubscription(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueplanId = request.getQueryString("planId");
        Long planId;
        if (valueplanId != null) {
            planId = Long.parseLong(valueplanId);
        } else {
            planId = null;
        }
        String valuepromoCode = request.getQueryString("promoCode");
        String promoCode;
        if (valuepromoCode != null) {
            promoCode = valuepromoCode;
        } else {
            promoCode = null;
        }
        return imp.createSubscriptionHttp(request, version, accountId, planId, promoCode);
    }

    @ApiAction
    public Result deleteSubscription(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        return imp.deleteSubscriptionHttp(request, version, accountId);
    }

    @ApiAction
    public Result getSubscription(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        return imp.getSubscriptionHttp(request, version, accountId);
    }

    @ApiAction
    public Result getSubscriptionPlan(Http.Request request, BigDecimal version) throws Exception {
        String valueplanId = request.getQueryString("planId");
        Long planId;
        if (valueplanId != null) {
            planId = Long.parseLong(valueplanId);
        } else {
            throw new IllegalArgumentException("'planId' parameter is required");
        }
        return imp.getSubscriptionPlanHttp(request, version, planId);
    }

    @ApiAction
    public Result getSubscriptionPlans(Http.Request request, BigDecimal version) throws Exception {
        String valuevisible = request.getQueryString("visible");
        Boolean visible;
        if (valuevisible != null) {
            visible = Boolean.valueOf(valuevisible);
        } else {
            visible = null;
        }
        String valuerole = request.getQueryString("role");
        String role;
        if (valuerole != null) {
            role = valuerole;
        } else {
            role = null;
        }
        return imp.getSubscriptionPlansHttp(request, version, visible, role);
    }

    @ApiAction
    public Result getSubscriptionUsage(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueapplicationId = request.getQueryString("applicationId");
        Long applicationId;
        if (valueapplicationId != null) {
            applicationId = Long.parseLong(valueapplicationId);
        } else {
            applicationId = null;
        }
        String valuestart = request.getQueryString("start");
        Long start;
        if (valuestart != null) {
            start = Long.parseLong(valuestart);
        } else {
            start = null;
        }
        String valueend = request.getQueryString("end");
        Long end;
        if (valueend != null) {
            end = Long.parseLong(valueend);
        } else {
            end = null;
        }
        return imp.getSubscriptionUsageHttp(request, version, accountId, applicationId, start, end);
    }

    @ApiAction
    public Result updateSubscription(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueplanId = request.getQueryString("planId");
        Long planId;
        if (valueplanId != null) {
            planId = Long.parseLong(valueplanId);
        } else {
            planId = null;
        }
        String valuepromoCode = request.getQueryString("promoCode");
        String promoCode;
        if (valuepromoCode != null) {
            promoCode = valuepromoCode;
        } else {
            promoCode = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        return imp.updateSubscriptionHttp(request, version, accountId, planId, promoCode, active);
    }

}
