from typing import List, Dict
from aiohttp import web

from openapi_server.models.object_store_response import ObjectStoreResponse
from openapi_server import util


async def add_field(request: web.Request, version, account_id, app_key, object_name, field_name, field_type) -> web.Response:
    """Create Field

    Add a field to a specific object.  The field name should be camel   case with the first letter lower case, for example: myFieldName.  Duplicate   field names are not allowed.   The field name cannot be any of the following   reserved words: ACCESSIBLE, ADD, ALL, ALTER, ANALYZE, AND, AS, ASC, ASENSITIVE,   BEFORE, BETWEEN, BIGINT, BINARY, BLOB, BOTH, BY, CALL, CASCADE, CASE, CHANGE,   CHAR, CHARACTER, CHECK, COLLATE, COLUMN, CONDITION, CONSTRAINT, CONTINUE,   CONVERT, CREATE, CROSS, CURRENT_, ATE, CURRENT_TIME, CURRENT_TIMESTAMP,   CURRENT_USER, CURSOR, DATABASE, DATABASES, DAY_HOUR, DAY_MICROSECOND, DAY_MINUTE,   DAY_SECOND, DEC, DECIMAL, DECLARE, DEFAULT, DELAYED, DELETE, DESC, DESCRIBE,   DETERMINISTIC, DISTINCT, DISTINCTROW, DIV, DOUBLE, DROP, DUAL, EACH, ELSE,   ELSEIF, ENCLOSED, ESCAPED, EXISTS, EXIT, EXPLAIN, FALSE, FETCH, FLOAT, FLOAT4,   FLOAT8, FOR, FORCE, FOREIGN, FROM, FULLTEXT, GRANT, GROUP, HAVING, HIGH_PRIORITY,   HOUR_MICROSECOND, HOUR_MINUTE, HOUR_SECOND, IF, IGNORE, IN, INDEX, INFILE,   INNER, INOUT, INSENSITIVE, INSERT, INT, INT1, INT2, INT3, INT4, INT8, INTEGER,   INTERVAL, INTO, IS, ITERATE, JOIN, KEY, KEYS, KILL, LEADING, LEAVE, LEFT,   LIKE, LIMIT, LINEAR, LINES, LOAD, LOCALTIME, LOCALTIMESTAMP, LOCK, LONG,   LONGBLOB, LONGT, XT, LOOP, LOW_PRIORITY, MASTER_SSL_VERIFY_SERVER_CERT,   MATCH, MAXVALUE, MEDIUMBLOB, MEDIUMINT, MEDIUMTEXT, MIDDLEINT, MINUTE_MICROSECOND,   MINUTE_SECOND, MOD, MODIFIES, NATURAL, NOT, NO_WRITE_TO_BINLOG, NULL, NUMERIC,   ON, OPTIMIZE, OPTION, OPTIONALLY, OR, ORDER, OUT, OUTER, OUTFILE, PRECISION,   PRIMARY, PROCEDURE, PURGE, RANGE, READ, READS, READ_WRITE, REAL, REFERENCES,   REGEXP, RELEASE, RENAME, REPEAT, REPLACE, REQUIRE, RESIGNAL, RESTRICT, RETURN,   REVOKE, RIGHT, RLIKE, SCHEMA, SCHEMAS, SECOND_MICROSECOND, SELECT, SENSITIVE,   SEPARATOR, SET, SHOW, SIGNAL, SMALLINT, SPATIAL, SPECIFIC, SQL, SQLEXCEPTION,   SQLSTATE, SQLWARNING, SQL_BIG_RESULT, SQL_CALC_FOUND_ROWS, SQL_SMALL_RESULT,   SSL, STARTING, STRAIGHT_JOIN, TABLE, TERMINATED, THEN, TINYBLOB, TINYINT,   TINYTEXT, TO, TRAILING, TRIGGER, TRUE, NDO, UNION, UNIQUE, UNLOCK, UNSIGNED,   UPDATE, USAGE, USE, USING, UTC_DATE, UTC_TIME, UTC_TIMESTAMP, VALUES, VARBINARY,   VARCHAR, VARCHARACTER, VARYING, WHEN, WHERE, WHILE, WITH, WRITE, XOR, YEAR_MONTH,   ZEROFILL, GENERAL, IGNORE_SERVER_IDS, MASTER_HEARTBEAT_PERIOD, SLOW.     The following field names are reserved (cannot be used directly) and are automatically   included during object creation: ID, OBJECTID, CREATED, UPDATED, DELETED.   Additionally the field names must start with a letter or number.

    :param version: 
    :type version: 
    :param account_id: The account id of the logged in user
    :type account_id: int
    :param app_key: The application key for updating an existing application
    :type app_key: str
    :param object_name: The name of the object to add the field to
    :type object_name: str
    :param field_name: field name The name of the field to add.
    :type field_name: str
    :param field_type: field type The field type to create, supported types are: STRING, DATE, NUMBER, BOOLEAN, IDENTITY
    :type field_type: str

    """
    return web.Response(status=200)


