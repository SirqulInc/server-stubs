namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PackResponse 
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
    public string GameType { get; set; }
    public long PackId { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    public bool Active { get; set; }
    public bool Downloaded { get; set; }
    public bool Completed { get; set; }
    public AssetShortResponse Icon { get; set; }
    public AssetShortResponse Background { get; set; }
    public long TicketsEarned { get; set; }
    public GameLevelListResponse Levels { get; set; }
    public string SequenceType { get; set; }
    public ScoreListResponse Scores { get; set; }
    public AccountShortResponse Owner { get; set; }
    public long CostToRedeem { get; set; }
    public long Price { get; set; }
    public string PriceType { get; set; }
    public UserPermissionsListResponse UserPermissionsList { get; set; }
    public List<NameStringValueResponse> Results { get; set; }
    public TicketListResponse Tickets { get; set; }
    public string AuthorOverride { get; set; }
    public long UpdatedDate { get; set; }
    public long StartDate { get; set; }
    public long EndDate { get; set; }
    
    /// <summary>
    /// Gets or Sets PackType
    /// </summary>
    public enum PackTypeEnum
    {
        
        /// <summary>
        /// Enum TUTORIALEnum for TUTORIAL
        /// </summary>
        TUTORIALEnum = 1,
        
        /// <summary>
        /// Enum BUILTINEnum for BUILTIN
        /// </summary>
        BUILTINEnum = 2,
        
        /// <summary>
        /// Enum DOWNLOADEnum for DOWNLOAD
        /// </summary>
        DOWNLOADEnum = 3,
        
        /// <summary>
        /// Enum THRESHOLDEnum for THRESHOLD
        /// </summary>
        THRESHOLDEnum = 4,
        
        /// <summary>
        /// Enum THEMEEnum for THEME
        /// </summary>
        THEMEEnum = 5,
        
        /// <summary>
        /// Enum TOURNAMENTEnum for TOURNAMENT
        /// </summary>
        TOURNAMENTEnum = 6
    }

    public PackTypeEnum PackType { get; set; }
    public long PackOrder { get; set; }
    public string AppKey { get; set; }
    public ApplicationShortResponse Application { get; set; }
    public bool InGame { get; set; }
    public bool Highest { get; set; }
    public bool AllocateTickets { get; set; }
    public string TicketType { get; set; }
    public long TicketCount { get; set; }
    public long Points { get; set; }
}


