-module(openapi_album_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/api/:version/album/create`, OperationId: `addAlbumCollection`:
Create Album.
Create an Album.

- `POST` to `/api/:version/album/user/add`, OperationId: `addAlbumUsers`:
Add Album Users.
Add users to an album as participants.

- `POST` to `/api/:version/album/approve`, OperationId: `approveAlbum`:
Approve Album.
Sets the approval status of an Album.

- `GET` to `/api/:version/album/get`, OperationId: `getAlbumCollection`:
 Get Album.
Get an Album.

- `POST` to `/api/:version/album/user/leave`, OperationId: `leaveAlbum`:
Leave Album.
 Allows a user to leave an album (they are no longer considered a participant). The album creator cannot leave their own albums.

- `POST` to `/api/:version/album/delete`, OperationId: `removeAlbum`:
Delete Album.
Deletes an Album

- `POST` to `/api/:version/album/user/delete`, OperationId: `removeAlbumUsers`:
Remove Album Users.
Remove participants of an album.

- `GET` to `/api/:version/album/search`, OperationId: `searchAlbums`:
Search Albums.
Searches on Albums.

- `POST` to `/api/:version/album/update`, OperationId: `updateAlbumCollection`:
Update Album.
Update an Album.

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

-type class() :: 'album'.

-type operation_id() ::
    'addAlbumCollection' %% Create Album
    | 'addAlbumUsers' %% Add Album Users
    | 'approveAlbum' %% Approve Album
    | 'getAlbumCollection' %%  Get Album
    | 'leaveAlbum' %% Leave Album
    | 'removeAlbum' %% Delete Album
    | 'removeAlbumUsers' %% Remove Album Users
    | 'searchAlbums' %% Search Albums
    | 'updateAlbumCollection'. %% Update Album


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
allowed_methods(Req, #state{operation_id = 'addAlbumCollection'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'addAlbumUsers'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'approveAlbum'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getAlbumCollection'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'leaveAlbum'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'removeAlbum'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'removeAlbumUsers'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchAlbums'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateAlbumCollection'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'addAlbumCollection'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'addAlbumUsers'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'approveAlbum'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getAlbumCollection'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'leaveAlbum'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'removeAlbum'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'removeAlbumUsers'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchAlbums'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateAlbumCollection'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'addAlbumCollection'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'addAlbumUsers'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'approveAlbum'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getAlbumCollection'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'leaveAlbum'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'removeAlbum'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'removeAlbumUsers'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchAlbums'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateAlbumCollection'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'addAlbumCollection'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'addAlbumUsers'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'approveAlbum'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getAlbumCollection'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'leaveAlbum'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'removeAlbum'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'removeAlbumUsers'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchAlbums'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateAlbumCollection'} = State) ->
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
    {Res, Req1, Context1} = Handler(album, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(album, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
