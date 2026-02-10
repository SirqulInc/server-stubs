namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Application 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public string Title { get; set; }
    public string About { get; set; }
    public string CertificateUrl { get; set; }
    public string CertificateName { get; set; }
    public BlobFile Certificate { get; set; }
    public DateTime CertificateLastUpdated { get; set; }
    public string AppDescription { get; set; }
    public bool ShowInActivities { get; set; }
    public string CssClass { get; set; }
    public string InviteWelcomeText { get; set; }
    public string BundleId { get; set; }
    public string AppType { get; set; }
    
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
    public string AppKey { get; set; }
    public string AppRestKey { get; set; }
    public string AppTokenKey { get; set; }
    public int HintCost { get; set; }
    public DateTime EulaDate { get; set; }
    public string EulaVersion { get; set; }
    public string LandingPageUrl { get; set; }
    public string InvitePageUrl { get; set; }
    public string DownloadUrls { get; set; }
    public string AppName { get; set; }
    public Asset AppIcon { get; set; }
    public Asset AppLogo { get; set; }
    public BillableEntity BillableEntity { get; set; }
    public string FacebookAppId { get; set; }
    public string FacebookAppSecret { get; set; }
    public string TwitterAppId { get; set; }
    public string TwitterAppSecret { get; set; }
    public string TwitterCallbackURL { get; set; }
    public string DefaultImage { get; set; }
    public string Modules { get; set; }
    public string AuthorizedServers { get; set; }
    public int AuthorizedCount { get; set; }
    public string ActiveServers { get; set; }
    public DateTime LicensePeriod { get; set; }
    public bool HasGameData { get; set; }
    public string CurrentBuildVersion { get; set; }
    public string CurrentApiVersion { get; set; }
    public bool GlobalTickets { get; set; }
    public float TicketsPerPoint { get; set; }
    public int MaxPointsPerScore { get; set; }
    public bool UseAppCache { get; set; }
    public string UniqueUserTag { get; set; }
    public bool UseMatchingAlgorithm { get; set; }
    public List<Platform> Platforms { get; set; }
    public List<Category> Categories { get; set; }
    public List<Placement> Placements { get; set; }
    public bool HasAdvertisements { get; set; }
    public string AppleAppId { get; set; }
    public string GoogleAppId { get; set; }
    public string GoogleApiKey { get; set; }
    public string GoogleOAuthClientId { get; set; }
    public string GoogleOAuthSecret { get; set; }
    public string GoogleOAuthAccessToken { get; set; }
    public string GoogleOAuthRefreshToken { get; set; }
    public string BaiduApiKey { get; set; }
    public string BaiduSecretKey { get; set; }
    public string JpushAppKey { get; set; }
    public string JpushMasterSecret { get; set; }
    public string XgPushSecretKey { get; set; }
    public bool PublicNotifications { get; set; }
    public string UrlScheme { get; set; }
    public Retailer Retailer { get; set; }
    public string ObjectStoreSession { get; set; }
    public bool PublicContentApproval { get; set; }
    public bool ProductionMode { get; set; }
    public string GriplyBaseUrl { get; set; }
    public int MinimumSessionLength { get; set; }
    public int SessionGapLength { get; set; }
    public bool ProcessSessionData { get; set; }
    public bool LocalAdsEnabled { get; set; }
    public bool IncludeInReport { get; set; }
    public string SqootApiKey { get; set; }
    public bool AmqpEnabled { get; set; }
    public TrilatAppSettings TrilatSettings { get; set; }
}


