namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class LeaderboardFullResponse 
{
    public long LeaderboardId { get; set; }
    public string RankType { get; set; }
    public string RankMode { get; set; }
    public string SortType { get; set; }
    public int Limitation { get; set; }
    public string Title { get; set; }
    public string Description { get; set; }
    public string MetaData { get; set; }
    public AssetResponse IconAsset { get; set; }
    public AssetResponse BannerAsset { get; set; }
    public bool Active { get; set; }
    public ApplicationMiniResponse Application { get; set; }
    public RankListResponse LeaderboardRankings { get; set; }
}


