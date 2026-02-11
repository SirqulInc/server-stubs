package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.CategoryResponse;
import org.openapitools.model.CategoryTreeResponse;
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
public class CategoryApiServiceImpl extends CategoryApiService {
    @Override
    public Response categoryDistanceSearch(Long accountId, String keyword, String appKey, String categoryIds, String parentCategoryIds, Boolean rootOnly, String sortField, String responseGroup, Boolean descending, Integer start, Integer limit, Boolean activeOnly, Boolean returnExternal, Boolean exactMatch, String type, String externalType, Integer minOfferCount, Double latitude, Double longitude, Double range, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response createCategory( @NotNull Long accountId,  @NotNull String name, String appKey, Long parentCategoryId, String description, String type, Long assetId, String externalId, String externalType, String externalCategorySlug, String sqootSlug, Boolean active, String metaData, String searchTags, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteCategory( @NotNull Long accountId,  @NotNull Long categoryId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response duplicateCategory( @NotNull Long accountId,  @NotNull Long categoryId, String appKey, Long parentCategoryId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getCategory( @NotNull Long categoryId, Boolean returnExternal, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response searchCategories(Long accountId, String keyword, String appKey, String categoryId, String categoryIds, String parentCategoryIds, Boolean rootOnly, String sortField, String responseGroup, Boolean descending, Integer start, Integer limit, Boolean activeOnly, Boolean returnExternal, Boolean exactMatch, String type, String externalType, Boolean excludeExternalType, Integer minOfferCount, Integer searchDepth, String searchMode, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateCategory( @NotNull Long accountId,  @NotNull Long categoryId, Long parentCategoryId, String name, String description, String type, Long assetId, String externalId, String externalType, String externalCategorySlug, String sqootSlug, Boolean active, String metaData, String searchTags, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
