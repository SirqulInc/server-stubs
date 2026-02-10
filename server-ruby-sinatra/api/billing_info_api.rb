require 'json'


MyApp.add_route('POST', '/api/{version}/billing/update', {
  "resourcePath" => "/BillingInfo",
  "summary" => "Update Payment Method",
  "nickname" => "add_payment_method",
  "responseClass" => "PaymentTypesResponse",
  "endpoint" => "/api/{version}/billing/update",
  "notes" => "Update a method of payment. If the paymentMethodId is not passed in then will update their default payment method.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account used to perform the the request",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "payment_method_id",
      "description" => "Payment Method Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_name",
      "description" => "the name of the account",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "first_name",
      "description" => "First Name that the account is filed as",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "last_name",
      "description" => "Last Name that the account is filed as",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "address",
      "description" => "Address that the account is filed as",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "city",
      "description" => "City that the account is filed as",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "state",
      "description" => "State that the account is filed as",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "postal_code",
      "description" => "Postal Code that the account is filed as",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "country",
      "description" => "Country that the account is filed as",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "phone",
      "description" => "Phone that the account is filed as",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "credit_card_number",
      "description" => "The full credit card number to store on file",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "expiration_date",
      "description" => "The credit card expiration date YYYY-MM",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ccv",
      "description" => "The 3 digit confirmation code",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_number",
      "description" => "The bank account number",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "bank_name",
      "description" => "The bank name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "routing_number",
      "description" => "Routing Number",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "default_payment_method",
      "description" => "Default Payment Method",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "payment_method_nickname",
      "description" => "Payment Method Nickname",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tax_id",
      "description" => "Tax Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "provider_customer_profile_id",
      "description" => "Provider customer profile Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "provider_payment_profile_id",
      "description" => "Provider customer payment profile Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "meta_data",
      "description" => "Meta Data",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/{version}/billing/create', {
  "resourcePath" => "/BillingInfo",
  "summary" => "Create Payment Method",
  "nickname" => "create_payment_method",
  "responseClass" => "PaymentTypesResponse",
  "endpoint" => "/api/{version}/billing/create",
  "notes" => "Add a new method of payment.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account used to perform the the request",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_name",
      "description" => "Account Name of the credit card user",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "first_name",
      "description" => "The first name on the credit card",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "last_name",
      "description" => "The last name on the credit card",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "address",
      "description" => "The billing address of the credit card",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "city",
      "description" => "The billing city of the credit card",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "state",
      "description" => "The billing state of the credit card",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "postal_code",
      "description" => "The billing zip code of the credit card",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "country",
      "description" => "Country of the credit card",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "phone",
      "description" => "The billing phone of the credit card",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "credit_card_number",
      "description" => "The full credit card number to store on file",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "expiration_date",
      "description" => "The credit card expiration date YYYY-MM",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ccv",
      "description" => "The 3 digit confirmation code",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "account_number",
      "description" => "The bank account number",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "bank_name",
      "description" => "The bank name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "routing_number",
      "description" => "The bank routing number",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "payment_method_nickname",
      "description" => "The nickname to give the payment method",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tax_id",
      "description" => "Tax Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "default_payment_method",
      "description" => "Whether this should be the default payment method",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "auth_token",
      "description" => "An authorization token for providers that provide this (like Amazon Payments)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "provider",
      "description" => "The payment provider (see PaymentMethodProvider)",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'AUTHORIZE_NET'",
      "paramType" => "query",
    },
    {
      "name" => "provider_customer_profile_id",
      "description" => "Provider customer profile Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "provider_payment_profile_id",
      "description" => "Provider customer payment profile Id",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "meta_data",
      "description" => "Meta Data",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/{version}/billing/crypto/transfer', {
  "resourcePath" => "/BillingInfo",
  "summary" => "Create Smart Contract",
  "nickname" => "create_smart_contract",
  "responseClass" => "PaymentTypesResponse",
  "endpoint" => "/api/{version}/billing/crypto/transfer",
  "notes" => "Adds a smart contract.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account used to perform the the request",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "payment_method_id",
      "description" => "The payment method to return details on. If this is not set, then the user&#39;s default payment method will be returned.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "token_name",
      "description" => "The token name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "token_symbol",
      "description" => "The token symbol",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/billing/crypto/get', {
  "resourcePath" => "/BillingInfo",
  "summary" => "Get Crypto Balances",
  "nickname" => "get_crypto_balance",
  "responseClass" => "PaymentTypesResponse",
  "endpoint" => "/api/{version}/billing/crypto/get",
  "notes" => "Get the cypto balance details for a user",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account used to perform the the request",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "owner_account_id",
      "description" => "The account to retreive balances for",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "payment_method_id",
      "description" => "The payment method to return details on. If this is not set, then the user&#39;s default payment method will be returned.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/billing/get', {
  "resourcePath" => "/BillingInfo",
  "summary" => "Get Payment Method",
  "nickname" => "get_payment_method",
  "responseClass" => "PaymentTypesResponse",
  "endpoint" => "/api/{version}/billing/get",
  "notes" => "Get the details of the user's payment method or their current default method of payment",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account used to perform the the request",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "payment_method_id",
      "description" => "The payment method to return details on. If this is not set, then the user&#39;s default payment method will be returned.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "get_current_balance",
      "description" => "Determines whether to get the user&#39;s current balance for the requested payment method option (not all payment method options support this)",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/billing/search', {
  "resourcePath" => "/BillingInfo",
  "summary" => "Search Payment Methods",
  "nickname" => "search_payment_method",
  "responseClass" => "PaymentTypesResponse",
  "endpoint" => "/api/{version}/billing/search",
  "notes" => "Search the payment methods of an account",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Account Id to search on",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "provider",
      "description" => "Provider to search on",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'AUTHORIZE_NET'",
      "paramType" => "query",
    },
    {
      "name" => "type",
      "description" => "the type to search on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keyword",
      "description" => "the keyword to search on",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sort_field",
      "description" => "the sort field to use for the search",
      "dataType" => "String",
      "allowableValues" => "",
      "defaultValue" => "'UPDATED'",
      "paramType" => "query",
    },
    {
      "name" => "descending",
      "description" => "if the results should be in descending order",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "the start of the search",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "0",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "the limit of the search",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "5",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

