namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaymentTypesResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public bool CreditCardOnFile { get; set; }
    public string CreditCardNumber { get; set; }
    public string CreditCardExpirationMonth { get; set; }
    public string CreditCardExpirationYear { get; set; }
    public bool PointsOnFile { get; set; }
    public double PointsAmount { get; set; }
    public AccountShortResponse Account { get; set; }
    public string FirstName { get; set; }
    public string LastName { get; set; }
    public string Address { get; set; }
    public string City { get; set; }
    public string State { get; set; }
    public string PostalCode { get; set; }
    public string Phone { get; set; }
    public string Provider { get; set; }
    public long PaymentMethodId { get; set; }
    public bool Validated { get; set; }
    public string AccountNumber { get; set; }
    public string BankName { get; set; }
    public string RoutingNumber { get; set; }
    public bool IsDefaultPaymentMethod { get; set; }
    public string AccountName { get; set; }
    public string PaymentMethodNickname { get; set; }
    public string TaxId { get; set; }
    public string Returning { get; set; }
}


