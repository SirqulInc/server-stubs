package org.openapitools.api;

import org.openapitools.api.SecureApiService;
import org.openapitools.api.factories.SecureApiServiceFactory;

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

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/secure")


@io.swagger.annotations.Api(description = "the secure API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class SecureApi  {
   private final SecureApiService delegate;

   public SecureApi(@Context ServletConfig servletContext) {
      SecureApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("SecureApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (SecureApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = SecureApiServiceFactory.getSecureApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/application/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Secure Application", notes = "Create a secure application record.", response = SirqulResponse.class, tags={ "SecureApp", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response createSecureApplication(@ApiParam(value = "The unique id of the user making the request", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The application to secure", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "", required = true) @QueryParam("keyCert") @NotNull  File keyCert,@ApiParam(value = "", required = true) @QueryParam("trustStore") @NotNull  File trustStore,@ApiParam(value = "", required = true) @QueryParam("username") @NotNull  String username,@ApiParam(value = "", required = true) @QueryParam("password") @NotNull  String password,@ApiParam(value = "", defaultValue = "true") @DefaultValue("true") @QueryParam("active")  Boolean active,@ApiParam(value = "The type of biometric, options are: - FINGERPRINT - IRIS - FACIAL", allowableValues="FINGERPRINT, IRIS, FACIAL", defaultValue = "FACIAL") @DefaultValue("FACIAL") @QueryParam("biometricType")  String biometricType,@ApiParam(value = "The position for the biometric file uploaded", allowableValues="UNKNOWN, LEFT_INDEX, LEFT_MIDDLE, LEFT_RING, LEFT_LITTLE, LEFT_THUMB, RIGHT_INDEX, RIGHT_MIDDLE, RIGHT_RING, RIGHT_LITTLE, RIGHT_THUMB, LEFT, RIGHT", defaultValue = "UNKNOWN") @DefaultValue("UNKNOWN") @QueryParam("biometricPosition")  String biometricPosition,@ApiParam(value = "The position for each the biometric2 file uploaded", allowableValues="UNKNOWN, LEFT_INDEX, LEFT_MIDDLE, LEFT_RING, LEFT_LITTLE, LEFT_THUMB, RIGHT_INDEX, RIGHT_MIDDLE, RIGHT_RING, RIGHT_LITTLE, RIGHT_THUMB, LEFT, RIGHT", defaultValue = "UNKNOWN") @DefaultValue("UNKNOWN") @QueryParam("biometricPosition2")  String biometricPosition2,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createSecureApplication(accountId, appKey, keyCert, trustStore, username, password, active, biometricType, biometricPosition, biometricPosition2, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/application/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Secure Application", notes = "Delete a secure application record.", response = SirqulResponse.class, tags={ "SecureApp", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteSecureApplication(@ApiParam(value = "The unique id of the user making the request", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The application to secure", required = true) @QueryParam("appKey") @NotNull  String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteSecureApplication(accountId, appKey, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/login")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Login Clear", notes = "Login via Clear.me. Creates a new account if logging in for the first time.", response = ProfileResponse.class, tags={ "SecureApp", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class)
    })
    public Response loginSecure(@ApiParam(value = "The application making the request, defines what type and position is required to make a secure login the request.", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The data file used to perform authentication", required = true) @QueryParam("biometricFile") @NotNull  File biometricFile,@ApiParam(value = "The unique id of the device making the request") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The data file used to perform authentication") @QueryParam("biometricFile2")  File biometricFile2,@ApiParam(value = "Checks user's birthday to see if they meet an age requirement. If the user is under age, an error message is returned.", defaultValue = "0") @DefaultValue("0") @QueryParam("ageRestriction")  Integer ageRestriction,@ApiParam(value = "Determines whether to return a ProfileResponse on success, or a PaymentTypesResponse", defaultValue = "false") @DefaultValue("false") @QueryParam("returnProfile")  Boolean returnProfile,@ApiParam(value = "If returnProfile is set to true, this determines how much of the profile should be returned, see ProfileFilters", defaultValue = "PROFILE") @DefaultValue("PROFILE") @QueryParam("responseFilters")  String responseFilters,@ApiParam(value = "Used to update the user's current location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "Used to update the user's current location") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.loginSecure(appKey, biometricFile, deviceId, biometricFile2, ageRestriction, returnProfile, responseFilters, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/purchase")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Purchase Clear", notes = "Purchase via Clear.me. Creates a new account if purchasing for the first time.", response = ProfileResponse.class, tags={ "SecureApp", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class)
    })
    public Response purchaseSecure(@ApiParam(value = "The payment request object", required = true) @NotNull @Valid  PaymentRequest body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.purchaseSecure(body, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/application/reset")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Rest Secure Application", notes = "Reset a secure application client.", response = SirqulResponse.class, tags={ "SecureApp", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response resetSecure(@ApiParam(value = "The unique id of the user making the request", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The application to secure", required = true) @QueryParam("appKey") @NotNull  String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.resetSecure(accountId, appKey, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/application/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Secure Application", notes = "Update a secure application record.", response = SirqulResponse.class, tags={ "SecureApp", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response updateSecureApplication(@ApiParam(value = "The unique id of the user making the request", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The application to secure", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "") @QueryParam("active")  Boolean active,@ApiParam(value = "") @QueryParam("keyCert")  File keyCert,@ApiParam(value = "") @QueryParam("trustStore")  File trustStore,@ApiParam(value = "") @QueryParam("username")  String username,@ApiParam(value = "") @QueryParam("password")  String password,@ApiParam(value = "The type of biometric, options are: - FINGERPRINT - IRIS - FACIAL", allowableValues="FINGERPRINT, IRIS, FACIAL") @QueryParam("biometricType")  String biometricType,@ApiParam(value = "The position for the biometric file uploaded", allowableValues="UNKNOWN, LEFT_INDEX, LEFT_MIDDLE, LEFT_RING, LEFT_LITTLE, LEFT_THUMB, RIGHT_INDEX, RIGHT_MIDDLE, RIGHT_RING, RIGHT_LITTLE, RIGHT_THUMB, LEFT, RIGHT") @QueryParam("biometricPosition")  String biometricPosition,@ApiParam(value = "The position for each the biometric2 file uploaded", allowableValues="UNKNOWN, LEFT_INDEX, LEFT_MIDDLE, LEFT_RING, LEFT_LITTLE, LEFT_THUMB, RIGHT_INDEX, RIGHT_MIDDLE, RIGHT_RING, RIGHT_LITTLE, RIGHT_THUMB, LEFT, RIGHT") @QueryParam("biometricPosition2")  String biometricPosition2,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateSecureApplication(accountId, appKey, active, keyCert, trustStore, username, password, biometricType, biometricPosition, biometricPosition2, securityContext);
    }
}
