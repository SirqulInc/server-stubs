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
    public partial class ScoreApi
    { 
        [FunctionName("ScoreApi_CreateScore")]
        public async Task<ActionResult<ScoreResponse>> _CreateScore([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18score/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateScore");
            return method != null
                ? (await ((Task<ScoreResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ScoreApi_GetScore")]
        public async Task<ActionResult<ScoreResponse>> _GetScore([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18score/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetScore");
            return method != null
                ? (await ((Task<ScoreResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ScoreApi_SearchScores")]
        public async Task<ActionResult<List<ScoreResponse>>> _SearchScores([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18score/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchScores");
            return method != null
                ? (await ((Task<List<ScoreResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
