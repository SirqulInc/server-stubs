namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ScoreResponse 
{
    
    /// <summary>
    /// Gets or Sets Action
    /// </summary>
    public enum ActionEnum
    {
        
        /// <summary>
        /// Enum DATAEnum for DATA
        /// </summary>
        DATAEnum = 1,
        
        /// <summary>
        /// Enum SAVEEnum for SAVE
        /// </summary>
        SAVEEnum = 2,
        
        /// <summary>
        /// Enum DELETEEnum for DELETE
        /// </summary>
        DELETEEnum = 3,
        
        /// <summary>
        /// Enum GETEnum for GET
        /// </summary>
        GETEnum = 4
    }

    public ActionEnum Action { get; set; }
    public long ScoreId { get; set; }
    
    /// <summary>
    /// Gets or Sets Status
    /// </summary>
    public enum StatusEnum
    {
        
        /// <summary>
        /// Enum COMPLETEDEnum for COMPLETED
        /// </summary>
        COMPLETEDEnum = 1,
        
        /// <summary>
        /// Enum OWNERCREDITEnum for OWNER_CREDIT
        /// </summary>
        OWNERCREDITEnum = 2,
        
        /// <summary>
        /// Enum SUMMATIONEnum for SUMMATION
        /// </summary>
        SUMMATIONEnum = 3,
        
        /// <summary>
        /// Enum TOURNAMENTEnum for TOURNAMENT
        /// </summary>
        TOURNAMENTEnum = 4
    }

    public StatusEnum Status { get; set; }
    public int Points { get; set; }
    public int TimeTaken { get; set; }
    public long TicketsEarned { get; set; }
    public string GameType { get; set; }
    public long AccountId { get; set; }
    public string AccountDisplay { get; set; }
}


