package org.openapitools.api;

import org.openapitools.api.StripeApiService;
import org.openapitools.api.factories.StripeApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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

@Path("/stripe/checkout/session/create")


@io.swagger.annotations.Api(description = "the stripe API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class StripeApi  {
   private final StripeApiService delegate;

   public StripeApi(@Context ServletConfig servletContext) {
      StripeApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("StripeApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (StripeApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = StripeApiServiceFactory.getStripeApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Stripe Checkout Session", notes = "Create a Stripe checkout session", response = SirqulResponse.class, tags={ "Stripe", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response createStripeCheckoutSession(@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Stripe Parameters", required = true) @QueryParam("stripeParameters") @NotNull  String stripeParameters,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createStripeCheckoutSession(appKey, stripeParameters, securityContext);
    }
}
