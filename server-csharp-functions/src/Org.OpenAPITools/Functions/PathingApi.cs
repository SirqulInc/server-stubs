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
    public partial class PathingApi
    { 
        [FunctionName("PathingApi_ComputePath")]
        public async Task<ActionResult<PathingResponse>> _ComputePath([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18pathing/compute")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComputePath");
            return method != null
                ? (await ((Task<PathingResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
