package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.Account;
import org.openapitools.model.CargoType;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class CargoApiService {
    public abstract Response create(Long accountId,Account body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createCargoType(CargoType body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteCargoType(Long cargoTypeId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getCargoType(Long cargoTypeId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getDependents(Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response removeDependent(Long accountId,Long dependentId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchCargoTypes( @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly,Long retailerId,Long hubId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateCargoType(Long cargoTypeId,CargoType body,SecurityContext securityContext) throws NotFoundException;
}
