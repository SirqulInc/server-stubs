namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PathingResponse 
{
    public NodeRequest Start { get; set; }
    public NodeRequest End { get; set; }
    public List<NodeRequest> Waypoints { get; set; }
    public List<NodeRequest> Exclusions { get; set; }
    public int Width { get; set; }
    public int Height { get; set; }
    public NodeRequest Southwest { get; set; }
    public NodeRequest Northeast { get; set; }
    public double MetersPerX { get; set; }
    public double MetersPerY { get; set; }
    public List<NodeRequest> Path { get; set; }
    public int PathCount { get; set; }
    public List<DirectionResponse> Directions { get; set; }
    public int DirectionCount { get; set; }
    public NodeRequest Swcalibration { get; set; }
    public double CalibrationBearings { get; set; }
    public NodeRequest Necalibration { get; set; }
}


