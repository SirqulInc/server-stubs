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
    public partial class ProgramApi
    { 
        [FunctionName("ProgramApi_CreateProgram")]
        public async Task<ActionResult<Program>> _CreateProgram([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/program")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateProgram");
            return method != null
                ? (await ((Task<Program>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProgramApi_DeleteProgram")]
        public async Task<ActionResult<>> _DeleteProgram([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "api/{version}/program/{id}")]HttpRequest req, ExecutionContext context, decimal version, long id)
        {
            var method = this.GetType().GetMethod("DeleteProgram");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, version, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProgramApi_GetProgram")]
        public async Task<ActionResult<Program>> _GetProgram([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/program/{id}")]HttpRequest req, ExecutionContext context, decimal version, long id)
        {
            var method = this.GetType().GetMethod("GetProgram");
            return method != null
                ? (await ((Task<Program>)method.Invoke(this, new object[] { req, context, version, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProgramApi_PostProgram")]
        public async Task<ActionResult<Program>> _PostProgram([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/program/{id}")]HttpRequest req, ExecutionContext context, decimal version, long id)
        {
            var method = this.GetType().GetMethod("PostProgram");
            return method != null
                ? (await ((Task<Program>)method.Invoke(this, new object[] { req, context, version, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProgramApi_PutProgram")]
        public async Task<ActionResult<Program>> _PutProgram([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "api/{version}/program/{id}")]HttpRequest req, ExecutionContext context, decimal version, long id)
        {
            var method = this.GetType().GetMethod("PutProgram");
            return method != null
                ? (await ((Task<Program>)method.Invoke(this, new object[] { req, context, version, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProgramApi_SearchPrograms")]
        public async Task<ActionResult<List<Program>>> _SearchPrograms([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/program")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchPrograms");
            return method != null
                ? (await ((Task<List<Program>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
