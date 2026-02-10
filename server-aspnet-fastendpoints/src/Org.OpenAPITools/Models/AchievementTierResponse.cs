namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AchievementTierResponse 
{
    public long AchievementTierId { get; set; }
    public string Title { get; set; }
    public string Description { get; set; }
    public long GoalCount { get; set; }
    public AssetShortResponse Icon { get; set; }
    public long MissionId { get; set; }
    public long GameId { get; set; }
    public long PackId { get; set; }
    public long GameLevelId { get; set; }
    public long GameObjectId { get; set; }
}


