namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PreviewPersonaResponse 
{
    public long PersonaId { get; set; }
    public string Title { get; set; }
    public List<AccountMiniResponse> PreviewAccounts { get; set; }
    public bool Active { get; set; }
    public long Date { get; set; }
    public int Age { get; set; }
    public string Gender { get; set; }
    public string GameExperienceLevel { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
}


