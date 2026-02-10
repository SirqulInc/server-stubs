
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CacheTrilaterationDataRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique identifier of the source device
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("udid")]
    public string Udid { get; set; }
    /// <summary>
    /// The current timestamp of the source device
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sourceTime")]
    public long? SourceTime { get; set; }
    /// <summary>
    /// the minimum number of Edysen devices that must be used to be able to trilaterate a device
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("minimumSampleSize")]
    public int? MinimumSampleSize { get; set; }
    /// <summary>
    /// The json formated sample data:  &#x60;&#x60;&#x60;json {    \&quot;count\&quot;: 2,   \&quot;timespan\&quot;: 10,    \&quot;samples\&quot;: [     {       \&quot;deviceId\&quot;: \&quot;device1\&quot;,       \&quot;randomizedId\&quot;: true,        \&quot;deviceSignature\&quot;: \&quot;probe:xyz...\&quot;,        \&quot;alternativeId\&quot;:\&quot;adc123\&quot;,        \&quot;rssi\&quot;: [-63, -75]     },      {       \&quot;deviceId\&quot;: \&quot;device2\&quot;,       \&quot;randomizedId\&quot;: true,        \&quot;deviceSignature\&quot;: \&quot;probe:xyz...\&quot;,        \&quot;alternativeId\&quot;: \&quot;adc123\&quot;,        \&quot;rssi\&quot;: [-83, -79]     }   ] } &#x60;&#x60;&#x60; 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("data")]
    public string? Data { get; set; }
    /// <summary>
    /// Binary file containing data (multipart upload)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("dataFile")]
    public System.IO.Stream? DataFile { get; set; }
}
public class CacheTrilaterationDataGzipRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public TrilatCacheRequest? body { get; set; }
}
public class GetLocationByIpRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the ip address of the client device
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ip")]
    public string? Ip { get; set; }
}
public class GetLocationByTrilaterationRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account making the request, if provided the last know location will be updated
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The known GPS latitude to compare to the calculated version
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The known GPS longitude to compare to the calculated version
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// The json formated sample data:  &#x60;&#x60;&#x60;json {    \&quot;count\&quot;: 2,   \&quot;timespan\&quot;: 10,    \&quot;samples\&quot;: [     {       \&quot;deviceId\&quot;: \&quot;device1\&quot;,       \&quot;rssi\&quot;: [-63, -75]     },      {       \&quot;deviceId\&quot;: \&quot;device2\&quot;,       \&quot;rssi\&quot;: [-83, -79]     }   ] } &#x60;&#x60;&#x60; 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("data")]
    public string? Data { get; set; }
    /// <summary>
    /// Optional response filters (not used currently)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseFilters")]
    public string? ResponseFilters { get; set; }
}
public class GetLocationsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the device id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("currentlatitude")]
    public double? Currentlatitude { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("currentlongitude")]
    public double? Currentlongitude { get; set; }
    /// <summary>
    /// the current latitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("currentLatitude")]
    public double? CurrentLatitude { get; set; }
    /// <summary>
    /// the current longitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("currentLongitude")]
    public double? CurrentLongitude { get; set; }
    /// <summary>
    /// the query results by keyword or address
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("query")]
    public string? Query { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("zipcode")]
    public string? Zipcode { get; set; }
    /// <summary>
    /// the zip code to filter results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("zipCode")]
    public string? ZipCode { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("selectedMaplatitude")]
    public double? SelectedMaplatitude { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("selectedMaplongitude")]
    public double? SelectedMaplongitude { get; set; }
    /// <summary>
    /// the latitude of where the search should originate from
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("selectedMapLatitude")]
    public double? SelectedMapLatitude { get; set; }
    /// <summary>
    /// the longitude of where the search should originate from
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("selectedMapLongitude")]
    public double? SelectedMapLongitude { get; set; }
    /// <summary>
    /// the search range of the search in miles
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchRange")]
    public double? SearchRange { get; set; }
    /// <summary>
    /// determines whether to allow searches via address
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("useGeocode")]
    public bool? UseGeocode { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_i")]
    public int? I { get; set; }
    /// <summary>
    /// the start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_l")]
    public int? L { get; set; }
    /// <summary>
    /// the limit for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}


