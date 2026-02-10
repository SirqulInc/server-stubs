namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class RegionResponse 
{
    public long Id { get; set; }
    public string ShortName { get; set; }
    public string FullName { get; set; }
    public RegionResponse Parent { get; set; }
    public List<RegionResponse> Children { get; set; }
    public List<PostalCodeResponse> PostalCodes { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public bool Active { get; set; }
    public bool Root { get; set; }
    public string RegionClass { get; set; }
    public long Start { get; set; }
    public long End { get; set; }
    public string Polygon { get; set; }
    public string MetaData { get; set; }
    public double Distance { get; set; }
    public int VersionCode { get; set; }
}


