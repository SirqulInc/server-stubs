namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ShipmentImportStatus 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public string Name { get; set; }
    public string BatchId { get; set; }
    public string Message { get; set; }
    public Shipment Shipment { get; set; }
    public DateTime Started { get; set; }
    public DateTime Completed { get; set; }
}


