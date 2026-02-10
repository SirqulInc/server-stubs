namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Shipment 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public string Name { get; set; }
    public Account Owner { get; set; }
    public Account Rider { get; set; }
    public Stop PickupStop { get; set; }
    public Stop DropOffStop { get; set; }
    public List<Note> Notes { get; set; }
    public long NoteCount { get; set; }
    public string BatchId { get; set; }
    public DateTime Reserved { get; set; }
    public DateTime Canceled { get; set; }
    public DateTime Confirmed { get; set; }
    public Route Route { get; set; }
    public string Polyline { get; set; }
    public Shipment ReplacePassenger { get; set; }
    public bool Refunded { get; set; }
    public PromoCode PromoCode { get; set; }
    public int Quantity { get; set; }
    public DateTimeRange PickupTimeWindow { get; set; }
    public DateTimeRange DropOffTimeWindow { get; set; }
    public CargoType CargoType { get; set; }
    public ServiceType ServiceType { get; set; }
    public long RouteId { get; set; }
    public double TotalVolume { get; set; }
    public bool Complete { get; set; }
    public string ContentName { get; set; }
    public string RiderName { get; set; }
}


