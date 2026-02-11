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
    public partial class TripApi
    { 
        [FunctionName("TripApi_CreateTrip")]
        public async Task<ActionResult<Trip>> _CreateTrip([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18trip")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateTrip");
            return method != null
                ? (await ((Task<Trip>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TripApi_Delete")]
        public async Task<ActionResult<>> _Delete([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "api/3.18trip/{id}")]HttpRequest req, ExecutionContext context, long id)
        {
            var method = this.GetType().GetMethod("Delete");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TripApi_DriveTrip")]
        public async Task<ActionResult<Trip>> _DriveTrip([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18trip/{id}/drive")]HttpRequest req, ExecutionContext context, long id)
        {
            var method = this.GetType().GetMethod("DriveTrip");
            return method != null
                ? (await ((Task<Trip>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TripApi_FlexibleTrip")]
        public async Task<ActionResult<Trip>> _FlexibleTrip([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18trip/{id}/flexible")]HttpRequest req, ExecutionContext context, long id)
        {
            var method = this.GetType().GetMethod("FlexibleTrip");
            return method != null
                ? (await ((Task<Trip>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TripApi_GetTrip")]
        public async Task<ActionResult<Trip>> _GetTrip([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18trip/{id}")]HttpRequest req, ExecutionContext context, long id)
        {
            var method = this.GetType().GetMethod("GetTrip");
            return method != null
                ? (await ((Task<Trip>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TripApi_GetTripMatches")]
        public async Task<ActionResult<List<Trip>>> _GetTripMatches([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18trip/{id}/match")]HttpRequest req, ExecutionContext context, long id)
        {
            var method = this.GetType().GetMethod("GetTripMatches");
            return method != null
                ? (await ((Task<List<Trip>>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TripApi_ProcessTripMatches")]
        public async Task<ActionResult<List<Trip>>> _ProcessTripMatches([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18trip/match/process")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ProcessTripMatches");
            return method != null
                ? (await ((Task<List<Trip>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TripApi_Ride")]
        public async Task<ActionResult<Trip>> _Ride([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18trip/{id}/ride")]HttpRequest req, ExecutionContext context, long id)
        {
            var method = this.GetType().GetMethod("Ride");
            return method != null
                ? (await ((Task<Trip>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TripApi_Search")]
        public async Task<ActionResult<List<Trip>>> _Search([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18trip")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("Search");
            return method != null
                ? (await ((Task<List<Trip>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TripApi_SearchTrips")]
        public async Task<ActionResult<List<Trip>>> _SearchTrips([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18trip/match")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchTrips");
            return method != null
                ? (await ((Task<List<Trip>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TripApi_UpdateLocations")]
        public async Task<ActionResult<Trip>> _UpdateLocations([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18trip/{id}/locations")]HttpRequest req, ExecutionContext context, long id)
        {
            var method = this.GetType().GetMethod("UpdateLocations");
            return method != null
                ? (await ((Task<Trip>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TripApi_UpdateRecurrenceLocations")]
        public async Task<ActionResult<List<Trip>>> _UpdateRecurrenceLocations([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18trip/{id}/locations/recurrence")]HttpRequest req, ExecutionContext context, long id)
        {
            var method = this.GetType().GetMethod("UpdateRecurrenceLocations");
            return method != null
                ? (await ((Task<List<Trip>>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TripApi_UpdateRecurrenceShipments")]
        public async Task<ActionResult<List<Trip>>> _UpdateRecurrenceShipments([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18trip/{id}/shipments/recurrence")]HttpRequest req, ExecutionContext context, long id)
        {
            var method = this.GetType().GetMethod("UpdateRecurrenceShipments");
            return method != null
                ? (await ((Task<List<Trip>>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TripApi_UpdateShipments")]
        public async Task<ActionResult<Trip>> _UpdateShipments([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18trip/{id}/shipments")]HttpRequest req, ExecutionContext context, long id)
        {
            var method = this.GetType().GetMethod("UpdateShipments");
            return method != null
                ? (await ((Task<Trip>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TripApi_UpdateTrip")]
        public async Task<ActionResult<Trip>> _UpdateTrip([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "api/3.18trip/{id}")]HttpRequest req, ExecutionContext context, long id)
        {
            var method = this.GetType().GetMethod("UpdateTrip");
            return method != null
                ? (await ((Task<Trip>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TripApi_UpdateTripNotifications")]
        public async Task<ActionResult<Trip>> _UpdateTripNotifications([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18trip/notifications")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateTripNotifications");
            return method != null
                ? (await ((Task<Trip>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
