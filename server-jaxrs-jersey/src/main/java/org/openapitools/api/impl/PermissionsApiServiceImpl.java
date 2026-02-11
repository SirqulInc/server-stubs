package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.UserPermissionsResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PermissionsApiServiceImpl extends PermissionsApiService {
    @Override
    public Response searchPermissionables(String deviceId, Long accountId, Long connectionAccountId, String connectionAccountIds, String permissionableType, Long permissionableId, String keyword, String sortField, Boolean descending, Boolean pending, Boolean admin, Integer start, Integer limit, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response searchPermissionablesFollowingDistance( @NotNull Double latitude,  @NotNull Double longitude, String deviceId, Long accountId, Long connectionAccountId, String connectionAccountIds, String permissionableType, Long permissionableId, Double searchRange, String keyword, Boolean pending, Boolean admin, Integer start, Integer limit, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
