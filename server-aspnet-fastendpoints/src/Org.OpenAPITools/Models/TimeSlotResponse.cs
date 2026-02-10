namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TimeSlotResponse 
{
    public long ScheduledDate { get; set; }
    public long StartTime { get; set; }
    public long EndTime { get; set; }
    public int DayOfWeek { get; set; }
    public string VarTimeZone { get; set; }
    public int ReservationCount { get; set; }
    public List<AccountShortResponse> Reservations { get; set; }
}


