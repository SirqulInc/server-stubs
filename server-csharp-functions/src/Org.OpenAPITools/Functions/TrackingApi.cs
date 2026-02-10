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
    public partial class TrackingApi
    { 
        [FunctionName("TrackingApi_BatchSaveTracking")]
        public async Task<ActionResult<List<Leg>>> _BatchSaveTracking([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/tracking/batch/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("BatchSaveTracking");
            return method != null
                ? (await ((Task<List<Leg>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TrackingApi_GetPredictedLocations")]
        public async Task<ActionResult<PredictedLocationResponse>> _GetPredictedLocations([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/tracking/predicted/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetPredictedLocations");
            return method != null
                ? (await ((Task<PredictedLocationResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TrackingApi_GetPredictedPath")]
        public async Task<ActionResult<List<StepResponse>>> _GetPredictedPath([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/tracking/path/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetPredictedPath");
            return method != null
                ? (await ((Task<List<StepResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TrackingApi_GetPreferredLocations")]
        public async Task<ActionResult<List<PreferredLocationResponse>>> _GetPreferredLocations([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/tracking/preferred/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetPreferredLocations");
            return method != null
                ? (await ((Task<List<PreferredLocationResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TrackingApi_GetTrackingLegs")]
        public async Task<ActionResult<List<LegResponse>>> _GetTrackingLegs([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/tracking/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetTrackingLegs");
            return method != null
                ? (await ((Task<List<LegResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TrackingApi_SaveTrackingLeg")]
        public async Task<ActionResult<SirqulResponse>> _SaveTrackingLeg([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/tracking/leg/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SaveTrackingLeg");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TrackingApi_SaveTrackingStep")]
        public async Task<ActionResult<SirqulResponse>> _SaveTrackingStep([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/tracking/step/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SaveTrackingStep");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TrackingApi_SearchAccountsWithTrackingLegs")]
        public async Task<ActionResult<List<AccountMiniResponse>>> _SearchAccountsWithTrackingLegs([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/tracking/list")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchAccountsWithTrackingLegs");
            return method != null
                ? (await ((Task<List<AccountMiniResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TrackingApi_SearchTrackingLegs")]
        public async Task<ActionResult<List<LegResponse>>> _SearchTrackingLegs([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/tracking/searchByBillable")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchTrackingLegs");
            return method != null
                ? (await ((Task<List<LegResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
