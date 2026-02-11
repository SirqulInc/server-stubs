require 'json'


MyApp.add_route('POST', '/api/3.18/sms/buyoffer/{appKey}', {
  "resourcePath" => "/Twilio",
  "summary" => "Buy Offer by SMS",
  "nickname" => "sms_buy_offer",
  "responseClass" => "TwiMLResponse",
  "endpoint" => "/sms/buyoffer/{appKey}",
  "notes" => "Recieve an SMS payload from Twillio to purchase an offer.",
  "parameters" => [
    {
      "name" => "body",
      "description" => "the message of the text",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "from",
      "description" => "the sender of the sms",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "currency_type",
      "description" => "the type of currency",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "app_key",
      "description" => "the application key",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

