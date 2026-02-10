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
    public partial class NoteApi
    { 
        [FunctionName("NoteApi_BatchOperation")]
        public async Task<ActionResult<SirqulResponse>> _BatchOperation([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/note/batch")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("BatchOperation");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("NoteApi_CreateNote")]
        public async Task<ActionResult<NoteResponse>> _CreateNote([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/note/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateNote");
            return method != null
                ? (await ((Task<NoteResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("NoteApi_DeleteNote")]
        public async Task<ActionResult<SirqulResponse>> _DeleteNote([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/note/delete")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("DeleteNote");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("NoteApi_GetNote")]
        public async Task<ActionResult<SirqulResponse>> _GetNote([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/note/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetNote");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("NoteApi_SearchNotes")]
        public async Task<ActionResult<List<NoteResponse>>> _SearchNotes([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/note/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchNotes");
            return method != null
                ? (await ((Task<List<NoteResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("NoteApi_UpdateNote")]
        public async Task<ActionResult<NoteResponse>> _UpdateNote([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/note/update")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("UpdateNote");
            return method != null
                ? (await ((Task<NoteResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
