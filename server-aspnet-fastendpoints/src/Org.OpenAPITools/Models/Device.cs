namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Device 
{
    public int RebootTimeHour { get; set; }
    public int RebootTimeMinute { get; set; }
    public int IdleTimeoutInSecond { get; set; }
    public string SerialNumber { get; set; }
    public string Udid { get; set; }
    public string DeviceType { get; set; }
    public double DevicePower { get; set; }
    public double DeviceInterference { get; set; }
    public DateTime LastHeartbeatSent { get; set; }
    public DateTime LastDown { get; set; }
    public DateTime LastUp { get; set; }
    public DateTime LastNotificationSent { get; set; }
    
    /// <summary>
    /// Gets or Sets Health
    /// </summary>
    public enum HealthEnum
    {
        
        /// <summary>
        /// Enum RUNNINGEnum for RUNNING
        /// </summary>
        RUNNINGEnum = 1,
        
        /// <summary>
        /// Enum WARNINGEnum for WARNING
        /// </summary>
        WARNINGEnum = 2,
        
        /// <summary>
        /// Enum DOWNEnum for DOWN
        /// </summary>
        DOWNEnum = 3
    }

    public HealthEnum Health { get; set; }
}


