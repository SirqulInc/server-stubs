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
    public partial class TriggerApi
    { 
        [FunctionName("TriggerApi_CreateTrigger")]
        public async Task<ActionResult<TriggerResponse>> _CreateTrigger([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/trigger/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateTrigger");
            return method != null
                ? (await ((Task<TriggerResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TriggerApi_DeleteTrigger")]
        public async Task<ActionResult<SirqulResponse>> _DeleteTrigger([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/trigger/delete")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("DeleteTrigger");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TriggerApi_GetTrigger")]
        public async Task<ActionResult<TriggerResponse>> _GetTrigger([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/trigger/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetTrigger");
            return method != null
                ? (await ((Task<TriggerResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TriggerApi_SearchTriggers")]
        public async Task<ActionResult<List<TriggerResponse>>> _SearchTriggers([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/trigger/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchTriggers");
            return method != null
                ? (await ((Task<List<TriggerResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TriggerApi_UpdateTrigger")]
        public async Task<ActionResult<TriggerResponse>> _UpdateTrigger([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/trigger/update")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("UpdateTrigger");
            return method != null
                ? (await ((Task<TriggerResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
