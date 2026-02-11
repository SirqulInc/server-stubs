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
    public partial class ScheduledNotificationApi
    { 
        [FunctionName("ScheduledNotificationApi_CreateScheduledNotification")]
        public async Task<ActionResult<ScheduledNotificationFullResponse>> _CreateScheduledNotification([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18notification/schedule/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateScheduledNotification");
            return method != null
                ? (await ((Task<ScheduledNotificationFullResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ScheduledNotificationApi_DeleteScheduledNotification")]
        public async Task<ActionResult<ScheduledNotificationFullResponse>> _DeleteScheduledNotification([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18notification/schedule/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteScheduledNotification");
            return method != null
                ? (await ((Task<ScheduledNotificationFullResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ScheduledNotificationApi_GetScheduledNotification")]
        public async Task<ActionResult<ScheduledNotificationFullResponse>> _GetScheduledNotification([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18notification/schedule/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetScheduledNotification");
            return method != null
                ? (await ((Task<ScheduledNotificationFullResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ScheduledNotificationApi_ScheduleNotificationListings")]
        public async Task<ActionResult<SirqulResponse>> _ScheduleNotificationListings([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18notification/schedule/generate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ScheduleNotificationListings");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ScheduledNotificationApi_SearchScheduledNotifications")]
        public async Task<ActionResult<ScheduledNotificationFullResponse>> _SearchScheduledNotifications([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18notification/schedule/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchScheduledNotifications");
            return method != null
                ? (await ((Task<ScheduledNotificationFullResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ScheduledNotificationApi_UpdateScheduledNotification")]
        public async Task<ActionResult<ScheduledNotificationFullResponse>> _UpdateScheduledNotification([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18notification/schedule/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateScheduledNotification");
            return method != null
                ? (await ((Task<ScheduledNotificationFullResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
