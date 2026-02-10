namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaymentTransactionResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public long PaymentTransactionId { get; set; }
    public AccountShortResponse Customer { get; set; }
    public string PromoCode { get; set; }
    public string RemoteRefId { get; set; }
    public string CurrencyType { get; set; }
    public double Amount { get; set; }
    public double Tax { get; set; }
    public List<OfferTransactionResponse> OfferTransactions { get; set; }
    public List<PurchaseOrderItemResponse> OrderItems { get; set; }
    public string ExternalPaymentId { get; set; }
    public string Metadata { get; set; }
    public long Created { get; set; }
    public long Updated { get; set; }
    public string Returning { get; set; }
}


