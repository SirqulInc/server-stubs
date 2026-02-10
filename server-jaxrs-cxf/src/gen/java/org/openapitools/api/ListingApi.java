package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.ListingFullResponse;
import org.openapitools.model.ListingGroupResponse;
import org.openapitools.model.ListingResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
@Path("/api/{version}/listing")
@Api(value = "/", description = "")
public interface ListingApi  {

    /**
     * Create Listing
     *
     * Creates a listing.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Listing", tags={ "Listing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ListingFullResponse.class) })
    public ListingFullResponse createListing(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("name") @NotNull String name, @QueryParam("filterIds") String filterIds, @QueryParam("description") String description, @QueryParam("start") Long start, @QueryParam("end") Long end, @QueryParam("locationName") String locationName, @QueryParam("locationDescription") String locationDescription, @QueryParam("isPrivate") @DefaultValue("false")Boolean isPrivate, @QueryParam("externalId") String externalId, @QueryParam("externalId2") String externalId2, @QueryParam("externalGroupId") String externalGroupId, @QueryParam("active") Boolean active, @QueryParam("metaData") String metaData);

    /**
     * Delete Listing
     *
     * Delete a listing.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Listing", tags={ "Listing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteListing(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("listingId") @NotNull Long listingId);

    /**
     * Get Listing
     *
     * Get a listing by id.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Listing", tags={ "Listing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ListingFullResponse.class) })
    public ListingFullResponse getListing(@PathParam("version") BigDecimal version, @QueryParam("listingId") @NotNull Long listingId);

    /**
     * Search Listings
     *
     * Search for event listings from the start time to end time
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Listings", tags={ "Listing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ListingResponse.class, responseContainer = "List") })
    public List<ListingResponse> searchListing(@PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("activeOnly") @DefaultValue("false")Boolean activeOnly, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("useListingOrderIds") @DefaultValue("true")Boolean useListingOrderIds, @QueryParam("externalId") String externalId, @QueryParam("externalId2") String externalId2, @QueryParam("externalGroupId") String externalGroupId);

    /**
     * Summary Listing
     *
     * Search for a list of summary listings from the start time up to 8 days out.
     *
     */
    @GET
    @Path("/summary")
    @Produces({ "*/*" })
    @ApiOperation(value = "Summary Listing", tags={ "Listing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ListingGroupResponse.class, responseContainer = "List") })
    public List<ListingGroupResponse> summaryListing(@PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("startDate") Long startDate, @QueryParam("categoryIds") String categoryIds, @QueryParam("daysToInclude") @DefaultValue("15")Integer daysToInclude, @QueryParam("useListingOrderIds") @DefaultValue("true")Boolean useListingOrderIds);

    /**
     * Update Listing
     *
     * Updates a listing.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Listing", tags={ "Listing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ListingFullResponse.class) })
    public ListingFullResponse updateListing(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("listingId") @NotNull Long listingId, @QueryParam("filterIds") String filterIds, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("start") Long start, @QueryParam("end") Long end, @QueryParam("locationName") String locationName, @QueryParam("locationDescription") String locationDescription, @QueryParam("isPrivate") Boolean isPrivate, @QueryParam("externalId") String externalId, @QueryParam("externalId2") String externalId2, @QueryParam("externalGroupId") String externalGroupId, @QueryParam("active") Boolean active, @QueryParam("metaData") String metaData);
}
