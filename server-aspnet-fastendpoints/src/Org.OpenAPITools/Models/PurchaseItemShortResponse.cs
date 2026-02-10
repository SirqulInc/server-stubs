namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PurchaseItemShortResponse 
{
    public long Id { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    public int Tickets { get; set; }
    public AssetShortResponse CoverAsset { get; set; }
    public AssetShortResponse PromoAsset { get; set; }
    public bool Giftable { get; set; }
    public bool Assetable { get; set; }
}


