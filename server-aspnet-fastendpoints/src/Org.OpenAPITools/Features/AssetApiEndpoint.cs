using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Download Asset
/// </summary>

public class AssetDownloadEndpoint : FastEndpoints.Endpoint<AssetDownloadRequest, SirqulResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/asset/download/{filename}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Asset");
        });

        Summary(s => {
            s.Summary = "Download Asset";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Filename, "the filename in the following formats: {assetId}-{suffix}.{extension} | {assetId}.{extension} | {assetId}");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AssetDownloadRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Convert Offer to Creative
/// </summary>

public class AssetMorphEndpoint : FastEndpoints.Endpoint<AssetMorphRequest, AssetShortResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/asset/morph");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Asset");
        });

        Summary(s => {
            s.Summary = "Convert Offer to Creative";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.OfferId, "offer id used for inserting offer text/flavor");
            s.RequestParam(r => r.AdSize, "the ad size used for selecting a format for the creative image");
            s.RequestParam(r => r.CreativeId, "used for inserting the newly created image into");
            s.RequestParam(r => r.Width, "total width of the creative image");
            s.RequestParam(r => r.Height, "total height of the creative image");
            s.RequestParam(r => r.BackgroundSize, "the size of the background");
            s.RequestParam(r => r.Template, "the template to use");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AssetMorphRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Asset
/// </summary>

public class CreateAssetEndpoint : FastEndpoints.Endpoint<CreateAssetRequest, AssetResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/asset/create");
        
        
        AllowAnonymous();
        AllowFileUploads();AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Asset");
        });

        Summary(s => {
            s.Summary = "Create Asset";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ReturnNulls, "to return nulls");
            s.RequestParam(r => r.DeviceId, "a unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.AlbumId, "the album the asset will be added to (optional)");
            s.RequestParam(r => r.CollectionId, "Deprecated: use collections via the collection endpoints.");
            s.RequestParam(r => r.AddToDefaultAlbum, "Whether to add to a default album");
            s.RequestParam(r => r.AddToMediaLibrary, "Whether to add to the media library");
            s.RequestParam(r => r.VersionCode, "the version code");
            s.RequestParam(r => r.VersionName, "the version name");
            s.RequestParam(r => r.MetaData, "External custom client defined data");
            s.RequestParam(r => r.Caption, "the caption (optional)");
            s.RequestParam(r => r.AssetType, "the asset type");
            s.RequestParam(r => r.ApprovalStatus, "approval status for the asset");
            s.RequestParam(r => r.AssignedAccountId, "account id assigned to the asset");
            s.RequestParam(r => r.Media, "a MultipartFile containing the mimetype, etc");
            s.RequestParam(r => r.MediaUrl, "this can be used if the \&quot;media\&quot; is a link (optional)");
            s.RequestParam(r => r.MediaString, "the media content as a string (optional)");
            s.RequestParam(r => r.MediaStringFileName, "file name for mediaString (optional)");
            s.RequestParam(r => r.MediaStringContentType, "content type for mediaString (optional)");
            s.RequestParam(r => r.MediaHeight, "the media height (optional)");
            s.RequestParam(r => r.MediaWidth, "the media width (optional)");
            s.RequestParam(r => r.AttachedMedia, "a MultipartFile containing an asset that the \&quot;media\&quot; file references (optional). Example: to upload a video the \&quot;media\&quot; file should contain a screen capture and the \&quot;attachedMedia\&quot; should be the actual video.");
            s.RequestParam(r => r.AttachedMediaUrl, "this can be used if the \&quot;attachedMedia\&quot; is a link (i.e. a Youtube video, etc) (optional)");
            s.RequestParam(r => r.AttachedMediaString, "attached media content as a string (optional)");
            s.RequestParam(r => r.AttachedMediaStringFileName, "file name for attachedMediaString (optional)");
            s.RequestParam(r => r.AttachedMediaStringContentType, "content type for attachedMediaString (optional)");
            s.RequestParam(r => r.AttachedMediaHeight, "the attached media height (optional)");
            s.RequestParam(r => r.AttachedMediaWidth, "the attached media width (optional)");
            s.RequestParam(r => r.LocationDescription, "the location description (optional)");
            s.RequestParam(r => r.App, "Deprecated: app parameter");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.SearchTags, "the search tags");
            s.RequestParam(r => r.Latitude, "the latitude (optional)");
            s.RequestParam(r => r.Longitude, "the longitude (optional)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateAssetRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Asset
/// </summary>

public class DeleteAssetEndpoint : FastEndpoints.Endpoint<DeleteAssetRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/asset/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Asset");
        });

        Summary(s => {
            s.Summary = "Delete Asset";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AssetId, "the id of the asset to delete");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Latitude, "latitude used to update the user&#39;s current location");
            s.RequestParam(r => r.Longitude, "longitude used to update the user&#39;s current location");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteAssetRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Asset
/// </summary>

