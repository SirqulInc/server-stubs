require 'json'


MyApp.add_route('POST', '/api/3.18/subscription/create', {
  "resourcePath" => "/Subscription",
  "summary" => "Create Subscription",
  "nickname" => "create_subscription",
  "responseClass" => "SubscriptionResponse",
  "endpoint" => "/subscription/create",
  "notes" => "Create a subscription for a billable entity.  Provide a planId, if not provided then the base plan will be assigned.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account used to perform the create, must be the responsible manager",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "plan_id",
      "description" => "The plan to subscribe to, if null use default plan",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "promo_code",
      "description" => "Set a promo code for a discount.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/subscription/delete', {
  "resourcePath" => "/Subscription",
  "summary" => "Delete Subscription",
  "nickname" => "delete_subscription",
  "responseClass" => "SirqulResponse",
  "endpoint" => "/subscription/delete",
  "notes" => "Suspend the current subscription for the billable entity managed by the account.  The account must be the responsible manager to perform this action",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account used to perform the delete, must be the responsible manager",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/subscription/get', {
  "resourcePath" => "/Subscription",
  "summary" => "Get Subscription",
  "nickname" => "get_subscription",
  "responseClass" => "SubscriptionResponse",
  "endpoint" => "/subscription/get",
  "notes" => "Use the accountId to determine the associated BillableEntity.  Then get the subscription.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account used to perform the lookup",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/subscription/plan/get', {
  "resourcePath" => "/Subscription",
  "summary" => "Get Subscription Plan",
  "nickname" => "get_subscription_plan",
  "responseClass" => "SubscriptionPlanResponse",
  "endpoint" => "/subscription/plan/get",
  "notes" => "Get the matched subscription plan",
  "parameters" => [
    {
      "name" => "plan_id",
      "description" => "The ID of the plan to get",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/subscription/plan/list', {
  "resourcePath" => "/Subscription",
  "summary" => "List Subscription Plans",
  "nickname" => "get_subscription_plans",
  "responseClass" => "Array<SubscriptionPlanResponse>",
  "endpoint" => "/subscription/plan/list",
  "notes" => "Get the matched subscription plan",
  "parameters" => [
    {
      "name" => "visible",
      "description" => "Include visible only (true), hidden only (false), or all (null)",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "role",
      "description" => "The role the plan is targeted for, values are: DEVELOPER, RETAILER, ADVERTISER",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/3.18/subscription/usage/get', {
  "resourcePath" => "/Subscription",
  "summary" => "Get Subscription Usage",
  "nickname" => "get_subscription_usage",
  "responseClass" => "ApplicationUsageResponse",
  "endpoint" => "/subscription/usage/get",
  "notes" => "Use the accountId to determine the associated BillableEntity.  Then get the application usage.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account used to perform the lookup",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "application_id",
      "description" => "Get for just 1 application instead of the BillableEntity",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "start",
      "description" => "The start time frame",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "_end",
      "description" => "The end time frame",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/3.18/subscription/update', {
  "resourcePath" => "/Subscription",
  "summary" => "Update Subscription",
  "nickname" => "update_subscription",
  "responseClass" => "SubscriptionResponse",
  "endpoint" => "/subscription/update",
  "notes" => "Updates the subscription for the billable entity for an account",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "The account used to perform the update, must be the responsible manager",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "plan_id",
      "description" => "The plan to subscribe to",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "promo_code",
      "description" => "Set a promo code for a discount.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "active",
      "description" => "Set active status",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

