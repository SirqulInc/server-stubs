package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.PostalCodeResponse;
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
@Path("/api/{version}/postalCode")
@Api(value = "/", description = "")
public interface PostalCodeApi  {

    /**
     * Create Postal Code
     *
     * Create a Postal Code
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Postal Code", tags={ "Postal Code" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PostalCodeResponse.class) })
    public PostalCodeResponse createPostalCode(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("code") @NotNull String code, @QueryParam("latitude") @NotNull Double latitude, @QueryParam("longitude") @NotNull Double longitude, @QueryParam("stateCode") String stateCode, @QueryParam("city") String city, @QueryParam("active") Boolean active);

    /**
     * Delete Postal Code
     *
     * Delete a Postal Code
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Postal Code", tags={ "Postal Code" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deletePostalCode(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("postalCodeId") @NotNull Long postalCodeId);

    /**
     * Get Postal Code
     *
     * Get a Postal Code
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Postal Code", tags={ "Postal Code" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PostalCodeResponse.class) })
    public PostalCodeResponse getPostalCode(@PathParam("version") BigDecimal version, @QueryParam("postalCodeId") @NotNull Long postalCodeId);

    /**
     * Search Postal Codes
     *
     * Get the list of regions. If latitude or longitude is null, will return all postal codes in the system with paginated response.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Postal Codes", tags={ "Postal Code" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PostalCodeResponse.class, responseContainer = "List") })
    public List<PostalCodeResponse> getPostalCodes(@PathParam("version") BigDecimal version, @QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("keyword") String keyword, @QueryParam("miles") Double miles, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit);

    /**
     * Update Postal Code
     *
     * Update a Postal Code
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Postal Code", tags={ "Postal Code" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PostalCodeResponse.class) })
    public PostalCodeResponse updatePostalCode(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("postalCodeId") @NotNull Long postalCodeId, @QueryParam("code") String code, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("stateCode") String stateCode, @QueryParam("city") String city, @QueryParam("active") Boolean active);
}
