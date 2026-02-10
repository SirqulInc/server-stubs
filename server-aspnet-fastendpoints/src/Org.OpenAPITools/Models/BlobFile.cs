namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class BlobFile 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public Account Owner { get; set; }
    public Application Application { get; set; }
    public string FolderUri { get; set; }
    public string FileName { get; set; }
    public List<byte[]> File { get; set; }
}


