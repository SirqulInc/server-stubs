package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.ObjectStoreResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface ObjectApiService {
      Response addField(Long accountId,String appKey,String objectName,String fieldName,String fieldType,SecurityContext securityContext)
      throws NotFoundException;
      Response createData(String objectName,Long accountId,String body,SecurityContext securityContext)
      throws NotFoundException;
      Response createObject(Long accountId,String appKey,String objectName,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteData(String objectName,String objectId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteField(Long accountId,String appKey,String objectName,String fieldName,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteObject(Long accountId,String appKey,String objectName,SecurityContext securityContext)
      throws NotFoundException;
      Response getData(String objectName,String objectId,Long accountId,String include,SecurityContext securityContext)
      throws NotFoundException;
      Response getObject(Long accountId,String appKey,String objectName,SecurityContext securityContext)
      throws NotFoundException;
      Response searchData(String objectName,Boolean count,Long start,Long limit,Long accountId,String criteria,String order,String include,SecurityContext securityContext)
      throws NotFoundException;
      Response searchObject(Long accountId,String appKey,Long start,Long limit,String keyword,SecurityContext securityContext)
      throws NotFoundException;
      Response updateData(String objectName,String objectId,Long accountId,String body,SecurityContext securityContext)
      throws NotFoundException;


}
