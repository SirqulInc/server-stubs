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
    public partial class RankingApi
    { 
        [FunctionName("RankingApi_GetHistoricalRankings")]
        public async Task<ActionResult<RankFullResponse>> _GetHistoricalRankings([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18ranking/historical/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetHistoricalRankings");
            return method != null
                ? (await ((Task<RankFullResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RankingApi_GetRankings")]
        public async Task<ActionResult<RankFullResponse>> _GetRankings([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18ranking/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetRankings");
            return method != null
                ? (await ((Task<RankFullResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RankingApi_GetUserRank")]
        public async Task<ActionResult<Object>> _GetUserRank([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18ranking/personal/ranks")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetUserRank");
            return method != null
                ? (await ((Task<Object>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RankingApi_OverrideUserRank")]
        public async Task<ActionResult<SirqulResponse>> _OverrideUserRank([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18ranking/override")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OverrideUserRank");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RankingApi_UpdateRankings")]
        public async Task<ActionResult<SirqulResponse>> _UpdateRankings([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18ranking/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateRankings");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
