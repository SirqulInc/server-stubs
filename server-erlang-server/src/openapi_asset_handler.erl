-module(openapi_asset_handler).
-moduledoc """
Exposes the following operation IDs:

- `GET` to `/asset/download/:filename`, OperationId: `assetDownload`:
Download Asset.
Downloads an asset from the server for assets that have been uploaded to the server.

- `POST` to `/asset/morph`, OperationId: `assetMorph`:
Convert Offer to Creative.
Converts an offer image + text into a creative image.

- `POST` to `/asset/create`, OperationId: `createAsset`:
Create Asset.
Uploads an asset to server and returns an asset id which can be used to assign to various objects.

- `POST` to `/asset/delete`, OperationId: `deleteAsset`:
Delete Asset.
Delete an asset.

- `GET` to `/asset/get`, OperationId: `getAsset`:
Get Asset.
Gets the full asset response including attached likes and notes.

- `POST` to `/asset/remove`, OperationId: `removeAsset`:
Remove Asset from Collection.
Remove assets from collections

- `GET` to `/asset/search`, OperationId: `searchAssets`:
Search Assets.
Searches for assets

- `POST` to `/asset/update`, OperationId: `updateAsset`:
Update Asset.
Updates an asset&#39;s meta data. If an album reference is passed in, the participants with write permissions are allowed to edit the asset. Otherwise, only the asset up-loader has permission to edit the data.

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

-type class() :: 'asset'.

-type operation_id() ::
    'assetDownload' %% Download Asset
    | 'assetMorph' %% Convert Offer to Creative
    | 'createAsset' %% Create Asset
    | 'deleteAsset' %% Delete Asset
    | 'getAsset' %% Get Asset
    | 'removeAsset' %% Remove Asset from Collection
    | 'searchAssets' %% Search Assets
    | 'updateAsset'. %% Update Asset


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
allowed_methods(Req, #state{operation_id = 'assetDownload'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'assetMorph'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createAsset'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteAsset'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getAsset'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'removeAsset'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchAssets'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateAsset'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'assetDownload'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'assetMorph'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createAsset'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteAsset'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getAsset'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'removeAsset'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchAssets'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateAsset'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'assetDownload'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'assetMorph'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createAsset'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteAsset'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getAsset'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'removeAsset'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchAssets'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateAsset'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'assetDownload'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'assetMorph'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createAsset'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteAsset'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getAsset'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'removeAsset'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchAssets'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateAsset'} = State) ->
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
    {Res, Req1, Context1} = Handler(asset, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(asset, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
