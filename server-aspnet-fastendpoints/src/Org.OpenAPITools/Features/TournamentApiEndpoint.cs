using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Tournament
/// </summary>

public class CreateTournamentEndpoint : FastEndpoints.Endpoint<CreateTournamentRequest, TournamentResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/tournament/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Tournament");
        });

        Summary(s => {
            s.Summary = "Create Tournament";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.AppKey, "The appKey the tournament is created for.");
            s.RequestParam(r => r.Title, "The title of the tournament");
            s.RequestParam(r => r.CostToPlay, "The number of tickets required to pay to enter the tournament");
            s.RequestParam(r => r.StartDate, "The date/time to start the tournament");
            s.RequestParam(r => r.SubType, "Custom string client apps can use for searching/filtering tournaments");
            s.RequestParam(r => r.ImageAssetId, "The asset ID to attach to the tournament");
            s.RequestParam(r => r.SecondsBetweenLevels, "The number of seconds in between the start of each tournament game/group");
            s.RequestParam(r => r.SecondsForTieBreaker, "The number of seconds to extend the round end time in the case of a tie breaker");
            s.RequestParam(r => r.SecondsBetweenPacks, "The number of seconds in between the start of each tournament round");
            s.RequestParam(r => r.MaximumLevelLength, "The maximum number of seconds the match is expected to end at, which gets used to determine when a match should end when there is no activity");
            s.RequestParam(r => r.CostToPlayType, "The type of ticket required to pay");
            s.RequestParam(r => r.MinimumToPlay, "The minimum number of players required to sign up for the tournament to be played");
            s.RequestParam(r => r.StartingLimit, "The starting number of players for a tournament (filled with AI&#39;s)");
            s.RequestParam(r => r.AvailableLimit, "The maximum number of players for a tournament (currently 128 but not enforced)");
            s.RequestParam(r => r.Description, "The description of the tournament");
            s.RequestParam(r => r.MetaData, "External custom client defined data");
            s.RequestParam(r => r.AudienceIds, "The audiences associated with the tournament");
            s.RequestParam(r => r.Active, "Activate/deactivate the tournament");
            s.RequestParam(r => r.EnableBuyBack, "Determines whether to allow players to buy back into a tournament");
            s.RequestParam(r => r.OfferIds, "The list of offers to give as a reward beyond the tickets");
            s.RequestParam(r => r.OfferAssetId, "The artwork ID to attach to the reward tickets offers");
            s.RequestParam(r => r.FixedReward, "If set then do not update the ticket reward, auto set to true if offerIds provided");
            s.RequestParam(r => r.SplitReward, "Set the rules for handling the reward in case of a tie, values: EVEN split the reward evenly ALL everyone gets the full reward value FIRST first score submitted RANDOM random player who scored");
            s.RequestParam(r => r.AllocateTickets, "Flag to indicate owner should receive tickets for completed missions");
            s.RequestParam(r => r.TournamentData, "A text based string that will be passed into each tournament setup to populate the content");
            s.RequestParam(r => r.MissionType, "The style of tournament to build, options are: TOURNAMENT, POOLPLAY");
            s.RequestParam(r => r.Visibility, "Sets the visibility flag for the tournament");
            s.RequestParam(r => r.PreliminaryGroups, "The number of initial preliminary groups in a multi-stage tournament (this is expected to be a power of two number)");
            s.RequestParam(r => r.PreliminaryGroupAdvancements, "This determines how many people can advance per round in a preliminary group (this is a comma separated list of integers)");
            s.RequestParam(r => r.EnableMultipleEntries, "This determines if multiple submissions/entries are allowed in a multi-stage album tournament");
            s.RequestParam(r => r.EnableMultipleVotes, "This determines if users are allowed to vote multiple times per group in a multi-stage album tournament");
            s.RequestParam(r => r.Featured, "This determines whether the tournament is \&quot;featured\&quot; or not");
            s.RequestParam(r => r.WinnerTag, "This sets what analytic tag is used when a winner is determined");
            s.RequestParam(r => r.TieTag, "This sets what analytic tag is used when a tie has occurred");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateTournamentRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Tournament
/// </summary>

public class DeleteTournamentEndpoint : FastEndpoints.Endpoint<DeleteTournamentRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/tournament/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Tournament");
        });

        Summary(s => {
            s.Summary = "Delete Tournament";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.MissionId, "the id of the mission to delete");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteTournamentRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Tournament
/// </summary>

public class GetTournamentEndpoint : FastEndpoints.Endpoint<GetTournamentRequest, TournamentResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/tournament/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Tournament");
        });

        Summary(s => {
            s.Summary = "Get Tournament";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The id of the logged in user");
            s.RequestParam(r => r.MissionId, "The id of the mission to return (either missionId or joinCode is required)");
            s.RequestParam(r => r.JoinCode, "Optional identifier for getting the tournament (either missionId or joinCode is required)");
            s.RequestParam(r => r.IncludeScores, "Determines which type of scores are returned. Possible values include: ALL, MINE");
            s.RequestParam(r => r.ObjectPreviewSize, "Determines the max number of game objects that will get returned for each game level response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetTournamentRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Tournament Objects
/// </summary>

public class SearchObjectsEndpoint : FastEndpoints.Endpoint<SearchObjectsRequest, SirqulResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/tournament/object/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Tournament");
        });

        Summary(s => {
            s.Summary = "Search Tournament Objects";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the account ID");
            s.RequestParam(r => r.GameLevelId, "the game level id to filter results by");
            s.RequestParam(r => r.SortField, "the field to sort by");
            s.RequestParam(r => r.Descending, "determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Start, "the start index for pagination");
            s.RequestParam(r => r.Limit, "the limit for pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchObjectsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Tournament Rounds
/// </summary>

public class SearchRoundsEndpoint : FastEndpoints.Endpoint<SearchRoundsRequest, SirqulResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/tournament/round/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Tournament");
        });

        Summary(s => {
            s.Summary = "Search Tournament Rounds";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the account ID");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.Status, "comma separated list of statuses to filter results by");
            s.RequestParam(r => r.MissionType, "The style of tournament to search for, options are: TOURNAMENT, POOLPLAY");
            s.RequestParam(r => r.CurrentOnly, "search for games that are flagged current only");
            s.RequestParam(r => r.Visibilities, "Filter tournament rounds by the mission visibility flag");
            s.RequestParam(r => r.Start, "the start index for pagination");
            s.RequestParam(r => r.Limit, "the limit for pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchRoundsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Tournaments
/// </summary>

public class SearchTournamentsEndpoint : FastEndpoints.Endpoint<SearchTournamentsRequest, MissionShortResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/tournament/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Tournament");
        });

        Summary(s => {
            s.Summary = "Search Tournaments";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.AppKey, "The application key");
            s.RequestParam(r => r.Keyword, "the keyword to search tournament on");
            s.RequestParam(r => r.SubType, "filter results by subType");
            s.RequestParam(r => r.IncludeInactive, "whether to include inactives in the search or not");
            s.RequestParam(r => r.MissionTypes, "comma separated list of mission types to filter results, possbile values include: TOURNAMENT, POOLPLAY, MULTISTAGE");
            s.RequestParam(r => r.Filter, "filter tournaments by the tournament&#39;s current state");
            s.RequestParam(r => r.SortField, "which field to sort on");
            s.RequestParam(r => r.Descending, "Determines whether to return results in descending order. The default value will be true if the filter is \&quot;PAST\&quot;, otherwise the default value will be false.");
            s.RequestParam(r => r.Visibility, "Comma separated list of visibility flags for search for, possible values include: PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE");
            s.RequestParam(r => r.Start, "Start the result set at some index.");
            s.RequestParam(r => r.Limit, "Limit the result to some number");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchTournamentsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Submit Tournament Score
/// </summary>

public class SubmitTournamentScoreEndpoint : FastEndpoints.Endpoint<SubmitTournamentScoreRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/tournament/score");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Tournament");
        });

        Summary(s => {
            s.Summary = "Submit Tournament Score";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user account ID.");
            s.RequestParam(r => r.AppKey, "The application key.");
            s.RequestParam(r => r.MissionId, "The missionId to score for");
            s.RequestParam(r => r.GameId, "The gameId to score for");
            s.RequestParam(r => r.PackId, "The packId to score for");
            s.RequestParam(r => r.Scores, "a JSON Array of scores to submit for a tournament match &#x60;&#x60;&#x60;json [   {     \&quot;accountId\&quot;: 2,     \&quot;points\&quot;: 3   },   {     \&quot;accountId\&quot;: 1777662,     \&quot;points\&quot;: 7   } ] &#x60;&#x60;&#x60; ");
            s.RequestParam(r => r.GameLevelId, "The gameLevelId to score for");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SubmitTournamentScoreRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Submit a vote for a multi-stage album tournament.
/// </summary>

public class SubmitTournamentVoteEndpoint : FastEndpoints.Endpoint<SubmitTournamentVoteRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/tournament/vote");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Tournament");
        });

        Summary(s => {
            s.Summary = "Submit a vote for a multi-stage album tournament.";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.AppKey, "The application to target");
            s.RequestParam(r => r.MissionId, "The tournament&#39;s primary id");
            s.RequestParam(r => r.GameObjectId, "The tournament game object the user wants to vote on");
            s.RequestParam(r => r.DeviceId, "The unique id of the device making the request (optional)");
            s.RequestParam(r => r.CheckIfDeviceAlreadyVoted, "When true, check if the device already voted to prevent duplicate votes from the same device");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SubmitTournamentVoteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Substitute Tournament Player
/// </summary>

public class SubstituteTournamentPlayerEndpoint : FastEndpoints.Endpoint<SubstituteTournamentPlayerRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/tournament/substitute");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Tournament");
        });

        Summary(s => {
            s.Summary = "Substitute Tournament Player";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.MissionId, "the id of the mission");
            s.RequestParam(r => r.PackId, "the id of the pack");
            s.RequestParam(r => r.GameLevelId, "the id of the game level");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SubstituteTournamentPlayerRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Tournament
/// </summary>

public class UpdateTournamentEndpoint : FastEndpoints.Endpoint<UpdateTournamentRequest, TournamentResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/tournament/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Tournament");
        });

        Summary(s => {
            s.Summary = "Update Tournament";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.MissionId, "The mission/tournament to update");
            s.RequestParam(r => r.Title, "The title of the tournament");
            s.RequestParam(r => r.SubType, "Custom string client apps can use for searching/filtering missions");
            s.RequestParam(r => r.ImageAssetId, "The asset ID to attach to the tournament");
            s.RequestParam(r => r.SecondsBetweenLevels, "The number of seconds in between the start of each tournament game");
            s.RequestParam(r => r.SecondsForTieBreaker, "The number of seconds to extend the round end time in the case of a tie breaker");
            s.RequestParam(r => r.SecondsBetweenPacks, "The number of seconds in between the start of each tournament round");
            s.RequestParam(r => r.MaximumLevelLength, "The maximum number of seconds the match is expected to end at, which gets used to determine when a match should end when there is no activity");
            s.RequestParam(r => r.CostToPlay, "The number of tickets required to pay to enter the tournament");
            s.RequestParam(r => r.CostToPlayType, "The type of ticket required to pay");
            s.RequestParam(r => r.MinimumToPlay, "The minimum number of players required to sign up for the tournament to be played");
            s.RequestParam(r => r.StartingLimit, "The starting number of players for a tournament (filled with AI&#39;s)");
            s.RequestParam(r => r.AvailableLimit, "The maximum number of players for a tournament (currently 128 but not enforced)");
            s.RequestParam(r => r.Description, "The description of the tournament");
            s.RequestParam(r => r.MetaData, "External custom client defined data");
            s.RequestParam(r => r.StartDate, "The date/time to start the tournament");
            s.RequestParam(r => r.AudienceIds, "The audiences associated with the tournament");
            s.RequestParam(r => r.Active, "Activate/deactivate the mission");
            s.RequestParam(r => r.EnableBuyBack, "Determines whether to allow players to buy back into a tournament");
            s.RequestParam(r => r.OfferIds, "The list of offers to give as a reward beyond the tickets");
            s.RequestParam(r => r.OfferAssetId, "The artwork ID to attach to the reward offer");
            s.RequestParam(r => r.FixedReward, "If set then do not update the ticket reward, auto set to true if offerIds provided");
            s.RequestParam(r => r.SplitReward, "Set the rules for handling the reward in case of a tie, values: EVEN split the reward evenly ALL everyone gets the full reward value FIRST first score submitted RANDOM random player who scored");
            s.RequestParam(r => r.AllocateTickets, "Flag to indicate owner should receive tickets for completed missions");
            s.RequestParam(r => r.TournamentData, "A text based string that will be passed into each tournament setup to populate the content");
            s.RequestParam(r => r.Visibility, "Sets the visibility flag for the tournament");
            s.RequestParam(r => r.PreliminaryGroups, "The number of initial preliminary groups in a multi-stage tournament (this is expected to be a power of two number)");
            s.RequestParam(r => r.PreliminaryGroupAdvancements, "This determines how many people can advance per round in a preliminary group (this is a comma separated list of integers)");
            s.RequestParam(r => r.EnableMultipleEntries, "This determines if multiple submissions/entries are allowed in a multi-stage album tournament");
            s.RequestParam(r => r.EnableMultipleVotes, "This determines if users are allowed to vote multiple times per group in a multi-stage album tournament");
            s.RequestParam(r => r.Featured, "This determines whether the tournament is \&quot;featured\&quot; or not");
            s.RequestParam(r => r.WinnerTag, "This sets what analytic tag is used when a winner is determined");
            s.RequestParam(r => r.TieTag, "This sets what analytic tag is used when a winner is determined");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateTournamentRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

