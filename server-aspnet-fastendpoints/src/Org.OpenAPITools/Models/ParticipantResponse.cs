namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ParticipantResponse 
{
    public long Id { get; set; }
    public AccountMiniResponse Account { get; set; }
    public long AvailableStart { get; set; }
    public long AvailableEnd { get; set; }
    public string Color1 { get; set; }
    public string Color2 { get; set; }
    public string Type { get; set; }
}


