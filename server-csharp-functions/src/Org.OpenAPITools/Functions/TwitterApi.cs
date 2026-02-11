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
    public partial class TwitterApi
    { 
        [FunctionName("TwitterApi_AuthorizeTwitter")]
        public async Task<ActionResult<SirqulResponse>> _AuthorizeTwitter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18twitter/authorize")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AuthorizeTwitter");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TwitterApi_LoginTwitter")]
        public async Task<ActionResult<ProfileResponse>> _LoginTwitter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18twitter/login")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("LoginTwitter");
            return method != null
                ? (await ((Task<ProfileResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
