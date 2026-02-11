package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.PurchaseItemFullResponse;
import org.openapitools.model.PurchaseItemResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class PurchaseApiService {
    public abstract Response createPurchaseItem( @NotNull String appKey, @NotNull String name, @NotNull String purchaseType,String deviceId,Long accountId,String description,Integer tickets,Float price,String purchaseCode,String secretKey,Integer purchaseLimit,String serviceAction,Long coverAssetId,Long promoAssetId,Boolean giftable,Boolean assetable,Boolean allocateTickets,String ticketType,Long points,Long offerLocationId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deletePurchaseItem( @NotNull Long purchaseItemId,String deviceId,Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPurchaseItem( @NotNull Long purchaseItemId,String deviceId,Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response giftPurchase( @NotNull Long receiverAccountId, @NotNull Long ticketId,String deviceId,Long accountId,Long assetId,String customMessage,String gameType,String appKey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchPurchaseItems(String deviceId,Long accountId,String appKey,Boolean filterByBillable,String purchaseType,String serviceAction,String keyword,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updatePurchaseItem( @NotNull Long purchaseItemId,String deviceId,Long accountId,String name,String description,Integer tickets,Float price,String purchaseType,String purchaseCode,String secretKey,Integer purchaseLimit,String serviceAction,Long coverAssetId,Long promoAssetId,Boolean giftable,Boolean assetable,Boolean active,Boolean allocateTickets,String ticketType,Long points,Long offerLocationId,SecurityContext securityContext) throws NotFoundException;
}