public class GetAssetEndpoint : FastEndpoints.Endpoint<GetAssetRequest, AssetFullResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/asset/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Asset");
        });

        Summary(s => {
            s.Summary = "Get Asset";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AssetId, "the asset ID");
            s.RequestParam(r => r.DeviceId, "a unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.NoteDescending, "determines whether the notes on the asset are in descending order");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetAssetRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Remove Asset from Collection
/// </summary>

public class RemoveAssetEndpoint : FastEndpoints.Endpoint<RemoveAssetRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/asset/remove");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Asset");
        });

        Summary(s => {
            s.Summary = "Remove Asset from Collection";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AssetId, "the id of the asset to remove");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.AlbumId, "the album id to remove the asset from");
            s.RequestParam(r => r.CollectionId, "the collection id to remove the asset from");
            s.RequestParam(r => r.RemoveFromDefaultAlbums, "remove from the user&#39;s profile album");
            s.RequestParam(r => r.Latitude, "latitude used to update the user&#39;s current location");
            s.RequestParam(r => r.Longitude, "longitude used to update the user&#39;s current location");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(RemoveAssetRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Assets
/// </summary>

public class SearchAssetsEndpoint : FastEndpoints.Endpoint<SearchAssetsRequest, List<AssetResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/asset/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Asset");
        });

        Summary(s => {
            s.Summary = "Search Assets";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "a unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.AlbumIds, "comma separated list of album ids to search on");
            s.RequestParam(r => r.AssetIds, "comma separated list of asset ids to search on");
            s.RequestParam(r => r.AppKey, "the application key to filter results by application.");
            s.RequestParam(r => r.MediaType, "filter results by media type. Possible values include: APPLICATION, IMAGE, AUDIO, VIDEO, MULTIPART, TEXT");
            s.RequestParam(r => r.MimeType, "filter results by mime type");
            s.RequestParam(r => r.Keyword, "keyword search string");
            s.RequestParam(r => r.VersionCode, "filter results by version code");
            s.RequestParam(r => r.VersionName, "filter results by version name");
            s.RequestParam(r => r.UpdatedSince, "return items that have been updated since this date (time-stamp in milliseconds)");
            s.RequestParam(r => r.UpdatedBefore, "return items that have been updated before this date (time-stamp in milliseconds)");
            s.RequestParam(r => r.SortField, "the field to sort by. See AssetApiMap");
            s.RequestParam(r => r.Descending, "determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.SearchMediaLibrary, "determines whether to search on the media library album");
            s.RequestParam(r => r.FilterByBillable, "filter results by billable entity");
            s.RequestParam(r => r.ActiveOnly, "if only searching for active assets");
            s.RequestParam(r => r.ReturnApp, "determines whether to include the application response as part of the asset response");
            s.RequestParam(r => r.Start, "the start index for pagination");
            s.RequestParam(r => r.Limit, "the limit for pagination (there is a hard limit of 200)");
            s.RequestParam(r => r.SearchMode, "search mode for index (SearchIndexMode)");
            s.RequestParam(r => r.AssetType, "filter by asset type");
            s.RequestParam(r => r.ApprovalStatus, "filter by approval status");
            s.RequestParam(r => r.AssignedAccountId, "filter results by an assigned account id");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchAssetsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Asset
/// </summary>

public class UpdateAssetEndpoint : FastEndpoints.Endpoint<UpdateAssetRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/asset/update");
        
        
        AllowAnonymous();
        AllowFileUploads();AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Asset");
        });

        Summary(s => {
            s.Summary = "Update Asset";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AssetId, "the ID of the asset to update");
            s.RequestParam(r => r.DeviceId, "a unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.AlbumId, "the ID of the album to check user permissions");
            s.RequestParam(r => r.AttachedAssetId, "the ID of the attached asset");
            s.RequestParam(r => r.VersionCode, "the version code");
            s.RequestParam(r => r.VersionName, "the version name");
            s.RequestParam(r => r.MetaData, "External custom client defined data");
            s.RequestParam(r => r.Caption, "the caption");
            s.RequestParam(r => r.AssetType, "the asset type");
            s.RequestParam(r => r.ApprovalStatus, "approval status for the asset");
            s.RequestParam(r => r.AssignedAccountId, "account id assigned to the asset");
            s.RequestParam(r => r.Media, "a MultipartFile containing the mimetype, etc");
            s.RequestParam(r => r.MediaUrl, "this can be used if the \&quot;media\&quot; is a link (optional)");
            s.RequestParam(r => r.MediaString, "the media content as a string (optional)");
            s.RequestParam(r => r.MediaStringFileName, "file name for mediaString (optional)");
            s.RequestParam(r => r.MediaStringContentType, "content type for mediaString (optional)");
            s.RequestParam(r => r.MediaHeight, "the media height (optional)");
            s.RequestParam(r => r.MediaWidth, "the media width (optional)");
            s.RequestParam(r => r.AttachedMedia, "a MultipartFile containing an asset that the \&quot;media\&quot; file references (optional). Example: to upload a video the \&quot;media\&quot; file should contain a screen capture and the \&quot;attachedMedia\&quot; should be the actual video.");
            s.RequestParam(r => r.AttachedMediaUrl, "this can be used if the \&quot;attachedMedia\&quot; is a link (i.e. a Youtube video, etc) (optional)");
            s.RequestParam(r => r.AttachedMediaString, "attached media content as a string (optional)");
            s.RequestParam(r => r.AttachedMediaStringFileName, "file name for attachedMediaString (optional)");
            s.RequestParam(r => r.AttachedMediaStringContentType, "content type for attachedMediaString (optional)");
            s.RequestParam(r => r.AttachedMediaHeight, "the attached media height (optional)");
            s.RequestParam(r => r.AttachedMediaWidth, "the attached media width (optional)");
            s.RequestParam(r => r.LocationDescription, "the location description");
            s.RequestParam(r => r.SearchTags, "search tags");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.Latitude, "latitude used to update the asset&#39;s location");
            s.RequestParam(r => r.Longitude, "longitude used to update the asset&#39;s location");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateAssetRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

