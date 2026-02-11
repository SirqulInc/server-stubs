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
    public partial class MissionInviteApi
    { 
        [FunctionName("MissionInviteApi_CreateMissionInvite")]
        public async Task<ActionResult<MissionResponse>> _CreateMissionInvite([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18mission/invite/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateMissionInvite");
            return method != null
                ? (await ((Task<MissionResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MissionInviteApi_DeleteMissionInvite")]
        public async Task<ActionResult<SirqulResponse>> _DeleteMissionInvite([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18mission/invite/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteMissionInvite");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MissionInviteApi_GetMissionInvite")]
        public async Task<ActionResult<MissionResponse>> _GetMissionInvite([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18mission/invite/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetMissionInvite");
            return method != null
                ? (await ((Task<MissionResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MissionInviteApi_SearchMissionInvites")]
        public async Task<ActionResult<List<MissionResponse>>> _SearchMissionInvites([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18mission/invite/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchMissionInvites");
            return method != null
                ? (await ((Task<List<MissionResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MissionInviteApi_UpdateMissionInvite")]
        public async Task<ActionResult<MissionResponse>> _UpdateMissionInvite([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18mission/invite/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateMissionInvite");
            return method != null
                ? (await ((Task<MissionResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
