namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class NodeRequest 
{
    public int X { get; set; }
    public int Y { get; set; }
    public int Z { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public double Altitude { get; set; }
    public long Date { get; set; }
    public bool IsWaypoint { get; set; }
    public long AccountId { get; set; }
    public Node Node { get; set; }
}


