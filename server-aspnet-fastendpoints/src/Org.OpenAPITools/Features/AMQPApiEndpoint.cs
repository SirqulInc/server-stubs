using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Consumer
/// </summary>

public class ConsumerCreateEndpoint : FastEndpoints.Endpoint<ConsumerCreateRequest, QueueResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/queue/consumer/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("AMQP");
        });

        Summary(s => {
            s.Summary = "Create Consumer";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "The application key to use when creating an analytic or service request. The account needs to have permissions to the applicaton or it will be denied.");
            s.RequestParam(r => r.Name, "The name of the queue to connect to");
            s.RequestParam(r => r.Hostname, "The hostname of the server the queue is hosted on");
            s.RequestParam(r => r.Username, "The username to access the server the queue is hosted on");
            s.RequestParam(r => r.Password, "The password to access the queue to connect to");
            s.RequestParam(r => r.DataMapping, "The data mapping information in the format of AMQPRequest");
            s.RequestParam(r => r.DeviceId, "The client deviceID");
            s.RequestParam(r => r.AccountId, "The logged in user ID");
            s.RequestParam(r => r.Port, "The port of the server the queue is hosted on");
            s.RequestParam(r => r.VirtualHost, "The virtual host defined on the server the queue is associated on");
            s.RequestParam(r => r.Exchanger, "The exchanger of the queue to connect to");
            s.RequestParam(r => r.ExchangerType, "The exchanger type of the queue to connect to");
            s.RequestParam(r => r.Workers, "The number of workers to generate ");
            s.RequestParam(r => r.UseSSL, "Use SSL");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ConsumerCreateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Consumer
/// </summary>

public class ConsumerUpdateEndpoint : FastEndpoints.Endpoint<ConsumerUpdateRequest, QueueResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/queue/consumer/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("AMQP");
        });

        Summary(s => {
            s.Summary = "Update Consumer";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "The application key to use when creating an analytic or service request. The account needs to have permissions to the applicaton or it will be denied.");
            s.RequestParam(r => r.QueueId, "The queue to update");
            s.RequestParam(r => r.DataMapping, "The data mapping information in the format of AMQPRequest");
            s.RequestParam(r => r.DeviceId, "The client deviceID");
            s.RequestParam(r => r.AccountId, "The logged in user ID");
            s.RequestParam(r => r.UseSSL, "Use SSL");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ConsumerUpdateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Queue
/// </summary>

public class QueueCreateEndpoint : FastEndpoints.Endpoint<QueueCreateRequest, QueueResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/queue/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("AMQP");
        });

        Summary(s => {
            s.Summary = "Create Queue";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "The application key unique to each application.");
            s.RequestParam(r => r.Name, "The name of the queue to create");
            s.RequestParam(r => r.DeviceId, "The client deviceID");
            s.RequestParam(r => r.AccountId, "The logged in user ID");
            s.RequestParam(r => r.Workers, "The number of workers to generate ");
            s.RequestParam(r => r.AnalyticTags, "If provided the analytic processing will publsih to this queue instead of the default one for the provided list of tags");
            s.RequestParam(r => r.Hostname, "The hostname of the server the queue is hosted on");
            s.RequestParam(r => r.Port, "The port of the server the queue is hosted on");
            s.RequestParam(r => r.Username, "The username to access the server that the queue is on");
            s.RequestParam(r => r.Password, "The password to access the queue to connect to");
            s.RequestParam(r => r.VirtualHost, "The virtual host defined on the server to queue");
            s.RequestParam(r => r.UseSSL, "Use SSL");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(QueueCreateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Queue
/// </summary>

public class QueueDeleteEndpoint : FastEndpoints.Endpoint<QueueDeleteRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/queue/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("AMQP");
        });

        Summary(s => {
            s.Summary = "Delete Queue";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.QueueId, "The id of the queue to find");
            s.RequestParam(r => r.DeviceId, "The client device ID");
            s.RequestParam(r => r.AccountId, "The logged in user ID");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(QueueDeleteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Queue
/// </summary>

public class QueueGetEndpoint : FastEndpoints.Endpoint<QueueGetRequest, QueueResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/queue/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("AMQP");
        });

        Summary(s => {
            s.Summary = "Get Queue";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The client device ID");
            s.RequestParam(r => r.AccountId, "The logged in user ID");
            s.RequestParam(r => r.QueueId, "The id of the queue to find");
            s.RequestParam(r => r.AppKey, "The application key the queue was assigned to");
            s.RequestParam(r => r.Name, "The name of the queue to find");
            s.RequestParam(r => r.Hostname, "The hostname of the queue to find");
            s.RequestParam(r => r.VirtualHost, "The virtual host of the queue to find");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(QueueGetRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Publish Queue
/// </summary>

public class QueuePublishEndpoint : FastEndpoints.Endpoint<QueuePublishRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/queue/publish");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("AMQP");
        });

        Summary(s => {
            s.Summary = "Publish Queue";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Message, "The payload to send to the queue");
            s.RequestParam(r => r.QueueId, "The id of the queue to publish to");
            s.RequestParam(r => r.AppKey, "The application key the queue was assigned to");
            s.RequestParam(r => r.Name, "The name of the queue to publish to or the analytic tag to handle if the analytic param is true");
            s.RequestParam(r => r.Hostname, "The hostname of the server the queue is hosted on");
            s.RequestParam(r => r.VirtualHost, "The virtual host defined on the server to queue");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(QueuePublishRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Queue
/// </summary>

public class QueueSearchEndpoint : FastEndpoints.Endpoint<QueueSearchRequest, QueueResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/queue/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("AMQP");
        });

        Summary(s => {
            s.Summary = "Search Queue";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.QueueId, "The id of the queue to find");
            s.RequestParam(r => r.DeviceId, "The client device ID");
            s.RequestParam(r => r.AccountId, "The logged in user ID");
            s.RequestParam(r => r.Name, "The name of the queue to find");
            s.RequestParam(r => r.Start, "Start of the index");
            s.RequestParam(r => r.Limit, "Limit of the index");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(QueueSearchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Queue
/// </summary>

public class QueueUpdateEndpoint : FastEndpoints.Endpoint<QueueUpdateRequest, QueueResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/queue/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("AMQP");
        });

        Summary(s => {
            s.Summary = "Update Queue";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.QueueId, "The id of the queue to update");
            s.RequestParam(r => r.DeviceId, "The client deviceID");
            s.RequestParam(r => r.AccountId, "The logged in user ID");
            s.RequestParam(r => r.AppKey, "The application key unique to each application.");
            s.RequestParam(r => r.Workers, "The number of workers to generate");
            s.RequestParam(r => r.AnalyticTags, "If provided the analytic processing will publsih to this queue instead of the default one for the provided list of tags");
            s.RequestParam(r => r.Hostname, "The hostname of the server the queue is hosted on");
            s.RequestParam(r => r.Port, "The port of the server the queue is hosted on");
            s.RequestParam(r => r.Username, "The username to access the server that the queue is on");
            s.RequestParam(r => r.Password, "The password to access the queue to connect to");
            s.RequestParam(r => r.VirtualHost, "The virtual host defined on the server to queue");
            s.RequestParam(r => r.UseSSL, "the SSL to use");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(QueueUpdateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

