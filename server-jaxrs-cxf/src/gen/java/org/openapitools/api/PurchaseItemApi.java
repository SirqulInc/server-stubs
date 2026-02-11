package org.openapitools.api;

import org.openapitools.model.PurchaseItemFullResponse;
import org.openapitools.model.PurchaseItemResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
@Path("/purchase")
@Api(value = "/", description = "")
public interface PurchaseItemApi  {

    /**
     * Create Purchase
     *
     * Creates a purchase item for in app purchases
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Purchase", tags={ "Purchase Item" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PurchaseItemFullResponse.class) })
    public PurchaseItemFullResponse createPurchaseItem(@QueryParam("appKey") @NotNull String appKey, @QueryParam("name") @NotNull String name, @QueryParam("purchaseType") @NotNull String purchaseType, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("description") String description, @QueryParam("tickets") Integer tickets, @QueryParam("price") Float price, @QueryParam("purchaseCode") String purchaseCode, @QueryParam("secretKey") String secretKey, @QueryParam("purchaseLimit") @DefaultValue("0")Integer purchaseLimit, @QueryParam("serviceAction") String serviceAction, @QueryParam("coverAssetId") Long coverAssetId, @QueryParam("promoAssetId") Long promoAssetId, @QueryParam("giftable") Boolean giftable, @QueryParam("assetable") Boolean assetable, @QueryParam("allocateTickets") @DefaultValue("false")Boolean allocateTickets, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points, @QueryParam("offerLocationId") Long offerLocationId);

    /**
     * Delete Purchase
     *
     * Marks the purchase item as deleted
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Purchase", tags={ "Purchase Item" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deletePurchaseItem(@QueryParam("purchaseItemId") @NotNull Long purchaseItemId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId);

    /**
     * Get Purchase
     *
     * Get detailed information about a purchase item
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Purchase", tags={ "Purchase Item" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PurchaseItemFullResponse.class) })
    public PurchaseItemFullResponse getPurchaseItem(@QueryParam("purchaseItemId") @NotNull Long purchaseItemId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId);

    /**
     * Search Purchases
     *
     * Search for purchasable items from the system
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Purchases", tags={ "Purchase Item" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PurchaseItemResponse.class, responseContainer = "List") })
    public List<PurchaseItemResponse> searchPurchaseItems(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("filterByBillable") @DefaultValue("false")Boolean filterByBillable, @QueryParam("purchaseType") String purchaseType, @QueryParam("serviceAction") String serviceAction, @QueryParam("keyword") String keyword, @QueryParam("sortField") @DefaultValue("NAME")String sortField, @QueryParam("descending") @DefaultValue("false")Boolean descending, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("activeOnly") @DefaultValue("false")Boolean activeOnly);

    /**
     * Update Purchase
     *
     * Updates a purchase item for in app purchases
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Purchase", tags={ "Purchase Item" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PurchaseItemFullResponse.class) })
    public PurchaseItemFullResponse updatePurchaseItem(@QueryParam("purchaseItemId") @NotNull Long purchaseItemId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("tickets") Integer tickets, @QueryParam("price") Float price, @QueryParam("purchaseType") String purchaseType, @QueryParam("purchaseCode") String purchaseCode, @QueryParam("secretKey") String secretKey, @QueryParam("purchaseLimit") Integer purchaseLimit, @QueryParam("serviceAction") String serviceAction, @QueryParam("coverAssetId") Long coverAssetId, @QueryParam("promoAssetId") Long promoAssetId, @QueryParam("giftable") Boolean giftable, @QueryParam("assetable") Boolean assetable, @QueryParam("active") Boolean active, @QueryParam("allocateTickets") @DefaultValue("false")Boolean allocateTickets, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points, @QueryParam("offerLocationId") Long offerLocationId);
}
