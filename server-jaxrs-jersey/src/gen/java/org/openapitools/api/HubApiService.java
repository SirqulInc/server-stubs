package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.ServiceHub;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class HubApiService {
    public abstract Response createServiceHub(ServiceHub body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteServiceHub(Long id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getServiceHub(Long id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postServiceHub(Long id,ServiceHub body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response putServiceHub(Long id,ServiceHub body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchServiceHubs( @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly,String keyword,Long retailerId,SecurityContext securityContext) throws NotFoundException;
}
