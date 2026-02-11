package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.CountResponse;
import org.openapitools.model.FlagResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class FlagApiService {
    public abstract Response createFlag( @NotNull String flagableType, @NotNull Long flagableId,String deviceId,Long accountId,String flagDescription,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteFlag(String deviceId,Long accountId,String itemBeingFlaggedType,Long itemBeingFlaggedId,String flagableType,Long flagableId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getFlag( @NotNull String flagableType, @NotNull Long flagableId,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getFlagThreshold( @NotNull String itemBeingFlaggedType, @NotNull String appKey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateFlagThreshold( @NotNull String itemBeingFlaggedType, @NotNull Long threshold, @NotNull String appKey,String deviceId,Long accountId,SecurityContext securityContext) throws NotFoundException;
}
