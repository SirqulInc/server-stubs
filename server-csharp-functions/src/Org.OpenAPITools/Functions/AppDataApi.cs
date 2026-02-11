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
    public partial class AppDataApi
    { 
        [FunctionName("AppDataApi_GetAppData")]
        public async Task<ActionResult<AppResponse>> _GetAppData([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18app/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetAppData");
            return method != null
                ? (await ((Task<AppResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AppDataApi_PostAppData")]
        public async Task<ActionResult<AppResponse>> _PostAppData([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18app/post")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PostAppData");
            return method != null
                ? (await ((Task<AppResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AppDataApi_RegenAppData")]
        public async Task<ActionResult<SirqulResponse>> _RegenAppData([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18app/regen")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("RegenAppData");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
