package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.EmployeeResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
@Path("/api/{version}/employee")
@Api(value = "/", description = "")
public interface EmployeeApi  {

    /**
     * Assign Employee
     *
     * Assign An existing account to be an employee
     *
     */
    @POST
    @Path("/assign")
    @Produces({ "*/*" })
    @ApiOperation(value = "Assign Employee", tags={ "Employee" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = EmployeeResponse.class) })
    public EmployeeResponse assignEmployee(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("managerAccountId") @NotNull Long managerAccountId, @QueryParam("employeeAccountId") @NotNull Long employeeAccountId, @QueryParam("role") String role);

    /**
     * Assign Employee to Location
     *
     * Assign or unassign the account to a retailer location.
     *
     */
    @POST
    @Path("/assignToLocation")
    @Produces({ "*/*" })
    @ApiOperation(value = "Assign Employee to Location", tags={ "Employee" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse assignToLocationEmployee(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("retailerLocationId") @NotNull Long retailerLocationId, @QueryParam("employeeAccountId") Long employeeAccountId, @QueryParam("assign") @DefaultValue("true")Boolean assign);

    /**
     * Create Employee
     *
     * Create a new account record with the provided information.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Employee", tags={ "Employee" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = EmployeeResponse.class) })
    public EmployeeResponse createEmployee(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("managerAccountId") @NotNull Long managerAccountId, @QueryParam("username") @NotNull String username, @QueryParam("password") @NotNull String password, @QueryParam("name") String name, @QueryParam("prefixName") String prefixName, @QueryParam("firstName") String firstName, @QueryParam("middleName") String middleName, @QueryParam("lastName") String lastName, @QueryParam("suffixName") String suffixName, @QueryParam("title") String title, @QueryParam("aboutUs") String aboutUs, @QueryParam("assetId") Long assetId, @QueryParam("gender") String gender, @QueryParam("homePhone") String homePhone, @QueryParam("cellPhone") String cellPhone, @QueryParam("cellPhoneCarrier") String cellPhoneCarrier, @QueryParam("businessPhone") String businessPhone, @QueryParam("emailAddress") String emailAddress, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("zipcode") String zipcode, @QueryParam("country") String country, @QueryParam("role") String role, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("settingsAppKey") String settingsAppKey, @QueryParam("appBlob") String appBlob, @QueryParam("assignedDeviceId") String assignedDeviceId);

    /**
     * Delete Employee
     *
     * Set the deleted date field which marks the record as deleted.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Employee", tags={ "Employee" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteEmployee(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("employeeAccountId") @NotNull Long employeeAccountId);

    /**
     * Get Employee
     *
     * Get the account record for the account id provided.
     *
     */
    @POST
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Employee", tags={ "Employee" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = EmployeeResponse.class) })
    public EmployeeResponse getEmployee(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("employeeAccountId") @NotNull Long employeeAccountId, @QueryParam("settingsAppKey") String settingsAppKey);

    /**
     * Search Employees
     *
     * Use the accountId to determine the associated BillableEntity. From there get a list of all accounts associated as managers/employees.
     *
     */
    @POST
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Employees", tags={ "Employee" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = EmployeeResponse.class, responseContainer = "List") })
    public List<EmployeeResponse> searchEmployees(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("role") String role, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("sortField") String sortField, @QueryParam("descending") @DefaultValue("false")Boolean descending, @QueryParam("_i") Integer i, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("_l") Integer l, @QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("activeOnly") @DefaultValue("true")Boolean activeOnly, @QueryParam("managedOnly") Boolean managedOnly, @QueryParam("settingsAppKey") String settingsAppKey, @QueryParam("categoryIds") String categoryIds, @QueryParam("query") String query);

    /**
     * Unassign Employee
     *
     * Unassign An existing account to be an employee
     *
     */
    @POST
    @Path("/unassign")
    @Produces({ "*/*" })
    @ApiOperation(value = "Unassign Employee", tags={ "Employee" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = EmployeeResponse.class) })
    public EmployeeResponse unassignEmployee(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("employeeAccountId") @NotNull Long employeeAccountId);

    /**
     * Update Employee
     *
     * Update the account record with the provided information.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Employee", tags={ "Employee" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = EmployeeResponse.class) })
    public EmployeeResponse updateEmployee(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("employeeAccountId") @NotNull Long employeeAccountId, @QueryParam("managerAccountId") Long managerAccountId, @QueryParam("name") String name, @QueryParam("prefixName") String prefixName, @QueryParam("firstName") String firstName, @QueryParam("middleName") String middleName, @QueryParam("lastName") String lastName, @QueryParam("suffixName") String suffixName, @QueryParam("title") String title, @QueryParam("assetId") Long assetId, @QueryParam("gender") String gender, @QueryParam("homePhone") String homePhone, @QueryParam("cellPhone") String cellPhone, @QueryParam("cellPhoneCarrier") String cellPhoneCarrier, @QueryParam("businessPhone") String businessPhone, @QueryParam("emailAddress") String emailAddress, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("zipcode") String zipcode, @QueryParam("country") String country, @QueryParam("role") String role, @QueryParam("active") Boolean active, @QueryParam("password") String password, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("settingsAppKey") String settingsAppKey, @QueryParam("appBlob") String appBlob, @QueryParam("assignedDeviceId") String assignedDeviceId);
}
