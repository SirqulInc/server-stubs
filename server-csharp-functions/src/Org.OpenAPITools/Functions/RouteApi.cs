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
    public partial class RouteApi
    { 
        [FunctionName("RouteApi_ApproveRoute")]
        public async Task<ActionResult<Route>> _ApproveRoute([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/route/{routeId}/approve")]HttpRequest req, ExecutionContext context, decimal version, long routeId)
        {
            var method = this.GetType().GetMethod("ApproveRoute");
            return method != null
                ? (await ((Task<Route>)method.Invoke(this, new object[] { req, context, version, routeId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RouteApi_CopyRoute")]
        public async Task<ActionResult<Route>> _CopyRoute([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/route/{routeId}/copy")]HttpRequest req, ExecutionContext context, decimal version, long routeId)
        {
            var method = this.GetType().GetMethod("CopyRoute");
            return method != null
                ? (await ((Task<Route>)method.Invoke(this, new object[] { req, context, version, routeId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RouteApi_CreateRoute")]
        public async Task<ActionResult<Route>> _CreateRoute([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/route")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateRoute");
            return method != null
                ? (await ((Task<Route>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RouteApi_CreateRouteDirections")]
        public async Task<ActionResult<List<Direction>>> _CreateRouteDirections([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "api/{version}/route/{routeId}/directions")]HttpRequest req, ExecutionContext context, decimal version, long routeId)
        {
            var method = this.GetType().GetMethod("CreateRouteDirections");
            return method != null
                ? (await ((Task<List<Direction>>)method.Invoke(this, new object[] { req, context, version, routeId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RouteApi_CreateRoutePolyline")]
        public async Task<ActionResult<Route>> _CreateRoutePolyline([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "api/{version}/route/{routeId}/polyline")]HttpRequest req, ExecutionContext context, decimal version, long routeId)
        {
            var method = this.GetType().GetMethod("CreateRoutePolyline");
            return method != null
                ? (await ((Task<Route>)method.Invoke(this, new object[] { req, context, version, routeId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RouteApi_DeleteRoute")]
        public async Task<ActionResult<>> _DeleteRoute([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "api/{version}/route/{routeId}")]HttpRequest req, ExecutionContext context, decimal version, long routeId)
        {
            var method = this.GetType().GetMethod("DeleteRoute");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, version, routeId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RouteApi_DisapproveRoute")]
        public async Task<ActionResult<Route>> _DisapproveRoute([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/route/{routeId}/disapprove")]HttpRequest req, ExecutionContext context, decimal version, long routeId)
        {
            var method = this.GetType().GetMethod("DisapproveRoute");
            return method != null
                ? (await ((Task<Route>)method.Invoke(this, new object[] { req, context, version, routeId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RouteApi_GetRoute")]
        public async Task<ActionResult<Route>> _GetRoute([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/route/{routeId}")]HttpRequest req, ExecutionContext context, decimal version, long routeId)
        {
            var method = this.GetType().GetMethod("GetRoute");
            return method != null
                ? (await ((Task<Route>)method.Invoke(this, new object[] { req, context, version, routeId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RouteApi_GetRouteDirections")]
        public async Task<ActionResult<List<Direction>>> _GetRouteDirections([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/route/{routeId}/directions")]HttpRequest req, ExecutionContext context, decimal version, long routeId)
        {
            var method = this.GetType().GetMethod("GetRouteDirections");
            return method != null
                ? (await ((Task<List<Direction>>)method.Invoke(this, new object[] { req, context, version, routeId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RouteApi_GetRouteShipments")]
        public async Task<ActionResult<List<Shipment>>> _GetRouteShipments([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/route/{routeId}/shipments")]HttpRequest req, ExecutionContext context, decimal version, long routeId)
        {
            var method = this.GetType().GetMethod("GetRouteShipments");
            return method != null
                ? (await ((Task<List<Shipment>>)method.Invoke(this, new object[] { req, context, version, routeId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RouteApi_GetRouteStop")]
        public async Task<ActionResult<Stop>> _GetRouteStop([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/route/{routeId}/stop/{stopId}")]HttpRequest req, ExecutionContext context, decimal version, long routeId, long stopId)
        {
            var method = this.GetType().GetMethod("GetRouteStop");
            return method != null
                ? (await ((Task<Stop>)method.Invoke(this, new object[] { req, context, version, routeId, stopId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RouteApi_GetRouteStops")]
        public async Task<ActionResult<List<Stop>>> _GetRouteStops([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/route/{routeId}/stops")]HttpRequest req, ExecutionContext context, decimal version, long routeId)
        {
            var method = this.GetType().GetMethod("GetRouteStops");
            return method != null
                ? (await ((Task<List<Stop>>)method.Invoke(this, new object[] { req, context, version, routeId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RouteApi_GetShipmentsAtStop")]
        public async Task<ActionResult<List<Shipment>>> _GetShipmentsAtStop([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/route/{routeId}/stop/{stopId}/shipments")]HttpRequest req, ExecutionContext context, decimal version, long routeId, long stopId)
        {
            var method = this.GetType().GetMethod("GetShipmentsAtStop");
            return method != null
                ? (await ((Task<List<Shipment>>)method.Invoke(this, new object[] { req, context, version, routeId, stopId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RouteApi_OptimizeRoute")]
        public async Task<ActionResult<>> _OptimizeRoute([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/route/{routeId}/optimize")]HttpRequest req, ExecutionContext context, decimal version, long routeId)
        {
            var method = this.GetType().GetMethod("OptimizeRoute");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, version, routeId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RouteApi_RemoveStop")]
        public async Task<ActionResult<>> _RemoveStop([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "api/{version}/route/{routeId}/stop/{stopId}")]HttpRequest req, ExecutionContext context, decimal version, long routeId, long stopId)
        {
            var method = this.GetType().GetMethod("RemoveStop");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, version, routeId, stopId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RouteApi_ReorderRouteStopsPatch")]
        public async Task<ActionResult<List<Stop>>> _ReorderRouteStopsPatch([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "api/{version}/route/{routeId}/stops/reorder")]HttpRequest req, ExecutionContext context, decimal version, long routeId)
        {
            var method = this.GetType().GetMethod("ReorderRouteStopsPatch");
            return method != null
                ? (await ((Task<List<Stop>>)method.Invoke(this, new object[] { req, context, version, routeId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RouteApi_ReorderRouteStopsPost")]
        public async Task<ActionResult<List<Stop>>> _ReorderRouteStopsPost([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/route/{routeId}/stops/reorder")]HttpRequest req, ExecutionContext context, decimal version, long routeId)
        {
            var method = this.GetType().GetMethod("ReorderRouteStopsPost");
            return method != null
                ? (await ((Task<List<Stop>>)method.Invoke(this, new object[] { req, context, version, routeId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RouteApi_SearchRoutes")]
        public async Task<ActionResult<List<Route>>> _SearchRoutes([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/route")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchRoutes");
            return method != null
                ? (await ((Task<List<Route>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RouteApi_SetDriver")]
        public async Task<ActionResult<>> _SetDriver([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/route/{id}/driver/{driverId}")]HttpRequest req, ExecutionContext context, decimal version, long id, long driverId)
        {
            var method = this.GetType().GetMethod("SetDriver");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, version, id, driverId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RouteApi_UpdateRoute")]
        public async Task<ActionResult<Route>> _UpdateRoute([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "api/{version}/route/{routeId}")]HttpRequest req, ExecutionContext context, decimal version, long routeId)
        {
            var method = this.GetType().GetMethod("UpdateRoute");
            return method != null
                ? (await ((Task<Route>)method.Invoke(this, new object[] { req, context, version, routeId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RouteApi_UpdateRouteStop")]
        public async Task<ActionResult<>> _UpdateRouteStop([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "api/{version}/route/{routeId}/stop/{stopId}")]HttpRequest req, ExecutionContext context, decimal version, long routeId, long stopId)
        {
            var method = this.GetType().GetMethod("UpdateRouteStop");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, version, routeId, stopId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
