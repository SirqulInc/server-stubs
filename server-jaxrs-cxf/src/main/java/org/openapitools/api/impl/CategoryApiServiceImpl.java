package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.CategoryResponse;
import org.openapitools.model.CategoryTreeResponse;
import org.openapitools.model.SirqulResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
public class CategoryApiServiceImpl implements CategoryApi {
    /**
     * Search Categories by Distance
     *
     * Search for categories by distance.
     *
     */
    public List<CategoryResponse> categoryDistanceSearch(BigDecimal version, Long accountId, String keyword, String appKey, String categoryIds, String parentCategoryIds, Boolean rootOnly, String sortField, String responseGroup, Boolean descending, Integer start, Integer limit, Boolean activeOnly, Boolean returnExternal, Boolean exactMatch, String type, String externalType, Integer minOfferCount, Double latitude, Double longitude, Double range) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Category
     *
     * Create a new category.
     *
     */
    public CategoryTreeResponse createCategory(BigDecimal version, Long accountId, String name, String appKey, Long parentCategoryId, String description, String type, Long assetId, String externalId, String externalType, String externalCategorySlug, String sqootSlug, Boolean active, String metaData, String searchTags) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Category
     *
     * Delete a category.
     *
     */
    public SirqulResponse deleteCategory(BigDecimal version, Long accountId, Long categoryId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Duplicate Category
     *
     * Duplicate a category, including all its children.
     *
     */
    public CategoryTreeResponse duplicateCategory(BigDecimal version, Long accountId, Long categoryId, String appKey, Long parentCategoryId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Category
     *
     * Get the details of a specific category. Recursively include all child categories and their children.
     *
     */
    public CategoryTreeResponse getCategory(BigDecimal version, Long categoryId, Boolean returnExternal) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Categories
     *
     * Search for categories.
     *
     */
    public List<CategoryResponse> searchCategories(BigDecimal version, Long accountId, String keyword, String appKey, String categoryId, String categoryIds, String parentCategoryIds, Boolean rootOnly, String sortField, String responseGroup, Boolean descending, Integer start, Integer limit, Boolean activeOnly, Boolean returnExternal, Boolean exactMatch, String type, String externalType, Boolean excludeExternalType, Integer minOfferCount, Integer searchDepth, String searchMode) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Category
     *
     * Update a category.
     *
     */
    public CategoryTreeResponse updateCategory(BigDecimal version, Long accountId, Long categoryId, Long parentCategoryId, String name, String description, String type, Long assetId, String externalId, String externalType, String externalCategorySlug, String sqootSlug, Boolean active, String metaData, String searchTags) {
        // TODO: Implement...

        return null;
    }

}
