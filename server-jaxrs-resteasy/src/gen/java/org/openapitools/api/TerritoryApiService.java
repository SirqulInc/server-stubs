package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TerritoryResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface TerritoryApiService {
      Response createTerritory(Long accountId,String name,Boolean active,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteTerritory(Long accountId,Long territoryId,SecurityContext securityContext)
      throws NotFoundException;
      Response getTerritory(Long territoryId,SecurityContext securityContext)
      throws NotFoundException;
      Response searchTerritories(String sortField,Boolean descending,String keyword,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response updateTerritory(Long accountId,Long territoryId,String name,Boolean active,SecurityContext securityContext)
      throws NotFoundException;


}
