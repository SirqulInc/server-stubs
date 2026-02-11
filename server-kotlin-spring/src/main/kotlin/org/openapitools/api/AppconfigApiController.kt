package org.openapitools.api

import org.openapitools.model.ApplicationConfigResponse
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
class AppconfigApiController() {

    @Operation(
        summary = "Create AppConfig",
        operationId = "createApplicationConfig",
        description = """Creates a new application configuration. If the configVersion provided already exists for the given app, an invalid response is returned and the application configuration won't be created.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ApplicationConfigResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/appconfig/create"
        value = [PATH_CREATE_APPLICATION_CONFIG],
        produces = ["*/*"]
    )
    fun createApplicationConfig(
        @NotNull @Parameter(description = "The account ID of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The application key that the newly created applicationConfig will be associated to", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "The application configuration, has to be unique within the application", required = true) @Valid @RequestParam(value = "configVersion", required = true) configVersion: kotlin.String,
        @NotNull @Parameter(description = "The json assetId that stores the configuration detail.", required = true) @Valid @RequestParam(value = "assetId", required = true) assetId: kotlin.Long,
        @Parameter(description = "The retailer id for retailer specific configurations") @Valid @RequestParam(value = "retailerId", required = false) retailerId: kotlin.Long?,
        @Parameter(description = "The retailer location id for retailer location specific configurations") @Valid @RequestParam(value = "retailerLocationId", required = false) retailerLocationId: kotlin.Long?,
        @Parameter(description = "The device udid for device specific configurations") @Valid @RequestParam(value = "udid", required = false) udid: kotlin.String?
    ): ResponseEntity<ApplicationConfigResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete AppConfig",
        operationId = "deleteApplicationConfig",
        description = """Mark the application configuration for deletion.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/appconfig/delete"
        value = [PATH_DELETE_APPLICATION_CONFIG],
        produces = ["*/*"]
    )
    fun deleteApplicationConfig(
        @NotNull @Parameter(description = "The account ID of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The config ID of the application configuration to delete", required = true) @Valid @RequestParam(value = "configId", required = true) configId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get AppConfig",
        operationId = "getApplicationConfig",
        description = """Gets the appConfig data by the given configId. If appConfig cannot be found, it returns an invalid response.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ApplicationConfigResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/appconfig/get"
        value = [PATH_GET_APPLICATION_CONFIG],
        produces = ["*/*"]
    )
    fun getApplicationConfig(
        @NotNull @Parameter(description = "The account ID of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The config ID of the application configuration", required = true) @Valid @RequestParam(value = "configId", required = true) configId: kotlin.Long
    ): ResponseEntity<ApplicationConfigResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get AppConfig by Version",
        operationId = "getApplicationConfigByConfigVersion",
        description = """Gets the appConfig data by the given appKey and app configVersion number.If the appKey is is invalid or appConfig is not found, it returns an invalid response. """,
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ApplicationConfigResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/appconfig/getbyversion"
        value = [PATH_GET_APPLICATION_CONFIG_BY_CONFIG_VERSION],
        produces = ["*/*"]
    )
    fun getApplicationConfigByConfigVersion(
        @NotNull @Parameter(description = "The application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "The version of the application configuration", required = true) @Valid @RequestParam(value = "configVersion", required = true) configVersion: kotlin.String,
        @Parameter(description = "Only returns the config that matches the given retailer") @Valid @RequestParam(value = "retailerId", required = false) retailerId: kotlin.Long?,
        @Parameter(description = "Only returns the config that matches the given retailer location") @Valid @RequestParam(value = "retailerLocationId", required = false) retailerLocationId: kotlin.Long?,
        @Parameter(description = "Only returns only returns the config that matches the given device udid") @Valid @RequestParam(value = "udid", required = false) udid: kotlin.String?,
        @Parameter(description = "Determines whether to return older config versions if the exact version is not found. If this happens, will try to return the latest version.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "allowOlderVersions", required = false, defaultValue = "false") allowOlderVersions: kotlin.Boolean
    ): ResponseEntity<ApplicationConfigResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search AppConfigs",
        operationId = "searchApplicationConfig",
        description = """Gets all versions of application configurations in a particular app by the given appKey.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = ApplicationConfigResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/appconfig/search"
        value = [PATH_SEARCH_APPLICATION_CONFIG],
        produces = ["*/*"]
    )
    fun searchApplicationConfig(
        @NotNull @Parameter(description = "The account ID of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "The application key to filter results by application Leaving this empty will return all application configurations for all applications (executive user only)") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "Only returns the configs that matches the given retailer") @Valid @RequestParam(value = "retailerId", required = false) retailerId: kotlin.Long?,
        @Parameter(description = "Only returns the configs that matches the given retailer location") @Valid @RequestParam(value = "retailerLocationId", required = false) retailerLocationId: kotlin.Long?,
        @Parameter(description = "Only returns only returns the configs that matches the given device udid") @Valid @RequestParam(value = "udid", required = false) udid: kotlin.String?,
        @Parameter(description = "Config Version") @Valid @RequestParam(value = "configVersion", required = false) configVersion: kotlin.String?,
        @Parameter(description = "Orders the results by: CREATED, UPDATED, ACTIVE, APPLICATION_ID,  APPLICATION_KEY, APPLICATION_NAME, RETAILER_NAME, RETAILER_ID, RETAILER_LOCATION_NAME,  RETAILER_LOCATION_ID, OFFER_TITLE, OFFER_ID, OFFER_LOCATION_ID, CONFIG_VERSION_MINOR,  CONFIG_VERSION_MAJOR, CONFIG_VERSION_INDEX ", schema = Schema(defaultValue = "CONFIG_VERSION_INDEX")) @Valid @RequestParam(value = "sortField", required = false, defaultValue = "CONFIG_VERSION_INDEX") sortField: kotlin.String,
        @Parameter(description = "Determines whether the results are in descending or ascending order", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "descending", required = false, defaultValue = "true") descending: kotlin.Boolean,
        @Parameter(description = "The start index for pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "The limit for pagination (There is a hard limit of 100)", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int
    ): ResponseEntity<List<ApplicationConfigResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update AppConfig",
        operationId = "updateApplicationConfig",
        description = """pdates an existing application configuration. If the configVersion provided already exists for the given app the application configuration won't be updated.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ApplicationConfigResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/appconfig/update"
        value = [PATH_UPDATE_APPLICATION_CONFIG],
        produces = ["*/*"]
    )
    fun updateApplicationConfig(
        @NotNull @Parameter(description = "The account ID of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The config ID of the application configuration to update", required = true) @Valid @RequestParam(value = "configId", required = true) configId: kotlin.Long,
        @Parameter(description = "The application key that the updated applicationConfig will be associated to") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The application configuration, has to be unique within the application") @Valid @RequestParam(value = "configVersion", required = false) configVersion: kotlin.String?,
        @Parameter(description = "The json assetId that stores the configuration detail.") @Valid @RequestParam(value = "assetId", required = false) assetId: kotlin.Long?,
        @Parameter(description = "The retailer id for retailer specific configurations") @Valid @RequestParam(value = "retailerId", required = false) retailerId: kotlin.Long?,
        @Parameter(description = "The retailer location id for retailer location specific configurations") @Valid @RequestParam(value = "retailerLocationId", required = false) retailerLocationId: kotlin.Long?,
        @Parameter(description = "The device udid for device specific configurations") @Valid @RequestParam(value = "udid", required = false) udid: kotlin.String?
    ): ResponseEntity<ApplicationConfigResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_APPLICATION_CONFIG: String = "/appconfig/create"
        const val PATH_DELETE_APPLICATION_CONFIG: String = "/appconfig/delete"
        const val PATH_GET_APPLICATION_CONFIG: String = "/appconfig/get"
        const val PATH_GET_APPLICATION_CONFIG_BY_CONFIG_VERSION: String = "/appconfig/getbyversion"
        const val PATH_SEARCH_APPLICATION_CONFIG: String = "/appconfig/search"
        const val PATH_UPDATE_APPLICATION_CONFIG: String = "/appconfig/update"
    }
}
