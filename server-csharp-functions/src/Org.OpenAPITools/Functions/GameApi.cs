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
    public partial class GameApi
    { 
        [FunctionName("GameApi_CreateGame")]
        public async Task<ActionResult<GameResponse>> _CreateGame([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/game/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateGame");
            return method != null
                ? (await ((Task<GameResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("GameApi_DeleteGame")]
        public async Task<ActionResult<SirqulResponse>> _DeleteGame([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/game/delete")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("DeleteGame");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("GameApi_GetGame")]
        public async Task<ActionResult<GameResponse>> _GetGame([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/game/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetGame");
            return method != null
                ? (await ((Task<GameResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("GameApi_SearchGames")]
        public async Task<ActionResult<GameResponse>> _SearchGames([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/game/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchGames");
            return method != null
                ? (await ((Task<GameResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("GameApi_UpdateGame")]
        public async Task<ActionResult<GameResponse>> _UpdateGame([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/game/update")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("UpdateGame");
            return method != null
                ? (await ((Task<GameResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
