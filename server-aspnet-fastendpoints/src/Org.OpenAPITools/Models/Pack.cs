namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Pack 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public long NewOwnerId { get; set; }
    public Account Owner { get; set; }
    public Application Application { get; set; }
    
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
    public string Title { get; set; }
    public string Description { get; set; }
    public DateTime StartDate { get; set; }
    public DateTime EndDate { get; set; }
    
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
    public Asset Image { get; set; }
    public Asset Background { get; set; }
    public string ImageURL { get; set; }
    public List<GameLevel> GameLevels { get; set; }
    public bool HasMoreItems { get; set; }
    public long TotalCount { get; set; }
    public bool Downloaded { get; set; }
    public string AuthorOverride { get; set; }
    public long PackOrder { get; set; }
    public bool InGame { get; set; }
    public bool Highest { get; set; }
    public int NotificationCount { get; set; }
    public long Points { get; set; }
    public string TicketType { get; set; }
    public long TicketCount { get; set; }
    public string PriceType { get; set; }
    public int Price { get; set; }
    public bool AllocateTickets { get; set; }
    public string ApplicationTitle { get; set; }
    public Dictionary<string, GameLevel> LevelNumberMap { get; set; }
}


