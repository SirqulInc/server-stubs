namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class LineItem 
{
    public string Description { get; set; }
    public string Item { get; set; }
    public int PricePerItem { get; set; }
    public int Total { get; set; }
    public int Tax { get; set; }
    public int Quantity { get; set; }
}


