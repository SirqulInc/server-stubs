package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.RegionResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RegionApiServiceImpl implements RegionApiService {
      public Response createRegion(Long accountId,String regionClass,String shortName,String fullName,String parentIds,String childrenIds,String postalCodeIds,String locations,Long retailerLocationId,String visibility,String categoryIds,String filterIds,Long start,Long end,String polygon,String metaData,Double latitude,Double longitude,Integer versionCode,Boolean root,Boolean active,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response deleteRegion(Long accountId,Long regionId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getRegion(Long regionId,Long accountId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response searchRegions(Long accountId,String query,String keyword,Double latitude,Double longitude,Double range,String regionClass,String visibility,String searchMode,String sortField,Boolean descending,Boolean includeParent,Boolean includeChildren,Boolean includePostalCodes,String categoryIds,String filterIds,Integer versionCode,Boolean activeOnly,Boolean showDeleted,Long lastUpdatedSince,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response updateRegion(Long accountId,Long regionId,String regionClass,String shortName,String fullName,String parentIds,String childrenIds,String postalCodeIds,String locations,Long retailerLocationId,String visibility,String categoryIds,String filterIds,Long start,Long end,String polygon,String metaData,Double latitude,Double longitude,Integer versionCode,Boolean root,Boolean active,Boolean clearLists,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
