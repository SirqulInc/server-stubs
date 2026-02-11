package org.openapitools.api;

import java.io.File;
import org.openapitools.model.PaymentRequest;
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
@Path("/secure")
@Api(value = "/", description = "")
public interface SecureAppApi  {

    /**
     * Create Secure Application
     *
     * Create a secure application record.
     *
     */
    @POST
    @Path("/application/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Secure Application", tags={ "SecureApp" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse createSecureApplication(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("keyCert") @NotNull File keyCert, @QueryParam("trustStore") @NotNull File trustStore, @QueryParam("username") @NotNull String username, @QueryParam("password") @NotNull String password, @QueryParam("active") @DefaultValue("true")Boolean active, @QueryParam("biometricType") @DefaultValue("FACIAL")String biometricType, @QueryParam("biometricPosition") @DefaultValue("UNKNOWN")String biometricPosition, @QueryParam("biometricPosition2") @DefaultValue("UNKNOWN")String biometricPosition2);

    /**
     * Delete Secure Application
     *
     * Delete a secure application record.
     *
     */
    @POST
    @Path("/application/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Secure Application", tags={ "SecureApp" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteSecureApplication(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey);

    /**
     * Login Clear
     *
     * Login via Clear.me. Creates a new account if logging in for the first time.
     *
     */
    @POST
    @Path("/login")
    @Produces({ "*/*" })
    @ApiOperation(value = "Login Clear", tags={ "SecureApp" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public ProfileResponse loginSecure(@QueryParam("appKey") @NotNull String appKey, @QueryParam("biometricFile") @NotNull File biometricFile, @QueryParam("deviceId") String deviceId, @QueryParam("biometricFile2") File biometricFile2, @QueryParam("ageRestriction") @DefaultValue("0")Integer ageRestriction, @QueryParam("returnProfile") @DefaultValue("false")Boolean returnProfile, @QueryParam("responseFilters") @DefaultValue("PROFILE")String responseFilters, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Purchase Clear
     *
     * Purchase via Clear.me. Creates a new account if purchasing for the first time.
     *
     */
    @POST
    @Path("/purchase")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Purchase Clear", tags={ "SecureApp" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public ProfileResponse purchaseSecure(@Valid @NotNull PaymentRequest body);

    /**
     * Rest Secure Application
     *
     * Reset a secure application client.
     *
     */
    @POST
    @Path("/application/reset")
    @Produces({ "*/*" })
    @ApiOperation(value = "Rest Secure Application", tags={ "SecureApp" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse resetSecure(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey);

    /**
     * Update Secure Application
     *
     * Update a secure application record.
     *
     */
    @POST
    @Path("/application/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Secure Application", tags={ "SecureApp" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse updateSecureApplication(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("active") Boolean active, @QueryParam("keyCert") File keyCert, @QueryParam("trustStore") File trustStore, @QueryParam("username") String username, @QueryParam("password") String password, @QueryParam("biometricType") String biometricType, @QueryParam("biometricPosition") String biometricPosition, @QueryParam("biometricPosition2") String biometricPosition2);
}
