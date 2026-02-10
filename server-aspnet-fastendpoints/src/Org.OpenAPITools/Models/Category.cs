namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Category 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public string Name { get; set; }
    public string ShortName { get; set; }
    public string Description { get; set; }
    public string Type { get; set; }
    public Application Application { get; set; }
    public Category Parent { get; set; }
    public List<Category> Children { get; set; }
    public long ChildrenCount { get; set; }
    public string Display { get; set; }
    public string SqootSlug { get; set; }
    public Asset Asset { get; set; }
    public string ExternalId { get; set; }
    public string ExternalType { get; set; }
    public long FavoriteCount { get; set; }
    public Category Root { get; set; }
    public string Tree { get; set; }
    public string ParentName { get; set; }
    public long ParentId { get; set; }
    public long ApplicationId { get; set; }
    public string SecondaryType { get; set; }
}


