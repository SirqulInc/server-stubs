package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.SmsApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.TwiMLResponse;

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

@Path("/sms/buyoffer/{appKey}")


@io.swagger.annotations.Api(description = "the sms API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class SmsApi  {

    @Inject SmsApiService service;

    @POST
    
    
    @Produces({ "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Buy Offer by SMS", notes = "Recieve an SMS payload from Twillio to purchase an offer.", response = TwiMLResponse.class, tags={ "Twilio", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TwiMLResponse.class) })
    public Response smsBuyOffer( @PathParam("appKey") String appKey, @NotNull @QueryParam("Body") String body, @NotNull @QueryParam("From") String from, @NotNull @QueryParam("currencyType") String currencyType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.smsBuyOffer(appKey,body,from,currencyType,securityContext);
    }
}
