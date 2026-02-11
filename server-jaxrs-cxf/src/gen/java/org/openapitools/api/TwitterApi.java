package org.openapitools.api;

import org.openapitools.model.ProfileResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
@Path("/twitter")
@Api(value = "/", description = "")
public interface TwitterApi  {

    /**
     * Authorize Twitter
     *
     * Makes an authorization call to twitter for a user to login and allow any app permissions.
     *
     */
    @POST
    @Path("/authorize")
    @Produces({ "*/*" })
    @ApiOperation(value = "Authorize Twitter", tags={ "Twitter" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse authorizeTwitter(@QueryParam("appKey") @NotNull String appKey);

    /**
     * Login Twitter
     *
     * Returns the user profile information given an access token and the secret access token. This call verifies the tokens with twitter and creates a Sirqul account for the user if its their first time logging in.
     *
     */
    @POST
    @Path("/login")
    @Produces({ "*/*" })
    @ApiOperation(value = "Login Twitter", tags={ "Twitter" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public ProfileResponse loginTwitter(@QueryParam("accessToken") @NotNull String accessToken, @QueryParam("accessTokenSecret") @NotNull String accessTokenSecret, @QueryParam("appKey") @NotNull String appKey, @QueryParam("responseFilters") @NotNull String responseFilters, @QueryParam("deviceId") String deviceId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);
}
