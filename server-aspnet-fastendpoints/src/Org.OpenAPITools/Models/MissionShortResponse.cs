namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class MissionShortResponse 
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
    public string HighestAppVersion { get; set; }
    public long MissionId { get; set; }
    public long TicketsEarned { get; set; }
    public int CostToPlay { get; set; }
    public string CostToPlayType { get; set; }
    public AccountShortResponse Owner { get; set; }
    public string Title { get; set; }
    public string Description { get; set; }
    public string AuthorOverride { get; set; }
    public AssetShortResponse Icon { get; set; }
    public AssetShortResponse Image { get; set; }
    public string SequenceType { get; set; }
    public long UpdatedDate { get; set; }
    public long StartDate { get; set; }
    public long EndDate { get; set; }
    public string MissionType { get; set; }
    public bool Active { get; set; }
    public double Balance { get; set; }
    public int AvailableLimit { get; set; }
    public int InviteCount { get; set; }
    public int AcceptedCount { get; set; }
    public long ChildCount { get; set; }
    public bool EnableBuyBack { get; set; }
    public int MinimumToPlay { get; set; }
    public bool Rewarded { get; set; }
    public bool Refunded { get; set; }
    public string JoinCode { get; set; }
}


