
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AddPaymentMethodRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account used to perform the the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Payment Method Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("paymentMethodId")]
    public long? PaymentMethodId { get; set; }
    /// <summary>
    /// the name of the account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountName")]
    public string? AccountName { get; set; }
    /// <summary>
    /// First Name that the account is filed as
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("firstName")]
    public string? FirstName { get; set; }
    /// <summary>
    /// Last Name that the account is filed as
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("lastName")]
    public string? LastName { get; set; }
    /// <summary>
    /// Address that the account is filed as
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("address")]
    public string? Address { get; set; }
    /// <summary>
    /// City that the account is filed as
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("city")]
    public string? City { get; set; }
    /// <summary>
    /// State that the account is filed as
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("state")]
    public string? State { get; set; }
    /// <summary>
    /// Postal Code that the account is filed as
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("postalCode")]
    public string? PostalCode { get; set; }
    /// <summary>
    /// Country that the account is filed as
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("country")]
    public string? Country { get; set; }
    /// <summary>
    /// Phone that the account is filed as
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("phone")]
    public string? Phone { get; set; }
    /// <summary>
    /// The full credit card number to store on file
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("creditCardNumber")]
    public string? CreditCardNumber { get; set; }
    /// <summary>
    /// The credit card expiration date YYYY-MM
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("expirationDate")]
    public string? ExpirationDate { get; set; }
    /// <summary>
    /// The 3 digit confirmation code
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ccv")]
    public string? Ccv { get; set; }
    /// <summary>
    /// The bank account number
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountNumber")]
    public string? AccountNumber { get; set; }
    /// <summary>
    /// The bank name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bankName")]
    public string? BankName { get; set; }
    /// <summary>
    /// Routing Number
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("routingNumber")]
    public string? RoutingNumber { get; set; }
    /// <summary>
    /// Default Payment Method
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("defaultPaymentMethod")]
    public bool? DefaultPaymentMethod { get; set; }
    /// <summary>
    /// Payment Method Nickname
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("paymentMethodNickname")]
    public string? PaymentMethodNickname { get; set; }
    /// <summary>
    /// Tax Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("taxId")]
    public string? TaxId { get; set; }
    /// <summary>
    /// Provider customer profile Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("providerCustomerProfileId")]
    public string? ProviderCustomerProfileId { get; set; }
    /// <summary>
    /// Provider customer payment profile Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("providerPaymentProfileId")]
    public string? ProviderPaymentProfileId { get; set; }
    /// <summary>
    /// Meta Data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
}
public class CreatePaymentMethodRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account used to perform the the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Account Name of the credit card user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountName")]
    public string? AccountName { get; set; }
    /// <summary>
    /// The first name on the credit card
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("firstName")]
    public string? FirstName { get; set; }
    /// <summary>
    /// The last name on the credit card
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("lastName")]
    public string? LastName { get; set; }
    /// <summary>
    /// The billing address of the credit card
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("address")]
    public string? Address { get; set; }
    /// <summary>
    /// The billing city of the credit card
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("city")]
    public string? City { get; set; }
    /// <summary>
    /// The billing state of the credit card
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("state")]
    public string? State { get; set; }
    /// <summary>
    /// The billing zip code of the credit card
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("postalCode")]
    public string? PostalCode { get; set; }
    /// <summary>
    /// Country of the credit card
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("country")]
    public string? Country { get; set; }
    /// <summary>
    /// The billing phone of the credit card
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("phone")]
    public string? Phone { get; set; }
    /// <summary>
    /// The full credit card number to store on file
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("creditCardNumber")]
    public string? CreditCardNumber { get; set; }
    /// <summary>
    /// The credit card expiration date YYYY-MM
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("expirationDate")]
    public string? ExpirationDate { get; set; }
    /// <summary>
    /// The 3 digit confirmation code
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ccv")]
    public string? Ccv { get; set; }
    /// <summary>
    /// The bank account number
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountNumber")]
    public string? AccountNumber { get; set; }
    /// <summary>
    /// The bank name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bankName")]
    public string? BankName { get; set; }
    /// <summary>
    /// The bank routing number
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("routingNumber")]
    public string? RoutingNumber { get; set; }
    /// <summary>
    /// The nickname to give the payment method
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("paymentMethodNickname")]
    public string? PaymentMethodNickname { get; set; }
    /// <summary>
    /// Tax Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("taxId")]
    public string? TaxId { get; set; }
    /// <summary>
    /// Whether this should be the default payment method
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("defaultPaymentMethod")]
    public bool? DefaultPaymentMethod { get; set; }
    /// <summary>
    /// An authorization token for providers that provide this (like Amazon Payments)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("authToken")]
    public string? AuthToken { get; set; }
    /// <summary>
    /// The payment provider (see PaymentMethodProvider)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("provider")]
    public string? Provider { get; set; }
    /// <summary>
    /// Provider customer profile Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("providerCustomerProfileId")]
    public string? ProviderCustomerProfileId { get; set; }
    /// <summary>
    /// Provider customer payment profile Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("providerPaymentProfileId")]
    public string? ProviderPaymentProfileId { get; set; }
    /// <summary>
    /// Meta Data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
}
public class CreateSmartContractRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account used to perform the the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The payment method to return details on. If this is not set, then the user&#39;s default payment method will be returned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("paymentMethodId")]
    public long? PaymentMethodId { get; set; }
    /// <summary>
    /// The token name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tokenName")]
    public string TokenName { get; set; }
    /// <summary>
    /// The token symbol
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tokenSymbol")]
    public string TokenSymbol { get; set; }
}
public class GetCryptoBalanceRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account used to perform the the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The account to retreive balances for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ownerAccountId")]
    public long? OwnerAccountId { get; set; }
    /// <summary>
    /// The payment method to return details on. If this is not set, then the user&#39;s default payment method will be returned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("paymentMethodId")]
    public long? PaymentMethodId { get; set; }
}
public class GetPaymentMethodRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account used to perform the the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The payment method to return details on. If this is not set, then the user&#39;s default payment method will be returned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("paymentMethodId")]
    public long? PaymentMethodId { get; set; }
    /// <summary>
    /// Determines whether to get the user&#39;s current balance for the requested payment method option (not all payment method options support this)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("getCurrentBalance")]
    public bool? GetCurrentBalance { get; set; }
}
public class SearchPaymentMethodRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Account Id to search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Provider to search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("provider")]
    public string? Provider { get; set; }
    /// <summary>
    /// the type to search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("type")]
    public string? Type { get; set; }
    /// <summary>
    /// the keyword to search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// the sort field to use for the search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// if the results should be in descending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// the start of the search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// the limit of the search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}


