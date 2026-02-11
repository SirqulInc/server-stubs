package org.openapitools.api;

import org.openapitools.api.ObjectApiService;
import org.openapitools.api.factories.ObjectApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ObjectStoreResponse;

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

@Path("/object")


@io.swagger.annotations.Api(description = "the object API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ObjectApi  {
   private final ObjectApiService delegate;

   public ObjectApi(@Context ServletConfig servletContext) {
      ObjectApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ObjectApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ObjectApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = ObjectApiServiceFactory.getObjectApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/field/add")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Field", notes = "Add a field to a specific object.  The field name should be camel   case with the first letter lower case, for example: myFieldName.  Duplicate   field names are not allowed.   The field name cannot be any of the following   reserved words: ACCESSIBLE, ADD, ALL, ALTER, ANALYZE, AND, AS, ASC, ASENSITIVE,   BEFORE, BETWEEN, BIGINT, BINARY, BLOB, BOTH, BY, CALL, CASCADE, CASE, CHANGE,   CHAR, CHARACTER, CHECK, COLLATE, COLUMN, CONDITION, CONSTRAINT, CONTINUE,   CONVERT, CREATE, CROSS, CURRENT_, ATE, CURRENT_TIME, CURRENT_TIMESTAMP,   CURRENT_USER, CURSOR, DATABASE, DATABASES, DAY_HOUR, DAY_MICROSECOND, DAY_MINUTE,   DAY_SECOND, DEC, DECIMAL, DECLARE, DEFAULT, DELAYED, DELETE, DESC, DESCRIBE,   DETERMINISTIC, DISTINCT, DISTINCTROW, DIV, DOUBLE, DROP, DUAL, EACH, ELSE,   ELSEIF, ENCLOSED, ESCAPED, EXISTS, EXIT, EXPLAIN, FALSE, FETCH, FLOAT, FLOAT4,   FLOAT8, FOR, FORCE, FOREIGN, FROM, FULLTEXT, GRANT, GROUP, HAVING, HIGH_PRIORITY,   HOUR_MICROSECOND, HOUR_MINUTE, HOUR_SECOND, IF, IGNORE, IN, INDEX, INFILE,   INNER, INOUT, INSENSITIVE, INSERT, INT, INT1, INT2, INT3, INT4, INT8, INTEGER,   INTERVAL, INTO, IS, ITERATE, JOIN, KEY, KEYS, KILL, LEADING, LEAVE, LEFT,   LIKE, LIMIT, LINEAR, LINES, LOAD, LOCALTIME, LOCALTIMESTAMP, LOCK, LONG,   LONGBLOB, LONGT, XT, LOOP, LOW_PRIORITY, MASTER_SSL_VERIFY_SERVER_CERT,   MATCH, MAXVALUE, MEDIUMBLOB, MEDIUMINT, MEDIUMTEXT, MIDDLEINT, MINUTE_MICROSECOND,   MINUTE_SECOND, MOD, MODIFIES, NATURAL, NOT, NO_WRITE_TO_BINLOG, NULL, NUMERIC,   ON, OPTIMIZE, OPTION, OPTIONALLY, OR, ORDER, OUT, OUTER, OUTFILE, PRECISION,   PRIMARY, PROCEDURE, PURGE, RANGE, READ, READS, READ_WRITE, REAL, REFERENCES,   REGEXP, RELEASE, RENAME, REPEAT, REPLACE, REQUIRE, RESIGNAL, RESTRICT, RETURN,   REVOKE, RIGHT, RLIKE, SCHEMA, SCHEMAS, SECOND_MICROSECOND, SELECT, SENSITIVE,   SEPARATOR, SET, SHOW, SIGNAL, SMALLINT, SPATIAL, SPECIFIC, SQL, SQLEXCEPTION,   SQLSTATE, SQLWARNING, SQL_BIG_RESULT, SQL_CALC_FOUND_ROWS, SQL_SMALL_RESULT,   SSL, STARTING, STRAIGHT_JOIN, TABLE, TERMINATED, THEN, TINYBLOB, TINYINT,   TINYTEXT, TO, TRAILING, TRIGGER, TRUE, NDO, UNION, UNIQUE, UNLOCK, UNSIGNED,   UPDATE, USAGE, USE, USING, UTC_DATE, UTC_TIME, UTC_TIMESTAMP, VALUES, VARBINARY,   VARCHAR, VARCHARACTER, VARYING, WHEN, WHERE, WHILE, WITH, WRITE, XOR, YEAR_MONTH,   ZEROFILL, GENERAL, IGNORE_SERVER_IDS, MASTER_HEARTBEAT_PERIOD, SLOW.     The following field names are reserved (cannot be used directly) and are automatically   included during object creation: ID, OBJECTID, CREATED, UPDATED, DELETED.   Additionally the field names must start with a letter or number.", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class)
    })
    public Response addField(@ApiParam(value = "The account id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The application key for updating an existing application", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The name of the object to add the field to", required = true) @QueryParam("objectName") @NotNull  String objectName,@ApiParam(value = "field name The name of the field to add.", required = true) @QueryParam("fieldName") @NotNull  String fieldName,@ApiParam(value = "field type The field type to create, supported types are: STRING, DATE, NUMBER, BOOLEAN, IDENTITY", required = true) @QueryParam("fieldType") @NotNull  String fieldType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addField(accountId, appKey, objectName, fieldName, fieldType, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/data/{objectName}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Data", notes = "Create a record for the specified object.  If the object does not exist then a new one will be created prior to inserting the record.  If any of the fields included does not exist for the object then they are added to the object. ", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class)
    })
    public Response createData(@ApiParam(value = "the name of the object to create data for", required = true) @PathParam("objectName") @NotNull  String objectName,@ApiParam(value = "the account id") @QueryParam("accountId")  Long accountId,@ApiParam(value = "")  String body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createData(objectName, accountId, body, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Object", notes = "Create an Object Store table.  By default tables will have the columns: id, created, updated, deleted.  Names og objects should be camel case with the first letter capitalized, for example: MyTableName.   Duplicate object names are not allowed.   The object name cannot be any of the following reserved words: ACCESSIBLE, ADD, ALL, ALTER, ANALYZE, AND, AS, ASC, ASENSITIVE, BEFORE, BETWEEN, BIGINT, BINARY, BLOB, BOTH, BY, CALL, CASCADE, CASE, CHANGE, CHAR, CHARACTER, CHECK, COLLATE, COLUMN, CONDITION, CONSTRAINT, CONTINUE, CONVERT, CREATE, CROSS, CURRENT_, ATE, CURRENT_TIME, CURRENT_TIMESTAMP, CURRENT_USER, CURSOR, DATABASE, DATABASES, DAY_HOUR, DAY_MICROSECOND, DAY_MINUTE, DAY_SECOND, DEC, DECIMAL, DECLARE, DEFAULT, DELAYED, DELETE, DESC, DESCRIBE, DETERMINISTIC, DISTINCT, DISTINCTROW, DIV, DOUBLE, DROP, DUAL, EACH, ELSE, ELSEIF, ENCLOSED, ESCAPED, EXISTS, EXIT, EXPLAIN, FALSE, FETCH, FLOAT, FLOAT4, FLOAT8, FOR, FORCE, FOREIGN, FROM, FULLTEXT, GRANT, GROUP, HAVING, HIGH_PRIORITY, HOUR_MICROSECOND, HOUR_MINUTE, HOUR_SECOND, IF, IGNORE, IN, INDEX, INFILE, INNER, INOUT, INSENSITIVE, INSERT, INT, INT1, INT2, INT3, INT4, INT8, INTEGER, INTERVAL, INTO, IS, ITERATE, JOIN, KEY, KEYS, KILL, LEADING, LEAVE, LEFT, LIKE, LIMIT, LINEAR, LINES, LOAD, LOCALTIME, LOCALTIMESTAMP, LOCK, LONG, LONGBLOB, LONGT, XT, LOOP, LOW_PRIORITY, MASTER_SSL_VERIFY_SERVER_CERT, MATCH, MAXVALUE, MEDIUMBLOB, MEDIUMINT, MEDIUMTEXT, MIDDLEINT, MINUTE_MICROSECOND, MINUTE_SECOND, MOD, MODIFIES, NATURAL, NOT, NO_WRITE_TO_BINLOG, NULL, NUMERIC, ON, OPTIMIZE, OPTION, OPTIONALLY, OR, ORDER, OUT, OUTER, OUTFILE, PRECISION, PRIMARY, PROCEDURE, PURGE, RANGE, READ, READS, READ_WRITE, REAL, REFERENCES, REGEXP, RELEASE, RENAME, REPEAT, REPLACE, REQUIRE, RESIGNAL, RESTRICT, RETURN, REVOKE, RIGHT, RLIKE, SCHEMA, SCHEMAS, SECOND_MICROSECOND, SELECT, SENSITIVE, SEPARATOR, SET, SHOW, SIGNAL, SMALLINT, SPATIAL, SPECIFIC, SQL, SQLEXCEPTION, SQLSTATE, SQLWARNING, SQL_BIG_RESULT, SQL_CALC_FOUND_ROWS, SQL_SMALL_RESULT, SSL, STARTING, STRAIGHT_JOIN, TABLE, TERMINATED, THEN, TINYBLOB, TINYINT, TINYTEXT, TO, TRAILING, TRIGGER, TRUE, NDO, UNION, UNIQUE, UNLOCK, UNSIGNED, UPDATE, USAGE, USE, USING, UTC_DATE, UTC_TIME, UTC_TIMESTAMP, VALUES, VARBINARY, VARCHAR, VARCHARACTER, VARYING, WHEN, WHERE, WHILE, WITH, WRITE, XOR, YEAR_MONTH, ZEROFILL, GENERAL, IGNORE_SERVER_IDS, MASTER_HEARTBEAT_PERIOD, SLOW. ", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class)
    })
    public Response createObject(@ApiParam(value = "The account id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The application key for updating an existing application", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The name of the object to create", required = true) @QueryParam("objectName") @NotNull  String objectName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createObject(accountId, appKey, objectName, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/data/{objectName}/{objectId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Data", notes = "Delete a record for the specified object. Cannot be undone so use only when abolutely sure.", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class)
    })
    public Response deleteData(@ApiParam(value = "The name of the object to search upon", required = true) @PathParam("objectName") @NotNull  String objectName,@ApiParam(value = "objectId The id of the record to return", required = true) @PathParam("objectId") @NotNull  String objectId,@ApiParam(value = "The account id of the logged in user") @QueryParam("accountId")  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteData(objectName, objectId, accountId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/field/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Field", notes = "Delete a field from an object.  This will remove the field, indexes,   and foreign keys associated with the field.   The following field names   are reserved and cannot be removed from the object: ID, OBJECTID, CREATED,   UPDATED, DELETED", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class)
    })
    public Response deleteField(@ApiParam(value = "The account id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The application key for updating an existing application", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The name of the object to remove the field from", required = true) @QueryParam("objectName") @NotNull  String objectName,@ApiParam(value = "field name The name of the field to remove.", required = true) @QueryParam("fieldName") @NotNull  String fieldName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteField(accountId, appKey, objectName, fieldName, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Object", notes = "Delete and Object in the store.  This will delete the table and clean up and foreign keys referencing it. Cannot be undone so use only when abolutely sure.", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class)
    })
    public Response deleteObject(@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "the name of the object to delete", required = true) @QueryParam("objectName") @NotNull  String objectName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteObject(accountId, appKey, objectName, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/data/{objectName}/{objectId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Data", notes = "Get a specific record from a specified object.", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class)
    })
    public Response getData(@ApiParam(value = "The name of the object to search upon", required = true) @PathParam("objectName") @NotNull  String objectName,@ApiParam(value = "objectId The id of the record to return", required = true) @PathParam("objectId") @NotNull  String objectId,@ApiParam(value = "The account id of the logged in user") @QueryParam("accountId")  Long accountId,@ApiParam(value = "") @QueryParam("include")  String include,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getData(objectName, objectId, accountId, include, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Object", notes = "Get the definition of an Object. Returns all field names, types, and current size. The types supported are: STRING, DATE, NUMBER, BOOLEAN, IDENTITY.", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class)
    })
    public Response getObject(@ApiParam(value = "The account id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The application key for updating an existing application", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The name of the object to get the definition for", required = true) @QueryParam("objectName") @NotNull  String objectName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getObject(accountId, appKey, objectName, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/data/{objectName}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Data", notes = "Search for records given the specified criteria.  The criteria is a defined set of json values used to build a query", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class)
    })
    public Response searchData(@ApiParam(value = "The name of the object to search upon", required = true) @PathParam("objectName") @NotNull  String objectName,@ApiParam(value = "If true just return the record count of the search. False (default) will return the actual records", required = true) @QueryParam("count") @NotNull  Boolean count,@ApiParam(value = "The start of the pagination", required = true) @QueryParam("start") @NotNull  Long start,@ApiParam(value = "The limit of the pagination", required = true) @QueryParam("limit") @NotNull  Long limit,@ApiParam(value = "The account id of the logged in user") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The search criteria") @QueryParam("criteria")  String criteria,@ApiParam(value = "The order of results; comma seperated list of field names. Illegal field names will be ignored. Direction by defualt is ascending. Prepend a minus to the field name to make that field descending.") @QueryParam("order")  String order,@ApiParam(value = "") @QueryParam("include")  String include,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchData(objectName, count, start, limit, accountId, criteria, order, include, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Objects", notes = "Search for Objects and return the list of names found.  Use this in conjunction with the object get service to present the current data model defined.", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class)
    })
    public Response searchObject(@ApiParam(value = "The account id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The application key for updating an existing application", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The start of the pagination", required = true) @QueryParam("start") @NotNull  Long start,@ApiParam(value = "The limit of the pagination", required = true) @QueryParam("limit") @NotNull  Long limit,@ApiParam(value = "The name of the object(s) to search for, can be a partial match") @QueryParam("keyword")  String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchObject(accountId, appKey, start, limit, keyword, securityContext);
    }
    @javax.ws.rs.PUT
    @Path("/data/{objectName}/{objectId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Data", notes = "Update a record for the specified object.  If the object does not exist the request will be rejected, use the data create service for the first entry. If any of the fields included does not exist for the object then they are added to the object.", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class)
    })
    public Response updateData(@ApiParam(value = "The name of the object to search upon", required = true) @PathParam("objectName") @NotNull  String objectName,@ApiParam(value = "objectId The id of the record to return", required = true) @PathParam("objectId") @NotNull  String objectId,@ApiParam(value = "The account id of the logged in user") @QueryParam("accountId")  Long accountId,@ApiParam(value = "")  String body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateData(objectName, objectId, accountId, body, securityContext);
    }
}
