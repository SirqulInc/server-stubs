namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class JsonPrimitive 
{
    public int AsInt { get; set; }
    public bool Number { get; set; }
    public bool Boolean { get; set; }
    public string AsString { get; set; }
    public bool AsBoolean { get; set; }
    public Object AsNumber { get; set; }
    public double AsDouble { get; set; }
    public float AsFloat { get; set; }
    public long AsLong { get; set; }
    public byte[] AsByte { get; set; }
    public string AsCharacter { get; set; }
    public decimal AsBigDecimal { get; set; }
    public int AsBigInteger { get; set; }
    public int AsShort { get; set; }
    public bool String { get; set; }
    public JsonObject AsJsonObject { get; set; }
    public bool JsonNull { get; set; }
    public bool JsonArray { get; set; }
    public bool JsonObject { get; set; }
    public bool VarJsonPrimitive { get; set; }
    public JsonArray AsJsonArray { get; set; }
    public JsonPrimitive AsJsonPrimitive { get; set; }
    public JsonNull AsJsonNull { get; set; }
}


