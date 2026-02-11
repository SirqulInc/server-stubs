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
    public partial class ShipmentApi
    { 
        [FunctionName("ShipmentApi_CancelShipment")]
        public async Task<ActionResult<>> _CancelShipment([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18shipment/{id}/cancel")]HttpRequest req, ExecutionContext context, long id)
        {
            var method = this.GetType().GetMethod("CancelShipment");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ShipmentApi_CreateShipment")]
        public async Task<ActionResult<Shipment>> _CreateShipment([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18shipment")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateShipment");
            return method != null
                ? (await ((Task<Shipment>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ShipmentApi_DeleteShipment")]
        public async Task<ActionResult<>> _DeleteShipment([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "api/3.18shipment/{id}")]HttpRequest req, ExecutionContext context, long id)
        {
            var method = this.GetType().GetMethod("DeleteShipment");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ShipmentApi_GetShipment")]
        public async Task<ActionResult<Shipment>> _GetShipment([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18shipment/{id}")]HttpRequest req, ExecutionContext context, long id)
        {
            var method = this.GetType().GetMethod("GetShipment");
            return method != null
                ? (await ((Task<Shipment>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ShipmentApi_SearchShipments")]
        public async Task<ActionResult<List<Shipment>>> _SearchShipments([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18shipment")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchShipments");
            return method != null
                ? (await ((Task<List<Shipment>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ShipmentApi_UpdateShipment")]
        public async Task<ActionResult<Shipment>> _UpdateShipment([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "api/3.18shipment/{id}")]HttpRequest req, ExecutionContext context, long id)
        {
            var method = this.GetType().GetMethod("UpdateShipment");
            return method != null
                ? (await ((Task<Shipment>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ShipmentApi_UpdateShipmentStatus")]
        public async Task<ActionResult<>> _UpdateShipmentStatus([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18shipment/{id}/status")]HttpRequest req, ExecutionContext context, long id)
        {
            var method = this.GetType().GetMethod("UpdateShipmentStatus");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
