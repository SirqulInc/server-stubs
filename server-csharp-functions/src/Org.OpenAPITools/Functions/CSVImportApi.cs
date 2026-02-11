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
    public partial class CSVImportApi
    { 
        [FunctionName("CSVImportApi_GetStatusCSV")]
        public async Task<ActionResult<SirqulResponse>> _GetStatusCSV([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18csvimport/batch/status/details")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetStatusCSV");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CSVImportApi_ListStatusCSV")]
        public async Task<ActionResult<CsvImportResponse>> _ListStatusCSV([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18csvimport/batch/list")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ListStatusCSV");
            return method != null
                ? (await ((Task<CsvImportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CSVImportApi_StatusCSV")]
        public async Task<ActionResult<CsvImportResponse>> _StatusCSV([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18csvimport/batch/status")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("StatusCSV");
            return method != null
                ? (await ((Task<CsvImportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CSVImportApi_UploadCSV")]
        public async Task<ActionResult<CsvImportResponse>> _UploadCSV([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18csvimport/upload")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UploadCSV");
            return method != null
                ? (await ((Task<CsvImportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
