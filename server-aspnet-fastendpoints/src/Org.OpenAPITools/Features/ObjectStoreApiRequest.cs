
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AddFieldRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The application key for updating an existing application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The name of the object to add the field to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("objectName")]
    public string ObjectName { get; set; }
    /// <summary>
    /// field name The name of the field to add.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("fieldName")]
    public string FieldName { get; set; }
    /// <summary>
    /// field type The field type to create, supported types are: STRING, DATE, NUMBER, BOOLEAN, IDENTITY
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("fieldType")]
    public string FieldType { get; set; }
}
public class CreateDataRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the name of the object to create data for
    /// </summary>
    [FastEndpoints.BindFrom("objectName")]
    public string ObjectName { get; set; }
    /// <summary>
    /// the account id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public string? body { get; set; }
}
public class CreateObjectRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The application key for updating an existing application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The name of the object to create
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("objectName")]
    public string ObjectName { get; set; }
}
public class DeleteDataRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The name of the object to search upon
    /// </summary>
    [FastEndpoints.BindFrom("objectName")]
    public string ObjectName { get; set; }
    /// <summary>
    /// objectId The id of the record to return
    /// </summary>
    [FastEndpoints.BindFrom("objectId")]
    public string ObjectId { get; set; }
    /// <summary>
    /// The account id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
}
public class DeleteFieldRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The application key for updating an existing application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The name of the object to remove the field from
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("objectName")]
    public string ObjectName { get; set; }
    /// <summary>
    /// field name The name of the field to remove.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("fieldName")]
    public string FieldName { get; set; }
}
public class DeleteObjectRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// the name of the object to delete
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("objectName")]
    public string ObjectName { get; set; }
}
public class GetDataRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The name of the object to search upon
    /// </summary>
    [FastEndpoints.BindFrom("objectName")]
    public string ObjectName { get; set; }
    /// <summary>
    /// objectId The id of the record to return
    /// </summary>
    [FastEndpoints.BindFrom("objectId")]
    public string ObjectId { get; set; }
    /// <summary>
    /// The account id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("include")]
    public string? Include { get; set; }
}
public class GetObjectRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The application key for updating an existing application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The name of the object to get the definition for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("objectName")]
    public string ObjectName { get; set; }
}
public class SearchDataRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The name of the object to search upon
    /// </summary>
    [FastEndpoints.BindFrom("objectName")]
    public string ObjectName { get; set; }
    /// <summary>
    /// The account id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The search criteria
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("criteria")]
    public string? Criteria { get; set; }
    /// <summary>
    /// If true just return the record count of the search. False (default) will return the actual records
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("count")]
    public bool Count { get; set; }
    /// <summary>
    /// The start of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public long Start { get; set; }
    /// <summary>
    /// The limit of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public long Limit { get; set; }
    /// <summary>
    /// The order of results; comma seperated list of field names. Illegal field names will be ignored. Direction by defualt is ascending. Prepend a minus to the field name to make that field descending.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("order")]
    public string? Order { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("include")]
    public string? Include { get; set; }
}
public class SearchObjectRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The application key for updating an existing application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The name of the object(s) to search for, can be a partial match
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// The start of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public long Start { get; set; }
    /// <summary>
    /// The limit of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public long Limit { get; set; }
}
public class UpdateDataRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The name of the object to search upon
    /// </summary>
    [FastEndpoints.BindFrom("objectName")]
    public string ObjectName { get; set; }
    /// <summary>
    /// objectId The id of the record to return
    /// </summary>
    [FastEndpoints.BindFrom("objectId")]
    public string ObjectId { get; set; }
    /// <summary>
    /// The account id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public string? body { get; set; }
}