async def create_data(request: web.Request, version, object_name, account_id=None, body=None) -> web.Response:
    """Create Data

    Create a record for the specified object.  If the object does not exist then a new one will be created prior to inserting the record.  If any of the fields included does not exist for the object then they are added to the object. 

    :param version: 
    :type version: 
    :param object_name: the name of the object to create data for
    :type object_name: str
    :param account_id: the account id
    :type account_id: int
    :param body: 
    :type body: str

    """
    return web.Response(status=200)


async def create_object(request: web.Request, version, account_id, app_key, object_name) -> web.Response:
    """Create Object

    Create an Object Store table.  By default tables will have the columns: id, created, updated, deleted.  Names og objects should be camel case with the first letter capitalized, for example: MyTableName.   Duplicate object names are not allowed.   The object name cannot be any of the following reserved words: ACCESSIBLE, ADD, ALL, ALTER, ANALYZE, AND, AS, ASC, ASENSITIVE, BEFORE, BETWEEN, BIGINT, BINARY, BLOB, BOTH, BY, CALL, CASCADE, CASE, CHANGE, CHAR, CHARACTER, CHECK, COLLATE, COLUMN, CONDITION, CONSTRAINT, CONTINUE, CONVERT, CREATE, CROSS, CURRENT_, ATE, CURRENT_TIME, CURRENT_TIMESTAMP, CURRENT_USER, CURSOR, DATABASE, DATABASES, DAY_HOUR, DAY_MICROSECOND, DAY_MINUTE, DAY_SECOND, DEC, DECIMAL, DECLARE, DEFAULT, DELAYED, DELETE, DESC, DESCRIBE, DETERMINISTIC, DISTINCT, DISTINCTROW, DIV, DOUBLE, DROP, DUAL, EACH, ELSE, ELSEIF, ENCLOSED, ESCAPED, EXISTS, EXIT, EXPLAIN, FALSE, FETCH, FLOAT, FLOAT4, FLOAT8, FOR, FORCE, FOREIGN, FROM, FULLTEXT, GRANT, GROUP, HAVING, HIGH_PRIORITY, HOUR_MICROSECOND, HOUR_MINUTE, HOUR_SECOND, IF, IGNORE, IN, INDEX, INFILE, INNER, INOUT, INSENSITIVE, INSERT, INT, INT1, INT2, INT3, INT4, INT8, INTEGER, INTERVAL, INTO, IS, ITERATE, JOIN, KEY, KEYS, KILL, LEADING, LEAVE, LEFT, LIKE, LIMIT, LINEAR, LINES, LOAD, LOCALTIME, LOCALTIMESTAMP, LOCK, LONG, LONGBLOB, LONGT, XT, LOOP, LOW_PRIORITY, MASTER_SSL_VERIFY_SERVER_CERT, MATCH, MAXVALUE, MEDIUMBLOB, MEDIUMINT, MEDIUMTEXT, MIDDLEINT, MINUTE_MICROSECOND, MINUTE_SECOND, MOD, MODIFIES, NATURAL, NOT, NO_WRITE_TO_BINLOG, NULL, NUMERIC, ON, OPTIMIZE, OPTION, OPTIONALLY, OR, ORDER, OUT, OUTER, OUTFILE, PRECISION, PRIMARY, PROCEDURE, PURGE, RANGE, READ, READS, READ_WRITE, REAL, REFERENCES, REGEXP, RELEASE, RENAME, REPEAT, REPLACE, REQUIRE, RESIGNAL, RESTRICT, RETURN, REVOKE, RIGHT, RLIKE, SCHEMA, SCHEMAS, SECOND_MICROSECOND, SELECT, SENSITIVE, SEPARATOR, SET, SHOW, SIGNAL, SMALLINT, SPATIAL, SPECIFIC, SQL, SQLEXCEPTION, SQLSTATE, SQLWARNING, SQL_BIG_RESULT, SQL_CALC_FOUND_ROWS, SQL_SMALL_RESULT, SSL, STARTING, STRAIGHT_JOIN, TABLE, TERMINATED, THEN, TINYBLOB, TINYINT, TINYTEXT, TO, TRAILING, TRIGGER, TRUE, NDO, UNION, UNIQUE, UNLOCK, UNSIGNED, UPDATE, USAGE, USE, USING, UTC_DATE, UTC_TIME, UTC_TIMESTAMP, VALUES, VARBINARY, VARCHAR, VARCHARACTER, VARYING, WHEN, WHERE, WHILE, WITH, WRITE, XOR, YEAR_MONTH, ZEROFILL, GENERAL, IGNORE_SERVER_IDS, MASTER_HEARTBEAT_PERIOD, SLOW. 

    :param version: 
    :type version: 
    :param account_id: The account id of the logged in user
    :type account_id: int
    :param app_key: The application key for updating an existing application
    :type app_key: str
    :param object_name: The name of the object to create
    :type object_name: str

    """
    return web.Response(status=200)


