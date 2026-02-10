namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Verb 
{
    public string Tag { get; set; }
    public string Body { get; set; }
    public Dictionary<string, string> Attributes { get; set; }
    public List<Verb> Children { get; set; }
}


