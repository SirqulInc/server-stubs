-module(openapi_invite_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/api/:version/invite/accept`, OperationId: `acceptInvite`:
Accept Invite.
Allows a user to accept an invite. The user could also become the inviter&#39;s friend.

- `POST` to `/api/:version/invite/albumContest`, OperationId: `albumContestInvite`:
Invite to Contest.
Allows a user to invite people to gain access to a contest. This will generate an invite token, which when used, will give the invitee access to a contest (whether it is private or not). The invitee will also become the user&#39;s friend when the invitation is accepted.

- `POST` to `/api/:version/invite/album`, OperationId: `albumInvite`:
Invite to Collection.
Allows a user to invite people to gain access to a collection. This will generate an invite token, which when used, will give the invitee access to a collection (whether it is private or not). The invitee will also become the user&#39;s friend when the invitation is accepted.

- `POST` to `/api/:version/invite/event`, OperationId: `eventInvite`:
Invite to Event.
Allows a user to invite people to attend an event. This will generate an invite token, which when used, will allow the invitee to add the offer to their wallet.

- `POST` to `/api/:version/invite/gameLevel`, OperationId: `gameInvite`:
Invite to Game Level.
Allows a user to invite people to gain access to an album. This will generate an invite token, which when used, will give the invitee access to an album (whether it is private or not). The invitee will also become the user&#39;s friend when the invitation is accepted.

- `GET` to `/api/:version/invite/get`, OperationId: `getInvite`:
Get Invite.
This is used to determine whether an invite token is valid. If the token is valid, this will also return information about who invited the user, and what they are invited to.

- `POST` to `/api/:version/invite/mission`, OperationId: `missionInvite`:
Invite to Mission.
Allows a user to invite people to gain access to a mission. This will generate an invite token, which when used, will give the invitee access to a mission (whether it is private or not). The invitee will also become the user&#39;s friend when the invitation is accepted.

- `POST` to `/api/:version/invite/offer`, OperationId: `offerInvite`:
Invite to Offer.
Allows a user to invite people to favorite an offer. This will generate an invite token, which when used, will give the invitee the offer in their favorite&#39;s list.

- `POST` to `/api/:version/invite/offerLocation`, OperationId: `offerLocationInvite`:
Invite to Offer Location.
Allows a user to invite people to favorite an offer location. This will generate an invite token, which when used, will give the invitee the offer location in their favorite&#39;s list.

- `POST` to `/api/:version/invite/retailerLocation`, OperationId: `retailerLocationInvite`:
Invite to Retailer Location.
Allows a user to invite people to favorite a retailer location. This will generate an invite token, which when used, will give the invitee the retailer location in their favorite&#39;s list.

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

-type class() :: 'invite'.

-type operation_id() ::
    'acceptInvite' %% Accept Invite
    | 'albumContestInvite' %% Invite to Contest
    | 'albumInvite' %% Invite to Collection
    | 'eventInvite' %% Invite to Event
    | 'gameInvite' %% Invite to Game Level
    | 'getInvite' %% Get Invite
    | 'missionInvite' %% Invite to Mission
    | 'offerInvite' %% Invite to Offer
    | 'offerLocationInvite' %% Invite to Offer Location
    | 'retailerLocationInvite'. %% Invite to Retailer Location


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
allowed_methods(Req, #state{operation_id = 'acceptInvite'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'albumContestInvite'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'albumInvite'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'eventInvite'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'gameInvite'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getInvite'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'missionInvite'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'offerInvite'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'offerLocationInvite'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'retailerLocationInvite'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'acceptInvite'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'albumContestInvite'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'albumInvite'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'eventInvite'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'gameInvite'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getInvite'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'missionInvite'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'offerInvite'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'offerLocationInvite'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'retailerLocationInvite'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'acceptInvite'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'albumContestInvite'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'albumInvite'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'eventInvite'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'gameInvite'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getInvite'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'missionInvite'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'offerInvite'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'offerLocationInvite'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'retailerLocationInvite'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'acceptInvite'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'albumContestInvite'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'albumInvite'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'eventInvite'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'gameInvite'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getInvite'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'missionInvite'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'offerInvite'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'offerLocationInvite'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'retailerLocationInvite'} = State) ->
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
    {Res, Req1, Context1} = Handler(invite, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(invite, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
