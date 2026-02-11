package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.RegionResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RegionApiServiceImpl extends RegionApiService {
    @Override
    public Response createRegion( @NotNull Long accountId,  @NotNull String regionClass,  @NotNull String shortName, String fullName, String parentIds, String childrenIds, String postalCodeIds, String locations, Long retailerLocationId, String visibility, String categoryIds, String filterIds, Long start, Long end, String polygon, String metaData, Double latitude, Double longitude, Integer versionCode, Boolean root, Boolean active, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteRegion( @NotNull Long accountId,  @NotNull Long regionId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getRegion( @NotNull Long regionId, Long accountId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response searchRegions(Long accountId, String query, String keyword, Double latitude, Double longitude, Double range, String regionClass, String visibility, String searchMode, String sortField, Boolean descending, Boolean includeParent, Boolean includeChildren, Boolean includePostalCodes, String categoryIds, String filterIds, Integer versionCode, Boolean activeOnly, Boolean showDeleted, Long lastUpdatedSince, Integer start, Integer limit, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateRegion( @NotNull Long accountId,  @NotNull Long regionId, String regionClass, String shortName, String fullName, String parentIds, String childrenIds, String postalCodeIds, String locations, Long retailerLocationId, String visibility, String categoryIds, String filterIds, Long start, Long end, String polygon, String metaData, Double latitude, Double longitude, Integer versionCode, Boolean root, Boolean active, Boolean clearLists, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
