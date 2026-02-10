namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class RankResponse 
{
    public AccountShortResponse Owner { get; set; }
    public string Rank { get; set; }
    public long ScoreValue { get; set; }
    public long TimeValue { get; set; }
    public long CountValue { get; set; }
    public long Updated { get; set; }
}


