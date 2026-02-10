require 'json'


MyApp.add_route('POST', '/api/{version}/openai/v1/images/generations', {
  "resourcePath" => "/OpenAI",
  "summary" => "Generate images with OpenAI",
  "nickname" => "image_generation",
  "responseClass" => "WrappedProxyItemResponse",
  "endpoint" => "/api/{version}/openai/v1/images/generations",
  "notes" => "Generate images with OpenAI.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "post_body",
      "description" => "Post Body Parameters",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_raw_response",
      "description" => "Return raw response",
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

