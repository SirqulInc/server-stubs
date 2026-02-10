namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class NoteResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public long NoteId { get; set; }
    public string Comment { get; set; }
    public string Tags { get; set; }
    public long LikesCount { get; set; }
    public long DislikesCount { get; set; }
    public long DateCreated { get; set; }
    public long CreatedDate { get; set; }
    public long UpdatedDate { get; set; }
    public AccountShortResponse Owner { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public string LocationDescription { get; set; }
    public string Returning { get; set; }
}


