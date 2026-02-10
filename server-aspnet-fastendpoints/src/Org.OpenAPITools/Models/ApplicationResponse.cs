namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ApplicationResponse 
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
    public string AppType { get; set; }
    public string AppName { get; set; }
    public string BundleId { get; set; }
    
    /// <summary>
    /// Gets or Sets ScoringType
    /// </summary>
    public enum ScoringTypeEnum
    {
        
        /// <summary>
        /// Enum GAMELEVELEnum for GAME_LEVEL
        /// </summary>
        GAMELEVELEnum = 1,
        
        /// <summary>
        /// Enum GAMEOBJECTEnum for GAME_OBJECT
        /// </summary>
        GAMEOBJECTEnum = 2
    }

    public ScoringTypeEnum ScoringType { get; set; }
    public int HintCost { get; set; }
    public int MaxScore { get; set; }
    public float TicketsPerPoint { get; set; }
    public bool HasGameData { get; set; }
    public bool GlobalTickets { get; set; }
    public string EulaVersion { get; set; }
    public long EulaDateUpdated { get; set; }
    public string Modules { get; set; }
    public string BillableEntityName { get; set; }
    public bool ShowInActivities { get; set; }
    public string CssClass { get; set; }
    public string InviteWelcomeText { get; set; }
    public string InvitePageUrl { get; set; }
    public string ApnsCertificateFileName { get; set; }
    public string FacebookAppId { get; set; }
    public string FacebookAppSecret { get; set; }
    public string AppToken { get; set; }
    public string GoogleApiKey { get; set; }
    public string AppRestKey { get; set; }
    public bool PublicContentApproval { get; set; }
    public bool ProductionMode { get; set; }
    public int MinimumSessionLength { get; set; }
    public int SessionGapLength { get; set; }
    public string SqootApiKey { get; set; }
    public bool AmqpEnabled { get; set; }
    public int AuthorizedCount { get; set; }
    public string AuthorizedServers { get; set; }
    public string Returning { get; set; }
}


