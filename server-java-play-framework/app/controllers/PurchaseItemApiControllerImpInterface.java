package controllers;

import java.math.BigDecimal;
import apimodels.PurchaseItemFullResponse;
import apimodels.PurchaseItemResponse;
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
public abstract class PurchaseItemApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createPurchaseItemHttp(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String name, @NotNull String purchaseType, String deviceId, Long accountId, String description, Integer tickets, Float price, String purchaseCode, String secretKey, Integer purchaseLimit, String serviceAction, Long coverAssetId, Long promoAssetId, Boolean giftable, Boolean assetable, Boolean allocateTickets, String ticketType, Long points, Long offerLocationId) throws Exception {
        PurchaseItemFullResponse obj = createPurchaseItem(request, version, appKey, name, purchaseType, deviceId, accountId, description, tickets, price, purchaseCode, secretKey, purchaseLimit, serviceAction, coverAssetId, promoAssetId, giftable, assetable, allocateTickets, ticketType, points, offerLocationId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PurchaseItemFullResponse createPurchaseItem(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String name, @NotNull String purchaseType, String deviceId, Long accountId, String description, Integer tickets, Float price, String purchaseCode, String secretKey, Integer purchaseLimit, String serviceAction, Long coverAssetId, Long promoAssetId, Boolean giftable, Boolean assetable, Boolean allocateTickets, String ticketType, Long points, Long offerLocationId) throws Exception;

    public Result deletePurchaseItemHttp(Http.Request request, BigDecimal version, @NotNull Long purchaseItemId, String deviceId, Long accountId) throws Exception {
        SirqulResponse obj = deletePurchaseItem(request, version, purchaseItemId, deviceId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deletePurchaseItem(Http.Request request, BigDecimal version, @NotNull Long purchaseItemId, String deviceId, Long accountId) throws Exception;

    public Result getPurchaseItemHttp(Http.Request request, BigDecimal version, @NotNull Long purchaseItemId, String deviceId, Long accountId) throws Exception {
        PurchaseItemFullResponse obj = getPurchaseItem(request, version, purchaseItemId, deviceId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PurchaseItemFullResponse getPurchaseItem(Http.Request request, BigDecimal version, @NotNull Long purchaseItemId, String deviceId, Long accountId) throws Exception;

    public Result searchPurchaseItemsHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, String appKey, Boolean filterByBillable, String purchaseType, String serviceAction, String keyword, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly) throws Exception {
        List<PurchaseItemResponse> obj = searchPurchaseItems(request, version, deviceId, accountId, appKey, filterByBillable, purchaseType, serviceAction, keyword, sortField, descending, start, limit, activeOnly);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (PurchaseItemResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<PurchaseItemResponse> searchPurchaseItems(Http.Request request, BigDecimal version, String deviceId, Long accountId, String appKey, Boolean filterByBillable, String purchaseType, String serviceAction, String keyword, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly) throws Exception;

    public Result updatePurchaseItemHttp(Http.Request request, BigDecimal version, @NotNull Long purchaseItemId, String deviceId, Long accountId, String name, String description, Integer tickets, Float price, String purchaseType, String purchaseCode, String secretKey, Integer purchaseLimit, String serviceAction, Long coverAssetId, Long promoAssetId, Boolean giftable, Boolean assetable, Boolean active, Boolean allocateTickets, String ticketType, Long points, Long offerLocationId) throws Exception {
        PurchaseItemFullResponse obj = updatePurchaseItem(request, version, purchaseItemId, deviceId, accountId, name, description, tickets, price, purchaseType, purchaseCode, secretKey, purchaseLimit, serviceAction, coverAssetId, promoAssetId, giftable, assetable, active, allocateTickets, ticketType, points, offerLocationId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PurchaseItemFullResponse updatePurchaseItem(Http.Request request, BigDecimal version, @NotNull Long purchaseItemId, String deviceId, Long accountId, String name, String description, Integer tickets, Float price, String purchaseType, String purchaseCode, String secretKey, Integer purchaseLimit, String serviceAction, Long coverAssetId, Long promoAssetId, Boolean giftable, Boolean assetable, Boolean active, Boolean allocateTickets, String ticketType, Long points, Long offerLocationId) throws Exception;

}
