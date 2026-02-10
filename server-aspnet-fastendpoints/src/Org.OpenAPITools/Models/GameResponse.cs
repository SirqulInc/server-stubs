namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class GameResponse 
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
    public long GameId { get; set; }
    public string GameType { get; set; }
    public PackListResponse Packs { get; set; }
    public ScoreListResponse Scores { get; set; }
    public AccountShortResponse Owner { get; set; }
    public UserPermissionsListResponse UserPermissionsList { get; set; }
    public RuleListResponse Rules { get; set; }
    public List<NameStringValueResponse> Results { get; set; }
    public long TicketsEarned { get; set; }
    public string Title { get; set; }
    public string Description { get; set; }
    public string AuthorOverride { get; set; }
    public AssetShortResponse Icon { get; set; }
    public AssetShortResponse Image { get; set; }
    public string SequenceType { get; set; }
    public long UpdatedDate { get; set; }
    public long StartDate { get; set; }
    public long EndDate { get; set; }
    public string AppKey { get; set; }
}


