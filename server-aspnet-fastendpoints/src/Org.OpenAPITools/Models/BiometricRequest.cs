namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class BiometricRequest 
{
    public BiometricImage Face { get; set; }
    public List<FingerprintBiometricImage> Fingerprints { get; set; }
}


