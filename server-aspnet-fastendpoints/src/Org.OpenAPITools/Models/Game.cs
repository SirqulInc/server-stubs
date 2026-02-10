namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Game 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public Account Owner { get; set; }
    public Application Application { get; set; }
    public string Title { get; set; }
    public string Description { get; set; }
    public DateTime StartDate { get; set; }
    public DateTime EndDate { get; set; }
    public List<Pack> Packs { get; set; }
    
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
    public long Points { get; set; }
    public string TicketType { get; set; }
    public long TicketCount { get; set; }
    public bool AllocateTickets { get; set; }
    public List<GameLevel> AllGameLevels { get; set; }
    public string ContentName { get; set; }
    public string ContentType { get; set; }
}


