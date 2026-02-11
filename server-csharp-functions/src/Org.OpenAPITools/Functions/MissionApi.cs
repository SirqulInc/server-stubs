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
    public partial class MissionApi
    { 
        [FunctionName("MissionApi_CreateMission")]
        public async Task<ActionResult<MissionResponse>> _CreateMission([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18mission/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateMission");
            return method != null
                ? (await ((Task<MissionResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MissionApi_DeleteMission")]
        public async Task<ActionResult<SirqulResponse>> _DeleteMission([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18mission/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteMission");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MissionApi_FindMissions")]
        public async Task<ActionResult<MissionResponse>> _FindMissions([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18mission/find")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("FindMissions");
            return method != null
                ? (await ((Task<MissionResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MissionApi_GetMission")]
        public async Task<ActionResult<MissionResponse>> _GetMission([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18mission/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetMission");
            return method != null
                ? (await ((Task<MissionResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MissionApi_ImportMission")]
        public async Task<ActionResult<SirqulResponse>> _ImportMission([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18mission/import")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ImportMission");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MissionApi_SearchMissionFormats")]
        public async Task<ActionResult<List<MissionFormatResponse>>> _SearchMissionFormats([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18mission/format/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchMissionFormats");
            return method != null
                ? (await ((Task<List<MissionFormatResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MissionApi_SearchMissions")]
        public async Task<ActionResult<List<MissionResponse>>> _SearchMissions([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18mission/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchMissions");
            return method != null
                ? (await ((Task<List<MissionResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MissionApi_SearchMissionsByBillableEntity")]
        public async Task<ActionResult<List<MissionResponse>>> _SearchMissionsByBillableEntity([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18mission/searchByBillableEntity")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchMissionsByBillableEntity");
            return method != null
                ? (await ((Task<List<MissionResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MissionApi_UpdateMission")]
        public async Task<ActionResult<MissionResponse>> _UpdateMission([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18mission/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateMission");
            return method != null
                ? (await ((Task<MissionResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
