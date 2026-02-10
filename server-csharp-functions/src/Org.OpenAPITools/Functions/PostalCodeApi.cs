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
    public partial class PostalCodeApi
    { 
        [FunctionName("PostalCodeApi_CreatePostalCode")]
        public async Task<ActionResult<PostalCodeResponse>> _CreatePostalCode([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/postalCode/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreatePostalCode");
            return method != null
                ? (await ((Task<PostalCodeResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PostalCodeApi_DeletePostalCode")]
        public async Task<ActionResult<SirqulResponse>> _DeletePostalCode([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/postalCode/delete")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("DeletePostalCode");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PostalCodeApi_GetPostalCode")]
        public async Task<ActionResult<PostalCodeResponse>> _GetPostalCode([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/postalCode/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetPostalCode");
            return method != null
                ? (await ((Task<PostalCodeResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PostalCodeApi_GetPostalCodes")]
        public async Task<ActionResult<List<PostalCodeResponse>>> _GetPostalCodes([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/postalCode/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetPostalCodes");
            return method != null
                ? (await ((Task<List<PostalCodeResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PostalCodeApi_UpdatePostalCode")]
        public async Task<ActionResult<PostalCodeResponse>> _UpdatePostalCode([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/postalCode/update")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("UpdatePostalCode");
            return method != null
                ? (await ((Task<PostalCodeResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
