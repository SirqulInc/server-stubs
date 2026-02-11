-module(openapi_reporting_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/report/batch/create`, OperationId: `createBatch`:
Create Offline Report.
Create an entry for the batch for offline report

- `POST` to `/report/region/summary/batch`, OperationId: `createRegionLegSummaryBatch`:
Create Offline Report.
Create an entry for the batch for offline report

- `POST` to `/report/batch/delete`, OperationId: `deleteBatch`:
Delete Offline Report.
Deletes a batch report.

- `GET` to `/report/batch/get`, OperationId: `getReportBatch`:
Get Offline Report.
Checks status of batch report.

- `POST` to `/report/run`, OperationId: `runReport`:
Run Report.
 This endpoint allows you to run a set of predefined reports that can be used to understand your users&#39; behavior as well as trends within your application.

- `GET` to `/report/batch/search`, OperationId: `searchBatch`:
Search Offline Reports.
Retrieves batches for a user..

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

-type class() :: 'reporting'.

-type operation_id() ::
    'createBatch' %% Create Offline Report
    | 'createRegionLegSummaryBatch' %% Create Offline Report
    | 'deleteBatch' %% Delete Offline Report
    | 'getReportBatch' %% Get Offline Report
    | 'runReport' %% Run Report
    | 'searchBatch'. %% Search Offline Reports


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
allowed_methods(Req, #state{operation_id = 'createBatch'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createRegionLegSummaryBatch'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteBatch'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getReportBatch'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'runReport'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchBatch'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'createBatch'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createRegionLegSummaryBatch'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteBatch'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getReportBatch'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'runReport'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchBatch'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'createBatch'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createRegionLegSummaryBatch'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteBatch'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getReportBatch'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'runReport'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchBatch'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'createBatch'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createRegionLegSummaryBatch'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteBatch'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getReportBatch'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'runReport'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchBatch'} = State) ->
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
    {Res, Req1, Context1} = Handler(reporting, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(reporting, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
