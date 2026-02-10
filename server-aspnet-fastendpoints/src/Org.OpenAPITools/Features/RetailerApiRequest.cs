
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateRetailerRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The name of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
    /// <summary>
    /// The street address of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("streetAddress")]
    public string? StreetAddress { get; set; }
    /// <summary>
    /// Additional address information (such as a suite number, floor number, building name, or PO Box)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("streetAddress2")]
    public string? StreetAddress2 { get; set; }
    /// <summary>
    /// The city of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("city")]
    public string? City { get; set; }
    /// <summary>
    /// The state of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("state")]
    public string? State { get; set; }
    /// <summary>
    /// The postal code of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("postalCode")]
    public string? PostalCode { get; set; }
    /// <summary>
    /// the country of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("country")]
    public string? Country { get; set; }
    /// <summary>
    /// The business phone number of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("businessPhone")]
    public string? BusinessPhone { get; set; }
    /// <summary>
    /// The business phone extension of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("businessPhoneExt")]
    public string? BusinessPhoneExt { get; set; }
    /// <summary>
    /// The website of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("website")]
    public string? Website { get; set; }
    /// <summary>
    /// The email of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("email")]
    public string? Email { get; set; }
    /// <summary>
    /// The facebook URL of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("facebookUrl")]
    public string? FacebookUrl { get; set; }
    /// <summary>
    /// The twitter URL of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("twitterUrl")]
    public string? TwitterUrl { get; set; }
    /// <summary>
    /// The retailer logo sent as a multipart binary file (you can optionally use logoAssetId if the asset has already been uploaded before)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("logo")]
    public System.IO.Stream? Logo { get; set; }
    /// <summary>
    /// The retailer logo asset id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("logoAssetId")]
    public long? LogoAssetId { get; set; }
    /// <summary>
    /// Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture1AssetId if the asset has already been uploaded before)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("picture1")]
    public System.IO.Stream? Picture1 { get; set; }
    /// <summary>
    /// An asset id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("picture1AssetId")]
    public long? Picture1AssetId { get; set; }
    /// <summary>
    /// Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture2AssetId if the asset has already been uploaded before)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("picture2")]
    public System.IO.Stream? Picture2 { get; set; }
    /// <summary>
    /// An asset id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("picture2AssetId")]
    public long? Picture2AssetId { get; set; }
    /// <summary>
    /// Comma separated list of category IDs used to filter retailers by categories
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// Comma separated list of category IDs to add to the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIdsToAdd")]
    public string? CategoryIdsToAdd { get; set; }
    /// <summary>
    /// Comma separated list of category IDs to remove from the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIdsToRemove")]
    public string? CategoryIdsToRemove { get; set; }
    /// <summary>
    /// Comma separated list of filter IDs used to filter retailers
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterIds")]
    public string? FilterIds { get; set; }
    /// <summary>
    /// the latitude of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the longitude of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// External custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// External custom search keywords
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchTags")]
    public string? SearchTags { get; set; }
    /// <summary>
    /// External custom type identifier
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerType")]
    public string? RetailerType { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("visibility")]
    public string? Visibility { get; set; }
    /// <summary>
    /// Determines whether to create a default location using the retailer information
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("createDefaultLocation")]
    public bool? CreateDefaultLocation { get; set; }
    /// <summary>
    /// The format of the returned response {JSON // default , HTML // for Dojo support when uploading assets}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseFormat")]
    public string? ResponseFormat { get; set; }
}
public class DeleteRetailerRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account used to perform the delete, must have rights to edit the retailer.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The ID of the retailer to be deleted
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerId")]
    public long? RetailerId { get; set; }
}
public class GetRetailerRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the ID of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerId")]
    public long RetailerId { get; set; }
    /// <summary>
    /// Determines whether to include counts in the response (default true)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeCounts")]
    public bool? IncludeCounts { get; set; }
}
public class GetRetailersRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
    /// <summary>
    /// The keyword used to search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// the categories that the retailer is associated with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// the filters that the retailer is associated with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterIds")]
    public string? FilterIds { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("visibility")]
    public string Visibility { get; set; }
    /// <summary>
    /// The column to sort the search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string SortField { get; set; }
    /// <summary>
    /// The order to return the search results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool Descending { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_i")]
    public int? I { get; set; }
    /// <summary>
    /// The record to begin the return set on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_l")]
    public int? L { get; set; }
    /// <summary>
    /// The number of records to return
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
    /// <summary>
    /// Return only active results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool ActiveOnly { get; set; }
}
public class RetailerLoginCheckRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the user&#39;s email address they used to sign-up
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("username")]
    public string Username { get; set; }
    /// <summary>
    /// the password
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("password")]
    public string Password { get; set; }
    /// <summary>
    /// the device id (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the current latitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the current longitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
}
public class UpdateRetailerRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The ID of the retailer to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerId")]
    public long RetailerId { get; set; }
    /// <summary>
    /// The name of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// The street address of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("streetAddress")]
    public string? StreetAddress { get; set; }
    /// <summary>
    /// Additional address information (such as a suite number, floor number, building name, or PO Box)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("streetAddress2")]
    public string? StreetAddress2 { get; set; }
    /// <summary>
    /// The city of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("city")]
    public string? City { get; set; }
    /// <summary>
    /// The state of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("state")]
    public string? State { get; set; }
    /// <summary>
    /// The postal code of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("postalCode")]
    public string? PostalCode { get; set; }
    /// <summary>
    /// the country of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("country")]
    public string? Country { get; set; }
    /// <summary>
    /// The business phone of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("businessPhone")]
    public string? BusinessPhone { get; set; }
    /// <summary>
    /// The business phone extension of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("businessPhoneExt")]
    public string? BusinessPhoneExt { get; set; }
    /// <summary>
    /// The website of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("website")]
    public string? Website { get; set; }
    /// <summary>
    /// The email of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("email")]
    public string? Email { get; set; }
    /// <summary>
    /// The facebook URL of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("facebookUrl")]
    public string? FacebookUrl { get; set; }
    /// <summary>
    /// The twitter URL of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("twitterUrl")]
    public string? TwitterUrl { get; set; }
    /// <summary>
    /// The retailer logo sent as a multipart binary file (you can optionally use logoAssetId if the asset has already been uploaded before)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("logo")]
    public System.IO.Stream? Logo { get; set; }
    /// <summary>
    /// The retailer logo asset id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("logoAssetId")]
    public long? LogoAssetId { get; set; }
    /// <summary>
    /// Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture1AssetId if the asset has already been uploaded before)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("picture1")]
    public System.IO.Stream? Picture1 { get; set; }
    /// <summary>
    /// An asset id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("picture1AssetId")]
    public long? Picture1AssetId { get; set; }
    /// <summary>
    /// Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture2AssetId if the asset has already been uploaded before)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("picture2")]
    public System.IO.Stream? Picture2 { get; set; }
    /// <summary>
    /// An asset id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("picture2AssetId")]
    public long? Picture2AssetId { get; set; }
    /// <summary>
    /// Comma separated list of category IDs used to filter retailers by categories
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// Comma separated list of filter IDs used to filter retailers
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterIds")]
    public string? FilterIds { get; set; }
    /// <summary>
    /// the latitude of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the longitude of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// External custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// External custom search keywords
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchTags")]
    public string? SearchTags { get; set; }
    /// <summary>
    /// External custom type identifier
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerType")]
    public string? RetailerType { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("visibility")]
    public string? Visibility { get; set; }
    /// <summary>
    /// Sets whether the retailer is active or inactive (hidden from consumers)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// The format of the returned response {JSON // default , HTML // for Dojo support when uploading assets}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseFormat")]
    public string? ResponseFormat { get; set; }
}


