namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AchievementShortResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public long AchievementId { get; set; }
    public string Title { get; set; }
    public string Description { get; set; }
    public string AnalyticsTag { get; set; }
    public string RankType { get; set; }
    public int RankIncrement { get; set; }
    public bool Validate { get; set; }
    public string AppName { get; set; }
    public bool Active { get; set; }
    public long Updated { get; set; }
    public long Created { get; set; }
    public int TierCount { get; set; }
    public int MinIncrement { get; set; }
    public int MaxIncrement { get; set; }
    public string Returning { get; set; }
}


