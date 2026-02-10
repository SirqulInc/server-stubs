namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TicketResponse 
{
    
    /// <summary>
    /// Gets or Sets Action
    /// </summary>
    public enum ActionEnum
    {
        
        /// <summary>
        /// Enum DATAEnum for DATA
        /// </summary>
        DATAEnum = 1,
        
        /// <summary>
        /// Enum SAVEEnum for SAVE
        /// </summary>
        SAVEEnum = 2,
        
        /// <summary>
        /// Enum DELETEEnum for DELETE
        /// </summary>
        DELETEEnum = 3,
        
        /// <summary>
        /// Enum GETEnum for GET
        /// </summary>
        GETEnum = 4
    }

    public ActionEnum Action { get; set; }
    public long Id { get; set; }
    public long AccountId { get; set; }
    public long ObjectId { get; set; }
    
    /// <summary>
    /// Gets or Sets Type
    /// </summary>
    public enum TypeEnum
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

    public TypeEnum Type { get; set; }
    
    /// <summary>
    /// Gets or Sets ActionType
    /// </summary>
    public enum ActionTypeEnum
    {
        
        /// <summary>
        /// Enum COMPLETEDEnum for COMPLETED
        /// </summary>
        COMPLETEDEnum = 1,
        
        /// <summary>
        /// Enum REDEEMEDEnum for REDEEMED
        /// </summary>
        REDEEMEDEnum = 2,
        
        /// <summary>
        /// Enum USERSPLAYEDEnum for USERS_PLAYED
        /// </summary>
        USERSPLAYEDEnum = 3,
        
        /// <summary>
        /// Enum TOURNAMENTOWNEREnum for TOURNAMENT_OWNER
        /// </summary>
        TOURNAMENTOWNEREnum = 4,
        
        /// <summary>
        /// Enum PURCHASEDEnum for PURCHASED
        /// </summary>
        PURCHASEDEnum = 5,
        
        /// <summary>
        /// Enum SUMATIONEnum for SUMATION
        /// </summary>
        SUMATIONEnum = 6,
        
        /// <summary>
        /// Enum GIFTEDEnum for GIFTED
        /// </summary>
        GIFTEDEnum = 7,
        
        /// <summary>
        /// Enum REFUNDEDEnum for REFUNDED
        /// </summary>
        REFUNDEDEnum = 8
    }

    public ActionTypeEnum ActionType { get; set; }
    public long Used { get; set; }
    public long Count { get; set; }
    public PurchaseItemShortResponse PurchaseItem { get; set; }
    public string CustomMessage { get; set; }
    public AccountShortResponse Sender { get; set; }
    public List<AccountShortResponse> Receiver { get; set; }
    public AssetShortResponse CustomAsset { get; set; }
    public string ReceiptToken { get; set; }
    public string TicketType { get; set; }
    public ApplicationShortResponse Application { get; set; }
}


