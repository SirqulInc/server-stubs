namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ContactResponse 
{
    public string FirstName { get; set; }
    public string MiddleName { get; set; }
    public string LastName { get; set; }
    public string Prefix { get; set; }
    public string Suffix { get; set; }
    public string Title { get; set; }
    public ContactInfoResponse ContactInfo { get; set; }
}


