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
    public partial class BillingInfoApi
    { 
        [FunctionName("BillingInfoApi_AddPaymentMethod")]
        public async Task<ActionResult<PaymentTypesResponse>> _AddPaymentMethod([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/billing/update")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("AddPaymentMethod");
            return method != null
                ? (await ((Task<PaymentTypesResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BillingInfoApi_CreatePaymentMethod")]
        public async Task<ActionResult<PaymentTypesResponse>> _CreatePaymentMethod([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/billing/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreatePaymentMethod");
            return method != null
                ? (await ((Task<PaymentTypesResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BillingInfoApi_CreateSmartContract")]
        public async Task<ActionResult<PaymentTypesResponse>> _CreateSmartContract([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/billing/crypto/transfer")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateSmartContract");
            return method != null
                ? (await ((Task<PaymentTypesResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BillingInfoApi_GetCryptoBalance")]
        public async Task<ActionResult<PaymentTypesResponse>> _GetCryptoBalance([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/billing/crypto/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetCryptoBalance");
            return method != null
                ? (await ((Task<PaymentTypesResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BillingInfoApi_GetPaymentMethod")]
        public async Task<ActionResult<PaymentTypesResponse>> _GetPaymentMethod([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/billing/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetPaymentMethod");
            return method != null
                ? (await ((Task<PaymentTypesResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BillingInfoApi_SearchPaymentMethod")]
        public async Task<ActionResult<PaymentTypesResponse>> _SearchPaymentMethod([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/billing/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchPaymentMethod");
            return method != null
                ? (await ((Task<PaymentTypesResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
