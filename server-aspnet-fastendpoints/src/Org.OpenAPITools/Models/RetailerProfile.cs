namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class RetailerProfile 
{
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
}


