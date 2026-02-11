package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.BillableApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.BillableEntityResponse;
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

@Path("/billable")


@io.swagger.annotations.Api(description = "the billable API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class BillableApi  {

    @Inject BillableApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Billable", notes = "reate a billable entity for an account. The creator is assumed to be the responsible account. An account can only have one billable entity", response = BillableEntityResponse.class, tags={ "Billable Entity", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = BillableEntityResponse.class) })
    public Response createBillableEntity( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("businessPhone") String businessPhone, @QueryParam("businessPhoneExt") String businessPhoneExt, @QueryParam("authorizeNetApiKey") String authorizeNetApiKey, @QueryParam("authorizeNetTransactionKey") String authorizeNetTransactionKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createBillableEntity(deviceId,accountId,name,streetAddress,streetAddress2,city,state,postalCode,businessPhone,businessPhoneExt,authorizeNetApiKey,authorizeNetTransactionKey,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Billable", notes = "Mark the billable as deleted", response = SirqulResponse.class, tags={ "Billable Entity", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteBillableEntity( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteBillableEntity(deviceId,accountId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Billable", notes = "Used to determine the associated BillableEntity of an account", response = BillableEntityResponse.class, tags={ "Billable Entity", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = BillableEntityResponse.class) })
    public Response getBillableEntity( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @DefaultValue("false") @QueryParam("includeCounts") Boolean includeCounts, @DefaultValue("true") @QueryParam("includePayments") Boolean includePayments,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBillableEntity(deviceId,accountId,includeCounts,includePayments,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Billable", notes = "Updates the billable record for an account", response = BillableEntityResponse.class, tags={ "Billable Entity", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = BillableEntityResponse.class) })
    public Response updateBillableEntity( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("businessPhone") String businessPhone, @QueryParam("businessPhoneExt") String businessPhoneExt, @QueryParam("authorizeNetApiKey") String authorizeNetApiKey, @QueryParam("authorizeNetTransactionKey") String authorizeNetTransactionKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateBillableEntity(deviceId,accountId,name,streetAddress,streetAddress2,city,state,postalCode,businessPhone,businessPhoneExt,authorizeNetApiKey,authorizeNetTransactionKey,securityContext);
    }
}
