package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.DisbursementResponse;

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
@Path("/disbursement")
@Api(value = "/", description = "")
public interface DisbursementApi  {

    /**
     * Check Disbursements
     *
     * Checks the status of a captured disbrusement to see if it has been settled.
     *
     */
    @GET
    @Path("/check")
    @Produces({ "*/*" })
    @ApiOperation(value = "Check Disbursements", tags={ "Disbursement" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = DisbursementResponse.class) })
    public DisbursementResponse checkDisbursements(@QueryParam("disbursementId") @NotNull Long disbursementId);

    /**
     * Create Disbursement
     *
     * Creates a Disbursement for sending money to a retailer
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Disbursement", tags={ "Disbursement" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = DisbursementResponse.class) })
    public DisbursementResponse createDisbursement(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("receiverAccountId") @NotNull Long receiverAccountId, @QueryParam("originalSenderAccountId") @NotNull Long originalSenderAccountId, @QueryParam("amount") @NotNull BigDecimal amount, @QueryParam("provider") @NotNull String provider, @QueryParam("scheduledDate") Long scheduledDate, @QueryParam("title") String title, @QueryParam("comment") String comment, @QueryParam("externalId") String externalId, @QueryParam("introspectionParams") String introspectionParams);

    /**
     * Get Disbursement
     *
     * Get Disbursement details
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Disbursement", tags={ "Disbursement" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = DisbursementResponse.class) })
    public DisbursementResponse getDisbursement(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("disbursementId") @NotNull Long disbursementId);

    /**
     * Search Disbursements
     *
     * Search Disbursements
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Disbursements", tags={ "Disbursement" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = DisbursementResponse.class, responseContainer = "List") })
    public List<DisbursementResponse> searchDisbursements(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("receiverAccountId") Long receiverAccountId, @QueryParam("statuses") String statuses, @QueryParam("providers") String providers, @QueryParam("beforeDate") Long beforeDate, @QueryParam("afterDate") Long afterDate, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("activeOnly") @DefaultValue("false")Boolean activeOnly, @QueryParam("externalId") String externalId);

    /**
     * Update Disbursement
     *
     * Update Disbursement
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Disbursement", tags={ "Disbursement" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = DisbursementResponse.class) })
    public DisbursementResponse updateDisbursement(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("disbursementId") @NotNull Long disbursementId, @QueryParam("amount") BigDecimal amount, @QueryParam("provider") String provider, @QueryParam("scheduledDate") Long scheduledDate, @QueryParam("title") String title, @QueryParam("comment") String comment, @QueryParam("externalId") String externalId, @QueryParam("retry") Boolean retry, @QueryParam("introspectionParams") String introspectionParams);
}
