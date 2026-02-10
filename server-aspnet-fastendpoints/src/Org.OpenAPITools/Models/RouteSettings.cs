namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class RouteSettings 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    public string Setting { get; set; }
    
    /// <summary>
    /// Gets or Sets SettingType
    /// </summary>
    public enum SettingTypeEnum
    {
        
        /// <summary>
        /// Enum FLOATEnum for FLOAT
        /// </summary>
        FLOATEnum = 1,
        
        /// <summary>
        /// Enum DOUBLEEnum for DOUBLE
        /// </summary>
        DOUBLEEnum = 2,
        
        /// <summary>
        /// Enum INTEGEREnum for INTEGER
        /// </summary>
        INTEGEREnum = 3,
        
        /// <summary>
        /// Enum LONGEnum for LONG
        /// </summary>
        LONGEnum = 4,
        
        /// <summary>
        /// Enum BOOLEANEnum for BOOLEAN
        /// </summary>
        BOOLEANEnum = 5,
        
        /// <summary>
        /// Enum STRINGEnum for STRING
        /// </summary>
        STRINGEnum = 6
    }

    public SettingTypeEnum SettingType { get; set; }
    public Program Program { get; set; }
    public ServiceHub Hub { get; set; }
}


