package org.openapitools.api;

import org.openapitools.api.EmployeeApiService;
import org.openapitools.api.factories.EmployeeApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.EmployeeResponse;
import org.openapitools.model.SirqulResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/employee")


@io.swagger.annotations.Api(description = "the employee API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class EmployeeApi  {
   private final EmployeeApiService delegate;

   public EmployeeApi(@Context ServletConfig servletContext) {
      EmployeeApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("EmployeeApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (EmployeeApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = EmployeeApiServiceFactory.getEmployeeApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/assign")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Assign Employee", notes = "Assign An existing account to be an employee", response = EmployeeResponse.class, tags={ "Employee", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = EmployeeResponse.class)
    })
    public Response assignEmployee(@ApiParam(value = "The account id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The account id of the manager to assign under", required = true) @QueryParam("managerAccountId") @NotNull  Long managerAccountId,@ApiParam(value = "The account id of the user to be assigned as employee", required = true) @QueryParam("employeeAccountId") @NotNull  Long employeeAccountId,@ApiParam(value = "The role to assign to the employee (e.g. RETAILER or RETAILER_LIMITED)") @QueryParam("role")  String role,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.assignEmployee(accountId, managerAccountId, employeeAccountId, role, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/assignToLocation")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Assign Employee to Location", notes = "Assign or unassign the account to a retailer location.", response = SirqulResponse.class, tags={ "Employee", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response assignToLocationEmployee(@ApiParam(value = "The account id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The retailer location to apply the change to", required = true) @QueryParam("retailerLocationId") @NotNull  Long retailerLocationId,@ApiParam(value = "The account id of the user to apply the change to") @QueryParam("employeeAccountId")  Long employeeAccountId,@ApiParam(value = "If true (default) assign to the location, otherwise remove from the retailer", defaultValue = "true") @DefaultValue("true") @QueryParam("assign")  Boolean assign,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.assignToLocationEmployee(accountId, retailerLocationId, employeeAccountId, assign, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Employee", notes = "Create a new account record with the provided information.", response = EmployeeResponse.class, tags={ "Employee", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = EmployeeResponse.class)
    })
    public Response createEmployee(@ApiParam(value = "The account id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The account id of the manager to assign under", required = true) @QueryParam("managerAccountId") @NotNull  Long managerAccountId,@ApiParam(value = "The username/email for the new user. This must be unique across the entire the system.", required = true) @QueryParam("username") @NotNull  String username,@ApiParam(value = "The password for the new user", required = true) @QueryParam("password") @NotNull  String password,@ApiParam(value = "a name field") @QueryParam("name")  String name,@ApiParam(value = "The name prefix; Mr, Mrs, etc") @QueryParam("prefixName")  String prefixName,@ApiParam(value = "The first name") @QueryParam("firstName")  String firstName,@ApiParam(value = "The middle name") @QueryParam("middleName")  String middleName,@ApiParam(value = "The last name") @QueryParam("lastName")  String lastName,@ApiParam(value = "The name suffix; Jr, Sr, III, etc") @QueryParam("suffixName")  String suffixName,@ApiParam(value = "The title of the user") @QueryParam("title")  String title,@ApiParam(value = "Additional about/biography text") @QueryParam("aboutUs")  String aboutUs,@ApiParam(value = "the asset id to set the user's profile image") @QueryParam("assetId")  Long assetId,@ApiParam(value = "The gender", allowableValues="MALE, FEMALE, ANY") @QueryParam("gender")  String gender,@ApiParam(value = "The home phone number") @QueryParam("homePhone")  String homePhone,@ApiParam(value = "The cellular phone number") @QueryParam("cellPhone")  String cellPhone,@ApiParam(value = "The cellular service provider. This is required for sending SMS. Leave this empty if the provider is not on the list of supported carriers.") @QueryParam("cellPhoneCarrier")  String cellPhoneCarrier,@ApiParam(value = "The business phone number") @QueryParam("businessPhone")  String businessPhone,@ApiParam(value = "The user's contact email address (NOT the username)") @QueryParam("emailAddress")  String emailAddress,@ApiParam(value = "The street address of the user's contact location") @QueryParam("streetAddress")  String streetAddress,@ApiParam(value = "Additional address information (such as a suite number, floor number, building name, or PO Box)") @QueryParam("streetAddress2")  String streetAddress2,@ApiParam(value = "The city of the user's contact location") @QueryParam("city")  String city,@ApiParam(value = "The state of the user's contact location") @QueryParam("state")  String state,@ApiParam(value = "The zipcode of the user's contact location") @QueryParam("zipcode")  String zipcode,@ApiParam(value = "The country of the user's contact location") @QueryParam("country")  String country,@ApiParam(value = "The role; RETAILER or RETAILER_LIMITED, defaulted to RETAILER_LIMITED") @QueryParam("role")  String role,@ApiParam(value = "the retailer location IDs the employee is associated with") @QueryParam("retailerLocationIds")  String retailerLocationIds,@ApiParam(value = "Determines whether to return the application settings for the employee for a particular application") @QueryParam("settingsAppKey")  String settingsAppKey,@ApiParam(value = "external custom client defined data (per Application)") @QueryParam("appBlob")  String appBlob,@ApiParam(value = "The device id to assign to the user (used for IPS beacon tracking)") @QueryParam("assignedDeviceId")  String assignedDeviceId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createEmployee(accountId, managerAccountId, username, password, name, prefixName, firstName, middleName, lastName, suffixName, title, aboutUs, assetId, gender, homePhone, cellPhone, cellPhoneCarrier, businessPhone, emailAddress, streetAddress, streetAddress2, city, state, zipcode, country, role, retailerLocationIds, settingsAppKey, appBlob, assignedDeviceId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Employee", notes = "Set the deleted date field which marks the record as deleted.", response = SirqulResponse.class, tags={ "Employee", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteEmployee(@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the employee to delete", required = true) @QueryParam("employeeAccountId") @NotNull  Long employeeAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteEmployee(accountId, employeeAccountId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Employee", notes = "Get the account record for the account id provided.", response = EmployeeResponse.class, tags={ "Employee", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = EmployeeResponse.class)
    })
    public Response getEmployee(@ApiParam(value = "the id of logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the employee account to get", required = true) @QueryParam("employeeAccountId") @NotNull  Long employeeAccountId,@ApiParam(value = "Determines whether to return the application settings for the employee for a particular application") @QueryParam("settingsAppKey")  String settingsAppKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getEmployee(accountId, employeeAccountId, settingsAppKey, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Employees", notes = "Use the accountId to determine the associated BillableEntity. From there get a list of all accounts associated as managers/employees.", response = EmployeeResponse.class, responseContainer = "List", tags={ "Employee", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = EmployeeResponse.class, responseContainer = "List")
    })
    public Response searchEmployees(@ApiParam(value = "The account id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The role to limit the search to: RETAILER or RETAILER_LIMITED. Leave empty to search on both roles.") @QueryParam("role")  String role,@ApiParam(value = "Filters employees by retailer") @QueryParam("retailerId")  Long retailerId,@ApiParam(value = "Filter employees by retailer locations") @QueryParam("retailerLocationId")  Long retailerLocationId,@ApiParam(value = "Deprecated parameter") @QueryParam("q")  String q,@ApiParam(value = "an optional keyword to search on; ignored if empty") @QueryParam("keyword")  String keyword,@ApiParam(value = "The field to sort by. Possible values include: DISPLAY, CREATED, UPDATED, ACTIVE, DELETED, LAST_LOGGED_IN, CONTACT_EMAIL, RETAILER_LOCATION_NAME, RETAILER_NAME", allowableValues="ID, DISPLAY, CREATED, UPDATED, ACTIVE, DELETED, LAST_LOGGED_IN, CONTACT_EMAIL, ACCOUNT_TYPE, RETAILER_LOCATION_NAME, RETAILER_NAME") @QueryParam("sortField")  String sortField,@ApiParam(value = "Determines whether the sorted list is in descending or ascending order", defaultValue = "false") @DefaultValue("false") @QueryParam("descending")  Boolean descending,@ApiParam(value = "Deprecated parameter") @QueryParam("_i")  Integer i,@ApiParam(value = "Start the result set at some index", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "Deprecated parameter") @QueryParam("_l")  Integer l,@ApiParam(value = "Limit the result to some number", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@ApiParam(value = "Filter results to only return active employees", defaultValue = "true") @DefaultValue("true") @QueryParam("activeOnly")  Boolean activeOnly,@ApiParam(value = "Filter results to only employees that you manage") @QueryParam("managedOnly")  Boolean managedOnly,@ApiParam(value = "Determines whether to return the application settings for the employee for a particular application") @QueryParam("settingsAppKey")  String settingsAppKey,@ApiParam(value = "Comma separated list of category ids to filter results") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "Legacy/reporting query parameter used for formatting employee responses") @QueryParam("query")  String query,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchEmployees(accountId, role, retailerId, retailerLocationId, q, keyword, sortField, descending, i, start, l, limit, activeOnly, managedOnly, settingsAppKey, categoryIds, query, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/unassign")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Unassign Employee", notes = "Unassign An existing account to be an employee", response = EmployeeResponse.class, tags={ "Employee", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = EmployeeResponse.class)
    })
    public Response unassignEmployee(@ApiParam(value = "The account id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The account id of the user to be unassigned", required = true) @QueryParam("employeeAccountId") @NotNull  Long employeeAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.unassignEmployee(accountId, employeeAccountId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Employee", notes = "Update the account record with the provided information.", response = EmployeeResponse.class, tags={ "Employee", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = EmployeeResponse.class)
    })
    public Response updateEmployee(@ApiParam(value = "The account id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the employee account", required = true) @QueryParam("employeeAccountId") @NotNull  Long employeeAccountId,@ApiParam(value = "The account id of the manager to assign under") @QueryParam("managerAccountId")  Long managerAccountId,@ApiParam(value = "a name field") @QueryParam("name")  String name,@ApiParam(value = "The name prefix; Mr, Mrs, etc") @QueryParam("prefixName")  String prefixName,@ApiParam(value = "The first name") @QueryParam("firstName")  String firstName,@ApiParam(value = "The middle name") @QueryParam("middleName")  String middleName,@ApiParam(value = "The last name") @QueryParam("lastName")  String lastName,@ApiParam(value = "The name suffix; Jr, Sr, III, etc") @QueryParam("suffixName")  String suffixName,@ApiParam(value = "The title of the user") @QueryParam("title")  String title,@ApiParam(value = "the asset id to set the user's profile image") @QueryParam("assetId")  Long assetId,@ApiParam(value = "The gender {MALE, FEMALE, ANY}", allowableValues="MALE, FEMALE, ANY") @QueryParam("gender")  String gender,@ApiParam(value = "The home phone number") @QueryParam("homePhone")  String homePhone,@ApiParam(value = "The cellular phone number") @QueryParam("cellPhone")  String cellPhone,@ApiParam(value = "The cellular service provider. This is required for sending SMS. Leave this empty if the provider is not on the list of supported carriers. Supported Carriers: {ATT, QWEST, T_MOBILE, VERIZON, SPRINT, VIRIGIN_MOBILE, NEXTEL, ALLTEL, METRO_PCS, POWERTEL, BOOST_MOBILE, SUNCOM, TRACFONE, US_CELLULAR}") @QueryParam("cellPhoneCarrier")  String cellPhoneCarrier,@ApiParam(value = "The business phone number") @QueryParam("businessPhone")  String businessPhone,@ApiParam(value = "The user's contact email address (NOT the username)") @QueryParam("emailAddress")  String emailAddress,@ApiParam(value = "The street address of the user's contact location") @QueryParam("streetAddress")  String streetAddress,@ApiParam(value = "Additional address information (such as a suite number, floor number, building name, or PO Box)") @QueryParam("streetAddress2")  String streetAddress2,@ApiParam(value = "The city of the user's contact location") @QueryParam("city")  String city,@ApiParam(value = "The state of the user's contact location") @QueryParam("state")  String state,@ApiParam(value = "The zipcode of the user's contact location") @QueryParam("zipcode")  String zipcode,@ApiParam(value = "The country of the user's contact location") @QueryParam("country")  String country,@ApiParam(value = "The role; RETAILER or RETAILER_LIMITED, defaulted to RETAILER_LIMITED") @QueryParam("role")  String role,@ApiParam(value = "Sets whether the employee is active or inactive") @QueryParam("active")  Boolean active,@ApiParam(value = "Sets the password for the employee") @QueryParam("password")  String password,@ApiParam(value = "Sets which retailer locations the employee is assigned to") @QueryParam("retailerLocationIds")  String retailerLocationIds,@ApiParam(value = "Determines whether to return the application settings for the employee for a particular application") @QueryParam("settingsAppKey")  String settingsAppKey,@ApiParam(value = "external custom client defined data (per Application)") @QueryParam("appBlob")  String appBlob,@ApiParam(value = "The device id to assign to the user (used for IPS beacon tracking)") @QueryParam("assignedDeviceId")  String assignedDeviceId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateEmployee(accountId, employeeAccountId, managerAccountId, name, prefixName, firstName, middleName, lastName, suffixName, title, assetId, gender, homePhone, cellPhone, cellPhoneCarrier, businessPhone, emailAddress, streetAddress, streetAddress2, city, state, zipcode, country, role, active, password, retailerLocationIds, settingsAppKey, appBlob, assignedDeviceId, securityContext);
    }
}
