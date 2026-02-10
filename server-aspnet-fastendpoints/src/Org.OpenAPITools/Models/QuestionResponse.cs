namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class QuestionResponse 
{
    public long Id { get; set; }
    public string Question { get; set; }
    public AssetShortResponse Image { get; set; }
    public string VideoURL { get; set; }
    public bool Active { get; set; }
    public List<AnswerResponse> Answers { get; set; }
    public ScoreListResponse Scores { get; set; }
    public TicketListResponse Tickets { get; set; }
    public AccountShortResponse Owner { get; set; }
    public AssetShortResponse Icon { get; set; }
    public string AuthorOverride { get; set; }
    public long UpdatedDate { get; set; }
    public long StartDate { get; set; }
    public long EndDate { get; set; }
    public long CreatedDate { get; set; }
    public string Tags { get; set; }
    public bool AllocateTickets { get; set; }
    public string TicketType { get; set; }
    public long TicketCount { get; set; }
    public long Points { get; set; }
}


