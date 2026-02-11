package org.openapitools.api

import org.openapitools.model.EmployeeResponse
import org.openapitools.model.SirqulResponse
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/api/3.18}")
class EmployeeApiController() {

    @Operation(
        summary = "Assign Employee",
        operationId = "assignEmployee",
        description = """Assign An existing account to be an employee""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = EmployeeResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/employee/assign"
        value = [PATH_ASSIGN_EMPLOYEE],
        produces = ["*/*"]
    )
    fun assignEmployee(
        @NotNull @Parameter(description = "The account id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The account id of the manager to assign under", required = true) @Valid @RequestParam(value = "managerAccountId", required = true) managerAccountId: kotlin.Long,
        @NotNull @Parameter(description = "The account id of the user to be assigned as employee", required = true) @Valid @RequestParam(value = "employeeAccountId", required = true) employeeAccountId: kotlin.Long,
        @Parameter(description = "The role to assign to the employee (e.g. RETAILER or RETAILER_LIMITED)") @Valid @RequestParam(value = "role", required = false) role: kotlin.String?
    ): ResponseEntity<EmployeeResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Assign Employee to Location",
        operationId = "assignToLocationEmployee",
        description = """Assign or unassign the account to a retailer location.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/employee/assignToLocation"
        value = [PATH_ASSIGN_TO_LOCATION_EMPLOYEE],
        produces = ["*/*"]
    )
    fun assignToLocationEmployee(
        @NotNull @Parameter(description = "The account id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The retailer location to apply the change to", required = true) @Valid @RequestParam(value = "retailerLocationId", required = true) retailerLocationId: kotlin.Long,
        @Parameter(description = "The account id of the user to apply the change to") @Valid @RequestParam(value = "employeeAccountId", required = false) employeeAccountId: kotlin.Long?,
        @Parameter(description = "If true (default) assign to the location, otherwise remove from the retailer", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "assign", required = false, defaultValue = "true") assign: kotlin.Boolean
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Employee",
        operationId = "createEmployee",
        description = """Create a new account record with the provided information.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = EmployeeResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/employee/create"
        value = [PATH_CREATE_EMPLOYEE],
        produces = ["*/*"]
    )
    fun createEmployee(
        @NotNull @Parameter(description = "The account id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The account id of the manager to assign under", required = true) @Valid @RequestParam(value = "managerAccountId", required = true) managerAccountId: kotlin.Long,
        @NotNull @Parameter(description = "The username/email for the new user. This must be unique across the entire the system.", required = true) @Valid @RequestParam(value = "username", required = true) username: kotlin.String,
        @NotNull @Parameter(description = "The password for the new user", required = true) @Valid @RequestParam(value = "password", required = true) password: kotlin.String,
        @Parameter(description = "a name field") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "The name prefix; Mr, Mrs, etc") @Valid @RequestParam(value = "prefixName", required = false) prefixName: kotlin.String?,
        @Parameter(description = "The first name") @Valid @RequestParam(value = "firstName", required = false) firstName: kotlin.String?,
        @Parameter(description = "The middle name") @Valid @RequestParam(value = "middleName", required = false) middleName: kotlin.String?,
        @Parameter(description = "The last name") @Valid @RequestParam(value = "lastName", required = false) lastName: kotlin.String?,
        @Parameter(description = "The name suffix; Jr, Sr, III, etc") @Valid @RequestParam(value = "suffixName", required = false) suffixName: kotlin.String?,
        @Parameter(description = "The title of the user") @Valid @RequestParam(value = "title", required = false) title: kotlin.String?,
        @Parameter(description = "Additional about/biography text") @Valid @RequestParam(value = "aboutUs", required = false) aboutUs: kotlin.String?,
        @Parameter(description = "the asset id to set the user's profile image") @Valid @RequestParam(value = "assetId", required = false) assetId: kotlin.Long?,
        @Parameter(description = "The gender", schema = Schema(allowableValues = ["MALE", "FEMALE", "ANY"])) @Valid @RequestParam(value = "gender", required = false) gender: kotlin.String?,
        @Parameter(description = "The home phone number") @Valid @RequestParam(value = "homePhone", required = false) homePhone: kotlin.String?,
        @Parameter(description = "The cellular phone number") @Valid @RequestParam(value = "cellPhone", required = false) cellPhone: kotlin.String?,
        @Parameter(description = "The cellular service provider. This is required for sending SMS. Leave this empty if the provider is not on the list of supported carriers.") @Valid @RequestParam(value = "cellPhoneCarrier", required = false) cellPhoneCarrier: kotlin.String?,
        @Parameter(description = "The business phone number") @Valid @RequestParam(value = "businessPhone", required = false) businessPhone: kotlin.String?,
        @Parameter(description = "The user's contact email address (NOT the username)") @Valid @RequestParam(value = "emailAddress", required = false) emailAddress: kotlin.String?,
        @Parameter(description = "The street address of the user's contact location") @Valid @RequestParam(value = "streetAddress", required = false) streetAddress: kotlin.String?,
        @Parameter(description = "Additional address information (such as a suite number, floor number, building name, or PO Box)") @Valid @RequestParam(value = "streetAddress2", required = false) streetAddress2: kotlin.String?,
        @Parameter(description = "The city of the user's contact location") @Valid @RequestParam(value = "city", required = false) city: kotlin.String?,
        @Parameter(description = "The state of the user's contact location") @Valid @RequestParam(value = "state", required = false) state: kotlin.String?,
        @Parameter(description = "The zipcode of the user's contact location") @Valid @RequestParam(value = "zipcode", required = false) zipcode: kotlin.String?,
        @Parameter(description = "The country of the user's contact location") @Valid @RequestParam(value = "country", required = false) country: kotlin.String?,
        @Parameter(description = "The role; RETAILER or RETAILER_LIMITED, defaulted to RETAILER_LIMITED") @Valid @RequestParam(value = "role", required = false) role: kotlin.String?,
        @Parameter(description = "the retailer location IDs the employee is associated with") @Valid @RequestParam(value = "retailerLocationIds", required = false) retailerLocationIds: kotlin.String?,
        @Parameter(description = "Determines whether to return the application settings for the employee for a particular application") @Valid @RequestParam(value = "settingsAppKey", required = false) settingsAppKey: kotlin.String?,
        @Parameter(description = "external custom client defined data (per Application)") @Valid @RequestParam(value = "appBlob", required = false) appBlob: kotlin.String?,
        @Parameter(description = "The device id to assign to the user (used for IPS beacon tracking)") @Valid @RequestParam(value = "assignedDeviceId", required = false) assignedDeviceId: kotlin.String?
    ): ResponseEntity<EmployeeResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Employee",
        operationId = "deleteEmployee",
        description = """Set the deleted date field which marks the record as deleted.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/employee/delete"
        value = [PATH_DELETE_EMPLOYEE],
        produces = ["*/*"]
    )
    fun deleteEmployee(
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the employee to delete", required = true) @Valid @RequestParam(value = "employeeAccountId", required = true) employeeAccountId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Employee",
        operationId = "getEmployee",
        description = """Get the account record for the account id provided.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = EmployeeResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/employee/get"
        value = [PATH_GET_EMPLOYEE],
        produces = ["*/*"]
    )
    fun getEmployee(
        @NotNull @Parameter(description = "the id of logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the employee account to get", required = true) @Valid @RequestParam(value = "employeeAccountId", required = true) employeeAccountId: kotlin.Long,
        @Parameter(description = "Determines whether to return the application settings for the employee for a particular application") @Valid @RequestParam(value = "settingsAppKey", required = false) settingsAppKey: kotlin.String?
    ): ResponseEntity<EmployeeResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Employees",
        operationId = "searchEmployees",
        description = """Use the accountId to determine the associated BillableEntity. From there get a list of all accounts associated as managers/employees.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = EmployeeResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/employee/search"
        value = [PATH_SEARCH_EMPLOYEES],
        produces = ["*/*"]
    )
    fun searchEmployees(
        @NotNull @Parameter(description = "The account id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "The role to limit the search to: RETAILER or RETAILER_LIMITED. Leave empty to search on both roles.") @Valid @RequestParam(value = "role", required = false) role: kotlin.String?,
        @Parameter(description = "Filters employees by retailer") @Valid @RequestParam(value = "retailerId", required = false) retailerId: kotlin.Long?,
        @Parameter(description = "Filter employees by retailer locations") @Valid @RequestParam(value = "retailerLocationId", required = false) retailerLocationId: kotlin.Long?,
        @Parameter(description = "Deprecated parameter") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?,
        @Parameter(description = "an optional keyword to search on; ignored if empty") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "The field to sort by. Possible values include: DISPLAY, CREATED, UPDATED, ACTIVE, DELETED, LAST_LOGGED_IN, CONTACT_EMAIL, RETAILER_LOCATION_NAME, RETAILER_NAME", schema = Schema(allowableValues = ["ID", "DISPLAY", "CREATED", "UPDATED", "ACTIVE", "DELETED", "LAST_LOGGED_IN", "CONTACT_EMAIL", "ACCOUNT_TYPE", "RETAILER_LOCATION_NAME", "RETAILER_NAME"])) @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "Determines whether the sorted list is in descending or ascending order", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "descending", required = false, defaultValue = "false") descending: kotlin.Boolean,
        @Parameter(description = "Deprecated parameter") @Valid @RequestParam(value = "_i", required = false) i: kotlin.Int?,
        @Parameter(description = "Start the result set at some index", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "Deprecated parameter") @Valid @RequestParam(value = "_l", required = false) l: kotlin.Int?,
        @Parameter(description = "Limit the result to some number", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "Filter results to only return active employees", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "activeOnly", required = false, defaultValue = "true") activeOnly: kotlin.Boolean,
        @Parameter(description = "Filter results to only employees that you manage") @Valid @RequestParam(value = "managedOnly", required = false) managedOnly: kotlin.Boolean?,
        @Parameter(description = "Determines whether to return the application settings for the employee for a particular application") @Valid @RequestParam(value = "settingsAppKey", required = false) settingsAppKey: kotlin.String?,
        @Parameter(description = "Comma separated list of category ids to filter results") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "Legacy/reporting query parameter used for formatting employee responses") @Valid @RequestParam(value = "query", required = false) query: kotlin.String?
    ): ResponseEntity<List<EmployeeResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Unassign Employee",
        operationId = "unassignEmployee",
        description = """Unassign An existing account to be an employee""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = EmployeeResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/employee/unassign"
        value = [PATH_UNASSIGN_EMPLOYEE],
        produces = ["*/*"]
    )
    fun unassignEmployee(
        @NotNull @Parameter(description = "The account id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The account id of the user to be unassigned", required = true) @Valid @RequestParam(value = "employeeAccountId", required = true) employeeAccountId: kotlin.Long
    ): ResponseEntity<EmployeeResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Employee",
        operationId = "updateEmployee",
        description = """Update the account record with the provided information.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = EmployeeResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/employee/update"
        value = [PATH_UPDATE_EMPLOYEE],
        produces = ["*/*"]
    )
    fun updateEmployee(
        @NotNull @Parameter(description = "The account id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the employee account", required = true) @Valid @RequestParam(value = "employeeAccountId", required = true) employeeAccountId: kotlin.Long,
        @Parameter(description = "The account id of the manager to assign under") @Valid @RequestParam(value = "managerAccountId", required = false) managerAccountId: kotlin.Long?,
        @Parameter(description = "a name field") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "The name prefix; Mr, Mrs, etc") @Valid @RequestParam(value = "prefixName", required = false) prefixName: kotlin.String?,
        @Parameter(description = "The first name") @Valid @RequestParam(value = "firstName", required = false) firstName: kotlin.String?,
        @Parameter(description = "The middle name") @Valid @RequestParam(value = "middleName", required = false) middleName: kotlin.String?,
        @Parameter(description = "The last name") @Valid @RequestParam(value = "lastName", required = false) lastName: kotlin.String?,
        @Parameter(description = "The name suffix; Jr, Sr, III, etc") @Valid @RequestParam(value = "suffixName", required = false) suffixName: kotlin.String?,
        @Parameter(description = "The title of the user") @Valid @RequestParam(value = "title", required = false) title: kotlin.String?,
        @Parameter(description = "the asset id to set the user's profile image") @Valid @RequestParam(value = "assetId", required = false) assetId: kotlin.Long?,
        @Parameter(description = "The gender {MALE, FEMALE, ANY}", schema = Schema(allowableValues = ["MALE", "FEMALE", "ANY"])) @Valid @RequestParam(value = "gender", required = false) gender: kotlin.String?,
        @Parameter(description = "The home phone number") @Valid @RequestParam(value = "homePhone", required = false) homePhone: kotlin.String?,
        @Parameter(description = "The cellular phone number") @Valid @RequestParam(value = "cellPhone", required = false) cellPhone: kotlin.String?,
        @Parameter(description = "The cellular service provider. This is required for sending SMS. Leave this empty if the provider is not on the list of supported carriers. Supported Carriers: {ATT, QWEST, T_MOBILE, VERIZON, SPRINT, VIRIGIN_MOBILE, NEXTEL, ALLTEL, METRO_PCS, POWERTEL, BOOST_MOBILE, SUNCOM, TRACFONE, US_CELLULAR}") @Valid @RequestParam(value = "cellPhoneCarrier", required = false) cellPhoneCarrier: kotlin.String?,
        @Parameter(description = "The business phone number") @Valid @RequestParam(value = "businessPhone", required = false) businessPhone: kotlin.String?,
        @Parameter(description = "The user's contact email address (NOT the username)") @Valid @RequestParam(value = "emailAddress", required = false) emailAddress: kotlin.String?,
        @Parameter(description = "The street address of the user's contact location") @Valid @RequestParam(value = "streetAddress", required = false) streetAddress: kotlin.String?,
        @Parameter(description = "Additional address information (such as a suite number, floor number, building name, or PO Box)") @Valid @RequestParam(value = "streetAddress2", required = false) streetAddress2: kotlin.String?,
        @Parameter(description = "The city of the user's contact location") @Valid @RequestParam(value = "city", required = false) city: kotlin.String?,
        @Parameter(description = "The state of the user's contact location") @Valid @RequestParam(value = "state", required = false) state: kotlin.String?,
        @Parameter(description = "The zipcode of the user's contact location") @Valid @RequestParam(value = "zipcode", required = false) zipcode: kotlin.String?,
        @Parameter(description = "The country of the user's contact location") @Valid @RequestParam(value = "country", required = false) country: kotlin.String?,
        @Parameter(description = "The role; RETAILER or RETAILER_LIMITED, defaulted to RETAILER_LIMITED") @Valid @RequestParam(value = "role", required = false) role: kotlin.String?,
        @Parameter(description = "Sets whether the employee is active or inactive") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "Sets the password for the employee") @Valid @RequestParam(value = "password", required = false) password: kotlin.String?,
        @Parameter(description = "Sets which retailer locations the employee is assigned to") @Valid @RequestParam(value = "retailerLocationIds", required = false) retailerLocationIds: kotlin.String?,
        @Parameter(description = "Determines whether to return the application settings for the employee for a particular application") @Valid @RequestParam(value = "settingsAppKey", required = false) settingsAppKey: kotlin.String?,
        @Parameter(description = "external custom client defined data (per Application)") @Valid @RequestParam(value = "appBlob", required = false) appBlob: kotlin.String?,
        @Parameter(description = "The device id to assign to the user (used for IPS beacon tracking)") @Valid @RequestParam(value = "assignedDeviceId", required = false) assignedDeviceId: kotlin.String?
    ): ResponseEntity<EmployeeResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_ASSIGN_EMPLOYEE: String = "/employee/assign"
        const val PATH_ASSIGN_TO_LOCATION_EMPLOYEE: String = "/employee/assignToLocation"
        const val PATH_CREATE_EMPLOYEE: String = "/employee/create"
        const val PATH_DELETE_EMPLOYEE: String = "/employee/delete"
        const val PATH_GET_EMPLOYEE: String = "/employee/get"
        const val PATH_SEARCH_EMPLOYEES: String = "/employee/search"
        const val PATH_UNASSIGN_EMPLOYEE: String = "/employee/unassign"
        const val PATH_UPDATE_EMPLOYEE: String = "/employee/update"
    }
}
