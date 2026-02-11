package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ObjectApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ObjectStoreResponse;

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

@Path("/object")


@io.swagger.annotations.Api(description = "the object API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ObjectApi  {

    @Inject ObjectApiService service;

    @POST
    @Path("/field/add")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Field", notes = "Add a field to a specific object.  The field name should be camel   case with the first letter lower case, for example: myFieldName.  Duplicate   field names are not allowed.   The field name cannot be any of the following   reserved words: ACCESSIBLE, ADD, ALL, ALTER, ANALYZE, AND, AS, ASC, ASENSITIVE,   BEFORE, BETWEEN, BIGINT, BINARY, BLOB, BOTH, BY, CALL, CASCADE, CASE, CHANGE,   CHAR, CHARACTER, CHECK, COLLATE, COLUMN, CONDITION, CONSTRAINT, CONTINUE,   CONVERT, CREATE, CROSS, CURRENT_, ATE, CURRENT_TIME, CURRENT_TIMESTAMP,   CURRENT_USER, CURSOR, DATABASE, DATABASES, DAY_HOUR, DAY_MICROSECOND, DAY_MINUTE,   DAY_SECOND, DEC, DECIMAL, DECLARE, DEFAULT, DELAYED, DELETE, DESC, DESCRIBE,   DETERMINISTIC, DISTINCT, DISTINCTROW, DIV, DOUBLE, DROP, DUAL, EACH, ELSE,   ELSEIF, ENCLOSED, ESCAPED, EXISTS, EXIT, EXPLAIN, FALSE, FETCH, FLOAT, FLOAT4,   FLOAT8, FOR, FORCE, FOREIGN, FROM, FULLTEXT, GRANT, GROUP, HAVING, HIGH_PRIORITY,   HOUR_MICROSECOND, HOUR_MINUTE, HOUR_SECOND, IF, IGNORE, IN, INDEX, INFILE,   INNER, INOUT, INSENSITIVE, INSERT, INT, INT1, INT2, INT3, INT4, INT8, INTEGER,   INTERVAL, INTO, IS, ITERATE, JOIN, KEY, KEYS, KILL, LEADING, LEAVE, LEFT,   LIKE, LIMIT, LINEAR, LINES, LOAD, LOCALTIME, LOCALTIMESTAMP, LOCK, LONG,   LONGBLOB, LONGT, XT, LOOP, LOW_PRIORITY, MASTER_SSL_VERIFY_SERVER_CERT,   MATCH, MAXVALUE, MEDIUMBLOB, MEDIUMINT, MEDIUMTEXT, MIDDLEINT, MINUTE_MICROSECOND,   MINUTE_SECOND, MOD, MODIFIES, NATURAL, NOT, NO_WRITE_TO_BINLOG, NULL, NUMERIC,   ON, OPTIMIZE, OPTION, OPTIONALLY, OR, ORDER, OUT, OUTER, OUTFILE, PRECISION,   PRIMARY, PROCEDURE, PURGE, RANGE, READ, READS, READ_WRITE, REAL, REFERENCES,   REGEXP, RELEASE, RENAME, REPEAT, REPLACE, REQUIRE, RESIGNAL, RESTRICT, RETURN,   REVOKE, RIGHT, RLIKE, SCHEMA, SCHEMAS, SECOND_MICROSECOND, SELECT, SENSITIVE,   SEPARATOR, SET, SHOW, SIGNAL, SMALLINT, SPATIAL, SPECIFIC, SQL, SQLEXCEPTION,   SQLSTATE, SQLWARNING, SQL_BIG_RESULT, SQL_CALC_FOUND_ROWS, SQL_SMALL_RESULT,   SSL, STARTING, STRAIGHT_JOIN, TABLE, TERMINATED, THEN, TINYBLOB, TINYINT,   TINYTEXT, TO, TRAILING, TRIGGER, TRUE, NDO, UNION, UNIQUE, UNLOCK, UNSIGNED,   UPDATE, USAGE, USE, USING, UTC_DATE, UTC_TIME, UTC_TIMESTAMP, VALUES, VARBINARY,   VARCHAR, VARCHARACTER, VARYING, WHEN, WHERE, WHILE, WITH, WRITE, XOR, YEAR_MONTH,   ZEROFILL, GENERAL, IGNORE_SERVER_IDS, MASTER_HEARTBEAT_PERIOD, SLOW.     The following field names are reserved (cannot be used directly) and are automatically   included during object creation: ID, OBJECTID, CREATED, UPDATED, DELETED.   Additionally the field names must start with a letter or number.", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class) })
    public Response addField( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("objectName") String objectName, @NotNull @QueryParam("fieldName") String fieldName, @NotNull @QueryParam("fieldType") String fieldType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addField(accountId,appKey,objectName,fieldName,fieldType,securityContext);
    }
    @POST
    @Path("/data/{objectName}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Data", notes = "Create a record for the specified object.  If the object does not exist then a new one will be created prior to inserting the record.  If any of the fields included does not exist for the object then they are added to the object. ", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class) })
    public Response createData( @PathParam("objectName") String objectName, @QueryParam("accountId") Long accountId,@ApiParam(value = "" ) @Valid String body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createData(objectName,accountId,body,securityContext);
    }
    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Object", notes = "Create an Object Store table.  By default tables will have the columns: id, created, updated, deleted.  Names og objects should be camel case with the first letter capitalized, for example: MyTableName.   Duplicate object names are not allowed.   The object name cannot be any of the following reserved words: ACCESSIBLE, ADD, ALL, ALTER, ANALYZE, AND, AS, ASC, ASENSITIVE, BEFORE, BETWEEN, BIGINT, BINARY, BLOB, BOTH, BY, CALL, CASCADE, CASE, CHANGE, CHAR, CHARACTER, CHECK, COLLATE, COLUMN, CONDITION, CONSTRAINT, CONTINUE, CONVERT, CREATE, CROSS, CURRENT_, ATE, CURRENT_TIME, CURRENT_TIMESTAMP, CURRENT_USER, CURSOR, DATABASE, DATABASES, DAY_HOUR, DAY_MICROSECOND, DAY_MINUTE, DAY_SECOND, DEC, DECIMAL, DECLARE, DEFAULT, DELAYED, DELETE, DESC, DESCRIBE, DETERMINISTIC, DISTINCT, DISTINCTROW, DIV, DOUBLE, DROP, DUAL, EACH, ELSE, ELSEIF, ENCLOSED, ESCAPED, EXISTS, EXIT, EXPLAIN, FALSE, FETCH, FLOAT, FLOAT4, FLOAT8, FOR, FORCE, FOREIGN, FROM, FULLTEXT, GRANT, GROUP, HAVING, HIGH_PRIORITY, HOUR_MICROSECOND, HOUR_MINUTE, HOUR_SECOND, IF, IGNORE, IN, INDEX, INFILE, INNER, INOUT, INSENSITIVE, INSERT, INT, INT1, INT2, INT3, INT4, INT8, INTEGER, INTERVAL, INTO, IS, ITERATE, JOIN, KEY, KEYS, KILL, LEADING, LEAVE, LEFT, LIKE, LIMIT, LINEAR, LINES, LOAD, LOCALTIME, LOCALTIMESTAMP, LOCK, LONG, LONGBLOB, LONGT, XT, LOOP, LOW_PRIORITY, MASTER_SSL_VERIFY_SERVER_CERT, MATCH, MAXVALUE, MEDIUMBLOB, MEDIUMINT, MEDIUMTEXT, MIDDLEINT, MINUTE_MICROSECOND, MINUTE_SECOND, MOD, MODIFIES, NATURAL, NOT, NO_WRITE_TO_BINLOG, NULL, NUMERIC, ON, OPTIMIZE, OPTION, OPTIONALLY, OR, ORDER, OUT, OUTER, OUTFILE, PRECISION, PRIMARY, PROCEDURE, PURGE, RANGE, READ, READS, READ_WRITE, REAL, REFERENCES, REGEXP, RELEASE, RENAME, REPEAT, REPLACE, REQUIRE, RESIGNAL, RESTRICT, RETURN, REVOKE, RIGHT, RLIKE, SCHEMA, SCHEMAS, SECOND_MICROSECOND, SELECT, SENSITIVE, SEPARATOR, SET, SHOW, SIGNAL, SMALLINT, SPATIAL, SPECIFIC, SQL, SQLEXCEPTION, SQLSTATE, SQLWARNING, SQL_BIG_RESULT, SQL_CALC_FOUND_ROWS, SQL_SMALL_RESULT, SSL, STARTING, STRAIGHT_JOIN, TABLE, TERMINATED, THEN, TINYBLOB, TINYINT, TINYTEXT, TO, TRAILING, TRIGGER, TRUE, NDO, UNION, UNIQUE, UNLOCK, UNSIGNED, UPDATE, USAGE, USE, USING, UTC_DATE, UTC_TIME, UTC_TIMESTAMP, VALUES, VARBINARY, VARCHAR, VARCHARACTER, VARYING, WHEN, WHERE, WHILE, WITH, WRITE, XOR, YEAR_MONTH, ZEROFILL, GENERAL, IGNORE_SERVER_IDS, MASTER_HEARTBEAT_PERIOD, SLOW. ", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class) })
    public Response createObject( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("objectName") String objectName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createObject(accountId,appKey,objectName,securityContext);
    }
    @DELETE
    @Path("/data/{objectName}/{objectId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Data", notes = "Delete a record for the specified object. Cannot be undone so use only when abolutely sure.", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class) })
    public Response deleteData( @PathParam("objectName") String objectName, @PathParam("objectId") String objectId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteData(objectName,objectId,accountId,securityContext);
    }
    @POST
    @Path("/field/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Field", notes = "Delete a field from an object.  This will remove the field, indexes,   and foreign keys associated with the field.   The following field names   are reserved and cannot be removed from the object: ID, OBJECTID, CREATED,   UPDATED, DELETED", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class) })
    public Response deleteField( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("objectName") String objectName, @NotNull @QueryParam("fieldName") String fieldName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteField(accountId,appKey,objectName,fieldName,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Object", notes = "Delete and Object in the store.  This will delete the table and clean up and foreign keys referencing it. Cannot be undone so use only when abolutely sure.", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class) })
    public Response deleteObject( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("objectName") String objectName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteObject(accountId,appKey,objectName,securityContext);
    }
    @GET
    @Path("/data/{objectName}/{objectId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Data", notes = "Get a specific record from a specified object.", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class) })
    public Response getData( @PathParam("objectName") String objectName, @PathParam("objectId") String objectId, @QueryParam("accountId") Long accountId, @QueryParam("include") String include,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getData(objectName,objectId,accountId,include,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Object", notes = "Get the definition of an Object. Returns all field names, types, and current size. The types supported are: STRING, DATE, NUMBER, BOOLEAN, IDENTITY.", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class) })
    public Response getObject( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("objectName") String objectName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getObject(accountId,appKey,objectName,securityContext);
    }
    @GET
    @Path("/data/{objectName}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Data", notes = "Search for records given the specified criteria.  The criteria is a defined set of json values used to build a query", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class) })
    public Response searchData( @PathParam("objectName") String objectName, @NotNull @QueryParam("count") Boolean count, @NotNull @QueryParam("start") Long start, @NotNull @QueryParam("limit") Long limit, @QueryParam("accountId") Long accountId, @QueryParam("criteria") String criteria, @QueryParam("order") String order, @QueryParam("include") String include,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchData(objectName,count,start,limit,accountId,criteria,order,include,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Objects", notes = "Search for Objects and return the list of names found.  Use this in conjunction with the object get service to present the current data model defined.", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class) })
    public Response searchObject( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("start") Long start, @NotNull @QueryParam("limit") Long limit, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchObject(accountId,appKey,start,limit,keyword,securityContext);
    }
    @PUT
    @Path("/data/{objectName}/{objectId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Data", notes = "Update a record for the specified object.  If the object does not exist the request will be rejected, use the data create service for the first entry. If any of the fields included does not exist for the object then they are added to the object.", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class) })
    public Response updateData( @PathParam("objectName") String objectName, @PathParam("objectId") String objectId, @QueryParam("accountId") Long accountId,@ApiParam(value = "" ) @Valid String body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateData(objectName,objectId,accountId,body,securityContext);
    }
}
