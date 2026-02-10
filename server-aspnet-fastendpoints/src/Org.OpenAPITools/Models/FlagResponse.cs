namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class FlagResponse 
{
    public long FlagId { get; set; }
    public long FlagableId { get; set; }
    public string FlagableType { get; set; }
    public string FlagDescription { get; set; }
    public long CreatedDate { get; set; }
    public long UpdatedDate { get; set; }
}


