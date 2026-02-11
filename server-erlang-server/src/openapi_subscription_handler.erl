-module(openapi_subscription_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/subscription/create`, OperationId: `createSubscription`:
Create Subscription.
Create a subscription for a billable entity.  Provide a planId, if not provided then the base plan will be assigned.

- `POST` to `/subscription/delete`, OperationId: `deleteSubscription`:
Delete Subscription.
Suspend the current subscription for the billable entity managed by the account.  The account must be the responsible manager to perform this action

- `GET` to `/subscription/get`, OperationId: `getSubscription`:
Get Subscription.
Use the accountId to determine the associated BillableEntity.  Then get the subscription.

- `GET` to `/subscription/plan/get`, OperationId: `getSubscriptionPlan`:
Get Subscription Plan.
Get the matched subscription plan

- `GET` to `/subscription/plan/list`, OperationId: `getSubscriptionPlans`:
List Subscription Plans.
Get the matched subscription plan

- `GET` to `/subscription/usage/get`, OperationId: `getSubscriptionUsage`:
Get Subscription Usage.
Use the accountId to determine the associated BillableEntity.  Then get the application usage.

- `POST` to `/subscription/update`, OperationId: `updateSubscription`:
Update Subscription.
Updates the subscription for the billable entity for an account

""".

-behaviour(cowboy_rest).

-include_lib("kernel/include/logger.hrl").

%% Cowboy REST callbacks
-export([init/2]).
-export([allowed_methods/2]).
-export([content_types_accepted/2]).
-export([content_types_provided/2]).
-export([delete_resource/2]).
-export([is_authorized/2]).
-export([valid_content_headers/2]).
-export([handle_type_accepted/2, handle_type_provided/2]).

-ignore_xref([handle_type_accepted/2, handle_type_provided/2]).

-export_type([class/0, operation_id/0]).

-type class() :: 'subscription'.

-type operation_id() ::
    'createSubscription' %% Create Subscription
    | 'deleteSubscription' %% Delete Subscription
    | 'getSubscription' %% Get Subscription
    | 'getSubscriptionPlan' %% Get Subscription Plan
    | 'getSubscriptionPlans' %% List Subscription Plans
    | 'getSubscriptionUsage' %% Get Subscription Usage
    | 'updateSubscription'. %% Update Subscription


-record(state,
        {operation_id :: operation_id(),
         accept_callback :: openapi_logic_handler:accept_callback(),
         provide_callback :: openapi_logic_handler:provide_callback(),
         api_key_callback :: openapi_logic_handler:api_key_callback(),
         context = #{} :: openapi_logic_handler:context()}).

-type state() :: #state{}.

-spec init(cowboy_req:req(), openapi_router:init_opts()) ->
    {cowboy_rest, cowboy_req:req(), state()}.
init(Req, {Operations, Module}) ->
    Method = cowboy_req:method(Req),
    OperationID = maps:get(Method, Operations, undefined),
    ?LOG_INFO(#{what => "Attempt to process operation",
                method => Method,
                operation_id => OperationID}),
    State = #state{operation_id = OperationID,
                   accept_callback = fun Module:accept_callback/4,
                   provide_callback = fun Module:provide_callback/4,
                   api_key_callback = fun Module:api_key_callback/2},
    {cowboy_rest, Req, State}.

-spec allowed_methods(cowboy_req:req(), state()) ->
    {[binary()], cowboy_req:req(), state()}.
allowed_methods(Req, #state{operation_id = 'createSubscription'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteSubscription'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getSubscription'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getSubscriptionPlan'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getSubscriptionPlans'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getSubscriptionUsage'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateSubscription'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'createSubscription'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteSubscription'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getSubscription'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getSubscriptionPlan'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getSubscriptionPlans'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getSubscriptionUsage'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateSubscription'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'createSubscription'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteSubscription'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getSubscription'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getSubscriptionPlan'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getSubscriptionPlans'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getSubscriptionUsage'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateSubscription'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'createSubscription'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteSubscription'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getSubscription'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getSubscriptionPlan'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getSubscriptionPlans'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getSubscriptionUsage'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateSubscription'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, State) ->
    {[], Req, State}.

-spec delete_resource(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
delete_resource(Req, State) ->
    {Res, Req1, State1} = handle_type_accepted(Req, State),
    {true =:= Res, Req1, State1}.

-spec handle_type_accepted(cowboy_req:req(), state()) ->
    { openapi_logic_handler:accept_callback_return(), cowboy_req:req(), state()}.
handle_type_accepted(Req, #state{operation_id = OperationID,
                                 accept_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(subscription, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(subscription, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
