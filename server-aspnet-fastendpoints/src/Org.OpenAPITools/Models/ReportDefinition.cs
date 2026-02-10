namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ReportDefinition 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public string Query { get; set; }
    public string QueryName { get; set; }
    public string DisplayName { get; set; }
    public List<string> ColumnNames { get; set; }
    public bool NativeSql { get; set; }
    public bool Display { get; set; }
    
    /// <summary>
    /// Gets or Sets DataSource
    /// </summary>
    public enum DataSourceEnum
    {
        
        /// <summary>
        /// Enum WRITEEnum for WRITE
        /// </summary>
        WRITEEnum = 1,
        
        /// <summary>
        /// Enum ANALYTICEnum for ANALYTIC
        /// </summary>
        ANALYTICEnum = 2,
        
        /// <summary>
        /// Enum READ1Enum for READ1
        /// </summary>
        READ1Enum = 3
    }

    public DataSourceEnum DataSource { get; set; }
    public long MaxLimit { get; set; }
    public int MaxDateRange { get; set; }
    public string DisplayParams { get; set; }
    public string MetaData { get; set; }
    public string ColumnNamesRaw { get; set; }
}


