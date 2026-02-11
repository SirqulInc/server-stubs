package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.PurchaseApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.PurchaseItemFullResponse;
import org.openapitools.model.PurchaseItemResponse;
import org.openapitools.model.SirqulResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/purchase")


@io.swagger.annotations.Api(description = "the purchase API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PurchaseApi  {

    @Inject PurchaseApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Purchase", notes = "Creates a purchase item for in app purchases", response = PurchaseItemFullResponse.class, tags={ "Purchase Item", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PurchaseItemFullResponse.class) })
    public Response createPurchaseItem( @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("name") String name, @NotNull, allowableValues="SIRQUL, IOS, GOOGLE, AMAZON, MAC, WP8, FREE" @QueryParam("purchaseType") String purchaseType, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("description") String description, @QueryParam("tickets") Integer tickets, @QueryParam("price") Float price, @QueryParam("purchaseCode") String purchaseCode, @QueryParam("secretKey") String secretKey, @DefaultValue("0") @QueryParam("purchaseLimit") Integer purchaseLimit,, allowableValues="DAY_PREMIUM, WEEK_PREMIUM, MONTH_PREMIUM, YEAR_PREMIUM, LIFETIME_PREMIUM, ADD_TICKET, ADD_GIFT, ADD_POINTS" @QueryParam("serviceAction") String serviceAction, @QueryParam("coverAssetId") Long coverAssetId, @QueryParam("promoAssetId") Long promoAssetId, @QueryParam("giftable") Boolean giftable, @QueryParam("assetable") Boolean assetable, @DefaultValue("false") @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points, @QueryParam("offerLocationId") Long offerLocationId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createPurchaseItem(appKey,name,purchaseType,deviceId,accountId,description,tickets,price,purchaseCode,secretKey,purchaseLimit,serviceAction,coverAssetId,promoAssetId,giftable,assetable,allocateTickets,ticketType,points,offerLocationId,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Purchase", notes = "Marks the purchase item as deleted", response = SirqulResponse.class, tags={ "Purchase Item", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deletePurchaseItem( @NotNull @QueryParam("purchaseItemId") Long purchaseItemId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deletePurchaseItem(purchaseItemId,deviceId,accountId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Purchase", notes = "Get detailed information about a purchase item", response = PurchaseItemFullResponse.class, tags={ "Purchase Item", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PurchaseItemFullResponse.class) })
    public Response getPurchaseItem( @NotNull @QueryParam("purchaseItemId") Long purchaseItemId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPurchaseItem(purchaseItemId,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/gift")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Gift Tickets", notes = "Gift tickets to another user.", response = SirqulResponse.class, tags={ "Ticket", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response giftPurchase( @NotNull @QueryParam("receiverAccountId") Long receiverAccountId, @NotNull @QueryParam("ticketId") Long ticketId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("assetId") Long assetId, @QueryParam("customMessage") String customMessage, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.giftPurchase(receiverAccountId,ticketId,deviceId,accountId,assetId,customMessage,gameType,appKey,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Purchases", notes = "Search for purchasable items from the system", response = PurchaseItemResponse.class, responseContainer = "List", tags={ "Purchase Item", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PurchaseItemResponse.class, responseContainer = "List") })
    public Response searchPurchaseItems( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @DefaultValue("false") @QueryParam("filterByBillable") Boolean filterByBillable, @QueryParam("purchaseType") String purchaseType, @QueryParam("serviceAction") String serviceAction, @QueryParam("keyword") String keyword,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DESCRIPTION, TICKETS, PRICE, PURCHASE_TYPE, PURCHASE_CODE, PURCHASE_LIMIT, SERIVCE_ACTION, GIFTABLE, ASSETABLE, APPLICATION_ID, APPLICATION_NAME" @DefaultValue("NAME") @QueryParam("sortField") String sortField, @DefaultValue("false") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("false") @QueryParam("activeOnly") Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchPurchaseItems(deviceId,accountId,appKey,filterByBillable,purchaseType,serviceAction,keyword,sortField,descending,start,limit,activeOnly,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Purchase", notes = "Updates a purchase item for in app purchases", response = PurchaseItemFullResponse.class, tags={ "Purchase Item", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PurchaseItemFullResponse.class) })
    public Response updatePurchaseItem( @NotNull @QueryParam("purchaseItemId") Long purchaseItemId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("tickets") Integer tickets, @QueryParam("price") Float price,, allowableValues="SIRQUL, IOS, GOOGLE, AMAZON, MAC, WP8, FREE" @QueryParam("purchaseType") String purchaseType, @QueryParam("purchaseCode") String purchaseCode, @QueryParam("secretKey") String secretKey, @QueryParam("purchaseLimit") Integer purchaseLimit,, allowableValues="DAY_PREMIUM, WEEK_PREMIUM, MONTH_PREMIUM, YEAR_PREMIUM, LIFETIME_PREMIUM, ADD_TICKET, ADD_GIFT, ADD_POINTS" @QueryParam("serviceAction") String serviceAction, @QueryParam("coverAssetId") Long coverAssetId, @QueryParam("promoAssetId") Long promoAssetId, @QueryParam("giftable") Boolean giftable, @QueryParam("assetable") Boolean assetable, @QueryParam("active") Boolean active, @DefaultValue("false") @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points, @QueryParam("offerLocationId") Long offerLocationId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updatePurchaseItem(purchaseItemId,deviceId,accountId,name,description,tickets,price,purchaseType,purchaseCode,secretKey,purchaseLimit,serviceAction,coverAssetId,promoAssetId,giftable,assetable,active,allocateTickets,ticketType,points,offerLocationId,securityContext);
    }
}
