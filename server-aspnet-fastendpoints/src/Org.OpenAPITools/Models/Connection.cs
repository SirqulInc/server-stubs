namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Connection 
{
    public long Id { get; set; }
    public DateTime Created { get; set; }
    public DateTime Updated { get; set; }
    public DateTime Deleted { get; set; }
    public string ObjectType { get; set; }
    public string LegacyId { get; set; }
    public string SearchTags { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public Account Account { get; set; }
    public Account VarConnection { get; set; }
    public ConnectedFriend PendingConnection { get; set; }
    public bool Friend { get; set; }
    public bool FriendRequested { get; set; }
    public bool FriendRequestPending { get; set; }
    public bool Following { get; set; }
    public bool Follower { get; set; }
    public bool Trusted { get; set; }
    public bool Blocked { get; set; }
    public DateTime FriendRequestDate { get; set; }
    public DateTime FriendResponseDate { get; set; }
    public string Display { get; set; }
    public DateTime ConnectionViewedDate { get; set; }
    
    /// <summary>
    /// Gets or Sets ConnectionType
    /// </summary>
    public enum ConnectionTypeEnum
    {
        
        /// <summary>
        /// Enum PRIMARYEnum for PRIMARY
        /// </summary>
        PRIMARYEnum = 1,
        
        /// <summary>
        /// Enum SECONDARYEnum for SECONDARY
        /// </summary>
        SECONDARYEnum = 2,
        
        /// <summary>
        /// Enum DEPENDENTEnum for DEPENDENT
        /// </summary>
        DEPENDENTEnum = 3,
        
        /// <summary>
        /// Enum ACQUAINTANCEEnum for ACQUAINTANCE
        /// </summary>
        ACQUAINTANCEEnum = 4
    }

    public ConnectionTypeEnum ConnectionType { get; set; }
    public string Title { get; set; }
    public long PendingConnectionId { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
}


