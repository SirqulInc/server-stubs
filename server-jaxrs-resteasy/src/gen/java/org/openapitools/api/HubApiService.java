package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.ServiceHub;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface HubApiService {
      Response createServiceHub(ServiceHub body,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteServiceHub(Long id,SecurityContext securityContext)
      throws NotFoundException;
      Response getServiceHub(Long id,SecurityContext securityContext)
      throws NotFoundException;
      Response postServiceHub(Long id,ServiceHub body,SecurityContext securityContext)
      throws NotFoundException;
      Response putServiceHub(Long id,ServiceHub body,SecurityContext securityContext)
      throws NotFoundException;
      Response searchServiceHubs(String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,String keyword,Long retailerId,SecurityContext securityContext)
      throws NotFoundException;


}
