namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PurchaseOrderItemResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public long PurchaseOrderItemId { get; set; }
    public long Created { get; set; }
    public long Updated { get; set; }
    public AccountShortResponse Customer { get; set; }
    public string OrderItemType { get; set; }
    public long OrderItemId { get; set; }
    public string OrderCustomType { get; set; }
    public string OrderCustomId { get; set; }
    public long RetailerLocationId { get; set; }
    public double Amount { get; set; }
    public double Tax { get; set; }
    public string Comment { get; set; }
    public string Returning { get; set; }
}


