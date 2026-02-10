
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateRouteSettingsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public RouteSettings? body { get; set; }
}
public class DeleteRouteSettingsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the route setting to delete
    /// </summary>
    [FastEndpoints.BindFrom("routeSettingsId")]
    public long RouteSettingsId { get; set; }
}
public class GetRouteSettingsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the route settings to get
    /// </summary>
    [FastEndpoints.BindFrom("routeSettingsId")]
    public long RouteSettingsId { get; set; }
}
public class SearchRouteSettingsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The service hub that the route belongs under
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hubId")]
    public long? HubId { get; set; }
    /// <summary>
    /// The program that the route belongs under
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("programId")]
    public long? ProgramId { get; set; }
    /// <summary>
    /// The keyword to search for the route
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// The field to sort by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string SortField { get; set; }
    /// <summary>
    /// Determines whether the sorted list is in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool Descending { get; set; }
    /// <summary>
    /// The start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// The limit for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
    /// <summary>
    /// Return only active results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool ActiveOnly { get; set; }
}
public class UpdateRouteSettingsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the route settings to update
    /// </summary>
    [FastEndpoints.BindFrom("routeSettingsId")]
    public long RouteSettingsId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public RouteSettings? body { get; set; }
}


