-module(openapi_account_handler).
-moduledoc """
Exposes the following operation IDs:

- `GET` to `/account/search`, OperationId: `accountLocationSearch`:
Search Accounts by Location.
Search accounts by their location. This only searches on users that have location data. Use ConnectionApi to perform a regular search on accounts.

- `POST` to `/account/block`, OperationId: `blockAccount`:
Block Account.
Moves or removes an account into the user&#39;s blocked group.

- `POST` to `/account/create`, OperationId: `createAccount`:
Create Account.
Create a new account by role.

- `POST` to `/account/profile/update`, OperationId: `editAccount`:
Update Account.
Edit the user&#39;s profile information

- `POST` to `/account/username/update`, OperationId: `editUsername`:
Update Username and Email.
Update account&#39;s own username and/or emailAddress

- `GET` to `/account/profile/get`, OperationId: `getAccount`:
Get Account.
Gets a user&#39;s account profile. Application settings and account settings will also be returned for the owner of the account.

- `GET` to `/account/profile/assets`, OperationId: `getProfileAssets`:
Get Profile Assets.
Get a list of assets a person has ever uploaded. Filters the list based on parameters.

- `GET` to `/account/referral/list`, OperationId: `getReferralList`:
Search Accounts.
Gets a user&#39;s account profile and their referral List.

- `GET` to `/account/settings/get`, OperationId: `getSettings`:
Get Account Settings.
Get the account settings for a user

- `POST` to `/account/login/delegate`, OperationId: `loginDelegate`:
Login as Account.
A login service that supports logging in as someone else (accounts that the user manages). Intended for internal use for now.

- `POST` to `/account/login`, OperationId: `loginGeneral`:
Login Account.
General login service that supports various authentication methods. Currently supports Facebook, Twitter, Sirqul Username, and Sirqul Phone by default. Can also support custom networks created using the {@link ThirdPartyApi}

- `POST` to `/account/get`, OperationId: `loginUsername`:
Login Account (Username).
Login to system with an account

- `POST` to `/account/logout`, OperationId: `logout`:
Logout Account.
Cleans up the users data for logging out.

- `POST` to `/account/merge`, OperationId: `mergeAccount`:
Merge Account.
Merges the analytics, achievements, leaderboards of two accounts.

- `POST` to `/account/passwordchange`, OperationId: `passwordChange`:
Update Password.
Update the account password.

- `POST` to `/account/passwordreset`, OperationId: `passwordReset`:
Reset Password.
Reset the account password. The token must be valid and not expired. Use the RequestPasswordReset end point to request a token.

- `POST` to `/account/requestpasswordreset`, OperationId: `requestPasswordReset`:
Request Password Reset.
Request that an account password be reset. The account is looked up by email address and then a link is sent via email to that account with a reset token. The token is valid for 24 hours.

- `POST` to `/account/requestValidateAccount`, OperationId: `requestValidateAccount`:
Send Validation Request.
Send an email to validate a user&#39;s account.

- `GET` to `/account/profile/search`, OperationId: `searchAccounts`:
Search Accounts.
Search for account profiles.

- `POST` to `/account/login/validate`, OperationId: `secureLogin`:
Login Account (Encrypted Username).
ogin with encrypted user-name and password.

- `POST` to `/account/create/validate`, OperationId: `secureSignup`:
Create Account (Encrypted Username).
Create a new account by role (with encrypted user-name and password)

- `POST` to `/consumer/profile/matchToken`, OperationId: `setMatchToken`:
Save Match Token.
Save user&#39;s match token to be used for profile match making

- `POST` to `/account/active/update`, OperationId: `updateActveStatus`:
Update Account Active Status.
Activate or deactivate an account (requires appropriate permissions).

- `POST` to `/account/location/update`, OperationId: `updateLocation`:
Update Location.
Update the account location

- `POST` to `/account/settings/update`, OperationId: `updateSettings`:
Update Account Settings.
Update the account settings for a user

- `POST` to `/account/validateAccountSignup`, OperationId: `validateAccountSignup`:
Save Validation Status.
Validate the account&#39;s email address. The token must be valid and not expired. Use the RequestValidateAccount end point to request a new token.

- `POST` to `/account/validatepasswordreset`, OperationId: `validatePasswordReset`:
Validate Password Reset Token.
Validate the password reset token. The token must be valid and not expired. Use the RequestPasswordReset end point to request a token. The user receives and email with the reset page, therefore it should be validated before bwing used to reset the password.

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

-type class() :: 'account'.

-type operation_id() ::
    'accountLocationSearch' %% Search Accounts by Location
    | 'blockAccount' %% Block Account
    | 'createAccount' %% Create Account
    | 'editAccount' %% Update Account
    | 'editUsername' %% Update Username and Email
    | 'getAccount' %% Get Account
    | 'getProfileAssets' %% Get Profile Assets
    | 'getReferralList' %% Search Accounts
    | 'getSettings' %% Get Account Settings
    | 'loginDelegate' %% Login as Account
    | 'loginGeneral' %% Login Account
    | 'loginUsername' %% Login Account (Username)
    | 'logout' %% Logout Account
    | 'mergeAccount' %% Merge Account
    | 'passwordChange' %% Update Password
    | 'passwordReset' %% Reset Password
    | 'requestPasswordReset' %% Request Password Reset
    | 'requestValidateAccount' %% Send Validation Request
    | 'searchAccounts' %% Search Accounts
    | 'secureLogin' %% Login Account (Encrypted Username)
    | 'secureSignup' %% Create Account (Encrypted Username)
    | 'setMatchToken' %% Save Match Token
    | 'updateActveStatus' %% Update Account Active Status
    | 'updateLocation' %% Update Location
    | 'updateSettings' %% Update Account Settings
    | 'validateAccountSignup' %% Save Validation Status
    | 'validatePasswordReset'. %% Validate Password Reset Token


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
allowed_methods(Req, #state{operation_id = 'accountLocationSearch'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'blockAccount'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'createAccount'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'editAccount'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'editUsername'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getAccount'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getProfileAssets'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getReferralList'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getSettings'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'loginDelegate'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'loginGeneral'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'loginUsername'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'logout'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'mergeAccount'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'passwordChange'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'passwordReset'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'requestPasswordReset'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'requestValidateAccount'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'searchAccounts'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'secureLogin'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'secureSignup'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'setMatchToken'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateActveStatus'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateLocation'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'updateSettings'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'validateAccountSignup'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'validatePasswordReset'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'accountLocationSearch'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'blockAccount'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'createAccount'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'editAccount'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'editUsername'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getAccount'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getProfileAssets'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getReferralList'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getSettings'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'loginDelegate'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'loginGeneral'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'loginUsername'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'logout'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'mergeAccount'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'passwordChange'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'passwordReset'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'requestPasswordReset'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'requestValidateAccount'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'searchAccounts'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'secureLogin'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'secureSignup'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'setMatchToken'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateActveStatus'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateLocation'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'updateSettings'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'validateAccountSignup'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'validatePasswordReset'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'accountLocationSearch'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'blockAccount'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'createAccount'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'editAccount'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'editUsername'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getAccount'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getProfileAssets'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getReferralList'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getSettings'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'loginDelegate'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'loginGeneral'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'loginUsername'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'logout'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'mergeAccount'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'passwordChange'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'passwordReset'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'requestPasswordReset'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'requestValidateAccount'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'searchAccounts'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'secureLogin'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'secureSignup'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'setMatchToken'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateActveStatus'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateLocation'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'updateSettings'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'validateAccountSignup'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'validatePasswordReset'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'accountLocationSearch'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'blockAccount'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'createAccount'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'editAccount'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'editUsername'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getAccount'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getProfileAssets'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getReferralList'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getSettings'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'loginDelegate'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'loginGeneral'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'loginUsername'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'logout'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'mergeAccount'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'passwordChange'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'passwordReset'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'requestPasswordReset'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'requestValidateAccount'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'searchAccounts'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'secureLogin'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'secureSignup'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'setMatchToken'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateActveStatus'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateLocation'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'updateSettings'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'validateAccountSignup'} = State) ->
    {[
      {<<"*/*">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'validatePasswordReset'} = State) ->
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
    {Res, Req1, Context1} = Handler(account, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(account, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.
