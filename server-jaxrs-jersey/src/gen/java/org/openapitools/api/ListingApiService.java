package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.ListingFullResponse;
import org.openapitools.model.ListingGroupResponse;
import org.openapitools.model.ListingResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class ListingApiService {
    public abstract Response createListing( @NotNull Long accountId, @NotNull String name,String filterIds,String description,Long start,Long end,String locationName,String locationDescription,Boolean isPrivate,String externalId,String externalId2,String externalGroupId,Boolean active,String metaData,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteListing( @NotNull Long accountId, @NotNull Long listingId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getListing( @NotNull Long listingId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchListing(Long accountId,String keyword,Integer start,Integer limit,Boolean activeOnly,Double latitude,Double longitude,Long startDate,Long endDate,String categoryIds,String filterIds,Boolean useListingOrderIds,String externalId,String externalId2,String externalGroupId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response summaryListing(Long accountId,Long startDate,String categoryIds,Integer daysToInclude,Boolean useListingOrderIds,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateListing( @NotNull Long accountId, @NotNull Long listingId,String filterIds,String name,String description,Long start,Long end,String locationName,String locationDescription,Boolean isPrivate,String externalId,String externalId2,String externalGroupId,Boolean active,String metaData,SecurityContext securityContext) throws NotFoundException;
}
