using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Album
/// </summary>

public class AddAlbumCollectionEndpoint : FastEndpoints.Endpoint<AddAlbumCollectionRequest, SearchResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/album/create");
        
        
        AllowAnonymous();
        AllowFileUploads();AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Album");
        });

        Summary(s => {
            s.Summary = "Create Album";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Title, "the title of the album");
            s.RequestParam(r => r.CoverAssetNullable, "determines whether the cover image of the album can be empty, else will use the user&#39;s profile picture as the cover image");
            s.RequestParam(r => r.IncludeCoverInAssetList, "determines whether the cover image should be added to the album asset list");
            s.RequestParam(r => r.PublicRead, "determines whether the album&#39;s participants has read permissions");
            s.RequestParam(r => r.PublicWrite, "determines whether the album&#39;s participants has write permissions");
            s.RequestParam(r => r.PublicDelete, "determines whether the album&#39;s participants has delete permissions");
            s.RequestParam(r => r.PublicAdd, "determines whether the album&#39;s participants has add permissions");
            s.RequestParam(r => r.Anonymous, "determines whether the album is posted anonymously");
            s.RequestParam(r => r.DeviceId, "a unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.AssetsToAdd, "Comma separated list of asset IDs to add to the album&#39;s asset list (use \&quot;assetId\&quot; for setting the cover of the album)");
            s.RequestParam(r => r.Media, "a MultipartFile containing the cover image of the album (this will only be used if \&quot;assetId\&quot; is empty)");
            s.RequestParam(r => r.MediaURL, "this can be used if the \&quot;media\&quot; is a link (this will only be used if \&quot;assetId\&quot; and media are empty)");
            s.RequestParam(r => r.AssetId, "The asset ID to set the album cover image");
            s.RequestParam(r => r.AttachedMedia, "a MultipartFile containing an asset that the \&quot;media\&quot; file references. Example to upload a video: the \&quot;media\&quot; file should contain a screen capture of the video, and the \&quot;attachedMedia\&quot; should be the actual video.");
            s.RequestParam(r => r.AttachedMediaURL, "this can be used if the \&quot;attachedMedia\&quot; is a link (i.e. a Youtube video, etc)");
            s.RequestParam(r => r.StartDate, "the start date");
            s.RequestParam(r => r.EndDate, "the end date");
            s.RequestParam(r => r.Tags, "the tags");
            s.RequestParam(r => r.Description, "the description of the album");
            s.RequestParam(r => r.AlbumType, "a custom field used for aggregation and searching");
            s.RequestParam(r => r.AlbumTypeId, "a custom indexed number used for aggregation and searching");
            s.RequestParam(r => r.SubType, "a custom string field used for aggregation and searching");
            s.RequestParam(r => r.Latitude, "latitude used to update the album&#39;s location");
            s.RequestParam(r => r.Longitude, "longitude used to update the album&#39;s location");
            s.RequestParam(r => r.LocationDescription, "the location description");
            s.RequestParam(r => r.Visibility, "the determines the album&#39;s participants (PUBLIC - includes everyone in the system as a potential participant, PRIVATE - only considers people who have been invited as participants)");
            s.RequestParam(r => r.GameType, "@deprecated, use the appKey");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.CellPhone, "the cell phone number");
            s.RequestParam(r => r.StreetAddress, "The street address of the location");
            s.RequestParam(r => r.StreetAddress2, "Additional address information (such as a suite number, floor number, building name, or PO Box)");
            s.RequestParam(r => r.City, "The city of the location");
            s.RequestParam(r => r.State, "The state of of the location");
            s.RequestParam(r => r.PostalCode, "The postal code of the location");
            s.RequestParam(r => r.FullAddress, "The full address of the location which should include the street address, city, state, and postal code");
            s.RequestParam(r => r.MetaData, "External custom client defined data");
            s.RequestParam(r => r.CategoryIds, "comma separated category ids string associated with the Album");
            s.RequestParam(r => r.CategoryFilterIds, "comma separated filter ids string associated with the Album");
            s.RequestParam(r => r.AudienceIds, "comma separated audience ids string associated with the album");
            s.RequestParam(r => r.IncludeAllAppUsersAsMembers, "determines whether to include all app users as members (only admins of the app can do this)");
            s.RequestParam(r => r.IncludeAudiencesAsMembers, "determines whether to include all users of the audiences as members (only admins of the app can do this)");
            s.RequestParam(r => r.AudienceOperator, "determines whether to use ands or ors when using the audience list to add users");
            s.RequestParam(r => r.ApprovalStatus, "The approval status to set {PENDING, REJECTED, APPROVED, FEATURED}");
            s.RequestParam(r => r.LinkedObjectType, "sets a linked object so that it can be returned as part of the album response");
            s.RequestParam(r => r.LinkedObjectId, "sets a linked object id so that it can be returned as part of the album response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AddAlbumCollectionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Add Album Users
/// </summary>

public class AddAlbumUsersEndpoint : FastEndpoints.Endpoint<AddAlbumUsersRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/album/user/add");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Album");
        });

        Summary(s => {
            s.Summary = "Add Album Users";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AlbumId, "the album ID");
            s.RequestParam(r => r.IncludeFriendGroup, "determines whether to include all friends as participants");
            s.RequestParam(r => r.DeviceId, "a unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Read, "determines whether the users being added have read permissions");
            s.RequestParam(r => r.Write, "determines whether the users being added have write permissions");
            s.RequestParam(r => r.Delete, "determines whether the users being added have delete permissions");
            s.RequestParam(r => r.Add, "determines whether the users being added have add permissions");
            s.RequestParam(r => r.Connections, "comma separated list of connection IDs");
            s.RequestParam(r => r.ConnectionGroups, "comma separated list of connection group IDs");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AddAlbumUsersRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Approve Album
/// </summary>

public class ApproveAlbumEndpoint : FastEndpoints.Endpoint<ApproveAlbumRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/album/approve");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Album");
        });

        Summary(s => {
            s.Summary = "Approve Album";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AlbumId, "The ID of the album");
            s.RequestParam(r => r.DeviceId, "A unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.ApprovalStatus, "The approval status to set {PENDING, REJECTED, APPROVED, FEATURED}");
            s.RequestParam(r => r.Verified, "Sets whether the album should be marked as \&quot;verified\&quot;");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ApproveAlbumRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
///  Get Album
/// </summary>

public class GetAlbumCollectionEndpoint : FastEndpoints.Endpoint<GetAlbumCollectionRequest, AlbumFullResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/album/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Album");
        });

        Summary(s => {
            s.Summary = " Get Album";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ReturnNulls, "This parameter is deprecated.");
            s.RequestParam(r => r.AlbumId, "the album to look up");
            s.RequestParam(r => r.DeviceId, "a unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.LikePreviewSize, "returns the last X likes. To search on and paginate the remaining likes - please use the \&quot;/like/search\&quot;Â endpoint.");
            s.RequestParam(r => r.AssetPreviewSize, "returns the first X assets. To search on and paginate the remaining assets - please use the \&quot;/assets/search\&quot;Â endpoint.");
            s.RequestParam(r => r.NotePreviewSize, "returns the last X notes. To search on and paginate the remaining notes - please use the \&quot;/note/search\&quot; endpoint.");
            s.RequestParam(r => r.ConnectionPreviewSize, "returns the first X users/connections. To search on and paginate the remaining connections - please use the \&quot;/permissions/search\&quot; endpoint.");
            s.RequestParam(r => r.AudiencePreviewSize, "returns the first X audiences. To search on and paginate the remaining audiences - please use the \&quot;/audience/search\&quot; endpoint.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetAlbumCollectionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Leave Album
/// </summary>

public class LeaveAlbumEndpoint : FastEndpoints.Endpoint<LeaveAlbumRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/album/user/leave");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Album");
        });

        Summary(s => {
            s.Summary = "Leave Album";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AlbumId, "the album ID");
            s.RequestParam(r => r.DeviceId, "a unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account ID of the user (deviceId or accountId required)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(LeaveAlbumRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Album
/// </summary>

public class RemoveAlbumEndpoint : FastEndpoints.Endpoint<RemoveAlbumRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/album/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Album");
        });

        Summary(s => {
            s.Summary = "Delete Album";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AlbumId, "the album ID to delete");
            s.RequestParam(r => r.DeviceId, "a unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account ID of the user (deviceId or accountId required)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(RemoveAlbumRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Remove Album Users
/// </summary>

public class RemoveAlbumUsersEndpoint : FastEndpoints.Endpoint<RemoveAlbumUsersRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/album/user/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Album");
        });

        Summary(s => {
            s.Summary = "Remove Album Users";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AlbumId, "the album ID");
            s.RequestParam(r => r.RemoveFriendGroup, "remove friend group");
            s.RequestParam(r => r.DeviceId, "a unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Connections, "comma separated list of connection IDs");
            s.RequestParam(r => r.ConnectionGroups, "comma separated list of connection group IDs");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(RemoveAlbumUsersRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Albums
/// </summary>

public class SearchAlbumsEndpoint : FastEndpoints.Endpoint<SearchAlbumsRequest, List<AlbumFullResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/album/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Album");
        });

        Summary(s => {
            s.Summary = "Search Albums";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Filter, "a comma separated list of filters: * MINE - Return albums that the user has created. * SHARED - Return albums that have been shared to the user via addAlbumUsers, or addUsersToPermissionable . * FOLLOWER - Return albums that have been created by the user&#39;s followers (the content needs to have been APPROVED or FEATURED). * FOLLOWING - Return albums that have been created by people who the user is following (the content needs to have been APPROVED or FEATURED). * PUBLIC - Return all PUBLIC albums that have been APPROVED or FEATURED. * ALL_PUBLIC - Return all PUBLIC albums regardless of whether they are approved or not (ignores the approval status). * LIKED - Return all albums that the user has liked. * FEATURED - Return all albums that have been featured. * PENDING - Return all pending albums. ");
            s.RequestParam(r => r.AlbumTypeId, "id of custom albumType");
            s.RequestParam(r => r.SubType, "filter albums with this album sub type");
            s.RequestParam(r => r.IncludeInactive, "determines whether to return inactive albums");
            s.RequestParam(r => r.SortField, "the field to sort by. See AlbumApiMap");
            s.RequestParam(r => r.Descending, "determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Start, "the start index for pagination");
            s.RequestParam(r => r.Limit, "the limit for pagination (There is a hard limit of 100)");
            s.RequestParam(r => r.Range, "the maximum range the album can be from the center (used when sortField&#x3D;ALBUM_DISTANCE)");
            s.RequestParam(r => r.IncludeLiked, "returns whether or not the current logged in user has liked the album");
            s.RequestParam(r => r.IncludeFavorited, "returns whether or not the current logged in user has favorited the album");
            s.RequestParam(r => r.IncludePermissions, "returns permission details on whether they have read/write/delete permissions etc (client app probably doesn&#39;t need this)");
            s.RequestParam(r => r.LikePreviewSize, "returns the last X likes");
            s.RequestParam(r => r.AssetPreviewSize, "returns the first X assets");
            s.RequestParam(r => r.NotePreviewSize, "returns the last X notes");
            s.RequestParam(r => r.ConnectionPreviewSize, "returns the first X users/connections");
            s.RequestParam(r => r.AudiencePreviewSize, "returns the first X audiences. To search on and paginate the remaining audiences, please use the \&quot;/audience/search\&quot; endpoint.");
            s.RequestParam(r => r.DeviceId, "a unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.ConnectionAccountId, "the account ID of the user that the results will be based on. This is used to return albums that this account has liked/favorited.");
            s.RequestParam(r => r.OwnerId, "search on albums that have been created by this account (that the user has permissions to)");
            s.RequestParam(r => r.AlbumIds, "search on album within a comma separated list of album IDs (this does not work with sortField&#x3D;ALBUM_DISTANCE, or when stackSearch&#x3D;true)");
            s.RequestParam(r => r.ExcludeAlbumIds, "Only for CLOUDINDEX mode, exclude albums with ids matching this list");
            s.RequestParam(r => r.MediaId, "search on albums that are in a particular media offering");
            s.RequestParam(r => r.Keyword, "keyword search string");
            s.RequestParam(r => r.AlbumType, "filter albums with this album type");
            s.RequestParam(r => r.LimitPerAlbumType, "When using multiple album types this sets a per-album-type limit (used with cloud index mode)");
            s.RequestParam(r => r.DateCreated, "return items that have been created before this date (time-stamp in milliseconds)");
            s.RequestParam(r => r.UpdatedSince, "return items that have been updated since this date (time-stamp in milliseconds)");
            s.RequestParam(r => r.UpdatedBefore, "return items that have been updated before this date (time-stamp in milliseconds)");
            s.RequestParam(r => r.CreatedSince, "return items that have been created since this date (time-stamp in milliseconds)");
            s.RequestParam(r => r.CreatedBefore, "return items that have been created before this date (time-stamp in milliseconds)");
            s.RequestParam(r => r.StartedSince, "return items that have been started since this date (time-stamp in milliseconds)");
            s.RequestParam(r => r.StartedBefore, "return items that have been started before this date (time-stamp in milliseconds)");
            s.RequestParam(r => r.EndedSince, "return items that have been ended since this date (time-stamp in milliseconds)");
            s.RequestParam(r => r.EndedBefore, "return items that have been ended before this date (time-stamp in milliseconds)");
            s.RequestParam(r => r.Latitude, "the latitude of where the search is centered on (used when sortField&#x3D;ALBUM_DISTANCE)");
            s.RequestParam(r => r.Longitude, "the longitude of where the search is centered on (used when sortField&#x3D;ALBUM_DISTANCE)");
            s.RequestParam(r => r.AppKey, "the application key to filter results by application. This is required for consumer searches. Leaving this empty will return albums for the applications that the logged in user owns or has access to.");
            s.RequestParam(r => r.CategoryIds, "return results with categories matching this list");
            s.RequestParam(r => r.CategoryFilterIds, "return results with filters matching this list");
            s.RequestParam(r => r.AudienceIds, "return results with audiences matching this list");
            s.RequestParam(r => r.ExcludeAudienceIds, "exclude audiences with ids matching this list");
            s.RequestParam(r => r.IncludeCompletable, "returns the user&#39;s completable object for the album if it exists");
            s.RequestParam(r => r.IncludeRating, "returns the user&#39;s rating for the album if it exists");
            s.RequestParam(r => r.SearchMode, "The search index mode to use (RDS, LUCENE, or CLOUDINDEX). If not provided will use server default.");
            s.RequestParam(r => r.StackSearch, "groups similar albums together that have the same albumTypeId, within a time window defined in stackWindowSize");
            s.RequestParam(r => r.StackWindowSize, "size of each window for each stack");
            s.RequestParam(r => r.MinStackPerPage, "The minimum number of stacks returned in a response. For example,  first call, minStackPerPage &#x3D; 20, the API will return at least 20 results");
            s.RequestParam(r => r.StackPaginationIdentifier, "this is used to tell the system where it left off on the previous previous page, since we can&#39;t use start/limit for stackSearch");
            s.RequestParam(r => r.StackDetails, "set this to true when making the call to view the albums in the stack");
            s.RequestParam(r => r.FlagCountMinimum, "Return any results that have a minimum of the specified flag count (even ones that have met the flag threshold)");
            s.RequestParam(r => r.RemoveFlaggedContent, "return items that have flagCount &gt;&#x3D; flagThreshold (controls removal of flagged content)");
            s.RequestParam(r => r.VerifiedFilter, "setting to true will return only verified albums only, setting to false will return non-verified albums only (leave empty to return both)");
            s.RequestParam(r => r.LinkedObjectType, "filter results by the linkedObjectType");
            s.RequestParam(r => r.LinkedObjectId, "filter results by the linkedObjectId");
            s.RequestParam(r => r.OrderAudienceId, "determines whether to use the order assigned via the /album/order/_* api (which is tied to an audience)");
            s.RequestParam(r => r.IgnoreDefaultAppFilter, "if true, ignore the application&#39;s default app filter when searching");
            s.RequestParam(r => r.SearchExpression, "Advanced search expression to be used by the server");
            s.RequestParam(r => r.GenerateAlbums, "If true and results are empty, attempt to generate albums via templates");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchAlbumsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Album
/// </summary>

public class UpdateAlbumCollectionEndpoint : FastEndpoints.Endpoint<UpdateAlbumCollectionRequest, AlbumResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/album/update");
        
        
        AllowAnonymous();
        AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Album");
        });

        Summary(s => {
            s.Summary = "Update Album";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AlbumId, "the ID of the album to update");
            s.RequestParam(r => r.DeviceId, "a unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.AssetsToAdd, "Comma separated list of asset IDs to add to the album&#39;s asset list (use \&quot;assetId\&quot; for setting the cover of the album)");
            s.RequestParam(r => r.AssetsToRemove, "Comma separated list of asset IDs to remove from the album&#39;s asset list");
            s.RequestParam(r => r.AssetId, "the cover asset ID");
            s.RequestParam(r => r.Media, "a MultipartFile containing the cover image of the album (this will only be used if \&quot;assetId\&quot; is empty)");
            s.RequestParam(r => r.MediaURL, "this can be used if the \&quot;media\&quot; is a link (this will only be used if \&quot;assetId\&quot; and media are empty)");
            s.RequestParam(r => r.Active, "determines whether the album is active or inactive");
            s.RequestParam(r => r.Title, "the title of the album");
            s.RequestParam(r => r.StartDate, "the start date");
            s.RequestParam(r => r.EndDate, "the end date");
            s.RequestParam(r => r.Tags, "the tags");
            s.RequestParam(r => r.Description, "the description of the album");
            s.RequestParam(r => r.AlbumType, "a custom field used for aggregation and searching");
            s.RequestParam(r => r.AlbumTypeId, "a custom indexed number used for aggregation and searching");
            s.RequestParam(r => r.SubType, "a custom string field used for aggregation and searching");
            s.RequestParam(r => r.PublicRead, "determines whether the album&#39;s participants have read permissions");
            s.RequestParam(r => r.PublicWrite, "determines whether the album&#39;s participants have write permissions");
            s.RequestParam(r => r.PublicDelete, "determines whether the album&#39;s participants have delete permissions");
            s.RequestParam(r => r.PublicAdd, "determines whether the album&#39;s participants have add permissions");
            s.RequestParam(r => r.Latitude, "latitude used to update the album&#39;s location");
            s.RequestParam(r => r.Longitude, "longitude used to update the album&#39;s location");
            s.RequestParam(r => r.LocationDescription, "the location description");
            s.RequestParam(r => r.Visibility, "the determines the album&#39;s participants (PUBLIC - includes everyone in the system as a potential participant, PRIVATE - only considers people who have been invited as participants)");
            s.RequestParam(r => r.CellPhone, "the cell phone number");
            s.RequestParam(r => r.StreetAddress, "The street address of the location");
            s.RequestParam(r => r.StreetAddress2, "Additional address information (such as a suite number, floor number, building name, or PO Box)");
            s.RequestParam(r => r.City, "The city of the location");
            s.RequestParam(r => r.State, "The state of of the location");
            s.RequestParam(r => r.PostalCode, "The postal code of the location");
            s.RequestParam(r => r.FullAddress, "The full address of the location which should include the street address, city, state, and postal code");
            s.RequestParam(r => r.Anonymous, "determines whether the album is posted anonymously");
            s.RequestParam(r => r.MetaData, "External custom client defined data");
            s.RequestParam(r => r.CategoryIds, "comma separated category ids string associated with the Album");
            s.RequestParam(r => r.CategoryFilterIds, "comma separated filter ids string associated with the Album");
            s.RequestParam(r => r.AudienceIds, "comma separated audience ids string associated with the album");
            s.RequestParam(r => r.AudienceIdsToAdd, "comma separated audience ids to add to the album");
            s.RequestParam(r => r.AudienceIdsToRemove, "comma separated audience ids to remove from the album (overrides audienceIds and audienceIdsToAdd)");
            s.RequestParam(r => r.IncludeAllAppUsersAsMembers, "determines whether to include all app users as members (only admins of the app can do this)");
            s.RequestParam(r => r.IncludeAudiencesAsMembers, "determines whether to include all users of the audiences as members (only admins of the app can do this)");
            s.RequestParam(r => r.AudienceOperator, "determines whether to use ands or ors when using the audience list to add users");
            s.RequestParam(r => r.LinkedObjectType, "sets a linked object so that it can be returned as part of the album response");
            s.RequestParam(r => r.LinkedObjectId, "sets a linked object id so that it can be returned as part of the album response");
            s.RequestParam(r => r.IndexNow, "determines whether the album should be indexed immediately");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateAlbumCollectionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

