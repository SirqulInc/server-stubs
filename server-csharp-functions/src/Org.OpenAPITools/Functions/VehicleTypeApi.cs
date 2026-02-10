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
    public partial class VehicleTypeApi
    { 
        [FunctionName("VehicleTypeApi_CreateVehicleType")]
        public async Task<ActionResult<VehicleType>> _CreateVehicleType([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/vehicle/type")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateVehicleType");
            return method != null
                ? (await ((Task<VehicleType>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VehicleTypeApi_DeleteVehicleType")]
        public async Task<ActionResult<>> _DeleteVehicleType([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "api/{version}/vehicle/type/{vehicleTypeId}")]HttpRequest req, ExecutionContext context, decimal version, long vehicleTypeId)
        {
            var method = this.GetType().GetMethod("DeleteVehicleType");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, version, vehicleTypeId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VehicleTypeApi_GetVehicleType")]
        public async Task<ActionResult<VehicleType>> _GetVehicleType([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/vehicle/type/{vehicleTypeId}")]HttpRequest req, ExecutionContext context, decimal version, long vehicleTypeId)
        {
            var method = this.GetType().GetMethod("GetVehicleType");
            return method != null
                ? (await ((Task<VehicleType>)method.Invoke(this, new object[] { req, context, version, vehicleTypeId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VehicleTypeApi_SearchVehicleTypes")]
        public async Task<ActionResult<List<VehicleType>>> _SearchVehicleTypes([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/vehicle/type")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchVehicleTypes");
            return method != null
                ? (await ((Task<List<VehicleType>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VehicleTypeApi_UpdateVehicleType")]
        public async Task<ActionResult<VehicleType>> _UpdateVehicleType([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "api/{version}/vehicle/type/{vehicleTypeId}")]HttpRequest req, ExecutionContext context, decimal version, long vehicleTypeId)
        {
            var method = this.GetType().GetMethod("UpdateVehicleType");
            return method != null
                ? (await ((Task<VehicleType>)method.Invoke(this, new object[] { req, context, version, vehicleTypeId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
