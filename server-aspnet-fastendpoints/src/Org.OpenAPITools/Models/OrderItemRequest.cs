namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrderItemRequest 
{
    
    /// <summary>
    /// Gets or Sets OrderItemType
    /// </summary>
    public enum OrderItemTypeEnum
    {
        
        /// <summary>
        /// Enum OFFEREnum for OFFER
        /// </summary>
        OFFEREnum = 1,
        
        /// <summary>
        /// Enum CUSTOMEnum for CUSTOM
        /// </summary>
        CUSTOMEnum = 2
    }

    public OrderItemTypeEnum OrderItemType { get; set; }
    public long OrderItemId { get; set; }
    public string OfferName { get; set; }
    public string OrderCustomType { get; set; }
    public string OrderCustomId { get; set; }
    public long RetailerLocationId { get; set; }
    public int Quantity { get; set; }
    public double Amount { get; set; }
    public double Tax { get; set; }
    public long ReserveStartDate { get; set; }
    public long ReserveEndDate { get; set; }
    public string Message { get; set; }
}


