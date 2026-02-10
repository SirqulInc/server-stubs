package controllers;

import java.math.BigDecimal;
import apimodels.RatingIndexResponse;
import apimodels.RatingResponse;
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
public class RatingApiControllerImp extends RatingApiControllerImpInterface {
    @Override
    public RatingResponse createRating(Http.Request request, BigDecimal version, @NotNull String ratableType, @NotNull Long ratableId, @NotNull Integer ratingValue, String deviceId, Long accountId, Long categoryId, String display, String description, String locationDescription, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new RatingResponse();
    }

    @Override
    public SirqulResponse deleteRating(Http.Request request, BigDecimal version, @NotNull Long ratingId, String deviceId, Long accountId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public List<RatingIndexResponse> searchLocationRatingIndexes(Http.Request request, BigDecimal version, String categoryIds, String keyword, String locationType, String sortField, Boolean descending, Integer start, Integer limit, Double searchRange, Double latitude, Double longitude, Boolean returnOverallRating, String distanceUnit, Boolean returnRetailer, Boolean returnAssets, Boolean returnOffers, Boolean returnCategories, Boolean returnFilters) throws Exception {
        //Do your magic!!!
        return new ArrayList<RatingIndexResponse>();
    }

    @Override
    public List<RatingIndexResponse> searchRatingIndexes(Http.Request request, BigDecimal version, @NotNull String ratableType, String ratableIds, String categoryIds, String secondaryType, String keyword, String sortField, Boolean descending, Integer start, Integer limit, Double latitude, Double longitude, Boolean returnRatable, Boolean returnOverallRating) throws Exception {
        //Do your magic!!!
        return new ArrayList<RatingIndexResponse>();
    }

    @Override
    public List<RatingResponse> searchRatings(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long filterAccountId, String ratableType, Long ratableId, String categoryIds, String keyword, String sortField, Boolean descending, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new ArrayList<RatingResponse>();
    }

    @Override
    public RatingResponse updateRating(Http.Request request, BigDecimal version, @NotNull Long ratingId, String deviceId, Long accountId, Integer ratingValue, Long categoryId, String display, String description, String locationDescription, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new RatingResponse();
    }

}
