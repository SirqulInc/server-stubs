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
    public partial class RetailerApi
    { 
        [FunctionName("RetailerApi_CreateRetailer")]
        public async Task<ActionResult<RetailerFullResponse>> _CreateRetailer([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18retailer/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateRetailer");
            return method != null
                ? (await ((Task<RetailerFullResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RetailerApi_DeleteRetailer")]
        public async Task<ActionResult<SirqulResponse>> _DeleteRetailer([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18retailer/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteRetailer");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RetailerApi_GetRetailer")]
        public async Task<ActionResult<RetailerFullResponse>> _GetRetailer([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18retailer/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetRetailer");
            return method != null
                ? (await ((Task<RetailerFullResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RetailerApi_GetRetailers")]
        public async Task<ActionResult<List<RetailerResponse>>> _GetRetailers([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18retailer/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetRetailers");
            return method != null
                ? (await ((Task<List<RetailerResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RetailerApi_RetailerLoginCheck")]
        public async Task<ActionResult<AccountLoginResponse>> _RetailerLoginCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18retailer/login")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("RetailerLoginCheck");
            return method != null
                ? (await ((Task<AccountLoginResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RetailerApi_UpdateRetailer")]
        public async Task<ActionResult<RetailerFullResponse>> _UpdateRetailer([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18retailer/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateRetailer");
            return method != null
                ? (await ((Task<RetailerFullResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
