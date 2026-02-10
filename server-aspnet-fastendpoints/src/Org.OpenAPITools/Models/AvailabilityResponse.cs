namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AvailabilityResponse 
{
    public long AvailabilityId { get; set; }
    public long StartDate { get; set; }
    public long EndDate { get; set; }
    public int DayOfWeek { get; set; }
    public long StartTime { get; set; }
    public long EndTime { get; set; }
    public string VarTimeZone { get; set; }
    public bool Deleted { get; set; }
}


