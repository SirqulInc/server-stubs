package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.StripeApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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

@Path("/stripe/checkout/session/create")


@io.swagger.annotations.Api(description = "the stripe API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class StripeApi  {

    @Inject StripeApiService service;

    @POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Stripe Checkout Session", notes = "Create a Stripe checkout session", response = SirqulResponse.class, tags={ "Stripe", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response createStripeCheckoutSession( @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("stripeParameters") String stripeParameters,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createStripeCheckoutSession(appKey,stripeParameters,securityContext);
    }
}
