package controllers;

import java.math.BigDecimal;
import apimodels.ListingFullResponse;
import apimodels.ListingGroupResponse;
import apimodels.ListingResponse;
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
public abstract class ListingApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createListingHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, String filterIds, String description, Long start, Long end, String locationName, String locationDescription, Boolean isPrivate, String externalId, String externalId2, String externalGroupId, Boolean active, String metaData) throws Exception {
        ListingFullResponse obj = createListing(request, version, accountId, name, filterIds, description, start, end, locationName, locationDescription, isPrivate, externalId, externalId2, externalGroupId, active, metaData);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ListingFullResponse createListing(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, String filterIds, String description, Long start, Long end, String locationName, String locationDescription, Boolean isPrivate, String externalId, String externalId2, String externalGroupId, Boolean active, String metaData) throws Exception;

    public Result deleteListingHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long listingId) throws Exception {
        SirqulResponse obj = deleteListing(request, version, accountId, listingId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteListing(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long listingId) throws Exception;

    public Result getListingHttp(Http.Request request, BigDecimal version, @NotNull Long listingId) throws Exception {
        ListingFullResponse obj = getListing(request, version, listingId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ListingFullResponse getListing(Http.Request request, BigDecimal version, @NotNull Long listingId) throws Exception;

    public Result searchListingHttp(Http.Request request, BigDecimal version, Long accountId, String keyword, Integer start, Integer limit, Boolean activeOnly, Double latitude, Double longitude, Long startDate, Long endDate, String categoryIds, String filterIds, Boolean useListingOrderIds, String externalId, String externalId2, String externalGroupId) throws Exception {
        List<ListingResponse> obj = searchListing(request, version, accountId, keyword, start, limit, activeOnly, latitude, longitude, startDate, endDate, categoryIds, filterIds, useListingOrderIds, externalId, externalId2, externalGroupId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (ListingResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<ListingResponse> searchListing(Http.Request request, BigDecimal version, Long accountId, String keyword, Integer start, Integer limit, Boolean activeOnly, Double latitude, Double longitude, Long startDate, Long endDate, String categoryIds, String filterIds, Boolean useListingOrderIds, String externalId, String externalId2, String externalGroupId) throws Exception;

    public Result summaryListingHttp(Http.Request request, BigDecimal version, Long accountId, Long startDate, String categoryIds, Integer daysToInclude, Boolean useListingOrderIds) throws Exception {
        List<ListingGroupResponse> obj = summaryListing(request, version, accountId, startDate, categoryIds, daysToInclude, useListingOrderIds);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (ListingGroupResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<ListingGroupResponse> summaryListing(Http.Request request, BigDecimal version, Long accountId, Long startDate, String categoryIds, Integer daysToInclude, Boolean useListingOrderIds) throws Exception;

    public Result updateListingHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long listingId, String filterIds, String name, String description, Long start, Long end, String locationName, String locationDescription, Boolean isPrivate, String externalId, String externalId2, String externalGroupId, Boolean active, String metaData) throws Exception {
        ListingFullResponse obj = updateListing(request, version, accountId, listingId, filterIds, name, description, start, end, locationName, locationDescription, isPrivate, externalId, externalId2, externalGroupId, active, metaData);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ListingFullResponse updateListing(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long listingId, String filterIds, String name, String description, Long start, Long end, String locationName, String locationDescription, Boolean isPrivate, String externalId, String externalId2, String externalGroupId, Boolean active, String metaData) throws Exception;

}
