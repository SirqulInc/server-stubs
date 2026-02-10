-module(openapi_vatom_handler).
-moduledoc """
Exposes the following operation IDs:

- `POST` to `/api/:version/vatom/me/rels/following/create`, OperationId: `createFollowing`:
Create following.
Create following.

- `POST` to `/api/:version/vatom/b/spaces/create`, OperationId: `createSpace`:
Create Vatom Space.
Create a Vatom space.

- `POST` to `/api/:version/vatom/b/events/create`, OperationId: `createVatomEvent`:
Create Vatom Event.
Create a Vatom event.

- `POST` to `/api/:version/vatom/me/rels/following/delete`, OperationId: `deleteFollowing`:
Delete following.
Delete following.

- `POST` to `/api/:version/vatom/b/campaign/points/delete`, OperationId: `deletePointsBalance`:
Reset All Points Balance.
Reset All Points Balance.

- `POST` to `/api/:version/vatom/b/spaces/delete`, OperationId: `deleteSpace`:
Delete Vatom Space.
Delete a Vatom space.

- `POST` to `/api/:version/vatom/b/events/delete`, OperationId: `deleteVatomEvent`:
Delete Vatom Event.
Delete a Vatom event.

- `POST` to `/api/:version/vatom/vatoms/delete`, OperationId: `deleteVatomNFT`:
Delete Vatom NFT.
Delete Vatom NFT

- `POST` to `/api/:version/vatom/vatoms/execute-action`, OperationId: `executeActionOnNFT`:
Execute Action on NFT.
Execute Action on NFT.

- `GET` to `/api/:version/vatom/vatoms/geo-map/search`, OperationId: `geomapSearch`:
Search Vatom Geo Map.
Search Vatom Geo Map

- `GET` to `/api/:version/vatom/b/behaviors`, OperationId: `getBusinessBehaviors`:
Get Vatom Business Behaviors.
Gets the behaviors of a business.

- `GET` to `/api/:version/vatom/b/coins/get`, OperationId: `getBusinessCoinsBalance`:
Get the coins for a Business.
Get the coins for a Businesss.

- `GET` to `/api/:version/vatom/me/businesses`, OperationId: `getBusinessIds`:
Get the user business ids.
Get the business ids the logged in user has access to.

- `GET` to `/api/:version/vatom/b/get`, OperationId: `getBusinessInfo`:
Get Vatom Business Info.
Gets the business info tied to this account.

- `GET` to `/api/:version/vatom/b/users`, OperationId: `getBusinessUsers`:
Get Vatom Business Users.
Gets the users of a business.

- `GET` to `/api/:version/vatom/b/campaign-groups/entities`, OperationId: `getCampaignGroupEntities`:
Get Campaign Group Entities.
Get campaign group entities.

- `GET` to `/api/:version/vatom/b/campaign-groups/rules`, OperationId: `getCampaignGroupRules`:
Get Campaign Group Rules.
Get campaign group rules.

- `GET` to `/api/:version/vatom/b/campaign-groups/stats`, OperationId: `getCampaignGroupStats`:
Get Campaign Group Stats.
Get campaign group stats.

- `GET` to `/api/:version/vatom/b/campaign-groups/get`, OperationId: `getCampaignInfo`:
Get Campaign Info.
Gets the info on a campaign.

- `GET` to `/api/:version/vatom/b/events/guests/get`, OperationId: `getEventGuestList`:
Get Vatom Event Guest List.
Gets the guest list of an event.

- `GET` to `/api/:version/vatom/me/inventory`, OperationId: `getInventory`:
Get Vatom User&#39;s Inventory.
Gets the logged in user&#39;s Vatom Inventory.

- `GET` to `/api/:version/vatom/me/rels/following`, OperationId: `getMyFollowing`:
Get following.
Get following.

- `GET` to `/api/:version/vatom/u/campaign/points/get`, OperationId: `getPointsBalance`:
Get Points Balance.
Gets the points balance of a Vatom user.

- `GET` to `/api/:version/vatom/b/campaign/u/points/get`, OperationId: `getPointsBalanceAsBusiness`:
Get Points Balance as Business.
Gets the points balance of a Vatom user.

- `GET` to `/api/:version/vatom/b/spaces/get`, OperationId: `getSpace`:
Get Vatom Space.
Gets the details of a space.

- `GET` to `/api/:version/vatom/b/users/coins/get`, OperationId: `getUserCoinsAsBusiness`:
Get the coins for a user (as a Business).
Get the coins for a user (as a Business).

- `GET` to `/api/:version/vatom/u/coins/get`, OperationId: `getUserCoinsBalance`:
Gets the coins balance for a Vatom User.
Gets the coins balance for a Vatom User.

- `GET` to `/api/:version/vatom/users/rels/followers`, OperationId: `getUserFollowers`:
Get user followers.
Get user followers.

- `GET` to `/api/:version/vatom/users/rels/following`, OperationId: `getUserFollowing`:
Get user following.
Get user following.

- `GET` to `/api/:version/vatom/user/get`, OperationId: `getUserInfo`:
Get User Info.
Get a User&#39;s Info.

- `GET` to `/api/:version/vatom/me/get`, OperationId: `getUserProfile`:
Get Vatom User Profile.
Gets the logged in user&#39;s profile in Vatom.

- `GET` to `/api/:version/vatom/b/events/get`, OperationId: `getVatomEvent`:
Get Vatom Event.
Gets the details of a event.

- `GET` to `/api/:version/vatom/vatoms/get`, OperationId: `getVatomNFT`:
Get Vatom NFT Details.
Get Vatom NFT Details

- `GET` to `/api/:version/vatom/b/communities/search`, OperationId: `listCommunities`:
List Vatom Communities.
Gets the communities tied to a business.

- `GET` to `/api/:version/vatom/b/events/search`, OperationId: `listEvents`:
List Vatom Events.
Gets the events tied to a business.

- `GET` to `/api/:version/vatom/b/spaces/search`, OperationId: `listSpaces`:
List Vatom Spaces.
Gets the spaces tied to a business.

- `GET` to `/api/:version/vatom/u/coins/txns/search`, OperationId: `listUserCoinTransactions`:
List Coin Transactions for a Vatom User.
Gets the logged in user&#39;s Vatom coin transactions.

- `GET` to `/api/:version/vatom/b/users/coins/txns/search`, OperationId: `listUserCoinTransactionsAsBusiness`:
List coin transactions for a user (as a Business).
List coin transactions for a user (as a Business).

- `POST` to `/api/:version/vatom/me/vatoms/actions`, OperationId: `performActionOnNFT`:
Perform Action on NFT.
Perform Action on NFT.

- `POST` to `/api/:version/vatom/b/redemptions`, OperationId: `redeemNFT`:
Redeem NFT.
Redeem an NFT.

- `POST` to `/api/:version/vatom/b/users/coins/redeem`, OperationId: `redeemUserCoinsAsBusiness`:
Redeem the coins for a user (as a Business).
Redeem the coins for a user (as a Business).

- `GET` to `/api/:version/vatom/b/search`, OperationId: `searchBusinesses`:
Search for Vatom Businesses.
Searches for Vatom businesses.

- `GET` to `/api/:version/vatom/b/campaign-groups/search`, OperationId: `searchCampaignGroups`:
Search Campaign Groups.
Search campaign groups.

- `GET` to `/api/:version/vatom/me/identities/search`, OperationId: `searchIdentities`:
Search User Identities.
Search User Identities.

- `GET` to `/api/:version/vatom/user-inventory/search`, OperationId: `searchInventory`:
Search Vatom User&#39;s Inventory.
Searches the logged in user&#39;s Vatom Inventory.

- `POST` to `/api/:version/vatom/b/campaigns/send`, OperationId: `sendNFT`:
Send NFT.
Send an NFT.

- `POST` to `/api/:version/vatom/b/campaign/u/points/update`, OperationId: `setPointsBalanceAsBusiness`:
Set Points Balance as Business.
Sets the points balance of a Vatom user.

- `POST` to `/api/:version/vatom/u/coins/transfer`, OperationId: `transferUserCoins`:
Transfer coins from Vatom Users.
Transfer coins from Vatom Users.

- `POST` to `/api/:version/vatom/b/coins/update`, OperationId: `updateBusinessCoins`:
Fund coins for a Business.
Fund/update coins for a Businesss.

- `POST` to `/api/:version/vatom/b/events/guests/update`, OperationId: `updateEventGuestList`:
Update Vatom Event Guest List.
Update the guest list of an event.

- `POST` to `/api/:version/vatom/b/spaces/update`, OperationId: `updateSpace`:
Update Vatom Space.
Update a Vatom space.

- `POST` to `/api/:version/vatom/b/users/coins/update`, OperationId: `updateUserCoinsAsBusiness`:
Update the coins for a user (as a Business).
Update the coins for a user (as a Business).

- `POST` to `/api/:version/vatom/me/update`, OperationId: `updateUserProfile`:
Update Vatom User Profile.
Gets the logged in user&#39;s profile in Vatom.

- `POST` to `/api/:version/vatom/b/events/update`, OperationId: `updateVatomEvent`:
Update Vatom Event.
Update a Vatom event.

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

-type class() :: 'vatom'.

-type operation_id() ::
    'createFollowing' %% Create following
    | 'createSpace' %% Create Vatom Space
    | 'createVatomEvent' %% Create Vatom Event
    | 'deleteFollowing' %% Delete following
    | 'deletePointsBalance' %% Reset All Points Balance
    | 'deleteSpace' %% Delete Vatom Space
    | 'deleteVatomEvent' %% Delete Vatom Event
    | 'deleteVatomNFT' %% Delete Vatom NFT
    | 'executeActionOnNFT' %% Execute Action on NFT
    | 'geomapSearch' %% Search Vatom Geo Map
    | 'getBusinessBehaviors' %% Get Vatom Business Behaviors
    | 'getBusinessCoinsBalance' %% Get the coins for a Business
    | 'getBusinessIds' %% Get the user business ids
    | 'getBusinessInfo' %% Get Vatom Business Info
    | 'getBusinessUsers' %% Get Vatom Business Users
    | 'getCampaignGroupEntities' %% Get Campaign Group Entities
    | 'getCampaignGroupRules' %% Get Campaign Group Rules
    | 'getCampaignGroupStats' %% Get Campaign Group Stats
    | 'getCampaignInfo' %% Get Campaign Info
    | 'getEventGuestList' %% Get Vatom Event Guest List
    | 'getInventory' %% Get Vatom User&#39;s Inventory
    | 'getMyFollowing' %% Get following
    | 'getPointsBalance' %% Get Points Balance
    | 'getPointsBalanceAsBusiness' %% Get Points Balance as Business
    | 'getSpace' %% Get Vatom Space
    | 'getUserCoinsAsBusiness' %% Get the coins for a user (as a Business)
    | 'getUserCoinsBalance' %% Gets the coins balance for a Vatom User
    | 'getUserFollowers' %% Get user followers
    | 'getUserFollowing' %% Get user following
    | 'getUserInfo' %% Get User Info
    | 'getUserProfile' %% Get Vatom User Profile
    | 'getVatomEvent' %% Get Vatom Event
    | 'getVatomNFT' %% Get Vatom NFT Details
    | 'listCommunities' %% List Vatom Communities
    | 'listEvents' %% List Vatom Events
    | 'listSpaces' %% List Vatom Spaces
    | 'listUserCoinTransactions' %% List Coin Transactions for a Vatom User
    | 'listUserCoinTransactionsAsBusiness' %% List coin transactions for a user (as a Business)
    | 'performActionOnNFT' %% Perform Action on NFT
    | 'redeemNFT' %% Redeem NFT
    | 'redeemUserCoinsAsBusiness' %% Redeem the coins for a user (as a Business)
    | 'searchBusinesses' %% Search for Vatom Businesses
    | 'searchCampaignGroups' %% Search Campaign Groups
    | 'searchIdentities' %% Search User Identities
    | 'searchInventory' %% Search Vatom User&#39;s Inventory
    | 'sendNFT' %% Send NFT
    | 'setPointsBalanceAsBusiness' %% Set Points Balance as Business
    | 'transferUserCoins' %% Transfer coins from Vatom Users
    | 'updateBusinessCoins' %% Fund coins for a Business
    | 'updateEventGuestList' %% Update Vatom Event Guest List
    | 'updateSpace' %% Update Vatom Space
    | 'updateUserCoinsAsBusiness' %% Update the coins for a user (as a Business)
    | 'updateUserProfile' %% Update Vatom User Profile
    | 'updateVatomEvent'. %% Update Vatom Event


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
allowed_methods(Req, #state{operation_id = 'createFollowing'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createSpace'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createVatomEvent'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteFollowing'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deletePointsBalance'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteSpace'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteVatomEvent'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteVatomNFT'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'executeActionOnNFT'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'geomapSearch'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getBusinessBehaviors'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getBusinessCoinsBalance'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getBusinessIds'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getBusinessInfo'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getBusinessUsers'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getCampaignGroupEntities'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getCampaignGroupRules'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getCampaignGroupStats'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getCampaignInfo'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getEventGuestList'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getInventory'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getMyFollowing'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getPointsBalance'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getPointsBalanceAsBusiness'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getSpace'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getUserCoinsAsBusiness'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getUserCoinsBalance'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getUserFollowers'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getUserFollowing'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getUserInfo'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getUserProfile'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getVatomEvent'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getVatomNFT'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'listCommunities'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'listEvents'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'listSpaces'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'listUserCoinTransactions'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'listUserCoinTransactionsAsBusiness'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'performActionOnNFT'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'redeemNFT'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'redeemUserCoinsAsBusiness'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchBusinesses'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchCampaignGroups'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchIdentities'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchInventory'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'sendNFT'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'setPointsBalanceAsBusiness'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'transferUserCoins'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateBusinessCoins'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateEventGuestList'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateSpace'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateUserCoinsAsBusiness'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateUserProfile'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateVatomEvent'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'createFollowing'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createSpace'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createVatomEvent'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteFollowing'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deletePointsBalance'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteSpace'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteVatomEvent'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteVatomNFT'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'executeActionOnNFT'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'geomapSearch'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getBusinessBehaviors'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getBusinessCoinsBalance'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getBusinessIds'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getBusinessInfo'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getBusinessUsers'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getCampaignGroupEntities'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getCampaignGroupRules'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getCampaignGroupStats'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getCampaignInfo'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getEventGuestList'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getInventory'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getMyFollowing'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getPointsBalance'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getPointsBalanceAsBusiness'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getSpace'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getUserCoinsAsBusiness'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getUserCoinsBalance'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getUserFollowers'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getUserFollowing'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getUserInfo'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getUserProfile'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getVatomEvent'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getVatomNFT'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'listCommunities'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'listEvents'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'listSpaces'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'listUserCoinTransactions'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'listUserCoinTransactionsAsBusiness'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'performActionOnNFT'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'redeemNFT'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'redeemUserCoinsAsBusiness'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchBusinesses'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchCampaignGroups'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchIdentities'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchInventory'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'sendNFT'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'setPointsBalanceAsBusiness'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'transferUserCoins'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateBusinessCoins'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateEventGuestList'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateSpace'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateUserCoinsAsBusiness'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateUserProfile'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateVatomEvent'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'createFollowing'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createSpace'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createVatomEvent'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteFollowing'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deletePointsBalance'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteSpace'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteVatomEvent'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteVatomNFT'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'executeActionOnNFT'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'geomapSearch'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getBusinessBehaviors'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getBusinessCoinsBalance'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getBusinessIds'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getBusinessInfo'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getBusinessUsers'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getCampaignGroupEntities'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getCampaignGroupRules'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getCampaignGroupStats'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getCampaignInfo'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getEventGuestList'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getInventory'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getMyFollowing'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getPointsBalance'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getPointsBalanceAsBusiness'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getSpace'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getUserCoinsAsBusiness'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getUserCoinsBalance'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getUserFollowers'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getUserFollowing'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getUserInfo'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getUserProfile'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getVatomEvent'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getVatomNFT'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'listCommunities'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'listEvents'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'listSpaces'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'listUserCoinTransactions'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'listUserCoinTransactionsAsBusiness'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'performActionOnNFT'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'redeemNFT'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'redeemUserCoinsAsBusiness'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchBusinesses'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchCampaignGroups'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchIdentities'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchInventory'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'sendNFT'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'setPointsBalanceAsBusiness'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'transferUserCoins'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateBusinessCoins'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateEventGuestList'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateSpace'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateUserCoinsAsBusiness'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateUserProfile'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateVatomEvent'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'createFollowing'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'createSpace'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'createVatomEvent'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteFollowing'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'deletePointsBalance'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteSpace'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteVatomEvent'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteVatomNFT'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'executeActionOnNFT'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'geomapSearch'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getBusinessBehaviors'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getBusinessCoinsBalance'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getBusinessIds'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getBusinessInfo'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getBusinessUsers'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getCampaignGroupEntities'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getCampaignGroupRules'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getCampaignGroupStats'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getCampaignInfo'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getEventGuestList'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getInventory'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getMyFollowing'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getPointsBalance'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getPointsBalanceAsBusiness'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getSpace'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getUserCoinsAsBusiness'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getUserCoinsBalance'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getUserFollowers'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getUserFollowing'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getUserInfo'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getUserProfile'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getVatomEvent'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getVatomNFT'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'listCommunities'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'listEvents'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'listSpaces'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'listUserCoinTransactions'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'listUserCoinTransactionsAsBusiness'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'performActionOnNFT'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'redeemNFT'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'redeemUserCoinsAsBusiness'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'searchBusinesses'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'searchCampaignGroups'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'searchIdentities'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'searchInventory'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'sendNFT'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'setPointsBalanceAsBusiness'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'transferUserCoins'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'updateBusinessCoins'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'updateEventGuestList'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'updateSpace'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'updateUserCoinsAsBusiness'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'updateUserProfile'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'updateVatomEvent'} = State) ->
    {[], Req, State};
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
    {Res, Req1, Context1} = Handler(vatom, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(vatom, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
