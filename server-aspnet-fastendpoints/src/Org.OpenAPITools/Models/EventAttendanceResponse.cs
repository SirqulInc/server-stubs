namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class EventAttendanceResponse 
{
    public OfferShortResponse Event { get; set; }
    public List<CategoryResponse> AffiliatedCategories { get; set; }
    public AccountShortResponse Attendee { get; set; }
    public bool Friend { get; set; }
}


