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
    public partial class PurchaseOrderApi
    { 
        [FunctionName("PurchaseOrderApi_CreateOrder")]
        public async Task<ActionResult<OrderResponse>> _CreateOrder([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/order/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateOrder");
            return method != null
                ? (await ((Task<OrderResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PurchaseOrderApi_DeleteOrder")]
        public async Task<ActionResult<SirqulResponse>> _DeleteOrder([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/order/delete")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("DeleteOrder");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PurchaseOrderApi_GetOrder")]
        public async Task<ActionResult<OrderResponse>> _GetOrder([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/order/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetOrder");
            return method != null
                ? (await ((Task<OrderResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PurchaseOrderApi_PreviewOrder")]
        public async Task<ActionResult<OrderResponse>> _PreviewOrder([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/order/preview")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("PreviewOrder");
            return method != null
                ? (await ((Task<OrderResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PurchaseOrderApi_SearchOrders")]
        public async Task<ActionResult<List<OrderResponse>>> _SearchOrders([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/order/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchOrders");
            return method != null
                ? (await ((Task<List<OrderResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PurchaseOrderApi_UpdateOrder")]
        public async Task<ActionResult<OrderResponse>> _UpdateOrder([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/order/update")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("UpdateOrder");
            return method != null
                ? (await ((Task<OrderResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
