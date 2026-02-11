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
    public partial class TwilioApi
    { 
        [FunctionName("TwilioApi_SmsBuyOffer")]
        public async Task<ActionResult<TwiMLResponse>> _SmsBuyOffer([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18sms/buyoffer/{appKey}")]HttpRequest req, ExecutionContext context, string appKey)
        {
            var method = this.GetType().GetMethod("SmsBuyOffer");
            return method != null
                ? (await ((Task<TwiMLResponse>)method.Invoke(this, new object[] { req, context, appKey })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
