namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Region 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public string LocationDescription { get; set; }
    public Account Owner { get; set; }
    public string ShortName { get; set; }
    public string FullName { get; set; }
    public GeoBox Bounds { get; set; }
    public DateTime Start { get; set; }
    public DateTime End { get; set; }
    public string Polygon { get; set; }
    public string MetaData { get; set; }
    public List<Region> Children { get; set; }
    public List<Region> Parents { get; set; }
    public List<PostalCode> PostalCodes { get; set; }
    
    /// <summary>
    /// Gets or Sets RegionClass
    /// </summary>
    public enum RegionClassEnum
    {
        
        /// <summary>
        /// Enum NATIONALEnum for NATIONAL
        /// </summary>
        NATIONALEnum = 1,
        
        /// <summary>
        /// Enum STATEEnum for STATE
        /// </summary>
        STATEEnum = 2,
        
        /// <summary>
        /// Enum COUNTYEnum for COUNTY
        /// </summary>
        COUNTYEnum = 3,
        
        /// <summary>
        /// Enum METROAREAEnum for METRO_AREA
        /// </summary>
        METROAREAEnum = 4,
        
        /// <summary>
        /// Enum CITYEnum for CITY
        /// </summary>
        CITYEnum = 5,
        
        /// <summary>
        /// Enum NEIGHBORHOODEnum for NEIGHBORHOOD
        /// </summary>
        NEIGHBORHOODEnum = 6,
        
        /// <summary>
        /// Enum TERRITORYEnum for TERRITORY
        /// </summary>
        TERRITORYEnum = 7,
        
        /// <summary>
        /// Enum CUSTOMEnum for CUSTOM
        /// </summary>
        CUSTOMEnum = 8,
        
        /// <summary>
        /// Enum ZONEEnum for ZONE
        /// </summary>
        ZONEEnum = 9
    }

    public RegionClassEnum RegionClass { get; set; }
    public bool Root { get; set; }
    public bool WebActive { get; set; }
    public bool AdminActive { get; set; }
    
    /// <summary>
    /// Gets or Sets Visibility
    /// </summary>
    public enum VisibilityEnum
    {
        
        /// <summary>
        /// Enum PUBLICEnum for PUBLIC
        /// </summary>
        PUBLICEnum = 1,
        
        /// <summary>
        /// Enum PRIVATEEnum for PRIVATE
        /// </summary>
        PRIVATEEnum = 2,
        
        /// <summary>
        /// Enum FRIENDSEnum for FRIENDS
        /// </summary>
        FRIENDSEnum = 3
    }

    public VisibilityEnum Visibility { get; set; }
    public List<Category> Categories { get; set; }
    public List<Filter> Filters { get; set; }
    public double TruncatedLatitude { get; set; }
    public double TruncatedLongitude { get; set; }
    public int VersionCode { get; set; }
    public string Display { get; set; }
    public string ContentName { get; set; }
}


