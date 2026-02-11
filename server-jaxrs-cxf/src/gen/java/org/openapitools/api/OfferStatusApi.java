package org.openapitools.api;

import org.openapitools.model.OfferTransactionStatusResponse;
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
@Path("/offer/status")
@Api(value = "/", description = "")
public interface OfferStatusApi  {

    /**
     * Create Offer Status
     *
     * Create an offer status record
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Offer Status", tags={ "Offer Status" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OfferTransactionStatusResponse.class) })
    public OfferTransactionStatusResponse createOfferTransactionStatus(@QueryParam("name") @NotNull String name, @QueryParam("code") @NotNull Integer code, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("description") String description, @QueryParam("role") @DefaultValue("ANY")String role, @QueryParam("active") @DefaultValue("true")Boolean active, @QueryParam("applicationIds") String applicationIds);

    /**
     * Delete Offer Status
     *
     * Mark an offer status record as deleted
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Offer Status", tags={ "Offer Status" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteOfferTransactionStatus(@QueryParam("statusId") @NotNull Long statusId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Get Offer Status
     *
     * Get an offer status record
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Offer Status", tags={ "Offer Status" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OfferTransactionStatusResponse.class) })
    public OfferTransactionStatusResponse getOfferTransactionStatus(@QueryParam("statusId") @NotNull Long statusId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Search Offer Status
     *
     * Search for the available offer statuses
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Offer Status", tags={ "Offer Status" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OfferTransactionStatusResponse.class, responseContainer = "List") })
    public List<OfferTransactionStatusResponse> searchOfferTransactionStatuses(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("keyword") String keyword, @QueryParam("role") String role, @QueryParam("appKey") String appKey, @QueryParam("sortField") @DefaultValue("CODE")String sortField, @QueryParam("descending") @DefaultValue("true")Boolean descending, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("includeInactive") @DefaultValue("false")Boolean includeInactive);

    /**
     * Update Offer Status
     *
     * Update an offer status record
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Offer Status", tags={ "Offer Status" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OfferTransactionStatusResponse.class) })
    public OfferTransactionStatusResponse updateOfferTransactionStatus(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("statusId") Long statusId, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("code") Integer code, @QueryParam("role") String role, @QueryParam("active") Boolean active, @QueryParam("applicationIds") String applicationIds);
}
