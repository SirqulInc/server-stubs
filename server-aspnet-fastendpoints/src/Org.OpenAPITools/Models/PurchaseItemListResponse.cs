namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PurchaseItemListResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public List<PurchaseItemResponse> Items { get; set; }
    public int Count { get; set; }
    public bool HasMoreResults { get; set; }
    public int Start { get; set; }
    public int Limit { get; set; }
    public long CountTotal { get; set; }
    public string Returning { get; set; }
}


