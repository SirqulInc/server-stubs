namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class GameObjectListResponse 
{
    public int Start { get; set; }
    public int Limit { get; set; }
    public long CountTotal { get; set; }
    public List<GameObjectResponse> Items { get; set; }
    public int Count { get; set; }
    public bool HasMoreResults { get; set; }
}


