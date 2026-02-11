package org.openapitools.api;

import org.openapitools.model.BillableEntityResponse;
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
@Path("/billable")
@Api(value = "/", description = "")
public interface BillableEntityApi  {

    /**
     * Create Billable
     *
     * reate a billable entity for an account. The creator is assumed to be the responsible account. An account can only have one billable entity
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Billable", tags={ "Billable Entity" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = BillableEntityResponse.class) })
    public BillableEntityResponse createBillableEntity(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("businessPhone") String businessPhone, @QueryParam("businessPhoneExt") String businessPhoneExt, @QueryParam("authorizeNetApiKey") String authorizeNetApiKey, @QueryParam("authorizeNetTransactionKey") String authorizeNetTransactionKey);

    /**
     * Delete Billable
     *
     * Mark the billable as deleted
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Billable", tags={ "Billable Entity" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteBillableEntity(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId);

    /**
     * Get Billable
     *
     * Used to determine the associated BillableEntity of an account
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Billable", tags={ "Billable Entity" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = BillableEntityResponse.class) })
    public BillableEntityResponse getBillableEntity(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("includeCounts") @DefaultValue("false")Boolean includeCounts, @QueryParam("includePayments") @DefaultValue("true")Boolean includePayments);

    /**
     * Update Billable
     *
     * Updates the billable record for an account
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Billable", tags={ "Billable Entity" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = BillableEntityResponse.class) })
    public BillableEntityResponse updateBillableEntity(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("businessPhone") String businessPhone, @QueryParam("businessPhoneExt") String businessPhoneExt, @QueryParam("authorizeNetApiKey") String authorizeNetApiKey, @QueryParam("authorizeNetTransactionKey") String authorizeNetTransactionKey);
}
