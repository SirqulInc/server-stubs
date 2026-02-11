package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.FilterResponse;
import org.openapitools.model.FilterTreeResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class FilterApiService {
    public abstract Response createFilter( @NotNull Long accountId, @NotNull String name,String appKey,Long parentFilterId,String description,String externalId,String externalType,Boolean active,String metaData,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteFilter( @NotNull Long accountId, @NotNull Long filterId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getFilter( @NotNull Long filterId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchFilters(Long accountId,String keyword,String appKey,String responseGroup,Boolean rootOnly,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateFilter( @NotNull Long accountId, @NotNull Long filterId,Long parentFilterId,String name,String description,String externalId,String externalType,Boolean active,String metaData,SecurityContext securityContext) throws NotFoundException;
}
