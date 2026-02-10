
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateApplicationConfigRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account ID of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The application key that the newly created applicationConfig will be associated to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The application configuration, has to be unique within the application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("configVersion")]
    public string ConfigVersion { get; set; }
    /// <summary>
    /// The json assetId that stores the configuration detail.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetId")]
    public long AssetId { get; set; }
    /// <summary>
    /// The retailer id for retailer specific configurations
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerId")]
    public long? RetailerId { get; set; }
    /// <summary>
    /// The retailer location id for retailer location specific configurations
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationId")]
    public long? RetailerLocationId { get; set; }
    /// <summary>
    /// The device udid for device specific configurations
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("udid")]
    public string? Udid { get; set; }
}
public class DeleteApplicationConfigRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account ID of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The config ID of the application configuration to delete
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("configId")]
    public long ConfigId { get; set; }
}
public class GetApplicationConfigRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account ID of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The config ID of the application configuration
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("configId")]
    public long ConfigId { get; set; }
}
public class GetApplicationConfigByConfigVersionRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The version of the application configuration
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("configVersion")]
    public string ConfigVersion { get; set; }
    /// <summary>
    /// Only returns the config that matches the given retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerId")]
    public long? RetailerId { get; set; }
    /// <summary>
    /// Only returns the config that matches the given retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationId")]
    public long? RetailerLocationId { get; set; }
    /// <summary>
    /// Only returns only returns the config that matches the given device udid
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("udid")]
    public string? Udid { get; set; }
    /// <summary>
    /// Determines whether to return older config versions if the exact version is not found. If this happens, will try to return the latest version.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("allowOlderVersions")]
    public bool? AllowOlderVersions { get; set; }
}
public class SearchApplicationConfigRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account ID of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The application key to filter results by application Leaving this empty will return all application configurations for all applications (executive user only)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// Only returns the configs that matches the given retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerId")]
    public long? RetailerId { get; set; }
    /// <summary>
    /// Only returns the configs that matches the given retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationId")]
    public long? RetailerLocationId { get; set; }
    /// <summary>
    /// Only returns only returns the configs that matches the given device udid
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("udid")]
    public string? Udid { get; set; }
    /// <summary>
    /// Config Version
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("configVersion")]
    public string? ConfigVersion { get; set; }
    /// <summary>
    /// Orders the results by: CREATED, UPDATED, ACTIVE, APPLICATION_ID,  APPLICATION_KEY, APPLICATION_NAME, RETAILER_NAME, RETAILER_ID, RETAILER_LOCATION_NAME,  RETAILER_LOCATION_ID, OFFER_TITLE, OFFER_ID, OFFER_LOCATION_ID, CONFIG_VERSION_MINOR,  CONFIG_VERSION_MAJOR, CONFIG_VERSION_INDEX 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// Determines whether the results are in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// The start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// The limit for pagination (There is a hard limit of 100)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class UpdateApplicationConfigRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account ID of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The config ID of the application configuration to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("configId")]
    public long ConfigId { get; set; }
    /// <summary>
    /// The application key that the updated applicationConfig will be associated to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The application configuration, has to be unique within the application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("configVersion")]
    public string? ConfigVersion { get; set; }
    /// <summary>
    /// The json assetId that stores the configuration detail.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetId")]
    public long? AssetId { get; set; }
    /// <summary>
    /// The retailer id for retailer specific configurations
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerId")]
    public long? RetailerId { get; set; }
    /// <summary>
    /// The retailer location id for retailer location specific configurations
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationId")]
    public long? RetailerLocationId { get; set; }
    /// <summary>
    /// The device udid for device specific configurations
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("udid")]
    public string? Udid { get; set; }
}


