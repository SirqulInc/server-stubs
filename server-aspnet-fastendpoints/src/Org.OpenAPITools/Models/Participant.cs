namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Participant 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public Account Account { get; set; }
    public DateTime AvailableStart { get; set; }
    public DateTime AvailableEnd { get; set; }
    public string Color1 { get; set; }
    public string Color2 { get; set; }
    
    /// <summary>
    /// Gets or Sets Type
    /// </summary>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum TEAMEnum for TEAM
        /// </summary>
        TEAMEnum = 1,
        
        /// <summary>
        /// Enum LEAGUEEnum for LEAGUE
        /// </summary>
        LEAGUEEnum = 2,
        
        /// <summary>
        /// Enum SPORTEnum for SPORT
        /// </summary>
        SPORTEnum = 3
    }

    public TypeEnum Type { get; set; }
}


