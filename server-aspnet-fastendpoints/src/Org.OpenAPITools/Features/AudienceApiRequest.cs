
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateAudienceRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The name of the audience
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
    /// <summary>
    /// The description of the audience
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// The search tags
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchTags")]
    public string? SearchTags { get; set; }
    /// <summary>
    /// The gender; possible values are: MALE, FEMALE, ANY
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gender")]
    public string? Gender { get; set; }
    /// <summary>
    /// The list of age groups, comma separated; possible values are AGE_0_13, AGE_14_17, AGE_18_22, AGE_23_30, AGE_31_54, AGE_55_PLUS, AGE_ANY (to reset to none)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ageGroups")]
    public string? AgeGroups { get; set; }
    /// <summary>
    /// The list of category ids, comma separated; possible values are retrieved via /api/{version}/category/search (pass in id values)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// The list of application ids, comma separated; possible values are retrieved via /api/{version}/application/list (pass in id values)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("applicationIds")]
    public string? ApplicationIds { get; set; }
    /// <summary>
    /// The experience level of the player; possible values are: ANY, NEW, BEGINNER, INTERMEDIATE, EXPERT
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameExperienceLevel")]
    public string? GameExperienceLevel { get; set; }
    /// <summary>
    /// (Deprecated) Use deviceIds. The list of targeted device names, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in name values)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("devices")]
    public string? Devices { get; set; }
    /// <summary>
    /// The list of targeted device ids, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in id values)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceIds")]
    public string? DeviceIds { get; set; }
    /// <summary>
    /// The list of targeted device version ranges that are aligned with the provided devices list, comma separated (examples: 2.3-X, 0-5.1.4, 4.3.1-6.1.4)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceVersions")]
    public string? DeviceVersions { get; set; }
    /// <summary>
    /// The list of locations to build the center around; comma separated list of latitude/longitude pairs (example: lat1,long1,lat2,long2)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locations")]
    public string? Locations { get; set; }
    /// <summary>
    /// The list of radius of influence for the audience, in miles; comma separated list. Either provide 1 to be applied to all location pairs or a matching list to each lat/long pair.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("radius")]
    public string? Radius { get; set; }
    /// <summary>
    /// Seconds from the start time of an event
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startTimeOffset")]
    public int? StartTimeOffset { get; set; }
    /// <summary>
    /// Seconds from the end time of an event
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endTimeOffset")]
    public int? EndTimeOffset { get; set; }
    /// <summary>
    /// If true, then notify matching users when they are inside the radius
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sendSuggestion")]
    public bool? SendSuggestion { get; set; }
    /// <summary>
    /// The description of the associated object
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("associateDescription")]
    public string? AssociateDescription { get; set; }
    /// <summary>
    /// The type of the object to center the audience geofence
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("associateType")]
    public string? AssociateType { get; set; }
    /// <summary>
    /// The ID of the object to center the audience geofence
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("associateId")]
    public long? AssociateId { get; set; }
    /// <summary>
    /// Optional grouping id for the audience
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupingId")]
    public string? GroupingId { get; set; }
    /// <summary>
    /// External custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// Visibility of the audience
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("visibility")]
    public string? Visibility { get; set; }
    /// <summary>
    /// Type of audience
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceType")]
    public string? AudienceType { get; set; }
    /// <summary>
    /// Use order for cohort
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("useOrder")]
    public bool? UseOrder { get; set; }
    /// <summary>
    /// Cohort data for \&quot;cohort\&quot; audience type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("cohortRegionsData")]
    public string? CohortRegionsData { get; set; }
    /// <summary>
    /// Filter results by application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// Trilateration types
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("trilaterationTypes")]
    public string? TrilaterationTypes { get; set; }
    /// <summary>
    /// If true, makes sure the audience name is unique
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("uniqueName")]
    public bool? UniqueName { get; set; }
}
public class DeleteAudienceRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The id of the audience to delete.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceId")]
    public long AudienceId { get; set; }
}
public class GetAgeGroupsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
}
public class GetAudienceRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The id of the audience to return.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceId")]
    public long AudienceId { get; set; }
    /// <summary>
    /// The application key (optional). If provided, results may be scoped to this application.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// (boolean) set to true to include the accountCount associated with current audience of the current app
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnAccountCount")]
    public bool? ReturnAccountCount { get; set; }
    /// <summary>
    /// (boolean) set to true to include the albumCount associated with current audience of the current app
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnAlbumCount")]
    public bool? ReturnAlbumCount { get; set; }
    /// <summary>
    /// (String) comma separated list, return an array with each item is the count of each album type. If not provided, \&quot;all_types\&quot; count is returned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumTypesForCount")]
    public string? AlbumTypesForCount { get; set; }
}
public class GetAudienceListRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// Comma separated list of album IDs to filter results with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumIds")]
    public string? AlbumIds { get; set; }
    /// <summary>
    /// The keyword used to search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// Comma separated list of fields that the keywords will match against. Possible values include: SEARCH_TAGS, NAME, DESCRIPTION, OWNER_DISPLAY
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keywordFields")]
    public string? KeywordFields { get; set; }
    /// <summary>
    /// The field to sort by, possible values include: {ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DESCRIPTION, OWNER_ID, OWNER_DISPLAY, GENDER}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// The order to return the results. Default is false, which will return the results in ascending order.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// The index into the record set to start with.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// The total number of record to return (there is a hard limit of 100).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// Filter results based on whether or not the audience is set to send suggestions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sendSuggestion")]
    public bool? SendSuggestion { get; set; }
    /// <summary>
    /// Determines whether to return only active results. Default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool? ActiveOnly { get; set; }
    /// <summary>
    /// Groups results by the audience groupingId (this does not work in conjunction with the following parameters: albumIds, audienceType, appKey, returnGlobal)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupByGroupingId")]
    public bool? GroupByGroupingId { get; set; }
    /// <summary>
    /// Filter results by application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// If filtering by appKey, determines whether or not audiences that do not have an application set will also be returned as well
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnGlobal")]
    public bool? ReturnGlobal { get; set; }
    /// <summary>
    /// If true, match keyword exactly
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("exactKeyword")]
    public bool? ExactKeyword { get; set; }
    /// <summary>
    /// (Deprecated) Filter results by audience type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceType")]
    public string? AudienceType { get; set; }
    /// <summary>
    /// comma separated string with the different audience types you want to filter for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceTypes")]
    public string? AudienceTypes { get; set; }
    /// <summary>
    /// (boolean) set to true to include the accountCount associated with current audience of the current app
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnAccountCount")]
    public bool? ReturnAccountCount { get; set; }
    /// <summary>
    /// (boolean) set to true to include the albumCount associated with current audience of the current app
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnAlbumCount")]
    public bool? ReturnAlbumCount { get; set; }
    /// <summary>
    /// (String) comma separated list, return an array with each item is the count of each album type. If not provided, \&quot;all_types\&quot; count is returned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("albumTypesForCount")]
    public string? AlbumTypesForCount { get; set; }
}
public class GetDevicesRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// If true return inactive record as well. default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeInactive")]
    public bool IncludeInactive { get; set; }
}
public class GetExperiencesRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
}
public class GetGroupedAudiencesRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The audience grouping id to return.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceGroupingId")]
    public string AudienceGroupingId { get; set; }
}
public class ListByAccountRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account to match offers for.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the limit of the index
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
    /// <summary>
    /// the type of suggestion
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("suggestionType")]
    public string SuggestionType { get; set; }
}
public class ListByAudienceRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// this is the gender to list offers by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gender")]
    public string? Gender { get; set; }
    /// <summary>
    /// this is the age to list offers by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("age")]
    public int? Age { get; set; }
    /// <summary>
    /// this is the category IDs to list offers by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// this is the latitude to list offers by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// this is the longitude to list offers by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// this is the limit of the index
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
}
public class ListLastestByAccountRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account to match offers for.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The timeframe in seconds of the latest suggestions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("timeframe")]
    public int Timeframe { get; set; }
    /// <summary>
    /// The type of trigger suggestions to return
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("suggestionType")]
    public string SuggestionType { get; set; }
}
public class SendByAccountRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account to match offers for.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the latitude
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double Latitude { get; set; }
    /// <summary>
    /// the longitude
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double Longitude { get; set; }
}
public class UpdateAudienceRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The id of the audience to update.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceId")]
    public long AudienceId { get; set; }
    /// <summary>
    /// The name of the audience
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// The description of the audience
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// The search tags
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchTags")]
    public string? SearchTags { get; set; }
    /// <summary>
    /// The gender; possible values are: MALE, FEMALE, ANY
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gender")]
    public string? Gender { get; set; }
    /// <summary>
    /// The list of age groups, comma separated; possible values are AGE_0_13, AGE_14_17, AGE_18_22, AGE_23_30, AGE_31_54, AGE_55_PLUS, AGE_ANY (to reset to none)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ageGroups")]
    public string? AgeGroups { get; set; }
    /// <summary>
    /// The list of category ids, comma separated; possible values are retrieved via /api/{version}/category/search (pass in id values)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// The list of application ids, comma separated; possible values are retrieved via /api/{version}/application/list (pass in id values)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("applicationIds")]
    public string? ApplicationIds { get; set; }
    /// <summary>
    /// The experience level of the player; possible values are: ANY, NEW, BEGINNER, INTERMEDIATE, EXPERT
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameExperienceLevel")]
    public string? GameExperienceLevel { get; set; }
    /// <summary>
    /// (Deprecated) Use deviceIds. The list of targeted device names, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in name values)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("devices")]
    public string? Devices { get; set; }
    /// <summary>
    /// The list of targeted device ids, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in id values)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceIds")]
    public string? DeviceIds { get; set; }
    /// <summary>
    /// The list of targeted device version ranges that are aligned with the provided devices list, comma separated (examples: 2.3-X, 0-5.1.4, 4.3.1-6.1.4)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceVersions")]
    public string? DeviceVersions { get; set; }
    /// <summary>
    /// The list of locations to build the center around; comma separated list of latitude/longitude pairs (example: lat1,long1,lat2,long2)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locations")]
    public string? Locations { get; set; }
    /// <summary>
    /// The list of radius of influence for the audience, in miles; comma separated list. Either provide 1 to be applied to all location pairs or a matching list to each lat/long pair.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("radius")]
    public string? Radius { get; set; }
    /// <summary>
    /// if audience is active
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// If true, then notify matching users when they are inside the radius
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sendSuggestion")]
    public bool? SendSuggestion { get; set; }
    /// <summary>
    /// Seconds from the start time of an event
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startTimeOffset")]
    public int? StartTimeOffset { get; set; }
    /// <summary>
    /// Seconds from the end time of an event
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endTimeOffset")]
    public int? EndTimeOffset { get; set; }
    /// <summary>
    /// the associate description
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("associateDescription")]
    public string? AssociateDescription { get; set; }
    /// <summary>
    /// The type of the object to center the audience geofence
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("associateType")]
    public string? AssociateType { get; set; }
    /// <summary>
    /// The ID of the object to center the audience geofence
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("associateId")]
    public long? AssociateId { get; set; }
    /// <summary>
    /// Optional grouping id for the audience
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupingId")]
    public string? GroupingId { get; set; }
    /// <summary>
    /// External custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// Visibility of the audience
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("visibility")]
    public string? Visibility { get; set; }
    /// <summary>
    /// Type of audience
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceType")]
    public string? AudienceType { get; set; }
    /// <summary>
    /// Use order for cohort
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("useOrder")]
    public bool? UseOrder { get; set; }
    /// <summary>
    /// Cohort data for \&quot;cohort\&quot; audience type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("cohortRegionsData")]
    public string? CohortRegionsData { get; set; }
    /// <summary>
    /// Filter results by application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// Trilateration types
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("trilaterationTypes")]
    public string? TrilaterationTypes { get; set; }
    /// <summary>
    /// If true, makes sure the audience name is unique
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("uniqueName")]
    public bool? UniqueName { get; set; }
}


