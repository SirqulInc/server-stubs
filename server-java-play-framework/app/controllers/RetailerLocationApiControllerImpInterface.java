package controllers;

import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.RetailerLocationResponse;
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
public abstract class RetailerLocationApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createRetailerLocationConsumerHttp(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String name, String deviceId, Long accountId, String streetAddress, String streetAddress2, String city, String state, String postalCode, String country, String businessPhone, String businessPhoneExt, String website, String email, String detailsHeader, String detailsBody, String hours, String tags, Long logoAssetId, Long picture1AssetId, Long picture2AssetId, String categoryIds, String filterIds, String metaData, Boolean publicLocation, Boolean active, String locationType, Double latitude, Double longitude) throws Exception {
        RetailerLocationResponse obj = createRetailerLocationConsumer(request, version, appKey, name, deviceId, accountId, streetAddress, streetAddress2, city, state, postalCode, country, businessPhone, businessPhoneExt, website, email, detailsHeader, detailsBody, hours, tags, logoAssetId, picture1AssetId, picture2AssetId, categoryIds, filterIds, metaData, publicLocation, active, locationType, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RetailerLocationResponse createRetailerLocationConsumer(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String name, String deviceId, Long accountId, String streetAddress, String streetAddress2, String city, String state, String postalCode, String country, String businessPhone, String businessPhoneExt, String website, String email, String detailsHeader, String detailsBody, String hours, String tags, Long logoAssetId, Long picture1AssetId, Long picture2AssetId, String categoryIds, String filterIds, String metaData, Boolean publicLocation, Boolean active, String locationType, Double latitude, Double longitude) throws Exception;

    public Result createRetailerLocationsHttp(Http.Request request, BigDecimal version, @NotNull Long retailerId, @NotNull String name, @NotNull String streetAddress, @NotNull String city, @NotNull String state, @NotNull String postalCode, String deviceId, Long accountId, String streetAddress2, String country, String businessPhone, String businessPhoneExt, String website, String email, String internalId, String detailsHeader, String detailsBody, String hours, InputStream logo, Long logoAssetId, InputStream picture1, Long picture1AssetId, InputStream picture2, Long picture2AssetId, String categoryIds, String filterIds, Double latitude, Double longitude, String building, String googlePlaceId, String yelpId, Boolean active, Boolean publicLocation, String locationType, String audienceIds, String audienceIdsToAdd, String audienceIdsToRemove, String responseFormat, String responseIncludes) throws Exception {
        RetailerLocationResponse obj = createRetailerLocations(request, version, retailerId, name, streetAddress, city, state, postalCode, deviceId, accountId, streetAddress2, country, businessPhone, businessPhoneExt, website, email, internalId, detailsHeader, detailsBody, hours, logo, logoAssetId, picture1, picture1AssetId, picture2, picture2AssetId, categoryIds, filterIds, latitude, longitude, building, googlePlaceId, yelpId, active, publicLocation, locationType, audienceIds, audienceIdsToAdd, audienceIdsToRemove, responseFormat, responseIncludes);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RetailerLocationResponse createRetailerLocations(Http.Request request, BigDecimal version, @NotNull Long retailerId, @NotNull String name, @NotNull String streetAddress, @NotNull String city, @NotNull String state, @NotNull String postalCode, String deviceId, Long accountId, String streetAddress2, String country, String businessPhone, String businessPhoneExt, String website, String email, String internalId, String detailsHeader, String detailsBody, String hours, InputStream logo, Long logoAssetId, InputStream picture1, Long picture1AssetId, InputStream picture2, Long picture2AssetId, String categoryIds, String filterIds, Double latitude, Double longitude, String building, String googlePlaceId, String yelpId, Boolean active, Boolean publicLocation, String locationType, String audienceIds, String audienceIdsToAdd, String audienceIdsToRemove, String responseFormat, String responseIncludes) throws Exception;

    public Result deleteRetailerLocationHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long retailerLocationId) throws Exception {
        SirqulResponse obj = deleteRetailerLocation(request, version, deviceId, accountId, retailerLocationId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteRetailerLocation(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long retailerLocationId) throws Exception;

    public Result getRetailerLocationHttp(Http.Request request, BigDecimal version, @NotNull Long retailerLocationId, String deviceId, Long accountId, String retailerLocationToken) throws Exception {
        RetailerLocationResponse obj = getRetailerLocation(request, version, retailerLocationId, deviceId, accountId, retailerLocationToken);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RetailerLocationResponse getRetailerLocation(Http.Request request, BigDecimal version, @NotNull Long retailerLocationId, String deviceId, Long accountId, String retailerLocationToken) throws Exception;

    public Result getRetailerLocationConsumerHttp(Http.Request request, BigDecimal version, @NotNull Long retailerLocationId, String deviceId, Long accountId) throws Exception {
        RetailerLocationResponse obj = getRetailerLocationConsumer(request, version, retailerLocationId, deviceId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RetailerLocationResponse getRetailerLocationConsumer(Http.Request request, BigDecimal version, @NotNull Long retailerLocationId, String deviceId, Long accountId) throws Exception;

    public Result indexedRetailerLocationDistanceSearchHttp(Http.Request request, BigDecimal version, @NotNull Double latitude, @NotNull Double longitude, @NotNull Double searchRange, @NotNull Integer start, @NotNull Integer limit, Long accountId, String address, Boolean hasOffers, String categories, String filters, String audiences, String retailerIds, String retailerLocationIds, String tags, String locationType, String sortField, Boolean descending, String q, String keyword, String keywordOperator, String searchExpression, String distanceUnit, Boolean returnFavorited, Boolean returnRetailer, Boolean returnAssets, Boolean returnOffers, Boolean returnCategories, Boolean returnFilters, Boolean returnAudiences, Boolean returnQrCode, Boolean returnExternalCategoryData, Boolean includeFavorite, Boolean includeLiked, Boolean includeRating) throws Exception {
        List<RetailerLocationResponse> obj = indexedRetailerLocationDistanceSearch(request, version, latitude, longitude, searchRange, start, limit, accountId, address, hasOffers, categories, filters, audiences, retailerIds, retailerLocationIds, tags, locationType, sortField, descending, q, keyword, keywordOperator, searchExpression, distanceUnit, returnFavorited, returnRetailer, returnAssets, returnOffers, returnCategories, returnFilters, returnAudiences, returnQrCode, returnExternalCategoryData, includeFavorite, includeLiked, includeRating);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (RetailerLocationResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<RetailerLocationResponse> indexedRetailerLocationDistanceSearch(Http.Request request, BigDecimal version, @NotNull Double latitude, @NotNull Double longitude, @NotNull Double searchRange, @NotNull Integer start, @NotNull Integer limit, Long accountId, String address, Boolean hasOffers, String categories, String filters, String audiences, String retailerIds, String retailerLocationIds, String tags, String locationType, String sortField, Boolean descending, String q, String keyword, String keywordOperator, String searchExpression, String distanceUnit, Boolean returnFavorited, Boolean returnRetailer, Boolean returnAssets, Boolean returnOffers, Boolean returnCategories, Boolean returnFilters, Boolean returnAudiences, Boolean returnQrCode, Boolean returnExternalCategoryData, Boolean includeFavorite, Boolean includeLiked, Boolean includeRating) throws Exception;

    public Result indexedRetailerLocationSearchHttp(Http.Request request, BigDecimal version, Long accountId, Integer start, Integer limit, Boolean hasOffers, String categories, String filters, String audiences, String retailerIds, String retailerLocationIds, String tags, String locationType, String sortField, Boolean descending, String q, String keyword, String keywordOperator, String searchExpression, Boolean returnRetailer, Boolean returnAssets, Boolean returnOffers, Boolean returnCategories, Boolean returnFilters, Boolean returnAudiences, Boolean returnQrCode, Boolean returnExternalCategoryData, Boolean includeFavorite, Boolean includeLiked, Boolean includeRating) throws Exception {
        List<RetailerLocationResponse> obj = indexedRetailerLocationSearch(request, version, accountId, start, limit, hasOffers, categories, filters, audiences, retailerIds, retailerLocationIds, tags, locationType, sortField, descending, q, keyword, keywordOperator, searchExpression, returnRetailer, returnAssets, returnOffers, returnCategories, returnFilters, returnAudiences, returnQrCode, returnExternalCategoryData, includeFavorite, includeLiked, includeRating);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (RetailerLocationResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<RetailerLocationResponse> indexedRetailerLocationSearch(Http.Request request, BigDecimal version, Long accountId, Integer start, Integer limit, Boolean hasOffers, String categories, String filters, String audiences, String retailerIds, String retailerLocationIds, String tags, String locationType, String sortField, Boolean descending, String q, String keyword, String keywordOperator, String searchExpression, Boolean returnRetailer, Boolean returnAssets, Boolean returnOffers, Boolean returnCategories, Boolean returnFilters, Boolean returnAudiences, Boolean returnQrCode, Boolean returnExternalCategoryData, Boolean includeFavorite, Boolean includeLiked, Boolean includeRating) throws Exception;

    public Result searchRetailerLocationsHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, String q, String keyword, String retailerIds, String retailerLocationIds, String locationType, String sortField, Boolean descending, Integer i, Integer start, Integer l, Integer limit, Boolean showPublicLocations, Boolean activeOnly, Boolean returnRetailer, Boolean returnAssets, Boolean returnOffers, Boolean returnCategories, Boolean returnFilters, Boolean returnAudiences, Boolean returnQrCode, Boolean includeFavorite, Boolean includeLiked, Boolean includeRating) throws Exception {
        List<RetailerLocationResponse> obj = searchRetailerLocations(request, version, deviceId, accountId, q, keyword, retailerIds, retailerLocationIds, locationType, sortField, descending, i, start, l, limit, showPublicLocations, activeOnly, returnRetailer, returnAssets, returnOffers, returnCategories, returnFilters, returnAudiences, returnQrCode, includeFavorite, includeLiked, includeRating);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (RetailerLocationResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<RetailerLocationResponse> searchRetailerLocations(Http.Request request, BigDecimal version, String deviceId, Long accountId, String q, String keyword, String retailerIds, String retailerLocationIds, String locationType, String sortField, Boolean descending, Integer i, Integer start, Integer l, Integer limit, Boolean showPublicLocations, Boolean activeOnly, Boolean returnRetailer, Boolean returnAssets, Boolean returnOffers, Boolean returnCategories, Boolean returnFilters, Boolean returnAudiences, Boolean returnQrCode, Boolean includeFavorite, Boolean includeLiked, Boolean includeRating) throws Exception;

    public Result updateRetailerLocationsHttp(Http.Request request, BigDecimal version, @NotNull Long retailerLocationId, String deviceId, Long accountId, String name, String streetAddress, String streetAddress2, String city, String state, String postalCode, String country, String businessPhone, String businessPhoneExt, String website, String email, String internalId, String detailsHeader, String detailsBody, String hours, InputStream logo, Long logoAssetId, InputStream picture1, Long picture1AssetId, InputStream picture2, Long picture2AssetId, String categoryIds, String filterIds, Double latitude, Double longitude, String building, String googlePlaceId, String yelpId, String metaData, String paymentProvider, Boolean active, Boolean publicLocation, String locationType, String audienceIds, String audienceIdsToAdd, String audienceIdsToRemove, String responseFormat, String tags) throws Exception {
        RetailerLocationResponse obj = updateRetailerLocations(request, version, retailerLocationId, deviceId, accountId, name, streetAddress, streetAddress2, city, state, postalCode, country, businessPhone, businessPhoneExt, website, email, internalId, detailsHeader, detailsBody, hours, logo, logoAssetId, picture1, picture1AssetId, picture2, picture2AssetId, categoryIds, filterIds, latitude, longitude, building, googlePlaceId, yelpId, metaData, paymentProvider, active, publicLocation, locationType, audienceIds, audienceIdsToAdd, audienceIdsToRemove, responseFormat, tags);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RetailerLocationResponse updateRetailerLocations(Http.Request request, BigDecimal version, @NotNull Long retailerLocationId, String deviceId, Long accountId, String name, String streetAddress, String streetAddress2, String city, String state, String postalCode, String country, String businessPhone, String businessPhoneExt, String website, String email, String internalId, String detailsHeader, String detailsBody, String hours, InputStream logo, Long logoAssetId, InputStream picture1, Long picture1AssetId, InputStream picture2, Long picture2AssetId, String categoryIds, String filterIds, Double latitude, Double longitude, String building, String googlePlaceId, String yelpId, String metaData, String paymentProvider, Boolean active, Boolean publicLocation, String locationType, String audienceIds, String audienceIdsToAdd, String audienceIdsToRemove, String responseFormat, String tags) throws Exception;

}
