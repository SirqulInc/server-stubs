namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Asset 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public string LocationDescription { get; set; }
    public long PremigrationId { get; set; }
    public long NewOwnerId { get; set; }
    public string FolderUri { get; set; }
    public string FileName { get; set; }
    public string MediaType { get; set; }
    public string MimeType { get; set; }
    public string MetaData { get; set; }
    public string Caption { get; set; }
    public int VersionCode { get; set; }
    public string VersionName { get; set; }
    public long LikeCount { get; set; }
    public long DislikeCount { get; set; }
    public long NoteCount { get; set; }
    public Account Owner { get; set; }
    public List<Note> Notes { get; set; }
    public List<YayOrNay> Likes { get; set; }
    public long AttachedAssetId { get; set; }
    public List<Flag> Flags { get; set; }
    public long FlagCount { get; set; }
    public FlagThreshold FlagThreshold { get; set; }
    
    /// <summary>
    /// Gets or Sets DefaultAlbumType
    /// </summary>
    public enum DefaultAlbumTypeEnum
    {
        
        /// <summary>
        /// Enum PROFILEEnum for PROFILE
        /// </summary>
        PROFILEEnum = 1,
        
        /// <summary>
        /// Enum DEFAULTPROFILEAVATAREnum for DEFAULT_PROFILE_AVATAR
        /// </summary>
        DEFAULTPROFILEAVATAREnum = 2,
        
        /// <summary>
        /// Enum DEFAULTAPPICONEnum for DEFAULT_APP_ICON
        /// </summary>
        DEFAULTAPPICONEnum = 3,
        
        /// <summary>
        /// Enum DEFAULTAPPLOGOEnum for DEFAULT_APP_LOGO
        /// </summary>
        DEFAULTAPPLOGOEnum = 4
    }

    public DefaultAlbumTypeEnum DefaultAlbumType { get; set; }
    public Album Album { get; set; }
    public Assignment Assignment { get; set; }
    public Application Application { get; set; }
    public string Display { get; set; }
    public string AppKey { get; set; }
    public long BillableId { get; set; }
    public string SubType { get; set; }
    public string ContentName { get; set; }
    public string Urifolder { get; set; }
    public long DefaultThreshold { get; set; }
}


