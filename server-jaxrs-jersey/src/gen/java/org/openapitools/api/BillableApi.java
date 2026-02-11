package org.openapitools.api;

import org.openapitools.api.BillableApiService;
import org.openapitools.api.factories.BillableApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.BillableEntityResponse;
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

@Path("/billable")


@io.swagger.annotations.Api(description = "the billable API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class BillableApi  {
   private final BillableApiService delegate;

   public BillableApi(@Context ServletConfig servletContext) {
      BillableApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("BillableApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (BillableApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = BillableApiServiceFactory.getBillableApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Billable", notes = "reate a billable entity for an account. The creator is assumed to be the responsible account. An account can only have one billable entity", response = BillableEntityResponse.class, tags={ "Billable Entity", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = BillableEntityResponse.class)
    })
    public Response createBillableEntity(@ApiParam(value = "The unique device identifier that made the request (either deviceId or accountId must be used)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The unique accountId that made the request (either deviceId or accountId must be used)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The name of the entity responsible for billing ") @QueryParam("name")  String name,@ApiParam(value = "The street address of the billable entity") @QueryParam("streetAddress")  String streetAddress,@ApiParam(value = "Additional address information (such as a suite number, floor number, building name, or PO Box) ") @QueryParam("streetAddress2")  String streetAddress2,@ApiParam(value = "The city of the billable entity") @QueryParam("city")  String city,@ApiParam(value = "The state of the billable entity") @QueryParam("state")  String state,@ApiParam(value = "The postal code of the billable entity") @QueryParam("postalCode")  String postalCode,@ApiParam(value = "The business phone of the billable entity") @QueryParam("businessPhone")  String businessPhone,@ApiParam(value = "The business phone extension") @QueryParam("businessPhoneExt")  String businessPhoneExt,@ApiParam(value = "Authorize Net Api Key") @QueryParam("authorizeNetApiKey")  String authorizeNetApiKey,@ApiParam(value = "Authorize Net Transaction Key") @QueryParam("authorizeNetTransactionKey")  String authorizeNetTransactionKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createBillableEntity(deviceId, accountId, name, streetAddress, streetAddress2, city, state, postalCode, businessPhone, businessPhoneExt, authorizeNetApiKey, authorizeNetTransactionKey, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Billable", notes = "Mark the billable as deleted", response = SirqulResponse.class, tags={ "Billable Entity", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteBillableEntity(@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account used to perform the delete, must have rights to edit the billable entity.") @QueryParam("accountId")  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteBillableEntity(deviceId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Billable", notes = "Used to determine the associated BillableEntity of an account", response = BillableEntityResponse.class, tags={ "Billable Entity", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = BillableEntityResponse.class)
    })
    public Response getBillableEntity(@ApiParam(value = "The unique device identifier that made the request (either deviceId or accountId must be used)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The unique accountId that made the request (either deviceId or accountId must be used)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "Determines whether to include the retailer dash board counts into the response", defaultValue = "false") @DefaultValue("false") @QueryParam("includeCounts")  Boolean includeCounts,@ApiParam(value = "Whether to enable payments or not", defaultValue = "true") @DefaultValue("true") @QueryParam("includePayments")  Boolean includePayments,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getBillableEntity(deviceId, accountId, includeCounts, includePayments, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Billable", notes = "Updates the billable record for an account", response = BillableEntityResponse.class, tags={ "Billable Entity", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = BillableEntityResponse.class)
    })
    public Response updateBillableEntity(@ApiParam(value = "The unique device identifier that made the request (either deviceId or accountId must be used)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The unique accountId that made the request (either deviceId or accountId must be used). The account must have rights to edit the billable entity.") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The name of the entity responsible for billing ") @QueryParam("name")  String name,@ApiParam(value = "The street address of the billable entity") @QueryParam("streetAddress")  String streetAddress,@ApiParam(value = "Additional address information (such as a suite number, floor number, building name, or PO Box) ") @QueryParam("streetAddress2")  String streetAddress2,@ApiParam(value = "The city of the billable entity") @QueryParam("city")  String city,@ApiParam(value = "The state of the billable entity") @QueryParam("state")  String state,@ApiParam(value = "The postal code of the billable entity") @QueryParam("postalCode")  String postalCode,@ApiParam(value = "The business phone of the billable entity") @QueryParam("businessPhone")  String businessPhone,@ApiParam(value = "The business phone extension of the billable entity") @QueryParam("businessPhoneExt")  String businessPhoneExt,@ApiParam(value = "Authorize Net Api Key of the billable entity") @QueryParam("authorizeNetApiKey")  String authorizeNetApiKey,@ApiParam(value = "Authorize Net Transaction Key of the billable entity") @QueryParam("authorizeNetTransactionKey")  String authorizeNetTransactionKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateBillableEntity(deviceId, accountId, name, streetAddress, streetAddress2, city, state, postalCode, businessPhone, businessPhoneExt, authorizeNetApiKey, authorizeNetTransactionKey, securityContext);
    }
}
