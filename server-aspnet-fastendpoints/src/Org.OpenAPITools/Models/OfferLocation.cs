namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OfferLocation 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public string LocationDescription { get; set; }
    public Offer Offer { get; set; }
    public RetailerLocation Location { get; set; }
    public double Distance { get; set; }
    public double Altitude { get; set; }
    public double CustomValue { get; set; }
    public string LocationDetail { get; set; }
    public List<Audience> Audiences { get; set; }
    public Asset QrInviteCode { get; set; }
    public List<Note> Notes { get; set; }
    public long NoteCount { get; set; }
    public DateTime SearchIndexUpdated { get; set; }
    public bool InSearchIndex { get; set; }
    public long FavoriteCount { get; set; }
    public int AddedCount { get; set; }
    public string Display { get; set; }
    public string AppKey { get; set; }
    public double DevicePower { get; set; }
    public double PowerLoss { get; set; }
    public string Udid { get; set; }
    public long BillableId { get; set; }
    public string SubType { get; set; }
    public string ContentName { get; set; }
    public Asset ContentAsset { get; set; }
    public Account Owner { get; set; }
    public string SecondaryType { get; set; }
    public List<long> CategoryIds { get; set; }
    public List<long> FilterIds { get; set; }
}


