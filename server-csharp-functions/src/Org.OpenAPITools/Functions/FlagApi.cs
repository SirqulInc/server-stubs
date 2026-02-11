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
    public partial class FlagApi
    { 
        [FunctionName("FlagApi_CreateFlag")]
        public async Task<ActionResult<SirqulResponse>> _CreateFlag([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18flag/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateFlag");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FlagApi_DeleteFlag")]
        public async Task<ActionResult<SirqulResponse>> _DeleteFlag([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18flag/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteFlag");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FlagApi_GetFlag")]
        public async Task<ActionResult<FlagResponse>> _GetFlag([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18flag/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetFlag");
            return method != null
                ? (await ((Task<FlagResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FlagApi_GetFlagThreshold")]
        public async Task<ActionResult<CountResponse>> _GetFlagThreshold([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18flag/threshold/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetFlagThreshold");
            return method != null
                ? (await ((Task<CountResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FlagApi_UpdateFlagThreshold")]
        public async Task<ActionResult<CountResponse>> _UpdateFlagThreshold([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18flag/threshold/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateFlagThreshold");
            return method != null
                ? (await ((Task<CountResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
