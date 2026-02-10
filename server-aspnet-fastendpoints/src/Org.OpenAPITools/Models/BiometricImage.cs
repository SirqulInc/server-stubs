namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class BiometricImage 
{
    
    /// <summary>
    /// Gets or Sets Position
    /// </summary>
    public enum PositionEnum
    {
        
        /// <summary>
        /// Enum UNKNOWNEnum for UNKNOWN
        /// </summary>
        UNKNOWNEnum,
        
        /// <summary>
        /// Enum LEFTINDEXEnum for LEFT_INDEX
        /// </summary>
        LEFTINDEXEnum,
        
        /// <summary>
        /// Enum LEFTMIDDLEEnum for LEFT_MIDDLE
        /// </summary>
        LEFTMIDDLEEnum,
        
        /// <summary>
        /// Enum LEFTRINGEnum for LEFT_RING
        /// </summary>
        LEFTRINGEnum,
        
        /// <summary>
        /// Enum LEFTLITTLEEnum for LEFT_LITTLE
        /// </summary>
        LEFTLITTLEEnum,
        
        /// <summary>
        /// Enum LEFTTHUMBEnum for LEFT_THUMB
        /// </summary>
        LEFTTHUMBEnum,
        
        /// <summary>
        /// Enum RIGHTINDEXEnum for RIGHT_INDEX
        /// </summary>
        RIGHTINDEXEnum,
        
        /// <summary>
        /// Enum RIGHTMIDDLEEnum for RIGHT_MIDDLE
        /// </summary>
        RIGHTMIDDLEEnum,
        
        /// <summary>
        /// Enum RIGHTRINGEnum for RIGHT_RING
        /// </summary>
        RIGHTRINGEnum,
        
        /// <summary>
        /// Enum RIGHTLITTLEEnum for RIGHT_LITTLE
        /// </summary>
        RIGHTLITTLEEnum,
        
        /// <summary>
        /// Enum RIGHTTHUMBEnum for RIGHT_THUMB
        /// </summary>
        RIGHTTHUMBEnum,
        
        /// <summary>
        /// Enum LEFTEnum for LEFT
        /// </summary>
        LEFTEnum,
        
        /// <summary>
        /// Enum RIGHTEnum for RIGHT
        /// </summary>
        RIGHTEnum
    }

    public PositionEnum Position { get; set; }
    public string Data { get; set; }
}


