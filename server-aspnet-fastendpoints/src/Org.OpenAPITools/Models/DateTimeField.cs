namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class DateTimeField 
{
    public string Name { get; set; }
    public DateTimeFieldType Type { get; set; }
    public bool Supported { get; set; }
    public int MinimumValue { get; set; }
    public int MaximumValue { get; set; }
    public DurationField DurationField { get; set; }
    public DurationField LeapDurationField { get; set; }
    public DurationField RangeDurationField { get; set; }
    public bool Lenient { get; set; }
}


