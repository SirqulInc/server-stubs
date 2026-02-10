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
    public partial class BidApi
    { 
        [FunctionName("BidApi_CreateBid")]
        public async Task<ActionResult<BidResponse>> _CreateBid([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/bid/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateBid");
            return method != null
                ? (await ((Task<BidResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BidApi_DeleteBid")]
        public async Task<ActionResult<SirqulResponse>> _DeleteBid([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/bid/delete")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("DeleteBid");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BidApi_GetBid")]
        public async Task<ActionResult<BidResponse>> _GetBid([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/bid/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetBid");
            return method != null
                ? (await ((Task<BidResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BidApi_UpdateBid")]
        public async Task<ActionResult<BidResponse>> _UpdateBid([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/bid/update")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("UpdateBid");
            return method != null
                ? (await ((Task<BidResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
