using System.IO;
using System.Net;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Azure.WebJobs;
using Microsoft.Azure.WebJobs.Extensions.Http;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Attributes;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Enums;
using Microsoft.Extensions.Logging;
using Microsoft.OpenApi.Models;
using Newtonsoft.Json;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Functions
{ 
    public partial class OrsonApi
    { 
        [FunctionName("OrsonApi_AddMovie")]
        public async Task<ActionResult<OrsonAiAddMovieResponse>> _AddMovie([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18orson/ai/addMovie")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AddMovie");
            return method != null
                ? (await ((Task<OrsonAiAddMovieResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrsonApi_AiDocs")]
        public async Task<ActionResult<OrsonAiProtoResponse>> _AiDocs([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18orson/ai/docs")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AiDocs");
            return method != null
                ? (await ((Task<OrsonAiProtoResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrsonApi_AiFindImages")]
        public async Task<ActionResult<OrsonAiProtoResponse>> _AiFindImages([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18orson/ai/img")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AiFindImages");
            return method != null
                ? (await ((Task<OrsonAiProtoResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrsonApi_AiTags")]
        public async Task<ActionResult<OrsonAiProtoResponse>> _AiTags([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18orson/ai/tags")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AiTags");
            return method != null
                ? (await ((Task<OrsonAiProtoResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrsonApi_AiText")]
        public async Task<ActionResult<OrsonAiProtoResponse>> _AiText([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18orson/ai/text")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AiText");
            return method != null
                ? (await ((Task<OrsonAiProtoResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrsonApi_Batch")]
        public async Task<ActionResult<OrsonAiBatchResponse>> _Batch([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18orson/ai/batch")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("Batch");
            return method != null
                ? (await ((Task<OrsonAiBatchResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrsonApi_CreateInstantEpisode")]
        public async Task<ActionResult<OrsonEpisodeResponse>> _CreateInstantEpisode([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18orson/stories/episodes/instant")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateInstantEpisode");
            return method != null
                ? (await ((Task<OrsonEpisodeResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrsonApi_CreateVoiceCanvas")]
        public async Task<ActionResult<OrsonAiVoiceCanvasResponse>> _CreateVoiceCanvas([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18orson/ai/voiceCanvas")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateVoiceCanvas");
            return method != null
                ? (await ((Task<OrsonAiVoiceCanvasResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrsonApi_Emotion")]
        public async Task<ActionResult<OrsonAiEmotionsResponse>> _Emotion([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18orson/ai/emotion")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("Emotion");
            return method != null
                ? (await ((Task<OrsonAiEmotionsResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrsonApi_GetAddMovieResult")]
        public async Task<ActionResult<OrsonAiAddMovieResponse>> _GetAddMovieResult([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18orson/ai/addMovie/{requestId}")]HttpRequest req, ExecutionContext context, string requestId)
        {
            var method = this.GetType().GetMethod("GetAddMovieResult");
            return method != null
                ? (await ((Task<OrsonAiAddMovieResponse>)method.Invoke(this, new object[] { req, context, requestId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrsonApi_GetBatch")]
        public async Task<ActionResult<OrsonAiBatchResponse>> _GetBatch([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18orson/ai/batch/{requestId}")]HttpRequest req, ExecutionContext context, string requestId)
        {
            var method = this.GetType().GetMethod("GetBatch");
            return method != null
                ? (await ((Task<OrsonAiBatchResponse>)method.Invoke(this, new object[] { req, context, requestId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrsonApi_GetEmotion")]
        public async Task<ActionResult<OrsonAiEmotionsResponse>> _GetEmotion([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18orson/ai/emotion/{requestId}")]HttpRequest req, ExecutionContext context, string requestId)
        {
            var method = this.GetType().GetMethod("GetEmotion");
            return method != null
                ? (await ((Task<OrsonAiEmotionsResponse>)method.Invoke(this, new object[] { req, context, requestId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrsonApi_GetEpisodeStatus")]
        public async Task<ActionResult<OrsonEpisodeResponse>> _GetEpisodeStatus([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18orson/stories/episodes/{episodeId}/status")]HttpRequest req, ExecutionContext context, long episodeId)
        {
            var method = this.GetType().GetMethod("GetEpisodeStatus");
            return method != null
                ? (await ((Task<OrsonEpisodeResponse>)method.Invoke(this, new object[] { req, context, episodeId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrsonApi_GetRenderStatus")]
        public async Task<ActionResult<OrsonRenderResponse>> _GetRenderStatus([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18orson/stories/renders/{renderId}/status")]HttpRequest req, ExecutionContext context, string renderId)
        {
            var method = this.GetType().GetMethod("GetRenderStatus");
            return method != null
                ? (await ((Task<OrsonRenderResponse>)method.Invoke(this, new object[] { req, context, renderId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrsonApi_GetSTT")]
        public async Task<ActionResult<OrsonAiSTTResponse>> _GetSTT([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18orson/ai/stt/{requestId}")]HttpRequest req, ExecutionContext context, string requestId)
        {
            var method = this.GetType().GetMethod("GetSTT");
            return method != null
                ? (await ((Task<OrsonAiSTTResponse>)method.Invoke(this, new object[] { req, context, requestId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrsonApi_GetTTS")]
        public async Task<ActionResult<OrsonAiTTSResponse>> _GetTTS([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18orson/ai/tts/{requestId}")]HttpRequest req, ExecutionContext context, string requestId)
        {
            var method = this.GetType().GetMethod("GetTTS");
            return method != null
                ? (await ((Task<OrsonAiTTSResponse>)method.Invoke(this, new object[] { req, context, requestId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrsonApi_GetTechTune")]
        public async Task<ActionResult<OrsonAiTechTuneResponse>> _GetTechTune([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18orson/ai/techTune/{requestId}")]HttpRequest req, ExecutionContext context, string requestId)
        {
            var method = this.GetType().GetMethod("GetTechTune");
            return method != null
                ? (await ((Task<OrsonAiTechTuneResponse>)method.Invoke(this, new object[] { req, context, requestId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrsonApi_GetTopics")]
        public async Task<ActionResult<OrsonAiTopicsResponse>> _GetTopics([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18orson/ai/topics/{requestId}")]HttpRequest req, ExecutionContext context, string requestId)
        {
            var method = this.GetType().GetMethod("GetTopics");
            return method != null
                ? (await ((Task<OrsonAiTopicsResponse>)method.Invoke(this, new object[] { req, context, requestId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrsonApi_GetVoiceCanvas")]
        public async Task<ActionResult<OrsonAiVoiceCanvasResponse>> _GetVoiceCanvas([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18orson/ai/voiceCanvas/{requestId}")]HttpRequest req, ExecutionContext context, string requestId)
        {
            var method = this.GetType().GetMethod("GetVoiceCanvas");
            return method != null
                ? (await ((Task<OrsonAiVoiceCanvasResponse>)method.Invoke(this, new object[] { req, context, requestId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrsonApi_StartVideoRender")]
        public async Task<ActionResult<OrsonRenderResponse>> _StartVideoRender([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18orson/stories/renders")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("StartVideoRender");
            return method != null
                ? (await ((Task<OrsonRenderResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrsonApi_Stt")]
        public async Task<ActionResult<OrsonAiSTTResponse>> _Stt([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18orson/ai/stt")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("Stt");
            return method != null
                ? (await ((Task<OrsonAiSTTResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrsonApi_SummarizeTopics")]
        public async Task<ActionResult<OrsonAiTopicsResponse>> _SummarizeTopics([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18orson/ai/topics")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SummarizeTopics");
            return method != null
                ? (await ((Task<OrsonAiTopicsResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrsonApi_TechTune")]
        public async Task<ActionResult<OrsonAiTechTuneResponse>> _TechTune([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18orson/ai/techTune")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("TechTune");
            return method != null
                ? (await ((Task<OrsonAiTechTuneResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrsonApi_Tts")]
        public async Task<ActionResult<OrsonAiTTSResponse>> _Tts([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18orson/ai/tts")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("Tts");
            return method != null
                ? (await ((Task<OrsonAiTTSResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
