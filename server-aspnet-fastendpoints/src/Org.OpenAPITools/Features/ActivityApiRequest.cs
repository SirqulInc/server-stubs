
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateEntityReferenceRequest
{
    /// <summary>
    /// The entity reference object
    /// </summary>
    [FastEndpoints.FromBody]
    public EntityReference body { get; set; }
}


