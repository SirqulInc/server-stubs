package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.Vehicle;
import org.openapitools.model.VehicleType;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface VehicleApiService {
      Response createVehicle(String vehicle,Vehicle body,SecurityContext securityContext)
      throws NotFoundException;
      Response createVehicleType(String vehicleType,VehicleType body,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteVehicle(Long id,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteVehicleType(Long vehicleTypeId,SecurityContext securityContext)
      throws NotFoundException;
      Response getVehicle(Long id,SecurityContext securityContext)
      throws NotFoundException;
      Response getVehicleType(Long vehicleTypeId,SecurityContext securityContext)
      throws NotFoundException;
      Response searchVehicle(Long hubId,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,String keyword,SecurityContext securityContext)
      throws NotFoundException;
      Response searchVehicleTypes(String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Long retailerId,Long hubId,SecurityContext securityContext)
      throws NotFoundException;
      Response updateVehicle(Long id,String vehicle,Vehicle body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateVehicleType(Long vehicleTypeId,String vehicleType,VehicleType body,SecurityContext securityContext)
      throws NotFoundException;


}
