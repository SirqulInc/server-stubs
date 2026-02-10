namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AlbumContestResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public long AlbumContestId { get; set; }
    public string ContestType { get; set; }
    public AccountShortResponse Owner { get; set; }
    public string Title { get; set; }
    public string Description { get; set; }
    
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
    public long LikeCount { get; set; }
    public long DislikeCount { get; set; }
    public int CommentsCount { get; set; }
    public int UserCount { get; set; }
    public List<NoteFullResponse> Comments { get; set; }
    public List<LikeResponse> Likes { get; set; }
    public List<ConnectionGroupShortResponse> ConnectionGroups { get; set; }
    public List<ConnectionResponse> Connections { get; set; }
    public bool HasLiked { get; set; }
    public Permissions UserPermissions { get; set; }
    public Permissions PublicPermissions { get; set; }
    public AlbumFullResponse Album1 { get; set; }
    public AlbumFullResponse Album2 { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public string LocationDescription { get; set; }
    public double Distance { get; set; }
    public long DateCreated { get; set; }
    public long DateUpdated { get; set; }
    
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
    public long VoteCount { get; set; }
    public string Returning { get; set; }
}


