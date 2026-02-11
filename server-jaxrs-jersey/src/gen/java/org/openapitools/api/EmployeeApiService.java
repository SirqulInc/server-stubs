package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.EmployeeResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class EmployeeApiService {
    public abstract Response assignEmployee( @NotNull Long accountId, @NotNull Long managerAccountId, @NotNull Long employeeAccountId,String role,SecurityContext securityContext) throws NotFoundException;
    public abstract Response assignToLocationEmployee( @NotNull Long accountId, @NotNull Long retailerLocationId,Long employeeAccountId,Boolean assign,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createEmployee( @NotNull Long accountId, @NotNull Long managerAccountId, @NotNull String username, @NotNull String password,String name,String prefixName,String firstName,String middleName,String lastName,String suffixName,String title,String aboutUs,Long assetId,String gender,String homePhone,String cellPhone,String cellPhoneCarrier,String businessPhone,String emailAddress,String streetAddress,String streetAddress2,String city,String state,String zipcode,String country,String role,String retailerLocationIds,String settingsAppKey,String appBlob,String assignedDeviceId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteEmployee( @NotNull Long accountId, @NotNull Long employeeAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getEmployee( @NotNull Long accountId, @NotNull Long employeeAccountId,String settingsAppKey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchEmployees( @NotNull Long accountId,String role,Long retailerId,Long retailerLocationId,String q,String keyword,String sortField,Boolean descending,Integer i,Integer start,Integer l,Integer limit,Boolean activeOnly,Boolean managedOnly,String settingsAppKey,String categoryIds,String query,SecurityContext securityContext) throws NotFoundException;
    public abstract Response unassignEmployee( @NotNull Long accountId, @NotNull Long employeeAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateEmployee( @NotNull Long accountId, @NotNull Long employeeAccountId,Long managerAccountId,String name,String prefixName,String firstName,String middleName,String lastName,String suffixName,String title,Long assetId,String gender,String homePhone,String cellPhone,String cellPhoneCarrier,String businessPhone,String emailAddress,String streetAddress,String streetAddress2,String city,String state,String zipcode,String country,String role,Boolean active,String password,String retailerLocationIds,String settingsAppKey,String appBlob,String assignedDeviceId,SecurityContext securityContext) throws NotFoundException;
}
