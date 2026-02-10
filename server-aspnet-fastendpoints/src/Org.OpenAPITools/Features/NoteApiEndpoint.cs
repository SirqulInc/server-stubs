using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Batch Note Operation
/// </summary>

public class BatchOperationEndpoint : FastEndpoints.Endpoint<BatchOperationRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/note/batch");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Note");
        });

        Summary(s => {
            s.Summary = "Batch Note Operation";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.NotableId, "The id of the notable object the batch operation will affect");
            s.RequestParam(r => r.NotableType, "The notable object type (for example ALBUM, ASSET, OFFER, etc.)");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.BatchOperation, "The batch operation to perform (e.g., DELETE_ALL_NOTES_IN_NOTABLE). Optional.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(BatchOperationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Note
/// </summary>

public class CreateNoteEndpoint : FastEndpoints.Endpoint<CreateNoteRequest, NoteResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/note/create");
        
        
        AllowAnonymous();
        AllowFileUploads();AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Note");
        });

        Summary(s => {
            s.Summary = "Create Note";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Comment, "The message the user wishes to leave a comment on");
            s.RequestParam(r => r.DeviceId, "The unique device identifier that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.AccountId, "The unique accountId that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.NotableType, "The notable object type {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, OFFER, OFFER_LOCATION, RETAILER, RETAILER_LOCATION, THEME_DESCRIPTOR}");
            s.RequestParam(r => r.NotableId, "The id of the notable object");
            s.RequestParam(r => r.NoteType, "The custom string defined by the client (used for differentiating various note types)");
            s.RequestParam(r => r.AssetIds, "A comma separated list of asset IDs to add with the note");
            s.RequestParam(r => r.Tags, "search tags");
            s.RequestParam(r => r.PermissionableType, "This is used for sending out group notifications. For example, when someone adds a note to an asset which is also a part of an album, everyone in the album will receive a notification. This is achieved by passing in the permissionable type (in this case \&quot;album\&quot;), and the permissionable id (the album id). Possible types: {ALBUM, ALBUM_CONTEST, GAME_LEVEL, THEME_DESCRIPTOR}");
            s.RequestParam(r => r.PermissionableId, "The id of the permissionable object (for sending group notifications)");
            s.RequestParam(r => r.AppKey, "The application key used to identify the application");
            s.RequestParam(r => r.LocationDescription, "The description of the location");
            s.RequestParam(r => r.Latitude, "The current location of the user");
            s.RequestParam(r => r.Longitude, "The current location of the user");
            s.RequestParam(r => r.MetaData, "External custom client defined data");
            s.RequestParam(r => r.ReceiverAccountIds, "Comma separated list of additional account IDs that will receive the note notifications");
            s.RequestParam(r => r.ReturnFullResponse, "whether to return the full response or not");
            s.RequestParam(r => r.InitializeAsset, "Check true if need to initialize an asset and assign to current note");
            s.RequestParam(r => r.AssetReturnNulls, "Return null fields for asset response when creating an asset");
            s.RequestParam(r => r.AssetAlbumId, "the album the asset will be added to (optional)");
            s.RequestParam(r => r.AssetCollectionId, "the collection ID that the asset is associated with");
            s.RequestParam(r => r.AssetAddToDefaultAlbum, "the default album to add the asset to");
            s.RequestParam(r => r.AssetAddToMediaLibrary, "the media library to add the asset to");
            s.RequestParam(r => r.AssetVersionCode, "the version code of the asset");
            s.RequestParam(r => r.AssetVersionName, "the version name of the asset");
            s.RequestParam(r => r.AssetMetaData, "the meta data of the asset");
            s.RequestParam(r => r.AssetCaption, "the caption of the asset");
            s.RequestParam(r => r.AssetMedia, "the media of the asset");
            s.RequestParam(r => r.AssetMediaUrl, "the media URL of the asset");
            s.RequestParam(r => r.AssetMediaString, "the media string of the asset");
            s.RequestParam(r => r.AssetMediaStringFileName, "the media string file name of the asset");
            s.RequestParam(r => r.AssetMediaStringContentType, "the media string content type of the asset");
            s.RequestParam(r => r.AssetAttachedMedia, "the attached media of the asset");
            s.RequestParam(r => r.AssetAttachedMediaUrl, "the attached media URL of the asset");
            s.RequestParam(r => r.AssetAttachedMediaString, "the attached media string of the asset");
            s.RequestParam(r => r.AssetAttachedMediaStringFileName, "the attached media string file name of the asset");
            s.RequestParam(r => r.AssetAttachedMediaStringContentType, "the attached media string content type of the asset");
            s.RequestParam(r => r.AssetLocationDescription, "the location description for the asset");
            s.RequestParam(r => r.AssetApp, "the application for the asset");
            s.RequestParam(r => r.AssetSearchTags, "the search tags used for the asset");
            s.RequestParam(r => r.AssetLatitude, "the latitude of the asset");
            s.RequestParam(r => r.AssetLongitude, "the longitude of the asset");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateNoteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Note
/// </summary>

public class DeleteNoteEndpoint : FastEndpoints.Endpoint<DeleteNoteRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/note/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Note");
        });

        Summary(s => {
            s.Summary = "Delete Note";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.NoteId, "The ID of the note to delete");
            s.RequestParam(r => r.DeviceId, "The unique device identifier that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.AccountId, "The unique accountId that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.Latitude, "The current location of the user");
            s.RequestParam(r => r.Longitude, "The current location of the user");
            s.RequestParam(r => r.AppKey, "The application key used to identify the application");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteNoteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Note
/// </summary>

public class GetNoteEndpoint : FastEndpoints.Endpoint<GetNoteRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/note/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Note");
        });

        Summary(s => {
            s.Summary = "Get Note";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.NoteId, "the id of the note to get");
            s.RequestParam(r => r.DeviceId, "The unique device identifier that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.AccountId, "The unique accountId that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.ReturnFullResponse, "Determines whether to return the NoteFullResponse for the item");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetNoteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Notes
/// </summary>

public class SearchNotesEndpoint : FastEndpoints.Endpoint<SearchNotesRequest, List<NoteResponse>>
{
    public override void Configure()
    {
        Post("/api/{version}/note/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Note");
        });

        Summary(s => {
            s.Summary = "Search Notes";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.NotableType, "The notable object type {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, OFFER, OFFER_LOCATION, RETAILER, RETAILER_LOCATION, THEME_DESCRIPTOR}");
            s.RequestParam(r => r.NotableId, "The id of the notable object");
            s.RequestParam(r => r.NoteTypes, "Comma separated list of noteType strings to filter results with");
            s.RequestParam(r => r.AppKey, "The application key used to identify the application");
            s.RequestParam(r => r.Keyword, "The keyword used to search");
            s.RequestParam(r => r.FlagCountMinimum, "return items that has flagCount &gt;&#x3D; flagCountMinimum if this is set, return all items, even ones with flagCount &gt;&#x3D; flagThreshold");
            s.RequestParam(r => r.FlagsExceedThreshold, "return items that has flagCount &gt;&#x3D; flagThreshold, which are hidden by default");
            s.RequestParam(r => r.IncludeInactive, "include inactive in the result");
            s.RequestParam(r => r.SortField, "The column to sort the search on");
            s.RequestParam(r => r.Descending, "The order to return the search results");
            s.RequestParam(r => r.ReturnFullResponse, "Determines whether to return the NoteFullResponse for each search item");
            s.RequestParam(r => r.UpdatedSince, "return items that have been updated since this date (time-stamp in milliseconds)");
            s.RequestParam(r => r.UpdatedBefore, "return items that have been updated before this date (time-stamp in milliseconds)");
            s.RequestParam(r => r.Start, "The record to begin the return set on");
            s.RequestParam(r => r.Limit, "The number of records to return");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchNotesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Note
/// </summary>

public class UpdateNoteEndpoint : FastEndpoints.Endpoint<UpdateNoteRequest, NoteResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/note/update");
        
        
        AllowAnonymous();
        AllowFileUploads();AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Note");
        });

        Summary(s => {
            s.Summary = "Update Note";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.NoteId, "The id of the note, used when editing a comment");
            s.RequestParam(r => r.DeviceId, "The unique device identifier that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.AccountId, "The unique accountId that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.Comment, "The message the user wishes to leave a comment on");
            s.RequestParam(r => r.NoteType, "The custom string defined by the client (used for differentiating on various note types)");
            s.RequestParam(r => r.AssetIds, "A comma separated list of asset IDs to add with the note");
            s.RequestParam(r => r.Tags, "search tags");
            s.RequestParam(r => r.PermissionableType, "This is used for sending out group notifications. For example, when someone adds a note to an asset which is also a part of an album, everyone in the album will receive a notification. This is achieved by passing in the permissionable type (in this case \&quot;album\&quot;), and the permissionable id (the album id). Possible types: {ALBUM, ALBUM_CONTEST, GAME_LEVEL, THEME_DESCRIPTOR}");
            s.RequestParam(r => r.PermissionableId, "The id of the permissionable object (for sending group notifications)");
            s.RequestParam(r => r.AppKey, "The application key used to identify the application");
            s.RequestParam(r => r.LocationDescription, "The description of the location");
            s.RequestParam(r => r.Latitude, "The current location of the user");
            s.RequestParam(r => r.Longitude, "The current location of the user");
            s.RequestParam(r => r.MetaData, "meta data to update with the note");
            s.RequestParam(r => r.ReturnFullResponse, "whether to return the full response or not");
            s.RequestParam(r => r.Active, "Sets the active flag for the note");
            s.RequestParam(r => r.UpdateAsset, "main flag for updating asset in note, must set to true if you want to update the note&#39;s asset");
            s.RequestParam(r => r.AssetReturnNulls, "Return null fields for asset response when updating an asset");
            s.RequestParam(r => r.AssetAlbumId, "the album the asset will be added to (optional)");
            s.RequestParam(r => r.AssetCollectionId, "the collection ID that the asset is associated with");
            s.RequestParam(r => r.AssetAddToDefaultAlbum, "the default album to add the asset to");
            s.RequestParam(r => r.AssetAddToMediaLibrary, "the media library to add the asset to");
            s.RequestParam(r => r.AssetVersionCode, "the version code of the asset");
            s.RequestParam(r => r.AssetVersionName, "the version name of the asset");
            s.RequestParam(r => r.AssetMetaData, "the meta data of the asset");
            s.RequestParam(r => r.AssetCaption, "the caption of the asset");
            s.RequestParam(r => r.AssetMedia, "the media of the asset");
            s.RequestParam(r => r.AssetMediaUrl, "the media URL of the asset");
            s.RequestParam(r => r.AssetMediaString, "the media string of the asset");
            s.RequestParam(r => r.AssetMediaStringFileName, "the media string file name of the asset");
            s.RequestParam(r => r.AssetMediaStringContentType, "the media string content type of the asset");
            s.RequestParam(r => r.AssetAttachedMedia, "the attached media of the asset");
            s.RequestParam(r => r.AssetAttachedMediaUrl, "the attached media URL of the asset");
            s.RequestParam(r => r.AssetAttachedMediaString, "the attached media string of the asset");
            s.RequestParam(r => r.AssetAttachedMediaStringFileName, "the attached media string file name of the asset");
            s.RequestParam(r => r.AssetAttachedMediaStringContentType, "the attached media string content type of the asset");
            s.RequestParam(r => r.AssetLocationDescription, "the location description for the asset");
            s.RequestParam(r => r.AssetApp, "the application for the asset");
            s.RequestParam(r => r.AssetSearchTags, "the search tags used for the asset");
            s.RequestParam(r => r.AssetLatitude, "the latitude of the asset");
            s.RequestParam(r => r.AssetLongitude, "the longitude of the asset");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateNoteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

