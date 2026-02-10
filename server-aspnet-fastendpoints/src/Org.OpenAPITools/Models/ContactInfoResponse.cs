namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ContactInfoResponse 
{
    public string HomePhone { get; set; }
    public string CellPhone { get; set; }
    public string CellPhoneCarrier { get; set; }
    public string BusinessPhone { get; set; }
    public string BusinessPhoneExt { get; set; }
    public string FaxNumber { get; set; }
    public string VarTimeZone { get; set; }
    public string UtcOffset { get; set; }
    public string Code501c3 { get; set; }
    public string EmailAddress { get; set; }
    public AddressResponse Address { get; set; }
    public string Web { get; set; }
    public CellCarrierResponse CellCarrier { get; set; }
}


