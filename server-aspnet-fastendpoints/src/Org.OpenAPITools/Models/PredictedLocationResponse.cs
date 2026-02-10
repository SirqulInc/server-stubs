namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PredictedLocationResponse 
{
    public long OwnerId { get; set; }
    public string OnDate { get; set; }
    public long OnDateMilli { get; set; }
    public int Hour { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public double Distance { get; set; }
    public long Matches { get; set; }
    public double AverageDuration { get; set; }
    public double WeightedScore { get; set; }
}


