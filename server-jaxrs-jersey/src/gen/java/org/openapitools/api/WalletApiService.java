package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.OfferTransactionResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class WalletApiService {
    public abstract Response createOfferTransaction(String deviceId,Long accountId,Long offerId,Long offerLocationId,String offerCart,String promoCode,String currencyType,Boolean usePoints,String metaData,String appKey,Integer status,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteOfferTransaction( @NotNull Long transactionId,String deviceId,Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getOfferTransaction( @NotNull Long transactionId,String deviceId,Long accountId,Boolean includeMission,Double latitude,Double longitude,Boolean returnFullResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response previewOfferTransaction(String deviceId,Long accountId,Long offerId,Long offerLocationId,String offerCart,String promoCode,String currencyType,Boolean usePoints,String metaData,String appKey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchOfferTransactions(String deviceId,Long accountId,String keyword,Long retailerId,String retailerIds,Long retailerLocationId,String retailerLocationIds,String excludeRetailerLocationIds,Long offerId,String offerIds,Long offerLocationId,String offerLocationIds,String offerType,String offerTypes,String specialOfferType,String specialOfferTypes,String categoryIds,String filterIds,String offerAudienceIds,String sortField,Boolean descending,Integer start,Integer limit,Double latitude,Double longitude,Long redeemableStartDate,Long redeemableEndDate,Boolean filterByParentOffer,Long startedSince,Long startedBefore,Long endedSince,Long endedBefore,Boolean redeemed,String statuses,Boolean reservationsOnly,Boolean activeOnly,Boolean returnFullResponse,Long recurringStartedSince,Long recurringStartedBefore,Long recurringExpirationSince,Long recurringExpirationBefore,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateOfferTransaction( @NotNull Long transactionId, @NotNull Integer status,String deviceId,Long accountId,Long offerLocationId,String currencyType,Boolean usePoints,String appKey,Double latitude,Double longitude,String metaData,Boolean returnFullResponse,String exceptionMembershipOfferIds,SecurityContext securityContext) throws NotFoundException;
}
