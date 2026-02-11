package org.openapitools.api;

import org.openapitools.api.SmsApiService;
import org.openapitools.api.factories.SmsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.TwiMLResponse;

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

@Path("/sms/buyoffer/{appKey}")


@io.swagger.annotations.Api(description = "the sms API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class SmsApi  {
   private final SmsApiService delegate;

   public SmsApi(@Context ServletConfig servletContext) {
      SmsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("SmsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (SmsApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = SmsApiServiceFactory.getSmsApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    
    
    @Produces({ "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Buy Offer by SMS", notes = "Recieve an SMS payload from Twillio to purchase an offer.", response = TwiMLResponse.class, tags={ "Twilio", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TwiMLResponse.class)
    })
    public Response smsBuyOffer(@ApiParam(value = "the application key", required = true) @PathParam("appKey") @NotNull  String appKey,@ApiParam(value = "the message of the text", required = true) @QueryParam("Body") @NotNull  String body,@ApiParam(value = "the sender of the sms", required = true) @QueryParam("From") @NotNull  String from,@ApiParam(value = "the type of currency", required = true) @QueryParam("currencyType") @NotNull  String currencyType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.smsBuyOffer(appKey, body, from, currencyType, securityContext);
    }
}
