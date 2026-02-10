namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Album 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public string LocationDescription { get; set; }
    public Account Owner { get; set; }
    public string Title { get; set; }
    public Application Application { get; set; }
    
    /// <summary>
    /// Gets or Sets ApprovalStatus
    /// </summary>
    public enum ApprovalStatusEnum
    {
        
        /// <summary>
        /// Enum PENDINGEnum for PENDING
        /// </summary>
        PENDINGEnum = 1,
        
        /// <summary>
        /// Enum REJECTEDEnum for REJECTED
        /// </summary>
        REJECTEDEnum = 2,
        
        /// <summary>
        /// Enum APPROVEDEnum for APPROVED
        /// </summary>
        APPROVEDEnum = 3,
        
        /// <summary>
        /// Enum FEATUREDEnum for FEATURED
        /// </summary>
        FEATUREDEnum = 4
    }

    public ApprovalStatusEnum ApprovalStatus { get; set; }
    public Permissions PublicPermissions { get; set; }
    public List<UserPermissions> UserPermissions { get; set; }
    
    /// <summary>
    /// Gets or Sets Visibility
    /// </summary>
    public enum VisibilityEnum
    {
        
        /// <summary>
        /// Enum PUBLICEnum for PUBLIC
        /// </summary>
        PUBLICEnum = 1,
        
        /// <summary>
        /// Enum PRIVATEEnum for PRIVATE
        /// </summary>
        PRIVATEEnum = 2,
        
        /// <summary>
        /// Enum FRIENDSEnum for FRIENDS
        /// </summary>
        FRIENDSEnum = 3
    }

    public VisibilityEnum Visibility { get; set; }
    public List<Note> Notes { get; set; }
    public long NoteCount { get; set; }
    public List<YayOrNay> Likes { get; set; }
    public long LikeCount { get; set; }
    public long DislikeCount { get; set; }
    public List<Flag> Flags { get; set; }
    public long FlagCount { get; set; }
    public FlagThreshold FlagThreshold { get; set; }
    public string Description { get; set; }
    public string AlbumType { get; set; }
    public List<Asset> Assets { get; set; }
    public Asset CoverAsset { get; set; }
    public string Tags { get; set; }
    public DateTime StartDate { get; set; }
    public DateTime EndDate { get; set; }
    public ContactInfo ContactInfo { get; set; }
    public long AssetCount { get; set; }
    public long FavoriteCount { get; set; }
    public long ViewedCount { get; set; }
    public long ClickedCount { get; set; }
    public long SharedCount { get; set; }
    public bool Anonymous { get; set; }
    public string OwnerUsername { get; set; }
    public string Display { get; set; }
    public string AppKey { get; set; }
    public long BillableId { get; set; }
    public string SubType { get; set; }
    public Asset ContentAsset { get; set; }
    public string SecondaryType { get; set; }
    public string ContentName { get; set; }
    public string ApplicationTitle { get; set; }
    public string ShortTitle { get; set; }
    public long DefaultThreshold { get; set; }
}


