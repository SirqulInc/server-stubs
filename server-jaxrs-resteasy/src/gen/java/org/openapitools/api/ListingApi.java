package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ListingApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ListingFullResponse;
import org.openapitools.model.ListingGroupResponse;
import org.openapitools.model.ListingResponse;
import org.openapitools.model.SirqulResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/listing")


@io.swagger.annotations.Api(description = "the listing API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ListingApi  {

    @Inject ListingApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Listing", notes = "Creates a listing.", response = ListingFullResponse.class, tags={ "Listing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ListingFullResponse.class) })
    public Response createListing( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("name") String name, @QueryParam("filterIds") String filterIds, @QueryParam("description") String description, @QueryParam("start") Long start, @QueryParam("end") Long end, @QueryParam("locationName") String locationName, @QueryParam("locationDescription") String locationDescription, @DefaultValue("false") @QueryParam("isPrivate") Boolean isPrivate, @QueryParam("externalId") String externalId, @QueryParam("externalId2") String externalId2, @QueryParam("externalGroupId") String externalGroupId, @QueryParam("active") Boolean active, @QueryParam("metaData") String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createListing(accountId,name,filterIds,description,start,end,locationName,locationDescription,isPrivate,externalId,externalId2,externalGroupId,active,metaData,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Listing", notes = "Delete a listing.", response = SirqulResponse.class, tags={ "Listing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteListing( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("listingId") Long listingId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteListing(accountId,listingId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Listing", notes = "Get a listing by id.", response = ListingFullResponse.class, tags={ "Listing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ListingFullResponse.class) })
    public Response getListing( @NotNull @QueryParam("listingId") Long listingId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getListing(listingId,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Listings", notes = "Search for event listings from the start time to end time", response = ListingResponse.class, responseContainer = "List", tags={ "Listing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ListingResponse.class, responseContainer = "List") })
    public Response searchListing( @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("false") @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @DefaultValue("true") @QueryParam("useListingOrderIds") Boolean useListingOrderIds, @QueryParam("externalId") String externalId, @QueryParam("externalId2") String externalId2, @QueryParam("externalGroupId") String externalGroupId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchListing(accountId,keyword,start,limit,activeOnly,latitude,longitude,startDate,endDate,categoryIds,filterIds,useListingOrderIds,externalId,externalId2,externalGroupId,securityContext);
    }
    @GET
    @Path("/summary")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Summary Listing", notes = "Search for a list of summary listings from the start time up to 8 days out.", response = ListingGroupResponse.class, responseContainer = "List", tags={ "Listing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ListingGroupResponse.class, responseContainer = "List") })
    public Response summaryListing( @QueryParam("accountId") Long accountId, @QueryParam("startDate") Long startDate, @QueryParam("categoryIds") String categoryIds, @DefaultValue("15") @QueryParam("daysToInclude") Integer daysToInclude, @DefaultValue("true") @QueryParam("useListingOrderIds") Boolean useListingOrderIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.summaryListing(accountId,startDate,categoryIds,daysToInclude,useListingOrderIds,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Listing", notes = "Updates a listing.", response = ListingFullResponse.class, tags={ "Listing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ListingFullResponse.class) })
    public Response updateListing( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("listingId") Long listingId, @QueryParam("filterIds") String filterIds, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("start") Long start, @QueryParam("end") Long end, @QueryParam("locationName") String locationName, @QueryParam("locationDescription") String locationDescription, @QueryParam("isPrivate") Boolean isPrivate, @QueryParam("externalId") String externalId, @QueryParam("externalId2") String externalId2, @QueryParam("externalGroupId") String externalGroupId, @QueryParam("active") Boolean active, @QueryParam("metaData") String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateListing(accountId,listingId,filterIds,name,description,start,end,locationName,locationDescription,isPrivate,externalId,externalId2,externalGroupId,active,metaData,securityContext);
    }
}
