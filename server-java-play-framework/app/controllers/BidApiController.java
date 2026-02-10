package controllers;

import apimodels.BidResponse;
import java.math.BigDecimal;
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
public class BidApiController extends Controller {
    private final BidApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private BidApiController(Config configuration, BidApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createBid(Http.Request request, BigDecimal version) throws Exception {
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
        String valuebiddableType = request.getQueryString("biddableType");
        String biddableType;
        if (valuebiddableType != null) {
            biddableType = valuebiddableType;
        } else {
            throw new IllegalArgumentException("'biddableType' parameter is required");
        }
        String valuebiddableId = request.getQueryString("biddableId");
        Long biddableId;
        if (valuebiddableId != null) {
            biddableId = Long.parseLong(valuebiddableId);
        } else {
            throw new IllegalArgumentException("'biddableId' parameter is required");
        }
        String valueamountPerView = request.getQueryString("amountPerView");
        Double amountPerView;
        if (valueamountPerView != null) {
            amountPerView = Double.parseDouble(valueamountPerView);
        } else {
            throw new IllegalArgumentException("'amountPerView' parameter is required");
        }
        String valueamountPerAction = request.getQueryString("amountPerAction");
        Double amountPerAction;
        if (valueamountPerAction != null) {
            amountPerAction = Double.parseDouble(valueamountPerAction);
        } else {
            throw new IllegalArgumentException("'amountPerAction' parameter is required");
        }
        String valuebudgetAmount = request.getQueryString("budgetAmount");
        Double budgetAmount;
        if (valuebudgetAmount != null) {
            budgetAmount = Double.parseDouble(valuebudgetAmount);
        } else {
            throw new IllegalArgumentException("'budgetAmount' parameter is required");
        }
        String valuebudgetSchedule = request.getQueryString("budgetSchedule");
        String budgetSchedule;
        if (valuebudgetSchedule != null) {
            budgetSchedule = valuebudgetSchedule;
        } else {
            throw new IllegalArgumentException("'budgetSchedule' parameter is required");
        }
        return imp.createBidHttp(request, version, biddableType, biddableId, amountPerView, amountPerAction, budgetAmount, budgetSchedule, deviceId, accountId);
    }

    @ApiAction
    public Result deleteBid(Http.Request request, BigDecimal version) throws Exception {
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
        String valuebidId = request.getQueryString("bidId");
        Long bidId;
        if (valuebidId != null) {
            bidId = Long.parseLong(valuebidId);
        } else {
            throw new IllegalArgumentException("'bidId' parameter is required");
        }
        return imp.deleteBidHttp(request, version, bidId, deviceId, accountId);
    }

    @ApiAction
    public Result getBid(Http.Request request, BigDecimal version) throws Exception {
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
        String valuebidId = request.getQueryString("bidId");
        Long bidId;
        if (valuebidId != null) {
            bidId = Long.parseLong(valuebidId);
        } else {
            throw new IllegalArgumentException("'bidId' parameter is required");
        }
        return imp.getBidHttp(request, version, bidId, deviceId, accountId);
    }

    @ApiAction
    public Result updateBid(Http.Request request, BigDecimal version) throws Exception {
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
        String valuebidId = request.getQueryString("bidId");
        Long bidId;
        if (valuebidId != null) {
            bidId = Long.parseLong(valuebidId);
        } else {
            throw new IllegalArgumentException("'bidId' parameter is required");
        }
        String valueamountPerView = request.getQueryString("amountPerView");
        Double amountPerView;
        if (valueamountPerView != null) {
            amountPerView = Double.parseDouble(valueamountPerView);
        } else {
            amountPerView = null;
        }
        String valueamountPerAction = request.getQueryString("amountPerAction");
        Double amountPerAction;
        if (valueamountPerAction != null) {
            amountPerAction = Double.parseDouble(valueamountPerAction);
        } else {
            amountPerAction = null;
        }
        String valuebudgetAmount = request.getQueryString("budgetAmount");
        Double budgetAmount;
        if (valuebudgetAmount != null) {
            budgetAmount = Double.parseDouble(valuebudgetAmount);
        } else {
            budgetAmount = null;
        }
        String valuebudgetSchedule = request.getQueryString("budgetSchedule");
        String budgetSchedule;
        if (valuebudgetSchedule != null) {
            budgetSchedule = valuebudgetSchedule;
        } else {
            budgetSchedule = null;
        }
        return imp.updateBidHttp(request, version, bidId, deviceId, accountId, amountPerView, amountPerAction, budgetAmount, budgetSchedule);
    }

}
