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
    public partial class AccountApi
    { 
        [FunctionName("AccountApi_AccountLocationSearch")]
        public async Task<ActionResult<UserLocationSearchResponse>> _AccountLocationSearch([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18account/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AccountLocationSearch");
            return method != null
                ? (await ((Task<UserLocationSearchResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AccountApi_BlockAccount")]
        public async Task<ActionResult<SirqulResponse>> _BlockAccount([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18account/block")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("BlockAccount");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AccountApi_CreateAccount")]
        public async Task<ActionResult<AccountLoginResponse>> _CreateAccount([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18account/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateAccount");
            return method != null
                ? (await ((Task<AccountLoginResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AccountApi_EditAccount")]
        public async Task<ActionResult<ProfileInfoResponse>> _EditAccount([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18account/profile/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("EditAccount");
            return method != null
                ? (await ((Task<ProfileInfoResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AccountApi_EditUsername")]
        public async Task<ActionResult<SirqulResponse>> _EditUsername([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18account/username/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("EditUsername");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AccountApi_GetAccount")]
        public async Task<ActionResult<ProfileResponse>> _GetAccount([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18account/profile/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetAccount");
            return method != null
                ? (await ((Task<ProfileResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AccountApi_GetProfileAssets")]
        public async Task<ActionResult<AssetListResponse>> _GetProfileAssets([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18account/profile/assets")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetProfileAssets");
            return method != null
                ? (await ((Task<AssetListResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AccountApi_GetReferralList")]
        public async Task<ActionResult<>> _GetReferralList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18account/referral/list")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetReferralList");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AccountApi_GetSettings")]
        public async Task<ActionResult<UserSettingsResponse>> _GetSettings([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18account/settings/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetSettings");
            return method != null
                ? (await ((Task<UserSettingsResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AccountApi_LoginDelegate")]
        public async Task<ActionResult<ProfileResponse>> _LoginDelegate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18account/login/delegate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("LoginDelegate");
            return method != null
                ? (await ((Task<ProfileResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AccountApi_LoginGeneral")]
        public async Task<ActionResult<ProfileResponse>> _LoginGeneral([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18account/login")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("LoginGeneral");
            return method != null
                ? (await ((Task<ProfileResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AccountApi_LoginUsername")]
        public async Task<ActionResult<ProfileResponse>> _LoginUsername([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18account/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("LoginUsername");
            return method != null
                ? (await ((Task<ProfileResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AccountApi_Logout")]
        public async Task<ActionResult<SirqulResponse>> _Logout([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18account/logout")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("Logout");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AccountApi_MergeAccount")]
        public async Task<ActionResult<SirqulResponse>> _MergeAccount([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18account/merge")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("MergeAccount");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AccountApi_PasswordChange")]
        public async Task<ActionResult<SirqulResponse>> _PasswordChange([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18account/passwordchange")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PasswordChange");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AccountApi_PasswordReset")]
        public async Task<ActionResult<SirqulResponse>> _PasswordReset([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18account/passwordreset")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PasswordReset");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AccountApi_RequestPasswordReset")]
        public async Task<ActionResult<SirqulResponse>> _RequestPasswordReset([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18account/requestpasswordreset")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("RequestPasswordReset");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AccountApi_RequestValidateAccount")]
        public async Task<ActionResult<SirqulResponse>> _RequestValidateAccount([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18account/requestValidateAccount")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("RequestValidateAccount");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AccountApi_SearchAccounts")]
        public async Task<ActionResult<List<ProfileResponse>>> _SearchAccounts([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18account/profile/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchAccounts");
            return method != null
                ? (await ((Task<List<ProfileResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AccountApi_SecureLogin")]
        public async Task<ActionResult<ProfileResponse>> _SecureLogin([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18account/login/validate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SecureLogin");
            return method != null
                ? (await ((Task<ProfileResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AccountApi_SecureSignup")]
        public async Task<ActionResult<ProfileInfoResponse>> _SecureSignup([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18account/create/validate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SecureSignup");
            return method != null
                ? (await ((Task<ProfileInfoResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AccountApi_SetMatchToken")]
        public async Task<ActionResult<SirqulResponse>> _SetMatchToken([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18consumer/profile/matchToken")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SetMatchToken");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AccountApi_UpdateActveStatus")]
        public async Task<ActionResult<SirqulResponse>> _UpdateActveStatus([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18account/active/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateActveStatus");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AccountApi_UpdateLocation")]
        public async Task<ActionResult<SirqulResponse>> _UpdateLocation([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18account/location/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateLocation");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AccountApi_UpdateSettings")]
        public async Task<ActionResult<UserSettingsResponse>> _UpdateSettings([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18account/settings/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateSettings");
            return method != null
                ? (await ((Task<UserSettingsResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AccountApi_ValidateAccountSignup")]
        public async Task<ActionResult<AccountLoginResponse>> _ValidateAccountSignup([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18account/validateAccountSignup")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ValidateAccountSignup");
            return method != null
                ? (await ((Task<AccountLoginResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AccountApi_ValidatePasswordReset")]
        public async Task<ActionResult<SirqulResponse>> _ValidatePasswordReset([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18account/validatepasswordreset")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ValidatePasswordReset");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
