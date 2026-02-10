
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the parent account to create a dependent for
    /// </summary>
    [FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public Account? body { get; set; }
}
public class GetDependentsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the parent account to get a list of dependents
    /// </summary>
    [FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
}
public class RemoveDependentRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the parent account tied to the dependent
    /// </summary>
    [FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the id of the dependent to delete
    /// </summary>
    [FastEndpoints.BindFrom("dependentId")]
    public long DependentId { get; set; }
}


