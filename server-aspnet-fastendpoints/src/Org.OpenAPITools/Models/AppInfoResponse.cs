namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AppInfoResponse 
{
    public long Points { get; set; }
    public long TicketsAvailable { get; set; }
    public long TicketsEarned { get; set; }
    public long TicketsPurchased { get; set; }
    public long TicketsUsed { get; set; }
    public string Rank { get; set; }
    public long MaxPoints { get; set; }
    public long MaxTickets { get; set; }
    public float PointToTicketModifier { get; set; }
    
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
    public PurchaseItemListResponse PurchaseItemListResponse { get; set; }
    public long TermsAcceptedDate { get; set; }
    public bool RequiresTermsAcceptance { get; set; }
    public List<AchievementProgressResponse> CompletedAchievements { get; set; }
    public List<AchievementProgressResponse> WipAchievements { get; set; }
    public string AppBlob { get; set; }
    public bool EnablePush { get; set; }
    public bool EnableSMS { get; set; }
    public bool EnableEmail { get; set; }
    public List<TicketCountResponse> TicketCounts { get; set; }
}


