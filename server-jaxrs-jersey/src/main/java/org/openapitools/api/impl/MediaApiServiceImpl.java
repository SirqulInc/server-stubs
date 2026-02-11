package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.MediaOfferResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class MediaApiServiceImpl extends MediaApiService {
    @Override
    public Response createMedia( @NotNull Long accountId,  @NotNull String title,  @NotNull String barcodeType,  @NotNull Boolean noExpiration,  @NotNull Integer availableLimit,  @NotNull Integer availableLimitPerUser,  @NotNull Integer addedLimit,  @NotNull Integer viewLimit,  @NotNull Integer maxPrints,  @NotNull Long ticketPrice,  @NotNull Double fullPrice,  @NotNull Double discountPrice,  @NotNull String specialOfferType,  @NotNull String offerVisibility,  @NotNull Boolean active, String retailerLocationIds, String subTitle, String details, String subDetails, String finePrint, String barcodeEntry, String externalRedeemOptions, String externalUrl, String ticketsRewardType, Long ticketsReward, Long activated, Long expires, String ticketPriceType, Boolean showRemaining, Boolean showRedeemed, Boolean replaced, Boolean featured, String categoryIds, String filterIds, Long barcodeAssetId, Long imageAssetId, Long imageAssetId1, Long imageAssetId2, Long imageAssetId3, Long imageAssetId4, Long imageAssetId5, String publisher, Long redeemableStart, Long redeemableEnd, String conditionType, String isbn, String asin, String catalogNumbers, String parentalRating, Long availabilityDate, String mediaType, Integer duration, String author, Long releaseDate, String collectionIds, String availability, String availabilitySummary, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteMedia( @NotNull Long accountId,  @NotNull Long mediaId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getMedia( @NotNull Long accountId,  @NotNull Long mediaId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response searchMedia( @NotNull Long accountId,  @NotNull Boolean activeOnly,  @NotNull String sortField,  @NotNull Boolean descending, String keyword, String categoryIds, String filterIds, Integer start, Integer limit, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateMedia( @NotNull Long accountId,  @NotNull Long mediaId, String retailerLocationIds, String offerLocations, String title, String subTitle, String details, String subDetails, String finePrint, String barcodeType, String barcodeEntry, String externalRedeemOptions, String externalUrl, String ticketsRewardType, Long ticketsReward, Long activated, Long expires, Boolean noExpiration, Integer availableLimit, Integer availableLimitPerUser, Integer addedLimit, Integer viewLimit, Integer maxPrints, String ticketPriceType, Long ticketPrice, Double fullPrice, Double discountPrice, Boolean showRemaining, Boolean showRedeemed, Boolean replaced, Boolean featured, String specialOfferType, String offerVisibility, String categoryIds, String filterIds, Boolean active, Long barcodeAssetId, Long imageAssetId, Long imageAssetId1, Long imageAssetId2, Long imageAssetId3, Long imageAssetId4, Long imageAssetId5, String publisher, Long redeemableStart, Long redeemableEnd, String conditionType, String isbn, String asin, String catalogNumbers, Long availabilityDate, String parentalRating, String mediaType, Integer duration, String author, Long releaseDate, String collectionIds, String availability, String availabilitySummary, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
