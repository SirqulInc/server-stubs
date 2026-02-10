package controllers;

import java.math.BigDecimal;
import apimodels.DisbursementResponse;

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
public class DisbursementApiController extends Controller {
    private final DisbursementApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private DisbursementApiController(Config configuration, DisbursementApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result checkDisbursements(Http.Request request, BigDecimal version) throws Exception {
        String valuedisbursementId = request.getQueryString("disbursementId");
        Long disbursementId;
        if (valuedisbursementId != null) {
            disbursementId = Long.parseLong(valuedisbursementId);
        } else {
            throw new IllegalArgumentException("'disbursementId' parameter is required");
        }
        return imp.checkDisbursementsHttp(request, version, disbursementId);
    }

    @ApiAction
    public Result createDisbursement(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuereceiverAccountId = request.getQueryString("receiverAccountId");
        Long receiverAccountId;
        if (valuereceiverAccountId != null) {
            receiverAccountId = Long.parseLong(valuereceiverAccountId);
        } else {
            throw new IllegalArgumentException("'receiverAccountId' parameter is required");
        }
        String valueoriginalSenderAccountId = request.getQueryString("originalSenderAccountId");
        Long originalSenderAccountId;
        if (valueoriginalSenderAccountId != null) {
            originalSenderAccountId = Long.parseLong(valueoriginalSenderAccountId);
        } else {
            throw new IllegalArgumentException("'originalSenderAccountId' parameter is required");
        }
        String valueamount = request.getQueryString("amount");
        BigDecimal amount;
        if (valueamount != null) {
            amount = new BigDecimal(valueamount);
        } else {
            throw new IllegalArgumentException("'amount' parameter is required");
        }
        String valueprovider = request.getQueryString("provider");
        String provider;
        if (valueprovider != null) {
            provider = valueprovider;
        } else {
            throw new IllegalArgumentException("'provider' parameter is required");
        }
        String valuescheduledDate = request.getQueryString("scheduledDate");
        Long scheduledDate;
        if (valuescheduledDate != null) {
            scheduledDate = Long.parseLong(valuescheduledDate);
        } else {
            scheduledDate = null;
        }
        String valuetitle = request.getQueryString("title");
        String title;
        if (valuetitle != null) {
            title = valuetitle;
        } else {
            title = null;
        }
        String valuecomment = request.getQueryString("comment");
        String comment;
        if (valuecomment != null) {
            comment = valuecomment;
        } else {
            comment = null;
        }
        String valueexternalId = request.getQueryString("externalId");
        String externalId;
        if (valueexternalId != null) {
            externalId = valueexternalId;
        } else {
            externalId = null;
        }
        String valueintrospectionParams = request.getQueryString("introspectionParams");
        String introspectionParams;
        if (valueintrospectionParams != null) {
            introspectionParams = valueintrospectionParams;
        } else {
            introspectionParams = null;
        }
        return imp.createDisbursementHttp(request, version, accountId, receiverAccountId, originalSenderAccountId, amount, provider, scheduledDate, title, comment, externalId, introspectionParams);
    }

    @ApiAction
    public Result getDisbursement(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuedisbursementId = request.getQueryString("disbursementId");
        Long disbursementId;
        if (valuedisbursementId != null) {
            disbursementId = Long.parseLong(valuedisbursementId);
        } else {
            throw new IllegalArgumentException("'disbursementId' parameter is required");
        }
        return imp.getDisbursementHttp(request, version, accountId, disbursementId);
    }

    @ApiAction
    public Result searchDisbursements(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuereceiverAccountId = request.getQueryString("receiverAccountId");
        Long receiverAccountId;
        if (valuereceiverAccountId != null) {
            receiverAccountId = Long.parseLong(valuereceiverAccountId);
        } else {
            receiverAccountId = null;
        }
        String valuestatuses = request.getQueryString("statuses");
        String statuses;
        if (valuestatuses != null) {
            statuses = valuestatuses;
        } else {
            statuses = null;
        }
        String valueproviders = request.getQueryString("providers");
        String providers;
        if (valueproviders != null) {
            providers = valueproviders;
        } else {
            providers = null;
        }
        String valuebeforeDate = request.getQueryString("beforeDate");
        Long beforeDate;
        if (valuebeforeDate != null) {
            beforeDate = Long.parseLong(valuebeforeDate);
        } else {
            beforeDate = null;
        }
        String valueafterDate = request.getQueryString("afterDate");
        Long afterDate;
        if (valueafterDate != null) {
            afterDate = Long.parseLong(valueafterDate);
        } else {
            afterDate = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = 0;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            activeOnly = false;
        }
        String valueexternalId = request.getQueryString("externalId");
        String externalId;
        if (valueexternalId != null) {
            externalId = valueexternalId;
        } else {
            externalId = null;
        }
        return imp.searchDisbursementsHttp(request, version, accountId, receiverAccountId, statuses, providers, beforeDate, afterDate, start, limit, activeOnly, externalId);
    }

    @ApiAction
    public Result updateDisbursement(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuedisbursementId = request.getQueryString("disbursementId");
        Long disbursementId;
        if (valuedisbursementId != null) {
            disbursementId = Long.parseLong(valuedisbursementId);
        } else {
            throw new IllegalArgumentException("'disbursementId' parameter is required");
        }
        String valueamount = request.getQueryString("amount");
        BigDecimal amount;
        if (valueamount != null) {
            amount = new BigDecimal(valueamount);
        } else {
            amount = null;
        }
        String valueprovider = request.getQueryString("provider");
        String provider;
        if (valueprovider != null) {
            provider = valueprovider;
        } else {
            provider = null;
        }
        String valuescheduledDate = request.getQueryString("scheduledDate");
        Long scheduledDate;
        if (valuescheduledDate != null) {
            scheduledDate = Long.parseLong(valuescheduledDate);
        } else {
            scheduledDate = null;
        }
        String valuetitle = request.getQueryString("title");
        String title;
        if (valuetitle != null) {
            title = valuetitle;
        } else {
            title = null;
        }
        String valuecomment = request.getQueryString("comment");
        String comment;
        if (valuecomment != null) {
            comment = valuecomment;
        } else {
            comment = null;
        }
        String valueexternalId = request.getQueryString("externalId");
        String externalId;
        if (valueexternalId != null) {
            externalId = valueexternalId;
        } else {
            externalId = null;
        }
        String valueretry = request.getQueryString("retry");
        Boolean retry;
        if (valueretry != null) {
            retry = Boolean.valueOf(valueretry);
        } else {
            retry = null;
        }
        String valueintrospectionParams = request.getQueryString("introspectionParams");
        String introspectionParams;
        if (valueintrospectionParams != null) {
            introspectionParams = valueintrospectionParams;
        } else {
            introspectionParams = null;
        }
        return imp.updateDisbursementHttp(request, version, accountId, disbursementId, amount, provider, scheduledDate, title, comment, externalId, retry, introspectionParams);
    }

}
