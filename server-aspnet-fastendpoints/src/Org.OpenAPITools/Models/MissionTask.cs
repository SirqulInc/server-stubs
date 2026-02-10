namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class MissionTask 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    public string Format { get; set; }
    public string Suffix { get; set; }
    
    /// <summary>
    /// Gets or Sets TaskType
    /// </summary>
    public enum TaskTypeEnum
    {
        
        /// <summary>
        /// Enum PHOTOEnum for PHOTO
        /// </summary>
        PHOTOEnum = 1,
        
        /// <summary>
        /// Enum VOTEEnum for VOTE
        /// </summary>
        VOTEEnum = 2,
        
        /// <summary>
        /// Enum ASKEnum for ASK
        /// </summary>
        ASKEnum = 3,
        
        /// <summary>
        /// Enum ANSWEREnum for ANSWER
        /// </summary>
        ANSWEREnum = 4,
        
        /// <summary>
        /// Enum GROUPEnum for GROUP
        /// </summary>
        GROUPEnum = 5,
        
        /// <summary>
        /// Enum INVITEEnum for INVITE
        /// </summary>
        INVITEEnum = 6,
        
        /// <summary>
        /// Enum OFFEREnum for OFFER
        /// </summary>
        OFFEREnum = 7,
        
        /// <summary>
        /// Enum ADEnum for AD
        /// </summary>
        ADEnum = 8,
        
        /// <summary>
        /// Enum CUSTOMEnum for CUSTOM
        /// </summary>
        CUSTOMEnum = 9,
        
        /// <summary>
        /// Enum GAMEEnum for GAME
        /// </summary>
        GAMEEnum = 10
    }

    public TaskTypeEnum TaskType { get; set; }
}


