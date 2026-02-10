using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Add Movie
/// </summary>

public class AddMovieEndpoint : FastEndpoints.Endpoint<AddMovieRequest, OrsonAiAddMovieResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/orson/ai/addMovie");
        
        
        AllowAnonymous();
        AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Orson");
        });

        Summary(s => {
            s.Summary = "Add Movie";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.MovieName, "Movie Name");
            s.RequestParam(r => r.ThirdPartyAccountId, "A third-party account id that is meaningful to your systems");
            s.RequestParam(r => r.Tags, "A user defined list (comma-delimited) of tags associated with the movie");
            s.RequestParam(r => r.File, "An uploaded recording to analyze (Currently limited to 10MB)");
            s.RequestParam(r => r.Url, "A recording file to download and analyze (Size limit: 1GB)");
            s.RequestParam(r => r.Callback, "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AddMovieRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Docs
/// </summary>

public class AiDocsEndpoint : FastEndpoints.Endpoint<AiDocsRequest, OrsonAiProtoResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/orson/ai/docs");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Orson");
        });

        Summary(s => {
            s.Summary = "Search Docs";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.Doc, "Doc");
            s.RequestParam(r => r.ReturnTopics, "Return Topics");
            s.RequestParam(r => r.Limit, "Limit");
            s.RequestParam(r => r.Offset, "Offset");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AiDocsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Find images
/// </summary>

public class AiFindImagesEndpoint : FastEndpoints.Endpoint<AiFindImagesRequest, OrsonAiProtoResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/orson/ai/img");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Orson");
        });

        Summary(s => {
            s.Summary = "Find images";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.Text, "Text");
            s.RequestParam(r => r.ParseFlag, "Parse Flag");
            s.RequestParam(r => r.FetchFlag, "Fetch Flag");
            s.RequestParam(r => r.Size, "Size");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AiFindImagesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Tags
/// </summary>

public class AiTagsEndpoint : FastEndpoints.Endpoint<AiTagsRequest, OrsonAiProtoResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/orson/ai/tags");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Orson");
        });

        Summary(s => {
            s.Summary = "Search Tags";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.Tags, "Tags");
            s.RequestParam(r => r.Conditional, "Conditional");
            s.RequestParam(r => r.Limit, "Limit");
            s.RequestParam(r => r.Offset, "Offset");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AiTagsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Text
/// </summary>

public class AiTextEndpoint : FastEndpoints.Endpoint<AiTextRequest, OrsonAiProtoResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/orson/ai/text");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Orson");
        });

        Summary(s => {
            s.Summary = "Search Text";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.Terms, "Terms");
            s.RequestParam(r => r.Conditional, "Conditional");
            s.RequestParam(r => r.Limit, "Limit");
            s.RequestParam(r => r.Offset, "Offset");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AiTextRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Batch Analysis
/// </summary>

public class BatchEndpoint : FastEndpoints.Endpoint<BatchRequest, OrsonAiBatchResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/orson/ai/batch");
        
        
        AllowAnonymous();
        AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Orson");
        });

        Summary(s => {
            s.Summary = "Batch Analysis";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.ThirdPartyAccountId, "A third-party account id that is meaningful to your systems");
            s.RequestParam(r => r.Limit, "The number of topics to return");
            s.RequestParam(r => r.Operations, "The comma-delimited list of A/V batch analysis operations to run on this file. Possible values: Transcript,Topics,Emotions");
            s.RequestParam(r => r.File, "An uploaded recording to analyze (Currently limited to 10MB)");
            s.RequestParam(r => r.Url, "A recording file to download and analyze (Size limit: 1GB)");
            s.RequestParam(r => r.Callback, "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(BatchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Creates an instant episode
/// </summary>

public class CreateInstantEpisodeEndpoint : FastEndpoints.Endpoint<CreateInstantEpisodeRequest, OrsonEpisodeResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/orson/stories/episodes/instant");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Orson");
        });

        Summary(s => {
            s.Summary = "Creates an instant episode";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.Data, "Request Data String");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateInstantEpisodeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create VoiceCanvas images
/// </summary>

public class CreateVoiceCanvasEndpoint : FastEndpoints.Endpoint<CreateVoiceCanvasRequest, OrsonAiVoiceCanvasResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/orson/ai/voiceCanvas");
        
        
        AllowAnonymous();
        AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Orson");
        });

        Summary(s => {
            s.Summary = "Create VoiceCanvas images";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.Dimensions, "Enum: \&quot;256x256\&quot; \&quot;512x512\&quot; \&quot;1024x1024\&quot;");
            s.RequestParam(r => r.ThirdPartyAccountId, "A third-party account id that is meaningful to your systems");
            s.RequestParam(r => r.Text, "Provide a transcript or previously extracted topics for image generation");
            s.RequestParam(r => r.File, "An uploaded recording to analyze (Currently limited to 10MB)");
            s.RequestParam(r => r.Url, "A recording file to download and analyze (Size limit: 1GB)");
            s.RequestParam(r => r.ParseFlag, "When false, uses the raw value from text instead of identifying topics to fetch/generate from");
            s.RequestParam(r => r.FetchFlag, "When true, fetches images instead of generating them");
            s.RequestParam(r => r.Callback, "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateVoiceCanvasRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Detect emotions
/// </summary>

public class EmotionEndpoint : FastEndpoints.Endpoint<EmotionRequest, OrsonAiEmotionsResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/orson/ai/emotion");
        
        
        AllowAnonymous();
        AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Orson");
        });

        Summary(s => {
            s.Summary = "Detect emotions";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.ThirdPartyAccountId, "A third-party account id that is meaningful to your systems");
            s.RequestParam(r => r.File, "An uploaded recording to analyze (Currently limited to 10MB)");
            s.RequestParam(r => r.Url, "A recording file to download and analyze (Size limit: 1GB)");
            s.RequestParam(r => r.Callback, "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(EmotionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Add Movie Result
/// </summary>

public class GetAddMovieResultEndpoint : FastEndpoints.Endpoint<GetAddMovieResultRequest, OrsonAiAddMovieResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/orson/ai/addMovie/{requestId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Orson");
        });

        Summary(s => {
            s.Summary = "Get Add Movie Result";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RequestId, "Orson Request Id");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetAddMovieResultRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Batch Analysis Results
/// </summary>

public class GetBatchEndpoint : FastEndpoints.Endpoint<GetBatchRequest, OrsonAiBatchResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/orson/ai/batch/{requestId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Orson");
        });

        Summary(s => {
            s.Summary = "Get Batch Analysis Results";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RequestId, "Orson Request Id");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetBatchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Emotion Results
/// </summary>

public class GetEmotionEndpoint : FastEndpoints.Endpoint<GetEmotionRequest, OrsonAiEmotionsResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/orson/ai/emotion/{requestId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Orson");
        });

        Summary(s => {
            s.Summary = "Get Emotion Results";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RequestId, "Orson Request Id");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetEmotionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Check episode status
/// </summary>

public class GetEpisodeStatusEndpoint : FastEndpoints.Endpoint<GetEpisodeStatusRequest, OrsonEpisodeResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/orson/stories/episodes/{episodeId}/status");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Orson");
        });

        Summary(s => {
            s.Summary = "Check episode status";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.EpisodeId, "Episode ID");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetEpisodeStatusRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Check episode status
/// </summary>

public class GetRenderStatusEndpoint : FastEndpoints.Endpoint<GetRenderStatusRequest, OrsonRenderResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/orson/stories/renders/{renderId}/status");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Orson");
        });

        Summary(s => {
            s.Summary = "Check episode status";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RenderId, "Render ID");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetRenderStatusRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Speach to Text Result
/// </summary>

public class GetSTTEndpoint : FastEndpoints.Endpoint<GetSTTRequest, OrsonAiSTTResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/orson/ai/stt/{requestId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Orson");
        });

        Summary(s => {
            s.Summary = "Get Speach to Text Result";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RequestId, "Orson Request Id");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetSTTRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Text to Speach Result
/// </summary>

public class GetTTSEndpoint : FastEndpoints.Endpoint<GetTTSRequest, OrsonAiTTSResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/orson/ai/tts/{requestId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Orson");
        });

        Summary(s => {
            s.Summary = "Get Text to Speach Result";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RequestId, "Orson Request Id");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetTTSRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get TechTune Results
/// </summary>

public class GetTechTuneEndpoint : FastEndpoints.Endpoint<GetTechTuneRequest, OrsonAiTechTuneResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/orson/ai/techTune/{requestId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Orson");
        });

        Summary(s => {
            s.Summary = "Get TechTune Results";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RequestId, "Orson Request Id");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetTechTuneRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Topics
/// </summary>

public class GetTopicsEndpoint : FastEndpoints.Endpoint<GetTopicsRequest, OrsonAiTopicsResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/orson/ai/topics/{requestId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Orson");
        });

        Summary(s => {
            s.Summary = "Get Topics";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RequestId, "Orson Request Id");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetTopicsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get VoiceCanvas images
/// </summary>

public class GetVoiceCanvasEndpoint : FastEndpoints.Endpoint<GetVoiceCanvasRequest, OrsonAiVoiceCanvasResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/orson/ai/voiceCanvas/{requestId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Orson");
        });

        Summary(s => {
            s.Summary = "Get VoiceCanvas images";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RequestId, "Orson Request Id");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetVoiceCanvasRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Starts a StoryStitch video render
/// </summary>

public class StartVideoRenderEndpoint : FastEndpoints.Endpoint<StartVideoRenderRequest, OrsonRenderResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/orson/stories/renders");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Orson");
        });

        Summary(s => {
            s.Summary = "Starts a StoryStitch video render";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.Data, "Request Data String");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(StartVideoRenderRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Speach to Text
/// </summary>

public class SttEndpoint : FastEndpoints.Endpoint<SttRequest, OrsonAiSTTResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/orson/ai/stt");
        
        
        AllowAnonymous();
        AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Orson");
        });

        Summary(s => {
            s.Summary = "Speach to Text";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.ThirdPartyAccountId, "A third-party account id that is meaningful to your systems");
            s.RequestParam(r => r.SourceLanguage, "Source Language");
            s.RequestParam(r => r.TargetLanguage, "Target Language");
            s.RequestParam(r => r.File, "An uploaded recording to analyze (Currently limited to 10MB)");
            s.RequestParam(r => r.Url, "A recording file to download and analyze (Size limit: 1GB)");
            s.RequestParam(r => r.Callback, "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SttRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Summarize Topics
/// </summary>

public class SummarizeTopicsEndpoint : FastEndpoints.Endpoint<SummarizeTopicsRequest, OrsonAiTopicsResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/orson/ai/topics");
        
        
        AllowAnonymous();
        AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Orson");
        });

        Summary(s => {
            s.Summary = "Summarize Topics";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.ThirdPartyAccountId, "A third-party account id that is meaningful to your systems");
            s.RequestParam(r => r.Doc, "The text to get topics for.");
            s.RequestParam(r => r.File, "An uploaded recording to analyze (Currently limited to 10MB)");
            s.RequestParam(r => r.Url, "A recording file to download and analyze (Size limit: 1GB)");
            s.RequestParam(r => r.Limit, "The number of results to return");
            s.RequestParam(r => r.Offset, "The starting offset into the total result set to start from");
            s.RequestParam(r => r.Callback, "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SummarizeTopicsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Detect Technical Issues
/// </summary>

public class TechTuneEndpoint : FastEndpoints.Endpoint<TechTuneRequest, OrsonAiTechTuneResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/orson/ai/techTune");
        
        
        AllowAnonymous();
        AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Orson");
        });

        Summary(s => {
            s.Summary = "Detect Technical Issues";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.NumFacesExpected, "Number of expected faces");
            s.RequestParam(r => r.ThirdPartyAccountId, "A third-party account id that is meaningful to your systems");
            s.RequestParam(r => r.File, "An uploaded recording to analyze (Currently limited to 10MB)");
            s.RequestParam(r => r.Url, "A recording file to download and analyze (Size limit: 1GB)");
            s.RequestParam(r => r.Callback, "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(TechTuneRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Text to Speach
/// </summary>

public class TtsEndpoint : FastEndpoints.Endpoint<TtsRequest, OrsonAiTTSResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/orson/ai/tts");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Orson");
        });

        Summary(s => {
            s.Summary = "Text to Speach";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.Text, "Text");
            s.RequestParam(r => r.ThirdPartyAccountId, "A third-party account id that is meaningful to your systems");
            s.RequestParam(r => r.Language, "The language to use for the speaker and incoming text");
            s.RequestParam(r => r.Voice, "A language-specific voice to use, or picks the language default if not provided");
            s.RequestParam(r => r.Callback, "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(TtsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

