package controllers;

import java.math.BigDecimal;
import apimodels.PurchaseItemFullResponse;
import apimodels.PurchaseItemResponse;
import apimodels.SirqulResponse;

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
public class PurchaseItemApiControllerImp extends PurchaseItemApiControllerImpInterface {
    @Override
    public PurchaseItemFullResponse createPurchaseItem(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String name, @NotNull String purchaseType, String deviceId, Long accountId, String description, Integer tickets, Float price, String purchaseCode, String secretKey, Integer purchaseLimit, String serviceAction, Long coverAssetId, Long promoAssetId, Boolean giftable, Boolean assetable, Boolean allocateTickets, String ticketType, Long points, Long offerLocationId) throws Exception {
        //Do your magic!!!
        return new PurchaseItemFullResponse();
    }

    @Override
    public SirqulResponse deletePurchaseItem(Http.Request request, BigDecimal version, @NotNull Long purchaseItemId, String deviceId, Long accountId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public PurchaseItemFullResponse getPurchaseItem(Http.Request request, BigDecimal version, @NotNull Long purchaseItemId, String deviceId, Long accountId) throws Exception {
        //Do your magic!!!
        return new PurchaseItemFullResponse();
    }

    @Override
    public List<PurchaseItemResponse> searchPurchaseItems(Http.Request request, BigDecimal version, String deviceId, Long accountId, String appKey, Boolean filterByBillable, String purchaseType, String serviceAction, String keyword, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly) throws Exception {
        //Do your magic!!!
        return new ArrayList<PurchaseItemResponse>();
    }

    @Override
    public PurchaseItemFullResponse updatePurchaseItem(Http.Request request, BigDecimal version, @NotNull Long purchaseItemId, String deviceId, Long accountId, String name, String description, Integer tickets, Float price, String purchaseType, String purchaseCode, String secretKey, Integer purchaseLimit, String serviceAction, Long coverAssetId, Long promoAssetId, Boolean giftable, Boolean assetable, Boolean active, Boolean allocateTickets, String ticketType, Long points, Long offerLocationId) throws Exception {
        //Do your magic!!!
        return new PurchaseItemFullResponse();
    }

}
