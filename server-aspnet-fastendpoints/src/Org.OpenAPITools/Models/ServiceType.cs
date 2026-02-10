namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ServiceType 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public Retailer Business { get; set; }
    public ServiceHub Hub { get; set; }
    public string Name { get; set; }
    public long AdditionalLoadTime { get; set; }
    public Address PickupAddressOverride { get; set; }
    public Address DropoffAddressOverride { get; set; }
    public LocalTime PickupStartTimeOverride { get; set; }
    public LocalTime PickupEndTimeOverride { get; set; }
    public LocalTime DropoffStartTimeOverride { get; set; }
    public LocalTime DropoffEndTimeOverride { get; set; }
    
    /// <summary>
    /// Gets or Sets DateOverride
    /// </summary>
    public enum DateOverrideEnum
    {
        
        /// <summary>
        /// Enum NONEEnum for NONE
        /// </summary>
        NONEEnum = 1,
        
        /// <summary>
        /// Enum PICKUPSTARTEnum for PICKUP_START
        /// </summary>
        PICKUPSTARTEnum = 2,
        
        /// <summary>
        /// Enum PICKUPENDEnum for PICKUP_END
        /// </summary>
        PICKUPENDEnum = 3,
        
        /// <summary>
        /// Enum DROPOFFSTARTEnum for DROPOFF_START
        /// </summary>
        DROPOFFSTARTEnum = 4,
        
        /// <summary>
        /// Enum DROPOFFENDEnum for DROPOFF_END
        /// </summary>
        DROPOFFENDEnum = 5
    }

    public DateOverrideEnum DateOverride { get; set; }
}


