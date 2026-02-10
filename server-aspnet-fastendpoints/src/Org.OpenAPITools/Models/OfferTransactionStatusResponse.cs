namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OfferTransactionStatusResponse 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    public int Code { get; set; }
    public string Role { get; set; }
    public List<ApplicationShortResponse> Applications { get; set; }
}


