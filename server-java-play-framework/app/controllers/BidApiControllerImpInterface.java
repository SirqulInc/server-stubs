package controllers;

import apimodels.BidResponse;
import java.math.BigDecimal;
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
public abstract class BidApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createBidHttp(Http.Request request, BigDecimal version, @NotNull String biddableType, @NotNull Long biddableId, @NotNull Double amountPerView, @NotNull Double amountPerAction, @NotNull Double budgetAmount, @NotNull String budgetSchedule, String deviceId, Long accountId) throws Exception {
        BidResponse obj = createBid(request, version, biddableType, biddableId, amountPerView, amountPerAction, budgetAmount, budgetSchedule, deviceId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BidResponse createBid(Http.Request request, BigDecimal version, @NotNull String biddableType, @NotNull Long biddableId, @NotNull Double amountPerView, @NotNull Double amountPerAction, @NotNull Double budgetAmount, @NotNull String budgetSchedule, String deviceId, Long accountId) throws Exception;

    public Result deleteBidHttp(Http.Request request, BigDecimal version, @NotNull Long bidId, String deviceId, Long accountId) throws Exception {
        SirqulResponse obj = deleteBid(request, version, bidId, deviceId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteBid(Http.Request request, BigDecimal version, @NotNull Long bidId, String deviceId, Long accountId) throws Exception;

    public Result getBidHttp(Http.Request request, BigDecimal version, @NotNull Long bidId, String deviceId, Long accountId) throws Exception {
        BidResponse obj = getBid(request, version, bidId, deviceId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BidResponse getBid(Http.Request request, BigDecimal version, @NotNull Long bidId, String deviceId, Long accountId) throws Exception;

    public Result updateBidHttp(Http.Request request, BigDecimal version, @NotNull Long bidId, String deviceId, Long accountId, Double amountPerView, Double amountPerAction, Double budgetAmount, String budgetSchedule) throws Exception {
        BidResponse obj = updateBid(request, version, bidId, deviceId, accountId, amountPerView, amountPerAction, budgetAmount, budgetSchedule);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BidResponse updateBid(Http.Request request, BigDecimal version, @NotNull Long bidId, String deviceId, Long accountId, Double amountPerView, Double amountPerAction, Double budgetAmount, String budgetSchedule) throws Exception;

}
