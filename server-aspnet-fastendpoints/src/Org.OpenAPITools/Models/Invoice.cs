namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Invoice 
{
    public string Location { get; set; }
    public int Tax { get; set; }
    public int Total { get; set; }
    public List<LineItem> LineItems { get; set; }
}


