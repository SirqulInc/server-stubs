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
    public partial class CreativeApi
    { 
        [FunctionName("CreativeApi_AddPreview")]
        public async Task<ActionResult<SirqulResponse>> _AddPreview([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/creative/addpreview")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("AddPreview");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CreativeApi_AdsFind")]
        public async Task<ActionResult<List<MissionResponse>>> _AdsFind([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/ads/find")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("AdsFind");
            return method != null
                ? (await ((Task<List<MissionResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CreativeApi_CreateCreative")]
        public async Task<ActionResult<CreativeResponse>> _CreateCreative([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/creative/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateCreative");
            return method != null
                ? (await ((Task<CreativeResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CreativeApi_DeleteCreative")]
        public async Task<ActionResult<SirqulResponse>> _DeleteCreative([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/creative/delete")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("DeleteCreative");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CreativeApi_GetCreative")]
        public async Task<ActionResult<CreativeResponse>> _GetCreative([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/creative/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetCreative");
            return method != null
                ? (await ((Task<CreativeResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CreativeApi_GetCreativesByApplication")]
        public async Task<ActionResult<List<CreativeResponse>>> _GetCreativesByApplication([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/creative/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetCreativesByApplication");
            return method != null
                ? (await ((Task<List<CreativeResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CreativeApi_RemovePreview")]
        public async Task<ActionResult<SirqulResponse>> _RemovePreview([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/creative/removepreview")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("RemovePreview");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CreativeApi_UpdateCreative")]
        public async Task<ActionResult<CreativeResponse>> _UpdateCreative([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/creative/update")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("UpdateCreative");
            return method != null
                ? (await ((Task<CreativeResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
