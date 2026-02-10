namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrderResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public long OrderId { get; set; }
    public ApplicationMiniResponse Application { get; set; }
    public AccountShortResponse Customer { get; set; }
    public double Amount { get; set; }
    public double Purchases { get; set; }
    public double Credits { get; set; }
    public List<PaymentTransactionResponse> Payments { get; set; }
    public string ExternalOrderId { get; set; }
    public long Created { get; set; }
    public long Updated { get; set; }
    public long ExternalDate { get; set; }
    public string Description { get; set; }
    public string Returning { get; set; }
}


