namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class BillableEntity 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public string Name { get; set; }
    public ContactInfo ContactInfo { get; set; }
    public Account Responsible { get; set; }
    public List<Retailer> Retailers { get; set; }
    public List<Account> Managers { get; set; }
    public List<Category> Categories { get; set; }
    public List<Filter> Filters { get; set; }
    public List<Asset> Media { get; set; }
    public Album MediaAlbum { get; set; }
    public Subscription Subscription { get; set; }
    public ThirdPartyNetwork DisbursementIntrospect { get; set; }
    public string AuthorizeNetTransactionKey { get; set; }
    public string AuthorizeNetApiKey { get; set; }
}


