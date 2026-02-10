namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PromoCode 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public string Code { get; set; }
    public string Name { get; set; }
    public int Days { get; set; }
}


