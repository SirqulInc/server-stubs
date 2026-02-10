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
    public partial class TicketApi
    { 
        [FunctionName("TicketApi_GetTicketCount")]
        public async Task<ActionResult<CountResponse>> _GetTicketCount([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/ticket/count")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetTicketCount");
            return method != null
                ? (await ((Task<CountResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TicketApi_GetTicketList")]
        public async Task<ActionResult<TicketListResponse>> _GetTicketList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/ticket/getList")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetTicketList");
            return method != null
                ? (await ((Task<TicketListResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TicketApi_GiftPurchase")]
        public async Task<ActionResult<SirqulResponse>> _GiftPurchase([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/purchase/gift")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GiftPurchase");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TicketApi_SaveTicket")]
        public async Task<ActionResult<ProfileResponse>> _SaveTicket([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/ticket/save")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SaveTicket");
            return method != null
                ? (await ((Task<ProfileResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TicketApi_SaveTicketViaFileUpload")]
        public async Task<ActionResult<ProfileResponse>> _SaveTicketViaFileUpload([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/ticket/save/fileUpload")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SaveTicketViaFileUpload");
            return method != null
                ? (await ((Task<ProfileResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TicketApi_TicketOffers")]
        public async Task<ActionResult<TicketOfferResponse>> _TicketOffers([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/ticket/ticketoffers")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("TicketOffers");
            return method != null
                ? (await ((Task<TicketOfferResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
