
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class ConsumerCreateRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The client deviceID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The logged in user ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The application key to use when creating an analytic or service request. The account needs to have permissions to the applicaton or it will be denied.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The name of the queue to connect to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
    /// <summary>
    /// The hostname of the server the queue is hosted on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hostname")]
    public string Hostname { get; set; }
    /// <summary>
    /// The port of the server the queue is hosted on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("port")]
    public int? Port { get; set; }
    /// <summary>
    /// The username to access the server the queue is hosted on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("username")]
    public string Username { get; set; }
    /// <summary>
    /// The password to access the queue to connect to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("password")]
    public string Password { get; set; }
    /// <summary>
    /// The virtual host defined on the server the queue is associated on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("virtualHost")]
    public string? VirtualHost { get; set; }
    /// <summary>
    /// The exchanger of the queue to connect to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("exchanger")]
    public string? Exchanger { get; set; }
    /// <summary>
    /// The exchanger type of the queue to connect to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("exchangerType")]
    public string? ExchangerType { get; set; }
    /// <summary>
    /// The number of workers to generate 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("workers")]
    public int? Workers { get; set; }
    /// <summary>
    /// The data mapping information in the format of AMQPRequest
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("dataMapping")]
    public string DataMapping { get; set; }
    /// <summary>
    /// Use SSL
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("useSSL")]
    public bool? UseSSL { get; set; }
}
public class ConsumerUpdateRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The client deviceID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The logged in user ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The application key to use when creating an analytic or service request. The account needs to have permissions to the applicaton or it will be denied.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The queue to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("queueId")]
    public long QueueId { get; set; }
    /// <summary>
    /// The data mapping information in the format of AMQPRequest
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("dataMapping")]
    public string DataMapping { get; set; }
    /// <summary>
    /// Use SSL
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("useSSL")]
    public bool? UseSSL { get; set; }
}
public class QueueCreateRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The client deviceID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The logged in user ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The application key unique to each application.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The name of the queue to create
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
    /// <summary>
    /// The number of workers to generate 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("workers")]
    public int? Workers { get; set; }
    /// <summary>
    /// If provided the analytic processing will publsih to this queue instead of the default one for the provided list of tags
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("analyticTags")]
    public string? AnalyticTags { get; set; }
    /// <summary>
    /// The hostname of the server the queue is hosted on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hostname")]
    public string? Hostname { get; set; }
    /// <summary>
    /// The port of the server the queue is hosted on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("port")]
    public int? Port { get; set; }
    /// <summary>
    /// The username to access the server that the queue is on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("username")]
    public string? Username { get; set; }
    /// <summary>
    /// The password to access the queue to connect to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("password")]
    public string? Password { get; set; }
    /// <summary>
    /// The virtual host defined on the server to queue
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("virtualHost")]
    public string? VirtualHost { get; set; }
    /// <summary>
    /// Use SSL
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("useSSL")]
    public bool? UseSSL { get; set; }
}
public class QueueDeleteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The client device ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The logged in user ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The id of the queue to find
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("queueId")]
    public long QueueId { get; set; }
}
public class QueueGetRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The client device ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The logged in user ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The id of the queue to find
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("queueId")]
    public long? QueueId { get; set; }
    /// <summary>
    /// The application key the queue was assigned to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The name of the queue to find
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// The hostname of the queue to find
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hostname")]
    public string? Hostname { get; set; }
    /// <summary>
    /// The virtual host of the queue to find
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("virtualHost")]
    public string? VirtualHost { get; set; }
}
public class QueuePublishRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The id of the queue to publish to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("queueId")]
    public long? QueueId { get; set; }
    /// <summary>
    /// The application key the queue was assigned to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The name of the queue to publish to or the analytic tag to handle if the analytic param is true
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// The hostname of the server the queue is hosted on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hostname")]
    public string? Hostname { get; set; }
    /// <summary>
    /// The virtual host defined on the server to queue
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("virtualHost")]
    public string? VirtualHost { get; set; }
    /// <summary>
    /// The payload to send to the queue
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("message")]
    public string Message { get; set; }
}
public class QueueSearchRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The id of the queue to find
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("queueId")]
    public long? QueueId { get; set; }
    /// <summary>
    /// The client device ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The logged in user ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The name of the queue to find
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// Start of the index
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// Limit of the index
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class QueueUpdateRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The client deviceID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The logged in user ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The application key unique to each application.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The id of the queue to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("queueId")]
    public long QueueId { get; set; }
    /// <summary>
    /// The number of workers to generate
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("workers")]
    public int? Workers { get; set; }
    /// <summary>
    /// If provided the analytic processing will publsih to this queue instead of the default one for the provided list of tags
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("analyticTags")]
    public string? AnalyticTags { get; set; }
    /// <summary>
    /// The hostname of the server the queue is hosted on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hostname")]
    public string? Hostname { get; set; }
    /// <summary>
    /// The port of the server the queue is hosted on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("port")]
    public int? Port { get; set; }
    /// <summary>
    /// The username to access the server that the queue is on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("username")]
    public string? Username { get; set; }
    /// <summary>
    /// The password to access the queue to connect to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("password")]
    public string? Password { get; set; }
    /// <summary>
    /// The virtual host defined on the server to queue
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("virtualHost")]
    public string? VirtualHost { get; set; }
    /// <summary>
    /// the SSL to use
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("useSSL")]
    public bool? UseSSL { get; set; }
}


