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
    public partial class FacebookApi
    { 
        [FunctionName("FacebookApi_GetToken")]
        public async Task<ActionResult<TokenResponse>> _GetToken([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18facebook/getfbtoken")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetToken");
            return method != null
                ? (await ((Task<TokenResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FacebookApi_GraphInterface")]
        public async Task<ActionResult<SirqulResponse>> _GraphInterface([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18facebook/graph")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GraphInterface");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
