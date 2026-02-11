package org.openapitools.api;

import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TokenResponse;

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
@Path("/facebook")
@Api(value = "/", description = "")
public interface FacebookApi  {

    /**
     * Get Facebook Token
     *
     * Gets a user&#39;s Facebook token.
     *
     */
    @GET
    @Path("/getfbtoken")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Facebook Token", tags={ "Facebook" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = TokenResponse.class) })
    public TokenResponse getToken(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Post to Facebook
     *
     * Make Facebook posts on behalf of the user.
     *
     */
    @POST
    @Path("/graph")
    @Produces({ "*/*" })
    @ApiOperation(value = "Post to Facebook", tags={ "Facebook" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse graphInterface(@QueryParam("event") @NotNull String event, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("permissionableType") String permissionableType, @QueryParam("permissionableId") Long permissionableId, @QueryParam("assetId") Long assetId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);
}
