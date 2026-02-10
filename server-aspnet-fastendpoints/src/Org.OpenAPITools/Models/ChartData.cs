namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ChartData 
{
    public bool Valid { get; set; }
    public string Message { get; set; }
    public double VarVersion { get; set; }
    public bool SerializeNulls { get; set; }
    public long StartTimeLog { get; set; }
    public string ErrorCode { get; set; }
    public List<NameStringValueResponse> Request { get; set; }
    public string Identifier { get; set; }
    public string IdAttribute { get; set; }
    public string Label { get; set; }
    public long MaxValue { get; set; }
    public long TotalCount { get; set; }
    public List<Object> Items { get; set; }
    public List<Object> AggregatedItems { get; set; }
    public string Caption { get; set; }
    public string ShowAnchor { get; set; }
    public string AnchorAlpha { get; set; }
    public string GetxAxisName { get; set; }
    public string GetyAxisMinValue { get; set; }
    public string GetyAxisName { get; set; }
    public string DecimalPrecision { get; set; }
    public string FormatNumberScale { get; set; }
    public string NumberPrefix { get; set; }
    public string ShowNames { get; set; }
    public string ShowValues { get; set; }
    public string ShowAlternateHGridColor { get; set; }
    public string AlternateHGridColor { get; set; }
    public string DivLineColor { get; set; }
    public string DivLineAlpha { get; set; }
    public string AlternateHGridAlpha { get; set; }
    public string RotateNames { get; set; }
    public string Returning { get; set; }
}


