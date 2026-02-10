namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TrilatCacheRequest 
{
    public string Udid { get; set; }
    public long SourceTime { get; set; }
    public int MinimumSampleSize { get; set; }
    public List<TrilatCacheSample> Samples { get; set; }
}


