namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Trip 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public Account Owner { get; set; }
    public Location PickupLocation { get; set; }
    public DateTime PickupTime { get; set; }
    public Location DropOffLocation { get; set; }
    public DateTime DropOffTime { get; set; }
    public List<Shipment> Shipments { get; set; }
    public Recurrence Recurrence { get; set; }
    public string VarTimeZone { get; set; }
    public Route Route { get; set; }
    
    /// <summary>
    /// Gets or Sets Preference
    /// </summary>
    public enum PreferenceEnum
    {
        
        /// <summary>
        /// Enum DRIVEEnum for DRIVE
        /// </summary>
        DRIVEEnum = 1,
        
        /// <summary>
        /// Enum FLEXIBLEEnum for FLEXIBLE
        /// </summary>
        FLEXIBLEEnum = 2,
        
        /// <summary>
        /// Enum RIDEEnum for RIDE
        /// </summary>
        RIDEEnum = 3
    }

    public PreferenceEnum Preference { get; set; }
    public string Notifications { get; set; }
    public List<Trip> Matches { get; set; }
    public Connection OwnerConnection { get; set; }
    public long OriginalId { get; set; }
}


