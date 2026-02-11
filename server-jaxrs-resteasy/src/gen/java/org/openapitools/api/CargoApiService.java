package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.Account;
import org.openapitools.model.CargoType;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface CargoApiService {
      Response create(Long accountId,Account body,SecurityContext securityContext)
      throws NotFoundException;
      Response createCargoType(CargoType body,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteCargoType(Long cargoTypeId,SecurityContext securityContext)
      throws NotFoundException;
      Response getCargoType(Long cargoTypeId,SecurityContext securityContext)
      throws NotFoundException;
      Response getDependents(Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response removeDependent(Long accountId,Long dependentId,SecurityContext securityContext)
      throws NotFoundException;
      Response searchCargoTypes(String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Long retailerId,Long hubId,SecurityContext securityContext)
      throws NotFoundException;
      Response updateCargoType(Long cargoTypeId,CargoType body,SecurityContext securityContext)
      throws NotFoundException;


}
