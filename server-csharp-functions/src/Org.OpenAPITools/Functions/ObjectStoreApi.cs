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
    public partial class ObjectStoreApi
    { 
        [FunctionName("ObjectStoreApi_AddField")]
        public async Task<ActionResult<ObjectStoreResponse>> _AddField([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/object/field/add")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("AddField");
            return method != null
                ? (await ((Task<ObjectStoreResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ObjectStoreApi_CreateData")]
        public async Task<ActionResult<ObjectStoreResponse>> _CreateData([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/object/data/{objectName}")]HttpRequest req, ExecutionContext context, decimal version, string objectName)
        {
            var method = this.GetType().GetMethod("CreateData");
            return method != null
                ? (await ((Task<ObjectStoreResponse>)method.Invoke(this, new object[] { req, context, version, objectName })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ObjectStoreApi_CreateObject")]
        public async Task<ActionResult<ObjectStoreResponse>> _CreateObject([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/object/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateObject");
            return method != null
                ? (await ((Task<ObjectStoreResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ObjectStoreApi_DeleteData")]
        public async Task<ActionResult<ObjectStoreResponse>> _DeleteData([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "api/{version}/object/data/{objectName}/{objectId}")]HttpRequest req, ExecutionContext context, decimal version, string objectName, string objectId)
        {
            var method = this.GetType().GetMethod("DeleteData");
            return method != null
                ? (await ((Task<ObjectStoreResponse>)method.Invoke(this, new object[] { req, context, version, objectName, objectId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ObjectStoreApi_DeleteField")]
        public async Task<ActionResult<ObjectStoreResponse>> _DeleteField([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/object/field/delete")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("DeleteField");
            return method != null
                ? (await ((Task<ObjectStoreResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ObjectStoreApi_DeleteObject")]
        public async Task<ActionResult<ObjectStoreResponse>> _DeleteObject([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/object/delete")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("DeleteObject");
            return method != null
                ? (await ((Task<ObjectStoreResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ObjectStoreApi_GetData")]
        public async Task<ActionResult<ObjectStoreResponse>> _GetData([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/object/data/{objectName}/{objectId}")]HttpRequest req, ExecutionContext context, decimal version, string objectName, string objectId)
        {
            var method = this.GetType().GetMethod("GetData");
            return method != null
                ? (await ((Task<ObjectStoreResponse>)method.Invoke(this, new object[] { req, context, version, objectName, objectId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ObjectStoreApi_GetObject")]
        public async Task<ActionResult<ObjectStoreResponse>> _GetObject([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/object/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetObject");
            return method != null
                ? (await ((Task<ObjectStoreResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ObjectStoreApi_SearchData")]
        public async Task<ActionResult<ObjectStoreResponse>> _SearchData([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/object/data/{objectName}")]HttpRequest req, ExecutionContext context, decimal version, string objectName)
        {
            var method = this.GetType().GetMethod("SearchData");
            return method != null
                ? (await ((Task<ObjectStoreResponse>)method.Invoke(this, new object[] { req, context, version, objectName })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ObjectStoreApi_SearchObject")]
        public async Task<ActionResult<ObjectStoreResponse>> _SearchObject([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/object/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchObject");
            return method != null
                ? (await ((Task<ObjectStoreResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ObjectStoreApi_UpdateData")]
        public async Task<ActionResult<ObjectStoreResponse>> _UpdateData([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "api/{version}/object/data/{objectName}/{objectId}")]HttpRequest req, ExecutionContext context, decimal version, string objectName, string objectId)
        {
            var method = this.GetType().GetMethod("UpdateData");
            return method != null
                ? (await ((Task<ObjectStoreResponse>)method.Invoke(this, new object[] { req, context, version, objectName, objectId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
