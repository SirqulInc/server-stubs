namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class LoadResponse 
{
    public string Id { get; set; }
    public string Name { get; set; }
    public long Size { get; set; }
    public long LoadingTime { get; set; }
    public bool SeparatePayloads { get; set; }
    public StopResponse Pickup { get; set; }
    public StopResponse Dropoff { get; set; }
}


