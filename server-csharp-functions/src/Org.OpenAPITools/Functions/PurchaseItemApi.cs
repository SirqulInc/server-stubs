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
    public partial class PurchaseItemApi
    { 
        [FunctionName("PurchaseItemApi_CreatePurchaseItem")]
        public async Task<ActionResult<PurchaseItemFullResponse>> _CreatePurchaseItem([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/purchase/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreatePurchaseItem");
            return method != null
                ? (await ((Task<PurchaseItemFullResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PurchaseItemApi_DeletePurchaseItem")]
        public async Task<ActionResult<SirqulResponse>> _DeletePurchaseItem([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/purchase/delete")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("DeletePurchaseItem");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PurchaseItemApi_GetPurchaseItem")]
        public async Task<ActionResult<PurchaseItemFullResponse>> _GetPurchaseItem([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/purchase/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetPurchaseItem");
            return method != null
                ? (await ((Task<PurchaseItemFullResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PurchaseItemApi_SearchPurchaseItems")]
        public async Task<ActionResult<List<PurchaseItemResponse>>> _SearchPurchaseItems([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/purchase/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchPurchaseItems");
            return method != null
                ? (await ((Task<List<PurchaseItemResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PurchaseItemApi_UpdatePurchaseItem")]
        public async Task<ActionResult<PurchaseItemFullResponse>> _UpdatePurchaseItem([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/purchase/update")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("UpdatePurchaseItem");
            return method != null
                ? (await ((Task<PurchaseItemFullResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
