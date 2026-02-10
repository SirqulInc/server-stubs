namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PreferredLocationResponse 
{
    public long OwnerId { get; set; }
    public string OnDate { get; set; }
    public long OnDateMilli { get; set; }
    public int Hour { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public double Distance { get; set; }
    public long Duration { get; set; }
    public long StartStepId { get; set; }
    public long EndStepId { get; set; }
}


