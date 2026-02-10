namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class UserSettingsResponse 
{
    public bool ShowAsZipcode { get; set; }
    public bool ShowExactLocation { get; set; }
    public bool ShowOthersExactLocation { get; set; }
    public int SuggestionCount { get; set; }
    public int SuggestionTimeFrame { get; set; }
    public string SuggestionMethod { get; set; }
    public NotificationSettingsResponse Notifications { get; set; }
    public bool PublicShowFriendInfo { get; set; }
    public bool PublicShowGameInfo { get; set; }
    public bool PublicShowProfileInfo { get; set; }
    
    /// <summary>
    /// Gets or Sets FavoriteVisibility
    /// </summary>
    public enum FavoriteVisibilityEnum
    {
        
        /// <summary>
        /// Enum PUBLICEnum for PUBLIC
        /// </summary>
        PUBLICEnum = 1,
        
        /// <summary>
        /// Enum PRIVATEEnum for PRIVATE
        /// </summary>
        PRIVATEEnum = 2,
        
        /// <summary>
        /// Enum FRIENDSEnum for FRIENDS
        /// </summary>
        FRIENDSEnum = 3
    }

    public FavoriteVisibilityEnum FavoriteVisibility { get; set; }
}


