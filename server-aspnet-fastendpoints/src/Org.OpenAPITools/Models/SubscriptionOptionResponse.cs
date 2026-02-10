namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class SubscriptionOptionResponse 
{
    public long Id { get; set; }
    public string Name { get; set; }
    public double Price { get; set; }
    public int Quantity { get; set; }
    public int Threshold { get; set; }
    public bool Visible { get; set; }
    public string OptionType { get; set; }
}


