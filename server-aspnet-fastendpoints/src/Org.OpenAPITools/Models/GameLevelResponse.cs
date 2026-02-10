namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class GameLevelResponse 
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
    public long GameLevelId { get; set; }
    public string GameType { get; set; }
    public bool Active { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    public string Difficulty { get; set; }
    public string AppVersion { get; set; }
    public long LikesCount { get; set; }
    public long DislikesCount { get; set; }
    public long CommentsCount { get; set; }
    public long DownloadCount { get; set; }
    public List<NoteResponse> Comments { get; set; }
    public bool Locked { get; set; }
    public bool Completed { get; set; }
    public long TicketsEarned { get; set; }
    public GameObjectListResponse GameObjects { get; set; }
    public bool HasLiked { get; set; }
    public AssetShortResponse Image { get; set; }
    public string GameData { get; set; }
    public string GameDataSuffix { get; set; }
    public ScoreListResponse Scores { get; set; }
    public AccountShortResponse Owner { get; set; }
    public UserPermissionsListResponse UserPermissionsList { get; set; }
    public List<NameStringValueResponse> Results { get; set; }
    public bool RandomizeGameObjects { get; set; }
    public TicketListResponse Tickets { get; set; }
    public bool AssignMission { get; set; }
    public AssetShortResponse Icon { get; set; }
    public string AuthorOverride { get; set; }
    public long UpdatedDate { get; set; }
    public long StartDate { get; set; }
    public long EndDate { get; set; }
    public string SplashTitle { get; set; }
    public string SplashMessage { get; set; }
    public bool HasFlagged { get; set; }
    public bool AllocateTickets { get; set; }
    public string TicketType { get; set; }
    public long TicketCount { get; set; }
    public long Points { get; set; }
    public string WinnerMessage { get; set; }
    public TutorialResponse Tutorial { get; set; }
    public string AppKey { get; set; }
    public string AppName { get; set; }
    
    /// <summary>
    /// Gets or Sets ScoringType
    /// </summary>
    public enum ScoringTypeEnum
    {
        
        /// <summary>
        /// Enum GAMELEVELEnum for GAME_LEVEL
        /// </summary>
        GAMELEVELEnum = 1,
        
        /// <summary>
        /// Enum GAMEOBJECTEnum for GAME_OBJECT
        /// </summary>
        GAMEOBJECTEnum = 2
    }

    public ScoringTypeEnum ScoringType { get; set; }
    public string TutorialTitle { get; set; }
    public string TutorialMessage { get; set; }
    public string TutorialAlignment { get; set; }
    public AssetShortResponse TutorialImage { get; set; }
    public long NextLevelId { get; set; }
    public OfferShortResponse Offer { get; set; }
}


