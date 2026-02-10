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
    public partial class CargoTypeApi
    { 
        [FunctionName("CargoTypeApi_CreateCargoType")]
        public async Task<ActionResult<CargoType>> _CreateCargoType([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/cargo/type")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateCargoType");
            return method != null
                ? (await ((Task<CargoType>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CargoTypeApi_DeleteCargoType")]
        public async Task<ActionResult<>> _DeleteCargoType([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "api/{version}/cargo/type/{cargoTypeId}")]HttpRequest req, ExecutionContext context, decimal version, long cargoTypeId)
        {
            var method = this.GetType().GetMethod("DeleteCargoType");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, version, cargoTypeId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CargoTypeApi_GetCargoType")]
        public async Task<ActionResult<CargoType>> _GetCargoType([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/cargo/type/{cargoTypeId}")]HttpRequest req, ExecutionContext context, decimal version, long cargoTypeId)
        {
            var method = this.GetType().GetMethod("GetCargoType");
            return method != null
                ? (await ((Task<CargoType>)method.Invoke(this, new object[] { req, context, version, cargoTypeId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CargoTypeApi_SearchCargoTypes")]
        public async Task<ActionResult<List<CargoType>>> _SearchCargoTypes([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/cargo/type")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchCargoTypes");
            return method != null
                ? (await ((Task<List<CargoType>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CargoTypeApi_UpdateCargoType")]
        public async Task<ActionResult<CargoType>> _UpdateCargoType([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "api/{version}/cargo/type/{cargoTypeId}")]HttpRequest req, ExecutionContext context, decimal version, long cargoTypeId)
        {
            var method = this.GetType().GetMethod("UpdateCargoType");
            return method != null
                ? (await ((Task<CargoType>)method.Invoke(this, new object[] { req, context, version, cargoTypeId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
