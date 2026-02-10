namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Note 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public string LocationDescription { get; set; }
    public Account Owner { get; set; }
    public string NotableType { get; set; }
    public long NotableId { get; set; }
    public string NoteTag { get; set; }
    public List<Note> Notes { get; set; }
    public List<YayOrNay> Likes { get; set; }
    public List<Asset> Assets { get; set; }
    public string NoteDescription { get; set; }
    public long LikeCount { get; set; }
    public long DislikeCount { get; set; }
    public long NoteCount { get; set; }
    public List<Flag> Flags { get; set; }
    public long FlagCount { get; set; }
    public FlagThreshold FlagThreshold { get; set; }
    public string ContentName { get; set; }
    public long DefaultThreshold { get; set; }
}


