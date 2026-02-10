
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateWordRequest
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
    /// The text of the word.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("word")]
    public string Word { get; set; }
    /// <summary>
    /// The definition of the word.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("definition")]
    public string Definition { get; set; }
    /// <summary>
    /// The asset id of the word.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetId")]
    public long? AssetId { get; set; }
    /// <summary>
    /// If true set the word to active. Default to false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool Active { get; set; }
    /// <summary>
    /// If true then scoring will give tickets. Default to false.
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
    /// The number of points to award for completing a mission
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("points")]
    public long? Points { get; set; }
}
public class DeleteWordRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The id of the word to delete.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("wordId")]
    public long WordId { get; set; }
    /// <summary>
    /// The account vor validating permission
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
}
public class GetWordRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The id of the word to get.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("wordId")]
    public long WordId { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
}
public class GetWordsRequest
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
    /// The keyword for searching words with matching definition or word text.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
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
    /// Return only active results if set to true.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool ActiveOnly { get; set; }
    /// <summary>
    /// The record to begin the return set on.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// The number of records to return.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
}
public class UpdateWordRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The id of the word to update.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("wordId")]
    public long WordId { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The text for the word
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("wordText")]
    public string? WordText { get; set; }
    /// <summary>
    /// The definition of the word.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("definition")]
    public string? Definition { get; set; }
    /// <summary>
    /// The asset id of the word.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetId")]
    public long? AssetId { get; set; }
    /// <summary>
    /// If true set the word to active.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// If true then scoring will give tickets.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("allocateTickets")]
    public bool? AllocateTickets { get; set; }
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
    /// The number of points to award for completing a mission
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("points")]
    public long? Points { get; set; }
}


