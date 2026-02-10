namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AchievementProgressResponse 
{
    public long AchievementId { get; set; }
    public long AchievementTierId { get; set; }
    public string Title { get; set; }
    public string Description { get; set; }
    public AssetShortResponse Icon { get; set; }
    public bool Completed { get; set; }
    public long ProgressCount { get; set; }
    public long GoalCount { get; set; }
    public long DateUpdated { get; set; }
}


