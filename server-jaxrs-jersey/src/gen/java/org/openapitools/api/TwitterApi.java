package org.openapitools.api;

import org.openapitools.api.TwitterApiService;
import org.openapitools.api.factories.TwitterApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ProfileResponse;
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

@Path("/twitter")


@io.swagger.annotations.Api(description = "the twitter API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TwitterApi  {
   private final TwitterApiService delegate;

   public TwitterApi(@Context ServletConfig servletContext) {
      TwitterApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("TwitterApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (TwitterApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = TwitterApiServiceFactory.getTwitterApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/authorize")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Authorize Twitter", notes = "Makes an authorization call to twitter for a user to login and allow any app permissions.", response = SirqulResponse.class, tags={ "Twitter", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response authorizeTwitter(@ApiParam(value = "the application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.authorizeTwitter(appKey, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/login")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Login Twitter", notes = "Returns the user profile information given an access token and the secret access token. This call verifies the tokens with twitter and creates a Sirqul account for the user if its their first time logging in.", response = ProfileResponse.class, tags={ "Twitter", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class)
    })
    public Response loginTwitter(@ApiParam(value = "The access token", required = true) @QueryParam("accessToken") @NotNull  String accessToken,@ApiParam(value = "The secret access token", required = true) @QueryParam("accessTokenSecret") @NotNull  String accessTokenSecret,@ApiParam(value = "The application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "a comma separated list of ProfileFilters for filtering the returned response data", required = true) @QueryParam("responseFilters") @NotNull  String responseFilters,@ApiParam(value = "The device id") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current longitude of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.loginTwitter(accessToken, accessTokenSecret, appKey, responseFilters, deviceId, latitude, longitude, securityContext);
    }
}
