namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Direction 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public string Distance { get; set; }
    public string Duration { get; set; }
    public double EndLatitude { get; set; }
    public double EndLongitude { get; set; }
    public double StartLatitude { get; set; }
    public double StartLongitude { get; set; }
    public string Instruction { get; set; }
    public string Polyline { get; set; }
    
    /// <summary>
    /// Gets or Sets ProgressStatus
    /// </summary>
    public enum ProgressStatusEnum
    {
        
        /// <summary>
        /// Enum PENDINGEnum for PENDING
        /// </summary>
        PENDINGEnum = 1,
        
        /// <summary>
        /// Enum COMPLETEEnum for COMPLETE
        /// </summary>
        COMPLETEEnum = 2,
        
        /// <summary>
        /// Enum INVALIDEnum for INVALID
        /// </summary>
        INVALIDEnum = 3
    }

    public ProgressStatusEnum ProgressStatus { get; set; }
    public bool Highlight { get; set; }
}


