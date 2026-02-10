namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AnswerResponse 
{
    public long AnswerId { get; set; }
    public string Answer { get; set; }
    public bool Correct { get; set; }
    public AssetShortResponse Image { get; set; }
    public string VideoURL { get; set; }
}


