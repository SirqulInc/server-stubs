require 'json'


MyApp.add_route('POST', '/api/3.18/stripe/checkout/session/create', {
  "resourcePath" => "/Stripe",
  "summary" => "Create Stripe Checkout Session",
  "nickname" => "create_stripe_checkout_session",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/stripe/checkout/session/create",
  "notes" => "Create a Stripe checkout session",
  "parameters" => [
    {
      "name" => "app_key",
      "description" => "Sirqul Application Key",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "stripe_parameters",
      "description" => "Stripe Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

