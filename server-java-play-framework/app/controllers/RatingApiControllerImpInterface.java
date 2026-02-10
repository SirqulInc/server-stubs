package controllers;

import java.math.BigDecimal;
import apimodels.RatingIndexResponse;
import apimodels.RatingResponse;
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
public abstract class RatingApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createRatingHttp(Http.Request request, BigDecimal version, @NotNull String ratableType, @NotNull Long ratableId, @NotNull Integer ratingValue, String deviceId, Long accountId, Long categoryId, String display, String description, String locationDescription, Double latitude, Double longitude) throws Exception {
        RatingResponse obj = createRating(request, version, ratableType, ratableId, ratingValue, deviceId, accountId, categoryId, display, description, locationDescription, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RatingResponse createRating(Http.Request request, BigDecimal version, @NotNull String ratableType, @NotNull Long ratableId, @NotNull Integer ratingValue, String deviceId, Long accountId, Long categoryId, String display, String description, String locationDescription, Double latitude, Double longitude) throws Exception;

    public Result deleteRatingHttp(Http.Request request, BigDecimal version, @NotNull Long ratingId, String deviceId, Long accountId) throws Exception {
        SirqulResponse obj = deleteRating(request, version, ratingId, deviceId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteRating(Http.Request request, BigDecimal version, @NotNull Long ratingId, String deviceId, Long accountId) throws Exception;

    public Result searchLocationRatingIndexesHttp(Http.Request request, BigDecimal version, String categoryIds, String keyword, String locationType, String sortField, Boolean descending, Integer start, Integer limit, Double searchRange, Double latitude, Double longitude, Boolean returnOverallRating, String distanceUnit, Boolean returnRetailer, Boolean returnAssets, Boolean returnOffers, Boolean returnCategories, Boolean returnFilters) throws Exception {
        List<RatingIndexResponse> obj = searchLocationRatingIndexes(request, version, categoryIds, keyword, locationType, sortField, descending, start, limit, searchRange, latitude, longitude, returnOverallRating, distanceUnit, returnRetailer, returnAssets, returnOffers, returnCategories, returnFilters);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (RatingIndexResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<RatingIndexResponse> searchLocationRatingIndexes(Http.Request request, BigDecimal version, String categoryIds, String keyword, String locationType, String sortField, Boolean descending, Integer start, Integer limit, Double searchRange, Double latitude, Double longitude, Boolean returnOverallRating, String distanceUnit, Boolean returnRetailer, Boolean returnAssets, Boolean returnOffers, Boolean returnCategories, Boolean returnFilters) throws Exception;

    public Result searchRatingIndexesHttp(Http.Request request, BigDecimal version, @NotNull String ratableType, String ratableIds, String categoryIds, String secondaryType, String keyword, String sortField, Boolean descending, Integer start, Integer limit, Double latitude, Double longitude, Boolean returnRatable, Boolean returnOverallRating) throws Exception {
        List<RatingIndexResponse> obj = searchRatingIndexes(request, version, ratableType, ratableIds, categoryIds, secondaryType, keyword, sortField, descending, start, limit, latitude, longitude, returnRatable, returnOverallRating);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (RatingIndexResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<RatingIndexResponse> searchRatingIndexes(Http.Request request, BigDecimal version, @NotNull String ratableType, String ratableIds, String categoryIds, String secondaryType, String keyword, String sortField, Boolean descending, Integer start, Integer limit, Double latitude, Double longitude, Boolean returnRatable, Boolean returnOverallRating) throws Exception;

    public Result searchRatingsHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long filterAccountId, String ratableType, Long ratableId, String categoryIds, String keyword, String sortField, Boolean descending, Integer start, Integer limit) throws Exception {
        List<RatingResponse> obj = searchRatings(request, version, deviceId, accountId, filterAccountId, ratableType, ratableId, categoryIds, keyword, sortField, descending, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (RatingResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<RatingResponse> searchRatings(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long filterAccountId, String ratableType, Long ratableId, String categoryIds, String keyword, String sortField, Boolean descending, Integer start, Integer limit) throws Exception;

    public Result updateRatingHttp(Http.Request request, BigDecimal version, @NotNull Long ratingId, String deviceId, Long accountId, Integer ratingValue, Long categoryId, String display, String description, String locationDescription, Double latitude, Double longitude) throws Exception {
        RatingResponse obj = updateRating(request, version, ratingId, deviceId, accountId, ratingValue, categoryId, display, description, locationDescription, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RatingResponse updateRating(Http.Request request, BigDecimal version, @NotNull Long ratingId, String deviceId, Long accountId, Integer ratingValue, Long categoryId, String display, String description, String locationDescription, Double latitude, Double longitude) throws Exception;

}
