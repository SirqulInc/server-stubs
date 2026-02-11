package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.PostalCodeResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface PostalCodeApiService {
      Response createPostalCode(Long accountId,String code,Double latitude,Double longitude,String stateCode,String city,Boolean active,SecurityContext securityContext)
      throws NotFoundException;
      Response deletePostalCode(Long accountId,Long postalCodeId,SecurityContext securityContext)
      throws NotFoundException;
      Response getPostalCode(Long postalCodeId,SecurityContext securityContext)
      throws NotFoundException;
      Response getPostalCodes(String sortField,Boolean descending,Double latitude,Double longitude,String keyword,Double miles,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response updatePostalCode(Long accountId,Long postalCodeId,String code,Double latitude,Double longitude,String stateCode,String city,Boolean active,SecurityContext securityContext)
      throws NotFoundException;


}
