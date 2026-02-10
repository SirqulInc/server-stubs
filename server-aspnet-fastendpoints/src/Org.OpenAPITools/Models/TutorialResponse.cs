namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TutorialResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public long Id { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    public string Alignment { get; set; }
    public AssetShortResponse Image { get; set; }
    public long OrderIndex { get; set; }
    public string ObjectType { get; set; }
    public string Returning { get; set; }
}


