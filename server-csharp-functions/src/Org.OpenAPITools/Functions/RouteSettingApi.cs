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
    public partial class RouteSettingApi
    { 
        [FunctionName("RouteSettingApi_CreateRouteSettings")]
        public async Task<ActionResult<RouteSettings>> _CreateRouteSettings([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18route/setting")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateRouteSettings");
            return method != null
                ? (await ((Task<RouteSettings>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RouteSettingApi_DeleteRouteSettings")]
        public async Task<ActionResult<Object>> _DeleteRouteSettings([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "api/3.18route/setting/{routeSettingsId}")]HttpRequest req, ExecutionContext context, long routeSettingsId)
        {
            var method = this.GetType().GetMethod("DeleteRouteSettings");
            return method != null
                ? (await ((Task<Object>)method.Invoke(this, new object[] { req, context, routeSettingsId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RouteSettingApi_GetRouteSettings")]
        public async Task<ActionResult<RouteSettings>> _GetRouteSettings([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18route/setting/{routeSettingsId}")]HttpRequest req, ExecutionContext context, long routeSettingsId)
        {
            var method = this.GetType().GetMethod("GetRouteSettings");
            return method != null
                ? (await ((Task<RouteSettings>)method.Invoke(this, new object[] { req, context, routeSettingsId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RouteSettingApi_SearchRouteSettings")]
        public async Task<ActionResult<List<RouteSettings>>> _SearchRouteSettings([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18route/setting")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchRouteSettings");
            return method != null
                ? (await ((Task<List<RouteSettings>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RouteSettingApi_UpdateRouteSettings")]
        public async Task<ActionResult<RouteSettings>> _UpdateRouteSettings([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "api/3.18route/setting/{routeSettingsId}")]HttpRequest req, ExecutionContext context, long routeSettingsId)
        {
            var method = this.GetType().GetMethod("UpdateRouteSettings");
            return method != null
                ? (await ((Task<RouteSettings>)method.Invoke(this, new object[] { req, context, routeSettingsId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
