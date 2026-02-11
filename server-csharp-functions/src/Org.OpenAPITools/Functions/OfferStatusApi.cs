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
    public partial class OfferStatusApi
    { 
        [FunctionName("OfferStatusApi_CreateOfferTransactionStatus")]
        public async Task<ActionResult<OfferTransactionStatusResponse>> _CreateOfferTransactionStatus([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18offer/status/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateOfferTransactionStatus");
            return method != null
                ? (await ((Task<OfferTransactionStatusResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OfferStatusApi_DeleteOfferTransactionStatus")]
        public async Task<ActionResult<SirqulResponse>> _DeleteOfferTransactionStatus([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18offer/status/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteOfferTransactionStatus");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OfferStatusApi_GetOfferTransactionStatus")]
        public async Task<ActionResult<OfferTransactionStatusResponse>> _GetOfferTransactionStatus([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18offer/status/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetOfferTransactionStatus");
            return method != null
                ? (await ((Task<OfferTransactionStatusResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OfferStatusApi_SearchOfferTransactionStatuses")]
        public async Task<ActionResult<List<OfferTransactionStatusResponse>>> _SearchOfferTransactionStatuses([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18offer/status/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchOfferTransactionStatuses");
            return method != null
                ? (await ((Task<List<OfferTransactionStatusResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OfferStatusApi_UpdateOfferTransactionStatus")]
        public async Task<ActionResult<OfferTransactionStatusResponse>> _UpdateOfferTransactionStatus([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18offer/status/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateOfferTransactionStatus");
            return method != null
                ? (await ((Task<OfferTransactionStatusResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
