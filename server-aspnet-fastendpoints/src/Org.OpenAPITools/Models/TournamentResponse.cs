namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TournamentResponse 
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
    public List<RewardResponse> Rewards { get; set; }
    public GameListResponse Games { get; set; }
    public ScoreListResponse Scores { get; set; }
    public UserPermissionsListResponse UserPermissionsList { get; set; }
    public List<NameStringValueResponse> Results { get; set; }
    
    /// <summary>
    /// Gets or Sets InviteStatus
    /// </summary>
    public enum InviteStatusEnum
    {
        
        /// <summary>
        /// Enum AVAILABLEEnum for AVAILABLE
        /// </summary>
        AVAILABLEEnum = 1,
        
        /// <summary>
        /// Enum PENDINGEnum for PENDING
        /// </summary>
        PENDINGEnum = 2,
        
        /// <summary>
        /// Enum UPDATEDEnum for UPDATED
        /// </summary>
        UPDATEDEnum = 3,
        
        /// <summary>
        /// Enum ACCEPTEDEnum for ACCEPTED
        /// </summary>
        ACCEPTEDEnum = 4,
        
        /// <summary>
        /// Enum ACTIVEEnum for ACTIVE
        /// </summary>
        ACTIVEEnum = 5,
        
        /// <summary>
        /// Enum BUYBACKEnum for BUY_BACK
        /// </summary>
        BUYBACKEnum = 6,
        
        /// <summary>
        /// Enum FAILEDEnum for FAILED
        /// </summary>
        FAILEDEnum = 7,
        
        /// <summary>
        /// Enum QUITEnum for QUIT
        /// </summary>
        QUITEnum = 8,
        
        /// <summary>
        /// Enum COMPLETEDEnum for COMPLETED
        /// </summary>
        COMPLETEDEnum = 9,
        
        /// <summary>
        /// Enum PENDINGREVIEWEnum for PENDING_REVIEW
        /// </summary>
        PENDINGREVIEWEnum = 10,
        
        /// <summary>
        /// Enum REJECTEDEnum for REJECTED
        /// </summary>
        REJECTEDEnum = 11
    }

    public InviteStatusEnum InviteStatus { get; set; }
    public List<AudienceResponse> Audiences { get; set; }
    public long MissionInviteId { get; set; }
    public MissionInviteResponse MissionInvite { get; set; }
    public AccountShortResponse Invitee { get; set; }
    public string FormatType { get; set; }
    public List<CreativeResponse> Creatives { get; set; }
    public bool FixedReward { get; set; }
    public bool AllocateTickets { get; set; }
    public string TicketType { get; set; }
    public long TicketCount { get; set; }
    public long Points { get; set; }
    public string SplitReward { get; set; }
    public int SecondsBetweenLevels { get; set; }
    public int SecondsBetweenPacks { get; set; }
    public bool AdvancedReporting { get; set; }
    public string TournamentData { get; set; }
}


