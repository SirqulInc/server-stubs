namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Recurrence 
{
    
    /// <summary>
    /// Gets or Sets Frequency
    /// </summary>
    public enum FrequencyEnum
    {
        
        /// <summary>
        /// Enum DAILYEnum for DAILY
        /// </summary>
        DAILYEnum = 1,
        
        /// <summary>
        /// Enum WEEKLYEnum for WEEKLY
        /// </summary>
        WEEKLYEnum = 2,
        
        /// <summary>
        /// Enum MONTHLYEnum for MONTHLY
        /// </summary>
        MONTHLYEnum = 3,
        
        /// <summary>
        /// Enum ANNUALLYEnum for ANNUALLY
        /// </summary>
        ANNUALLYEnum = 4,
        
        /// <summary>
        /// Enum WEEKDAYONLYEnum for WEEK_DAY_ONLY
        /// </summary>
        WEEKDAYONLYEnum = 5
    }

    public FrequencyEnum Frequency { get; set; }
    public List<int> DaysOfWeek { get; set; }
    public DateTime Start { get; set; }
    public int Count { get; set; }
    public DateTime Until { get; set; }
}


