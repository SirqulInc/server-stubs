namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CategoryResponse 
{
    public long CategoryId { get; set; }
    public string Name { get; set; }
    public string Display { get; set; }
    public long SubCategoryCount { get; set; }
    public long ParentId { get; set; }
    public string ParentName { get; set; }
    public string Description { get; set; }
    public bool Active { get; set; }
    public AssetShortResponse Asset { get; set; }
    public long FavoriteId { get; set; }
    public bool Favorite { get; set; }
    public long ApplicationId { get; set; }
    public string Type { get; set; }
    public string ExternalId { get; set; }
    public string ExternalType { get; set; }
}


