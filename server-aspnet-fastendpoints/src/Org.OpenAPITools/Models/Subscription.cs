namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Subscription 
{
    public long Id { get; set; }
    public bool Active { get; set; }
    public bool Valid { get; set; }
    public SubscriptionPlan SubscriptionPlan { get; set; }
    public string RemoteSubscriptionId { get; set; }
    public string PromoCode { get; set; }
    public bool Failed { get; set; }
    
    /// <summary>
    /// Gets or Sets Message
    /// </summary>
    public enum MessageEnum
    {
        
        /// <summary>
        /// Enum _400Enum for _400
        /// </summary>
        _400Enum = 1,
        
        /// <summary>
        /// Enum _403Enum for _403
        /// </summary>
        _403Enum = 2,
        
        /// <summary>
        /// Enum _500Enum for _500
        /// </summary>
        _500Enum = 3,
        
        /// <summary>
        /// Enum _600Enum for _600
        /// </summary>
        _600Enum = 4,
        
        /// <summary>
        /// Enum _1000Enum for _1000
        /// </summary>
        _1000Enum = 5,
        
        /// <summary>
        /// Enum _1001Enum for _1001
        /// </summary>
        _1001Enum = 6,
        
        /// <summary>
        /// Enum _1002Enum for _1002
        /// </summary>
        _1002Enum = 7,
        
        /// <summary>
        /// Enum _1003Enum for _1003
        /// </summary>
        _1003Enum = 8,
        
        /// <summary>
        /// Enum _1004Enum for _1004
        /// </summary>
        _1004Enum = 9,
        
        /// <summary>
        /// Enum _1005Enum for _1005
        /// </summary>
        _1005Enum = 10,
        
        /// <summary>
        /// Enum _1006Enum for _1006
        /// </summary>
        _1006Enum = 11,
        
        /// <summary>
        /// Enum _1007Enum for _1007
        /// </summary>
        _1007Enum = 12,
        
        /// <summary>
        /// Enum _1008Enum for _1008
        /// </summary>
        _1008Enum = 13,
        
        /// <summary>
        /// Enum _1009Enum for _1009
        /// </summary>
        _1009Enum = 14,
        
        /// <summary>
        /// Enum _1010Enum for _1010
        /// </summary>
        _1010Enum = 15,
        
        /// <summary>
        /// Enum _1011Enum for _1011
        /// </summary>
        _1011Enum = 16,
        
        /// <summary>
        /// Enum _1012Enum for _1012
        /// </summary>
        _1012Enum = 17,
        
        /// <summary>
        /// Enum _1013Enum for _1013
        /// </summary>
        _1013Enum = 18,
        
        /// <summary>
        /// Enum _1014Enum for _1014
        /// </summary>
        _1014Enum = 19,
        
        /// <summary>
        /// Enum _1015Enum for _1015
        /// </summary>
        _1015Enum = 20,
        
        /// <summary>
        /// Enum _1016Enum for _1016
        /// </summary>
        _1016Enum = 21,
        
        /// <summary>
        /// Enum _1017Enum for _1017
        /// </summary>
        _1017Enum = 22,
        
        /// <summary>
        /// Enum _1018Enum for _1018
        /// </summary>
        _1018Enum = 23,
        
        /// <summary>
        /// Enum _1019Enum for _1019
        /// </summary>
        _1019Enum = 24,
        
        /// <summary>
        /// Enum _1020Enum for _1020
        /// </summary>
        _1020Enum = 25,
        
        /// <summary>
        /// Enum _1021Enum for _1021
        /// </summary>
        _1021Enum = 26,
        
        /// <summary>
        /// Enum _1022Enum for _1022
        /// </summary>
        _1022Enum = 27,
        
        /// <summary>
        /// Enum _1023Enum for _1023
        /// </summary>
        _1023Enum = 28,
        
        /// <summary>
        /// Enum _1024Enum for _1024
        /// </summary>
        _1024Enum = 29,
        
        /// <summary>
        /// Enum _1025Enum for _1025
        /// </summary>
        _1025Enum = 30,
        
        /// <summary>
        /// Enum _1026Enum for _1026
        /// </summary>
        _1026Enum = 31,
        
        /// <summary>
        /// Enum _1027Enum for _1027
        /// </summary>
        _1027Enum = 32,
        
        /// <summary>
        /// Enum _1028Enum for _1028
        /// </summary>
        _1028Enum = 33,
        
        /// <summary>
        /// Enum _1029Enum for _1029
        /// </summary>
        _1029Enum = 34,
        
        /// <summary>
        /// Enum _1030Enum for _1030
        /// </summary>
        _1030Enum = 35,
        
        /// <summary>
        /// Enum _1031Enum for _1031
        /// </summary>
        _1031Enum = 36,
        
        /// <summary>
        /// Enum _1032Enum for _1032
        /// </summary>
        _1032Enum = 37,
        
        /// <summary>
        /// Enum _1033Enum for _1033
        /// </summary>
        _1033Enum = 38,
        
        /// <summary>
        /// Enum _1034Enum for _1034
        /// </summary>
        _1034Enum = 39,
        
        /// <summary>
        /// Enum _1035Enum for _1035
        /// </summary>
        _1035Enum = 40,
        
        /// <summary>
        /// Enum _1036Enum for _1036
        /// </summary>
        _1036Enum = 41,
        
        /// <summary>
        /// Enum _1037Enum for _1037
        /// </summary>
        _1037Enum = 42,
        
        /// <summary>
        /// Enum _1038Enum for _1038
        /// </summary>
        _1038Enum = 43,
        
        /// <summary>
        /// Enum _1100Enum for _1100
        /// </summary>
        _1100Enum = 44,
        
        /// <summary>
        /// Enum _1101Enum for _1101
        /// </summary>
        _1101Enum = 45,
        
        /// <summary>
        /// Enum _1102Enum for _1102
        /// </summary>
        _1102Enum = 46,
        
        /// <summary>
        /// Enum _1103Enum for _1103
        /// </summary>
        _1103Enum = 47,
        
        /// <summary>
        /// Enum _1104Enum for _1104
        /// </summary>
        _1104Enum = 48,
        
        /// <summary>
        /// Enum _1105Enum for _1105
        /// </summary>
        _1105Enum = 49,
        
        /// <summary>
        /// Enum _1106Enum for _1106
        /// </summary>
        _1106Enum = 50,
        
        /// <summary>
        /// Enum _1107Enum for _1107
        /// </summary>
        _1107Enum = 51,
        
        /// <summary>
        /// Enum _1108Enum for _1108
        /// </summary>
        _1108Enum = 52,
        
        /// <summary>
        /// Enum _1109Enum for _1109
        /// </summary>
        _1109Enum = 53,
        
        /// <summary>
        /// Enum _1110Enum for _1110
        /// </summary>
        _1110Enum = 54,
        
        /// <summary>
        /// Enum _2000Enum for _2000
        /// </summary>
        _2000Enum = 55,
        
        /// <summary>
        /// Enum _2001Enum for _2001
        /// </summary>
        _2001Enum = 56,
        
        /// <summary>
        /// Enum _2002Enum for _2002
        /// </summary>
        _2002Enum = 57,
        
        /// <summary>
        /// Enum _2003Enum for _2003
        /// </summary>
        _2003Enum = 58,
        
        /// <summary>
        /// Enum _2004Enum for _2004
        /// </summary>
        _2004Enum = 59,
        
        /// <summary>
        /// Enum _2005Enum for _2005
        /// </summary>
        _2005Enum = 60,
        
        /// <summary>
        /// Enum _2006Enum for _2006
        /// </summary>
        _2006Enum = 61,
        
        /// <summary>
        /// Enum _2007Enum for _2007
        /// </summary>
        _2007Enum = 62,
        
        /// <summary>
        /// Enum _2008Enum for _2008
        /// </summary>
        _2008Enum = 63,
        
        /// <summary>
        /// Enum _2009Enum for _2009
        /// </summary>
        _2009Enum = 64,
        
        /// <summary>
        /// Enum _2010Enum for _2010
        /// </summary>
        _2010Enum = 65,
        
        /// <summary>
        /// Enum _2011Enum for _2011
        /// </summary>
        _2011Enum = 66,
        
        /// <summary>
        /// Enum _2012Enum for _2012
        /// </summary>
        _2012Enum = 67,
        
        /// <summary>
        /// Enum _2013Enum for _2013
        /// </summary>
        _2013Enum = 68,
        
        /// <summary>
        /// Enum _2100Enum for _2100
        /// </summary>
        _2100Enum = 69,
        
        /// <summary>
        /// Enum _2101Enum for _2101
        /// </summary>
        _2101Enum = 70,
        
        /// <summary>
        /// Enum _2102Enum for _2102
        /// </summary>
        _2102Enum = 71,
        
        /// <summary>
        /// Enum _2103Enum for _2103
        /// </summary>
        _2103Enum = 72,
        
        /// <summary>
        /// Enum _2200Enum for _2200
        /// </summary>
        _2200Enum = 73,
        
        /// <summary>
        /// Enum _2201Enum for _2201
        /// </summary>
        _2201Enum = 74,
        
        /// <summary>
        /// Enum _2202Enum for _2202
        /// </summary>
        _2202Enum = 75,
        
        /// <summary>
        /// Enum _2203Enum for _2203
        /// </summary>
        _2203Enum = 76,
        
        /// <summary>
        /// Enum _2204Enum for _2204
        /// </summary>
        _2204Enum = 77,
        
        /// <summary>
        /// Enum _2205Enum for _2205
        /// </summary>
        _2205Enum = 78,
        
        /// <summary>
        /// Enum _2206Enum for _2206
        /// </summary>
        _2206Enum = 79,
        
        /// <summary>
        /// Enum _2207Enum for _2207
        /// </summary>
        _2207Enum = 80,
        
        /// <summary>
        /// Enum _2208Enum for _2208
        /// </summary>
        _2208Enum = 81,
        
        /// <summary>
        /// Enum _2209Enum for _2209
        /// </summary>
        _2209Enum = 82,
        
        /// <summary>
        /// Enum _2210Enum for _2210
        /// </summary>
        _2210Enum = 83,
        
        /// <summary>
        /// Enum _2211Enum for _2211
        /// </summary>
        _2211Enum = 84,
        
        /// <summary>
        /// Enum _2212Enum for _2212
        /// </summary>
        _2212Enum = 85,
        
        /// <summary>
        /// Enum _2300Enum for _2300
        /// </summary>
        _2300Enum = 86,
        
        /// <summary>
        /// Enum _2301Enum for _2301
        /// </summary>
        _2301Enum = 87,
        
        /// <summary>
        /// Enum _2302Enum for _2302
        /// </summary>
        _2302Enum = 88,
        
        /// <summary>
        /// Enum _2303Enum for _2303
        /// </summary>
        _2303Enum = 89,
        
        /// <summary>
        /// Enum _2400Enum for _2400
        /// </summary>
        _2400Enum = 90,
        
        /// <summary>
        /// Enum _2401Enum for _2401
        /// </summary>
        _2401Enum = 91,
        
        /// <summary>
        /// Enum _2402Enum for _2402
        /// </summary>
        _2402Enum = 92,
        
        /// <summary>
        /// Enum _2500Enum for _2500
        /// </summary>
        _2500Enum = 93,
        
        /// <summary>
        /// Enum _2501Enum for _2501
        /// </summary>
        _2501Enum = 94,
        
        /// <summary>
        /// Enum _2502Enum for _2502
        /// </summary>
        _2502Enum = 95,
        
        /// <summary>
        /// Enum _2503Enum for _2503
        /// </summary>
        _2503Enum = 96,
        
        /// <summary>
        /// Enum _2504Enum for _2504
        /// </summary>
        _2504Enum = 97,
        
        /// <summary>
        /// Enum _2505Enum for _2505
        /// </summary>
        _2505Enum = 98,
        
        /// <summary>
        /// Enum _2506Enum for _2506
        /// </summary>
        _2506Enum = 99,
        
        /// <summary>
        /// Enum _2507Enum for _2507
        /// </summary>
        _2507Enum = 100,
        
        /// <summary>
        /// Enum _2508Enum for _2508
        /// </summary>
        _2508Enum = 101,
        
        /// <summary>
        /// Enum _2509Enum for _2509
        /// </summary>
        _2509Enum = 102,
        
        /// <summary>
        /// Enum _2510Enum for _2510
        /// </summary>
        _2510Enum = 103,
        
        /// <summary>
        /// Enum _2511Enum for _2511
        /// </summary>
        _2511Enum = 104,
        
        /// <summary>
        /// Enum _2512Enum for _2512
        /// </summary>
        _2512Enum = 105,
        
        /// <summary>
        /// Enum _2513Enum for _2513
        /// </summary>
        _2513Enum = 106,
        
        /// <summary>
        /// Enum _2514Enum for _2514
        /// </summary>
        _2514Enum = 107,
        
        /// <summary>
        /// Enum _2515Enum for _2515
        /// </summary>
        _2515Enum = 108,
        
        /// <summary>
        /// Enum _2600Enum for _2600
        /// </summary>
        _2600Enum = 109,
        
        /// <summary>
        /// Enum _2601Enum for _2601
        /// </summary>
        _2601Enum = 110,
        
        /// <summary>
        /// Enum _2602Enum for _2602
        /// </summary>
        _2602Enum = 111,
        
        /// <summary>
        /// Enum _2603Enum for _2603
        /// </summary>
        _2603Enum = 112,
        
        /// <summary>
        /// Enum _2604Enum for _2604
        /// </summary>
        _2604Enum = 113,
        
        /// <summary>
        /// Enum _2700Enum for _2700
        /// </summary>
        _2700Enum = 114,
        
        /// <summary>
        /// Enum _2701Enum for _2701
        /// </summary>
        _2701Enum = 115,
        
        /// <summary>
        /// Enum _2702Enum for _2702
        /// </summary>
        _2702Enum = 116,
        
        /// <summary>
        /// Enum _2703Enum for _2703
        /// </summary>
        _2703Enum = 117,
        
        /// <summary>
        /// Enum _2704Enum for _2704
        /// </summary>
        _2704Enum = 118,
        
        /// <summary>
        /// Enum _2705Enum for _2705
        /// </summary>
        _2705Enum = 119,
        
        /// <summary>
        /// Enum _2800Enum for _2800
        /// </summary>
        _2800Enum = 120,
        
        /// <summary>
        /// Enum _2801Enum for _2801
        /// </summary>
        _2801Enum = 121,
        
        /// <summary>
        /// Enum _2900Enum for _2900
        /// </summary>
        _2900Enum = 122,
        
        /// <summary>
        /// Enum _2901Enum for _2901
        /// </summary>
        _2901Enum = 123,
        
        /// <summary>
        /// Enum _2902Enum for _2902
        /// </summary>
        _2902Enum = 124,
        
        /// <summary>
        /// Enum _2903Enum for _2903
        /// </summary>
        _2903Enum = 125,
        
        /// <summary>
        /// Enum _2904Enum for _2904
        /// </summary>
        _2904Enum = 126,
        
        /// <summary>
        /// Enum _2905Enum for _2905
        /// </summary>
        _2905Enum = 127,
        
        /// <summary>
        /// Enum _2906Enum for _2906
        /// </summary>
        _2906Enum = 128,
        
        /// <summary>
        /// Enum _3000Enum for _3000
        /// </summary>
        _3000Enum = 129,
        
        /// <summary>
        /// Enum _3001Enum for _3001
        /// </summary>
        _3001Enum = 130,
        
        /// <summary>
        /// Enum _3002Enum for _3002
        /// </summary>
        _3002Enum = 131,
        
        /// <summary>
        /// Enum _3100Enum for _3100
        /// </summary>
        _3100Enum = 132,
        
        /// <summary>
        /// Enum _3101Enum for _3101
        /// </summary>
        _3101Enum = 133,
        
        /// <summary>
        /// Enum _3102Enum for _3102
        /// </summary>
        _3102Enum = 134,
        
        /// <summary>
        /// Enum _3103Enum for _3103
        /// </summary>
        _3103Enum = 135,
        
        /// <summary>
        /// Enum _3104Enum for _3104
        /// </summary>
        _3104Enum = 136,
        
        /// <summary>
        /// Enum _3200Enum for _3200
        /// </summary>
        _3200Enum = 137,
        
        /// <summary>
        /// Enum _3201Enum for _3201
        /// </summary>
        _3201Enum = 138,
        
        /// <summary>
        /// Enum _3300Enum for _3300
        /// </summary>
        _3300Enum = 139,
        
        /// <summary>
        /// Enum _3301Enum for _3301
        /// </summary>
        _3301Enum = 140,
        
        /// <summary>
        /// Enum _3302Enum for _3302
        /// </summary>
        _3302Enum = 141,
        
        /// <summary>
        /// Enum _3303Enum for _3303
        /// </summary>
        _3303Enum = 142,
        
        /// <summary>
        /// Enum _3304Enum for _3304
        /// </summary>
        _3304Enum = 143,
        
        /// <summary>
        /// Enum _3305Enum for _3305
        /// </summary>
        _3305Enum = 144,
        
        /// <summary>
        /// Enum _3306Enum for _3306
        /// </summary>
        _3306Enum = 145,
        
        /// <summary>
        /// Enum _3307Enum for _3307
        /// </summary>
        _3307Enum = 146,
        
        /// <summary>
        /// Enum _3308Enum for _3308
        /// </summary>
        _3308Enum = 147,
        
        /// <summary>
        /// Enum _3309Enum for _3309
        /// </summary>
        _3309Enum = 148,
        
        /// <summary>
        /// Enum _3310Enum for _3310
        /// </summary>
        _3310Enum = 149,
        
        /// <summary>
        /// Enum _3311Enum for _3311
        /// </summary>
        _3311Enum = 150,
        
        /// <summary>
        /// Enum _3312Enum for _3312
        /// </summary>
        _3312Enum = 151,
        
        /// <summary>
        /// Enum _3313Enum for _3313
        /// </summary>
        _3313Enum = 152,
        
        /// <summary>
        /// Enum _3314Enum for _3314
        /// </summary>
        _3314Enum = 153,
        
        /// <summary>
        /// Enum _3315Enum for _3315
        /// </summary>
        _3315Enum = 154,
        
        /// <summary>
        /// Enum _3316Enum for _3316
        /// </summary>
        _3316Enum = 155,
        
        /// <summary>
        /// Enum _3400Enum for _3400
        /// </summary>
        _3400Enum = 156,
        
        /// <summary>
        /// Enum _3401Enum for _3401
        /// </summary>
        _3401Enum = 157,
        
        /// <summary>
        /// Enum _3500Enum for _3500
        /// </summary>
        _3500Enum = 158,
        
        /// <summary>
        /// Enum _3501Enum for _3501
        /// </summary>
        _3501Enum = 159,
        
        /// <summary>
        /// Enum _3502Enum for _3502
        /// </summary>
        _3502Enum = 160,
        
        /// <summary>
        /// Enum _3503Enum for _3503
        /// </summary>
        _3503Enum = 161,
        
        /// <summary>
        /// Enum _3504Enum for _3504
        /// </summary>
        _3504Enum = 162,
        
        /// <summary>
        /// Enum _3505Enum for _3505
        /// </summary>
        _3505Enum = 163,
        
        /// <summary>
        /// Enum _3506Enum for _3506
        /// </summary>
        _3506Enum = 164,
        
        /// <summary>
        /// Enum _3507Enum for _3507
        /// </summary>
        _3507Enum = 165,
        
        /// <summary>
        /// Enum _3508Enum for _3508
        /// </summary>
        _3508Enum = 166,
        
        /// <summary>
        /// Enum _3600Enum for _3600
        /// </summary>
        _3600Enum = 167,
        
        /// <summary>
        /// Enum _3601Enum for _3601
        /// </summary>
        _3601Enum = 168,
        
        /// <summary>
        /// Enum _3602Enum for _3602
        /// </summary>
        _3602Enum = 169,
        
        /// <summary>
        /// Enum _3603Enum for _3603
        /// </summary>
        _3603Enum = 170,
        
        /// <summary>
        /// Enum _3700Enum for _3700
        /// </summary>
        _3700Enum = 171,
        
        /// <summary>
        /// Enum _3701Enum for _3701
        /// </summary>
        _3701Enum = 172,
        
        /// <summary>
        /// Enum _3702Enum for _3702
        /// </summary>
        _3702Enum = 173,
        
        /// <summary>
        /// Enum _3703Enum for _3703
        /// </summary>
        _3703Enum = 174,
        
        /// <summary>
        /// Enum _3800Enum for _3800
        /// </summary>
        _3800Enum = 175,
        
        /// <summary>
        /// Enum _3801Enum for _3801
        /// </summary>
        _3801Enum = 176,
        
        /// <summary>
        /// Enum _3802Enum for _3802
        /// </summary>
        _3802Enum = 177,
        
        /// <summary>
        /// Enum _3803Enum for _3803
        /// </summary>
        _3803Enum = 178,
        
        /// <summary>
        /// Enum _3804Enum for _3804
        /// </summary>
        _3804Enum = 179,
        
        /// <summary>
        /// Enum _3805Enum for _3805
        /// </summary>
        _3805Enum = 180,
        
        /// <summary>
        /// Enum _3806Enum for _3806
        /// </summary>
        _3806Enum = 181,
        
        /// <summary>
        /// Enum _3807Enum for _3807
        /// </summary>
        _3807Enum = 182,
        
        /// <summary>
        /// Enum _3900Enum for _3900
        /// </summary>
        _3900Enum = 183,
        
        /// <summary>
        /// Enum _3901Enum for _3901
        /// </summary>
        _3901Enum = 184,
        
        /// <summary>
        /// Enum _3902Enum for _3902
        /// </summary>
        _3902Enum = 185,
        
        /// <summary>
        /// Enum _3903Enum for _3903
        /// </summary>
        _3903Enum = 186,
        
        /// <summary>
        /// Enum _3904Enum for _3904
        /// </summary>
        _3904Enum = 187,
        
        /// <summary>
        /// Enum _3905Enum for _3905
        /// </summary>
        _3905Enum = 188,
        
        /// <summary>
        /// Enum _4000Enum for _4000
        /// </summary>
        _4000Enum = 189,
        
        /// <summary>
        /// Enum _4001Enum for _4001
        /// </summary>
        _4001Enum = 190,
        
        /// <summary>
        /// Enum _4002Enum for _4002
        /// </summary>
        _4002Enum = 191,
        
        /// <summary>
        /// Enum _4100Enum for _4100
        /// </summary>
        _4100Enum = 192,
        
        /// <summary>
        /// Enum _4101Enum for _4101
        /// </summary>
        _4101Enum = 193,
        
        /// <summary>
        /// Enum _4102Enum for _4102
        /// </summary>
        _4102Enum = 194,
        
        /// <summary>
        /// Enum _4103Enum for _4103
        /// </summary>
        _4103Enum = 195,
        
        /// <summary>
        /// Enum _4200Enum for _4200
        /// </summary>
        _4200Enum = 196,
        
        /// <summary>
        /// Enum _4201Enum for _4201
        /// </summary>
        _4201Enum = 197,
        
        /// <summary>
        /// Enum _4202Enum for _4202
        /// </summary>
        _4202Enum = 198,
        
        /// <summary>
        /// Enum _4203Enum for _4203
        /// </summary>
        _4203Enum = 199,
        
        /// <summary>
        /// Enum _4204Enum for _4204
        /// </summary>
        _4204Enum = 200,
        
        /// <summary>
        /// Enum _4205Enum for _4205
        /// </summary>
        _4205Enum = 201,
        
        /// <summary>
        /// Enum _4300Enum for _4300
        /// </summary>
        _4300Enum = 202,
        
        /// <summary>
        /// Enum _4301Enum for _4301
        /// </summary>
        _4301Enum = 203,
        
        /// <summary>
        /// Enum _4302Enum for _4302
        /// </summary>
        _4302Enum = 204,
        
        /// <summary>
        /// Enum _4303Enum for _4303
        /// </summary>
        _4303Enum = 205,
        
        /// <summary>
        /// Enum _4304Enum for _4304
        /// </summary>
        _4304Enum = 206,
        
        /// <summary>
        /// Enum _4400Enum for _4400
        /// </summary>
        _4400Enum = 207,
        
        /// <summary>
        /// Enum _4401Enum for _4401
        /// </summary>
        _4401Enum = 208,
        
        /// <summary>
        /// Enum _4500Enum for _4500
        /// </summary>
        _4500Enum = 209,
        
        /// <summary>
        /// Enum _4501Enum for _4501
        /// </summary>
        _4501Enum = 210,
        
        /// <summary>
        /// Enum _4502Enum for _4502
        /// </summary>
        _4502Enum = 211,
        
        /// <summary>
        /// Enum _4503Enum for _4503
        /// </summary>
        _4503Enum = 212,
        
        /// <summary>
        /// Enum _4504Enum for _4504
        /// </summary>
        _4504Enum = 213,
        
        /// <summary>
        /// Enum _4505Enum for _4505
        /// </summary>
        _4505Enum = 214,
        
        /// <summary>
        /// Enum _4600Enum for _4600
        /// </summary>
        _4600Enum = 215,
        
        /// <summary>
        /// Enum _4700Enum for _4700
        /// </summary>
        _4700Enum = 216,
        
        /// <summary>
        /// Enum _4701Enum for _4701
        /// </summary>
        _4701Enum = 217,
        
        /// <summary>
        /// Enum _4702Enum for _4702
        /// </summary>
        _4702Enum = 218,
        
        /// <summary>
        /// Enum _4800Enum for _4800
        /// </summary>
        _4800Enum = 219,
        
        /// <summary>
        /// Enum _4801Enum for _4801
        /// </summary>
        _4801Enum = 220,
        
        /// <summary>
        /// Enum _4900Enum for _4900
        /// </summary>
        _4900Enum = 221,
        
        /// <summary>
        /// Enum _4901Enum for _4901
        /// </summary>
        _4901Enum = 222,
        
        /// <summary>
        /// Enum _4902Enum for _4902
        /// </summary>
        _4902Enum = 223,
        
        /// <summary>
        /// Enum _4903Enum for _4903
        /// </summary>
        _4903Enum = 224,
        
        /// <summary>
        /// Enum _4904Enum for _4904
        /// </summary>
        _4904Enum = 225,
        
        /// <summary>
        /// Enum _4905Enum for _4905
        /// </summary>
        _4905Enum = 226,
        
        /// <summary>
        /// Enum _4906Enum for _4906
        /// </summary>
        _4906Enum = 227,
        
        /// <summary>
        /// Enum _5000Enum for _5000
        /// </summary>
        _5000Enum = 228,
        
        /// <summary>
        /// Enum _5001Enum for _5001
        /// </summary>
        _5001Enum = 229,
        
        /// <summary>
        /// Enum _5002Enum for _5002
        /// </summary>
        _5002Enum = 230,
        
        /// <summary>
        /// Enum _5003Enum for _5003
        /// </summary>
        _5003Enum = 231,
        
        /// <summary>
        /// Enum _5100Enum for _5100
        /// </summary>
        _5100Enum = 232,
        
        /// <summary>
        /// Enum _5101Enum for _5101
        /// </summary>
        _5101Enum = 233,
        
        /// <summary>
        /// Enum _5102Enum for _5102
        /// </summary>
        _5102Enum = 234,
        
        /// <summary>
        /// Enum _5103Enum for _5103
        /// </summary>
        _5103Enum = 235,
        
        /// <summary>
        /// Enum _5104Enum for _5104
        /// </summary>
        _5104Enum = 236,
        
        /// <summary>
        /// Enum _5200Enum for _5200
        /// </summary>
        _5200Enum = 237,
        
        /// <summary>
        /// Enum _5300Enum for _5300
        /// </summary>
        _5300Enum = 238,
        
        /// <summary>
        /// Enum _5301Enum for _5301
        /// </summary>
        _5301Enum = 239,
        
        /// <summary>
        /// Enum _5302Enum for _5302
        /// </summary>
        _5302Enum = 240,
        
        /// <summary>
        /// Enum _5303Enum for _5303
        /// </summary>
        _5303Enum = 241,
        
        /// <summary>
        /// Enum _5400Enum for _5400
        /// </summary>
        _5400Enum = 242,
        
        /// <summary>
        /// Enum _5500Enum for _5500
        /// </summary>
        _5500Enum = 243,
        
        /// <summary>
        /// Enum _5501Enum for _5501
        /// </summary>
        _5501Enum = 244,
        
        /// <summary>
        /// Enum _5600Enum for _5600
        /// </summary>
        _5600Enum = 245,
        
        /// <summary>
        /// Enum _5601Enum for _5601
        /// </summary>
        _5601Enum = 246,
        
        /// <summary>
        /// Enum _5602Enum for _5602
        /// </summary>
        _5602Enum = 247,
        
        /// <summary>
        /// Enum _5603Enum for _5603
        /// </summary>
        _5603Enum = 248,
        
        /// <summary>
        /// Enum _5604Enum for _5604
        /// </summary>
        _5604Enum = 249,
        
        /// <summary>
        /// Enum _5606Enum for _5606
        /// </summary>
        _5606Enum = 250,
        
        /// <summary>
        /// Enum _5607Enum for _5607
        /// </summary>
        _5607Enum = 251,
        
        /// <summary>
        /// Enum _5608Enum for _5608
        /// </summary>
        _5608Enum = 252,
        
        /// <summary>
        /// Enum _5609Enum for _5609
        /// </summary>
        _5609Enum = 253,
        
        /// <summary>
        /// Enum _5700Enum for _5700
        /// </summary>
        _5700Enum = 254,
        
        /// <summary>
        /// Enum _5701Enum for _5701
        /// </summary>
        _5701Enum = 255,
        
        /// <summary>
        /// Enum _5702Enum for _5702
        /// </summary>
        _5702Enum = 256,
        
        /// <summary>
        /// Enum _5703Enum for _5703
        /// </summary>
        _5703Enum = 257,
        
        /// <summary>
        /// Enum _5704Enum for _5704
        /// </summary>
        _5704Enum = 258,
        
        /// <summary>
        /// Enum _5705Enum for _5705
        /// </summary>
        _5705Enum = 259,
        
        /// <summary>
        /// Enum _5800Enum for _5800
        /// </summary>
        _5800Enum = 260,
        
        /// <summary>
        /// Enum _5801Enum for _5801
        /// </summary>
        _5801Enum = 261,
        
        /// <summary>
        /// Enum _5802Enum for _5802
        /// </summary>
        _5802Enum = 262,
        
        /// <summary>
        /// Enum _5803Enum for _5803
        /// </summary>
        _5803Enum = 263,
        
        /// <summary>
        /// Enum _5804Enum for _5804
        /// </summary>
        _5804Enum = 264,
        
        /// <summary>
        /// Enum _5805Enum for _5805
        /// </summary>
        _5805Enum = 265,
        
        /// <summary>
        /// Enum _5806Enum for _5806
        /// </summary>
        _5806Enum = 266,
        
        /// <summary>
        /// Enum _5807Enum for _5807
        /// </summary>
        _5807Enum = 267,
        
        /// <summary>
        /// Enum _5900Enum for _5900
        /// </summary>
        _5900Enum = 268,
        
        /// <summary>
        /// Enum _5901Enum for _5901
        /// </summary>
        _5901Enum = 269,
        
        /// <summary>
        /// Enum _5902Enum for _5902
        /// </summary>
        _5902Enum = 270,
        
        /// <summary>
        /// Enum _5903Enum for _5903
        /// </summary>
        _5903Enum = 271,
        
        /// <summary>
        /// Enum _5904Enum for _5904
        /// </summary>
        _5904Enum = 272,
        
        /// <summary>
        /// Enum _5905Enum for _5905
        /// </summary>
        _5905Enum = 273,
        
        /// <summary>
        /// Enum _5906Enum for _5906
        /// </summary>
        _5906Enum = 274,
        
        /// <summary>
        /// Enum _5907Enum for _5907
        /// </summary>
        _5907Enum = 275,
        
        /// <summary>
        /// Enum _5908Enum for _5908
        /// </summary>
        _5908Enum = 276,
        
        /// <summary>
        /// Enum _5909Enum for _5909
        /// </summary>
        _5909Enum = 277,
        
        /// <summary>
        /// Enum _5910Enum for _5910
        /// </summary>
        _5910Enum = 278,
        
        /// <summary>
        /// Enum _5911Enum for _5911
        /// </summary>
        _5911Enum = 279,
        
        /// <summary>
        /// Enum _5912Enum for _5912
        /// </summary>
        _5912Enum = 280,
        
        /// <summary>
        /// Enum _5913Enum for _5913
        /// </summary>
        _5913Enum = 281,
        
        /// <summary>
        /// Enum _5914Enum for _5914
        /// </summary>
        _5914Enum = 282,
        
        /// <summary>
        /// Enum _5915Enum for _5915
        /// </summary>
        _5915Enum = 283,
        
        /// <summary>
        /// Enum _5916Enum for _5916
        /// </summary>
        _5916Enum = 284,
        
        /// <summary>
        /// Enum _6000Enum for _6000
        /// </summary>
        _6000Enum = 285,
        
        /// <summary>
        /// Enum _6001Enum for _6001
        /// </summary>
        _6001Enum = 286,
        
        /// <summary>
        /// Enum _6100Enum for _6100
        /// </summary>
        _6100Enum = 287,
        
        /// <summary>
        /// Enum _6101Enum for _6101
        /// </summary>
        _6101Enum = 288,
        
        /// <summary>
        /// Enum _6102Enum for _6102
        /// </summary>
        _6102Enum = 289,
        
        /// <summary>
        /// Enum _6103Enum for _6103
        /// </summary>
        _6103Enum = 290,
        
        /// <summary>
        /// Enum _6200Enum for _6200
        /// </summary>
        _6200Enum = 291,
        
        /// <summary>
        /// Enum _6201Enum for _6201
        /// </summary>
        _6201Enum = 292,
        
        /// <summary>
        /// Enum _6202Enum for _6202
        /// </summary>
        _6202Enum = 293,
        
        /// <summary>
        /// Enum _6300Enum for _6300
        /// </summary>
        _6300Enum = 294,
        
        /// <summary>
        /// Enum _6301Enum for _6301
        /// </summary>
        _6301Enum = 295,
        
        /// <summary>
        /// Enum _6302Enum for _6302
        /// </summary>
        _6302Enum = 296,
        
        /// <summary>
        /// Enum _6303Enum for _6303
        /// </summary>
        _6303Enum = 297,
        
        /// <summary>
        /// Enum _6304Enum for _6304
        /// </summary>
        _6304Enum = 298,
        
        /// <summary>
        /// Enum _6305Enum for _6305
        /// </summary>
        _6305Enum = 299,
        
        /// <summary>
        /// Enum _6306Enum for _6306
        /// </summary>
        _6306Enum = 300,
        
        /// <summary>
        /// Enum _6307Enum for _6307
        /// </summary>
        _6307Enum = 301,
        
        /// <summary>
        /// Enum _6308Enum for _6308
        /// </summary>
        _6308Enum = 302,
        
        /// <summary>
        /// Enum _6309Enum for _6309
        /// </summary>
        _6309Enum = 303,
        
        /// <summary>
        /// Enum _6310Enum for _6310
        /// </summary>
        _6310Enum = 304,
        
        /// <summary>
        /// Enum _6311Enum for _6311
        /// </summary>
        _6311Enum = 305,
        
        /// <summary>
        /// Enum _6312Enum for _6312
        /// </summary>
        _6312Enum = 306,
        
        /// <summary>
        /// Enum _6400Enum for _6400
        /// </summary>
        _6400Enum = 307,
        
        /// <summary>
        /// Enum _6401Enum for _6401
        /// </summary>
        _6401Enum = 308,
        
        /// <summary>
        /// Enum _6402Enum for _6402
        /// </summary>
        _6402Enum = 309,
        
        /// <summary>
        /// Enum _6403Enum for _6403
        /// </summary>
        _6403Enum = 310,
        
        /// <summary>
        /// Enum _6404Enum for _6404
        /// </summary>
        _6404Enum = 311,
        
        /// <summary>
        /// Enum _6500Enum for _6500
        /// </summary>
        _6500Enum = 312,
        
        /// <summary>
        /// Enum _6501Enum for _6501
        /// </summary>
        _6501Enum = 313,
        
        /// <summary>
        /// Enum _6502Enum for _6502
        /// </summary>
        _6502Enum = 314,
        
        /// <summary>
        /// Enum _6600Enum for _6600
        /// </summary>
        _6600Enum = 315,
        
        /// <summary>
        /// Enum _6601Enum for _6601
        /// </summary>
        _6601Enum = 316,
        
        /// <summary>
        /// Enum _6602Enum for _6602
        /// </summary>
        _6602Enum = 317,
        
        /// <summary>
        /// Enum _6603Enum for _6603
        /// </summary>
        _6603Enum = 318,
        
        /// <summary>
        /// Enum _6700Enum for _6700
        /// </summary>
        _6700Enum = 319,
        
        /// <summary>
        /// Enum _6701Enum for _6701
        /// </summary>
        _6701Enum = 320,
        
        /// <summary>
        /// Enum _6702Enum for _6702
        /// </summary>
        _6702Enum = 321,
        
        /// <summary>
        /// Enum _6703Enum for _6703
        /// </summary>
        _6703Enum = 322,
        
        /// <summary>
        /// Enum _6704Enum for _6704
        /// </summary>
        _6704Enum = 323,
        
        /// <summary>
        /// Enum _6705Enum for _6705
        /// </summary>
        _6705Enum = 324,
        
        /// <summary>
        /// Enum _6706Enum for _6706
        /// </summary>
        _6706Enum = 325,
        
        /// <summary>
        /// Enum _6707Enum for _6707
        /// </summary>
        _6707Enum = 326,
        
        /// <summary>
        /// Enum _6708Enum for _6708
        /// </summary>
        _6708Enum = 327,
        
        /// <summary>
        /// Enum _6709Enum for _6709
        /// </summary>
        _6709Enum = 328,
        
        /// <summary>
        /// Enum _6800Enum for _6800
        /// </summary>
        _6800Enum = 329,
        
        /// <summary>
        /// Enum _6801Enum for _6801
        /// </summary>
        _6801Enum = 330,
        
        /// <summary>
        /// Enum _6802Enum for _6802
        /// </summary>
        _6802Enum = 331,
        
        /// <summary>
        /// Enum _6803Enum for _6803
        /// </summary>
        _6803Enum = 332,
        
        /// <summary>
        /// Enum _6900Enum for _6900
        /// </summary>
        _6900Enum = 333,
        
        /// <summary>
        /// Enum _6901Enum for _6901
        /// </summary>
        _6901Enum = 334,
        
        /// <summary>
        /// Enum _6902Enum for _6902
        /// </summary>
        _6902Enum = 335,
        
        /// <summary>
        /// Enum _6903Enum for _6903
        /// </summary>
        _6903Enum = 336,
        
        /// <summary>
        /// Enum _7000Enum for _7000
        /// </summary>
        _7000Enum = 337,
        
        /// <summary>
        /// Enum _7100Enum for _7100
        /// </summary>
        _7100Enum = 338,
        
        /// <summary>
        /// Enum _7101Enum for _7101
        /// </summary>
        _7101Enum = 339,
        
        /// <summary>
        /// Enum _7102Enum for _7102
        /// </summary>
        _7102Enum = 340,
        
        /// <summary>
        /// Enum _7200Enum for _7200
        /// </summary>
        _7200Enum = 341,
        
        /// <summary>
        /// Enum _7201Enum for _7201
        /// </summary>
        _7201Enum = 342,
        
        /// <summary>
        /// Enum _7300Enum for _7300
        /// </summary>
        _7300Enum = 343,
        
        /// <summary>
        /// Enum _7301Enum for _7301
        /// </summary>
        _7301Enum = 344,
        
        /// <summary>
        /// Enum _7302Enum for _7302
        /// </summary>
        _7302Enum = 345,
        
        /// <summary>
        /// Enum _7303Enum for _7303
        /// </summary>
        _7303Enum = 346,
        
        /// <summary>
        /// Enum _7400Enum for _7400
        /// </summary>
        _7400Enum = 347,
        
        /// <summary>
        /// Enum _7401Enum for _7401
        /// </summary>
        _7401Enum = 348,
        
        /// <summary>
        /// Enum _7402Enum for _7402
        /// </summary>
        _7402Enum = 349,
        
        /// <summary>
        /// Enum _7403Enum for _7403
        /// </summary>
        _7403Enum = 350,
        
        /// <summary>
        /// Enum _7404Enum for _7404
        /// </summary>
        _7404Enum = 351,
        
        /// <summary>
        /// Enum _7405Enum for _7405
        /// </summary>
        _7405Enum = 352,
        
        /// <summary>
        /// Enum _7500Enum for _7500
        /// </summary>
        _7500Enum = 353,
        
        /// <summary>
        /// Enum _7501Enum for _7501
        /// </summary>
        _7501Enum = 354,
        
        /// <summary>
        /// Enum _7600Enum for _7600
        /// </summary>
        _7600Enum = 355,
        
        /// <summary>
        /// Enum _7601Enum for _7601
        /// </summary>
        _7601Enum = 356,
        
        /// <summary>
        /// Enum _7602Enum for _7602
        /// </summary>
        _7602Enum = 357,
        
        /// <summary>
        /// Enum _7603Enum for _7603
        /// </summary>
        _7603Enum = 358,
        
        /// <summary>
        /// Enum _7604Enum for _7604
        /// </summary>
        _7604Enum = 359,
        
        /// <summary>
        /// Enum _7605Enum for _7605
        /// </summary>
        _7605Enum = 360,
        
        /// <summary>
        /// Enum _7606Enum for _7606
        /// </summary>
        _7606Enum = 361,
        
        /// <summary>
        /// Enum _7700Enum for _7700
        /// </summary>
        _7700Enum = 362,
        
        /// <summary>
        /// Enum _7701Enum for _7701
        /// </summary>
        _7701Enum = 363,
        
        /// <summary>
        /// Enum _7702Enum for _7702
        /// </summary>
        _7702Enum = 364,
        
        /// <summary>
        /// Enum _7703Enum for _7703
        /// </summary>
        _7703Enum = 365,
        
        /// <summary>
        /// Enum _7704Enum for _7704
        /// </summary>
        _7704Enum = 366,
        
        /// <summary>
        /// Enum _7705Enum for _7705
        /// </summary>
        _7705Enum = 367,
        
        /// <summary>
        /// Enum _7706Enum for _7706
        /// </summary>
        _7706Enum = 368,
        
        /// <summary>
        /// Enum _7707Enum for _7707
        /// </summary>
        _7707Enum = 369,
        
        /// <summary>
        /// Enum _7800Enum for _7800
        /// </summary>
        _7800Enum = 370,
        
        /// <summary>
        /// Enum _7801Enum for _7801
        /// </summary>
        _7801Enum = 371,
        
        /// <summary>
        /// Enum _7802Enum for _7802
        /// </summary>
        _7802Enum = 372,
        
        /// <summary>
        /// Enum _7803Enum for _7803
        /// </summary>
        _7803Enum = 373,
        
        /// <summary>
        /// Enum _7804Enum for _7804
        /// </summary>
        _7804Enum = 374,
        
        /// <summary>
        /// Enum _7805Enum for _7805
        /// </summary>
        _7805Enum = 375,
        
        /// <summary>
        /// Enum _7806Enum for _7806
        /// </summary>
        _7806Enum = 376,
        
        /// <summary>
        /// Enum _7807Enum for _7807
        /// </summary>
        _7807Enum = 377,
        
        /// <summary>
        /// Enum _7808Enum for _7808
        /// </summary>
        _7808Enum = 378,
        
        /// <summary>
        /// Enum _7809Enum for _7809
        /// </summary>
        _7809Enum = 379,
        
        /// <summary>
        /// Enum _7810Enum for _7810
        /// </summary>
        _7810Enum = 380,
        
        /// <summary>
        /// Enum _7811Enum for _7811
        /// </summary>
        _7811Enum = 381,
        
        /// <summary>
        /// Enum _7812Enum for _7812
        /// </summary>
        _7812Enum = 382,
        
        /// <summary>
        /// Enum _7813Enum for _7813
        /// </summary>
        _7813Enum = 383,
        
        /// <summary>
        /// Enum _7814Enum for _7814
        /// </summary>
        _7814Enum = 384,
        
        /// <summary>
        /// Enum _7815Enum for _7815
        /// </summary>
        _7815Enum = 385,
        
        /// <summary>
        /// Enum _7817Enum for _7817
        /// </summary>
        _7817Enum = 386,
        
        /// <summary>
        /// Enum _7818Enum for _7818
        /// </summary>
        _7818Enum = 387,
        
        /// <summary>
        /// Enum _7819Enum for _7819
        /// </summary>
        _7819Enum = 388,
        
        /// <summary>
        /// Enum _7900Enum for _7900
        /// </summary>
        _7900Enum = 389,
        
        /// <summary>
        /// Enum _7901Enum for _7901
        /// </summary>
        _7901Enum = 390,
        
        /// <summary>
        /// Enum _7902Enum for _7902
        /// </summary>
        _7902Enum = 391,
        
        /// <summary>
        /// Enum _7903Enum for _7903
        /// </summary>
        _7903Enum = 392,
        
        /// <summary>
        /// Enum _7904Enum for _7904
        /// </summary>
        _7904Enum = 393,
        
        /// <summary>
        /// Enum _7905Enum for _7905
        /// </summary>
        _7905Enum = 394,
        
        /// <summary>
        /// Enum _7906Enum for _7906
        /// </summary>
        _7906Enum = 395,
        
        /// <summary>
        /// Enum _8000Enum for _8000
        /// </summary>
        _8000Enum = 396,
        
        /// <summary>
        /// Enum _8001Enum for _8001
        /// </summary>
        _8001Enum = 397,
        
        /// <summary>
        /// Enum _8100Enum for _8100
        /// </summary>
        _8100Enum = 398,
        
        /// <summary>
        /// Enum _8101Enum for _8101
        /// </summary>
        _8101Enum = 399,
        
        /// <summary>
        /// Enum _8102Enum for _8102
        /// </summary>
        _8102Enum = 400,
        
        /// <summary>
        /// Enum _8103Enum for _8103
        /// </summary>
        _8103Enum = 401,
        
        /// <summary>
        /// Enum _8104Enum for _8104
        /// </summary>
        _8104Enum = 402,
        
        /// <summary>
        /// Enum _8105Enum for _8105
        /// </summary>
        _8105Enum = 403,
        
        /// <summary>
        /// Enum _8107Enum for _8107
        /// </summary>
        _8107Enum = 404,
        
        /// <summary>
        /// Enum _8108Enum for _8108
        /// </summary>
        _8108Enum = 405,
        
        /// <summary>
        /// Enum _8200Enum for _8200
        /// </summary>
        _8200Enum = 406,
        
        /// <summary>
        /// Enum _8201Enum for _8201
        /// </summary>
        _8201Enum = 407,
        
        /// <summary>
        /// Enum _10000Enum for _10000
        /// </summary>
        _10000Enum = 408,
        
        /// <summary>
        /// Enum _10001Enum for _10001
        /// </summary>
        _10001Enum = 409,
        
        /// <summary>
        /// Enum _10002Enum for _10002
        /// </summary>
        _10002Enum = 410,
        
        /// <summary>
        /// Enum _10003Enum for _10003
        /// </summary>
        _10003Enum = 411,
        
        /// <summary>
        /// Enum _10004Enum for _10004
        /// </summary>
        _10004Enum = 412,
        
        /// <summary>
        /// Enum _10005Enum for _10005
        /// </summary>
        _10005Enum = 413,
        
        /// <summary>
        /// Enum _10006Enum for _10006
        /// </summary>
        _10006Enum = 414,
        
        /// <summary>
        /// Enum _10020Enum for _10020
        /// </summary>
        _10020Enum = 415,
        
        /// <summary>
        /// Enum _10021Enum for _10021
        /// </summary>
        _10021Enum = 416,
        
        /// <summary>
        /// Enum _10022Enum for _10022
        /// </summary>
        _10022Enum = 417,
        
        /// <summary>
        /// Enum _10040Enum for _10040
        /// </summary>
        _10040Enum = 418,
        
        /// <summary>
        /// Enum _10041Enum for _10041
        /// </summary>
        _10041Enum = 419,
        
        /// <summary>
        /// Enum _10042Enum for _10042
        /// </summary>
        _10042Enum = 420,
        
        /// <summary>
        /// Enum _10043Enum for _10043
        /// </summary>
        _10043Enum = 421,
        
        /// <summary>
        /// Enum _11000Enum for _11000
        /// </summary>
        _11000Enum = 422,
        
        /// <summary>
        /// Enum _11001Enum for _11001
        /// </summary>
        _11001Enum = 423,
        
        /// <summary>
        /// Enum _11002Enum for _11002
        /// </summary>
        _11002Enum = 424,
        
        /// <summary>
        /// Enum _11003Enum for _11003
        /// </summary>
        _11003Enum = 425,
        
        /// <summary>
        /// Enum _11004Enum for _11004
        /// </summary>
        _11004Enum = 426,
        
        /// <summary>
        /// Enum _11005Enum for _11005
        /// </summary>
        _11005Enum = 427,
        
        /// <summary>
        /// Enum _12000Enum for _12000
        /// </summary>
        _12000Enum = 428,
        
        /// <summary>
        /// Enum _12001Enum for _12001
        /// </summary>
        _12001Enum = 429,
        
        /// <summary>
        /// Enum _12002Enum for _12002
        /// </summary>
        _12002Enum = 430,
        
        /// <summary>
        /// Enum _12003Enum for _12003
        /// </summary>
        _12003Enum = 431,
        
        /// <summary>
        /// Enum _12004Enum for _12004
        /// </summary>
        _12004Enum = 432,
        
        /// <summary>
        /// Enum _12005Enum for _12005
        /// </summary>
        _12005Enum = 433,
        
        /// <summary>
        /// Enum _13000Enum for _13000
        /// </summary>
        _13000Enum = 434,
        
        /// <summary>
        /// Enum _13001Enum for _13001
        /// </summary>
        _13001Enum = 435,
        
        /// <summary>
        /// Enum _13002Enum for _13002
        /// </summary>
        _13002Enum = 436,
        
        /// <summary>
        /// Enum _14000Enum for _14000
        /// </summary>
        _14000Enum = 437,
        
        /// <summary>
        /// Enum _14001Enum for _14001
        /// </summary>
        _14001Enum = 438,
        
        /// <summary>
        /// Enum _14002Enum for _14002
        /// </summary>
        _14002Enum = 439,
        
        /// <summary>
        /// Enum _14003Enum for _14003
        /// </summary>
        _14003Enum = 440,
        
        /// <summary>
        /// Enum _14004Enum for _14004
        /// </summary>
        _14004Enum = 441,
        
        /// <summary>
        /// Enum _14005Enum for _14005
        /// </summary>
        _14005Enum = 442,
        
        /// <summary>
        /// Enum _14006Enum for _14006
        /// </summary>
        _14006Enum = 443,
        
        /// <summary>
        /// Enum _14007Enum for _14007
        /// </summary>
        _14007Enum = 444,
        
        /// <summary>
        /// Enum _14008Enum for _14008
        /// </summary>
        _14008Enum = 445,
        
        /// <summary>
        /// Enum _14009Enum for _14009
        /// </summary>
        _14009Enum = 446,
        
        /// <summary>
        /// Enum _14010Enum for _14010
        /// </summary>
        _14010Enum = 447,
        
        /// <summary>
        /// Enum _14011Enum for _14011
        /// </summary>
        _14011Enum = 448,
        
        /// <summary>
        /// Enum _14012Enum for _14012
        /// </summary>
        _14012Enum = 449
    }

    public MessageEnum Message { get; set; }
}


