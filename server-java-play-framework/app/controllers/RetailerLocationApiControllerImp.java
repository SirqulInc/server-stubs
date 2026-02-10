package controllers;

import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.RetailerLocationResponse;
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
public class RetailerLocationApiControllerImp extends RetailerLocationApiControllerImpInterface {
    @Override
    public RetailerLocationResponse createRetailerLocationConsumer(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String name, String deviceId, Long accountId, String streetAddress, String streetAddress2, String city, String state, String postalCode, String country, String businessPhone, String businessPhoneExt, String website, String email, String detailsHeader, String detailsBody, String hours, String tags, Long logoAssetId, Long picture1AssetId, Long picture2AssetId, String categoryIds, String filterIds, String metaData, Boolean publicLocation, Boolean active, String locationType, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new RetailerLocationResponse();
    }

    @Override
    public RetailerLocationResponse createRetailerLocations(Http.Request request, BigDecimal version, @NotNull Long retailerId, @NotNull String name, @NotNull String streetAddress, @NotNull String city, @NotNull String state, @NotNull String postalCode, String deviceId, Long accountId, String streetAddress2, String country, String businessPhone, String businessPhoneExt, String website, String email, String internalId, String detailsHeader, String detailsBody, String hours, InputStream logo, Long logoAssetId, InputStream picture1, Long picture1AssetId, InputStream picture2, Long picture2AssetId, String categoryIds, String filterIds, Double latitude, Double longitude, String building, String googlePlaceId, String yelpId, Boolean active, Boolean publicLocation, String locationType, String audienceIds, String audienceIdsToAdd, String audienceIdsToRemove, String responseFormat, String responseIncludes) throws Exception {
        //Do your magic!!!
        return new RetailerLocationResponse();
    }

    @Override
    public SirqulResponse deleteRetailerLocation(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long retailerLocationId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public RetailerLocationResponse getRetailerLocation(Http.Request request, BigDecimal version, @NotNull Long retailerLocationId, String deviceId, Long accountId, String retailerLocationToken) throws Exception {
        //Do your magic!!!
        return new RetailerLocationResponse();
    }

    @Override
    public RetailerLocationResponse getRetailerLocationConsumer(Http.Request request, BigDecimal version, @NotNull Long retailerLocationId, String deviceId, Long accountId) throws Exception {
        //Do your magic!!!
        return new RetailerLocationResponse();
    }

    @Override
    public List<RetailerLocationResponse> indexedRetailerLocationDistanceSearch(Http.Request request, BigDecimal version, @NotNull Double latitude, @NotNull Double longitude, @NotNull Double searchRange, @NotNull Integer start, @NotNull Integer limit, Long accountId, String address, Boolean hasOffers, String categories, String filters, String audiences, String retailerIds, String retailerLocationIds, String tags, String locationType, String sortField, Boolean descending, String q, String keyword, String keywordOperator, String searchExpression, String distanceUnit, Boolean returnFavorited, Boolean returnRetailer, Boolean returnAssets, Boolean returnOffers, Boolean returnCategories, Boolean returnFilters, Boolean returnAudiences, Boolean returnQrCode, Boolean returnExternalCategoryData, Boolean includeFavorite, Boolean includeLiked, Boolean includeRating) throws Exception {
        //Do your magic!!!
        return new ArrayList<RetailerLocationResponse>();
    }

    @Override
    public List<RetailerLocationResponse> indexedRetailerLocationSearch(Http.Request request, BigDecimal version, Long accountId, Integer start, Integer limit, Boolean hasOffers, String categories, String filters, String audiences, String retailerIds, String retailerLocationIds, String tags, String locationType, String sortField, Boolean descending, String q, String keyword, String keywordOperator, String searchExpression, Boolean returnRetailer, Boolean returnAssets, Boolean returnOffers, Boolean returnCategories, Boolean returnFilters, Boolean returnAudiences, Boolean returnQrCode, Boolean returnExternalCategoryData, Boolean includeFavorite, Boolean includeLiked, Boolean includeRating) throws Exception {
        //Do your magic!!!
        return new ArrayList<RetailerLocationResponse>();
    }

    @Override
    public List<RetailerLocationResponse> searchRetailerLocations(Http.Request request, BigDecimal version, String deviceId, Long accountId, String q, String keyword, String retailerIds, String retailerLocationIds, String locationType, String sortField, Boolean descending, Integer i, Integer start, Integer l, Integer limit, Boolean showPublicLocations, Boolean activeOnly, Boolean returnRetailer, Boolean returnAssets, Boolean returnOffers, Boolean returnCategories, Boolean returnFilters, Boolean returnAudiences, Boolean returnQrCode, Boolean includeFavorite, Boolean includeLiked, Boolean includeRating) throws Exception {
        //Do your magic!!!
        return new ArrayList<RetailerLocationResponse>();
    }

    @Override
    public RetailerLocationResponse updateRetailerLocations(Http.Request request, BigDecimal version, @NotNull Long retailerLocationId, String deviceId, Long accountId, String name, String streetAddress, String streetAddress2, String city, String state, String postalCode, String country, String businessPhone, String businessPhoneExt, String website, String email, String internalId, String detailsHeader, String detailsBody, String hours, InputStream logo, Long logoAssetId, InputStream picture1, Long picture1AssetId, InputStream picture2, Long picture2AssetId, String categoryIds, String filterIds, Double latitude, Double longitude, String building, String googlePlaceId, String yelpId, String metaData, String paymentProvider, Boolean active, Boolean publicLocation, String locationType, String audienceIds, String audienceIdsToAdd, String audienceIdsToRemove, String responseFormat, String tags) throws Exception {
        //Do your magic!!!
        return new RetailerLocationResponse();
    }

}
