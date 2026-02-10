namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaymentRequest 
{
    public string AppKey { get; set; }
    public string ClientPaymentId { get; set; }
    public int MinAgeYears { get; set; }
    public Invoice Invoice { get; set; }
    public BiometricRequest Biometrics { get; set; }
    public List<OrderItemRequest> OrderItems { get; set; }
    public bool AcceptedBilling { get; set; }
}


