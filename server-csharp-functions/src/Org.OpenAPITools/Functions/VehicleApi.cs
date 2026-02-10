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
    public partial class VehicleApi
    { 
        [FunctionName("VehicleApi_CreateVehicle")]
        public async Task<ActionResult<Vehicle>> _CreateVehicle([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/vehicle")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateVehicle");
            return method != null
                ? (await ((Task<Vehicle>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VehicleApi_DeleteVehicle")]
        public async Task<ActionResult<>> _DeleteVehicle([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "api/{version}/vehicle/{id}")]HttpRequest req, ExecutionContext context, decimal version, long id)
        {
            var method = this.GetType().GetMethod("DeleteVehicle");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, version, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VehicleApi_GetVehicle")]
        public async Task<ActionResult<Vehicle>> _GetVehicle([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/vehicle/{id}")]HttpRequest req, ExecutionContext context, decimal version, long id)
        {
            var method = this.GetType().GetMethod("GetVehicle");
            return method != null
                ? (await ((Task<Vehicle>)method.Invoke(this, new object[] { req, context, version, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VehicleApi_SearchVehicle")]
        public async Task<ActionResult<List<Vehicle>>> _SearchVehicle([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/vehicle")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchVehicle");
            return method != null
                ? (await ((Task<List<Vehicle>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VehicleApi_UpdateVehicle")]
        public async Task<ActionResult<Vehicle>> _UpdateVehicle([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "api/{version}/vehicle/{id}")]HttpRequest req, ExecutionContext context, decimal version, long id)
        {
            var method = this.GetType().GetMethod("UpdateVehicle");
            return method != null
                ? (await ((Task<Vehicle>)method.Invoke(this, new object[] { req, context, version, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
