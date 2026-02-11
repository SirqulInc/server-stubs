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
    public partial class LocationApiV2Api
    { 
        [FunctionName("LocationApiV2Api_CreateLocationV2")]
        public async Task<ActionResult<SirqulResponse>> _CreateLocationV2([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18location")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateLocationV2");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LocationApiV2Api_UpdateLocationV2")]
        public async Task<ActionResult<SirqulResponse>> _UpdateLocationV2([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18location/{id}")]HttpRequest req, ExecutionContext context, long id)
        {
            var method = this.GetType().GetMethod("UpdateLocationV2");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
