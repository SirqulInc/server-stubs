namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Contact 
{
    public string FirstName { get; set; }
    public string MiddleName { get; set; }
    public string LastName { get; set; }
    public string Prefix { get; set; }
    public string Suffix { get; set; }
    public string Title { get; set; }
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
    public string Display { get; set; }
}


