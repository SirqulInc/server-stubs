namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class GameObjectResponse 
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
    public long GameObjectId { get; set; }
    public string GameType { get; set; }
    public long TicketsEarned { get; set; }
    public ScoreListResponse Scores { get; set; }
    public TicketListResponse Tickets { get; set; }
    public List<NameStringValueResponse> Items { get; set; }
    public bool AllocateTickets { get; set; }
}


