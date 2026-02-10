namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class RetailerLocation 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public string LocationDescription { get; set; }
    public List<Category> Categories { get; set; }
    public List<Filter> Filters { get; set; }
    public List<OfferLocation> OfferLocations { get; set; }
    public Asset Logo { get; set; }
    public Asset Picture1 { get; set; }
    public Asset Picture2 { get; set; }
    public Asset QrCode { get; set; }
    public string Name { get; set; }
    public string LocationId { get; set; }
    public string Code { get; set; }
    public Retailer Retailer { get; set; }
    public List<Assignment> Assignments { get; set; }
    public Assignment CurrentAssignment { get; set; }
    public RetailerProfile Profile { get; set; }
    public List<Region> Regions { get; set; }
    public string OfferPrintKeyPrefix { get; set; }
    public List<Account> Administrators { get; set; }
    public long SqootId { get; set; }
    public long YipitId { get; set; }
    public string LocationToken { get; set; }
    public Building Building { get; set; }
    public List<Note> Notes { get; set; }
    public long NoteCount { get; set; }
    public DateTime SearchIndexUpdated { get; set; }
    public bool InSearchIndex { get; set; }
    public long FavoriteCount { get; set; }
    public bool HasRatings { get; set; }
    public string GooglePlaceId { get; set; }
    public string YelpId { get; set; }
    public string Display { get; set; }
    public string AppKey { get; set; }
    public string CategoryTree { get; set; }
    public string FilterTree { get; set; }
    public string AddressDisplay { get; set; }
    public string MapQuery { get; set; }
    public string SortName { get; set; }
    public string FullDisplay { get; set; }
    public bool HasOffers { get; set; }
    public long BillableId { get; set; }
    public string SubType { get; set; }
    public string ContentName { get; set; }
    public Account Owner { get; set; }
    public string SecondaryType { get; set; }
    public string LocationAddress { get; set; }
    public List<long> ValidOfferLocationIds { get; set; }
}


