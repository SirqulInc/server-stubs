package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.ListingFullResponse;
import org.openapitools.model.ListingGroupResponse;
import org.openapitools.model.ListingResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface ListingApiService {
      Response createListing(Long accountId,String name,String filterIds,String description,Long start,Long end,String locationName,String locationDescription,Boolean isPrivate,String externalId,String externalId2,String externalGroupId,Boolean active,String metaData,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteListing(Long accountId,Long listingId,SecurityContext securityContext)
      throws NotFoundException;
      Response getListing(Long listingId,SecurityContext securityContext)
      throws NotFoundException;
      Response searchListing(Long accountId,String keyword,Integer start,Integer limit,Boolean activeOnly,Double latitude,Double longitude,Long startDate,Long endDate,String categoryIds,String filterIds,Boolean useListingOrderIds,String externalId,String externalId2,String externalGroupId,SecurityContext securityContext)
      throws NotFoundException;
      Response summaryListing(Long accountId,Long startDate,String categoryIds,Integer daysToInclude,Boolean useListingOrderIds,SecurityContext securityContext)
      throws NotFoundException;
      Response updateListing(Long accountId,Long listingId,String filterIds,String name,String description,Long start,Long end,String locationName,String locationDescription,Boolean isPrivate,String externalId,String externalId2,String externalGroupId,Boolean active,String metaData,SecurityContext securityContext)
      throws NotFoundException;


}
