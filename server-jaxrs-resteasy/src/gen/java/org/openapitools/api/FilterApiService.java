package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.FilterResponse;
import org.openapitools.model.FilterTreeResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface FilterApiService {
      Response createFilter(Long accountId,String name,String appKey,Long parentFilterId,String description,String externalId,String externalType,Boolean active,String metaData,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteFilter(Long accountId,Long filterId,SecurityContext securityContext)
      throws NotFoundException;
      Response getFilter(Long filterId,SecurityContext securityContext)
      throws NotFoundException;
      Response searchFilters(Long accountId,String keyword,String appKey,String responseGroup,Boolean rootOnly,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,SecurityContext securityContext)
      throws NotFoundException;
      Response updateFilter(Long accountId,Long filterId,Long parentFilterId,String name,String description,String externalId,String externalType,Boolean active,String metaData,SecurityContext securityContext)
      throws NotFoundException;


}
