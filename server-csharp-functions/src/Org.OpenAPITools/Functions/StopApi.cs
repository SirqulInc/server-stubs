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
    public partial class StopApi
    { 
        [FunctionName("StopApi_GetStop")]
        public async Task<ActionResult<Stop>> _GetStop([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18stop/{id}")]HttpRequest req, ExecutionContext context, long id)
        {
            var method = this.GetType().GetMethod("GetStop");
            return method != null
                ? (await ((Task<Stop>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("StopApi_UpdateStop")]
        public async Task<ActionResult<Stop>> _UpdateStop([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "api/3.18stop/{id}")]HttpRequest req, ExecutionContext context, long id)
        {
            var method = this.GetType().GetMethod("UpdateStop");
            return method != null
                ? (await ((Task<Stop>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
