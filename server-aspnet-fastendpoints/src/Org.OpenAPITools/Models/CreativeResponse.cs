namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreativeResponse 
{
    public long CreativeId { get; set; }
    public bool Active { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    public AssetShortResponse Image { get; set; }
    public string Action { get; set; }
    public JsonElement Content { get; set; }
    public string Suffix { get; set; }
    public string Type { get; set; }
    public string AppVersion { get; set; }
    public bool Preview { get; set; }
    public AccountShortResponse Owner { get; set; }
    public BidResponse CurrentBid { get; set; }
}


