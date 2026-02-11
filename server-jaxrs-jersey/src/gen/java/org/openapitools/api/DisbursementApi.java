package org.openapitools.api;

import org.openapitools.api.DisbursementApiService;
import org.openapitools.api.factories.DisbursementApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.math.BigDecimal;
import org.openapitools.model.DisbursementResponse;

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

@Path("/disbursement")


@io.swagger.annotations.Api(description = "the disbursement API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class DisbursementApi  {
   private final DisbursementApiService delegate;

   public DisbursementApi(@Context ServletConfig servletContext) {
      DisbursementApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("DisbursementApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (DisbursementApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = DisbursementApiServiceFactory.getDisbursementApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    @Path("/check")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Check Disbursements", notes = "Checks the status of a captured disbrusement to see if it has been settled.", response = DisbursementResponse.class, tags={ "Disbursement", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = DisbursementResponse.class)
    })
    public Response checkDisbursements(@ApiParam(value = "the ID of the disbursement being checked on", required = true) @QueryParam("disbursementId") @NotNull  Long disbursementId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.checkDisbursements(disbursementId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Disbursement", notes = "Creates a Disbursement for sending money to a retailer", response = DisbursementResponse.class, tags={ "Disbursement", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = DisbursementResponse.class)
    })
    public Response createDisbursement(@ApiParam(value = "the ID of the logging in user (must be an EXECUTIVE account)", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the ID of the account receiving the disbursement", required = true) @QueryParam("receiverAccountId") @NotNull  Long receiverAccountId,@ApiParam(value = "the ID of the original sender account", required = true) @QueryParam("originalSenderAccountId") @NotNull  Long originalSenderAccountId,@ApiParam(value = "the dollar amount of the disbursement", required = true) @QueryParam("amount") @NotNull  BigDecimal amount,@ApiParam(value = "the provider (e.g. Authorize.net, Bill.com, etc.)", required = true, allowableValues="AUTHORIZE_NET, AMAZON_FPS, BILL_COM") @QueryParam("provider") @NotNull  String provider,@ApiParam(value = "the date that the disbursement is scheduled to go out to the payment provider") @QueryParam("scheduledDate")  Long scheduledDate,@ApiParam(value = "a title given for the disbursement") @QueryParam("title")  String title,@ApiParam(value = "a comment that could be made for a disbursement") @QueryParam("comment")  String comment,@ApiParam(value = "external ID, which can be used as a way to reference the disbursement") @QueryParam("externalId")  String externalId,@ApiParam(value = "This is for specifying parameters to make an http callback request for validating that the disbursement is valid") @QueryParam("introspectionParams")  String introspectionParams,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createDisbursement(accountId, receiverAccountId, originalSenderAccountId, amount, provider, scheduledDate, title, comment, externalId, introspectionParams, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Disbursement", notes = "Get Disbursement details", response = DisbursementResponse.class, tags={ "Disbursement", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = DisbursementResponse.class)
    })
    public Response getDisbursement(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the disbursement", required = true) @QueryParam("disbursementId") @NotNull  Long disbursementId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getDisbursement(accountId, disbursementId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Disbursements", notes = "Search Disbursements", response = DisbursementResponse.class, responseContainer = "List", tags={ "Disbursement", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = DisbursementResponse.class, responseContainer = "List")
    })
    public Response searchDisbursements(@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "filter results by the id of the account receiving the disbursement") @QueryParam("receiverAccountId")  Long receiverAccountId,@ApiParam(value = "comma separated list of status values to search for, possilbe values include: NEW, APPROVED, VALIDATING, ERROR, AUTHORIZED, CAPTURED, SETTLED") @QueryParam("statuses")  String statuses,@ApiParam(value = "comma separated list of payment providers to search for, possbile values include: AUTHORIZE_NET, AMAZON_FPS, BILL_COM") @QueryParam("providers")  String providers,@ApiParam(value = "the date for searching disbursements before it has been processed") @QueryParam("beforeDate")  Long beforeDate,@ApiParam(value = "the date for searching disbursements before it has been processed") @QueryParam("afterDate")  Long afterDate,@ApiParam(value = "the start index for pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "the limit per result set for pagination", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@ApiParam(value = "search on disbursements that are active only", defaultValue = "false") @DefaultValue("false") @QueryParam("activeOnly")  Boolean activeOnly,@ApiParam(value = "search results by this external ID (that can be used to reference the disbursement)") @QueryParam("externalId")  String externalId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchDisbursements(accountId, receiverAccountId, statuses, providers, beforeDate, afterDate, start, limit, activeOnly, externalId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Disbursement", notes = "Update Disbursement", response = DisbursementResponse.class, tags={ "Disbursement", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = DisbursementResponse.class)
    })
    public Response updateDisbursement(@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the disbursement being updated", required = true) @QueryParam("disbursementId") @NotNull  Long disbursementId,@ApiParam(value = "the disbursement dollar amount being updated") @QueryParam("amount")  BigDecimal amount,@ApiParam(value = "the payments and/or billing provider (e.g. Authorize.net, Bill.com, etc.)", allowableValues="AUTHORIZE_NET, AMAZON_FPS, BILL_COM") @QueryParam("provider")  String provider,@ApiParam(value = "the date that the disbursement is scheduled to go out to the payment provider") @QueryParam("scheduledDate")  Long scheduledDate,@ApiParam(value = "the title given to the disbursement") @QueryParam("title")  String title,@ApiParam(value = "a comment that can be made on a disbursement") @QueryParam("comment")  String comment,@ApiParam(value = "an external ID that can be used to reference the disbursement") @QueryParam("externalId")  String externalId,@ApiParam(value = "determines whether to try sending the disbursement again in the case of a previous failure") @QueryParam("retry")  Boolean retry,@ApiParam(value = "for specifying parameters to make an http callback request for validating that the disbursement is valid") @QueryParam("introspectionParams")  String introspectionParams,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateDisbursement(accountId, disbursementId, amount, provider, scheduledDate, title, comment, externalId, retry, introspectionParams, securityContext);
    }
}
