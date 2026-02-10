namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Location 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public string LocationDescription { get; set; }
    public string Name { get; set; }
    public Territory Territory { get; set; }
    public ServiceHub Hub { get; set; }
    public Asset Picture { get; set; }
    public List<Note> Notes { get; set; }
    public long NoteCount { get; set; }
    public string HomePhone { get; set; }
    public string CellPhone { get; set; }
    public CellCarrier CellCarrier { get; set; }
    public string BusinessPhone { get; set; }
    public string BusinessPhoneExt { get; set; }
    public string FaxNumber { get; set; }
    public string VarTimeZone { get; set; }
    public string UtcOffset { get; set; }
    public string Code501c3 { get; set; }
    public string EmailAddress { get; set; }
    public Address Address { get; set; }
    public string Web { get; set; }
    public Program Program { get; set; }
    
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
    public string GroupingId { get; set; }
    public bool Destination { get; set; }
    public long DockingTime { get; set; }
    public long UsageCount { get; set; }
    public string TimeFramesAllowed { get; set; }
    public List<YayOrNay> Likes { get; set; }
    public long LikeCount { get; set; }
    public long DislikeCount { get; set; }
    public string OwnerDisplay { get; set; }
    public string ContentName { get; set; }
}


