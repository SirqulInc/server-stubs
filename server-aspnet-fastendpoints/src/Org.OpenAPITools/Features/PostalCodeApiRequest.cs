
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreatePostalCodeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the postal code
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("code")]
    public string Code { get; set; }
    /// <summary>
    /// the latitude of the postal code
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double Latitude { get; set; }
    /// <summary>
    /// the longitude of the postal code
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double Longitude { get; set; }
    /// <summary>
    /// the state code (e.g WA, WV, WI) that the postal code is located
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("stateCode")]
    public string? StateCode { get; set; }
    /// <summary>
    /// the city that the postal code is located
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("city")]
    public string? City { get; set; }
    /// <summary>
    /// whether the postal code created should be active or inactive
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
}
public class DeletePostalCodeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the id of the postal code to delete
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("postalCodeId")]
    public long PostalCodeId { get; set; }
}
public class GetPostalCodeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the postal code to get
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("postalCodeId")]
    public long PostalCodeId { get; set; }
}
public class GetPostalCodesRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the latitude of the postal code to search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the longitude of the postal code to search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// the keyword of the postal code to search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// how far (in miles) to search on for the postal code
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("miles")]
    public double? Miles { get; set; }
    /// <summary>
    /// the start of the index and/or pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// the limit of the index and/or pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// the field to sort the results on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string SortField { get; set; }
    /// <summary>
    /// whether to order results in ascending or descending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool Descending { get; set; }
}
public class UpdatePostalCodeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the id of the postal code to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("postalCodeId")]
    public long PostalCodeId { get; set; }
    /// <summary>
    /// the postal code to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("code")]
    public string? Code { get; set; }
    /// <summary>
    /// the latitude of the postal code
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the longitude of the postal code
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// the state code (e.g. WA, WI, WY) where the postal code is located
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("stateCode")]
    public string? StateCode { get; set; }
    /// <summary>
    /// the city where the postal code is located
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("city")]
    public string? City { get; set; }
    /// <summary>
    /// whether the postal code is active or inactive
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
}


