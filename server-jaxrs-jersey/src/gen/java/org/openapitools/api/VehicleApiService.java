package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.Vehicle;
import org.openapitools.model.VehicleType;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class VehicleApiService {
    public abstract Response createVehicle( @NotNull String vehicle,Vehicle body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createVehicleType( @NotNull String vehicleType,VehicleType body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteVehicle(Long id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteVehicleType(Long vehicleTypeId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getVehicle(Long id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getVehicleType(Long vehicleTypeId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchVehicle( @NotNull Long hubId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly,String keyword,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchVehicleTypes( @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly,Long retailerId,Long hubId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateVehicle(Long id, @NotNull String vehicle,Vehicle body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateVehicleType(Long vehicleTypeId, @NotNull String vehicleType,VehicleType body,SecurityContext securityContext) throws NotFoundException;
}
