package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.PostalCodeResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class PostalCodeApiService {
    public abstract Response createPostalCode( @NotNull Long accountId, @NotNull String code, @NotNull Double latitude, @NotNull Double longitude,String stateCode,String city,Boolean active,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deletePostalCode( @NotNull Long accountId, @NotNull Long postalCodeId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPostalCode( @NotNull Long postalCodeId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPostalCodes( @NotNull String sortField, @NotNull Boolean descending,Double latitude,Double longitude,String keyword,Double miles,Integer start,Integer limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updatePostalCode( @NotNull Long accountId, @NotNull Long postalCodeId,String code,Double latitude,Double longitude,String stateCode,String city,Boolean active,SecurityContext securityContext) throws NotFoundException;
}
