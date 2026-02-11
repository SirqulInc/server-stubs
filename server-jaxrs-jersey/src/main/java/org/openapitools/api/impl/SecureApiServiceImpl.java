package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.io.File;
import org.openapitools.model.PaymentRequest;
import org.openapitools.model.ProfileResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class SecureApiServiceImpl extends SecureApiService {
    @Override
    public Response createSecureApplication( @NotNull Long accountId,  @NotNull String appKey,  @NotNull File keyCert,  @NotNull File trustStore,  @NotNull String username,  @NotNull String password, Boolean active, String biometricType, String biometricPosition, String biometricPosition2, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteSecureApplication( @NotNull Long accountId,  @NotNull String appKey, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response loginSecure( @NotNull String appKey,  @NotNull File biometricFile, String deviceId, File biometricFile2, Integer ageRestriction, Boolean returnProfile, String responseFilters, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response purchaseSecure(PaymentRequest body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response resetSecure( @NotNull Long accountId,  @NotNull String appKey, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateSecureApplication( @NotNull Long accountId,  @NotNull String appKey, Boolean active, File keyCert, File trustStore, String username, String password, String biometricType, String biometricPosition, String biometricPosition2, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
