namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class RankListResponse 
{
    public List<RankResponse> Items { get; set; }
    public RankResponse UserRank { get; set; }
    public bool HasMoreResults { get; set; }
    public int Count { get; set; }
    public string RankType { get; set; }
    public string App { get; set; }
    public string SortField { get; set; }
    
    /// <summary>
    /// Gets or Sets LeaderboardMode
    /// </summary>
    public enum LeaderboardModeEnum
    {
        
        /// <summary>
        /// Enum GLOBALEnum for GLOBAL
        /// </summary>
        GLOBALEnum = 1,
        
        /// <summary>
        /// Enum FRIENDSEnum for FRIENDS
        /// </summary>
        FRIENDSEnum = 2,
        
        /// <summary>
        /// Enum LOCALEnum for LOCAL
        /// </summary>
        LOCALEnum = 3,
        
        /// <summary>
        /// Enum SEARCHEnum for SEARCH
        /// </summary>
        SEARCHEnum = 4,
        
        /// <summary>
        /// Enum CUSTOMEnum for CUSTOM
        /// </summary>
        CUSTOMEnum = 5
    }

    public LeaderboardModeEnum LeaderboardMode { get; set; }
    public long Start { get; set; }
    public long Limit { get; set; }
}


