
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreatePersonaRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account ID of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the title of the persona
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string Title { get; set; }
    /// <summary>
    /// the accounts that are able to preview from this persona
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("previewAccounts")]
    public string? PreviewAccounts { get; set; }
    /// <summary>
    /// the sepcified date that this persona is viewing the app
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("date")]
    public long? Date { get; set; }
    /// <summary>
    /// the specified age of this persona
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("age")]
    public int? Age { get; set; }
    /// <summary>
    /// the specified gender of this persona
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gender")]
    public string? Gender { get; set; }
    /// <summary>
    /// the specified experience level of the persona
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameExperienceLevel")]
    public string? GameExperienceLevel { get; set; }
    /// <summary>
    /// the specified latitude of the persona
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the specified longitude of the persona
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class DeletePersonaRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account id of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the id of the persona to delete
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("personaId")]
    public long PersonaId { get; set; }
}
public class GetPersonaListRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account ID of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the persona ID of the persona
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("personaId")]
    public long PersonaId { get; set; }
}
public class SearchPersonaRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account ID of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// the limit for pagination (There is a hard limit of 100)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
}
public class UpdatePersonaRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account ID of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the persona ID of the persona to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("personaId")]
    public long PersonaId { get; set; }
    /// <summary>
    /// the title of the persona
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string? Title { get; set; }
    /// <summary>
    /// the accounts that are able to preview from this persona
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("previewAccounts")]
    public string? PreviewAccounts { get; set; }
    /// <summary>
    /// the status of the persona, there can only be one active persona per account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// the sepcified date that this persona is viewing the app
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("date")]
    public long? Date { get; set; }
    /// <summary>
    /// the specified age of this persona
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("age")]
    public int? Age { get; set; }
    /// <summary>
    /// the specified gender of this persona
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gender")]
    public string? Gender { get; set; }
    /// <summary>
    /// the specified experience level of the persona
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameExperienceLevel")]
    public string? GameExperienceLevel { get; set; }
    /// <summary>
    /// the specified latitude of the persona
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the specified longitude of the persona
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}


