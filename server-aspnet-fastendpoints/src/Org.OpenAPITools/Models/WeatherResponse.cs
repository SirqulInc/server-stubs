namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class WeatherResponse 
{
    public long Id { get; set; }
    public int Cloudcover { get; set; }
    public int Humidity { get; set; }
    public long ObservationTime { get; set; }
    public double PrecipMM { get; set; }
    public int Pressure { get; set; }
    public int TempC { get; set; }
    public int TempF { get; set; }
    public int Visibility { get; set; }
    public int WeatherCode { get; set; }
    public string WeatherDesc { get; set; }
    public string WeatherIconUrl { get; set; }
    public string Winddir16Point { get; set; }
    public int WinddirDegree { get; set; }
    public int WindspeedKmph { get; set; }
    public int WindspeedMiles { get; set; }
    public List<WeatherForecastResponse> Forecasts { get; set; }
}


