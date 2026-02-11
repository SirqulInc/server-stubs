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
    public partial class VatomApi
    { 
        [FunctionName("VatomApi_CreateFollowing")]
        public async Task<ActionResult<>> _CreateFollowing([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18vatom/me/rels/following/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateFollowing");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_CreateSpace")]
        public async Task<ActionResult<>> _CreateSpace([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18vatom/b/spaces/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateSpace");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_CreateVatomEvent")]
        public async Task<ActionResult<>> _CreateVatomEvent([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18vatom/b/events/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateVatomEvent");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_DeleteFollowing")]
        public async Task<ActionResult<>> _DeleteFollowing([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18vatom/me/rels/following/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteFollowing");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_DeletePointsBalance")]
        public async Task<ActionResult<>> _DeletePointsBalance([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18vatom/b/campaign/points/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeletePointsBalance");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_DeleteSpace")]
        public async Task<ActionResult<>> _DeleteSpace([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18vatom/b/spaces/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteSpace");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_DeleteVatomEvent")]
        public async Task<ActionResult<>> _DeleteVatomEvent([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18vatom/b/events/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteVatomEvent");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_DeleteVatomNFT")]
        public async Task<ActionResult<>> _DeleteVatomNFT([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18vatom/vatoms/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteVatomNFT");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_ExecuteActionOnNFT")]
        public async Task<ActionResult<>> _ExecuteActionOnNFT([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18vatom/vatoms/execute-action")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ExecuteActionOnNFT");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_GeomapSearch")]
        public async Task<ActionResult<>> _GeomapSearch([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/vatoms/geo-map/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GeomapSearch");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_GetBusinessBehaviors")]
        public async Task<ActionResult<>> _GetBusinessBehaviors([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/b/behaviors")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetBusinessBehaviors");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_GetBusinessCoinsBalance")]
        public async Task<ActionResult<>> _GetBusinessCoinsBalance([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/b/coins/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetBusinessCoinsBalance");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_GetBusinessIds")]
        public async Task<ActionResult<>> _GetBusinessIds([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/me/businesses")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetBusinessIds");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_GetBusinessInfo")]
        public async Task<ActionResult<>> _GetBusinessInfo([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/b/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetBusinessInfo");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_GetBusinessUsers")]
        public async Task<ActionResult<>> _GetBusinessUsers([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/b/users")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetBusinessUsers");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_GetCampaignGroupEntities")]
        public async Task<ActionResult<>> _GetCampaignGroupEntities([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/b/campaign-groups/entities")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetCampaignGroupEntities");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_GetCampaignGroupRules")]
        public async Task<ActionResult<>> _GetCampaignGroupRules([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/b/campaign-groups/rules")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetCampaignGroupRules");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_GetCampaignGroupStats")]
        public async Task<ActionResult<>> _GetCampaignGroupStats([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/b/campaign-groups/stats")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetCampaignGroupStats");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_GetCampaignInfo")]
        public async Task<ActionResult<>> _GetCampaignInfo([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/b/campaign-groups/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetCampaignInfo");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_GetEventGuestList")]
        public async Task<ActionResult<>> _GetEventGuestList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/b/events/guests/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetEventGuestList");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_GetInventory")]
        public async Task<ActionResult<>> _GetInventory([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/me/inventory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetInventory");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_GetMyFollowing")]
        public async Task<ActionResult<>> _GetMyFollowing([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/me/rels/following")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetMyFollowing");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_GetPointsBalance")]
        public async Task<ActionResult<>> _GetPointsBalance([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/u/campaign/points/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetPointsBalance");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_GetPointsBalanceAsBusiness")]
        public async Task<ActionResult<>> _GetPointsBalanceAsBusiness([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/b/campaign/u/points/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetPointsBalanceAsBusiness");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_GetSpace")]
        public async Task<ActionResult<>> _GetSpace([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/b/spaces/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetSpace");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_GetUserCoinsAsBusiness")]
        public async Task<ActionResult<>> _GetUserCoinsAsBusiness([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/b/users/coins/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetUserCoinsAsBusiness");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_GetUserCoinsBalance")]
        public async Task<ActionResult<>> _GetUserCoinsBalance([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/u/coins/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetUserCoinsBalance");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_GetUserFollowers")]
        public async Task<ActionResult<>> _GetUserFollowers([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/users/rels/followers")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetUserFollowers");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_GetUserFollowing")]
        public async Task<ActionResult<>> _GetUserFollowing([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/users/rels/following")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetUserFollowing");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_GetUserInfo")]
        public async Task<ActionResult<>> _GetUserInfo([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/user/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetUserInfo");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_GetUserProfile")]
        public async Task<ActionResult<>> _GetUserProfile([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/me/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetUserProfile");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_GetVatomEvent")]
        public async Task<ActionResult<>> _GetVatomEvent([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/b/events/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetVatomEvent");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_GetVatomNFT")]
        public async Task<ActionResult<>> _GetVatomNFT([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/vatoms/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetVatomNFT");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_ListCommunities")]
        public async Task<ActionResult<>> _ListCommunities([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/b/communities/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ListCommunities");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_ListEvents")]
        public async Task<ActionResult<>> _ListEvents([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/b/events/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ListEvents");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_ListSpaces")]
        public async Task<ActionResult<>> _ListSpaces([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/b/spaces/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ListSpaces");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_ListUserCoinTransactions")]
        public async Task<ActionResult<>> _ListUserCoinTransactions([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/u/coins/txns/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ListUserCoinTransactions");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_ListUserCoinTransactionsAsBusiness")]
        public async Task<ActionResult<>> _ListUserCoinTransactionsAsBusiness([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/b/users/coins/txns/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ListUserCoinTransactionsAsBusiness");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_PerformActionOnNFT")]
        public async Task<ActionResult<>> _PerformActionOnNFT([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18vatom/me/vatoms/actions")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PerformActionOnNFT");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_RedeemNFT")]
        public async Task<ActionResult<>> _RedeemNFT([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18vatom/b/redemptions")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("RedeemNFT");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_RedeemUserCoinsAsBusiness")]
        public async Task<ActionResult<>> _RedeemUserCoinsAsBusiness([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18vatom/b/users/coins/redeem")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("RedeemUserCoinsAsBusiness");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_SearchBusinesses")]
        public async Task<ActionResult<>> _SearchBusinesses([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/b/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchBusinesses");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_SearchCampaignGroups")]
        public async Task<ActionResult<>> _SearchCampaignGroups([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/b/campaign-groups/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchCampaignGroups");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_SearchIdentities")]
        public async Task<ActionResult<>> _SearchIdentities([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/me/identities/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchIdentities");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_SearchInventory")]
        public async Task<ActionResult<>> _SearchInventory([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18vatom/user-inventory/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchInventory");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_SendNFT")]
        public async Task<ActionResult<>> _SendNFT([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18vatom/b/campaigns/send")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SendNFT");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_SetPointsBalanceAsBusiness")]
        public async Task<ActionResult<>> _SetPointsBalanceAsBusiness([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18vatom/b/campaign/u/points/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SetPointsBalanceAsBusiness");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_TransferUserCoins")]
        public async Task<ActionResult<>> _TransferUserCoins([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18vatom/u/coins/transfer")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("TransferUserCoins");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_UpdateBusinessCoins")]
        public async Task<ActionResult<>> _UpdateBusinessCoins([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18vatom/b/coins/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateBusinessCoins");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_UpdateEventGuestList")]
        public async Task<ActionResult<>> _UpdateEventGuestList([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18vatom/b/events/guests/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateEventGuestList");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_UpdateSpace")]
        public async Task<ActionResult<>> _UpdateSpace([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18vatom/b/spaces/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateSpace");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_UpdateUserCoinsAsBusiness")]
        public async Task<ActionResult<>> _UpdateUserCoinsAsBusiness([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18vatom/b/users/coins/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateUserCoinsAsBusiness");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_UpdateUserProfile")]
        public async Task<ActionResult<>> _UpdateUserProfile([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18vatom/me/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateUserProfile");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VatomApi_UpdateVatomEvent")]
        public async Task<ActionResult<>> _UpdateVatomEvent([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18vatom/b/events/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateVatomEvent");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