async def delete_data(request: web.Request, version, object_name, object_id, account_id=None) -> web.Response:
    """Delete Data

    Delete a record for the specified object. Cannot be undone so use only when abolutely sure.

    :param version: 
    :type version: 
    :param object_name: The name of the object to search upon
    :type object_name: str
    :param object_id: objectId The id of the record to return
    :type object_id: str
    :param account_id: The account id of the logged in user
    :type account_id: int

    """
    return web.Response(status=200)


async def delete_field(request: web.Request, version, account_id, app_key, object_name, field_name) -> web.Response:
    """Delete Field

    Delete a field from an object.  This will remove the field, indexes,   and foreign keys associated with the field.   The following field names   are reserved and cannot be removed from the object: ID, OBJECTID, CREATED,   UPDATED, DELETED

    :param version: 
    :type version: 
    :param account_id: The account id of the logged in user
    :type account_id: int
    :param app_key: The application key for updating an existing application
    :type app_key: str
    :param object_name: The name of the object to remove the field from
    :type object_name: str
    :param field_name: field name The name of the field to remove.
    :type field_name: str

    """
    return web.Response(status=200)


async def delete_object(request: web.Request, version, account_id, app_key, object_name) -> web.Response:
    """Delete Object

    Delete and Object in the store.  This will delete the table and clean up and foreign keys referencing it. Cannot be undone so use only when abolutely sure.

    :param version: 
    :type version: 
    :param account_id: the id of the logged in user
    :type account_id: int
    :param app_key: the application key
    :type app_key: str
    :param object_name: the name of the object to delete
    :type object_name: str

    """
    return web.Response(status=200)


async def get_data(request: web.Request, version, object_name, object_id, account_id=None, include=None) -> web.Response:
    """Get Data

    Get a specific record from a specified object.

    :param version: 
    :type version: 
    :param object_name: The name of the object to search upon
    :type object_name: str
    :param object_id: objectId The id of the record to return
    :type object_id: str
    :param account_id: The account id of the logged in user
    :type account_id: int
    :param include: 
    :type include: str

    """
    return web.Response(status=200)


async def get_object(request: web.Request, version, account_id, app_key, object_name) -> web.Response:
    """Get Object

    Get the definition of an Object. Returns all field names, types, and current size. The types supported are: STRING, DATE, NUMBER, BOOLEAN, IDENTITY.

    :param version: 
    :type version: 
    :param account_id: The account id of the logged in user
    :type account_id: int
    :param app_key: The application key for updating an existing application
    :type app_key: str
    :param object_name: The name of the object to get the definition for
    :type object_name: str

    """
    return web.Response(status=200)


async def search_data(request: web.Request, version, object_name, count, start, limit, account_id=None, criteria=None, order=None, include=None) -> web.Response:
    """Search Data

    Search for records given the specified criteria.  The criteria is a defined set of json values used to build a query

    :param version: 
    :type version: 
    :param object_name: The name of the object to search upon
    :type object_name: str
    :param count: If true just return the record count of the search. False (default) will return the actual records
    :type count: bool
    :param start: The start of the pagination
    :type start: int
    :param limit: The limit of the pagination
    :type limit: int
    :param account_id: The account id of the logged in user
    :type account_id: int
    :param criteria: The search criteria
    :type criteria: str
    :param order: The order of results; comma seperated list of field names. Illegal field names will be ignored. Direction by defualt is ascending. Prepend a minus to the field name to make that field descending.
    :type order: str
    :param include: 
    :type include: str

    """
    return web.Response(status=200)


async def search_object(request: web.Request, version, account_id, app_key, start, limit, keyword=None) -> web.Response:
    """Search Objects

    Search for Objects and return the list of names found.  Use this in conjunction with the object get service to present the current data model defined.

    :param version: 
    :type version: 
    :param account_id: The account id of the logged in user
    :type account_id: int
    :param app_key: The application key for updating an existing application
    :type app_key: str
    :param start: The start of the pagination
    :type start: int
    :param limit: The limit of the pagination
    :type limit: int
    :param keyword: The name of the object(s) to search for, can be a partial match
    :type keyword: str

    """
    return web.Response(status=200)


async def update_data(request: web.Request, version, object_name, object_id, account_id=None, body=None) -> web.Response:
    """Update Data

    Update a record for the specified object.  If the object does not exist the request will be rejected, use the data create service for the first entry. If any of the fields included does not exist for the object then they are added to the object.

    :param version: 
    :type version: 
    :param object_name: The name of the object to search upon
    :type object_name: str
    :param object_id: objectId The id of the record to return
    :type object_id: str
    :param account_id: The account id of the logged in user
    :type account_id: int
    :param body: 
    :type body: str

    """
    return web.Response(status=200)
