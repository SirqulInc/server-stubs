namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class BidResponse 
{
    public long BidId { get; set; }
    public string BiddableType { get; set; }
    public long BiddableId { get; set; }
    public double AmountPerView { get; set; }
    public double AmountPerAction { get; set; }
    public double CurrentDailyBudget { get; set; }
    public double CurrentBudget { get; set; }
    public long CurrentBudgetExpiration { get; set; }
    public long CurrentBudgetStart { get; set; }
    public double BudgetAmount { get; set; }
    
    /// <summary>
    /// Gets or Sets BudgetSchedule
    /// </summary>
    public enum BudgetScheduleEnum
    {
        
        /// <summary>
        /// Enum DAILYEnum for DAILY
        /// </summary>
        DAILYEnum = 1,
        
        /// <summary>
        /// Enum WEEKLYEnum for WEEKLY
        /// </summary>
        WEEKLYEnum = 2,
        
        /// <summary>
        /// Enum MONTHLYEnum for MONTHLY
        /// </summary>
        MONTHLYEnum = 3,
        
        /// <summary>
        /// Enum YEARLYEnum for YEARLY
        /// </summary>
        YEARLYEnum = 4
    }

    public BudgetScheduleEnum BudgetSchedule { get; set; }
}


