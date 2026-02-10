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
    public partial class DependentApi
    { 
        [FunctionName("DependentApi_Create")]
        public async Task<ActionResult<SirqulResponse>> _Create([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "api/{version}/cargo/dependent/{accountId}")]HttpRequest req, ExecutionContext context, decimal version, long accountId)
        {
            var method = this.GetType().GetMethod("Create");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version, accountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("DependentApi_GetDependents")]
        public async Task<ActionResult<SirqulResponse>> _GetDependents([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/cargo/dependent/{accountId}")]HttpRequest req, ExecutionContext context, decimal version, long accountId)
        {
            var method = this.GetType().GetMethod("GetDependents");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version, accountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("DependentApi_RemoveDependent")]
        public async Task<ActionResult<>> _RemoveDependent([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "api/{version}/cargo/dependent/{accountId}")]HttpRequest req, ExecutionContext context, decimal version, long accountId, long dependentId)
        {
            var method = this.GetType().GetMethod("RemoveDependent");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, version, accountId, dependentId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
