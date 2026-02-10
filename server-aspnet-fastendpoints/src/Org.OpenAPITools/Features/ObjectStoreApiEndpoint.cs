using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Field
/// </summary>

public class AddFieldEndpoint : FastEndpoints.Endpoint<AddFieldRequest, ObjectStoreResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/object/field/add");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Object Store");
        });

        Summary(s => {
            s.Summary = "Create Field";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the logged in user");
            s.RequestParam(r => r.AppKey, "The application key for updating an existing application");
            s.RequestParam(r => r.ObjectName, "The name of the object to add the field to");
            s.RequestParam(r => r.FieldName, "field name The name of the field to add.");
            s.RequestParam(r => r.FieldType, "field type The field type to create, supported types are: STRING, DATE, NUMBER, BOOLEAN, IDENTITY");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AddFieldRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Data
/// </summary>

public class CreateDataEndpoint : FastEndpoints.Endpoint<CreateDataRequest, ObjectStoreResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/object/data/{objectName}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Object Store");
        });

        Summary(s => {
            s.Summary = "Create Data";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ObjectName, "the name of the object to create data for");
            s.RequestParam(r => r.AccountId, "the account id");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateDataRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Object
/// </summary>

public class CreateObjectEndpoint : FastEndpoints.Endpoint<CreateObjectRequest, ObjectStoreResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/object/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Object Store");
        });

        Summary(s => {
            s.Summary = "Create Object";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the logged in user");
            s.RequestParam(r => r.AppKey, "The application key for updating an existing application");
            s.RequestParam(r => r.ObjectName, "The name of the object to create");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateObjectRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Data
/// </summary>

public class DeleteDataEndpoint : FastEndpoints.Endpoint<DeleteDataRequest, ObjectStoreResponse>
{
    public override void Configure()
    {
        Delete("/api/{version}/object/data/{objectName}/{objectId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Object Store");
        });

        Summary(s => {
            s.Summary = "Delete Data";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ObjectName, "The name of the object to search upon");
            s.RequestParam(r => r.ObjectId, "objectId The id of the record to return");
            s.RequestParam(r => r.AccountId, "The account id of the logged in user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteDataRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Field
/// </summary>

public class DeleteFieldEndpoint : FastEndpoints.Endpoint<DeleteFieldRequest, ObjectStoreResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/object/field/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Object Store");
        });

        Summary(s => {
            s.Summary = "Delete Field";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the logged in user");
            s.RequestParam(r => r.AppKey, "The application key for updating an existing application");
            s.RequestParam(r => r.ObjectName, "The name of the object to remove the field from");
            s.RequestParam(r => r.FieldName, "field name The name of the field to remove.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteFieldRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Object
/// </summary>

public class DeleteObjectEndpoint : FastEndpoints.Endpoint<DeleteObjectRequest, ObjectStoreResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/object/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Object Store");
        });

        Summary(s => {
            s.Summary = "Delete Object";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.ObjectName, "the name of the object to delete");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteObjectRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Data
/// </summary>

public class GetDataEndpoint : FastEndpoints.Endpoint<GetDataRequest, ObjectStoreResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/object/data/{objectName}/{objectId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Object Store");
        });

        Summary(s => {
            s.Summary = "Get Data";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ObjectName, "The name of the object to search upon");
            s.RequestParam(r => r.ObjectId, "objectId The id of the record to return");
            s.RequestParam(r => r.AccountId, "The account id of the logged in user");
            s.RequestParam(r => r.Include, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetDataRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Object
/// </summary>

public class GetObjectEndpoint : FastEndpoints.Endpoint<GetObjectRequest, ObjectStoreResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/object/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Object Store");
        });

        Summary(s => {
            s.Summary = "Get Object";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the logged in user");
            s.RequestParam(r => r.AppKey, "The application key for updating an existing application");
            s.RequestParam(r => r.ObjectName, "The name of the object to get the definition for");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetObjectRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Data
/// </summary>

public class SearchDataEndpoint : FastEndpoints.Endpoint<SearchDataRequest, ObjectStoreResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/object/data/{objectName}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Object Store");
        });

        Summary(s => {
            s.Summary = "Search Data";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ObjectName, "The name of the object to search upon");
            s.RequestParam(r => r.Count, "If true just return the record count of the search. False (default) will return the actual records");
            s.RequestParam(r => r.Start, "The start of the pagination");
            s.RequestParam(r => r.Limit, "The limit of the pagination");
            s.RequestParam(r => r.AccountId, "The account id of the logged in user");
            s.RequestParam(r => r.Criteria, "The search criteria");
            s.RequestParam(r => r.Order, "The order of results; comma seperated list of field names. Illegal field names will be ignored. Direction by defualt is ascending. Prepend a minus to the field name to make that field descending.");
            s.RequestParam(r => r.Include, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchDataRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Objects
/// </summary>

public class SearchObjectEndpoint : FastEndpoints.Endpoint<SearchObjectRequest, ObjectStoreResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/object/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Object Store");
        });

        Summary(s => {
            s.Summary = "Search Objects";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the logged in user");
            s.RequestParam(r => r.AppKey, "The application key for updating an existing application");
            s.RequestParam(r => r.Start, "The start of the pagination");
            s.RequestParam(r => r.Limit, "The limit of the pagination");
            s.RequestParam(r => r.Keyword, "The name of the object(s) to search for, can be a partial match");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchObjectRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Data
/// </summary>

public class UpdateDataEndpoint : FastEndpoints.Endpoint<UpdateDataRequest, ObjectStoreResponse>
{
    public override void Configure()
    {
        Put("/api/{version}/object/data/{objectName}/{objectId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Object Store");
        });

        Summary(s => {
            s.Summary = "Update Data";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ObjectName, "The name of the object to search upon");
            s.RequestParam(r => r.ObjectId, "objectId The id of the record to return");
            s.RequestParam(r => r.AccountId, "The account id of the logged in user");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateDataRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

