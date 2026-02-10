namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class EntityReference 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public string EntityType { get; set; }
    public long MasterEntityId { get; set; }
    public string SlaveUID { get; set; }
    public long SlaveEntityId { get; set; }
}


