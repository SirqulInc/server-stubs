namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Route 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public string Name { get; set; }
    public string ExternalId { get; set; }
    public ServiceHub Hub { get; set; }
    public Program Program { get; set; }
    public Region Zone { get; set; }
    public Vehicle Vehicle { get; set; }
    public Account Driver { get; set; }
    public Account Concierge { get; set; }
    public DateTime Scheduled { get; set; }
    public DateTime Approved { get; set; }
    public DateTime Started { get; set; }
    public DateTime Completed { get; set; }
    public float TotalDistance { get; set; }
    public long TotalTime { get; set; }
    public double EstimatedDistance { get; set; }
    public long EstimatedTime { get; set; }
    public Stop StartStop { get; set; }
    public Stop EndStop { get; set; }
    public List<Stop> Stops { get; set; }
    public List<Shipment> Shipments { get; set; }
    public bool AllShipmentsConfirmed { get; set; }
    public int ShipmentOrderCount { get; set; }
    public string Polyline { get; set; }
    public List<Note> Notes { get; set; }
    public long NoteCount { get; set; }
    public string GlympseToken { get; set; }
    public bool EnableOptimization { get; set; }
    public DateTime OptimizedDate { get; set; }
    public DateTime OptimizationStarted { get; set; }
    public DateTime OptimizationCompleted { get; set; }
    public bool Featured { get; set; }
    public Asset Image { get; set; }
    public Route Parent { get; set; }
    public string ContentName { get; set; }
}


