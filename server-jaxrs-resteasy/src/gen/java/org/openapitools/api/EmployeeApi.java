package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.EmployeeApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.EmployeeResponse;
import org.openapitools.model.SirqulResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/employee")


@io.swagger.annotations.Api(description = "the employee API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class EmployeeApi  {

    @Inject EmployeeApiService service;

    @POST
    @Path("/assign")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Assign Employee", notes = "Assign An existing account to be an employee", response = EmployeeResponse.class, tags={ "Employee", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = EmployeeResponse.class) })
    public Response assignEmployee( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("managerAccountId") Long managerAccountId, @NotNull @QueryParam("employeeAccountId") Long employeeAccountId, @QueryParam("role") String role,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assignEmployee(accountId,managerAccountId,employeeAccountId,role,securityContext);
    }
    @POST
    @Path("/assignToLocation")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Assign Employee to Location", notes = "Assign or unassign the account to a retailer location.", response = SirqulResponse.class, tags={ "Employee", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response assignToLocationEmployee( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("employeeAccountId") Long employeeAccountId, @DefaultValue("true") @QueryParam("assign") Boolean assign,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assignToLocationEmployee(accountId,retailerLocationId,employeeAccountId,assign,securityContext);
    }
    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Employee", notes = "Create a new account record with the provided information.", response = EmployeeResponse.class, tags={ "Employee", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = EmployeeResponse.class) })
    public Response createEmployee( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("managerAccountId") Long managerAccountId, @NotNull @QueryParam("username") String username, @NotNull @QueryParam("password") String password, @QueryParam("name") String name, @QueryParam("prefixName") String prefixName, @QueryParam("firstName") String firstName, @QueryParam("middleName") String middleName, @QueryParam("lastName") String lastName, @QueryParam("suffixName") String suffixName, @QueryParam("title") String title, @QueryParam("aboutUs") String aboutUs, @QueryParam("assetId") Long assetId,, allowableValues="MALE, FEMALE, ANY" @QueryParam("gender") String gender, @QueryParam("homePhone") String homePhone, @QueryParam("cellPhone") String cellPhone, @QueryParam("cellPhoneCarrier") String cellPhoneCarrier, @QueryParam("businessPhone") String businessPhone, @QueryParam("emailAddress") String emailAddress, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("zipcode") String zipcode, @QueryParam("country") String country, @QueryParam("role") String role, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("settingsAppKey") String settingsAppKey, @QueryParam("appBlob") String appBlob, @QueryParam("assignedDeviceId") String assignedDeviceId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createEmployee(accountId,managerAccountId,username,password,name,prefixName,firstName,middleName,lastName,suffixName,title,aboutUs,assetId,gender,homePhone,cellPhone,cellPhoneCarrier,businessPhone,emailAddress,streetAddress,streetAddress2,city,state,zipcode,country,role,retailerLocationIds,settingsAppKey,appBlob,assignedDeviceId,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Employee", notes = "Set the deleted date field which marks the record as deleted.", response = SirqulResponse.class, tags={ "Employee", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteEmployee( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("employeeAccountId") Long employeeAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteEmployee(accountId,employeeAccountId,securityContext);
    }
    @POST
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Employee", notes = "Get the account record for the account id provided.", response = EmployeeResponse.class, tags={ "Employee", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = EmployeeResponse.class) })
    public Response getEmployee( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("employeeAccountId") Long employeeAccountId, @QueryParam("settingsAppKey") String settingsAppKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getEmployee(accountId,employeeAccountId,settingsAppKey,securityContext);
    }
    @POST
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Employees", notes = "Use the accountId to determine the associated BillableEntity. From there get a list of all accounts associated as managers/employees.", response = EmployeeResponse.class, responseContainer = "List", tags={ "Employee", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = EmployeeResponse.class, responseContainer = "List") })
    public Response searchEmployees( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("role") String role, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("q") String q, @QueryParam("keyword") String keyword,, allowableValues="ID, DISPLAY, CREATED, UPDATED, ACTIVE, DELETED, LAST_LOGGED_IN, CONTACT_EMAIL, ACCOUNT_TYPE, RETAILER_LOCATION_NAME, RETAILER_NAME" @QueryParam("sortField") String sortField, @DefaultValue("false") @QueryParam("descending") Boolean descending, @QueryParam("_i") Integer i, @DefaultValue("0") @QueryParam("start") Integer start, @QueryParam("_l") Integer l, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("true") @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("managedOnly") Boolean managedOnly, @QueryParam("settingsAppKey") String settingsAppKey, @QueryParam("categoryIds") String categoryIds, @QueryParam("query") String query,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchEmployees(accountId,role,retailerId,retailerLocationId,q,keyword,sortField,descending,i,start,l,limit,activeOnly,managedOnly,settingsAppKey,categoryIds,query,securityContext);
    }
    @POST
    @Path("/unassign")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Unassign Employee", notes = "Unassign An existing account to be an employee", response = EmployeeResponse.class, tags={ "Employee", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = EmployeeResponse.class) })
    public Response unassignEmployee( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("employeeAccountId") Long employeeAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.unassignEmployee(accountId,employeeAccountId,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Employee", notes = "Update the account record with the provided information.", response = EmployeeResponse.class, tags={ "Employee", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = EmployeeResponse.class) })
    public Response updateEmployee( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("employeeAccountId") Long employeeAccountId, @QueryParam("managerAccountId") Long managerAccountId, @QueryParam("name") String name, @QueryParam("prefixName") String prefixName, @QueryParam("firstName") String firstName, @QueryParam("middleName") String middleName, @QueryParam("lastName") String lastName, @QueryParam("suffixName") String suffixName, @QueryParam("title") String title, @QueryParam("assetId") Long assetId,, allowableValues="MALE, FEMALE, ANY" @QueryParam("gender") String gender, @QueryParam("homePhone") String homePhone, @QueryParam("cellPhone") String cellPhone, @QueryParam("cellPhoneCarrier") String cellPhoneCarrier, @QueryParam("businessPhone") String businessPhone, @QueryParam("emailAddress") String emailAddress, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("zipcode") String zipcode, @QueryParam("country") String country, @QueryParam("role") String role, @QueryParam("active") Boolean active, @QueryParam("password") String password, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("settingsAppKey") String settingsAppKey, @QueryParam("appBlob") String appBlob, @QueryParam("assignedDeviceId") String assignedDeviceId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateEmployee(accountId,employeeAccountId,managerAccountId,name,prefixName,firstName,middleName,lastName,suffixName,title,assetId,gender,homePhone,cellPhone,cellPhoneCarrier,businessPhone,emailAddress,streetAddress,streetAddress2,city,state,zipcode,country,role,active,password,retailerLocationIds,settingsAppKey,appBlob,assignedDeviceId,securityContext);
    }
}
