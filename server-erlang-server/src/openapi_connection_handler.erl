-module(openapi_connection_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/consumer/connection/group/addConnection`, OperationId: `addConnectionToGroup`:
Add Connection.
Adds a connection to a group.

- `POST` to `/connection/group/addConnections`, OperationId: `addConnectionsToGroup`:
Add Connections.
Adds a list of connections to a group.

- `POST` to `/consumer/connection/group/addSubGroup`, OperationId: `addSubGroups`:
Add Connection Groups.
Add sub groups to a group.

- `POST` to `/consumer/connection/add`, OperationId: `createOrUpdateConnection`:
Create or Update Connection.
Creates or updates the connection of the user and another account. Allows a user to follow, block, mark as trusted, and/or add someone to a group.

- `POST` to `/consumer/connection/group`, OperationId: `createOrUpdateGroup`:
Create or Update Connection Group.
Creates a new private group.

- `POST` to `/consumer/follow/accept`, OperationId: `followAccept`:
Accept Follow Request.
Accept someone&#39;s follow request.

- `POST` to `/consumer/follow/reject`, OperationId: `followReject`:
Reject Follow Request.
Reject someone&#39;s follow request or remove them as a follower.

- `POST` to `/consumer/follow/remove`, OperationId: `followRemove`:
Remove Follower / Unfollow.
Unfollow someone you are following or remove them as a follower.

- `POST` to `/consumer/follow/request`, OperationId: `followRequest`:
Send Follow Request.
Send a request to follow someone.

- `POST` to `/consumer/friend/accept`, OperationId: `friendAccept`:
Accept Friend.
Accept a friend request and optionally sends a notification.

- `POST` to `/consumer/friend/reject`, OperationId: `friendReject`:
Decline Friend.
Request a friend request and optionally sends a notification.

- `POST` to `/consumer/friend/remove`, OperationId: `friendRemove`:
Delete Friend.
Removes a friend from the user&#39;s friends list.

- `POST` to `/consumer/friend/request`, OperationId: `friendRequest`:
Request Friend.
Sends a friend request notification to another user.

- `GET` to `/consumer/connection/getRequested`, OperationId: `getConnectionSentFriendRequests`:
Get Sent Friend Requests.
Gets the connection sent friend requests.

- `GET` to `/consumer/connection/get`, OperationId: `getConnections`:
Search Connections.
Gets the connections.

- `GET` to `/consumer/connection/group/details/get`, OperationId: `getGroupDetails`:
Get Connection Group.


- `GET` to `/connection/group/search`, OperationId: `groupSearch`:
Search Connection Groups.
Gets a user&#39;s private groups and default groups.

- `POST` to `/consumer/connection/group/removeConnection`, OperationId: `removeConnectionFromGroup`:
Delete Connection.
Removes the connection from group.

- `POST` to `/connection/group/removeConnections`, OperationId: `removeConnectionsFromGroup`:
Remove Connections.
Remove a list of connections from a group.

- `POST` to `/consumer/connection/group/remove`, OperationId: `removeGroup`:
Delete Connection Group.
Remove a user&#39;s group.

- `POST` to `/consumer/connection/group/removeSubGroup`, OperationId: `removeSubGroups`:
Remove Connection Groups.
Remove sub groups from a group

- `GET` to `/connection/search`, OperationId: `searchConnections`:
Search Possible Connections.
Search for accounts that the user may not have a connection with.

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

-type class() :: 'connection'.

-type operation_id() ::
    'addConnectionToGroup' %% Add Connection
    | 'addConnectionsToGroup' %% Add Connections
    | 'addSubGroups' %% Add Connection Groups
    | 'createOrUpdateConnection' %% Create or Update Connection
    | 'createOrUpdateGroup' %% Create or Update Connection Group
    | 'followAccept' %% Accept Follow Request
    | 'followReject' %% Reject Follow Request
    | 'followRemove' %% Remove Follower / Unfollow
    | 'followRequest' %% Send Follow Request
    | 'friendAccept' %% Accept Friend
    | 'friendReject' %% Decline Friend
    | 'friendRemove' %% Delete Friend
    | 'friendRequest' %% Request Friend
    | 'getConnectionSentFriendRequests' %% Get Sent Friend Requests
    | 'getConnections' %% Search Connections
    | 'getGroupDetails' %% Get Connection Group
    | 'groupSearch' %% Search Connection Groups
    | 'removeConnectionFromGroup' %% Delete Connection
    | 'removeConnectionsFromGroup' %% Remove Connections
    | 'removeGroup' %% Delete Connection Group
    | 'removeSubGroups' %% Remove Connection Groups
    | 'searchConnections'. %% Search Possible Connections


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
allowed_methods(Req, #state{operation_id = 'addConnectionToGroup'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'addConnectionsToGroup'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'addSubGroups'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createOrUpdateConnection'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createOrUpdateGroup'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'followAccept'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'followReject'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'followRemove'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'followRequest'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'friendAccept'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'friendReject'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'friendRemove'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'friendRequest'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getConnectionSentFriendRequests'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getConnections'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getGroupDetails'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'groupSearch'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'removeConnectionFromGroup'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'removeConnectionsFromGroup'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'removeGroup'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'removeSubGroups'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchConnections'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'addConnectionToGroup'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'addConnectionsToGroup'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'addSubGroups'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createOrUpdateConnection'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createOrUpdateGroup'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'followAccept'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'followReject'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'followRemove'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'followRequest'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'friendAccept'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'friendReject'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'friendRemove'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'friendRequest'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getConnectionSentFriendRequests'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getConnections'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getGroupDetails'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'groupSearch'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'removeConnectionFromGroup'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'removeConnectionsFromGroup'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'removeGroup'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'removeSubGroups'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchConnections'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'addConnectionToGroup'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'addConnectionsToGroup'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'addSubGroups'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createOrUpdateConnection'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createOrUpdateGroup'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'followAccept'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'followReject'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'followRemove'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'followRequest'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'friendAccept'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'friendReject'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'friendRemove'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'friendRequest'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getConnectionSentFriendRequests'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getConnections'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getGroupDetails'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'groupSearch'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'removeConnectionFromGroup'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'removeConnectionsFromGroup'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'removeGroup'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'removeSubGroups'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchConnections'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'addConnectionToGroup'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'addConnectionsToGroup'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'addSubGroups'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createOrUpdateConnection'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createOrUpdateGroup'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'followAccept'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'followReject'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'followRemove'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'followRequest'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'friendAccept'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'friendReject'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'friendRemove'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'friendRequest'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getConnectionSentFriendRequests'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getConnections'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getGroupDetails'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'groupSearch'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'removeConnectionFromGroup'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'removeConnectionsFromGroup'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'removeGroup'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'removeSubGroups'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchConnections'} = State) ->
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
    {Res, Req1, Context1} = Handler(connection, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(connection, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
