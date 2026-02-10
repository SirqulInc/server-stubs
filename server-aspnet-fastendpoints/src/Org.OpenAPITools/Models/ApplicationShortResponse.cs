namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ApplicationShortResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public long ApplicationId { get; set; }
    public string AppKey { get; set; }
    public string Title { get; set; }
    public string CurrentBuildVersion { get; set; }
    public string CurrentApiVersion { get; set; }
    public AssetShortResponse AppIcon { get; set; }
    public AssetShortResponse AppLogo { get; set; }
    public bool Active { get; set; }
    public string About { get; set; }
    public string LandingPageUrl { get; set; }
    public string LandingPageFullUrl { get; set; }
    public string DefaultImageFullUrl { get; set; }
    public string ActivityDescription { get; set; }
    public List<PlatformResponse> Platforms { get; set; }
    public List<CategoryResponse> Categories { get; set; }
    public int PlacementCount { get; set; }
    public BillableEntityShortResponse Billable { get; set; }
    public bool HasAds { get; set; }
    public bool PublicNotifications { get; set; }
    public string UrlScheme { get; set; }
    public bool Global { get; set; }
    public string DownloadUrls { get; set; }
    public bool LocalAdsEnabled { get; set; }
    public TrilatAppSettings TrilatSettings { get; set; }
    public string Returning { get; set; }
}


