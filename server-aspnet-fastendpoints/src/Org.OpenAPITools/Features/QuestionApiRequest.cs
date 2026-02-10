
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateQuestionRequest
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
    /// the text of the question
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("question")]
    public string Question { get; set; }
    /// <summary>
    /// &#x60;&#x60;&#x60;json [   {     \&quot;text\&quot;: \&quot;1942\&quot;,     \&quot;image\&quot;: 123,     \&quot;videoURL\&quot;: \&quot;http://www.here.com\&quot;,     \&quot;correct\&quot;: true   },   {     \&quot;text\&quot;: \&quot;1943\&quot;,     \&quot;image\&quot;: 124,     \&quot;videoURL\&quot;: \&quot;http://www.there.com\&quot;,     \&quot;correct\&quot;: false   } ] &#x60;&#x60;&#x60; 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("answers")]
    public string Answers { get; set; }
    /// <summary>
    /// The tags of the question for search.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
    /// <summary>
    /// The video link for the question.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("videoURL")]
    public string? VideoURL { get; set; }
    /// <summary>
    /// The asset id of the question.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetId")]
    public long? AssetId { get; set; }
    /// <summary>
    /// If true set the question to active. Default to false.
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
public class DeleteQuestionRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the question to delete
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("questionId")]
    public long QuestionId { get; set; }
    /// <summary>
    /// the id of the account that can execute this request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
}
public class GetQuestionRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the question to get
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("questionId")]
    public long QuestionId { get; set; }
    /// <summary>
    /// the id of the account that can make this request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
}
public class SearchQuestionsRequest
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
    /// The keyword for searching questions with matching tags or question text.
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
public class UpdateQuestionRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The id of the question to update.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("questionId")]
    public long QuestionId { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The text of the question.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("question")]
    public string? Question { get; set; }
    /// <summary>
    /// The json representations of answers for the question.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("answers")]
    public string? Answers { get; set; }
    /// <summary>
    /// The tags of the question for search.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
    /// <summary>
    /// The video link for the question.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("videoURL")]
    public string? VideoURL { get; set; }
    /// <summary>
    /// The asset id of the question.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetId")]
    public long? AssetId { get; set; }
    /// <summary>
    /// If true set the question to active.
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


