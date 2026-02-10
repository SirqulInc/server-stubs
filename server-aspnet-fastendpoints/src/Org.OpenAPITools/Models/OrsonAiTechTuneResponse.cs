namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrsonAiTechTuneResponse 
{
    public string RequestId { get; set; }
    public int ResponseCode { get; set; }
    public string ResponseRaw { get; set; }
    public int People { get; set; }
    public bool WasCutoff { get; set; }
    public int Frames { get; set; }
    public int FramesWithoutAFace { get; set; }
    public int FramesWithFaceOffscreen { get; set; }
    public int FramesWithWrongNumberOfPeople { get; set; }
    public int Height { get; set; }
    public int Width { get; set; }
    public int Fps { get; set; }
}


