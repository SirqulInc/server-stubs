package org.openapitools.api;

import org.openapitools.model.AccountLoginResponse;
import java.math.BigDecimal;
import java.io.File;
import org.openapitools.model.RetailerFullResponse;
import org.openapitools.model.RetailerResponse;
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
@Path("/api/{version}/retailer")
@Api(value = "/", description = "")
public interface RetailerApi  {

    /**
     * Create Retailer
     *
     * Create a retailer record. A billable entity must be created first before a retailer record can be made.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Retailer", tags={ "Retailer" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RetailerFullResponse.class) })
    public RetailerFullResponse createRetailer(@PathParam("version") BigDecimal version, @QueryParam("name") @NotNull String name, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("country") String country, @QueryParam("businessPhone") String businessPhone, @QueryParam("businessPhoneExt") String businessPhoneExt, @QueryParam("website") String website, @QueryParam("email") String email, @QueryParam("facebookUrl") String facebookUrl, @QueryParam("twitterUrl") String twitterUrl, @QueryParam("logo") File logo, @QueryParam("logoAssetId") Long logoAssetId, @QueryParam("picture1") File picture1, @QueryParam("picture1AssetId") Long picture1AssetId, @QueryParam("picture2") File picture2, @QueryParam("picture2AssetId") Long picture2AssetId, @QueryParam("categoryIds") String categoryIds, @QueryParam("categoryIdsToAdd") String categoryIdsToAdd, @QueryParam("categoryIdsToRemove") String categoryIdsToRemove, @QueryParam("filterIds") String filterIds, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("metaData") String metaData, @QueryParam("searchTags") String searchTags, @QueryParam("retailerType") String retailerType, @QueryParam("visibility") String visibility, @QueryParam("createDefaultLocation") Boolean createDefaultLocation, @QueryParam("responseFormat") String responseFormat);

    /**
     * Delete Retailer
     *
     * Set the deleted timestamp to current time.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Retailer", tags={ "Retailer" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteRetailer(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("retailerId") Long retailerId);

    /**
     * Get Retailer
     *
     * Gets a retailer. Only the owner and the employees of a retailer have access to view its information.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Retailer", tags={ "Retailer" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RetailerFullResponse.class) })
    public RetailerFullResponse getRetailer(@PathParam("version") BigDecimal version, @QueryParam("retailerId") @NotNull Long retailerId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("includeCounts") Boolean includeCounts);

    /**
     * Search Retailers
     *
     * earches on retailers that the account has access to.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Retailers", tags={ "Retailer" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RetailerResponse.class, responseContainer = "List") })
    public List<RetailerResponse> getRetailers(@PathParam("version") BigDecimal version, @QueryParam("visibility") @NotNull String visibility, @QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("activeOnly") @NotNull Boolean activeOnly, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l);

    /**
     * Login Retailer
     *
     * Retailer login check.
     *
     */
    @POST
    @Path("/login")
    @Produces({ "*/*" })
    @ApiOperation(value = "Login Retailer", tags={ "Retailer" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AccountLoginResponse.class) })
    public AccountLoginResponse retailerLoginCheck(@PathParam("version") BigDecimal version, @QueryParam("username") @NotNull String username, @QueryParam("password") @NotNull String password, @QueryParam("deviceId") String deviceId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("appKey") String appKey);

    /**
     * Update Retailer
     *
     * Update a retailer record. Only the owner and the employees of the retailer have access to update its information.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Retailer", tags={ "Retailer" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RetailerFullResponse.class) })
    public RetailerFullResponse updateRetailer(@PathParam("version") BigDecimal version, @QueryParam("retailerId") @NotNull Long retailerId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("country") String country, @QueryParam("businessPhone") String businessPhone, @QueryParam("businessPhoneExt") String businessPhoneExt, @QueryParam("website") String website, @QueryParam("email") String email, @QueryParam("facebookUrl") String facebookUrl, @QueryParam("twitterUrl") String twitterUrl, @QueryParam("logo") File logo, @QueryParam("logoAssetId") Long logoAssetId, @QueryParam("picture1") File picture1, @QueryParam("picture1AssetId") Long picture1AssetId, @QueryParam("picture2") File picture2, @QueryParam("picture2AssetId") Long picture2AssetId, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("metaData") String metaData, @QueryParam("searchTags") String searchTags, @QueryParam("retailerType") String retailerType, @QueryParam("visibility") String visibility, @QueryParam("active") Boolean active, @QueryParam("responseFormat") String responseFormat);
}
