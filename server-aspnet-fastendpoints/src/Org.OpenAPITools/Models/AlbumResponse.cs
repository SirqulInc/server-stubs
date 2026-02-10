namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AlbumResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public long AlbumId { get; set; }
    public string AlbumType { get; set; }
    public long OwnerId { get; set; }
    public AccountShortResponse Owner { get; set; }
    public string Title { get; set; }
    public string Description { get; set; }
    public AssetResponse CoverAsset { get; set; }
    public string Tags { get; set; }
    
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
    public long StartDate { get; set; }
    public long EndDate { get; set; }
    public int AssetCount { get; set; }
    public long LikeCount { get; set; }
    public long DislikeCount { get; set; }
    public long CommentsCount { get; set; }
    public int UserCount { get; set; }
    public bool Notifications { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public string LocationDescription { get; set; }
    public double Distance { get; set; }
    public long DateCreated { get; set; }
    public long DateUpdated { get; set; }
    public string CellPhone { get; set; }
    public string FullAddress { get; set; }
    
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
    public long FavoriteCount { get; set; }
    public bool Liked { get; set; }
    public bool Favorite { get; set; }
    public long FavoriteId { get; set; }
    public bool Anonymous { get; set; }
    public long FlagCount { get; set; }
    public long ViewedCount { get; set; }
    public long ClickedCount { get; set; }
    public long SharedCount { get; set; }
    public string Returning { get; set; }
}


