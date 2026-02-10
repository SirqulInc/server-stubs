namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ConsumerInviteResponse 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public long InviterId { get; set; }
    public AccountShortResponse Inviter { get; set; }
    public ConnectionResponse Connection { get; set; }
    public string InviteText { get; set; }
    public string Token { get; set; }
    public string AlbumCoverUrl { get; set; }
    public string AlbumTitle { get; set; }
    public string AppName { get; set; }
    public string WelcomeText { get; set; }
    public ApplicationShortResponse Application { get; set; }
    public RetailerLocationResponse RetailerLocation { get; set; }
    public OfferShortResponse Offer { get; set; }
    public AlbumResponse Album { get; set; }
    public string Returning { get; set; }
}


