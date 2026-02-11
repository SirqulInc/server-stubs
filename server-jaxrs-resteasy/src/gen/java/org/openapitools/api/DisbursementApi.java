package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.DisbursementApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.math.BigDecimal;
import org.openapitools.model.DisbursementResponse;

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

@Path("/disbursement")


@io.swagger.annotations.Api(description = "the disbursement API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class DisbursementApi  {

    @Inject DisbursementApiService service;

    @GET
    @Path("/check")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Check Disbursements", notes = "Checks the status of a captured disbrusement to see if it has been settled.", response = DisbursementResponse.class, tags={ "Disbursement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = DisbursementResponse.class) })
    public Response checkDisbursements( @NotNull @QueryParam("disbursementId") Long disbursementId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.checkDisbursements(disbursementId,securityContext);
    }
    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Disbursement", notes = "Creates a Disbursement for sending money to a retailer", response = DisbursementResponse.class, tags={ "Disbursement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = DisbursementResponse.class) })
    public Response createDisbursement( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("receiverAccountId") Long receiverAccountId, @NotNull @QueryParam("originalSenderAccountId") Long originalSenderAccountId, @NotNull @QueryParam("amount") BigDecimal amount, @NotNull, allowableValues="AUTHORIZE_NET, AMAZON_FPS, BILL_COM" @QueryParam("provider") String provider, @QueryParam("scheduledDate") Long scheduledDate, @QueryParam("title") String title, @QueryParam("comment") String comment, @QueryParam("externalId") String externalId, @QueryParam("introspectionParams") String introspectionParams,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createDisbursement(accountId,receiverAccountId,originalSenderAccountId,amount,provider,scheduledDate,title,comment,externalId,introspectionParams,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Disbursement", notes = "Get Disbursement details", response = DisbursementResponse.class, tags={ "Disbursement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = DisbursementResponse.class) })
    public Response getDisbursement( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("disbursementId") Long disbursementId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getDisbursement(accountId,disbursementId,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Disbursements", notes = "Search Disbursements", response = DisbursementResponse.class, responseContainer = "List", tags={ "Disbursement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = DisbursementResponse.class, responseContainer = "List") })
    public Response searchDisbursements( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("receiverAccountId") Long receiverAccountId, @QueryParam("statuses") String statuses, @QueryParam("providers") String providers, @QueryParam("beforeDate") Long beforeDate, @QueryParam("afterDate") Long afterDate, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("false") @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("externalId") String externalId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchDisbursements(accountId,receiverAccountId,statuses,providers,beforeDate,afterDate,start,limit,activeOnly,externalId,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Disbursement", notes = "Update Disbursement", response = DisbursementResponse.class, tags={ "Disbursement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = DisbursementResponse.class) })
    public Response updateDisbursement( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("disbursementId") Long disbursementId, @QueryParam("amount") BigDecimal amount,, allowableValues="AUTHORIZE_NET, AMAZON_FPS, BILL_COM" @QueryParam("provider") String provider, @QueryParam("scheduledDate") Long scheduledDate, @QueryParam("title") String title, @QueryParam("comment") String comment, @QueryParam("externalId") String externalId, @QueryParam("retry") Boolean retry, @QueryParam("introspectionParams") String introspectionParams,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateDisbursement(accountId,disbursementId,amount,provider,scheduledDate,title,comment,externalId,retry,introspectionParams,securityContext);
    }
}
