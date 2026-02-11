package org.openapitools.api

import org.openapitools.model.ObjectStoreResponse
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
class ObjectApiController() {

    @Operation(
        summary = "Create Field",
        operationId = "addField",
        description = """Add a field to a specific object.  The field name should be camel   case with the first letter lower case, for example: myFieldName.

Duplicate   field names are not allowed. 

The field name cannot be any of the following   reserved words: ACCESSIBLE, ADD, ALL, ALTER, ANALYZE, AND, AS, ASC, ASENSITIVE,   BEFORE, BETWEEN, BIGINT, BINARY, BLOB, BOTH, BY, CALL, CASCADE, CASE, CHANGE,   CHAR, CHARACTER, CHECK, COLLATE, COLUMN, CONDITION, CONSTRAINT, CONTINUE,   CONVERT, CREATE, CROSS, CURRENT_, ATE, CURRENT_TIME, CURRENT_TIMESTAMP,   CURRENT_USER, CURSOR, DATABASE, DATABASES, DAY_HOUR, DAY_MICROSECOND, DAY_MINUTE,   DAY_SECOND, DEC, DECIMAL, DECLARE, DEFAULT, DELAYED, DELETE, DESC, DESCRIBE,   DETERMINISTIC, DISTINCT, DISTINCTROW, DIV, DOUBLE, DROP, DUAL, EACH, ELSE,   ELSEIF, ENCLOSED, ESCAPED, EXISTS, EXIT, EXPLAIN, FALSE, FETCH, FLOAT, FLOAT4,   FLOAT8, FOR, FORCE, FOREIGN, FROM, FULLTEXT, GRANT, GROUP, HAVING, HIGH_PRIORITY,   HOUR_MICROSECOND, HOUR_MINUTE, HOUR_SECOND, IF, IGNORE, IN, INDEX, INFILE,   INNER, INOUT, INSENSITIVE, INSERT, INT, INT1, INT2, INT3, INT4, INT8, INTEGER,   INTERVAL, INTO, IS, ITERATE, JOIN, KEY, KEYS, KILL, LEADING, LEAVE, LEFT,   LIKE, LIMIT, LINEAR, LINES, LOAD, LOCALTIME, LOCALTIMESTAMP, LOCK, LONG,   LONGBLOB, LONGT, XT, LOOP, LOW_PRIORITY, MASTER_SSL_VERIFY_SERVER_CERT,   MATCH, MAXVALUE, MEDIUMBLOB, MEDIUMINT, MEDIUMTEXT, MIDDLEINT, MINUTE_MICROSECOND,   MINUTE_SECOND, MOD, MODIFIES, NATURAL, NOT, NO_WRITE_TO_BINLOG, NULL, NUMERIC,   ON, OPTIMIZE, OPTION, OPTIONALLY, OR, ORDER, OUT, OUTER, OUTFILE, PRECISION,   PRIMARY, PROCEDURE, PURGE, RANGE, READ, READS, READ_WRITE, REAL, REFERENCES,   REGEXP, RELEASE, RENAME, REPEAT, REPLACE, REQUIRE, RESIGNAL, RESTRICT, RETURN,   REVOKE, RIGHT, RLIKE, SCHEMA, SCHEMAS, SECOND_MICROSECOND, SELECT, SENSITIVE,   SEPARATOR, SET, SHOW, SIGNAL, SMALLINT, SPATIAL, SPECIFIC, SQL, SQLEXCEPTION,   SQLSTATE, SQLWARNING, SQL_BIG_RESULT, SQL_CALC_FOUND_ROWS, SQL_SMALL_RESULT,   SSL, STARTING, STRAIGHT_JOIN, TABLE, TERMINATED, THEN, TINYBLOB, TINYINT,   TINYTEXT, TO, TRAILING, TRIGGER, TRUE, NDO, UNION, UNIQUE, UNLOCK, UNSIGNED,   UPDATE, USAGE, USE, USING, UTC_DATE, UTC_TIME, UTC_TIMESTAMP, VALUES, VARBINARY,   VARCHAR, VARCHARACTER, VARYING, WHEN, WHERE, WHILE, WITH, WRITE, XOR, YEAR_MONTH,   ZEROFILL, GENERAL, IGNORE_SERVER_IDS, MASTER_HEARTBEAT_PERIOD, SLOW. 

  The following field names are reserved (cannot be used directly) and are automatically   included during object creation: ID, OBJECTID, CREATED, UPDATED, DELETED.   Additionally the field names must start with a letter or number.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ObjectStoreResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/object/field/add"
        value = [PATH_ADD_FIELD],
        produces = ["*/*"]
    )
    fun addField(
        @NotNull @Parameter(description = "The account id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The application key for updating an existing application", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "The name of the object to add the field to", required = true) @Valid @RequestParam(value = "objectName", required = true) objectName: kotlin.String,
        @NotNull @Parameter(description = "field name The name of the field to add.", required = true) @Valid @RequestParam(value = "fieldName", required = true) fieldName: kotlin.String,
        @NotNull @Parameter(description = "field type The field type to create, supported types are: STRING, DATE, NUMBER, BOOLEAN, IDENTITY", required = true) @Valid @RequestParam(value = "fieldType", required = true) fieldType: kotlin.String
    ): ResponseEntity<ObjectStoreResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Data",
        operationId = "createData",
        description = """Create a record for the specified object.  If the object does not exist then a new one will be created prior to inserting the record.  If any of the fields included does not exist for the object then they are added to the object. """,
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ObjectStoreResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/object/data/{objectName}"
        value = [PATH_CREATE_DATA],
        produces = ["*/*"]
    )
    fun createData(
        @Parameter(description = "the name of the object to create data for", required = true) @PathVariable("objectName") objectName: kotlin.String,
        @Parameter(description = "the account id") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: kotlin.String?
    ): ResponseEntity<ObjectStoreResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Object",
        operationId = "createObject",
        description = """Create an Object Store table.  By default tables will have the columns: id, created, updated, deleted.  Names og objects should be camel case with the first letter capitalized, for example: MyTableName. 

Duplicate object names are not allowed. 

The object name cannot be any of the following reserved words: ACCESSIBLE, ADD, ALL, ALTER, ANALYZE, AND, AS, ASC, ASENSITIVE, BEFORE, BETWEEN, BIGINT, BINARY, BLOB, BOTH, BY, CALL, CASCADE, CASE, CHANGE, CHAR, CHARACTER, CHECK, COLLATE, COLUMN, CONDITION, CONSTRAINT, CONTINUE, CONVERT, CREATE, CROSS, CURRENT_, ATE, CURRENT_TIME, CURRENT_TIMESTAMP, CURRENT_USER, CURSOR, DATABASE, DATABASES, DAY_HOUR, DAY_MICROSECOND, DAY_MINUTE, DAY_SECOND, DEC, DECIMAL, DECLARE, DEFAULT, DELAYED, DELETE, DESC, DESCRIBE, DETERMINISTIC, DISTINCT, DISTINCTROW, DIV, DOUBLE, DROP, DUAL, EACH, ELSE, ELSEIF, ENCLOSED, ESCAPED, EXISTS, EXIT, EXPLAIN, FALSE, FETCH, FLOAT, FLOAT4, FLOAT8, FOR, FORCE, FOREIGN, FROM, FULLTEXT, GRANT, GROUP, HAVING, HIGH_PRIORITY, HOUR_MICROSECOND, HOUR_MINUTE, HOUR_SECOND, IF, IGNORE, IN, INDEX, INFILE, INNER, INOUT, INSENSITIVE, INSERT, INT, INT1, INT2, INT3, INT4, INT8, INTEGER, INTERVAL, INTO, IS, ITERATE, JOIN, KEY, KEYS, KILL, LEADING, LEAVE, LEFT, LIKE, LIMIT, LINEAR, LINES, LOAD, LOCALTIME, LOCALTIMESTAMP, LOCK, LONG, LONGBLOB, LONGT, XT, LOOP, LOW_PRIORITY, MASTER_SSL_VERIFY_SERVER_CERT, MATCH, MAXVALUE, MEDIUMBLOB, MEDIUMINT, MEDIUMTEXT, MIDDLEINT, MINUTE_MICROSECOND, MINUTE_SECOND, MOD, MODIFIES, NATURAL, NOT, NO_WRITE_TO_BINLOG, NULL, NUMERIC, ON, OPTIMIZE, OPTION, OPTIONALLY, OR, ORDER, OUT, OUTER, OUTFILE, PRECISION, PRIMARY, PROCEDURE, PURGE, RANGE, READ, READS, READ_WRITE, REAL, REFERENCES, REGEXP, RELEASE, RENAME, REPEAT, REPLACE, REQUIRE, RESIGNAL, RESTRICT, RETURN, REVOKE, RIGHT, RLIKE, SCHEMA, SCHEMAS, SECOND_MICROSECOND, SELECT, SENSITIVE, SEPARATOR, SET, SHOW, SIGNAL, SMALLINT, SPATIAL, SPECIFIC, SQL, SQLEXCEPTION, SQLSTATE, SQLWARNING, SQL_BIG_RESULT, SQL_CALC_FOUND_ROWS, SQL_SMALL_RESULT, SSL, STARTING, STRAIGHT_JOIN, TABLE, TERMINATED, THEN, TINYBLOB, TINYINT, TINYTEXT, TO, TRAILING, TRIGGER, TRUE, NDO, UNION, UNIQUE, UNLOCK, UNSIGNED, UPDATE, USAGE, USE, USING, UTC_DATE, UTC_TIME, UTC_TIMESTAMP, VALUES, VARBINARY, VARCHAR, VARCHARACTER, VARYING, WHEN, WHERE, WHILE, WITH, WRITE, XOR, YEAR_MONTH, ZEROFILL, GENERAL, IGNORE_SERVER_IDS, MASTER_HEARTBEAT_PERIOD, SLOW. """,
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ObjectStoreResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/object/create"
        value = [PATH_CREATE_OBJECT],
        produces = ["*/*"]
    )
    fun createObject(
        @NotNull @Parameter(description = "The account id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The application key for updating an existing application", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "The name of the object to create", required = true) @Valid @RequestParam(value = "objectName", required = true) objectName: kotlin.String
    ): ResponseEntity<ObjectStoreResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Data",
        operationId = "deleteData",
        description = """Delete a record for the specified object. Cannot be undone so use only when abolutely sure.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ObjectStoreResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/object/data/{objectName}/{objectId}"
        value = [PATH_DELETE_DATA],
        produces = ["*/*"]
    )
    fun deleteData(
        @Parameter(description = "The name of the object to search upon", required = true) @PathVariable("objectName") objectName: kotlin.String,
        @Parameter(description = "objectId The id of the record to return", required = true) @PathVariable("objectId") objectId: kotlin.String,
        @Parameter(description = "The account id of the logged in user") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<ObjectStoreResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Field",
        operationId = "deleteField",
        description = """Delete a field from an object.  This will remove the field, indexes,   and foreign keys associated with the field. 

The following field names   are reserved and cannot be removed from the object: ID, OBJECTID, CREATED,   UPDATED, DELETED""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ObjectStoreResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/object/field/delete"
        value = [PATH_DELETE_FIELD],
        produces = ["*/*"]
    )
    fun deleteField(
        @NotNull @Parameter(description = "The account id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The application key for updating an existing application", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "The name of the object to remove the field from", required = true) @Valid @RequestParam(value = "objectName", required = true) objectName: kotlin.String,
        @NotNull @Parameter(description = "field name The name of the field to remove.", required = true) @Valid @RequestParam(value = "fieldName", required = true) fieldName: kotlin.String
    ): ResponseEntity<ObjectStoreResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Object",
        operationId = "deleteObject",
        description = """Delete and Object in the store.  This will delete the table and clean up and foreign keys referencing it. Cannot be undone so use only when abolutely sure.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ObjectStoreResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/object/delete"
        value = [PATH_DELETE_OBJECT],
        produces = ["*/*"]
    )
    fun deleteObject(
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "the name of the object to delete", required = true) @Valid @RequestParam(value = "objectName", required = true) objectName: kotlin.String
    ): ResponseEntity<ObjectStoreResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Data",
        operationId = "getData",
        description = """Get a specific record from a specified object.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ObjectStoreResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/object/data/{objectName}/{objectId}"
        value = [PATH_GET_DATA],
        produces = ["*/*"]
    )
    fun getData(
        @Parameter(description = "The name of the object to search upon", required = true) @PathVariable("objectName") objectName: kotlin.String,
        @Parameter(description = "objectId The id of the record to return", required = true) @PathVariable("objectId") objectId: kotlin.String,
        @Parameter(description = "The account id of the logged in user") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "") @Valid @RequestParam(value = "include", required = false) include: kotlin.String?
    ): ResponseEntity<ObjectStoreResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Object",
        operationId = "getObject",
        description = """Get the definition of an Object. Returns all field names, types, and current size. The types supported are: STRING, DATE, NUMBER, BOOLEAN, IDENTITY.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ObjectStoreResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/object/get"
        value = [PATH_GET_OBJECT],
        produces = ["*/*"]
    )
    fun getObject(
        @NotNull @Parameter(description = "The account id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The application key for updating an existing application", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "The name of the object to get the definition for", required = true) @Valid @RequestParam(value = "objectName", required = true) objectName: kotlin.String
    ): ResponseEntity<ObjectStoreResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Data",
        operationId = "searchData",
        description = """Search for records given the specified criteria.  The criteria is a defined set of json values used to build a query""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ObjectStoreResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/object/data/{objectName}"
        value = [PATH_SEARCH_DATA],
        produces = ["*/*"]
    )
    fun searchData(
        @Parameter(description = "The name of the object to search upon", required = true) @PathVariable("objectName") objectName: kotlin.String,
        @NotNull @Parameter(description = "If true just return the record count of the search. False (default) will return the actual records", required = true) @Valid @RequestParam(value = "count", required = true) count: kotlin.Boolean,
        @NotNull @Parameter(description = "The start of the pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Long,
        @NotNull @Parameter(description = "The limit of the pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Long,
        @Parameter(description = "The account id of the logged in user") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The search criteria") @Valid @RequestParam(value = "criteria", required = false) criteria: kotlin.String?,
        @Parameter(description = "The order of results; comma seperated list of field names. Illegal field names will be ignored. Direction by defualt is ascending. Prepend a minus to the field name to make that field descending.") @Valid @RequestParam(value = "order", required = false) order: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "include", required = false) include: kotlin.String?
    ): ResponseEntity<ObjectStoreResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Objects",
        operationId = "searchObject",
        description = """Search for Objects and return the list of names found.  Use this in conjunction with the object get service to present the current data model defined.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ObjectStoreResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/object/search"
        value = [PATH_SEARCH_OBJECT],
        produces = ["*/*"]
    )
    fun searchObject(
        @NotNull @Parameter(description = "The account id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The application key for updating an existing application", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "The start of the pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Long,
        @NotNull @Parameter(description = "The limit of the pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Long,
        @Parameter(description = "The name of the object(s) to search for, can be a partial match") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?
    ): ResponseEntity<ObjectStoreResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Data",
        operationId = "updateData",
        description = """Update a record for the specified object.  If the object does not exist the request will be rejected, use the data create service for the first entry. If any of the fields included does not exist for the object then they are added to the object.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ObjectStoreResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        // "/object/data/{objectName}/{objectId}"
        value = [PATH_UPDATE_DATA],
        produces = ["*/*"]
    )
    fun updateData(
        @Parameter(description = "The name of the object to search upon", required = true) @PathVariable("objectName") objectName: kotlin.String,
        @Parameter(description = "objectId The id of the record to return", required = true) @PathVariable("objectId") objectId: kotlin.String,
        @Parameter(description = "The account id of the logged in user") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: kotlin.String?
    ): ResponseEntity<ObjectStoreResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_ADD_FIELD: String = "/object/field/add"
        const val PATH_CREATE_DATA: String = "/object/data/{objectName}"
        const val PATH_CREATE_OBJECT: String = "/object/create"
        const val PATH_DELETE_DATA: String = "/object/data/{objectName}/{objectId}"
        const val PATH_DELETE_FIELD: String = "/object/field/delete"
        const val PATH_DELETE_OBJECT: String = "/object/delete"
        const val PATH_GET_DATA: String = "/object/data/{objectName}/{objectId}"
        const val PATH_GET_OBJECT: String = "/object/get"
        const val PATH_SEARCH_DATA: String = "/object/data/{objectName}"
        const val PATH_SEARCH_OBJECT: String = "/object/search"
        const val PATH_UPDATE_DATA: String = "/object/data/{objectName}/{objectId}"
    }
}
