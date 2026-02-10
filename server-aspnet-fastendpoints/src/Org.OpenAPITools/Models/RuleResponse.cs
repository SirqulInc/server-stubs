namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class RuleResponse 
{
    public long RuleId { get; set; }
    public string Title { get; set; }
    public string Description { get; set; }
    public long RuleTypeId { get; set; }
    public string RuleTypeTitle { get; set; }
    public string RuleTypeDescription { get; set; }
    public string RuleValueType { get; set; }
    public string RuleValue { get; set; }
}


