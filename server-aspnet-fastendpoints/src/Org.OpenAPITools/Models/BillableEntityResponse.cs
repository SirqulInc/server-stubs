namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class BillableEntityResponse 
{
    public long BillableEntityId { get; set; }
    public string Name { get; set; }
    public ProfileShortResponse Responsible { get; set; }
    public ContactInfoResponse Contact { get; set; }
    public SubscriptionResponse Subscription { get; set; }
    public PaymentTypesResponse Payment { get; set; }
}


