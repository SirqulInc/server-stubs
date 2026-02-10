namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ApplicationUsageResponse 
{
    public BillableEntityResponse BillableEntity { get; set; }
    public long ApplicationId { get; set; }
    public DateTime InvoiceDate { get; set; }
    public double Balance { get; set; }
    public long TotalRequests { get; set; }
    public long TotalDataStorage { get; set; }
    public long TotalMediaStorage { get; set; }
    public long TotalNotifications { get; set; }
    public long MaxMissions { get; set; }
    public long MaxVouchers { get; set; }
    public long MaxCoupons { get; set; }
    public long MaxProducts { get; set; }
    public long MaxEvents { get; set; }
    public long MaxMedia { get; set; }
    public long MaxLocations { get; set; }
}


