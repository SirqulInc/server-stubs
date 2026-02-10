namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class MissionListResponse 
{
    public int Start { get; set; }
    public int Limit { get; set; }
    public long CountTotal { get; set; }
    public List<MissionResponse> Items { get; set; }
    public bool HasMoreResults { get; set; }
    public int Count { get; set; }
}


