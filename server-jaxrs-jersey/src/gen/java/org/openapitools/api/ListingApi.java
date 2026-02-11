package org.openapitools.api;

import org.openapitools.api.ListingApiService;
import org.openapitools.api.factories.ListingApiServiceFactory;

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

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/listing")


@io.swagger.annotations.Api(description = "the listing API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ListingApi  {
   private final ListingApiService delegate;

   public ListingApi(@Context ServletConfig servletContext) {
      ListingApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ListingApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ListingApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = ListingApiServiceFactory.getListingApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Listing", notes = "Creates a listing.", response = ListingFullResponse.class, tags={ "Listing", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ListingFullResponse.class)
    })
    public Response createListing(@ApiParam(value = "the user's account ID", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the name of the listing", required = true) @QueryParam("name") @NotNull  String name,@ApiParam(value = "comma separated list of filter IDs") @QueryParam("filterIds")  String filterIds,@ApiParam(value = "the description of the listing") @QueryParam("description")  String description,@ApiParam(value = "the start date of the listing") @QueryParam("start")  Long start,@ApiParam(value = "the end date of the listing") @QueryParam("end")  Long end,@ApiParam(value = "the name of the location the listing will be held at") @QueryParam("locationName")  String locationName,@ApiParam(value = "the description of the location the listing will be held at") @QueryParam("locationDescription")  String locationDescription,@ApiParam(value = "determines whether the listing is public or private", defaultValue = "false") @DefaultValue("false") @QueryParam("isPrivate")  Boolean isPrivate,@ApiParam(value = "external identifier used by a third party") @QueryParam("externalId")  String externalId,@ApiParam(value = "secondary external identifier used by a third party") @QueryParam("externalId2")  String externalId2,@ApiParam(value = "external group identifier used by a third party") @QueryParam("externalGroupId")  String externalGroupId,@ApiParam(value = "Sets the active flag") @QueryParam("active")  Boolean active,@ApiParam(value = "external custom client defined data") @QueryParam("metaData")  String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createListing(accountId, name, filterIds, description, start, end, locationName, locationDescription, isPrivate, externalId, externalId2, externalGroupId, active, metaData, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Listing", notes = "Delete a listing.", response = SirqulResponse.class, tags={ "Listing", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteListing(@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the listing to delete", required = true) @QueryParam("listingId") @NotNull  Long listingId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteListing(accountId, listingId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Listing", notes = "Get a listing by id.", response = ListingFullResponse.class, tags={ "Listing", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ListingFullResponse.class)
    })
    public Response getListing(@ApiParam(value = "the id of the listing to get", required = true) @QueryParam("listingId") @NotNull  Long listingId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getListing(listingId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Listings", notes = "Search for event listings from the start time to end time", response = ListingResponse.class, responseContainer = "List", tags={ "Listing", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ListingResponse.class, responseContainer = "List")
    })
    public Response searchListing(@ApiParam(value = "the account id of the user") @QueryParam("accountId")  Long accountId,@ApiParam(value = "search the event name and description for this keyword") @QueryParam("keyword")  String keyword,@ApiParam(value = "the record to begin the return set on", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "the number of records to return", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@ApiParam(value = "whether to search on active listings only", defaultValue = "false") @DefaultValue("false") @QueryParam("activeOnly")  Boolean activeOnly,@ApiParam(value = "the current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the current longitude of the user") @QueryParam("longitude")  Double longitude,@ApiParam(value = "the start date to search from") @QueryParam("startDate")  Long startDate,@ApiParam(value = "the end date to search to") @QueryParam("endDate")  Long endDate,@ApiParam(value = "only return items of these categories") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "") @QueryParam("filterIds")  String filterIds,@ApiParam(value = "determines whether to use configured listing order ids", defaultValue = "true") @DefaultValue("true") @QueryParam("useListingOrderIds")  Boolean useListingOrderIds,@ApiParam(value = "external identifier used by a third party") @QueryParam("externalId")  String externalId,@ApiParam(value = "secondary external identifier used by a third party") @QueryParam("externalId2")  String externalId2,@ApiParam(value = "external group identifier used by a third party") @QueryParam("externalGroupId")  String externalGroupId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchListing(accountId, keyword, start, limit, activeOnly, latitude, longitude, startDate, endDate, categoryIds, filterIds, useListingOrderIds, externalId, externalId2, externalGroupId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/summary")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Summary Listing", notes = "Search for a list of summary listings from the start time up to 8 days out.", response = ListingGroupResponse.class, responseContainer = "List", tags={ "Listing", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ListingGroupResponse.class, responseContainer = "List")
    })
    public Response summaryListing(@ApiParam(value = "the account id of the user") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the start date to search from") @QueryParam("startDate")  Long startDate,@ApiParam(value = "the list of categories to search on") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "how far out to search, in days", defaultValue = "15") @DefaultValue("15") @QueryParam("daysToInclude")  Integer daysToInclude,@ApiParam(value = "determines whether to use configured listing order ids", defaultValue = "true") @DefaultValue("true") @QueryParam("useListingOrderIds")  Boolean useListingOrderIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.summaryListing(accountId, startDate, categoryIds, daysToInclude, useListingOrderIds, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Listing", notes = "Updates a listing.", response = ListingFullResponse.class, tags={ "Listing", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ListingFullResponse.class)
    })
    public Response updateListing(@ApiParam(value = "the user's account ID", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the listing to update", required = true) @QueryParam("listingId") @NotNull  Long listingId,@ApiParam(value = "comma separated list of filter IDs") @QueryParam("filterIds")  String filterIds,@ApiParam(value = "the name of the listing") @QueryParam("name")  String name,@ApiParam(value = "the description of the listing") @QueryParam("description")  String description,@ApiParam(value = "the start date of the listing") @QueryParam("start")  Long start,@ApiParam(value = "the end date of the listing") @QueryParam("end")  Long end,@ApiParam(value = "the name of the location the listing will be held at") @QueryParam("locationName")  String locationName,@ApiParam(value = "the description of the location the listing will be held at") @QueryParam("locationDescription")  String locationDescription,@ApiParam(value = "determines whether the listing is public or private") @QueryParam("isPrivate")  Boolean isPrivate,@ApiParam(value = "external identifier used by a third party") @QueryParam("externalId")  String externalId,@ApiParam(value = "secondary external identifier used by a third party") @QueryParam("externalId2")  String externalId2,@ApiParam(value = "external group identifier used by a third party") @QueryParam("externalGroupId")  String externalGroupId,@ApiParam(value = "Sets the active flag") @QueryParam("active")  Boolean active,@ApiParam(value = "external custom client defined data") @QueryParam("metaData")  String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateListing(accountId, listingId, filterIds, name, description, start, end, locationName, locationDescription, isPrivate, externalId, externalId2, externalGroupId, active, metaData, securityContext);
    }
}
