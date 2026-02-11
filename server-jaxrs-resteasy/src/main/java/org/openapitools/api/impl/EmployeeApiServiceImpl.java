package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.EmployeeResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class EmployeeApiServiceImpl implements EmployeeApiService {
      public Response assignEmployee(Long accountId,Long managerAccountId,Long employeeAccountId,String role,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response assignToLocationEmployee(Long accountId,Long retailerLocationId,Long employeeAccountId,Boolean assign,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response createEmployee(Long accountId,Long managerAccountId,String username,String password,String name,String prefixName,String firstName,String middleName,String lastName,String suffixName,String title,String aboutUs,Long assetId,String gender,String homePhone,String cellPhone,String cellPhoneCarrier,String businessPhone,String emailAddress,String streetAddress,String streetAddress2,String city,String state,String zipcode,String country,String role,String retailerLocationIds,String settingsAppKey,String appBlob,String assignedDeviceId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response deleteEmployee(Long accountId,Long employeeAccountId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getEmployee(Long accountId,Long employeeAccountId,String settingsAppKey,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response searchEmployees(Long accountId,String role,Long retailerId,Long retailerLocationId,String q,String keyword,String sortField,Boolean descending,Integer i,Integer start,Integer l,Integer limit,Boolean activeOnly,Boolean managedOnly,String settingsAppKey,String categoryIds,String query,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response unassignEmployee(Long accountId,Long employeeAccountId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response updateEmployee(Long accountId,Long employeeAccountId,Long managerAccountId,String name,String prefixName,String firstName,String middleName,String lastName,String suffixName,String title,Long assetId,String gender,String homePhone,String cellPhone,String cellPhoneCarrier,String businessPhone,String emailAddress,String streetAddress,String streetAddress2,String city,String state,String zipcode,String country,String role,Boolean active,String password,String retailerLocationIds,String settingsAppKey,String appBlob,String assignedDeviceId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
