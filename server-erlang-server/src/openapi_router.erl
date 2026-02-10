-module(openapi_router).

-export([get_paths/1]).

-type method() :: binary().
-type operations() :: #{method() => openapi_api:operation_id()}.
-type init_opts()  :: {operations(), module()}.

-export_type([init_opts/0]).

-spec get_paths(LogicHandler :: module()) -> cowboy_router:routes().
get_paths(LogicHandler) ->
    PreparedPaths = maps:fold(
                      fun(Path, #{operations := Operations, handler := Handler}, Acc) ->
                              [{Path, Handler, Operations} | Acc]
                      end, [], group_paths()
                     ),
    [{'_', [{P, H, {O, LogicHandler}} || {P, H, O} <- PreparedPaths]}].

group_paths() ->
    maps:fold(
      fun(OperationID, #{servers := Servers, base_path := BasePath, path := Path,
                         method := Method, handler := Handler}, Acc) ->
              FullPaths = build_full_paths(Servers, BasePath, Path),
              merge_paths(FullPaths, OperationID, Method, Handler, Acc)
      end, #{}, get_operations()).

build_full_paths([], BasePath, Path) ->
    [lists:append([BasePath, Path])];
build_full_paths(Servers, _BasePath, Path) ->
    [lists:append([Server, Path]) || Server <- Servers ].

merge_paths(FullPaths, OperationID, Method, Handler, Acc) ->
    lists:foldl(
      fun(Path, Acc0) ->
              case maps:find(Path, Acc0) of
                  {ok, PathInfo0 = #{operations := Operations0}} ->
                      Operations = Operations0#{Method => OperationID},
                      PathInfo = PathInfo0#{operations => Operations},
                      Acc0#{Path => PathInfo};
                  error ->
                      Operations = #{Method => OperationID},
                      PathInfo = #{handler => Handler, operations => Operations},
                      Acc0#{Path => PathInfo}
              end
      end, Acc, FullPaths).

get_operations() ->
    #{ 
       'consumerCreate' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/queue/consumer/create",
            method => <<"POST">>,
            handler => 'openapi_amqp_handler'
        },
       'consumerUpdate' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/queue/consumer/update",
            method => <<"POST">>,
            handler => 'openapi_amqp_handler'
        },
       'queueCreate' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/queue/create",
            method => <<"POST">>,
            handler => 'openapi_amqp_handler'
        },
       'queueDelete' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/queue/delete",
            method => <<"POST">>,
            handler => 'openapi_amqp_handler'
        },
       'queueGet' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/queue/get",
            method => <<"GET">>,
            handler => 'openapi_amqp_handler'
        },
       'queuePublish' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/queue/publish",
            method => <<"POST">>,
            handler => 'openapi_amqp_handler'
        },
       'queueSearch' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/queue/search",
            method => <<"GET">>,
            handler => 'openapi_amqp_handler'
        },
       'queueUpdate' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/queue/update",
            method => <<"POST">>,
            handler => 'openapi_amqp_handler'
        },
       'accountLocationSearch' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/search",
            method => <<"GET">>,
            handler => 'openapi_account_handler'
        },
       'blockAccount' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/block",
            method => <<"POST">>,
            handler => 'openapi_account_handler'
        },
       'createAccount' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/create",
            method => <<"POST">>,
            handler => 'openapi_account_handler'
        },
       'editAccount' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/profile/update",
            method => <<"POST">>,
            handler => 'openapi_account_handler'
        },
       'editUsername' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/username/update",
            method => <<"POST">>,
            handler => 'openapi_account_handler'
        },
       'getAccount' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/profile/get",
            method => <<"GET">>,
            handler => 'openapi_account_handler'
        },
       'getProfileAssets' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/profile/assets",
            method => <<"GET">>,
            handler => 'openapi_account_handler'
        },
       'getReferralList' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/referral/list",
            method => <<"GET">>,
            handler => 'openapi_account_handler'
        },
       'getSettings' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/settings/get",
            method => <<"GET">>,
            handler => 'openapi_account_handler'
        },
       'loginDelegate' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/login/delegate",
            method => <<"POST">>,
            handler => 'openapi_account_handler'
        },
       'loginGeneral' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/login",
            method => <<"POST">>,
            handler => 'openapi_account_handler'
        },
       'loginUsername' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/get",
            method => <<"POST">>,
            handler => 'openapi_account_handler'
        },
       'logout' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/logout",
            method => <<"POST">>,
            handler => 'openapi_account_handler'
        },
       'mergeAccount' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/merge",
            method => <<"POST">>,
            handler => 'openapi_account_handler'
        },
       'passwordChange' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/passwordchange",
            method => <<"POST">>,
            handler => 'openapi_account_handler'
        },
       'passwordReset' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/passwordreset",
            method => <<"POST">>,
            handler => 'openapi_account_handler'
        },
       'requestPasswordReset' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/requestpasswordreset",
            method => <<"POST">>,
            handler => 'openapi_account_handler'
        },
       'requestValidateAccount' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/requestValidateAccount",
            method => <<"POST">>,
            handler => 'openapi_account_handler'
        },
       'searchAccounts' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/profile/search",
            method => <<"GET">>,
            handler => 'openapi_account_handler'
        },
       'secureLogin' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/login/validate",
            method => <<"POST">>,
            handler => 'openapi_account_handler'
        },
       'secureSignup' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/create/validate",
            method => <<"POST">>,
            handler => 'openapi_account_handler'
        },
       'setMatchToken' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/profile/matchToken",
            method => <<"POST">>,
            handler => 'openapi_account_handler'
        },
       'updateActveStatus' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/active/update",
            method => <<"POST">>,
            handler => 'openapi_account_handler'
        },
       'updateLocation' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/location/update",
            method => <<"POST">>,
            handler => 'openapi_account_handler'
        },
       'updateSettings' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/settings/update",
            method => <<"POST">>,
            handler => 'openapi_account_handler'
        },
       'validateAccountSignup' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/validateAccountSignup",
            method => <<"POST">>,
            handler => 'openapi_account_handler'
        },
       'validatePasswordReset' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/validatepasswordreset",
            method => <<"POST">>,
            handler => 'openapi_account_handler'
        },
       '' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/achievement/tier/search",
            method => <<"POST">>,
            handler => 'openapi_achievement_handler'
        },
       'createAchievement' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/achievement/create",
            method => <<"POST">>,
            handler => 'openapi_achievement_handler'
        },
       'createAchievementTier' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/achievement/tier/create",
            method => <<"POST">>,
            handler => 'openapi_achievement_handler'
        },
       'deleteAchievement' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/achievement/delete",
            method => <<"POST">>,
            handler => 'openapi_achievement_handler'
        },
       'deleteAchievementTier' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/achievement/tier/delete",
            method => <<"POST">>,
            handler => 'openapi_achievement_handler'
        },
       'getAchievement' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/achievement/get",
            method => <<"GET">>,
            handler => 'openapi_achievement_handler'
        },
       'getAchievementTier' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/achievement/tier/get",
            method => <<"POST">>,
            handler => 'openapi_achievement_handler'
        },
       'getUserAchievements' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/achievement/progress/get",
            method => <<"GET">>,
            handler => 'openapi_achievement_handler'
        },
       'listAchievementTags' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/achievement/tag/list",
            method => <<"GET">>,
            handler => 'openapi_achievement_handler'
        },
       'listAchievements' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/achievement/list",
            method => <<"GET">>,
            handler => 'openapi_achievement_handler'
        },
       'searchAchievements' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/achievement/search",
            method => <<"GET">>,
            handler => 'openapi_achievement_handler'
        },
       'updateAchievement' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/achievement/update",
            method => <<"POST">>,
            handler => 'openapi_achievement_handler'
        },
       'updateAchievementTier' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/achievement/tier/update",
            method => <<"POST">>,
            handler => 'openapi_achievement_handler'
        },
       'updateUserAchievement' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/achievement/progress/update",
            method => <<"POST">>,
            handler => 'openapi_achievement_handler'
        },
       'createEntityReference' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/entity/reference",
            method => <<"POST">>,
            handler => 'openapi_activity_handler'
        },
       'addAlbumCollection' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/album/create",
            method => <<"POST">>,
            handler => 'openapi_album_handler'
        },
       'addAlbumUsers' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/album/user/add",
            method => <<"POST">>,
            handler => 'openapi_album_handler'
        },
       'approveAlbum' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/album/approve",
            method => <<"POST">>,
            handler => 'openapi_album_handler'
        },
       'getAlbumCollection' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/album/get",
            method => <<"GET">>,
            handler => 'openapi_album_handler'
        },
       'leaveAlbum' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/album/user/leave",
            method => <<"POST">>,
            handler => 'openapi_album_handler'
        },
       'removeAlbum' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/album/delete",
            method => <<"POST">>,
            handler => 'openapi_album_handler'
        },
       'removeAlbumUsers' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/album/user/delete",
            method => <<"POST">>,
            handler => 'openapi_album_handler'
        },
       'searchAlbums' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/album/search",
            method => <<"GET">>,
            handler => 'openapi_album_handler'
        },
       'updateAlbumCollection' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/album/update",
            method => <<"POST">>,
            handler => 'openapi_album_handler'
        },
       'activities' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/analytics/useractivity",
            method => <<"GET">>,
            handler => 'openapi_analytics_handler'
        },
       'aggregatedFilteredUsage' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/analytics/aggregatedFilteredUsage",
            method => <<"GET">>,
            handler => 'openapi_analytics_handler'
        },
       'filteredUsage' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/analytics/filteredUsage",
            method => <<"GET">>,
            handler => 'openapi_analytics_handler'
        },
       'usage' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/analytics/usage",
            method => <<"POST">>,
            handler => 'openapi_analytics_handler'
        },
       'usageBatch' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/analytics/usage/batch",
            method => <<"POST">>,
            handler => 'openapi_analytics_handler'
        },
       'getAppData' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/app/get",
            method => <<"GET">>,
            handler => 'openapi_app_data_handler'
        },
       'postAppData' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/app/post",
            method => <<"POST">>,
            handler => 'openapi_app_data_handler'
        },
       'regenAppData' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/app/regen",
            method => <<"POST">>,
            handler => 'openapi_app_data_handler'
        },
       'createApplication' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/application/create",
            method => <<"POST">>,
            handler => 'openapi_application_handler'
        },
       'createApplicationPlacement' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/application/placement/create",
            method => <<"POST">>,
            handler => 'openapi_application_handler'
        },
       'deleteApplication' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/application/delete",
            method => <<"POST">>,
            handler => 'openapi_application_handler'
        },
       'deleteApplicationPlacement' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/application/placement/delete",
            method => <<"POST">>,
            handler => 'openapi_application_handler'
        },
       'getApplication' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/application/get",
            method => <<"GET">>,
            handler => 'openapi_application_handler'
        },
       'getApplicationPlacement' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/application/placement/get",
            method => <<"GET">>,
            handler => 'openapi_application_handler'
        },
       'getApplicationVersions' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/application/versions",
            method => <<"GET">>,
            handler => 'openapi_application_handler'
        },
       'getUniqueUsersByApp' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/application/users",
            method => <<"GET">>,
            handler => 'openapi_application_handler'
        },
       'listApplications' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/application/list",
            method => <<"GET">>,
            handler => 'openapi_application_handler'
        },
       'searchApplicationPlacement' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/application/placement/search",
            method => <<"GET">>,
            handler => 'openapi_application_handler'
        },
       'searchApplicationSettings' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/application/settings/search",
            method => <<"GET">>,
            handler => 'openapi_application_handler'
        },
       'searchApplications' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/application/search",
            method => <<"GET">>,
            handler => 'openapi_application_handler'
        },
       'updateApplication' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/application/update",
            method => <<"POST">>,
            handler => 'openapi_application_handler'
        },
       'updateApplicationActive' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/application/active",
            method => <<"POST">>,
            handler => 'openapi_application_handler'
        },
       'updateApplicationPlacement' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/application/placement/update",
            method => <<"POST">>,
            handler => 'openapi_application_handler'
        },
       'uploadApplicationCertificate' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/application/certificate/create",
            method => <<"POST">>,
            handler => 'openapi_application_handler'
        },
       'createApplicationConfig' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/appconfig/create",
            method => <<"POST">>,
            handler => 'openapi_application_config_handler'
        },
       'deleteApplicationConfig' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/appconfig/delete",
            method => <<"POST">>,
            handler => 'openapi_application_config_handler'
        },
       'getApplicationConfig' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/appconfig/get",
            method => <<"GET">>,
            handler => 'openapi_application_config_handler'
        },
       'getApplicationConfigByConfigVersion' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/appconfig/getbyversion",
            method => <<"GET">>,
            handler => 'openapi_application_config_handler'
        },
       'searchApplicationConfig' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/appconfig/search",
            method => <<"GET">>,
            handler => 'openapi_application_config_handler'
        },
       'updateApplicationConfig' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/appconfig/update",
            method => <<"POST">>,
            handler => 'openapi_application_config_handler'
        },
       'assetDownload' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/asset/download/:filename",
            method => <<"GET">>,
            handler => 'openapi_asset_handler'
        },
       'assetMorph' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/asset/morph",
            method => <<"POST">>,
            handler => 'openapi_asset_handler'
        },
       'createAsset' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/asset/create",
            method => <<"POST">>,
            handler => 'openapi_asset_handler'
        },
       'deleteAsset' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/asset/delete",
            method => <<"POST">>,
            handler => 'openapi_asset_handler'
        },
       'getAsset' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/asset/get",
            method => <<"GET">>,
            handler => 'openapi_asset_handler'
        },
       'removeAsset' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/asset/remove",
            method => <<"POST">>,
            handler => 'openapi_asset_handler'
        },
       'searchAssets' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/asset/search",
            method => <<"GET">>,
            handler => 'openapi_asset_handler'
        },
       'updateAsset' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/asset/update",
            method => <<"POST">>,
            handler => 'openapi_asset_handler'
        },
       'assigmentAssigneeAccountSearch' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/assignment/assignee/search",
            method => <<"GET">>,
            handler => 'openapi_assignment_handler'
        },
       'assignmentCreate' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/assignment/create",
            method => <<"POST">>,
            handler => 'openapi_assignment_handler'
        },
       'assignmentDelete' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/assignment/delete",
            method => <<"POST">>,
            handler => 'openapi_assignment_handler'
        },
       'assignmentGet' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/assignment/get",
            method => <<"GET">>,
            handler => 'openapi_assignment_handler'
        },
       'assignmentSearch' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/assignment/search",
            method => <<"GET">>,
            handler => 'openapi_assignment_handler'
        },
       'assignmentStatusCreate' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/assignment/status/create",
            method => <<"POST">>,
            handler => 'openapi_assignment_handler'
        },
       'assignmentStatusDelete' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/assignment/status/delete",
            method => <<"POST">>,
            handler => 'openapi_assignment_handler'
        },
       'assignmentStatusGet' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/assignment/status/get",
            method => <<"GET">>,
            handler => 'openapi_assignment_handler'
        },
       'assignmentStatusSearch' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/assignment/status/search",
            method => <<"GET">>,
            handler => 'openapi_assignment_handler'
        },
       'assignmentStatusUpdate' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/assignment/status/update",
            method => <<"POST">>,
            handler => 'openapi_assignment_handler'
        },
       'assignmentUpdate' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/assignment/update",
            method => <<"POST">>,
            handler => 'openapi_assignment_handler'
        },
       'createAudience' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/audience/create",
            method => <<"POST">>,
            handler => 'openapi_audience_handler'
        },
       'deleteAudience' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/audience/delete",
            method => <<"POST">>,
            handler => 'openapi_audience_handler'
        },
       'getAgeGroups' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/audience/ageGroups",
            method => <<"GET">>,
            handler => 'openapi_audience_handler'
        },
       'getAudience' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/audience/get",
            method => <<"GET">>,
            handler => 'openapi_audience_handler'
        },
       'getAudienceList' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/audience/search",
            method => <<"GET">>,
            handler => 'openapi_audience_handler'
        },
       'getDevices' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/audience/devices",
            method => <<"GET">>,
            handler => 'openapi_audience_handler'
        },
       'getExperiences' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/audience/experiences",
            method => <<"GET">>,
            handler => 'openapi_audience_handler'
        },
       'getGroupedAudiences' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/audience/grouped/get",
            method => <<"GET">>,
            handler => 'openapi_audience_handler'
        },
       'listByAccount' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/audience/suggestion/list",
            method => <<"POST">>,
            handler => 'openapi_audience_handler'
        },
       'listByAudience' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/audience/suggestion/offersByAudience",
            method => <<"GET">>,
            handler => 'openapi_audience_handler'
        },
       'listLastestByAccount' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/audience/suggestion/latest",
            method => <<"GET">>,
            handler => 'openapi_audience_handler'
        },
       'sendByAccount' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/audience/suggestion/send",
            method => <<"POST">>,
            handler => 'openapi_audience_handler'
        },
       'updateAudience' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/audience/update",
            method => <<"POST">>,
            handler => 'openapi_audience_handler'
        },
       'createBid' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/bid/create",
            method => <<"POST">>,
            handler => 'openapi_bid_handler'
        },
       'deleteBid' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/bid/delete",
            method => <<"POST">>,
            handler => 'openapi_bid_handler'
        },
       'getBid' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/bid/get",
            method => <<"GET">>,
            handler => 'openapi_bid_handler'
        },
       'updateBid' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/bid/update",
            method => <<"POST">>,
            handler => 'openapi_bid_handler'
        },
       'createBillableEntity' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/billable/create",
            method => <<"POST">>,
            handler => 'openapi_billable_entity_handler'
        },
       'deleteBillableEntity' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/billable/delete",
            method => <<"POST">>,
            handler => 'openapi_billable_entity_handler'
        },
       'getBillableEntity' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/billable/get",
            method => <<"GET">>,
            handler => 'openapi_billable_entity_handler'
        },
       'updateBillableEntity' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/billable/update",
            method => <<"POST">>,
            handler => 'openapi_billable_entity_handler'
        },
       'addPaymentMethod' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/billing/update",
            method => <<"POST">>,
            handler => 'openapi_billing_info_handler'
        },
       'createPaymentMethod' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/billing/create",
            method => <<"POST">>,
            handler => 'openapi_billing_info_handler'
        },
       'createSmartContract' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/billing/crypto/transfer",
            method => <<"POST">>,
            handler => 'openapi_billing_info_handler'
        },
       'getCryptoBalance' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/billing/crypto/get",
            method => <<"GET">>,
            handler => 'openapi_billing_info_handler'
        },
       'getPaymentMethod' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/billing/get",
            method => <<"GET">>,
            handler => 'openapi_billing_info_handler'
        },
       'searchPaymentMethod' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/billing/search",
            method => <<"GET">>,
            handler => 'openapi_billing_info_handler'
        },
       'getStatusCSV' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/csvimport/batch/status/details",
            method => <<"GET">>,
            handler => 'openapi_csv_import_handler'
        },
       'listStatusCSV' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/csvimport/batch/list",
            method => <<"GET">>,
            handler => 'openapi_csv_import_handler'
        },
       'statusCSV' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/csvimport/batch/status",
            method => <<"GET">>,
            handler => 'openapi_csv_import_handler'
        },
       'uploadCSV' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/csvimport/upload",
            method => <<"POST">>,
            handler => 'openapi_csv_import_handler'
        },
       'createCargoType' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/cargo/type",
            method => <<"POST">>,
            handler => 'openapi_cargo_type_handler'
        },
       'deleteCargoType' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/cargo/type/:cargoTypeId",
            method => <<"DELETE">>,
            handler => 'openapi_cargo_type_handler'
        },
       'getCargoType' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/cargo/type/:cargoTypeId",
            method => <<"GET">>,
            handler => 'openapi_cargo_type_handler'
        },
       'searchCargoTypes' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/cargo/type",
            method => <<"GET">>,
            handler => 'openapi_cargo_type_handler'
        },
       'updateCargoType' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/cargo/type/:cargoTypeId",
            method => <<"PUT">>,
            handler => 'openapi_cargo_type_handler'
        },
       'searchCarriers' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/carrier/search",
            method => <<"GET">>,
            handler => 'openapi_carrier_handler'
        },
       'categoryDistanceSearch' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/category/distancesearch",
            method => <<"GET">>,
            handler => 'openapi_category_handler'
        },
       'createCategory' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/category/create",
            method => <<"POST">>,
            handler => 'openapi_category_handler'
        },
       'deleteCategory' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/category/delete",
            method => <<"POST">>,
            handler => 'openapi_category_handler'
        },
       'duplicateCategory' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/category/duplicate",
            method => <<"POST">>,
            handler => 'openapi_category_handler'
        },
       'getCategory' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/category/get",
            method => <<"GET">>,
            handler => 'openapi_category_handler'
        },
       'searchCategories' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/category/search",
            method => <<"GET">>,
            handler => 'openapi_category_handler'
        },
       'updateCategory' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/category/update",
            method => <<"POST">>,
            handler => 'openapi_category_handler'
        },
       'addConnectionToGroup' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/connection/group/addConnection",
            method => <<"POST">>,
            handler => 'openapi_connection_handler'
        },
       'addConnectionsToGroup' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/connection/group/addConnections",
            method => <<"POST">>,
            handler => 'openapi_connection_handler'
        },
       'addSubGroups' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/connection/group/addSubGroup",
            method => <<"POST">>,
            handler => 'openapi_connection_handler'
        },
       'createOrUpdateConnection' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/connection/add",
            method => <<"POST">>,
            handler => 'openapi_connection_handler'
        },
       'createOrUpdateGroup' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/connection/group",
            method => <<"POST">>,
            handler => 'openapi_connection_handler'
        },
       'followAccept' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/follow/accept",
            method => <<"POST">>,
            handler => 'openapi_connection_handler'
        },
       'followReject' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/follow/reject",
            method => <<"POST">>,
            handler => 'openapi_connection_handler'
        },
       'followRemove' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/follow/remove",
            method => <<"POST">>,
            handler => 'openapi_connection_handler'
        },
       'followRequest' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/follow/request",
            method => <<"POST">>,
            handler => 'openapi_connection_handler'
        },
       'friendAccept' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/friend/accept",
            method => <<"POST">>,
            handler => 'openapi_connection_handler'
        },
       'friendReject' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/friend/reject",
            method => <<"POST">>,
            handler => 'openapi_connection_handler'
        },
       'friendRemove' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/friend/remove",
            method => <<"POST">>,
            handler => 'openapi_connection_handler'
        },
       'friendRequest' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/friend/request",
            method => <<"POST">>,
            handler => 'openapi_connection_handler'
        },
       'getConnectionSentFriendRequests' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/connection/getRequested",
            method => <<"GET">>,
            handler => 'openapi_connection_handler'
        },
       'getConnections' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/connection/get",
            method => <<"GET">>,
            handler => 'openapi_connection_handler'
        },
       'getGroupDetails' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/connection/group/details/get",
            method => <<"GET">>,
            handler => 'openapi_connection_handler'
        },
       'groupSearch' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/connection/group/search",
            method => <<"GET">>,
            handler => 'openapi_connection_handler'
        },
       'removeConnectionFromGroup' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/connection/group/removeConnection",
            method => <<"POST">>,
            handler => 'openapi_connection_handler'
        },
       'removeConnectionsFromGroup' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/connection/group/removeConnections",
            method => <<"POST">>,
            handler => 'openapi_connection_handler'
        },
       'removeGroup' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/connection/group/remove",
            method => <<"POST">>,
            handler => 'openapi_connection_handler'
        },
       'removeSubGroups' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/connection/group/removeSubGroup",
            method => <<"POST">>,
            handler => 'openapi_connection_handler'
        },
       'searchConnections' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/connection/search",
            method => <<"GET">>,
            handler => 'openapi_connection_handler'
        },
       'addOrUpdateAlbumContest' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/album/contest",
            method => <<"POST">>,
            handler => 'openapi_contest_handler'
        },
       'approveAlbumContest' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/album/contest/approve",
            method => <<"POST">>,
            handler => 'openapi_contest_handler'
        },
       'deleteContest' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/album/contest/remove",
            method => <<"POST">>,
            handler => 'openapi_contest_handler'
        },
       'getAlbumContest' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/album/contest/get",
            method => <<"GET">>,
            handler => 'openapi_contest_handler'
        },
       'getAlbumContests' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/album/contest/search",
            method => <<"GET">>,
            handler => 'openapi_contest_handler'
        },
       'voteOnAlbumContest' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/album/contest/vote",
            method => <<"POST">>,
            handler => 'openapi_contest_handler'
        },
       'addPreview' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/creative/addpreview",
            method => <<"POST">>,
            handler => 'openapi_creative_handler'
        },
       'adsFind' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/ads/find",
            method => <<"GET">>,
            handler => 'openapi_creative_handler'
        },
       'createCreative' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/creative/create",
            method => <<"POST">>,
            handler => 'openapi_creative_handler'
        },
       'deleteCreative' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/creative/delete",
            method => <<"POST">>,
            handler => 'openapi_creative_handler'
        },
       'getCreative' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/creative/get",
            method => <<"GET">>,
            handler => 'openapi_creative_handler'
        },
       'getCreativesByApplication' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/creative/search",
            method => <<"GET">>,
            handler => 'openapi_creative_handler'
        },
       'removePreview' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/creative/removepreview",
            method => <<"POST">>,
            handler => 'openapi_creative_handler'
        },
       'updateCreative' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/creative/update",
            method => <<"POST">>,
            handler => 'openapi_creative_handler'
        },
       'create' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/cargo/dependent/:accountId",
            method => <<"PUT">>,
            handler => 'openapi_dependent_handler'
        },
       'getDependents' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/cargo/dependent/:accountId",
            method => <<"GET">>,
            handler => 'openapi_dependent_handler'
        },
       'removeDependent' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/cargo/dependent/:accountId",
            method => <<"DELETE">>,
            handler => 'openapi_dependent_handler'
        },
       'checkDisbursements' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/disbursement/check",
            method => <<"GET">>,
            handler => 'openapi_disbursement_handler'
        },
       'createDisbursement' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/disbursement/create",
            method => <<"POST">>,
            handler => 'openapi_disbursement_handler'
        },
       'getDisbursement' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/disbursement/get",
            method => <<"GET">>,
            handler => 'openapi_disbursement_handler'
        },
       'searchDisbursements' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/disbursement/search",
            method => <<"GET">>,
            handler => 'openapi_disbursement_handler'
        },
       'updateDisbursement' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/disbursement/update",
            method => <<"POST">>,
            handler => 'openapi_disbursement_handler'
        },
       'assignEmployee' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/employee/assign",
            method => <<"POST">>,
            handler => 'openapi_employee_handler'
        },
       'assignToLocationEmployee' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/employee/assignToLocation",
            method => <<"POST">>,
            handler => 'openapi_employee_handler'
        },
       'createEmployee' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/employee/create",
            method => <<"POST">>,
            handler => 'openapi_employee_handler'
        },
       'deleteEmployee' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/employee/delete",
            method => <<"POST">>,
            handler => 'openapi_employee_handler'
        },
       'getEmployee' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/employee/get",
            method => <<"POST">>,
            handler => 'openapi_employee_handler'
        },
       'searchEmployees' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/employee/search",
            method => <<"POST">>,
            handler => 'openapi_employee_handler'
        },
       'unassignEmployee' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/employee/unassign",
            method => <<"POST">>,
            handler => 'openapi_employee_handler'
        },
       'updateEmployee' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/employee/update",
            method => <<"POST">>,
            handler => 'openapi_employee_handler'
        },
       'attendEvent' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/event/attend",
            method => <<"POST">>,
            handler => 'openapi_event_handler'
        },
       'createEvent' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/event/create",
            method => <<"POST">>,
            handler => 'openapi_event_handler'
        },
       'deleteEvent' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/event/delete",
            method => <<"POST">>,
            handler => 'openapi_event_handler'
        },
       'getEvent' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/event/get",
            method => <<"GET">>,
            handler => 'openapi_event_handler'
        },
       'searchEventTransactions' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/event/attendance/search",
            method => <<"GET">>,
            handler => 'openapi_event_handler'
        },
       'searchEvents' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/event/search",
            method => <<"GET">>,
            handler => 'openapi_event_handler'
        },
       'updateEvent' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/event/update",
            method => <<"POST">>,
            handler => 'openapi_event_handler'
        },
       'getToken' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/facebook/getfbtoken",
            method => <<"GET">>,
            handler => 'openapi_facebook_handler'
        },
       'graphInterface' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/facebook/graph",
            method => <<"POST">>,
            handler => 'openapi_facebook_handler'
        },
       'addFavorite' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/favorite/create",
            method => <<"POST">>,
            handler => 'openapi_favorite_handler'
        },
       'deleteFavorite' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/favorite/delete",
            method => <<"POST">>,
            handler => 'openapi_favorite_handler'
        },
       'getFavorite' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/favorite/get",
            method => <<"GET">>,
            handler => 'openapi_favorite_handler'
        },
       'searchFavorites' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/favorite/search",
            method => <<"GET">>,
            handler => 'openapi_favorite_handler'
        },
       'whoHasFavorited' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/favorite/whois",
            method => <<"GET">>,
            handler => 'openapi_favorite_handler'
        },
       'createFilter' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/filter/create",
            method => <<"POST">>,
            handler => 'openapi_filter_handler'
        },
       'deleteFilter' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/filter/delete",
            method => <<"POST">>,
            handler => 'openapi_filter_handler'
        },
       'getFilter' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/filter/get",
            method => <<"GET">>,
            handler => 'openapi_filter_handler'
        },
       'searchFilters' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/filter/search",
            method => <<"GET">>,
            handler => 'openapi_filter_handler'
        },
       'updateFilter' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/filter/update",
            method => <<"POST">>,
            handler => 'openapi_filter_handler'
        },
       'createFlag' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/flag/create",
            method => <<"POST">>,
            handler => 'openapi_flag_handler'
        },
       'deleteFlag' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/flag/delete",
            method => <<"POST">>,
            handler => 'openapi_flag_handler'
        },
       'getFlag' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/flag/get",
            method => <<"GET">>,
            handler => 'openapi_flag_handler'
        },
       'getFlagThreshold' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/flag/threshold/get",
            method => <<"GET">>,
            handler => 'openapi_flag_handler'
        },
       'updateFlagThreshold' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/flag/threshold/update",
            method => <<"POST">>,
            handler => 'openapi_flag_handler'
        },
       'createGame' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/game/create",
            method => <<"POST">>,
            handler => 'openapi_game_handler'
        },
       'deleteGame' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/game/delete",
            method => <<"POST">>,
            handler => 'openapi_game_handler'
        },
       'getGame' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/game/get",
            method => <<"GET">>,
            handler => 'openapi_game_handler'
        },
       'searchGames' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/game/search",
            method => <<"GET">>,
            handler => 'openapi_game_handler'
        },
       'updateGame' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/game/update",
            method => <<"POST">>,
            handler => 'openapi_game_handler'
        },
       'createGameLevel' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/level/create",
            method => <<"POST">>,
            handler => 'openapi_game_level_handler'
        },
       'deleteGameLevel' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/level/delete",
            method => <<"POST">>,
            handler => 'openapi_game_level_handler'
        },
       'getGameLevel' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/level/get",
            method => <<"GET">>,
            handler => 'openapi_game_level_handler'
        },
       'getGameLevelsByApplication' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/level/search",
            method => <<"GET">>,
            handler => 'openapi_game_level_handler'
        },
       'getGameLevelsByBillableEntity' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/level/searchByBillableEntity",
            method => <<"GET">>,
            handler => 'openapi_game_level_handler'
        },
       'getQuestionsInLevel' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/level/questions/get",
            method => <<"GET">>,
            handler => 'openapi_game_level_handler'
        },
       'getWordsInLevel' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/level/words/get",
            method => <<"GET">>,
            handler => 'openapi_game_level_handler'
        },
       'updateGameLevel' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/level/update",
            method => <<"POST">>,
            handler => 'openapi_game_level_handler'
        },
       'updateQuestionsInLevel' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/level/questions/update",
            method => <<"POST">>,
            handler => 'openapi_game_level_handler'
        },
       'updateWordsInLevel' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/level/words/update",
            method => <<"POST">>,
            handler => 'openapi_game_level_handler'
        },
       'acceptInvite' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/invite/accept",
            method => <<"POST">>,
            handler => 'openapi_invite_handler'
        },
       'albumContestInvite' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/invite/albumContest",
            method => <<"POST">>,
            handler => 'openapi_invite_handler'
        },
       'albumInvite' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/invite/album",
            method => <<"POST">>,
            handler => 'openapi_invite_handler'
        },
       'eventInvite' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/invite/event",
            method => <<"POST">>,
            handler => 'openapi_invite_handler'
        },
       'gameInvite' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/invite/gameLevel",
            method => <<"POST">>,
            handler => 'openapi_invite_handler'
        },
       'getInvite' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/invite/get",
            method => <<"GET">>,
            handler => 'openapi_invite_handler'
        },
       'missionInvite' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/invite/mission",
            method => <<"POST">>,
            handler => 'openapi_invite_handler'
        },
       'offerInvite' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/invite/offer",
            method => <<"POST">>,
            handler => 'openapi_invite_handler'
        },
       'offerLocationInvite' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/invite/offerLocation",
            method => <<"POST">>,
            handler => 'openapi_invite_handler'
        },
       'retailerLocationInvite' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/invite/retailerLocation",
            method => <<"POST">>,
            handler => 'openapi_invite_handler'
        },
       'createLeaderboard' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/leaderboard/create",
            method => <<"POST">>,
            handler => 'openapi_leaderboard_handler'
        },
       'deleteLeaderboard' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/leaderboard/delete",
            method => <<"POST">>,
            handler => 'openapi_leaderboard_handler'
        },
       'getLeaderboard' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/leaderboard/get",
            method => <<"GET">>,
            handler => 'openapi_leaderboard_handler'
        },
       'searchLeaderboards' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/leaderboard/search",
            method => <<"GET">>,
            handler => 'openapi_leaderboard_handler'
        },
       'updateLeaderboard' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/leaderboard/update",
            method => <<"POST">>,
            handler => 'openapi_leaderboard_handler'
        },
       'registerLike' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/like",
            method => <<"POST">>,
            handler => 'openapi_like_handler'
        },
       'removeLike' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/like/delete",
            method => <<"POST">>,
            handler => 'openapi_like_handler'
        },
       'searchLikes' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/like/search",
            method => <<"GET">>,
            handler => 'openapi_like_handler'
        },
       'createListing' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/listing/create",
            method => <<"POST">>,
            handler => 'openapi_listing_handler'
        },
       'deleteListing' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/listing/delete",
            method => <<"POST">>,
            handler => 'openapi_listing_handler'
        },
       'getListing' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/listing/get",
            method => <<"GET">>,
            handler => 'openapi_listing_handler'
        },
       'searchListing' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/listing/search",
            method => <<"GET">>,
            handler => 'openapi_listing_handler'
        },
       'summaryListing' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/listing/summary",
            method => <<"GET">>,
            handler => 'openapi_listing_handler'
        },
       'updateListing' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/listing/update",
            method => <<"POST">>,
            handler => 'openapi_listing_handler'
        },
       'cacheTrilaterationData' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/location/trilaterate/cache",
            method => <<"POST">>,
            handler => 'openapi_location_handler'
        },
       'cacheTrilaterationDataGzip' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/location/trilaterate/cache/submit",
            method => <<"POST">>,
            handler => 'openapi_location_handler'
        },
       'getLocationByIp' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/location/ip",
            method => <<"GET">>,
            handler => 'openapi_location_handler'
        },
       'getLocationByTrilateration' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/account/location/trilaterate",
            method => <<"GET">>,
            handler => 'openapi_location_handler'
        },
       'getLocations' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/location/search",
            method => <<"GET">>,
            handler => 'openapi_location_handler'
        },
       'createLocationV2' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/location",
            method => <<"POST">>,
            handler => 'openapi_location_api_v2_handler'
        },
       'updateLocationV2' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/location/:id",
            method => <<"POST">>,
            handler => 'openapi_location_api_v2_handler'
        },
       'createMedia' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/media/create",
            method => <<"POST">>,
            handler => 'openapi_media_handler'
        },
       'deleteMedia' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/media/delete",
            method => <<"POST">>,
            handler => 'openapi_media_handler'
        },
       'getMedia' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/media/get",
            method => <<"GET">>,
            handler => 'openapi_media_handler'
        },
       'searchMedia' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/media/search",
            method => <<"GET">>,
            handler => 'openapi_media_handler'
        },
       'updateMedia' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/media/update",
            method => <<"POST">>,
            handler => 'openapi_media_handler'
        },
       'createMission' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/mission/create",
            method => <<"POST">>,
            handler => 'openapi_mission_handler'
        },
       'deleteMission' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/mission/delete",
            method => <<"POST">>,
            handler => 'openapi_mission_handler'
        },
       'findMissions' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/mission/find",
            method => <<"GET">>,
            handler => 'openapi_mission_handler'
        },
       'getMission' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/mission/get",
            method => <<"GET">>,
            handler => 'openapi_mission_handler'
        },
       'importMission' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/mission/import",
            method => <<"POST">>,
            handler => 'openapi_mission_handler'
        },
       'searchMissionFormats' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/mission/format/search",
            method => <<"GET">>,
            handler => 'openapi_mission_handler'
        },
       'searchMissions' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/mission/search",
            method => <<"GET">>,
            handler => 'openapi_mission_handler'
        },
       'searchMissionsByBillableEntity' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/mission/searchByBillableEntity",
            method => <<"GET">>,
            handler => 'openapi_mission_handler'
        },
       'updateMission' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/mission/update",
            method => <<"POST">>,
            handler => 'openapi_mission_handler'
        },
       'createMissionInvite' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/mission/invite/create",
            method => <<"POST">>,
            handler => 'openapi_mission_invite_handler'
        },
       'deleteMissionInvite' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/mission/invite/delete",
            method => <<"POST">>,
            handler => 'openapi_mission_invite_handler'
        },
       'getMissionInvite' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/mission/invite/get",
            method => <<"GET">>,
            handler => 'openapi_mission_invite_handler'
        },
       'searchMissionInvites' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/mission/invite/search",
            method => <<"GET">>,
            handler => 'openapi_mission_invite_handler'
        },
       'updateMissionInvite' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/mission/invite/update",
            method => <<"POST">>,
            handler => 'openapi_mission_invite_handler'
        },
       'batchOperation' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/note/batch",
            method => <<"POST">>,
            handler => 'openapi_note_handler'
        },
       'createNote' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/note/create",
            method => <<"POST">>,
            handler => 'openapi_note_handler'
        },
       'deleteNote' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/note/delete",
            method => <<"POST">>,
            handler => 'openapi_note_handler'
        },
       'getNote' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/note/get",
            method => <<"POST">>,
            handler => 'openapi_note_handler'
        },
       'searchNotes' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/note/search",
            method => <<"POST">>,
            handler => 'openapi_note_handler'
        },
       'updateNote' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/note/update",
            method => <<"POST">>,
            handler => 'openapi_note_handler'
        },
       'createNotificationTemplate' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/notification/template/create",
            method => <<"POST">>,
            handler => 'openapi_notification_handler'
        },
       'createOrUpdateBlockedNotifications' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/notification/blocked/batch",
            method => <<"POST">>,
            handler => 'openapi_notification_handler'
        },
       'deleteNotificationTemplate' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/notification/template/delete",
            method => <<"POST">>,
            handler => 'openapi_notification_handler'
        },
       'getNotificationTemplate' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/notification/template/get",
            method => <<"GET">>,
            handler => 'openapi_notification_handler'
        },
       'getNotifications' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/notification/search",
            method => <<"GET">>,
            handler => 'openapi_notification_handler'
        },
       'registerNotificationToken' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/notification/token",
            method => <<"POST">>,
            handler => 'openapi_notification_handler'
        },
       'searchBlockedNotifications' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/notification/blocked/search",
            method => <<"GET">>,
            handler => 'openapi_notification_handler'
        },
       'searchNotificationTemplate' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/notification/template/search",
            method => <<"GET">>,
            handler => 'openapi_notification_handler'
        },
       'searchRecipients' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/notification/recipient/search",
            method => <<"GET">>,
            handler => 'openapi_notification_handler'
        },
       'searchRecipientsCount' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/notification/recipient/search/count",
            method => <<"GET">>,
            handler => 'openapi_notification_handler'
        },
       'sendBatchNotifications' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/notification/batch",
            method => <<"POST">>,
            handler => 'openapi_notification_handler'
        },
       'sendCustomNotifications' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/notification/custom",
            method => <<"POST">>,
            handler => 'openapi_notification_handler'
        },
       'updateNotificationTemplate' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/notification/template/update",
            method => <<"POST">>,
            handler => 'openapi_notification_handler'
        },
       'addField' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/object/field/add",
            method => <<"POST">>,
            handler => 'openapi_object_store_handler'
        },
       'createData' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/object/data/:objectName",
            method => <<"POST">>,
            handler => 'openapi_object_store_handler'
        },
       'createObject' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/object/create",
            method => <<"POST">>,
            handler => 'openapi_object_store_handler'
        },
       'deleteData' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/object/data/:objectName/:objectId",
            method => <<"DELETE">>,
            handler => 'openapi_object_store_handler'
        },
       'deleteField' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/object/field/delete",
            method => <<"POST">>,
            handler => 'openapi_object_store_handler'
        },
       'deleteObject' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/object/delete",
            method => <<"POST">>,
            handler => 'openapi_object_store_handler'
        },
       'getData' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/object/data/:objectName/:objectId",
            method => <<"GET">>,
            handler => 'openapi_object_store_handler'
        },
       'getObject' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/object/get",
            method => <<"GET">>,
            handler => 'openapi_object_store_handler'
        },
       'searchData' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/object/data/:objectName",
            method => <<"GET">>,
            handler => 'openapi_object_store_handler'
        },
       'searchObject' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/object/search",
            method => <<"GET">>,
            handler => 'openapi_object_store_handler'
        },
       'updateData' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/object/data/:objectName/:objectId",
            method => <<"PUT">>,
            handler => 'openapi_object_store_handler'
        },
       'batchUpdateOfferLocations' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/retailer/offer/location/batchUpdate",
            method => <<"POST">>,
            handler => 'openapi_offer_handler'
        },
       'createOffer' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/retailer/offer/create",
            method => <<"POST">>,
            handler => 'openapi_offer_handler'
        },
       'deleteOffer' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/retailer/offer/delete",
            method => <<"POST">>,
            handler => 'openapi_offer_handler'
        },
       'deleteOfferLocation' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/retailer/offer/location/delete",
            method => <<"POST">>,
            handler => 'openapi_offer_handler'
        },
       'getOffer' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/retailer/offer/get",
            method => <<"GET">>,
            handler => 'openapi_offer_handler'
        },
       'getOfferDetails' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/offer/get",
            method => <<"GET">>,
            handler => 'openapi_offer_handler'
        },
       'getOfferListCounts' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/offer/lists/count",
            method => <<"GET">>,
            handler => 'openapi_offer_handler'
        },
       'getOfferLocation' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/offer/location/get",
            method => <<"GET">>,
            handler => 'openapi_offer_handler'
        },
       'getOfferLocationsForRetailers' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/retailer/offer/location/search",
            method => <<"GET">>,
            handler => 'openapi_offer_handler'
        },
       'getOffersForRetailers' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/retailer/offer/search",
            method => <<"GET">>,
            handler => 'openapi_offer_handler'
        },
       'redeemOfferTransaction' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/retailer/offer/transaction/update",
            method => <<"POST">>,
            handler => 'openapi_offer_handler'
        },
       'searchOfferTransactionsForRetailers' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/retailer/offer/transaction/search",
            method => <<"GET">>,
            handler => 'openapi_offer_handler'
        },
       'searchOffersForConsumer' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/offer/lists",
            method => <<"GET">>,
            handler => 'openapi_offer_handler'
        },
       'topOfferTransactions' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/offer/top",
            method => <<"GET">>,
            handler => 'openapi_offer_handler'
        },
       'updateOffer' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/retailer/offer/update",
            method => <<"POST">>,
            handler => 'openapi_offer_handler'
        },
       'updateOfferStatus' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/retailer/offer/status",
            method => <<"POST">>,
            handler => 'openapi_offer_handler'
        },
       'createOfferTransactionStatus' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/offer/status/create",
            method => <<"POST">>,
            handler => 'openapi_offer_status_handler'
        },
       'deleteOfferTransactionStatus' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/offer/status/delete",
            method => <<"POST">>,
            handler => 'openapi_offer_status_handler'
        },
       'getOfferTransactionStatus' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/offer/status/get",
            method => <<"GET">>,
            handler => 'openapi_offer_status_handler'
        },
       'searchOfferTransactionStatuses' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/offer/status/search",
            method => <<"GET">>,
            handler => 'openapi_offer_status_handler'
        },
       'updateOfferTransactionStatus' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/offer/status/update",
            method => <<"POST">>,
            handler => 'openapi_offer_status_handler'
        },
       'imageGeneration' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/openai/v1/images/generations",
            method => <<"POST">>,
            handler => 'openapi_open_ai_handler'
        },
       'getOptimizationResult' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/optimize/result/:batchID",
            method => <<"GET">>,
            handler => 'openapi_optimize_handler'
        },
       'requestOptimization' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/optimize/request",
            method => <<"POST">>,
            handler => 'openapi_optimize_handler'
        },
       'addMovie' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/orson/ai/addMovie",
            method => <<"POST">>,
            handler => 'openapi_orson_handler'
        },
       'aiDocs' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/orson/ai/docs",
            method => <<"GET">>,
            handler => 'openapi_orson_handler'
        },
       'aiFindImages' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/orson/ai/img",
            method => <<"GET">>,
            handler => 'openapi_orson_handler'
        },
       'aiTags' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/orson/ai/tags",
            method => <<"GET">>,
            handler => 'openapi_orson_handler'
        },
       'aiText' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/orson/ai/text",
            method => <<"GET">>,
            handler => 'openapi_orson_handler'
        },
       'batch' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/orson/ai/batch",
            method => <<"POST">>,
            handler => 'openapi_orson_handler'
        },
       'createInstantEpisode' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/orson/stories/episodes/instant",
            method => <<"POST">>,
            handler => 'openapi_orson_handler'
        },
       'createVoiceCanvas' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/orson/ai/voiceCanvas",
            method => <<"POST">>,
            handler => 'openapi_orson_handler'
        },
       'emotion' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/orson/ai/emotion",
            method => <<"POST">>,
            handler => 'openapi_orson_handler'
        },
       'getAddMovieResult' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/orson/ai/addMovie/:requestId",
            method => <<"GET">>,
            handler => 'openapi_orson_handler'
        },
       'getBatch' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/orson/ai/batch/:requestId",
            method => <<"GET">>,
            handler => 'openapi_orson_handler'
        },
       'getEmotion' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/orson/ai/emotion/:requestId",
            method => <<"GET">>,
            handler => 'openapi_orson_handler'
        },
       'getEpisodeStatus' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/orson/stories/episodes/:episodeId/status",
            method => <<"GET">>,
            handler => 'openapi_orson_handler'
        },
       'getRenderStatus' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/orson/stories/renders/:renderId/status",
            method => <<"GET">>,
            handler => 'openapi_orson_handler'
        },
       'getSTT' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/orson/ai/stt/:requestId",
            method => <<"GET">>,
            handler => 'openapi_orson_handler'
        },
       'getTTS' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/orson/ai/tts/:requestId",
            method => <<"GET">>,
            handler => 'openapi_orson_handler'
        },
       'getTechTune' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/orson/ai/techTune/:requestId",
            method => <<"GET">>,
            handler => 'openapi_orson_handler'
        },
       'getTopics' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/orson/ai/topics/:requestId",
            method => <<"GET">>,
            handler => 'openapi_orson_handler'
        },
       'getVoiceCanvas' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/orson/ai/voiceCanvas/:requestId",
            method => <<"GET">>,
            handler => 'openapi_orson_handler'
        },
       'startVideoRender' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/orson/stories/renders",
            method => <<"POST">>,
            handler => 'openapi_orson_handler'
        },
       'stt' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/orson/ai/stt",
            method => <<"POST">>,
            handler => 'openapi_orson_handler'
        },
       'summarizeTopics' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/orson/ai/topics",
            method => <<"POST">>,
            handler => 'openapi_orson_handler'
        },
       'techTune' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/orson/ai/techTune",
            method => <<"POST">>,
            handler => 'openapi_orson_handler'
        },
       'tts' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/orson/ai/tts",
            method => <<"POST">>,
            handler => 'openapi_orson_handler'
        },
       'createPack' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/pack/create",
            method => <<"POST">>,
            handler => 'openapi_pack_handler'
        },
       'deletePack' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/pack/delete",
            method => <<"POST">>,
            handler => 'openapi_pack_handler'
        },
       'getPack' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/pack/get",
            method => <<"GET">>,
            handler => 'openapi_pack_handler'
        },
       'searchPacks' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/pack/search",
            method => <<"GET">>,
            handler => 'openapi_pack_handler'
        },
       'updatePack' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/pack/update",
            method => <<"POST">>,
            handler => 'openapi_pack_handler'
        },
       'processAllParticipants' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/participant/process/all",
            method => <<"POST">>,
            handler => 'openapi_participants_handler'
        },
       'processParticipants' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/participant/process",
            method => <<"POST">>,
            handler => 'openapi_participants_handler'
        },
       'computePath' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/pathing/compute",
            method => <<"GET">>,
            handler => 'openapi_pathing_handler'
        },
       'createPostalCode' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/postalCode/create",
            method => <<"POST">>,
            handler => 'openapi_postal_code_handler'
        },
       'deletePostalCode' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/postalCode/delete",
            method => <<"POST">>,
            handler => 'openapi_postal_code_handler'
        },
       'getPostalCode' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/postalCode/get",
            method => <<"GET">>,
            handler => 'openapi_postal_code_handler'
        },
       'getPostalCodes' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/postalCode/search",
            method => <<"GET">>,
            handler => 'openapi_postal_code_handler'
        },
       'updatePostalCode' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/postalCode/update",
            method => <<"POST">>,
            handler => 'openapi_postal_code_handler'
        },
       'createPersona' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/persona/create",
            method => <<"POST">>,
            handler => 'openapi_preview_persona_handler'
        },
       'deletePersona' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/persona/delete",
            method => <<"POST">>,
            handler => 'openapi_preview_persona_handler'
        },
       'getPersonaList' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/persona/get",
            method => <<"GET">>,
            handler => 'openapi_preview_persona_handler'
        },
       'searchPersona' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/persona/search",
            method => <<"GET">>,
            handler => 'openapi_preview_persona_handler'
        },
       'updatePersona' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/persona/update",
            method => <<"POST">>,
            handler => 'openapi_preview_persona_handler'
        },
       'createProgram' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/program",
            method => <<"POST">>,
            handler => 'openapi_program_handler'
        },
       'deleteProgram' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/program/:id",
            method => <<"DELETE">>,
            handler => 'openapi_program_handler'
        },
       'getProgram' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/program/:id",
            method => <<"GET">>,
            handler => 'openapi_program_handler'
        },
       'postProgram' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/program/:id",
            method => <<"POST">>,
            handler => 'openapi_program_handler'
        },
       'putProgram' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/program/:id",
            method => <<"PUT">>,
            handler => 'openapi_program_handler'
        },
       'searchPrograms' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/program",
            method => <<"GET">>,
            handler => 'openapi_program_handler'
        },
       'createPurchaseItem' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/purchase/create",
            method => <<"POST">>,
            handler => 'openapi_purchase_item_handler'
        },
       'deletePurchaseItem' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/purchase/delete",
            method => <<"POST">>,
            handler => 'openapi_purchase_item_handler'
        },
       'getPurchaseItem' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/purchase/get",
            method => <<"GET">>,
            handler => 'openapi_purchase_item_handler'
        },
       'searchPurchaseItems' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/purchase/search",
            method => <<"GET">>,
            handler => 'openapi_purchase_item_handler'
        },
       'updatePurchaseItem' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/purchase/update",
            method => <<"POST">>,
            handler => 'openapi_purchase_item_handler'
        },
       'createOrder' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/order/create",
            method => <<"POST">>,
            handler => 'openapi_purchase_order_handler'
        },
       'deleteOrder' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/order/delete",
            method => <<"POST">>,
            handler => 'openapi_purchase_order_handler'
        },
       'getOrder' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/order/get",
            method => <<"GET">>,
            handler => 'openapi_purchase_order_handler'
        },
       'previewOrder' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/order/preview",
            method => <<"POST">>,
            handler => 'openapi_purchase_order_handler'
        },
       'searchOrders' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/order/search",
            method => <<"GET">>,
            handler => 'openapi_purchase_order_handler'
        },
       'updateOrder' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/order/update",
            method => <<"POST">>,
            handler => 'openapi_purchase_order_handler'
        },
       'createQuestion' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/game/question/create",
            method => <<"POST">>,
            handler => 'openapi_question_handler'
        },
       'deleteQuestion' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/game/question/delete",
            method => <<"POST">>,
            handler => 'openapi_question_handler'
        },
       'getQuestion' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/game/question/get",
            method => <<"GET">>,
            handler => 'openapi_question_handler'
        },
       'searchQuestions' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/game/question/search",
            method => <<"GET">>,
            handler => 'openapi_question_handler'
        },
       'updateQuestion' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/game/question/update",
            method => <<"POST">>,
            handler => 'openapi_question_handler'
        },
       'getHistoricalRankings' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/ranking/historical/search",
            method => <<"GET">>,
            handler => 'openapi_ranking_handler'
        },
       'getRankings' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/ranking/search",
            method => <<"GET">>,
            handler => 'openapi_ranking_handler'
        },
       'getUserRank' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/ranking/personal/ranks",
            method => <<"POST">>,
            handler => 'openapi_ranking_handler'
        },
       'overrideUserRank' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/ranking/override",
            method => <<"POST">>,
            handler => 'openapi_ranking_handler'
        },
       'updateRankings' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/ranking/update",
            method => <<"POST">>,
            handler => 'openapi_ranking_handler'
        },
       'createRating' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/rating/create",
            method => <<"POST">>,
            handler => 'openapi_rating_handler'
        },
       'deleteRating' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/rating/delete",
            method => <<"POST">>,
            handler => 'openapi_rating_handler'
        },
       'searchLocationRatingIndexes' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/location/rating/index/search",
            method => <<"GET">>,
            handler => 'openapi_rating_handler'
        },
       'searchRatingIndexes' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/rating/index/search",
            method => <<"GET">>,
            handler => 'openapi_rating_handler'
        },
       'searchRatings' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/rating/search",
            method => <<"GET">>,
            handler => 'openapi_rating_handler'
        },
       'updateRating' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/rating/update",
            method => <<"POST">>,
            handler => 'openapi_rating_handler'
        },
       'createRegion' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/region/create",
            method => <<"POST">>,
            handler => 'openapi_region_handler'
        },
       'deleteRegion' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/region/delete",
            method => <<"POST">>,
            handler => 'openapi_region_handler'
        },
       'getRegion' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/region/get",
            method => <<"GET">>,
            handler => 'openapi_region_handler'
        },
       'searchRegions' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/region/search",
            method => <<"GET">>,
            handler => 'openapi_region_handler'
        },
       'updateRegion' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/region/update",
            method => <<"POST">>,
            handler => 'openapi_region_handler'
        },
       'createBatch' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/report/batch/create",
            method => <<"POST">>,
            handler => 'openapi_reporting_handler'
        },
       'createRegionLegSummaryBatch' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/report/region/summary/batch",
            method => <<"POST">>,
            handler => 'openapi_reporting_handler'
        },
       'deleteBatch' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/report/batch/delete",
            method => <<"POST">>,
            handler => 'openapi_reporting_handler'
        },
       'getReportBatch' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/report/batch/get",
            method => <<"GET">>,
            handler => 'openapi_reporting_handler'
        },
       'runReport' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/report/run",
            method => <<"POST">>,
            handler => 'openapi_reporting_handler'
        },
       'searchBatch' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/report/batch/search",
            method => <<"GET">>,
            handler => 'openapi_reporting_handler'
        },
       'createReservation' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/reservation/create",
            method => <<"POST">>,
            handler => 'openapi_reservation_handler'
        },
       'deleteReservation' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/reservation/delete",
            method => <<"POST">>,
            handler => 'openapi_reservation_handler'
        },
       'reservableAvailability' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/reservable/availability/update",
            method => <<"POST">>,
            handler => 'openapi_reservation_handler'
        },
       'searchAvailability' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/reservable/availability/search",
            method => <<"GET">>,
            handler => 'openapi_reservation_handler'
        },
       'searchReservations' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/reservation/search",
            method => <<"GET">>,
            handler => 'openapi_reservation_handler'
        },
       'searchSchedule' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/reservable/schedule/search",
            method => <<"GET">>,
            handler => 'openapi_reservation_handler'
        },
       'createRetailer' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/retailer/create",
            method => <<"POST">>,
            handler => 'openapi_retailer_handler'
        },
       'deleteRetailer' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/retailer/delete",
            method => <<"POST">>,
            handler => 'openapi_retailer_handler'
        },
       'getRetailer' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/retailer/get",
            method => <<"GET">>,
            handler => 'openapi_retailer_handler'
        },
       'getRetailers' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/retailer/search",
            method => <<"GET">>,
            handler => 'openapi_retailer_handler'
        },
       'retailerLoginCheck' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/retailer/login",
            method => <<"POST">>,
            handler => 'openapi_retailer_handler'
        },
       'updateRetailer' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/retailer/update",
            method => <<"POST">>,
            handler => 'openapi_retailer_handler'
        },
       'createRetailerLocationConsumer' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/location/create",
            method => <<"POST">>,
            handler => 'openapi_retailer_location_handler'
        },
       'createRetailerLocations' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/retailer/location/create",
            method => <<"POST">>,
            handler => 'openapi_retailer_location_handler'
        },
       'deleteRetailerLocation' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/retailer/location/delete",
            method => <<"POST">>,
            handler => 'openapi_retailer_location_handler'
        },
       'getRetailerLocation' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/retailer/location/get",
            method => <<"GET">>,
            handler => 'openapi_retailer_location_handler'
        },
       'getRetailerLocationConsumer' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/location/get",
            method => <<"GET">>,
            handler => 'openapi_retailer_location_handler'
        },
       'indexedRetailerLocationDistanceSearch' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/retailer/location/idistancesearch",
            method => <<"GET">>,
            handler => 'openapi_retailer_location_handler'
        },
       'indexedRetailerLocationSearch' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/retailer/location/isearch",
            method => <<"GET">>,
            handler => 'openapi_retailer_location_handler'
        },
       'searchRetailerLocations' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/retailer/location/search",
            method => <<"GET">>,
            handler => 'openapi_retailer_location_handler'
        },
       'updateRetailerLocations' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/retailer/location/update",
            method => <<"POST">>,
            handler => 'openapi_retailer_location_handler'
        },
       'getRetaokiler' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/retailer",
            method => <<"GET">>,
            handler => 'openapi_retailer_v2_handler'
        },
       'approveRoute' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/route/:routeId/approve",
            method => <<"POST">>,
            handler => 'openapi_route_handler'
        },
       'copyRoute' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/route/:routeId/copy",
            method => <<"POST">>,
            handler => 'openapi_route_handler'
        },
       'createRoute' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/route",
            method => <<"POST">>,
            handler => 'openapi_route_handler'
        },
       'createRouteDirections' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/route/:routeId/directions",
            method => <<"PUT">>,
            handler => 'openapi_route_handler'
        },
       'createRoutePolyline' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/route/:routeId/polyline",
            method => <<"PUT">>,
            handler => 'openapi_route_handler'
        },
       'deleteRoute' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/route/:routeId",
            method => <<"DELETE">>,
            handler => 'openapi_route_handler'
        },
       'disapproveRoute' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/route/:routeId/disapprove",
            method => <<"POST">>,
            handler => 'openapi_route_handler'
        },
       'getRoute' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/route/:routeId",
            method => <<"GET">>,
            handler => 'openapi_route_handler'
        },
       'getRouteDirections' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/route/:routeId/directions",
            method => <<"GET">>,
            handler => 'openapi_route_handler'
        },
       'getRouteShipments' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/route/:routeId/shipments",
            method => <<"GET">>,
            handler => 'openapi_route_handler'
        },
       'getRouteStop' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/route/:routeId/stop/:stopId",
            method => <<"GET">>,
            handler => 'openapi_route_handler'
        },
       'getRouteStops' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/route/:routeId/stops",
            method => <<"GET">>,
            handler => 'openapi_route_handler'
        },
       'getShipmentsAtStop' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/route/:routeId/stop/:stopId/shipments",
            method => <<"GET">>,
            handler => 'openapi_route_handler'
        },
       'optimizeRoute' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/route/:routeId/optimize",
            method => <<"POST">>,
            handler => 'openapi_route_handler'
        },
       'removeStop' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/route/:routeId/stop/:stopId",
            method => <<"DELETE">>,
            handler => 'openapi_route_handler'
        },
       'reorderRouteStopsPatch' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/route/:routeId/stops/reorder",
            method => <<"PATCH">>,
            handler => 'openapi_route_handler'
        },
       'reorderRouteStopsPost' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/route/:routeId/stops/reorder",
            method => <<"POST">>,
            handler => 'openapi_route_handler'
        },
       'searchRoutes' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/route",
            method => <<"GET">>,
            handler => 'openapi_route_handler'
        },
       'setDriver' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/route/:id/driver/:driverId",
            method => <<"POST">>,
            handler => 'openapi_route_handler'
        },
       'updateRoute' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/route/:routeId",
            method => <<"PUT">>,
            handler => 'openapi_route_handler'
        },
       'updateRouteStop' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/route/:routeId/stop/:stopId",
            method => <<"PUT">>,
            handler => 'openapi_route_handler'
        },
       'createRouteSettings' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/route/setting",
            method => <<"POST">>,
            handler => 'openapi_route_setting_handler'
        },
       'deleteRouteSettings' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/route/setting/:routeSettingsId",
            method => <<"DELETE">>,
            handler => 'openapi_route_setting_handler'
        },
       'getRouteSettings' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/route/setting/:routeSettingsId",
            method => <<"GET">>,
            handler => 'openapi_route_setting_handler'
        },
       'searchRouteSettings' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/route/setting",
            method => <<"GET">>,
            handler => 'openapi_route_setting_handler'
        },
       'updateRouteSettings' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/route/setting/:routeSettingsId",
            method => <<"PUT">>,
            handler => 'openapi_route_setting_handler'
        },
       'computeRouting' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/routing/compute",
            method => <<"POST">>,
            handler => 'openapi_routing_handler'
        },
       'createScheduledNotification' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/notification/schedule/create",
            method => <<"POST">>,
            handler => 'openapi_scheduled_notification_handler'
        },
       'deleteScheduledNotification' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/notification/schedule/delete",
            method => <<"POST">>,
            handler => 'openapi_scheduled_notification_handler'
        },
       'getScheduledNotification' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/notification/schedule/get",
            method => <<"GET">>,
            handler => 'openapi_scheduled_notification_handler'
        },
       'scheduleNotificationListings' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/notification/schedule/generate",
            method => <<"POST">>,
            handler => 'openapi_scheduled_notification_handler'
        },
       'searchScheduledNotifications' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/notification/schedule/search",
            method => <<"GET">>,
            handler => 'openapi_scheduled_notification_handler'
        },
       'updateScheduledNotification' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/notification/schedule/update",
            method => <<"POST">>,
            handler => 'openapi_scheduled_notification_handler'
        },
       'createScore' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/score/create",
            method => <<"POST">>,
            handler => 'openapi_score_handler'
        },
       'getScore' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/score/get",
            method => <<"GET">>,
            handler => 'openapi_score_handler'
        },
       'searchScores' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/score/search",
            method => <<"GET">>,
            handler => 'openapi_score_handler'
        },
       'createSecureApplication' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/secure/application/create",
            method => <<"POST">>,
            handler => 'openapi_secure_app_handler'
        },
       'deleteSecureApplication' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/secure/application/delete",
            method => <<"POST">>,
            handler => 'openapi_secure_app_handler'
        },
       'loginSecure' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/secure/login",
            method => <<"POST">>,
            handler => 'openapi_secure_app_handler'
        },
       'purchaseSecure' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/secure/purchase",
            method => <<"POST">>,
            handler => 'openapi_secure_app_handler'
        },
       'resetSecure' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/secure/application/reset",
            method => <<"POST">>,
            handler => 'openapi_secure_app_handler'
        },
       'updateSecureApplication' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/secure/application/update",
            method => <<"POST">>,
            handler => 'openapi_secure_app_handler'
        },
       'createServiceHub' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/hub",
            method => <<"POST">>,
            handler => 'openapi_service_hub_handler'
        },
       'deleteServiceHub' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/hub/:id",
            method => <<"DELETE">>,
            handler => 'openapi_service_hub_handler'
        },
       'getServiceHub' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/hub/:id",
            method => <<"GET">>,
            handler => 'openapi_service_hub_handler'
        },
       'postServiceHub' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/hub/:id",
            method => <<"POST">>,
            handler => 'openapi_service_hub_handler'
        },
       'putServiceHub' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/hub/:id",
            method => <<"PUT">>,
            handler => 'openapi_service_hub_handler'
        },
       'searchServiceHubs' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/hub",
            method => <<"GET">>,
            handler => 'openapi_service_hub_handler'
        },
       'cancelShipment' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/shipment/:id/cancel",
            method => <<"POST">>,
            handler => 'openapi_shipment_handler'
        },
       'createShipment' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/shipment",
            method => <<"POST">>,
            handler => 'openapi_shipment_handler'
        },
       'deleteShipment' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/shipment/:id",
            method => <<"DELETE">>,
            handler => 'openapi_shipment_handler'
        },
       'getShipment' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/shipment/:id",
            method => <<"GET">>,
            handler => 'openapi_shipment_handler'
        },
       'searchShipments' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/shipment",
            method => <<"GET">>,
            handler => 'openapi_shipment_handler'
        },
       'updateShipment' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/shipment/:id",
            method => <<"PUT">>,
            handler => 'openapi_shipment_handler'
        },
       'updateShipmentStatus' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/shipment/:id/status",
            method => <<"POST">>,
            handler => 'openapi_shipment_handler'
        },
       'createShipmentBatch' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/shipment/batch",
            method => <<"POST">>,
            handler => 'openapi_shipment_batch_handler'
        },
       'deleteShipmentBatch' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/shipment/batch/:batchId",
            method => <<"DELETE">>,
            handler => 'openapi_shipment_batch_handler'
        },
       'getShipmentBatch' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/shipment/batch/:batchId",
            method => <<"GET">>,
            handler => 'openapi_shipment_batch_handler'
        },
       'getShipmentBatchStatus' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/shipment/batch/:batchId/status",
            method => <<"GET">>,
            handler => 'openapi_shipment_batch_handler'
        },
       'searchShipmentBatch' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/shipment/batch",
            method => <<"GET">>,
            handler => 'openapi_shipment_batch_handler'
        },
       'simulation' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/simulation/routing",
            method => <<"POST">>,
            handler => 'openapi_simulation_handler'
        },
       'getStop' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/stop/:id",
            method => <<"GET">>,
            handler => 'openapi_stop_handler'
        },
       'updateStop' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/stop/:id",
            method => <<"PUT">>,
            handler => 'openapi_stop_handler'
        },
       'createStripeCheckoutSession' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/stripe/checkout/session/create",
            method => <<"POST">>,
            handler => 'openapi_stripe_handler'
        },
       'createSubscription' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/subscription/create",
            method => <<"POST">>,
            handler => 'openapi_subscription_handler'
        },
       'deleteSubscription' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/subscription/delete",
            method => <<"POST">>,
            handler => 'openapi_subscription_handler'
        },
       'getSubscription' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/subscription/get",
            method => <<"GET">>,
            handler => 'openapi_subscription_handler'
        },
       'getSubscriptionPlan' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/subscription/plan/get",
            method => <<"GET">>,
            handler => 'openapi_subscription_handler'
        },
       'getSubscriptionPlans' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/subscription/plan/list",
            method => <<"GET">>,
            handler => 'openapi_subscription_handler'
        },
       'getSubscriptionUsage' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/subscription/usage/get",
            method => <<"GET">>,
            handler => 'openapi_subscription_handler'
        },
       'updateSubscription' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/subscription/update",
            method => <<"POST">>,
            handler => 'openapi_subscription_handler'
        },
       'createTask' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/task/create",
            method => <<"POST">>,
            handler => 'openapi_task_handler'
        },
       'deleteTask' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/task/delete",
            method => <<"POST">>,
            handler => 'openapi_task_handler'
        },
       'getTask' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/task/get",
            method => <<"GET">>,
            handler => 'openapi_task_handler'
        },
       'searchTasks' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/task/search",
            method => <<"GET">>,
            handler => 'openapi_task_handler'
        },
       'updateTask' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/task/update",
            method => <<"POST">>,
            handler => 'openapi_task_handler'
        },
       'createTerritory' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/territory/create",
            method => <<"POST">>,
            handler => 'openapi_territory_handler'
        },
       'deleteTerritory' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/territory/delete",
            method => <<"POST">>,
            handler => 'openapi_territory_handler'
        },
       'getTerritory' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/territory/get",
            method => <<"GET">>,
            handler => 'openapi_territory_handler'
        },
       'searchTerritories' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/territory/search",
            method => <<"GET">>,
            handler => 'openapi_territory_handler'
        },
       'updateTerritory' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/territory/update",
            method => <<"POST">>,
            handler => 'openapi_territory_handler'
        },
       'addOrUpdateThemeDescriptor' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/theme",
            method => <<"POST">>,
            handler => 'openapi_theme_descriptor_handler'
        },
       'getThemeDescriptor' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/theme/get",
            method => <<"GET">>,
            handler => 'openapi_theme_descriptor_handler'
        },
       'getThemeDescriptors' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/theme/search",
            method => <<"GET">>,
            handler => 'openapi_theme_descriptor_handler'
        },
       'removeThemeDescriptor' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/theme/remove",
            method => <<"POST">>,
            handler => 'openapi_theme_descriptor_handler'
        },
       'createCredential' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/thirdparty/credential/create",
            method => <<"POST">>,
            handler => 'openapi_third_party_credentials_handler'
        },
       'createNetwork' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/thirdparty/network/create",
            method => <<"POST">>,
            handler => 'openapi_third_party_credentials_handler'
        },
       'deleteCredential' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/thirdparty/credential/delete",
            method => <<"POST">>,
            handler => 'openapi_third_party_credentials_handler'
        },
       'deleteNetwork' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/thirdparty/network/delete",
            method => <<"POST">>,
            handler => 'openapi_third_party_credentials_handler'
        },
       'getCredential' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/thirdparty/credential/get",
            method => <<"POST">>,
            handler => 'openapi_third_party_credentials_handler'
        },
       'getNetwork' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/thirdparty/network/get",
            method => <<"GET">>,
            handler => 'openapi_third_party_credentials_handler'
        },
       'searchCredentials' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/thirdparty/credential/search",
            method => <<"GET">>,
            handler => 'openapi_third_party_credentials_handler'
        },
       'searchNetworks' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/thirdparty/network/search",
            method => <<"GET">>,
            handler => 'openapi_third_party_credentials_handler'
        },
       'sendMFAChallenge' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/thirdparty/credential/mfa/send",
            method => <<"POST">>,
            handler => 'openapi_third_party_credentials_handler'
        },
       'updateCredential' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/thirdparty/credential/update",
            method => <<"POST">>,
            handler => 'openapi_third_party_credentials_handler'
        },
       'updateNetwork' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/thirdparty/network/update",
            method => <<"POST">>,
            handler => 'openapi_third_party_credentials_handler'
        },
       'getTicketCount' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/ticket/count",
            method => <<"GET">>,
            handler => 'openapi_ticket_handler'
        },
       'getTicketList' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/ticket/getList",
            method => <<"GET">>,
            handler => 'openapi_ticket_handler'
        },
       'giftPurchase' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/purchase/gift",
            method => <<"POST">>,
            handler => 'openapi_ticket_handler'
        },
       'saveTicket' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/ticket/save",
            method => <<"POST">>,
            handler => 'openapi_ticket_handler'
        },
       'saveTicketViaFileUpload' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/ticket/save/fileUpload",
            method => <<"POST">>,
            handler => 'openapi_ticket_handler'
        },
       'ticketOffers' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/ticket/ticketoffers",
            method => <<"GET">>,
            handler => 'openapi_ticket_handler'
        },
       'createTournament' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/tournament/create",
            method => <<"POST">>,
            handler => 'openapi_tournament_handler'
        },
       'deleteTournament' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/tournament/delete",
            method => <<"POST">>,
            handler => 'openapi_tournament_handler'
        },
       'getTournament' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/tournament/get",
            method => <<"GET">>,
            handler => 'openapi_tournament_handler'
        },
       'searchObjects' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/tournament/object/search",
            method => <<"GET">>,
            handler => 'openapi_tournament_handler'
        },
       'searchRounds' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/tournament/round/search",
            method => <<"GET">>,
            handler => 'openapi_tournament_handler'
        },
       'searchTournaments' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/tournament/search",
            method => <<"GET">>,
            handler => 'openapi_tournament_handler'
        },
       'submitTournamentScore' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/tournament/score",
            method => <<"POST">>,
            handler => 'openapi_tournament_handler'
        },
       'submitTournamentVote' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/tournament/vote",
            method => <<"POST">>,
            handler => 'openapi_tournament_handler'
        },
       'substituteTournamentPlayer' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/tournament/substitute",
            method => <<"POST">>,
            handler => 'openapi_tournament_handler'
        },
       'updateTournament' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/tournament/update",
            method => <<"POST">>,
            handler => 'openapi_tournament_handler'
        },
       'batchSaveTracking' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/tracking/batch/create",
            method => <<"POST">>,
            handler => 'openapi_tracking_handler'
        },
       'getPredictedLocations' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/tracking/predicted/get",
            method => <<"GET">>,
            handler => 'openapi_tracking_handler'
        },
       'getPredictedPath' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/tracking/path/get",
            method => <<"GET">>,
            handler => 'openapi_tracking_handler'
        },
       'getPreferredLocations' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/tracking/preferred/search",
            method => <<"GET">>,
            handler => 'openapi_tracking_handler'
        },
       'getTrackingLegs' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/tracking/search",
            method => <<"GET">>,
            handler => 'openapi_tracking_handler'
        },
       'saveTrackingLeg' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/tracking/leg/create",
            method => <<"POST">>,
            handler => 'openapi_tracking_handler'
        },
       'saveTrackingStep' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/tracking/step/create",
            method => <<"POST">>,
            handler => 'openapi_tracking_handler'
        },
       'searchAccountsWithTrackingLegs' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/tracking/list",
            method => <<"GET">>,
            handler => 'openapi_tracking_handler'
        },
       'searchTrackingLegs' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/tracking/searchByBillable",
            method => <<"GET">>,
            handler => 'openapi_tracking_handler'
        },
       'createTrigger' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/trigger/create",
            method => <<"POST">>,
            handler => 'openapi_trigger_handler'
        },
       'deleteTrigger' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/trigger/delete",
            method => <<"POST">>,
            handler => 'openapi_trigger_handler'
        },
       'getTrigger' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/trigger/get",
            method => <<"GET">>,
            handler => 'openapi_trigger_handler'
        },
       'searchTriggers' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/trigger/search",
            method => <<"GET">>,
            handler => 'openapi_trigger_handler'
        },
       'updateTrigger' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/trigger/update",
            method => <<"POST">>,
            handler => 'openapi_trigger_handler'
        },
       'createTrip' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/trip",
            method => <<"POST">>,
            handler => 'openapi_trip_handler'
        },
       'delete' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/trip/:id",
            method => <<"DELETE">>,
            handler => 'openapi_trip_handler'
        },
       'driveTrip' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/trip/:id/drive",
            method => <<"POST">>,
            handler => 'openapi_trip_handler'
        },
       'flexibleTrip' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/trip/:id/flexible",
            method => <<"POST">>,
            handler => 'openapi_trip_handler'
        },
       'getTrip' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/trip/:id",
            method => <<"GET">>,
            handler => 'openapi_trip_handler'
        },
       'getTripMatches' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/trip/:id/match",
            method => <<"GET">>,
            handler => 'openapi_trip_handler'
        },
       'processTripMatches' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/trip/match/process",
            method => <<"POST">>,
            handler => 'openapi_trip_handler'
        },
       'ride' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/trip/:id/ride",
            method => <<"POST">>,
            handler => 'openapi_trip_handler'
        },
       'search' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/trip",
            method => <<"GET">>,
            handler => 'openapi_trip_handler'
        },
       'searchTrips' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/trip/match",
            method => <<"GET">>,
            handler => 'openapi_trip_handler'
        },
       'updateLocations' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/trip/:id/locations",
            method => <<"POST">>,
            handler => 'openapi_trip_handler'
        },
       'updateRecurrenceLocations' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/trip/:id/locations/recurrence",
            method => <<"POST">>,
            handler => 'openapi_trip_handler'
        },
       'updateRecurrenceShipments' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/trip/:id/shipments/recurrence",
            method => <<"POST">>,
            handler => 'openapi_trip_handler'
        },
       'updateShipments' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/trip/:id/shipments",
            method => <<"POST">>,
            handler => 'openapi_trip_handler'
        },
       'updateTrip' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/trip/:id",
            method => <<"PUT">>,
            handler => 'openapi_trip_handler'
        },
       'updateTripNotifications' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/trip/notifications",
            method => <<"POST">>,
            handler => 'openapi_trip_handler'
        },
       'smsBuyOffer' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/sms/buyoffer/:appKey",
            method => <<"POST">>,
            handler => 'openapi_twilio_handler'
        },
       'authorizeTwitter' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/twitter/authorize",
            method => <<"POST">>,
            handler => 'openapi_twitter_handler'
        },
       'loginTwitter' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/twitter/login",
            method => <<"POST">>,
            handler => 'openapi_twitter_handler'
        },
       'addUsersToPermissionable' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/permissions/add",
            method => <<"POST">>,
            handler => 'openapi_user_permissions_handler'
        },
       'approvePermissionable' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/permissionable/approve",
            method => <<"POST">>,
            handler => 'openapi_user_permissions_handler'
        },
       'leaveFromPermissionable' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/permissions/leave",
            method => <<"POST">>,
            handler => 'openapi_user_permissions_handler'
        },
       'removeUsersFromPermissionable' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/consumer/permissions/remove",
            method => <<"POST">>,
            handler => 'openapi_user_permissions_handler'
        },
       'searchPermissionables' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/permissions/search",
            method => <<"GET">>,
            handler => 'openapi_user_permissions_handler'
        },
       'searchPermissionablesFollowingDistance' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/permissions/distancesearch",
            method => <<"GET">>,
            handler => 'openapi_user_permissions_handler'
        },
       'createFollowing' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/me/rels/following/create",
            method => <<"POST">>,
            handler => 'openapi_vatom_handler'
        },
       'createSpace' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/spaces/create",
            method => <<"POST">>,
            handler => 'openapi_vatom_handler'
        },
       'createVatomEvent' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/events/create",
            method => <<"POST">>,
            handler => 'openapi_vatom_handler'
        },
       'deleteFollowing' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/me/rels/following/delete",
            method => <<"POST">>,
            handler => 'openapi_vatom_handler'
        },
       'deletePointsBalance' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/campaign/points/delete",
            method => <<"POST">>,
            handler => 'openapi_vatom_handler'
        },
       'deleteSpace' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/spaces/delete",
            method => <<"POST">>,
            handler => 'openapi_vatom_handler'
        },
       'deleteVatomEvent' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/events/delete",
            method => <<"POST">>,
            handler => 'openapi_vatom_handler'
        },
       'deleteVatomNFT' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/vatoms/delete",
            method => <<"POST">>,
            handler => 'openapi_vatom_handler'
        },
       'executeActionOnNFT' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/vatoms/execute-action",
            method => <<"POST">>,
            handler => 'openapi_vatom_handler'
        },
       'geomapSearch' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/vatoms/geo-map/search",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'getBusinessBehaviors' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/behaviors",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'getBusinessCoinsBalance' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/coins/get",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'getBusinessIds' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/me/businesses",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'getBusinessInfo' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/get",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'getBusinessUsers' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/users",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'getCampaignGroupEntities' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/campaign-groups/entities",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'getCampaignGroupRules' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/campaign-groups/rules",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'getCampaignGroupStats' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/campaign-groups/stats",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'getCampaignInfo' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/campaign-groups/get",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'getEventGuestList' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/events/guests/get",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'getInventory' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/me/inventory",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'getMyFollowing' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/me/rels/following",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'getPointsBalance' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/u/campaign/points/get",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'getPointsBalanceAsBusiness' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/campaign/u/points/get",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'getSpace' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/spaces/get",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'getUserCoinsAsBusiness' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/users/coins/get",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'getUserCoinsBalance' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/u/coins/get",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'getUserFollowers' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/users/rels/followers",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'getUserFollowing' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/users/rels/following",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'getUserInfo' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/user/get",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'getUserProfile' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/me/get",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'getVatomEvent' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/events/get",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'getVatomNFT' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/vatoms/get",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'listCommunities' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/communities/search",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'listEvents' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/events/search",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'listSpaces' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/spaces/search",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'listUserCoinTransactions' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/u/coins/txns/search",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'listUserCoinTransactionsAsBusiness' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/users/coins/txns/search",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'performActionOnNFT' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/me/vatoms/actions",
            method => <<"POST">>,
            handler => 'openapi_vatom_handler'
        },
       'redeemNFT' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/redemptions",
            method => <<"POST">>,
            handler => 'openapi_vatom_handler'
        },
       'redeemUserCoinsAsBusiness' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/users/coins/redeem",
            method => <<"POST">>,
            handler => 'openapi_vatom_handler'
        },
       'searchBusinesses' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/search",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'searchCampaignGroups' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/campaign-groups/search",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'searchIdentities' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/me/identities/search",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'searchInventory' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/user-inventory/search",
            method => <<"GET">>,
            handler => 'openapi_vatom_handler'
        },
       'sendNFT' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/campaigns/send",
            method => <<"POST">>,
            handler => 'openapi_vatom_handler'
        },
       'setPointsBalanceAsBusiness' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/campaign/u/points/update",
            method => <<"POST">>,
            handler => 'openapi_vatom_handler'
        },
       'transferUserCoins' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/u/coins/transfer",
            method => <<"POST">>,
            handler => 'openapi_vatom_handler'
        },
       'updateBusinessCoins' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/coins/update",
            method => <<"POST">>,
            handler => 'openapi_vatom_handler'
        },
       'updateEventGuestList' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/events/guests/update",
            method => <<"POST">>,
            handler => 'openapi_vatom_handler'
        },
       'updateSpace' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/spaces/update",
            method => <<"POST">>,
            handler => 'openapi_vatom_handler'
        },
       'updateUserCoinsAsBusiness' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/users/coins/update",
            method => <<"POST">>,
            handler => 'openapi_vatom_handler'
        },
       'updateUserProfile' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/me/update",
            method => <<"POST">>,
            handler => 'openapi_vatom_handler'
        },
       'updateVatomEvent' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vatom/b/events/update",
            method => <<"POST">>,
            handler => 'openapi_vatom_handler'
        },
       'createVehicle' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vehicle",
            method => <<"POST">>,
            handler => 'openapi_vehicle_handler'
        },
       'deleteVehicle' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vehicle/:id",
            method => <<"DELETE">>,
            handler => 'openapi_vehicle_handler'
        },
       'getVehicle' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vehicle/:id",
            method => <<"GET">>,
            handler => 'openapi_vehicle_handler'
        },
       'searchVehicle' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vehicle",
            method => <<"GET">>,
            handler => 'openapi_vehicle_handler'
        },
       'updateVehicle' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vehicle/:id",
            method => <<"PUT">>,
            handler => 'openapi_vehicle_handler'
        },
       'createVehicleType' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vehicle/type",
            method => <<"POST">>,
            handler => 'openapi_vehicle_type_handler'
        },
       'deleteVehicleType' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vehicle/type/:vehicleTypeId",
            method => <<"DELETE">>,
            handler => 'openapi_vehicle_type_handler'
        },
       'getVehicleType' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vehicle/type/:vehicleTypeId",
            method => <<"GET">>,
            handler => 'openapi_vehicle_type_handler'
        },
       'searchVehicleTypes' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vehicle/type",
            method => <<"GET">>,
            handler => 'openapi_vehicle_type_handler'
        },
       'updateVehicleType' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/vehicle/type/:vehicleTypeId",
            method => <<"PUT">>,
            handler => 'openapi_vehicle_type_handler'
        },
       'createOfferTransaction' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/wallet/create",
            method => <<"POST">>,
            handler => 'openapi_wallet_handler'
        },
       'deleteOfferTransaction' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/wallet/delete",
            method => <<"POST">>,
            handler => 'openapi_wallet_handler'
        },
       'getOfferTransaction' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/wallet/get",
            method => <<"GET">>,
            handler => 'openapi_wallet_handler'
        },
       'previewOfferTransaction' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/wallet/preview",
            method => <<"POST">>,
            handler => 'openapi_wallet_handler'
        },
       'searchOfferTransactions' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/wallet/search",
            method => <<"GET">>,
            handler => 'openapi_wallet_handler'
        },
       'updateOfferTransaction' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/wallet/update",
            method => <<"POST">>,
            handler => 'openapi_wallet_handler'
        },
       'searchWeather' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/weather/search",
            method => <<"GET">>,
            handler => 'openapi_weather_handler'
        },
       'createWord' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/game/word/create",
            method => <<"POST">>,
            handler => 'openapi_word_handler'
        },
       'deleteWord' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/game/word/delete",
            method => <<"DELETE">>,
            handler => 'openapi_word_handler'
        },
       'getWord' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/game/word/get",
            method => <<"GET">>,
            handler => 'openapi_word_handler'
        },
       'getWords' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/game/word/search",
            method => <<"GET">>,
            handler => 'openapi_word_handler'
        },
       'updateWord' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/game/word/update",
            method => <<"POST">>,
            handler => 'openapi_word_handler'
        },
       'runWorkflow' => #{
            servers => [],
            base_path => "",
            path => "/api/:version/workflow/run",
            method => <<"POST">>,
            handler => 'openapi_workflow_handler'
        }
    }.
