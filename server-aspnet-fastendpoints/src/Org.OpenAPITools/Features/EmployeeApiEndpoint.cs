using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Assign Employee
/// </summary>

public class AssignEmployeeEndpoint : FastEndpoints.Endpoint<AssignEmployeeRequest, EmployeeResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/employee/assign");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Employee");
        });

        Summary(s => {
            s.Summary = "Assign Employee";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the logged in user");
            s.RequestParam(r => r.ManagerAccountId, "The account id of the manager to assign under");
            s.RequestParam(r => r.EmployeeAccountId, "The account id of the user to be assigned as employee");
            s.RequestParam(r => r.Role, "The role to assign to the employee (e.g. RETAILER or RETAILER_LIMITED)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AssignEmployeeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Assign Employee to Location
/// </summary>

public class AssignToLocationEmployeeEndpoint : FastEndpoints.Endpoint<AssignToLocationEmployeeRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/employee/assignToLocation");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Employee");
        });

        Summary(s => {
            s.Summary = "Assign Employee to Location";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the logged in user");
            s.RequestParam(r => r.RetailerLocationId, "The retailer location to apply the change to");
            s.RequestParam(r => r.EmployeeAccountId, "The account id of the user to apply the change to");
            s.RequestParam(r => r.Assign, "If true (default) assign to the location, otherwise remove from the retailer");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AssignToLocationEmployeeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Employee
/// </summary>

public class CreateEmployeeEndpoint : FastEndpoints.Endpoint<CreateEmployeeRequest, EmployeeResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/employee/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Employee");
        });

        Summary(s => {
            s.Summary = "Create Employee";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the logged in user");
            s.RequestParam(r => r.ManagerAccountId, "The account id of the manager to assign under");
            s.RequestParam(r => r.Username, "The username/email for the new user. This must be unique across the entire the system.");
            s.RequestParam(r => r.Password, "The password for the new user");
            s.RequestParam(r => r.Name, "a name field");
            s.RequestParam(r => r.PrefixName, "The name prefix; Mr, Mrs, etc");
            s.RequestParam(r => r.FirstName, "The first name");
            s.RequestParam(r => r.MiddleName, "The middle name");
            s.RequestParam(r => r.LastName, "The last name");
            s.RequestParam(r => r.SuffixName, "The name suffix; Jr, Sr, III, etc");
            s.RequestParam(r => r.Title, "The title of the user");
            s.RequestParam(r => r.AboutUs, "Additional about/biography text");
            s.RequestParam(r => r.AssetId, "the asset id to set the user&#39;s profile image");
            s.RequestParam(r => r.Gender, "The gender");
            s.RequestParam(r => r.HomePhone, "The home phone number");
            s.RequestParam(r => r.CellPhone, "The cellular phone number");
            s.RequestParam(r => r.CellPhoneCarrier, "The cellular service provider. This is required for sending SMS. Leave this empty if the provider is not on the list of supported carriers.");
            s.RequestParam(r => r.BusinessPhone, "The business phone number");
            s.RequestParam(r => r.EmailAddress, "The user&#39;s contact email address (NOT the username)");
            s.RequestParam(r => r.StreetAddress, "The street address of the user&#39;s contact location");
            s.RequestParam(r => r.StreetAddress2, "Additional address information (such as a suite number, floor number, building name, or PO Box)");
            s.RequestParam(r => r.City, "The city of the user&#39;s contact location");
            s.RequestParam(r => r.State, "The state of the user&#39;s contact location");
            s.RequestParam(r => r.Zipcode, "The zipcode of the user&#39;s contact location");
            s.RequestParam(r => r.Country, "The country of the user&#39;s contact location");
            s.RequestParam(r => r.Role, "The role; RETAILER or RETAILER_LIMITED, defaulted to RETAILER_LIMITED");
            s.RequestParam(r => r.RetailerLocationIds, "the retailer location IDs the employee is associated with");
            s.RequestParam(r => r.SettingsAppKey, "Determines whether to return the application settings for the employee for a particular application");
            s.RequestParam(r => r.AppBlob, "external custom client defined data (per Application)");
            s.RequestParam(r => r.AssignedDeviceId, "The device id to assign to the user (used for IPS beacon tracking)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateEmployeeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Employee
/// </summary>

public class DeleteEmployeeEndpoint : FastEndpoints.Endpoint<DeleteEmployeeRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/employee/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Employee");
        });

        Summary(s => {
            s.Summary = "Delete Employee";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.EmployeeAccountId, "the id of the employee to delete");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteEmployeeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Employee
/// </summary>

public class GetEmployeeEndpoint : FastEndpoints.Endpoint<GetEmployeeRequest, EmployeeResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/employee/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Employee");
        });

        Summary(s => {
            s.Summary = "Get Employee";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of logged in user");
            s.RequestParam(r => r.EmployeeAccountId, "the id of the employee account to get");
            s.RequestParam(r => r.SettingsAppKey, "Determines whether to return the application settings for the employee for a particular application");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetEmployeeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Employees
/// </summary>

public class SearchEmployeesEndpoint : FastEndpoints.Endpoint<SearchEmployeesRequest, List<EmployeeResponse>>
{
    public override void Configure()
    {
        Post("/api/{version}/employee/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Employee");
        });

        Summary(s => {
            s.Summary = "Search Employees";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the logged in user");
            s.RequestParam(r => r.Role, "The role to limit the search to: RETAILER or RETAILER_LIMITED. Leave empty to search on both roles.");
            s.RequestParam(r => r.RetailerId, "Filters employees by retailer");
            s.RequestParam(r => r.RetailerLocationId, "Filter employees by retailer locations");
            s.RequestParam(r => r.Q, "Deprecated parameter");
            s.RequestParam(r => r.Keyword, "an optional keyword to search on; ignored if empty");
            s.RequestParam(r => r.SortField, "The field to sort by. Possible values include: DISPLAY, CREATED, UPDATED, ACTIVE, DELETED, LAST_LOGGED_IN, CONTACT_EMAIL, RETAILER_LOCATION_NAME, RETAILER_NAME");
            s.RequestParam(r => r.Descending, "Determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.I, "Deprecated parameter");
            s.RequestParam(r => r.Start, "Start the result set at some index");
            s.RequestParam(r => r.L, "Deprecated parameter");
            s.RequestParam(r => r.Limit, "Limit the result to some number");
            s.RequestParam(r => r.ActiveOnly, "Filter results to only return active employees");
            s.RequestParam(r => r.ManagedOnly, "Filter results to only employees that you manage");
            s.RequestParam(r => r.SettingsAppKey, "Determines whether to return the application settings for the employee for a particular application");
            s.RequestParam(r => r.CategoryIds, "Comma separated list of category ids to filter results");
            s.RequestParam(r => r.Query, "Legacy/reporting query parameter used for formatting employee responses");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchEmployeesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Unassign Employee
/// </summary>

public class UnassignEmployeeEndpoint : FastEndpoints.Endpoint<UnassignEmployeeRequest, EmployeeResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/employee/unassign");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Employee");
        });

        Summary(s => {
            s.Summary = "Unassign Employee";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the logged in user");
            s.RequestParam(r => r.EmployeeAccountId, "The account id of the user to be unassigned");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UnassignEmployeeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Employee
/// </summary>

public class UpdateEmployeeEndpoint : FastEndpoints.Endpoint<UpdateEmployeeRequest, EmployeeResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/employee/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Employee");
        });

        Summary(s => {
            s.Summary = "Update Employee";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the logged in user");
            s.RequestParam(r => r.EmployeeAccountId, "the id of the employee account");
            s.RequestParam(r => r.ManagerAccountId, "The account id of the manager to assign under");
            s.RequestParam(r => r.Name, "a name field");
            s.RequestParam(r => r.PrefixName, "The name prefix; Mr, Mrs, etc");
            s.RequestParam(r => r.FirstName, "The first name");
            s.RequestParam(r => r.MiddleName, "The middle name");
            s.RequestParam(r => r.LastName, "The last name");
            s.RequestParam(r => r.SuffixName, "The name suffix; Jr, Sr, III, etc");
            s.RequestParam(r => r.Title, "The title of the user");
            s.RequestParam(r => r.AssetId, "the asset id to set the user&#39;s profile image");
            s.RequestParam(r => r.Gender, "The gender {MALE, FEMALE, ANY}");
            s.RequestParam(r => r.HomePhone, "The home phone number");
            s.RequestParam(r => r.CellPhone, "The cellular phone number");
            s.RequestParam(r => r.CellPhoneCarrier, "The cellular service provider. This is required for sending SMS. Leave this empty if the provider is not on the list of supported carriers. Supported Carriers: {ATT, QWEST, T_MOBILE, VERIZON, SPRINT, VIRIGIN_MOBILE, NEXTEL, ALLTEL, METRO_PCS, POWERTEL, BOOST_MOBILE, SUNCOM, TRACFONE, US_CELLULAR}");
            s.RequestParam(r => r.BusinessPhone, "The business phone number");
            s.RequestParam(r => r.EmailAddress, "The user&#39;s contact email address (NOT the username)");
            s.RequestParam(r => r.StreetAddress, "The street address of the user&#39;s contact location");
            s.RequestParam(r => r.StreetAddress2, "Additional address information (such as a suite number, floor number, building name, or PO Box)");
            s.RequestParam(r => r.City, "The city of the user&#39;s contact location");
            s.RequestParam(r => r.State, "The state of the user&#39;s contact location");
            s.RequestParam(r => r.Zipcode, "The zipcode of the user&#39;s contact location");
            s.RequestParam(r => r.Country, "The country of the user&#39;s contact location");
            s.RequestParam(r => r.Role, "The role; RETAILER or RETAILER_LIMITED, defaulted to RETAILER_LIMITED");
            s.RequestParam(r => r.Active, "Sets whether the employee is active or inactive");
            s.RequestParam(r => r.Password, "Sets the password for the employee");
            s.RequestParam(r => r.RetailerLocationIds, "Sets which retailer locations the employee is assigned to");
            s.RequestParam(r => r.SettingsAppKey, "Determines whether to return the application settings for the employee for a particular application");
            s.RequestParam(r => r.AppBlob, "external custom client defined data (per Application)");
            s.RequestParam(r => r.AssignedDeviceId, "The device id to assign to the user (used for IPS beacon tracking)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateEmployeeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

