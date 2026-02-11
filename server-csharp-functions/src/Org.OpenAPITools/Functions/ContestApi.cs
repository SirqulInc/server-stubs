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
    public partial class ContestApi
    { 
        [FunctionName("ContestApi_AddOrUpdateAlbumContest")]
        public async Task<ActionResult<AlbumContestResponse>> _AddOrUpdateAlbumContest([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18consumer/album/contest")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AddOrUpdateAlbumContest");
            return method != null
                ? (await ((Task<AlbumContestResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ContestApi_ApproveAlbumContest")]
        public async Task<ActionResult<SirqulResponse>> _ApproveAlbumContest([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18consumer/album/contest/approve")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ApproveAlbumContest");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ContestApi_DeleteContest")]
        public async Task<ActionResult<SirqulResponse>> _DeleteContest([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18consumer/album/contest/remove")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteContest");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ContestApi_GetAlbumContest")]
        public async Task<ActionResult<AlbumContestResponse>> _GetAlbumContest([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18consumer/album/contest/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetAlbumContest");
            return method != null
                ? (await ((Task<AlbumContestResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ContestApi_GetAlbumContests")]
        public async Task<ActionResult<AlbumContestListResponse>> _GetAlbumContests([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18consumer/album/contest/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetAlbumContests");
            return method != null
                ? (await ((Task<AlbumContestListResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ContestApi_VoteOnAlbumContest")]
        public async Task<ActionResult<AlbumContestResponse>> _VoteOnAlbumContest([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18consumer/album/contest/vote")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("VoteOnAlbumContest");
            return method != null
                ? (await ((Task<AlbumContestResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
