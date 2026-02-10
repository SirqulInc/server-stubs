package controllers;

import java.math.BigDecimal;
import apimodels.PurchaseItemFullResponse;
import apimodels.PurchaseItemResponse;
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
public class PurchaseItemApiController extends Controller {
    private final PurchaseItemApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private PurchaseItemApiController(Config configuration, PurchaseItemApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createPurchaseItem(Http.Request request, BigDecimal version) throws Exception {
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
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            throw new IllegalArgumentException("'name' parameter is required");
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuetickets = request.getQueryString("tickets");
        Integer tickets;
        if (valuetickets != null) {
            tickets = Integer.parseInt(valuetickets);
        } else {
            tickets = null;
        }
        String valueprice = request.getQueryString("price");
        Float price;
        if (valueprice != null) {
            price = Float.parseFloat(valueprice);
        } else {
            price = null;
        }
        String valuepurchaseType = request.getQueryString("purchaseType");
        String purchaseType;
        if (valuepurchaseType != null) {
            purchaseType = valuepurchaseType;
        } else {
            throw new IllegalArgumentException("'purchaseType' parameter is required");
        }
        String valuepurchaseCode = request.getQueryString("purchaseCode");
        String purchaseCode;
        if (valuepurchaseCode != null) {
            purchaseCode = valuepurchaseCode;
        } else {
            purchaseCode = null;
        }
        String valuesecretKey = request.getQueryString("secretKey");
        String secretKey;
        if (valuesecretKey != null) {
            secretKey = valuesecretKey;
        } else {
            secretKey = null;
        }
        String valuepurchaseLimit = request.getQueryString("purchaseLimit");
        Integer purchaseLimit;
        if (valuepurchaseLimit != null) {
            purchaseLimit = Integer.parseInt(valuepurchaseLimit);
        } else {
            purchaseLimit = 0;
        }
        String valueserviceAction = request.getQueryString("serviceAction");
        String serviceAction;
        if (valueserviceAction != null) {
            serviceAction = valueserviceAction;
        } else {
            serviceAction = null;
        }
        String valuecoverAssetId = request.getQueryString("coverAssetId");
        Long coverAssetId;
        if (valuecoverAssetId != null) {
            coverAssetId = Long.parseLong(valuecoverAssetId);
        } else {
            coverAssetId = null;
        }
        String valuepromoAssetId = request.getQueryString("promoAssetId");
        Long promoAssetId;
        if (valuepromoAssetId != null) {
            promoAssetId = Long.parseLong(valuepromoAssetId);
        } else {
            promoAssetId = null;
        }
        String valuegiftable = request.getQueryString("giftable");
        Boolean giftable;
        if (valuegiftable != null) {
            giftable = Boolean.valueOf(valuegiftable);
        } else {
            giftable = null;
        }
        String valueassetable = request.getQueryString("assetable");
        Boolean assetable;
        if (valueassetable != null) {
            assetable = Boolean.valueOf(valueassetable);
        } else {
            assetable = null;
        }
        String valueallocateTickets = request.getQueryString("allocateTickets");
        Boolean allocateTickets;
        if (valueallocateTickets != null) {
            allocateTickets = Boolean.valueOf(valueallocateTickets);
        } else {
            allocateTickets = false;
        }
        String valueticketType = request.getQueryString("ticketType");
        String ticketType;
        if (valueticketType != null) {
            ticketType = valueticketType;
        } else {
            ticketType = null;
        }
        String valuepoints = request.getQueryString("points");
        Long points;
        if (valuepoints != null) {
            points = Long.parseLong(valuepoints);
        } else {
            points = null;
        }
        String valueofferLocationId = request.getQueryString("offerLocationId");
        Long offerLocationId;
        if (valueofferLocationId != null) {
            offerLocationId = Long.parseLong(valueofferLocationId);
        } else {
            offerLocationId = null;
        }
        return imp.createPurchaseItemHttp(request, version, appKey, name, purchaseType, deviceId, accountId, description, tickets, price, purchaseCode, secretKey, purchaseLimit, serviceAction, coverAssetId, promoAssetId, giftable, assetable, allocateTickets, ticketType, points, offerLocationId);
    }

    @ApiAction
    public Result deletePurchaseItem(Http.Request request, BigDecimal version) throws Exception {
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
        String valuepurchaseItemId = request.getQueryString("purchaseItemId");
        Long purchaseItemId;
        if (valuepurchaseItemId != null) {
            purchaseItemId = Long.parseLong(valuepurchaseItemId);
        } else {
            throw new IllegalArgumentException("'purchaseItemId' parameter is required");
        }
        return imp.deletePurchaseItemHttp(request, version, purchaseItemId, deviceId, accountId);
    }

    @ApiAction
    public Result getPurchaseItem(Http.Request request, BigDecimal version) throws Exception {
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
        String valuepurchaseItemId = request.getQueryString("purchaseItemId");
        Long purchaseItemId;
        if (valuepurchaseItemId != null) {
            purchaseItemId = Long.parseLong(valuepurchaseItemId);
        } else {
            throw new IllegalArgumentException("'purchaseItemId' parameter is required");
        }
        return imp.getPurchaseItemHttp(request, version, purchaseItemId, deviceId, accountId);
    }

    @ApiAction
    public Result searchPurchaseItems(Http.Request request, BigDecimal version) throws Exception {
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
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuefilterByBillable = request.getQueryString("filterByBillable");
        Boolean filterByBillable;
        if (valuefilterByBillable != null) {
            filterByBillable = Boolean.valueOf(valuefilterByBillable);
        } else {
            filterByBillable = false;
        }
        String valuepurchaseType = request.getQueryString("purchaseType");
        String purchaseType;
        if (valuepurchaseType != null) {
            purchaseType = valuepurchaseType;
        } else {
            purchaseType = null;
        }
        String valueserviceAction = request.getQueryString("serviceAction");
        String serviceAction;
        if (valueserviceAction != null) {
            serviceAction = valueserviceAction;
        } else {
            serviceAction = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = "NAME";
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = false;
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
        return imp.searchPurchaseItemsHttp(request, version, deviceId, accountId, appKey, filterByBillable, purchaseType, serviceAction, keyword, sortField, descending, start, limit, activeOnly);
    }

    @ApiAction
    public Result updatePurchaseItem(Http.Request request, BigDecimal version) throws Exception {
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
        String valuepurchaseItemId = request.getQueryString("purchaseItemId");
        Long purchaseItemId;
        if (valuepurchaseItemId != null) {
            purchaseItemId = Long.parseLong(valuepurchaseItemId);
        } else {
            throw new IllegalArgumentException("'purchaseItemId' parameter is required");
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            name = null;
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuetickets = request.getQueryString("tickets");
        Integer tickets;
        if (valuetickets != null) {
            tickets = Integer.parseInt(valuetickets);
        } else {
            tickets = null;
        }
        String valueprice = request.getQueryString("price");
        Float price;
        if (valueprice != null) {
            price = Float.parseFloat(valueprice);
        } else {
            price = null;
        }
        String valuepurchaseType = request.getQueryString("purchaseType");
        String purchaseType;
        if (valuepurchaseType != null) {
            purchaseType = valuepurchaseType;
        } else {
            purchaseType = null;
        }
        String valuepurchaseCode = request.getQueryString("purchaseCode");
        String purchaseCode;
        if (valuepurchaseCode != null) {
            purchaseCode = valuepurchaseCode;
        } else {
            purchaseCode = null;
        }
        String valuesecretKey = request.getQueryString("secretKey");
        String secretKey;
        if (valuesecretKey != null) {
            secretKey = valuesecretKey;
        } else {
            secretKey = null;
        }
        String valuepurchaseLimit = request.getQueryString("purchaseLimit");
        Integer purchaseLimit;
        if (valuepurchaseLimit != null) {
            purchaseLimit = Integer.parseInt(valuepurchaseLimit);
        } else {
            purchaseLimit = null;
        }
        String valueserviceAction = request.getQueryString("serviceAction");
        String serviceAction;
        if (valueserviceAction != null) {
            serviceAction = valueserviceAction;
        } else {
            serviceAction = null;
        }
        String valuecoverAssetId = request.getQueryString("coverAssetId");
        Long coverAssetId;
        if (valuecoverAssetId != null) {
            coverAssetId = Long.parseLong(valuecoverAssetId);
        } else {
            coverAssetId = null;
        }
        String valuepromoAssetId = request.getQueryString("promoAssetId");
        Long promoAssetId;
        if (valuepromoAssetId != null) {
            promoAssetId = Long.parseLong(valuepromoAssetId);
        } else {
            promoAssetId = null;
        }
        String valuegiftable = request.getQueryString("giftable");
        Boolean giftable;
        if (valuegiftable != null) {
            giftable = Boolean.valueOf(valuegiftable);
        } else {
            giftable = null;
        }
        String valueassetable = request.getQueryString("assetable");
        Boolean assetable;
        if (valueassetable != null) {
            assetable = Boolean.valueOf(valueassetable);
        } else {
            assetable = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valueallocateTickets = request.getQueryString("allocateTickets");
        Boolean allocateTickets;
        if (valueallocateTickets != null) {
            allocateTickets = Boolean.valueOf(valueallocateTickets);
        } else {
            allocateTickets = false;
        }
        String valueticketType = request.getQueryString("ticketType");
        String ticketType;
        if (valueticketType != null) {
            ticketType = valueticketType;
        } else {
            ticketType = null;
        }
        String valuepoints = request.getQueryString("points");
        Long points;
        if (valuepoints != null) {
            points = Long.parseLong(valuepoints);
        } else {
            points = null;
        }
        String valueofferLocationId = request.getQueryString("offerLocationId");
        Long offerLocationId;
        if (valueofferLocationId != null) {
            offerLocationId = Long.parseLong(valueofferLocationId);
        } else {
            offerLocationId = null;
        }
        return imp.updatePurchaseItemHttp(request, version, purchaseItemId, deviceId, accountId, name, description, tickets, price, purchaseType, purchaseCode, secretKey, purchaseLimit, serviceAction, coverAssetId, promoAssetId, giftable, assetable, active, allocateTickets, ticketType, points, offerLocationId);
    }

}
