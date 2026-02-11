package org.openapitools.api

import org.openapitools.model.QueueResponse
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
class QueueApiController() {

    @Operation(
        summary = "Create Consumer",
        operationId = "consumerCreate",
        description = """Create a connection to an existing amqp queue and register as a consumer.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = QueueResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/queue/consumer/create"
        value = [PATH_CONSUMER_CREATE],
        produces = ["*/*"]
    )
    fun consumerCreate(
        @NotNull @Parameter(description = "The application key to use when creating an analytic or service request. The account needs to have permissions to the applicaton or it will be denied.", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "The name of the queue to connect to", required = true) @Valid @RequestParam(value = "name", required = true) name: kotlin.String,
        @NotNull @Parameter(description = "The hostname of the server the queue is hosted on", required = true) @Valid @RequestParam(value = "hostname", required = true) hostname: kotlin.String,
        @NotNull @Parameter(description = "The username to access the server the queue is hosted on", required = true) @Valid @RequestParam(value = "username", required = true) username: kotlin.String,
        @NotNull @Parameter(description = "The password to access the queue to connect to", required = true) @Valid @RequestParam(value = "password", required = true) password: kotlin.String,
        @NotNull @Parameter(description = "The data mapping information in the format of AMQPRequest", required = true) @Valid @RequestParam(value = "dataMapping", required = true) dataMapping: kotlin.String,
        @Parameter(description = "The client deviceID") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The logged in user ID") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The port of the server the queue is hosted on", schema = Schema(defaultValue = "5672")) @Valid @RequestParam(value = "port", required = false, defaultValue = "5672") port: kotlin.Int,
        @Parameter(description = "The virtual host defined on the server the queue is associated on") @Valid @RequestParam(value = "virtualHost", required = false) virtualHost: kotlin.String?,
        @Parameter(description = "The exchanger of the queue to connect to") @Valid @RequestParam(value = "exchanger", required = false) exchanger: kotlin.String?,
        @Parameter(description = "The exchanger type of the queue to connect to") @Valid @RequestParam(value = "exchangerType", required = false) exchangerType: kotlin.String?,
        @Parameter(description = "The number of workers to generate ", schema = Schema(defaultValue = "1")) @Valid @RequestParam(value = "workers", required = false, defaultValue = "1") workers: kotlin.Int,
        @Parameter(description = "Use SSL") @Valid @RequestParam(value = "useSSL", required = false) useSSL: kotlin.Boolean?
    ): ResponseEntity<QueueResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Consumer",
        operationId = "consumerUpdate",
        description = """Update an existing amqp queue's data mapping.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = QueueResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/queue/consumer/update"
        value = [PATH_CONSUMER_UPDATE],
        produces = ["*/*"]
    )
    fun consumerUpdate(
        @NotNull @Parameter(description = "The application key to use when creating an analytic or service request. The account needs to have permissions to the applicaton or it will be denied.", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "The queue to update", required = true) @Valid @RequestParam(value = "queueId", required = true) queueId: kotlin.Long,
        @NotNull @Parameter(description = "The data mapping information in the format of AMQPRequest", required = true) @Valid @RequestParam(value = "dataMapping", required = true) dataMapping: kotlin.String,
        @Parameter(description = "The client deviceID") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The logged in user ID") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Use SSL") @Valid @RequestParam(value = "useSSL", required = false) useSSL: kotlin.Boolean?
    ): ResponseEntity<QueueResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Queue",
        operationId = "queueCreate",
        description = """Create a basic AMQP queue. If the username and password and virtual host is not sepcified, the queue will be created on the virtual host assigned to the application.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = QueueResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/queue/create"
        value = [PATH_QUEUE_CREATE],
        produces = ["*/*"]
    )
    fun queueCreate(
        @NotNull @Parameter(description = "The application key unique to each application.", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "The name of the queue to create", required = true) @Valid @RequestParam(value = "name", required = true) name: kotlin.String,
        @Parameter(description = "The client deviceID") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The logged in user ID") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The number of workers to generate ", schema = Schema(defaultValue = "1")) @Valid @RequestParam(value = "workers", required = false, defaultValue = "1") workers: kotlin.Int,
        @Parameter(description = "If provided the analytic processing will publsih to this queue instead of the default one for the provided list of tags") @Valid @RequestParam(value = "analyticTags", required = false) analyticTags: kotlin.String?,
        @Parameter(description = "The hostname of the server the queue is hosted on") @Valid @RequestParam(value = "hostname", required = false) hostname: kotlin.String?,
        @Parameter(description = "The port of the server the queue is hosted on") @Valid @RequestParam(value = "port", required = false) port: kotlin.Int?,
        @Parameter(description = "The username to access the server that the queue is on") @Valid @RequestParam(value = "username", required = false) username: kotlin.String?,
        @Parameter(description = "The password to access the queue to connect to") @Valid @RequestParam(value = "password", required = false) password: kotlin.String?,
        @Parameter(description = "The virtual host defined on the server to queue") @Valid @RequestParam(value = "virtualHost", required = false) virtualHost: kotlin.String?,
        @Parameter(description = "Use SSL") @Valid @RequestParam(value = "useSSL", required = false) useSSL: kotlin.Boolean?
    ): ResponseEntity<QueueResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Queue",
        operationId = "queueDelete",
        description = """Delete the stored queue record and close any active connections to the AMQP servers.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/queue/delete"
        value = [PATH_QUEUE_DELETE],
        produces = ["*/*"]
    )
    fun queueDelete(
        @NotNull @Parameter(description = "The id of the queue to find", required = true) @Valid @RequestParam(value = "queueId", required = true) queueId: kotlin.Long,
        @Parameter(description = "The client device ID") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The logged in user ID") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Queue",
        operationId = "queueGet",
        description = """Get the stored queue record. Must supply the queueId, or the name and hostname and virtualHost, or the name and appKey to find the record.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = QueueResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/queue/get"
        value = [PATH_QUEUE_GET],
        produces = ["*/*"]
    )
    fun queueGet(
        @Parameter(description = "The client device ID") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The logged in user ID") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The id of the queue to find") @Valid @RequestParam(value = "queueId", required = false) queueId: kotlin.Long?,
        @Parameter(description = "The application key the queue was assigned to") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The name of the queue to find") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "The hostname of the queue to find") @Valid @RequestParam(value = "hostname", required = false) hostname: kotlin.String?,
        @Parameter(description = "The virtual host of the queue to find") @Valid @RequestParam(value = "virtualHost", required = false) virtualHost: kotlin.String?
    ): ResponseEntity<QueueResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Publish Queue",
        operationId = "queuePublish",
        description = """Publish a message to a stored queue. Must supply the queueId, or the name and hostname and virtualHost, or the name and appKey to find the record.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/queue/publish"
        value = [PATH_QUEUE_PUBLISH],
        produces = ["*/*"]
    )
    fun queuePublish(
        @NotNull @Parameter(description = "The payload to send to the queue", required = true) @Valid @RequestParam(value = "message", required = true) message: kotlin.String,
        @Parameter(description = "The id of the queue to publish to") @Valid @RequestParam(value = "queueId", required = false) queueId: kotlin.Long?,
        @Parameter(description = "The application key the queue was assigned to") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The name of the queue to publish to or the analytic tag to handle if the analytic param is true") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "The hostname of the server the queue is hosted on") @Valid @RequestParam(value = "hostname", required = false) hostname: kotlin.String?,
        @Parameter(description = "The virtual host defined on the server to queue") @Valid @RequestParam(value = "virtualHost", required = false) virtualHost: kotlin.String?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Queue",
        operationId = "queueSearch",
        description = """Get the queues setup for the BillableEntity's applications.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = QueueResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/queue/search"
        value = [PATH_QUEUE_SEARCH],
        produces = ["*/*"]
    )
    fun queueSearch(
        @Parameter(description = "The id of the queue to find") @Valid @RequestParam(value = "queueId", required = false) queueId: kotlin.Long?,
        @Parameter(description = "The client device ID") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The logged in user ID") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The name of the queue to find") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "Start of the index", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "Limit of the index", schema = Schema(defaultValue = "10")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "10") limit: kotlin.Int
    ): ResponseEntity<QueueResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Queue",
        operationId = "queueUpdate",
        description = """Update the basic AMQP queue.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = QueueResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/queue/update"
        value = [PATH_QUEUE_UPDATE],
        produces = ["*/*"]
    )
    fun queueUpdate(
        @NotNull @Parameter(description = "The id of the queue to update", required = true) @Valid @RequestParam(value = "queueId", required = true) queueId: kotlin.Long,
        @Parameter(description = "The client deviceID") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The logged in user ID") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The application key unique to each application.") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The number of workers to generate") @Valid @RequestParam(value = "workers", required = false) workers: kotlin.Int?,
        @Parameter(description = "If provided the analytic processing will publsih to this queue instead of the default one for the provided list of tags") @Valid @RequestParam(value = "analyticTags", required = false) analyticTags: kotlin.String?,
        @Parameter(description = "The hostname of the server the queue is hosted on") @Valid @RequestParam(value = "hostname", required = false) hostname: kotlin.String?,
        @Parameter(description = "The port of the server the queue is hosted on") @Valid @RequestParam(value = "port", required = false) port: kotlin.Int?,
        @Parameter(description = "The username to access the server that the queue is on") @Valid @RequestParam(value = "username", required = false) username: kotlin.String?,
        @Parameter(description = "The password to access the queue to connect to") @Valid @RequestParam(value = "password", required = false) password: kotlin.String?,
        @Parameter(description = "The virtual host defined on the server to queue") @Valid @RequestParam(value = "virtualHost", required = false) virtualHost: kotlin.String?,
        @Parameter(description = "the SSL to use") @Valid @RequestParam(value = "useSSL", required = false) useSSL: kotlin.Boolean?
    ): ResponseEntity<QueueResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CONSUMER_CREATE: String = "/queue/consumer/create"
        const val PATH_CONSUMER_UPDATE: String = "/queue/consumer/update"
        const val PATH_QUEUE_CREATE: String = "/queue/create"
        const val PATH_QUEUE_DELETE: String = "/queue/delete"
        const val PATH_QUEUE_GET: String = "/queue/get"
        const val PATH_QUEUE_PUBLISH: String = "/queue/publish"
        const val PATH_QUEUE_SEARCH: String = "/queue/search"
        const val PATH_QUEUE_UPDATE: String = "/queue/update"
    }
}
