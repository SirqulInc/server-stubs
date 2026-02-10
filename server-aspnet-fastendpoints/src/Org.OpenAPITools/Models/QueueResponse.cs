namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class QueueResponse 
{
    public long QueueId { get; set; }
    public string Name { get; set; }
    public string Host { get; set; }
    public int Port { get; set; }
    public string Username { get; set; }
    public string Password { get; set; }
    public string VirtualHost { get; set; }
    public int Workers { get; set; }
    public string Exchanger { get; set; }
    public string ExchangerType { get; set; }
    public bool HandleDelivery { get; set; }
    public string DataMapping { get; set; }
    public string AnalyticTags { get; set; }
}


