namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Product 
{
    public string Brand { get; set; }
    
    /// <summary>
    /// Gets or Sets ProductType
    /// </summary>
    public enum ProductTypeEnum
    {
        
        /// <summary>
        /// Enum APPARELEnum for APPAREL
        /// </summary>
        APPARELEnum = 1,
        
        /// <summary>
        /// Enum APPLIANCESEnum for APPLIANCES
        /// </summary>
        APPLIANCESEnum = 2,
        
        /// <summary>
        /// Enum APPSEnum for APPS
        /// </summary>
        APPSEnum = 3,
        
        /// <summary>
        /// Enum ARTSCRAFTSEnum for ARTS_CRAFTS
        /// </summary>
        ARTSCRAFTSEnum = 4,
        
        /// <summary>
        /// Enum AUTOMOTIVEEnum for AUTOMOTIVE
        /// </summary>
        AUTOMOTIVEEnum = 5,
        
        /// <summary>
        /// Enum BABYEnum for BABY
        /// </summary>
        BABYEnum = 6,
        
        /// <summary>
        /// Enum BEAUTYEnum for BEAUTY
        /// </summary>
        BEAUTYEnum = 7,
        
        /// <summary>
        /// Enum BOOKSEnum for BOOKS
        /// </summary>
        BOOKSEnum = 8,
        
        /// <summary>
        /// Enum CLASSICALEnum for CLASSICAL
        /// </summary>
        CLASSICALEnum = 9,
        
        /// <summary>
        /// Enum COLLECTIBLESEnum for COLLECTIBLES
        /// </summary>
        COLLECTIBLESEnum = 10,
        
        /// <summary>
        /// Enum DVDEnum for DVD
        /// </summary>
        DVDEnum = 11,
        
        /// <summary>
        /// Enum ELECTRONICSEnum for ELECTRONICS
        /// </summary>
        ELECTRONICSEnum = 12,
        
        /// <summary>
        /// Enum GIFTCARDSEnum for GIFT_CARDS
        /// </summary>
        GIFTCARDSEnum = 13,
        
        /// <summary>
        /// Enum GOURMETFOODEnum for GOURMET_FOOD
        /// </summary>
        GOURMETFOODEnum = 14,
        
        /// <summary>
        /// Enum GROCERYEnum for GROCERY
        /// </summary>
        GROCERYEnum = 15,
        
        /// <summary>
        /// Enum HEALTHPERSONALCAREEnum for HEALTH_PERSONAL_CARE
        /// </summary>
        HEALTHPERSONALCAREEnum = 16,
        
        /// <summary>
        /// Enum HOMEGARDENEnum for HOME_GARDEN
        /// </summary>
        HOMEGARDENEnum = 17,
        
        /// <summary>
        /// Enum INDUSTRIALEnum for INDUSTRIAL
        /// </summary>
        INDUSTRIALEnum = 18,
        
        /// <summary>
        /// Enum JEWELRYEnum for JEWELRY
        /// </summary>
        JEWELRYEnum = 19,
        
        /// <summary>
        /// Enum KITCHENEnum for KITCHEN
        /// </summary>
        KITCHENEnum = 20,
        
        /// <summary>
        /// Enum LAWNGARDENEnum for LAWN_GARDEN
        /// </summary>
        LAWNGARDENEnum = 21,
        
        /// <summary>
        /// Enum MAGAZINESEnum for MAGAZINES
        /// </summary>
        MAGAZINESEnum = 22,
        
        /// <summary>
        /// Enum MISCELLANEOUSEnum for MISCELLANEOUS
        /// </summary>
        MISCELLANEOUSEnum = 23,
        
        /// <summary>
        /// Enum MUSICALINSTRUMENTSEnum for MUSICAL_INSTRUMENTS
        /// </summary>
        MUSICALINSTRUMENTSEnum = 24,
        
        /// <summary>
        /// Enum OFFICEPRODUCTSEnum for OFFICE_PRODUCTS
        /// </summary>
        OFFICEPRODUCTSEnum = 25,
        
        /// <summary>
        /// Enum OTHEREnum for OTHER
        /// </summary>
        OTHEREnum = 26,
        
        /// <summary>
        /// Enum OUTDOORLIVINGEnum for OUTDOOR_LIVING
        /// </summary>
        OUTDOORLIVINGEnum = 27,
        
        /// <summary>
        /// Enum PCHARDWAREEnum for PC_HARDWARE
        /// </summary>
        PCHARDWAREEnum = 28,
        
        /// <summary>
        /// Enum PETSUPPLIESEnum for PET_SUPPLIES
        /// </summary>
        PETSUPPLIESEnum = 29,
        
        /// <summary>
        /// Enum SHOESEnum for SHOES
        /// </summary>
        SHOESEnum = 30,
        
        /// <summary>
        /// Enum SOFTWAREEnum for SOFTWARE
        /// </summary>
        SOFTWAREEnum = 31,
        
        /// <summary>
        /// Enum SPORTINGGOODSEnum for SPORTING_GOODS
        /// </summary>
        SPORTINGGOODSEnum = 32,
        
        /// <summary>
        /// Enum TOOLSEnum for TOOLS
        /// </summary>
        TOOLSEnum = 33,
        
        /// <summary>
        /// Enum TOYSEnum for TOYS
        /// </summary>
        TOYSEnum = 34,
        
        /// <summary>
        /// Enum VIDEOGAMESEnum for VIDEO_GAMES
        /// </summary>
        VIDEOGAMESEnum = 35,
        
        /// <summary>
        /// Enum WATCHESEnum for WATCHES
        /// </summary>
        WATCHESEnum = 36,
        
        /// <summary>
        /// Enum WIRELESSEnum for WIRELESS
        /// </summary>
        WIRELESSEnum = 37,
        
        /// <summary>
        /// Enum WIRELESSACCESSORIESEnum for WIRELESS_ACCESSORIES
        /// </summary>
        WIRELESSACCESSORIESEnum = 38
    }

    public ProductTypeEnum ProductType { get; set; }
    
    /// <summary>
    /// Gets or Sets Condition
    /// </summary>
    public enum ConditionEnum
    {
        
        /// <summary>
        /// Enum NEWEnum for NEW
        /// </summary>
        NEWEnum = 1,
        
        /// <summary>
        /// Enum USEDEnum for USED
        /// </summary>
        USEDEnum = 2,
        
        /// <summary>
        /// Enum REFURBISHEDEnum for REFURBISHED
        /// </summary>
        REFURBISHEDEnum = 3,
        
        /// <summary>
        /// Enum OTHEREnum for OTHER
        /// </summary>
        OTHEREnum = 4
    }

    public ConditionEnum Condition { get; set; }
    public string Isbn { get; set; }
    public string Asin { get; set; }
    public List<string> CatalogNumbers { get; set; }
    public string Department { get; set; }
    public List<string> Features { get; set; }
    public double MinimumPrice { get; set; }
    public double Width { get; set; }
    public double Height { get; set; }
    public double Depth { get; set; }
    public double Weight { get; set; }
    
    /// <summary>
    /// Gets or Sets Unit
    /// </summary>
    public enum UnitEnum
    {
        
        /// <summary>
        /// Enum MILIMETEREnum for MILIMETER
        /// </summary>
        MILIMETEREnum = 1,
        
        /// <summary>
        /// Enum CENTIMETEREnum for CENTIMETER
        /// </summary>
        CENTIMETEREnum = 2,
        
        /// <summary>
        /// Enum METEREnum for METER
        /// </summary>
        METEREnum = 3,
        
        /// <summary>
        /// Enum INCHEnum for INCH
        /// </summary>
        INCHEnum = 4,
        
        /// <summary>
        /// Enum FOOTEnum for FOOT
        /// </summary>
        FOOTEnum = 5,
        
        /// <summary>
        /// Enum YARDEnum for YARD
        /// </summary>
        YARDEnum = 6
    }

    public UnitEnum Unit { get; set; }
    public string Studio { get; set; }
    public string ParentalRating { get; set; }
    public long PublishDate { get; set; }
    public long AvailabilityDate { get; set; }
    public SizeGroup Size { get; set; }
}


