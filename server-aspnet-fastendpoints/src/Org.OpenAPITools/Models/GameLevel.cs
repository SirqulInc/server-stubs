namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class GameLevel 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public long NewOwnerId { get; set; }
    
    /// <summary>
    /// Gets or Sets GameDifficulty
    /// </summary>
    public enum GameDifficultyEnum
    {
        
        /// <summary>
        /// Enum VERYEASYEnum for VERY_EASY
        /// </summary>
        VERYEASYEnum = 1,
        
        /// <summary>
        /// Enum EASYEnum for EASY
        /// </summary>
        EASYEnum = 2,
        
        /// <summary>
        /// Enum MEDIUMEnum for MEDIUM
        /// </summary>
        MEDIUMEnum = 3,
        
        /// <summary>
        /// Enum HARDEnum for HARD
        /// </summary>
        HARDEnum = 4,
        
        /// <summary>
        /// Enum VERYHARDEnum for VERY_HARD
        /// </summary>
        VERYHARDEnum = 5
    }

    public GameDifficultyEnum GameDifficulty { get; set; }
    public string Name { get; set; }
    public Asset Image { get; set; }
    public Asset Icon { get; set; }
    public string Description { get; set; }
    public DateTime StartDate { get; set; }
    public DateTime EndDate { get; set; }
    public bool RandomizeGameObjects { get; set; }
    public Account Owner { get; set; }
    public AppVersion VarVersion { get; set; }
    public List<Note> Notes { get; set; }
    public long NoteCount { get; set; }
    public List<YayOrNay> Likes { get; set; }
    public long LikeCount { get; set; }
    public long DislikeCount { get; set; }
    public long PlayCount { get; set; }
    public long DownloadCount { get; set; }
    public int GameObjectCount { get; set; }
    public Permissions PublicPermissions { get; set; }
    
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
    public List<UserPermissions> UserPermissions { get; set; }
    public List<Flag> Flags { get; set; }
    public long FlagCount { get; set; }
    public FlagThreshold FlagThreshold { get; set; }
    public Application Application { get; set; }
    public bool AssignMission { get; set; }
    public string AuthorOverride { get; set; }
    public string SplashTitle { get; set; }
    public string SplashMessage { get; set; }
    public string WinnerMessage { get; set; }
    public Tutorial Tutorial { get; set; }
    
    /// <summary>
    /// Gets or Sets ApprovalStatus
    /// </summary>
    public enum ApprovalStatusEnum
    {
        
        /// <summary>
        /// Enum PENDINGEnum for PENDING
        /// </summary>
        PENDINGEnum = 1,
        
        /// <summary>
        /// Enum REJECTEDEnum for REJECTED
        /// </summary>
        REJECTEDEnum = 2,
        
        /// <summary>
        /// Enum APPROVEDEnum for APPROVED
        /// </summary>
        APPROVEDEnum = 3,
        
        /// <summary>
        /// Enum FEATUREDEnum for FEATURED
        /// </summary>
        FEATUREDEnum = 4
    }

    public ApprovalStatusEnum ApprovalStatus { get; set; }
    public GameLevel NextLevel { get; set; }
    public Offer Offer { get; set; }
    public double Balance { get; set; }
    public int LevelNumber { get; set; }
    public long Points { get; set; }
    public string TicketType { get; set; }
    public long TicketCount { get; set; }
    public bool AllocateTickets { get; set; }
    public string ApplicationTitle { get; set; }
    public string OwnerUsername { get; set; }
    public List<Dictionary<string, Object>> LikableNotificationModels { get; set; }
    public List<Dictionary<string, Object>> NotableNotificationModels { get; set; }
    public bool Published { get; set; }
    public string ContentName { get; set; }
    public long DefaultThreshold { get; set; }
    public Asset ContentAsset { get; set; }
    public string ContentType { get; set; }
}


