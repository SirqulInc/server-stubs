-module(openapi_ticket_handler).
-moduledoc """
Exposes the following operation IDs:

- `GET` to `/api/:version/ticket/count`, OperationId: `getTicketCount`:
Get Ticket Count.
Gets the ticket count.

- `GET` to `/api/:version/ticket/getList`, OperationId: `getTicketList`:
Get Ticket List.
Gets the list of tickets.

- `POST` to `/api/:version/purchase/gift`, OperationId: `giftPurchase`:
Gift Tickets.
Gift tickets to another user.

- `POST` to `/api/:version/ticket/save`, OperationId: `saveTicket`:
Save Ticket.
Allow user to acquire a purchase item and generate a ticket record. Used to redeem tickets or add tickets to the system.

- `POST` to `/api/:version/ticket/save/fileUpload`, OperationId: `saveTicketViaFileUpload`:
Save Ticket with Reciept.
Similar to the Save Ticket endpoint but allows the receiptData to be in binary format. This must be a multi-part post

- `GET` to `/api/:version/ticket/ticketoffers`, OperationId: `ticketOffers`:
Get Ticket Offers.
Get a list offers for tickets owned by sirqul.  Purchasing these will add the number of tickets to the account specified by the offer.

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

-type class() :: 'ticket'.

-type operation_id() ::
    'getTicketCount' %% Get Ticket Count
    | 'getTicketList' %% Get Ticket List
    | 'giftPurchase' %% Gift Tickets
    | 'saveTicket' %% Save Ticket
    | 'saveTicketViaFileUpload' %% Save Ticket with Reciept
    | 'ticketOffers'. %% Get Ticket Offers


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
allowed_methods(Req, #state{operation_id = 'getTicketCount'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getTicketList'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'giftPurchase'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'saveTicket'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'saveTicketViaFileUpload'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'ticketOffers'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'getTicketCount'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getTicketList'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'giftPurchase'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'saveTicket'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'saveTicketViaFileUpload'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'ticketOffers'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'getTicketCount'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getTicketList'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'giftPurchase'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'saveTicket'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'saveTicketViaFileUpload'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'ticketOffers'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'getTicketCount'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getTicketList'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'giftPurchase'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'saveTicket'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'saveTicketViaFileUpload'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'ticketOffers'} = State) ->
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
    {Res, Req1, Context1} = Handler(ticket, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(ticket, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
