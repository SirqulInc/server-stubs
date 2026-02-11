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
    public partial class LeaderboardApi
    { 
        [FunctionName("LeaderboardApi_CreateLeaderboard")]
        public async Task<ActionResult<LeaderboardResponse>> _CreateLeaderboard([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18leaderboard/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateLeaderboard");
            return method != null
                ? (await ((Task<LeaderboardResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LeaderboardApi_DeleteLeaderboard")]
        public async Task<ActionResult<SirqulResponse>> _DeleteLeaderboard([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18leaderboard/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteLeaderboard");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LeaderboardApi_GetLeaderboard")]
        public async Task<ActionResult<LeaderboardResponse>> _GetLeaderboard([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18leaderboard/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetLeaderboard");
            return method != null
                ? (await ((Task<LeaderboardResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LeaderboardApi_SearchLeaderboards")]
        public async Task<ActionResult<LeaderboardResponse>> _SearchLeaderboards([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18leaderboard/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchLeaderboards");
            return method != null
                ? (await ((Task<LeaderboardResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LeaderboardApi_UpdateLeaderboard")]
        public async Task<ActionResult<LeaderboardResponse>> _UpdateLeaderboard([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18leaderboard/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateLeaderboard");
            return method != null
                ? (await ((Task<LeaderboardResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
