
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AddMovieRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// A third-party account id that is meaningful to your systems
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("thirdPartyAccountId")]
    public string? ThirdPartyAccountId { get; set; }
    /// <summary>
    /// A user defined list (comma-delimited) of tags associated with the movie
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
    /// <summary>
    /// Movie Name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("movieName")]
    public string MovieName { get; set; }
    /// <summary>
    /// An uploaded recording to analyze (Currently limited to 10MB)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("file")]
    public System.IO.Stream? File { get; set; }
    /// <summary>
    /// A recording file to download and analyze (Size limit: 1GB)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("url")]
    public string? Url { get; set; }
    /// <summary>
    /// When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("callback")]
    public string? Callback { get; set; }
}
public class AiDocsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Doc
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("doc")]
    public string Doc { get; set; }
    /// <summary>
    /// Return Topics
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("return_topics")]
    public bool? ReturnTopics { get; set; }
    /// <summary>
    /// Limit
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// Offset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offset")]
    public int? Offset { get; set; }
}
public class AiFindImagesRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Text
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("text")]
    public string Text { get; set; }
    /// <summary>
    /// Parse Flag
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parse_flag")]
    public string? ParseFlag { get; set; }
    /// <summary>
    /// Fetch Flag
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("fetch_flag")]
    public string? FetchFlag { get; set; }
    /// <summary>
    /// Size
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("size")]
    public string? Size { get; set; }
}
public class AiTagsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Tags
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string Tags { get; set; }
    /// <summary>
    /// Conditional
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("conditional")]
    public string? Conditional { get; set; }
    /// <summary>
    /// Limit
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// Offset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offset")]
    public int? Offset { get; set; }
}
public class AiTextRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Terms
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("terms")]
    public string Terms { get; set; }
    /// <summary>
    /// Conditional
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("conditional")]
    public string? Conditional { get; set; }
    /// <summary>
    /// Limit
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// Offset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offset")]
    public int? Offset { get; set; }
}
public class BatchRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// A third-party account id that is meaningful to your systems
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("thirdPartyAccountId")]
    public string? ThirdPartyAccountId { get; set; }
    /// <summary>
    /// The number of topics to return
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// The comma-delimited list of A/V batch analysis operations to run on this file. Possible values: Transcript,Topics,Emotions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("operations")]
    public string? Operations { get; set; }
    /// <summary>
    /// An uploaded recording to analyze (Currently limited to 10MB)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("file")]
    public System.IO.Stream? File { get; set; }
    /// <summary>
    /// A recording file to download and analyze (Size limit: 1GB)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("url")]
    public string? Url { get; set; }
    /// <summary>
    /// When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("callback")]
    public string? Callback { get; set; }
}
public class CreateInstantEpisodeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Request Data String
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("data")]
    public string Data { get; set; }
}
public class CreateVoiceCanvasRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// A third-party account id that is meaningful to your systems
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("thirdPartyAccountId")]
    public string? ThirdPartyAccountId { get; set; }
    /// <summary>
    /// Enum: \&quot;256x256\&quot; \&quot;512x512\&quot; \&quot;1024x1024\&quot;
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("dimensions")]
    public string Dimensions { get; set; }
    /// <summary>
    /// Provide a transcript or previously extracted topics for image generation
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("text")]
    public string? Text { get; set; }
    /// <summary>
    /// An uploaded recording to analyze (Currently limited to 10MB)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("file")]
    public System.IO.Stream? File { get; set; }
    /// <summary>
    /// A recording file to download and analyze (Size limit: 1GB)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("url")]
    public string? Url { get; set; }
    /// <summary>
    /// When false, uses the raw value from text instead of identifying topics to fetch/generate from
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parseFlag")]
    public bool? ParseFlag { get; set; }
    /// <summary>
    /// When true, fetches images instead of generating them
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("fetchFlag")]
    public bool? FetchFlag { get; set; }
    /// <summary>
    /// When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("callback")]
    public string? Callback { get; set; }
}
public class EmotionRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// A third-party account id that is meaningful to your systems
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("thirdPartyAccountId")]
    public string? ThirdPartyAccountId { get; set; }
    /// <summary>
    /// An uploaded recording to analyze (Currently limited to 10MB)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("file")]
    public System.IO.Stream? File { get; set; }
    /// <summary>
    /// A recording file to download and analyze (Size limit: 1GB)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("url")]
    public string? Url { get; set; }
    /// <summary>
    /// When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("callback")]
    public string? Callback { get; set; }
}
public class GetAddMovieResultRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Orson Request Id
    /// </summary>
    [FastEndpoints.BindFrom("requestId")]
    public string RequestId { get; set; }
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
}
public class GetBatchRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Orson Request Id
    /// </summary>
    [FastEndpoints.BindFrom("requestId")]
    public string RequestId { get; set; }
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
}
public class GetEmotionRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Orson Request Id
    /// </summary>
    [FastEndpoints.BindFrom("requestId")]
    public string RequestId { get; set; }
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
}
public class GetEpisodeStatusRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Episode ID
    /// </summary>
    [FastEndpoints.BindFrom("episodeId")]
    public long EpisodeId { get; set; }
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
}
public class GetRenderStatusRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Render ID
    /// </summary>
    [FastEndpoints.BindFrom("renderId")]
    public string RenderId { get; set; }
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
}
public class GetSTTRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Orson Request Id
    /// </summary>
    [FastEndpoints.BindFrom("requestId")]
    public string RequestId { get; set; }
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
}
public class GetTTSRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Orson Request Id
    /// </summary>
    [FastEndpoints.BindFrom("requestId")]
    public string RequestId { get; set; }
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
}
public class GetTechTuneRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Orson Request Id
    /// </summary>
    [FastEndpoints.BindFrom("requestId")]
    public string RequestId { get; set; }
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
}
public class GetTopicsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Orson Request Id
    /// </summary>
    [FastEndpoints.BindFrom("requestId")]
    public string RequestId { get; set; }
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
}
public class GetVoiceCanvasRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Orson Request Id
    /// </summary>
    [FastEndpoints.BindFrom("requestId")]
    public string RequestId { get; set; }
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
}
public class StartVideoRenderRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Request Data String
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("data")]
    public string Data { get; set; }
}
public class SttRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// A third-party account id that is meaningful to your systems
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("thirdPartyAccountId")]
    public string? ThirdPartyAccountId { get; set; }
    /// <summary>
    /// Source Language
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sourceLanguage")]
    public string? SourceLanguage { get; set; }
    /// <summary>
    /// Target Language
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("targetLanguage")]
    public string? TargetLanguage { get; set; }
    /// <summary>
    /// An uploaded recording to analyze (Currently limited to 10MB)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("file")]
    public System.IO.Stream? File { get; set; }
    /// <summary>
    /// A recording file to download and analyze (Size limit: 1GB)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("url")]
    public string? Url { get; set; }
    /// <summary>
    /// When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("callback")]
    public string? Callback { get; set; }
}
public class SummarizeTopicsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// A third-party account id that is meaningful to your systems
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("thirdPartyAccountId")]
    public string? ThirdPartyAccountId { get; set; }
    /// <summary>
    /// The text to get topics for.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("doc")]
    public string? Doc { get; set; }
    /// <summary>
    /// An uploaded recording to analyze (Currently limited to 10MB)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("file")]
    public System.IO.Stream? File { get; set; }
    /// <summary>
    /// A recording file to download and analyze (Size limit: 1GB)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("url")]
    public string? Url { get; set; }
    /// <summary>
    /// The number of results to return
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// The starting offset into the total result set to start from
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offset")]
    public int? Offset { get; set; }
    /// <summary>
    /// When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("callback")]
    public string? Callback { get; set; }
}
public class TechTuneRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// A third-party account id that is meaningful to your systems
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("thirdPartyAccountId")]
    public string? ThirdPartyAccountId { get; set; }
    /// <summary>
    /// Number of expected faces
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("numFacesExpected")]
    public int NumFacesExpected { get; set; }
    /// <summary>
    /// An uploaded recording to analyze (Currently limited to 10MB)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("file")]
    public System.IO.Stream? File { get; set; }
    /// <summary>
    /// A recording file to download and analyze (Size limit: 1GB)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("url")]
    public string? Url { get; set; }
    /// <summary>
    /// When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("callback")]
    public string? Callback { get; set; }
}
public class TtsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// A third-party account id that is meaningful to your systems
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("thirdPartyAccountId")]
    public string? ThirdPartyAccountId { get; set; }
    /// <summary>
    /// Text
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("text")]
    public string Text { get; set; }
    /// <summary>
    /// The language to use for the speaker and incoming text
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("language")]
    public string? Language { get; set; }
    /// <summary>
    /// A language-specific voice to use, or picks the language default if not provided
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("voice")]
    public string? Voice { get; set; }
    /// <summary>
    /// When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("callback")]
    public string? Callback { get; set; }
}


