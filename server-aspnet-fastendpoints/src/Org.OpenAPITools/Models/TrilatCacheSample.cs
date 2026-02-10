namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TrilatCacheSample 
{
    public string AvatarId { get; set; }
    public string DeviceId { get; set; }
    public List<int> Rssi { get; set; }
    public double FilteredRssi { get; set; }
    public long Time { get; set; }
    public string NetworkName { get; set; }
    public bool RandomizedId { get; set; }
    public string DeviceSignature { get; set; }
    public string AlternateId { get; set; }
    public string Type { get; set; }
    
    /// <summary>
    /// Gets or Sets ProbeType
    /// </summary>
    public enum ProbeTypeEnum
    {
        
        /// <summary>
        /// Enum WIFIPROBEREQUESTEnum for WIFI_PROBE_REQUEST
        /// </summary>
        WIFIPROBEREQUESTEnum = 1,
        
        /// <summary>
        /// Enum IBEACONEnum for IBEACON
        /// </summary>
        IBEACONEnum = 2,
        
        /// <summary>
        /// Enum BLEEnum for BLE
        /// </summary>
        BLEEnum = 3,
        
        /// <summary>
        /// Enum UNKNOWNEnum for UNKNOWN
        /// </summary>
        UNKNOWNEnum = 4
    }

    public ProbeTypeEnum ProbeType { get; set; }
    public double AvgRssi { get; set; }
}


