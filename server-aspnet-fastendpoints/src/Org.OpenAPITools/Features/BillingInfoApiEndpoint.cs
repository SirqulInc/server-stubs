using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Update Payment Method
/// </summary>

public class AddPaymentMethodEndpoint : FastEndpoints.Endpoint<AddPaymentMethodRequest, PaymentTypesResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/billing/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Billing Info");
        });

        Summary(s => {
            s.Summary = "Update Payment Method";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account used to perform the the request");
            s.RequestParam(r => r.PaymentMethodId, "Payment Method Id");
            s.RequestParam(r => r.AccountName, "the name of the account");
            s.RequestParam(r => r.FirstName, "First Name that the account is filed as");
            s.RequestParam(r => r.LastName, "Last Name that the account is filed as");
            s.RequestParam(r => r.Address, "Address that the account is filed as");
            s.RequestParam(r => r.City, "City that the account is filed as");
            s.RequestParam(r => r.State, "State that the account is filed as");
            s.RequestParam(r => r.PostalCode, "Postal Code that the account is filed as");
            s.RequestParam(r => r.Country, "Country that the account is filed as");
            s.RequestParam(r => r.Phone, "Phone that the account is filed as");
            s.RequestParam(r => r.CreditCardNumber, "The full credit card number to store on file");
            s.RequestParam(r => r.ExpirationDate, "The credit card expiration date YYYY-MM");
            s.RequestParam(r => r.Ccv, "The 3 digit confirmation code");
            s.RequestParam(r => r.AccountNumber, "The bank account number");
            s.RequestParam(r => r.BankName, "The bank name");
            s.RequestParam(r => r.RoutingNumber, "Routing Number");
            s.RequestParam(r => r.DefaultPaymentMethod, "Default Payment Method");
            s.RequestParam(r => r.PaymentMethodNickname, "Payment Method Nickname");
            s.RequestParam(r => r.TaxId, "Tax Id");
            s.RequestParam(r => r.ProviderCustomerProfileId, "Provider customer profile Id");
            s.RequestParam(r => r.ProviderPaymentProfileId, "Provider customer payment profile Id");
            s.RequestParam(r => r.MetaData, "Meta Data");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AddPaymentMethodRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Payment Method
/// </summary>

public class CreatePaymentMethodEndpoint : FastEndpoints.Endpoint<CreatePaymentMethodRequest, PaymentTypesResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/billing/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Billing Info");
        });

        Summary(s => {
            s.Summary = "Create Payment Method";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account used to perform the the request");
            s.RequestParam(r => r.AccountName, "Account Name of the credit card user");
            s.RequestParam(r => r.FirstName, "The first name on the credit card");
            s.RequestParam(r => r.LastName, "The last name on the credit card");
            s.RequestParam(r => r.Address, "The billing address of the credit card");
            s.RequestParam(r => r.City, "The billing city of the credit card");
            s.RequestParam(r => r.State, "The billing state of the credit card");
            s.RequestParam(r => r.PostalCode, "The billing zip code of the credit card");
            s.RequestParam(r => r.Country, "Country of the credit card");
            s.RequestParam(r => r.Phone, "The billing phone of the credit card");
            s.RequestParam(r => r.CreditCardNumber, "The full credit card number to store on file");
            s.RequestParam(r => r.ExpirationDate, "The credit card expiration date YYYY-MM");
            s.RequestParam(r => r.Ccv, "The 3 digit confirmation code");
            s.RequestParam(r => r.AccountNumber, "The bank account number");
            s.RequestParam(r => r.BankName, "The bank name");
            s.RequestParam(r => r.RoutingNumber, "The bank routing number");
            s.RequestParam(r => r.PaymentMethodNickname, "The nickname to give the payment method");
            s.RequestParam(r => r.TaxId, "Tax Id");
            s.RequestParam(r => r.DefaultPaymentMethod, "Whether this should be the default payment method");
            s.RequestParam(r => r.AuthToken, "An authorization token for providers that provide this (like Amazon Payments)");
            s.RequestParam(r => r.Provider, "The payment provider (see PaymentMethodProvider)");
            s.RequestParam(r => r.ProviderCustomerProfileId, "Provider customer profile Id");
            s.RequestParam(r => r.ProviderPaymentProfileId, "Provider customer payment profile Id");
            s.RequestParam(r => r.MetaData, "Meta Data");
            s.RequestParam(r => r.AppKey, "Application Key");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreatePaymentMethodRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Smart Contract
/// </summary>

public class CreateSmartContractEndpoint : FastEndpoints.Endpoint<CreateSmartContractRequest, PaymentTypesResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/billing/crypto/transfer");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Billing Info");
        });

        Summary(s => {
            s.Summary = "Create Smart Contract";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account used to perform the the request");
            s.RequestParam(r => r.TokenName, "The token name");
            s.RequestParam(r => r.TokenSymbol, "The token symbol");
            s.RequestParam(r => r.PaymentMethodId, "The payment method to return details on. If this is not set, then the user&#39;s default payment method will be returned.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateSmartContractRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Crypto Balances
/// </summary>

public class GetCryptoBalanceEndpoint : FastEndpoints.Endpoint<GetCryptoBalanceRequest, PaymentTypesResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/billing/crypto/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Billing Info");
        });

        Summary(s => {
            s.Summary = "Get Crypto Balances";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account used to perform the the request");
            s.RequestParam(r => r.OwnerAccountId, "The account to retreive balances for");
            s.RequestParam(r => r.PaymentMethodId, "The payment method to return details on. If this is not set, then the user&#39;s default payment method will be returned.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetCryptoBalanceRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Payment Method
/// </summary>

public class GetPaymentMethodEndpoint : FastEndpoints.Endpoint<GetPaymentMethodRequest, PaymentTypesResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/billing/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Billing Info");
        });

        Summary(s => {
            s.Summary = "Get Payment Method";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account used to perform the the request");
            s.RequestParam(r => r.PaymentMethodId, "The payment method to return details on. If this is not set, then the user&#39;s default payment method will be returned.");
            s.RequestParam(r => r.GetCurrentBalance, "Determines whether to get the user&#39;s current balance for the requested payment method option (not all payment method options support this)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetPaymentMethodRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Payment Methods
/// </summary>

public class SearchPaymentMethodEndpoint : FastEndpoints.Endpoint<SearchPaymentMethodRequest, PaymentTypesResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/billing/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Billing Info");
        });

        Summary(s => {
            s.Summary = "Search Payment Methods";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Account Id to search on");
            s.RequestParam(r => r.Provider, "Provider to search on");
            s.RequestParam(r => r.Type, "the type to search on");
            s.RequestParam(r => r.Keyword, "the keyword to search on");
            s.RequestParam(r => r.SortField, "the sort field to use for the search");
            s.RequestParam(r => r.Descending, "if the results should be in descending order");
            s.RequestParam(r => r.Start, "the start of the search");
            s.RequestParam(r => r.Limit, "the limit of the search");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchPaymentMethodRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

