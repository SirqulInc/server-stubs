namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class DirectionResponse 
{
    public string Action { get; set; }
    public double Bearing { get; set; }
    public double BearingDifference { get; set; }
    public string Heading { get; set; }
    public double Distance { get; set; }
    public string DistanceUnits { get; set; }
    public string DistanceString { get; set; }
    public double StartLatitude { get; set; }
    public double StartLongitude { get; set; }
    public double EndLatitude { get; set; }
    public double EndLongitude { get; set; }
    public string Instruction { get; set; }
    public string ProgressStatus { get; set; }
}


