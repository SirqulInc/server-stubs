
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class RegisterLikeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique device identifier that made the request (either deviceId or accountId must be used)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The unique accountId that made the request (either deviceId or accountId must be used)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The type of likable object {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, NOTE, THEME_DESCRIPTOR}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("likableType")]
    public string LikableType { get; set; }
    /// <summary>
    /// The id of the likable object
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("likableId")]
    public long LikableId { get; set; }
    /// <summary>
    /// This is used for sending out group notifications. For example, when someone likes an asset which is also a part of an album, everyone in the album will receive a notification. This is achieved by passing in the permissionable type (in this case \&quot;album\&quot;), and the permissionable id (the album id). Possible types: {ALBUM, ALBUM_CONTEST, GAME_LEVEL, THEME_DESCRIPTOR}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("permissionableType")]
    public string? PermissionableType { get; set; }
    /// <summary>
    /// The id of the permissionable object (for sending group notifications)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("permissionableId")]
    public long? PermissionableId { get; set; }
    /// <summary>
    /// determines whether the user likes or dislikes the object
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("like")]
    public bool? Like { get; set; }
    /// <summary>
    /// This parameter is deprecated. This is deprecated, use \&quot;appKey\&quot; instead.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("app")]
    public string? App { get; set; }
    /// <summary>
    /// This parameter is deprecated. This is deprecated, use \&quot;appKey\&quot; instead.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The current location of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The current location of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class RemoveLikeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique device identifier that made the request (either deviceId or accountId must be used)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The unique accountId that made the request (either deviceId or accountId must be used)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The type of the likable object {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, NOTE, THEME_DESCRIPTOR}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("likableType")]
    public string LikableType { get; set; }
    /// <summary>
    /// The id of the likable object
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("likableId")]
    public long LikableId { get; set; }
    /// <summary>
    /// The current location of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The current location of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class SearchLikesRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique device identifier that made the request (either deviceId or accountId must be used)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The unique accountId that made the request (either deviceId or accountId must be used)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// Comma separated list of account IDs for filtering on users
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountIds")]
    public string? ConnectionAccountIds { get; set; }
    /// <summary>
    /// The type of the likable object {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, NOTE, THEME_DESCRIPTOR}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("likableType")]
    public string LikableType { get; set; }
    /// <summary>
    /// The id of the likable object
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("likableId")]
    public long LikableId { get; set; }
    /// <summary>
    /// The field to sort by. Possible values include: ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// Determines whether the sorted list is in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// return items that have been updated since this date (time-stamp in milliseconds)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("updatedSince")]
    public long? UpdatedSince { get; set; }
    /// <summary>
    /// return items that have been updated before this date (time-stamp in milliseconds)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("updatedBefore")]
    public long? UpdatedBefore { get; set; }
    /// <summary>
    /// the start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// the limit for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}


