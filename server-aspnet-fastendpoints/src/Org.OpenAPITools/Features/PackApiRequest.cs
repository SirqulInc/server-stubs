
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreatePackRequest
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
    /// The title of the pack
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string Title { get; set; }
    /// <summary>
    /// The description of the pack
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// The tags for searching the pack, comma separated
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchTags")]
    public string? SearchTags { get; set; }
    /// <summary>
    /// Activate/deactivate the pack
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// The application key used to identify the application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The type of the pack
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("packType")]
    public string? PackType { get; set; }
    /// <summary>
    /// The order of the pack
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("packOrder")]
    public long PackOrder { get; set; }
    /// <summary>
    /// The type of game sequence of the pack
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sequenceType")]
    public string? SequenceType { get; set; }
    /// <summary>
    /// The background asset id of the pack
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("backgroundId")]
    public long? BackgroundId { get; set; }
    /// <summary>
    /// The image asset id of the pack
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("imageId")]
    public long? ImageId { get; set; }
    /// <summary>
    /// The date/time to start the pack, send 0 to unset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// The date/time to end the pack, send 0 to unset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("authorOverride")]
    public string? AuthorOverride { get; set; }
    /// <summary>
    /// The price in tickets to purchase this pack
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("price")]
    public int Price { get; set; }
    /// <summary>
    /// the type of ticket required to purchase this pack
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("priceType")]
    public string? PriceType { get; set; }
    /// <summary>
    /// the game level ids to include in the pack, comma separated
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameLevelIds")]
    public string? GameLevelIds { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("inGame")]
    public bool? InGame { get; set; }
    /// <summary>
    /// The scoring is highest is best
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("highest")]
    public bool Highest { get; set; }
    /// <summary>
    /// Flag to indicate owner should receive tickets for completed packs
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("allocateTickets")]
    public bool AllocateTickets { get; set; }
    /// <summary>
    /// The number of tickets to reward
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketCount")]
    public long TicketCount { get; set; }
    /// <summary>
    /// The type of ticket to reward, null means default type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketType")]
    public string? TicketType { get; set; }
    /// <summary>
    /// The number of points to award for completing a pack
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("points")]
    public long? Points { get; set; }
}
public class DeletePackRequest
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
    /// the id of the pack to delete
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("packId")]
    public long PackId { get; set; }
}
public class GetPackRequest
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
    /// The id of the pack to return.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("packId")]
    public long PackId { get; set; }
    /// <summary>
    /// If true include the game level data, otherwise don&#39;t. default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeGameData")]
    public bool IncludeGameData { get; set; }
}
public class SearchPacksRequest
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
    /// Keyword search on the pack name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// Filters results on pack type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("packType")]
    public string? PackType { get; set; }
    /// <summary>
    /// The field to sort by. Possible values include: TITLE, DESCRIPTION, CREATED, UPDATED
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string SortField { get; set; }
    /// <summary>
    /// Determines whether the sorted list is in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool Descending { get; set; }
    /// <summary>
    /// Start the result set at some index.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// Limit the result to some number.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// Determines whether to include game data in the results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeGameData")]
    public bool? IncludeGameData { get; set; }
    /// <summary>
    /// Determines whether to include inactive results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeInactive")]
    public bool? IncludeInactive { get; set; }
    /// <summary>
    /// The application to filter results on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
}
public class UpdatePackRequest
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
    /// The id of the pack to update.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("packId")]
    public long PackId { get; set; }
    /// <summary>
    /// The title of the pack
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string? Title { get; set; }
    /// <summary>
    /// The description of the pack
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// The tags for searching the pack, comma separated
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchTags")]
    public string? SearchTags { get; set; }
    /// <summary>
    /// Activate/deactivate the pack
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// The application key used to identify the application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The type of the pack
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("packType")]
    public string? PackType { get; set; }
    /// <summary>
    /// The order of the pack
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("packOrder")]
    public long? PackOrder { get; set; }
    /// <summary>
    /// The type of game sequence of the pack
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sequenceType")]
    public string? SequenceType { get; set; }
    /// <summary>
    /// The background asset id of the pack
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("backgroundId")]
    public long? BackgroundId { get; set; }
    /// <summary>
    /// The image asset id of the pack
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("imageId")]
    public long? ImageId { get; set; }
    /// <summary>
    /// The date/time to start the pack, send 0 to unset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// The date/time to end the pack, send 0 to unset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("authorOverride")]
    public string? AuthorOverride { get; set; }
    /// <summary>
    /// The price in tickets to purchase this pack
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("price")]
    public int? Price { get; set; }
    /// <summary>
    /// the type of ticket required to purchase this pack
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("priceType")]
    public string? PriceType { get; set; }
    /// <summary>
    /// the game level ids to include in the pack, comma separated
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameLevelIds")]
    public string? GameLevelIds { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("inGame")]
    public bool? InGame { get; set; }
    /// <summary>
    /// The scoring is highest is best
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("highest")]
    public bool? Highest { get; set; }
    /// <summary>
    /// Flag to indicate owner should receive tickets for completed packs
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("allocateTickets")]
    public bool AllocateTickets { get; set; }
    /// <summary>
    /// The number of tickets to reward
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketCount")]
    public long TicketCount { get; set; }
    /// <summary>
    /// The type of ticket to reward, null means default type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketType")]
    public string? TicketType { get; set; }
    /// <summary>
    /// The number of points to award for completing a pack
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("points")]
    public long? Points { get; set; }
}


