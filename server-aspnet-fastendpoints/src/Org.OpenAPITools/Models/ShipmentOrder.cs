namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ShipmentOrder 
{
    public bool Valid { get; set; }
    public int BatchID { get; set; }
    public int BatchSize { get; set; }
    public double OrderTrackingID { get; set; }
    public string ClientRefNo { get; set; }
    public string ClientRefNo2 { get; set; }
    public string HubCode { get; set; }
    public string AccountNo { get; set; }
    public string CompanyName { get; set; }
    public string VehicleTypeName { get; set; }
    public string ServiceTypeName { get; set; }
    public string ServiceCode { get; set; }
    public int Pieces { get; set; }
    public double Weight { get; set; }
    public double CubicFeet { get; set; }
    public string PickupCompany { get; set; }
    public string PickupContact { get; set; }
    public string PickupPhone { get; set; }
    public string PickupStreet { get; set; }
    public string PickupStreet2 { get; set; }
    public string PickupCity { get; set; }
    public string PickupState { get; set; }
    public string PickupZip { get; set; }
    public DateTime PickupTargetFrom { get; set; }
    public DateTime PickupTargetTo { get; set; }
    public string DeliveryCompany { get; set; }
    public string DeliveryContact { get; set; }
    public string DeliveryPhone { get; set; }
    public string DeliveryStreet { get; set; }
    public string DeliveryStreet2 { get; set; }
    public string DeliveryCity { get; set; }
    public string DeliveryState { get; set; }
    public string DeliveryZip { get; set; }
    public DateTime DeliveryTargetFrom { get; set; }
    public DateTime DeliveryTargetTo { get; set; }
    public List<OrderPackage> OrderPackages { get; set; }
    public int RouteID { get; set; }
    public int DriverID { get; set; }
    public int PickupSequenceNo { get; set; }
    public int DeliverySequenceNo { get; set; }
    public string PickupETA { get; set; }
    public string DeliveryETA { get; set; }
}


