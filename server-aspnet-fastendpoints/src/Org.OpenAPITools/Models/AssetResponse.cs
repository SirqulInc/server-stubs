namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AssetResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public long AssetId { get; set; }
    public string FileName { get; set; }
    public string Caption { get; set; }
    public string MediaType { get; set; }
    public string ThumbnailURL { get; set; }
    public string CoverURL { get; set; }
    public string FullURL { get; set; }
    public string AssetVersion { get; set; }
    public string VersionName { get; set; }
    public int VersionCode { get; set; }
    public string Display { get; set; }
    public string LocationDescription { get; set; }
    public AccountShortResponse Uploader { get; set; }
    public long LikesCount { get; set; }
    public int CommentsCount { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public string AttachedMediaType { get; set; }
    public string AttachedAssetURL { get; set; }
    public long Created { get; set; }
    public long Updated { get; set; }
    public string SearchTags { get; set; }
    public string MetaData { get; set; }
    public string Returning { get; set; }
}


