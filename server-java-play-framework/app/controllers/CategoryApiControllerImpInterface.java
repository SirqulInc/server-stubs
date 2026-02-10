package controllers;

import java.math.BigDecimal;
import apimodels.CategoryResponse;
import apimodels.CategoryTreeResponse;
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
public abstract class CategoryApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result categoryDistanceSearchHttp(Http.Request request, BigDecimal version, Long accountId, String keyword, String appKey, String categoryIds, String parentCategoryIds, Boolean rootOnly, String sortField, String responseGroup, Boolean descending, Integer start, Integer limit, Boolean activeOnly, Boolean returnExternal, Boolean exactMatch, String type, String externalType, Integer minOfferCount, Double latitude, Double longitude, Double range) throws Exception {
        List<CategoryResponse> obj = categoryDistanceSearch(request, version, accountId, keyword, appKey, categoryIds, parentCategoryIds, rootOnly, sortField, responseGroup, descending, start, limit, activeOnly, returnExternal, exactMatch, type, externalType, minOfferCount, latitude, longitude, range);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (CategoryResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<CategoryResponse> categoryDistanceSearch(Http.Request request, BigDecimal version, Long accountId, String keyword, String appKey, String categoryIds, String parentCategoryIds, Boolean rootOnly, String sortField, String responseGroup, Boolean descending, Integer start, Integer limit, Boolean activeOnly, Boolean returnExternal, Boolean exactMatch, String type, String externalType, Integer minOfferCount, Double latitude, Double longitude, Double range) throws Exception;

    public Result createCategoryHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, String appKey, Long parentCategoryId, String description, String type, Long assetId, String externalId, String externalType, String externalCategorySlug, String sqootSlug, Boolean active, String metaData, String searchTags) throws Exception {
        CategoryTreeResponse obj = createCategory(request, version, accountId, name, appKey, parentCategoryId, description, type, assetId, externalId, externalType, externalCategorySlug, sqootSlug, active, metaData, searchTags);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CategoryTreeResponse createCategory(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, String appKey, Long parentCategoryId, String description, String type, Long assetId, String externalId, String externalType, String externalCategorySlug, String sqootSlug, Boolean active, String metaData, String searchTags) throws Exception;

    public Result deleteCategoryHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long categoryId) throws Exception {
        SirqulResponse obj = deleteCategory(request, version, accountId, categoryId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteCategory(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long categoryId) throws Exception;

    public Result duplicateCategoryHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long categoryId, String appKey, Long parentCategoryId) throws Exception {
        CategoryTreeResponse obj = duplicateCategory(request, version, accountId, categoryId, appKey, parentCategoryId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CategoryTreeResponse duplicateCategory(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long categoryId, String appKey, Long parentCategoryId) throws Exception;

    public Result getCategoryHttp(Http.Request request, BigDecimal version, @NotNull Long categoryId, Boolean returnExternal) throws Exception {
        CategoryTreeResponse obj = getCategory(request, version, categoryId, returnExternal);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CategoryTreeResponse getCategory(Http.Request request, BigDecimal version, @NotNull Long categoryId, Boolean returnExternal) throws Exception;

    public Result searchCategoriesHttp(Http.Request request, BigDecimal version, Long accountId, String keyword, String appKey, String categoryId, String categoryIds, String parentCategoryIds, Boolean rootOnly, String sortField, String responseGroup, Boolean descending, Integer start, Integer limit, Boolean activeOnly, Boolean returnExternal, Boolean exactMatch, String type, String externalType, Boolean excludeExternalType, Integer minOfferCount, Integer searchDepth, String searchMode) throws Exception {
        List<CategoryResponse> obj = searchCategories(request, version, accountId, keyword, appKey, categoryId, categoryIds, parentCategoryIds, rootOnly, sortField, responseGroup, descending, start, limit, activeOnly, returnExternal, exactMatch, type, externalType, excludeExternalType, minOfferCount, searchDepth, searchMode);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (CategoryResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<CategoryResponse> searchCategories(Http.Request request, BigDecimal version, Long accountId, String keyword, String appKey, String categoryId, String categoryIds, String parentCategoryIds, Boolean rootOnly, String sortField, String responseGroup, Boolean descending, Integer start, Integer limit, Boolean activeOnly, Boolean returnExternal, Boolean exactMatch, String type, String externalType, Boolean excludeExternalType, Integer minOfferCount, Integer searchDepth, String searchMode) throws Exception;

    public Result updateCategoryHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long categoryId, Long parentCategoryId, String name, String description, String type, Long assetId, String externalId, String externalType, String externalCategorySlug, String sqootSlug, Boolean active, String metaData, String searchTags) throws Exception {
        CategoryTreeResponse obj = updateCategory(request, version, accountId, categoryId, parentCategoryId, name, description, type, assetId, externalId, externalType, externalCategorySlug, sqootSlug, active, metaData, searchTags);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CategoryTreeResponse updateCategory(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long categoryId, Long parentCategoryId, String name, String description, String type, Long assetId, String externalId, String externalType, String externalCategorySlug, String sqootSlug, Boolean active, String metaData, String searchTags) throws Exception;

}
