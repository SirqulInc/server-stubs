package controllers;

import java.math.BigDecimal;
import apimodels.CategoryResponse;
import apimodels.CategoryTreeResponse;
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
public class CategoryApiControllerImp extends CategoryApiControllerImpInterface {
    @Override
    public List<CategoryResponse> categoryDistanceSearch(Http.Request request, BigDecimal version, Long accountId, String keyword, String appKey, String categoryIds, String parentCategoryIds, Boolean rootOnly, String sortField, String responseGroup, Boolean descending, Integer start, Integer limit, Boolean activeOnly, Boolean returnExternal, Boolean exactMatch, String type, String externalType, Integer minOfferCount, Double latitude, Double longitude, Double range) throws Exception {
        //Do your magic!!!
        return new ArrayList<CategoryResponse>();
    }

    @Override
    public CategoryTreeResponse createCategory(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, String appKey, Long parentCategoryId, String description, String type, Long assetId, String externalId, String externalType, String externalCategorySlug, String sqootSlug, Boolean active, String metaData, String searchTags) throws Exception {
        //Do your magic!!!
        return new CategoryTreeResponse();
    }

    @Override
    public SirqulResponse deleteCategory(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long categoryId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public CategoryTreeResponse duplicateCategory(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long categoryId, String appKey, Long parentCategoryId) throws Exception {
        //Do your magic!!!
        return new CategoryTreeResponse();
    }

    @Override
    public CategoryTreeResponse getCategory(Http.Request request, BigDecimal version, @NotNull Long categoryId, Boolean returnExternal) throws Exception {
        //Do your magic!!!
        return new CategoryTreeResponse();
    }

    @Override
    public List<CategoryResponse> searchCategories(Http.Request request, BigDecimal version, Long accountId, String keyword, String appKey, String categoryId, String categoryIds, String parentCategoryIds, Boolean rootOnly, String sortField, String responseGroup, Boolean descending, Integer start, Integer limit, Boolean activeOnly, Boolean returnExternal, Boolean exactMatch, String type, String externalType, Boolean excludeExternalType, Integer minOfferCount, Integer searchDepth, String searchMode) throws Exception {
        //Do your magic!!!
        return new ArrayList<CategoryResponse>();
    }

    @Override
    public CategoryTreeResponse updateCategory(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long categoryId, Long parentCategoryId, String name, String description, String type, Long assetId, String externalId, String externalType, String externalCategorySlug, String sqootSlug, Boolean active, String metaData, String searchTags) throws Exception {
        //Do your magic!!!
        return new CategoryTreeResponse();
    }

}
