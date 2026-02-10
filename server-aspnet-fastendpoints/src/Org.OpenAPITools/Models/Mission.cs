namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Mission 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public Account Owner { get; set; }
    
    /// <summary>
    /// Gets or Sets MissionType
    /// </summary>
    public enum MissionTypeEnum
    {
        
        /// <summary>
        /// Enum PUBLICEnum for PUBLIC
        /// </summary>
        PUBLICEnum = 1,
        
        /// <summary>
        /// Enum SHAREDEnum for SHARED
        /// </summary>
        SHAREDEnum = 2,
        
        /// <summary>
        /// Enum TOURNAMENTEnum for TOURNAMENT
        /// </summary>
        TOURNAMENTEnum = 3,
        
        /// <summary>
        /// Enum POOLPLAYEnum for POOLPLAY
        /// </summary>
        POOLPLAYEnum = 4
    }

    public MissionTypeEnum MissionType { get; set; }
    public string Title { get; set; }
    public string Description { get; set; }
    public int CostToPlay { get; set; }
    public string CostToPlayType { get; set; }
    public List<Game> Games { get; set; }
    public List<Audience> Audiences { get; set; }
    public DateTime StartDate { get; set; }
    public DateTime EndDate { get; set; }
    
    /// <summary>
    /// Gets or Sets SequenceType
    /// </summary>
    public enum SequenceTypeEnum
    {
        
        /// <summary>
        /// Enum FIRSTAVAILABLEEnum for FIRST_AVAILABLE
        /// </summary>
        FIRSTAVAILABLEEnum = 1,
        
        /// <summary>
        /// Enum ALLAVAILABLEEnum for ALL_AVAILABLE
        /// </summary>
        ALLAVAILABLEEnum = 2
    }

    public SequenceTypeEnum SequenceType { get; set; }
    public string AuthorOverride { get; set; }
    public Asset Icon { get; set; }
    public Asset Image { get; set; }
    public List<Offer> Offers { get; set; }
    
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
        /// Enum LISTABLEEnum for LISTABLE
        /// </summary>
        LISTABLEEnum = 2,
        
        /// <summary>
        /// Enum REWARDABLEEnum for REWARDABLE
        /// </summary>
        REWARDABLEEnum = 3,
        
        /// <summary>
        /// Enum TRIGGERABLEEnum for TRIGGERABLE
        /// </summary>
        TRIGGERABLEEnum = 4,
        
        /// <summary>
        /// Enum PRIVATEEnum for PRIVATE
        /// </summary>
        PRIVATEEnum = 5
    }

    public VisibilityEnum Visibility { get; set; }
    public MissionTask Task { get; set; }
    public long Points { get; set; }
    public string TicketType { get; set; }
    public long TicketCount { get; set; }
    public bool AllocateTickets { get; set; }
    public BillableEntity BillableEntity { get; set; }
    public double Balance { get; set; }
    public int StartingLimit { get; set; }
    public int AvailableLimit { get; set; }
    public int InviteCount { get; set; }
    public int AcceptedCount { get; set; }
    
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
    public long ChildCount { get; set; }
    public int SecondsBetweenLevels { get; set; }
    public int SecondsBetweenPacks { get; set; }
    public int MaximumLevelLength { get; set; }
    public bool EnableBuyBack { get; set; }
    public Pack ActivePack { get; set; }
    public int MinimumToPlay { get; set; }
    public bool FixedReward { get; set; }
    public bool Refunded { get; set; }
    public bool NotificationsCreated { get; set; }
    public bool Rewarded { get; set; }
    public long ExternalId { get; set; }
    public bool AdvancedReporting { get; set; }
    
    /// <summary>
    /// Gets or Sets SplitReward
    /// </summary>
    public enum SplitRewardEnum
    {
        
        /// <summary>
        /// Enum EVENEnum for EVEN
        /// </summary>
        EVENEnum = 1,
        
        /// <summary>
        /// Enum ALLEnum for ALL
        /// </summary>
        ALLEnum = 2,
        
        /// <summary>
        /// Enum FIRSTEnum for FIRST
        /// </summary>
        FIRSTEnum = 3,
        
        /// <summary>
        /// Enum RANDOMEnum for RANDOM
        /// </summary>
        RANDOMEnum = 4
    }

    public SplitRewardEnum SplitReward { get; set; }
    public string JoinCode { get; set; }
    public Pack FirstPack { get; set; }
    public List<GameLevel> AllGameLevels { get; set; }
    public List<Pack> AllPacks { get; set; }
}


