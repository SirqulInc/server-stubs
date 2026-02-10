namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class LocalTime 
{
    public Chronology Chronology { get; set; }
    public int HourOfDay { get; set; }
    public int MinuteOfHour { get; set; }
    public int SecondOfMinute { get; set; }
    public int MillisOfSecond { get; set; }
    public int MillisOfDay { get; set; }
    public List<DateTimeField> Fields { get; set; }
    public List<int> Values { get; set; }
    public List<DateTimeFieldType> FieldTypes { get; set; }
}


