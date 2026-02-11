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
    public partial class LocationApi
    { 
        [FunctionName("LocationApi_CacheTrilaterationData")]
        public async Task<ActionResult<SirqulResponse>> _CacheTrilaterationData([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18location/trilaterate/cache")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CacheTrilaterationData");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LocationApi_CacheTrilaterationDataGzip")]
        public async Task<ActionResult<SirqulResponse>> _CacheTrilaterationDataGzip([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18location/trilaterate/cache/submit")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CacheTrilaterationDataGzip");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LocationApi_GetLocationByIp")]
        public async Task<ActionResult<CoordsResponse>> _GetLocationByIp([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18location/ip")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetLocationByIp");
            return method != null
                ? (await ((Task<CoordsResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LocationApi_GetLocationByTrilateration")]
        public async Task<ActionResult<GeoPointResponse>> _GetLocationByTrilateration([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18account/location/trilaterate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetLocationByTrilateration");
            return method != null
                ? (await ((Task<GeoPointResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LocationApi_GetLocations")]
        public async Task<ActionResult<LocationSearchResponse>> _GetLocations([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18location/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetLocations");
            return method != null
                ? (await ((Task<LocationSearchResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
