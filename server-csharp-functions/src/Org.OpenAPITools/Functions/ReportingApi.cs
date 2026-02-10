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
    public partial class ReportingApi
    { 
        [FunctionName("ReportingApi_CreateBatch")]
        public async Task<ActionResult<ReportBatchResponse>> _CreateBatch([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/report/batch/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateBatch");
            return method != null
                ? (await ((Task<ReportBatchResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReportingApi_CreateRegionLegSummaryBatch")]
        public async Task<ActionResult<ReportRegionLegSummaryBatchResponse>> _CreateRegionLegSummaryBatch([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/report/region/summary/batch")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateRegionLegSummaryBatch");
            return method != null
                ? (await ((Task<ReportRegionLegSummaryBatchResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReportingApi_DeleteBatch")]
        public async Task<ActionResult<SirqulResponse>> _DeleteBatch([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/report/batch/delete")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("DeleteBatch");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReportingApi_GetReportBatch")]
        public async Task<ActionResult<ReportBatchResponse>> _GetReportBatch([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/report/batch/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetReportBatch");
            return method != null
                ? (await ((Task<ReportBatchResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReportingApi_RunReport")]
        public async Task<ActionResult<ReportResponse>> _RunReport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/report/run")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("RunReport");
            return method != null
                ? (await ((Task<ReportResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ReportingApi_SearchBatch")]
        public async Task<ActionResult<List<ReportBatchResponse>>> _SearchBatch([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/report/batch/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchBatch");
            return method != null
                ? (await ((Task<List<ReportBatchResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
