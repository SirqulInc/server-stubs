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
    public partial class ThemeDescriptorApi
    { 
        [FunctionName("ThemeDescriptorApi_AddOrUpdateThemeDescriptor")]
        public async Task<ActionResult<ThemeDescriptorResponse>> _AddOrUpdateThemeDescriptor([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18consumer/theme")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AddOrUpdateThemeDescriptor");
            return method != null
                ? (await ((Task<ThemeDescriptorResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ThemeDescriptorApi_GetThemeDescriptor")]
        public async Task<ActionResult<PurchaseItemListResponse>> _GetThemeDescriptor([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18consumer/theme/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetThemeDescriptor");
            return method != null
                ? (await ((Task<PurchaseItemListResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ThemeDescriptorApi_GetThemeDescriptors")]
        public async Task<ActionResult<PurchaseItemListResponse>> _GetThemeDescriptors([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18consumer/theme/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetThemeDescriptors");
            return method != null
                ? (await ((Task<PurchaseItemListResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ThemeDescriptorApi_RemoveThemeDescriptor")]
        public async Task<ActionResult<SirqulResponse>> _RemoveThemeDescriptor([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18consumer/theme/remove")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("RemoveThemeDescriptor");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
