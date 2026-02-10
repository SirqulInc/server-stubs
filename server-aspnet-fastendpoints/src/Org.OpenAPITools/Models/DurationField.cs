namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class DurationField 
{
    public string Name { get; set; }
    public DurationFieldType Type { get; set; }
    public bool Supported { get; set; }
    public bool Precise { get; set; }
    public long UnitMillis { get; set; }
}


