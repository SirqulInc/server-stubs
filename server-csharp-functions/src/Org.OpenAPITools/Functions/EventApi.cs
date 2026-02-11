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
    public partial class EventApi
    { 
        [FunctionName("EventApi_AttendEvent")]
        public async Task<ActionResult<OfferResponse>> _AttendEvent([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18event/attend")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AttendEvent");
            return method != null
                ? (await ((Task<OfferResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("EventApi_CreateEvent")]
        public async Task<ActionResult<OfferResponse>> _CreateEvent([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18event/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateEvent");
            return method != null
                ? (await ((Task<OfferResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("EventApi_DeleteEvent")]
        public async Task<ActionResult<SirqulResponse>> _DeleteEvent([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18event/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteEvent");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("EventApi_GetEvent")]
        public async Task<ActionResult<OfferResponse>> _GetEvent([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18event/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetEvent");
            return method != null
                ? (await ((Task<OfferResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("EventApi_SearchEventTransactions")]
        public async Task<ActionResult<List<EventAttendanceResponse>>> _SearchEventTransactions([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18event/attendance/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchEventTransactions");
            return method != null
                ? (await ((Task<List<EventAttendanceResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("EventApi_SearchEvents")]
        public async Task<ActionResult<List<OfferShortResponse>>> _SearchEvents([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18event/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchEvents");
            return method != null
                ? (await ((Task<List<OfferShortResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("EventApi_UpdateEvent")]
        public async Task<ActionResult<OfferResponse>> _UpdateEvent([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18event/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateEvent");
            return method != null
                ? (await ((Task<OfferResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
