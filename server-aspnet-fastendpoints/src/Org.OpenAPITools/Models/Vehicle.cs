namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Vehicle 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    public VehicleType VehicleType { get; set; }
    public string Vin { get; set; }
    public string LicensePlateNumber { get; set; }
    public string ExternalId { get; set; }
    public ServiceHub Hub { get; set; }
    public List<Program> Programs { get; set; }
    public long SeatQuantity { get; set; }
    public Asset Picture { get; set; }
    public Asset MarkerIcon { get; set; }
    public string TrackingColor { get; set; }
    public Account BelongsTo { get; set; }
    public Region Zone { get; set; }
    public List<Note> Notes { get; set; }
    public long NoteCount { get; set; }
    public bool InUse { get; set; }
    public string ContentName { get; set; }
}


