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
    public partial class WalletApi
    { 
        [FunctionName("WalletApi_CreateOfferTransaction")]
        public async Task<ActionResult<List<OfferTransactionResponse>>> _CreateOfferTransaction([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18wallet/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateOfferTransaction");
            return method != null
                ? (await ((Task<List<OfferTransactionResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("WalletApi_DeleteOfferTransaction")]
        public async Task<ActionResult<SirqulResponse>> _DeleteOfferTransaction([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18wallet/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteOfferTransaction");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("WalletApi_GetOfferTransaction")]
        public async Task<ActionResult<OfferTransactionResponse>> _GetOfferTransaction([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18wallet/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetOfferTransaction");
            return method != null
                ? (await ((Task<OfferTransactionResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("WalletApi_PreviewOfferTransaction")]
        public async Task<ActionResult<List<OfferTransactionResponse>>> _PreviewOfferTransaction([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18wallet/preview")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PreviewOfferTransaction");
            return method != null
                ? (await ((Task<List<OfferTransactionResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("WalletApi_SearchOfferTransactions")]
        public async Task<ActionResult<List<OfferTransactionResponse>>> _SearchOfferTransactions([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18wallet/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchOfferTransactions");
            return method != null
                ? (await ((Task<List<OfferTransactionResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("WalletApi_UpdateOfferTransaction")]
        public async Task<ActionResult<OfferTransactionResponse>> _UpdateOfferTransaction([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18wallet/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateOfferTransaction");
            return method != null
                ? (await ((Task<OfferTransactionResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
