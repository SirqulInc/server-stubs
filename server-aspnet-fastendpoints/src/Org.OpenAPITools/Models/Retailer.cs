namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Retailer 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public string LocationDescription { get; set; }
    public string Name { get; set; }
    public Account Responsible { get; set; }
    public Account Manager { get; set; }
    public string DetailsHeader { get; set; }
    public string DetailsBody { get; set; }
    public string DetailsLineLeft1 { get; set; }
    public string DetailsLineLeft2 { get; set; }
    public string DetailsLineRight1 { get; set; }
    public string MetaDescription { get; set; }
    public string Directions { get; set; }
    public string Hours { get; set; }
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
    public bool Featured { get; set; }
    public bool Listed { get; set; }
    public List<Category> Categories { get; set; }
    public Territory Territory { get; set; }
    public List<RetailerLocation> Locations { get; set; }
    public long YipitId { get; set; }
    public string FacebookUrl { get; set; }
    public string TwitterUrl { get; set; }
    
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
    public string AppKey { get; set; }
    public string CategoryTree { get; set; }
    public string FilterTree { get; set; }
    public long BillableId { get; set; }
    public string SubType { get; set; }
    public string ContentName { get; set; }
    public Account Owner { get; set; }
}


