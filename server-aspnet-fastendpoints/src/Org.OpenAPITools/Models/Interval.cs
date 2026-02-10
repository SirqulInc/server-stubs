namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Interval 
{
    public DateTime End { get; set; }
    public DateTime Start { get; set; }
    public Chronology Chronology { get; set; }
    public long StartMillis { get; set; }
    public long EndMillis { get; set; }
    public bool BeforeNow { get; set; }
    public bool AfterNow { get; set; }
}


