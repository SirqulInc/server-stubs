package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.CategoryResponse;
import org.openapitools.model.CategoryTreeResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface CategoryApiService {
      Response categoryDistanceSearch(Long accountId,String keyword,String appKey,String categoryIds,String parentCategoryIds,Boolean rootOnly,String sortField,String responseGroup,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Boolean returnExternal,Boolean exactMatch,String type,String externalType,Integer minOfferCount,Double latitude,Double longitude,Double range,SecurityContext securityContext)
      throws NotFoundException;
      Response createCategory(Long accountId,String name,String appKey,Long parentCategoryId,String description,String type,Long assetId,String externalId,String externalType,String externalCategorySlug,String sqootSlug,Boolean active,String metaData,String searchTags,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteCategory(Long accountId,Long categoryId,SecurityContext securityContext)
      throws NotFoundException;
      Response duplicateCategory(Long accountId,Long categoryId,String appKey,Long parentCategoryId,SecurityContext securityContext)
      throws NotFoundException;
      Response getCategory(Long categoryId,Boolean returnExternal,SecurityContext securityContext)
      throws NotFoundException;
      Response searchCategories(Long accountId,String keyword,String appKey,String categoryId,String categoryIds,String parentCategoryIds,Boolean rootOnly,String sortField,String responseGroup,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Boolean returnExternal,Boolean exactMatch,String type,String externalType,Boolean excludeExternalType,Integer minOfferCount,Integer searchDepth,String searchMode,SecurityContext securityContext)
      throws NotFoundException;
      Response updateCategory(Long accountId,Long categoryId,Long parentCategoryId,String name,String description,String type,Long assetId,String externalId,String externalType,String externalCategorySlug,String sqootSlug,Boolean active,String metaData,String searchTags,SecurityContext securityContext)
      throws NotFoundException;


}
