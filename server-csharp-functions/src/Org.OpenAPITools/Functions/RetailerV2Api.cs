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
    public partial class RetailerV2Api
    { 
        [FunctionName("RetailerV2Api_GetRetaokiler")]
        public async Task<ActionResult<SirqulResponse>> _GetRetaokiler([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/retailer")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetRetaokiler");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
