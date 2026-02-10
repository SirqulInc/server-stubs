namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PackListResponse 
{
    public int Start { get; set; }
    public int Limit { get; set; }
    public long CountTotal { get; set; }
    public List<PackResponse> Items { get; set; }
    public int Count { get; set; }
    public bool HasMoreResults { get; set; }
}


