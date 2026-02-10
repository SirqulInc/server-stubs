namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class StepResponse 
{
    public LegResponse Leg { get; set; }
    public double Distance { get; set; }
    public long Duration { get; set; }
    public double StartLat { get; set; }
    public double StartLng { get; set; }
    public double StartAlt { get; set; }
    public long StartDate { get; set; }
    public double EndLat { get; set; }
    public double EndLng { get; set; }
    public double EndAlt { get; set; }
    public long EndDate { get; set; }
    public int Accuracy { get; set; }
}


