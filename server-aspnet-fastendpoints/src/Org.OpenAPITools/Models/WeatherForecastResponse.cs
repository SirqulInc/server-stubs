namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class WeatherForecastResponse 
{
    public long Id { get; set; }
    public long ForecastDate { get; set; }
    public double PrecipMM { get; set; }
    public int TempMaxC { get; set; }
    public int TempMaxF { get; set; }
    public int TempMinC { get; set; }
    public int TempMinF { get; set; }
    public int WeatherCode { get; set; }
    public string WeatherDesc { get; set; }
    public string WeatherIconUrl { get; set; }
    public string Winddir16Point { get; set; }
    public int WinddirDegree { get; set; }
    public string Winddirection { get; set; }
    public int WindspeedKmph { get; set; }
    public int WindspeedMiles { get; set; }
}


