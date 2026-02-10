namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Tutorial 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    
    /// <summary>
    /// Gets or Sets Alignment
    /// </summary>
    public enum AlignmentEnum
    {
        
        /// <summary>
        /// Enum NONEEnum for NONE
        /// </summary>
        NONEEnum = 1,
        
        /// <summary>
        /// Enum IMAGEABOVEEnum for IMAGE_ABOVE
        /// </summary>
        IMAGEABOVEEnum = 2,
        
        /// <summary>
        /// Enum IMAGEBELOWEnum for IMAGE_BELOW
        /// </summary>
        IMAGEBELOWEnum = 3,
        
        /// <summary>
        /// Enum IMAGELEFTEnum for IMAGE_LEFT
        /// </summary>
        IMAGELEFTEnum = 4,
        
        /// <summary>
        /// Enum IMAGERIGHTEnum for IMAGE_RIGHT
        /// </summary>
        IMAGERIGHTEnum = 5,
        
        /// <summary>
        /// Enum IMAGEONLYEnum for IMAGE_ONLY
        /// </summary>
        IMAGEONLYEnum = 6,
        
        /// <summary>
        /// Enum TEXTONLYEnum for TEXT_ONLY
        /// </summary>
        TEXTONLYEnum = 7
    }

    public AlignmentEnum Alignment { get; set; }
    public Asset Image { get; set; }
    public long OrderIndex { get; set; }
    
    /// <summary>
    /// Gets or Sets TutorialObjectType
    /// </summary>
    public enum TutorialObjectTypeEnum
    {
        
        /// <summary>
        /// Enum GAMEOBJECTEnum for GAME_OBJECT
        /// </summary>
        GAMEOBJECTEnum = 1,
        
        /// <summary>
        /// Enum GAMELEVELEnum for GAME_LEVEL
        /// </summary>
        GAMELEVELEnum = 2,
        
        /// <summary>
        /// Enum PACKEnum for PACK
        /// </summary>
        PACKEnum = 3,
        
        /// <summary>
        /// Enum GAMEEnum for GAME
        /// </summary>
        GAMEEnum = 4,
        
        /// <summary>
        /// Enum MISSIONEnum for MISSION
        /// </summary>
        MISSIONEnum = 5,
        
        /// <summary>
        /// Enum PROFILEEnum for PROFILE
        /// </summary>
        PROFILEEnum = 6,
        
        /// <summary>
        /// Enum APPLICATIONEnum for APPLICATION
        /// </summary>
        APPLICATIONEnum = 7,
        
        /// <summary>
        /// Enum TICKETSEnum for TICKETS
        /// </summary>
        TICKETSEnum = 8,
        
        /// <summary>
        /// Enum ASSETEnum for ASSET
        /// </summary>
        ASSETEnum = 9,
        
        /// <summary>
        /// Enum CUSTOMEnum for CUSTOM
        /// </summary>
        CUSTOMEnum = 10
    }

    public TutorialObjectTypeEnum TutorialObjectType { get; set; }
}


