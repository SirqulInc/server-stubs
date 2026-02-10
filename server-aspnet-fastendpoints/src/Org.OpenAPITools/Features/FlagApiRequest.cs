
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateFlagRequest
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
    /// The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, NOTE, OFFER}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("flagableType")]
    public string FlagableType { get; set; }
    /// <summary>
    /// The flagable object id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("flagableId")]
    public long FlagableId { get; set; }
    /// <summary>
    /// An optional description of why is it being flagged
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("flagDescription")]
    public string? FlagDescription { get; set; }
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
public class DeleteFlagRequest
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
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("itemBeingFlaggedType")]
    public string? ItemBeingFlaggedType { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("itemBeingFlaggedId")]
    public long? ItemBeingFlaggedId { get; set; }
    /// <summary>
    /// The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, OFFER, NOTE}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("flagableType")]
    public string? FlagableType { get; set; }
    /// <summary>
    /// The flagable object id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("flagableId")]
    public long? FlagableId { get; set; }
}
public class GetFlagRequest
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
    /// The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, NOTE, OFFER}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("flagableType")]
    public string FlagableType { get; set; }
    /// <summary>
    /// The flagable object id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("flagableId")]
    public long FlagableId { get; set; }
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
public class GetFlagThresholdRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, OFFER, NOTE}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("itemBeingFlaggedType")]
    public string ItemBeingFlaggedType { get; set; }
    /// <summary>
    /// The application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
}
public class UpdateFlagThresholdRequest
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
    /// The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, OFFER, NOTE}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("itemBeingFlaggedType")]
    public string ItemBeingFlaggedType { get; set; }
    /// <summary>
    /// The threshold value
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("threshold")]
    public long Threshold { get; set; }
    /// <summary>
    /// The application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
}


