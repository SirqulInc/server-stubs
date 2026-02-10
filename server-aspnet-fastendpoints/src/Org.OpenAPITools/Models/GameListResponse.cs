namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class GameListResponse 
{
    public int Start { get; set; }
    public int Limit { get; set; }
    public long CountTotal { get; set; }
    public List<GameResponse> Items { get; set; }
    public bool HasMoreResults { get; set; }
    public int Count { get; set; }
}


