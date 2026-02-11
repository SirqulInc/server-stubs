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
    public partial class RetailerLocationApi
    { 
        [FunctionName("RetailerLocationApi_CreateRetailerLocationConsumer")]
        public async Task<ActionResult<RetailerLocationResponse>> _CreateRetailerLocationConsumer([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18location/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateRetailerLocationConsumer");
            return method != null
                ? (await ((Task<RetailerLocationResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RetailerLocationApi_CreateRetailerLocations")]
        public async Task<ActionResult<RetailerLocationResponse>> _CreateRetailerLocations([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18retailer/location/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateRetailerLocations");
            return method != null
                ? (await ((Task<RetailerLocationResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RetailerLocationApi_DeleteRetailerLocation")]
        public async Task<ActionResult<SirqulResponse>> _DeleteRetailerLocation([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18retailer/location/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteRetailerLocation");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RetailerLocationApi_GetRetailerLocation")]
        public async Task<ActionResult<RetailerLocationResponse>> _GetRetailerLocation([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18retailer/location/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetRetailerLocation");
            return method != null
                ? (await ((Task<RetailerLocationResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RetailerLocationApi_GetRetailerLocationConsumer")]
        public async Task<ActionResult<RetailerLocationResponse>> _GetRetailerLocationConsumer([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18location/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetRetailerLocationConsumer");
            return method != null
                ? (await ((Task<RetailerLocationResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RetailerLocationApi_IndexedRetailerLocationDistanceSearch")]
        public async Task<ActionResult<List<RetailerLocationResponse>>> _IndexedRetailerLocationDistanceSearch([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18retailer/location/idistancesearch")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("IndexedRetailerLocationDistanceSearch");
            return method != null
                ? (await ((Task<List<RetailerLocationResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RetailerLocationApi_IndexedRetailerLocationSearch")]
        public async Task<ActionResult<List<RetailerLocationResponse>>> _IndexedRetailerLocationSearch([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18retailer/location/isearch")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("IndexedRetailerLocationSearch");
            return method != null
                ? (await ((Task<List<RetailerLocationResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RetailerLocationApi_SearchRetailerLocations")]
        public async Task<ActionResult<List<RetailerLocationResponse>>> _SearchRetailerLocations([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18retailer/location/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchRetailerLocations");
            return method != null
                ? (await ((Task<List<RetailerLocationResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RetailerLocationApi_UpdateRetailerLocations")]
        public async Task<ActionResult<RetailerLocationResponse>> _UpdateRetailerLocations([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18retailer/location/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateRetailerLocations");
            return method != null
                ? (await ((Task<RetailerLocationResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
