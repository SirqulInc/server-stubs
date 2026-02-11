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
    public partial class CarrierApi
    { 
        [FunctionName("CarrierApi_SearchCarriers")]
        public async Task<ActionResult<List<CellCarrierResponse>>> _SearchCarriers([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18carrier/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchCarriers");
            return method != null
                ? (await ((Task<List<CellCarrierResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
