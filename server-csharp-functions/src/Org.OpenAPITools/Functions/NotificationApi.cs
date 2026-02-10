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
    public partial class NotificationApi
    { 
        [FunctionName("NotificationApi_CreateNotificationTemplate")]
        public async Task<ActionResult<NotificationTemplateResponse>> _CreateNotificationTemplate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/notification/template/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateNotificationTemplate");
            return method != null
                ? (await ((Task<NotificationTemplateResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("NotificationApi_CreateOrUpdateBlockedNotifications")]
        public async Task<ActionResult<BlockedNotificationResponse>> _CreateOrUpdateBlockedNotifications([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/notification/blocked/batch")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateOrUpdateBlockedNotifications");
            return method != null
                ? (await ((Task<BlockedNotificationResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("NotificationApi_DeleteNotificationTemplate")]
        public async Task<ActionResult<NotificationTemplateResponse>> _DeleteNotificationTemplate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/notification/template/delete")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("DeleteNotificationTemplate");
            return method != null
                ? (await ((Task<NotificationTemplateResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("NotificationApi_GetNotificationTemplate")]
        public async Task<ActionResult<NotificationTemplateResponse>> _GetNotificationTemplate([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/notification/template/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetNotificationTemplate");
            return method != null
                ? (await ((Task<NotificationTemplateResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("NotificationApi_GetNotifications")]
        public async Task<ActionResult<NotificationMessageListResponse>> _GetNotifications([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/notification/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetNotifications");
            return method != null
                ? (await ((Task<NotificationMessageListResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("NotificationApi_RegisterNotificationToken")]
        public async Task<ActionResult<SirqulResponse>> _RegisterNotificationToken([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/notification/token")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("RegisterNotificationToken");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("NotificationApi_SearchBlockedNotifications")]
        public async Task<ActionResult<BlockedNotificationResponse>> _SearchBlockedNotifications([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/notification/blocked/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchBlockedNotifications");
            return method != null
                ? (await ((Task<BlockedNotificationResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("NotificationApi_SearchNotificationTemplate")]
        public async Task<ActionResult<NotificationTemplateResponse>> _SearchNotificationTemplate([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/notification/template/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchNotificationTemplate");
            return method != null
                ? (await ((Task<NotificationTemplateResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("NotificationApi_SearchRecipients")]
        public async Task<ActionResult<List<NotificationRecipientResponse>>> _SearchRecipients([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/notification/recipient/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchRecipients");
            return method != null
                ? (await ((Task<List<NotificationRecipientResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("NotificationApi_SearchRecipientsCount")]
        public async Task<ActionResult<NotificationRecipientResponseListResponse>> _SearchRecipientsCount([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/notification/recipient/search/count")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchRecipientsCount");
            return method != null
                ? (await ((Task<NotificationRecipientResponseListResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("NotificationApi_SendBatchNotifications")]
        public async Task<ActionResult<SirqulResponse>> _SendBatchNotifications([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/notification/batch")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SendBatchNotifications");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("NotificationApi_SendCustomNotifications")]
        public async Task<ActionResult<SirqulResponse>> _SendCustomNotifications([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/notification/custom")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SendCustomNotifications");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("NotificationApi_UpdateNotificationTemplate")]
        public async Task<ActionResult<NotificationTemplateResponse>> _UpdateNotificationTemplate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/notification/template/update")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("UpdateNotificationTemplate");
            return method != null
                ? (await ((Task<NotificationTemplateResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
