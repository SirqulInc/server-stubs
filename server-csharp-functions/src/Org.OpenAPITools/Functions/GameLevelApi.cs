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
    public partial class GameLevelApi
    { 
        [FunctionName("GameLevelApi_CreateGameLevel")]
        public async Task<ActionResult<GameLevelResponse>> _CreateGameLevel([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/level/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateGameLevel");
            return method != null
                ? (await ((Task<GameLevelResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("GameLevelApi_DeleteGameLevel")]
        public async Task<ActionResult<SirqulResponse>> _DeleteGameLevel([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/level/delete")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("DeleteGameLevel");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("GameLevelApi_GetGameLevel")]
        public async Task<ActionResult<GameLevelResponse>> _GetGameLevel([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/level/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetGameLevel");
            return method != null
                ? (await ((Task<GameLevelResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("GameLevelApi_GetGameLevelsByApplication")]
        public async Task<ActionResult<GameLevelListResponse>> _GetGameLevelsByApplication([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/level/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetGameLevelsByApplication");
            return method != null
                ? (await ((Task<GameLevelListResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("GameLevelApi_GetGameLevelsByBillableEntity")]
        public async Task<ActionResult<GameLevelResponse>> _GetGameLevelsByBillableEntity([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/level/searchByBillableEntity")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetGameLevelsByBillableEntity");
            return method != null
                ? (await ((Task<GameLevelResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("GameLevelApi_GetQuestionsInLevel")]
        public async Task<ActionResult<QuestionResponse>> _GetQuestionsInLevel([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/level/questions/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetQuestionsInLevel");
            return method != null
                ? (await ((Task<QuestionResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("GameLevelApi_GetWordsInLevel")]
        public async Task<ActionResult<WordzWordResponse>> _GetWordsInLevel([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/level/words/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetWordsInLevel");
            return method != null
                ? (await ((Task<WordzWordResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("GameLevelApi_UpdateGameLevel")]
        public async Task<ActionResult<GameLevelResponse>> _UpdateGameLevel([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/level/update")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("UpdateGameLevel");
            return method != null
                ? (await ((Task<GameLevelResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("GameLevelApi_UpdateQuestionsInLevel")]
        public async Task<ActionResult<SirqulResponse>> _UpdateQuestionsInLevel([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/level/questions/update")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("UpdateQuestionsInLevel");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("GameLevelApi_UpdateWordsInLevel")]
        public async Task<ActionResult<SirqulResponse>> _UpdateWordsInLevel([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/level/words/update")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("UpdateWordsInLevel");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
