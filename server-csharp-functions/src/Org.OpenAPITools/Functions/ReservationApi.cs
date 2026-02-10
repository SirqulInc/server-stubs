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
    public partial class ReservationApi
    { 
        [FunctionName("ReservationApi_CreateReservation")]
        public async Task<ActionResult<>> _CreateReservation([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/reservation/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateReservation");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReservationApi_DeleteReservation")]
        public async Task<ActionResult<>> _DeleteReservation([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/reservation/delete")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("DeleteReservation");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReservationApi_ReservableAvailability")]
        public async Task<ActionResult<List<AvailabilityResponse>>> _ReservableAvailability([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/reservable/availability/update")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("ReservableAvailability");
            return method != null
                ? (await ((Task<List<AvailabilityResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReservationApi_SearchAvailability")]
        public async Task<ActionResult<List<AvailabilityResponse>>> _SearchAvailability([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/reservable/availability/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchAvailability");
            return method != null
                ? (await ((Task<List<AvailabilityResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReservationApi_SearchReservations")]
        public async Task<ActionResult<List<ReservationResponse>>> _SearchReservations([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/reservation/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchReservations");
            return method != null
                ? (await ((Task<List<ReservationResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReservationApi_SearchSchedule")]
        public async Task<ActionResult<List<TimeSlotResponse>>> _SearchSchedule([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/reservable/schedule/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchSchedule");
            return method != null
                ? (await ((Task<List<TimeSlotResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
