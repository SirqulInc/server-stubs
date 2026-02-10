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
    public partial class OfferApi
    { 
        [FunctionName("OfferApi_BatchUpdateOfferLocations")]
        public async Task<ActionResult<SirqulResponse>> _BatchUpdateOfferLocations([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/retailer/offer/location/batchUpdate")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("BatchUpdateOfferLocations");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OfferApi_CreateOffer")]
        public async Task<ActionResult<RetailerOfferResponse>> _CreateOffer([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/retailer/offer/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateOffer");
            return method != null
                ? (await ((Task<RetailerOfferResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OfferApi_DeleteOffer")]
        public async Task<ActionResult<SirqulResponse>> _DeleteOffer([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/retailer/offer/delete")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("DeleteOffer");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OfferApi_DeleteOfferLocation")]
        public async Task<ActionResult<SirqulResponse>> _DeleteOfferLocation([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/retailer/offer/location/delete")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("DeleteOfferLocation");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OfferApi_GetOffer")]
        public async Task<ActionResult<RetailerOfferResponse>> _GetOffer([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/retailer/offer/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetOffer");
            return method != null
                ? (await ((Task<RetailerOfferResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OfferApi_GetOfferDetails")]
        public async Task<ActionResult<OfferResponse>> _GetOfferDetails([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/offer/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetOfferDetails");
            return method != null
                ? (await ((Task<OfferResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OfferApi_GetOfferListCounts")]
        public async Task<ActionResult<ListCountResponse>> _GetOfferListCounts([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/offer/lists/count")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetOfferListCounts");
            return method != null
                ? (await ((Task<ListCountResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OfferApi_GetOfferLocation")]
        public async Task<ActionResult<OfferShortResponse>> _GetOfferLocation([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/offer/location/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetOfferLocation");
            return method != null
                ? (await ((Task<OfferShortResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OfferApi_GetOfferLocationsForRetailers")]
        public async Task<ActionResult<List<OfferShortResponse>>> _GetOfferLocationsForRetailers([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/retailer/offer/location/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetOfferLocationsForRetailers");
            return method != null
                ? (await ((Task<List<OfferShortResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OfferApi_GetOffersForRetailers")]
        public async Task<ActionResult<List<OfferResponse>>> _GetOffersForRetailers([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/retailer/offer/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetOffersForRetailers");
            return method != null
                ? (await ((Task<List<OfferResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OfferApi_RedeemOfferTransaction")]
        public async Task<ActionResult<SirqulResponse>> _RedeemOfferTransaction([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/retailer/offer/transaction/update")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("RedeemOfferTransaction");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OfferApi_SearchOfferTransactionsForRetailers")]
        public async Task<ActionResult<List<OfferTransactionResponse>>> _SearchOfferTransactionsForRetailers([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/retailer/offer/transaction/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchOfferTransactionsForRetailers");
            return method != null
                ? (await ((Task<List<OfferTransactionResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OfferApi_SearchOffersForConsumer")]
        public async Task<ActionResult<OfferListResponse>> _SearchOffersForConsumer([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/offer/lists")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchOffersForConsumer");
            return method != null
                ? (await ((Task<OfferListResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OfferApi_TopOfferTransactions")]
        public async Task<ActionResult<OfferListResponse>> _TopOfferTransactions([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/offer/top")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("TopOfferTransactions");
            return method != null
                ? (await ((Task<OfferListResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OfferApi_UpdateOffer")]
        public async Task<ActionResult<RetailerOfferResponse>> _UpdateOffer([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/retailer/offer/update")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("UpdateOffer");
            return method != null
                ? (await ((Task<RetailerOfferResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OfferApi_UpdateOfferStatus")]
        public async Task<ActionResult<SirqulResponse>> _UpdateOfferStatus([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/retailer/offer/status")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("UpdateOfferStatus");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
