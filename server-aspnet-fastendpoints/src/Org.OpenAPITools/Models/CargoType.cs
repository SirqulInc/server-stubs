namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CargoType 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public Retailer Business { get; set; }
    public ServiceHub Hub { get; set; }
    public string Name { get; set; }
    public double Width { get; set; }
    public double Height { get; set; }
    public double Depth { get; set; }
    public double Volume { get; set; }
    public double Weight { get; set; }
    public long LoadTime { get; set; }
    public bool Palletizable { get; set; }
    public int PalletRatio { get; set; }
    public bool AdminOnly { get; set; }
}


