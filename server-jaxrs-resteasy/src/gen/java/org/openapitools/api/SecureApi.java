package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.SecureApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
import org.openapitools.model.PaymentRequest;
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

@Path("/secure")


@io.swagger.annotations.Api(description = "the secure API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class SecureApi  {

    @Inject SecureApiService service;

    @POST
    @Path("/application/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Secure Application", notes = "Create a secure application record.", response = SirqulResponse.class, tags={ "SecureApp", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response createSecureApplication( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("keyCert") File keyCert, @NotNull @QueryParam("trustStore") File trustStore, @NotNull @QueryParam("username") String username, @NotNull @QueryParam("password") String password, @DefaultValue("true") @QueryParam("active") Boolean active,, allowableValues="FINGERPRINT, IRIS, FACIAL" @DefaultValue("FACIAL") @QueryParam("biometricType") String biometricType,, allowableValues="UNKNOWN, LEFT_INDEX, LEFT_MIDDLE, LEFT_RING, LEFT_LITTLE, LEFT_THUMB, RIGHT_INDEX, RIGHT_MIDDLE, RIGHT_RING, RIGHT_LITTLE, RIGHT_THUMB, LEFT, RIGHT" @DefaultValue("UNKNOWN") @QueryParam("biometricPosition") String biometricPosition,, allowableValues="UNKNOWN, LEFT_INDEX, LEFT_MIDDLE, LEFT_RING, LEFT_LITTLE, LEFT_THUMB, RIGHT_INDEX, RIGHT_MIDDLE, RIGHT_RING, RIGHT_LITTLE, RIGHT_THUMB, LEFT, RIGHT" @DefaultValue("UNKNOWN") @QueryParam("biometricPosition2") String biometricPosition2,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createSecureApplication(accountId,appKey,keyCert,trustStore,username,password,active,biometricType,biometricPosition,biometricPosition2,securityContext);
    }
    @POST
    @Path("/application/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Secure Application", notes = "Delete a secure application record.", response = SirqulResponse.class, tags={ "SecureApp", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteSecureApplication( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteSecureApplication(accountId,appKey,securityContext);
    }
    @POST
    @Path("/login")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Login Clear", notes = "Login via Clear.me. Creates a new account if logging in for the first time.", response = ProfileResponse.class, tags={ "SecureApp", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public Response loginSecure( @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("biometricFile") File biometricFile, @QueryParam("deviceId") String deviceId, @QueryParam("biometricFile2") File biometricFile2, @DefaultValue("0") @QueryParam("ageRestriction") Integer ageRestriction, @DefaultValue("false") @QueryParam("returnProfile") Boolean returnProfile, @DefaultValue("PROFILE") @QueryParam("responseFilters") String responseFilters, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.loginSecure(appKey,biometricFile,deviceId,biometricFile2,ageRestriction,returnProfile,responseFilters,latitude,longitude,securityContext);
    }
    @POST
    @Path("/purchase")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Purchase Clear", notes = "Purchase via Clear.me. Creates a new account if purchasing for the first time.", response = ProfileResponse.class, tags={ "SecureApp", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public Response purchaseSecure(@ApiParam(value = "The payment request object" ,required=true) @NotNull @Valid PaymentRequest body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.purchaseSecure(body,securityContext);
    }
    @POST
    @Path("/application/reset")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Rest Secure Application", notes = "Reset a secure application client.", response = SirqulResponse.class, tags={ "SecureApp", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response resetSecure( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.resetSecure(accountId,appKey,securityContext);
    }
    @POST
    @Path("/application/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Secure Application", notes = "Update a secure application record.", response = SirqulResponse.class, tags={ "SecureApp", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response updateSecureApplication( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("active") Boolean active, @QueryParam("keyCert") File keyCert, @QueryParam("trustStore") File trustStore, @QueryParam("username") String username, @QueryParam("password") String password,, allowableValues="FINGERPRINT, IRIS, FACIAL" @QueryParam("biometricType") String biometricType,, allowableValues="UNKNOWN, LEFT_INDEX, LEFT_MIDDLE, LEFT_RING, LEFT_LITTLE, LEFT_THUMB, RIGHT_INDEX, RIGHT_MIDDLE, RIGHT_RING, RIGHT_LITTLE, RIGHT_THUMB, LEFT, RIGHT" @QueryParam("biometricPosition") String biometricPosition,, allowableValues="UNKNOWN, LEFT_INDEX, LEFT_MIDDLE, LEFT_RING, LEFT_LITTLE, LEFT_THUMB, RIGHT_INDEX, RIGHT_MIDDLE, RIGHT_RING, RIGHT_LITTLE, RIGHT_THUMB, LEFT, RIGHT" @QueryParam("biometricPosition2") String biometricPosition2,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateSecureApplication(accountId,appKey,active,keyCert,trustStore,username,password,biometricType,biometricPosition,biometricPosition2,securityContext);
    }
}
