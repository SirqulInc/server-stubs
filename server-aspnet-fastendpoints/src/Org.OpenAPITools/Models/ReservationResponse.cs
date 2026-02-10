namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ReservationResponse 
{
    public long ReservationId { get; set; }
    public long ReservableId { get; set; }
    public string ReservableType { get; set; }
    public AccountShortResponse Account { get; set; }
    public long CreatedDate { get; set; }
    public long UpdatedDate { get; set; }
    public long StartDate { get; set; }
    public long EndDate { get; set; }
    public OfferShortResponse Transaction { get; set; }
}


