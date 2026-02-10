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
    public partial class ShipmentBatchApi
    { 
        [FunctionName("ShipmentBatchApi_CreateShipmentBatch")]
        public async Task<ActionResult<ShipmentBatch>> _CreateShipmentBatch([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/shipment/batch")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateShipmentBatch");
            return method != null
                ? (await ((Task<ShipmentBatch>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ShipmentBatchApi_DeleteShipmentBatch")]
        public async Task<ActionResult<>> _DeleteShipmentBatch([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "api/{version}/shipment/batch/{batchId}")]HttpRequest req, ExecutionContext context, decimal version, long batchId)
        {
            var method = this.GetType().GetMethod("DeleteShipmentBatch");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, version, batchId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ShipmentBatchApi_GetShipmentBatch")]
        public async Task<ActionResult<ShipmentBatch>> _GetShipmentBatch([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/shipment/batch/{batchId}")]HttpRequest req, ExecutionContext context, decimal version, long batchId)
        {
            var method = this.GetType().GetMethod("GetShipmentBatch");
            return method != null
                ? (await ((Task<ShipmentBatch>)method.Invoke(this, new object[] { req, context, version, batchId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ShipmentBatchApi_GetShipmentBatchStatus")]
        public async Task<ActionResult<List<ShipmentImportStatus>>> _GetShipmentBatchStatus([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/shipment/batch/{batchId}/status")]HttpRequest req, ExecutionContext context, decimal version, long batchId)
        {
            var method = this.GetType().GetMethod("GetShipmentBatchStatus");
            return method != null
                ? (await ((Task<List<ShipmentImportStatus>>)method.Invoke(this, new object[] { req, context, version, batchId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ShipmentBatchApi_SearchShipmentBatch")]
        public async Task<ActionResult<List<ShipmentBatch>>> _SearchShipmentBatch([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/shipment/batch")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchShipmentBatch");
            return method != null
                ? (await ((Task<List<ShipmentBatch>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
