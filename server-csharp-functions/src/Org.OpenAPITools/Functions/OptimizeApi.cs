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
    public partial class OptimizeApi
    { 
        [FunctionName("OptimizeApi_GetOptimizationResult")]
        public async Task<ActionResult<Dictionary<string, ShipmentOrder>>> _GetOptimizationResult([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18optimize/result/{batchID}")]HttpRequest req, ExecutionContext context, string batchID)
        {
            var method = this.GetType().GetMethod("GetOptimizationResult");
            return method != null
                ? (await ((Task<Dictionary<string, ShipmentOrder>>)method.Invoke(this, new object[] { req, context, batchID })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OptimizeApi_RequestOptimization")]
        public async Task<ActionResult<ImportStatuses>> _RequestOptimization([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18optimize/request")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("RequestOptimization");
            return method != null
                ? (await ((Task<ImportStatuses>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
