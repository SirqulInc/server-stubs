-module(openapi_creative_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/creative/addpreview`, OperationId: `addPreview`:
Add Preview.
Enable this ad for preview for this account.

- `GET` to `/ads/find`, OperationId: `adsFind`:
Find Missions.
Get a set of ad filtered by the parameters provided.

- `POST` to `/creative/create`, OperationId: `createCreative`:
Create Creative.
Create a creative

- `POST` to `/creative/delete`, OperationId: `deleteCreative`:
Delete Creative.
Delete a creative

- `GET` to `/creative/get`, OperationId: `getCreative`:
Get Creative.
Get a creative

- `GET` to `/creative/search`, OperationId: `getCreativesByApplication`:
Search Creatives.
Get a list of levels for an application, just those the account has permissions to view.

- `POST` to `/creative/removepreview`, OperationId: `removePreview`:
Remove Preview.
Remove this ad for preview for this account.

- `POST` to `/creative/update`, OperationId: `updateCreative`:
Update Creative.
Update a creative

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

-type class() :: 'creative'.

-type operation_id() ::
    'addPreview' %% Add Preview
    | 'adsFind' %% Find Missions
    | 'createCreative' %% Create Creative
    | 'deleteCreative' %% Delete Creative
    | 'getCreative' %% Get Creative
    | 'getCreativesByApplication' %% Search Creatives
    | 'removePreview' %% Remove Preview
    | 'updateCreative'. %% Update Creative


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
allowed_methods(Req, #state{operation_id = 'addPreview'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'adsFind'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createCreative'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteCreative'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getCreative'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getCreativesByApplication'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'removePreview'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateCreative'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'addPreview'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'adsFind'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createCreative'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteCreative'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getCreative'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getCreativesByApplication'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'removePreview'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateCreative'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'addPreview'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'adsFind'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createCreative'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteCreative'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getCreative'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getCreativesByApplication'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'removePreview'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateCreative'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'addPreview'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'adsFind'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createCreative'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteCreative'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getCreative'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getCreativesByApplication'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'removePreview'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateCreative'} = State) ->
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
    {Res, Req1, Context1} = Handler(creative, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(creative, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
