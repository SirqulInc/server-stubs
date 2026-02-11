package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.TwitterApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ProfileResponse;
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

@Path("/twitter")


@io.swagger.annotations.Api(description = "the twitter API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TwitterApi  {

    @Inject TwitterApiService service;

    @POST
    @Path("/authorize")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Authorize Twitter", notes = "Makes an authorization call to twitter for a user to login and allow any app permissions.", response = SirqulResponse.class, tags={ "Twitter", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response authorizeTwitter( @NotNull @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.authorizeTwitter(appKey,securityContext);
    }
    @POST
    @Path("/login")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Login Twitter", notes = "Returns the user profile information given an access token and the secret access token. This call verifies the tokens with twitter and creates a Sirqul account for the user if its their first time logging in.", response = ProfileResponse.class, tags={ "Twitter", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public Response loginTwitter( @NotNull @QueryParam("accessToken") String accessToken, @NotNull @QueryParam("accessTokenSecret") String accessTokenSecret, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("responseFilters") String responseFilters, @QueryParam("deviceId") String deviceId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.loginTwitter(accessToken,accessTokenSecret,appKey,responseFilters,deviceId,latitude,longitude,securityContext);
    }
}
