package org.openapitools.api;

import org.openapitools.api.VatomApiService;
import org.openapitools.api.factories.VatomApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/vatom")


@io.swagger.annotations.Api(description = "the vatom API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class VatomApi  {
   private final VatomApiService delegate;

   public VatomApi(@Context ServletConfig servletContext) {
      VatomApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("VatomApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (VatomApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = VatomApiServiceFactory.getVatomApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/me/rels/following/create")
    
    
    @io.swagger.annotations.ApiOperation(value = "Create following", notes = "Create following.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response createFollowing(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Vatom Parameters", required = true) @QueryParam("vatomParameters") @NotNull  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createFollowing(accountId, vatomParameters, returnRawResponse, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/b/spaces/create")
    
    
    @io.swagger.annotations.ApiOperation(value = "Create Vatom Space", notes = "Create a Vatom space.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response createSpace(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom Parameters", required = true) @QueryParam("vatomParameters") @NotNull  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createSpace(accountId, appKey, vatomParameters, returnRawResponse, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/b/events/create")
    
    
    @io.swagger.annotations.ApiOperation(value = "Create Vatom Event", notes = "Create a Vatom event.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response createVatomEvent(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom Parameters", required = true) @QueryParam("vatomParameters") @NotNull  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createVatomEvent(accountId, appKey, vatomParameters, returnRawResponse, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/me/rels/following/delete")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete following", notes = "Delete following.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response deleteFollowing(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Vatom Rels Key", required = true) @QueryParam("vatomRelsKey") @NotNull  String vatomRelsKey,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteFollowing(accountId, vatomRelsKey, returnRawResponse, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/b/campaign/points/delete")
    
    
    @io.swagger.annotations.ApiOperation(value = "Reset All Points Balance", notes = "Reset All Points Balance.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response deletePointsBalance(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom Campaign Id", required = true) @QueryParam("vatomCampaignId") @NotNull  String vatomCampaignId,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deletePointsBalance(accountId, appKey, vatomCampaignId, returnRawResponse, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/b/spaces/delete")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Vatom Space", notes = "Delete a Vatom space.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response deleteSpace(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom Space Id", required = true) @QueryParam("vatomSpaceId") @NotNull  String vatomSpaceId,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteSpace(accountId, appKey, vatomSpaceId, returnRawResponse, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/b/events/delete")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Vatom Event", notes = "Delete a Vatom event.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response deleteVatomEvent(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom Event Id", required = true) @QueryParam("vatomEventId") @NotNull  String vatomEventId,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteVatomEvent(accountId, appKey, vatomEventId, returnRawResponse, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/vatoms/delete")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Vatom NFT", notes = "Delete Vatom NFT", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response deleteVatomNFT(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Vatom NFT Id", required = true) @QueryParam("vatomId") @NotNull  String vatomId,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteVatomNFT(accountId, vatomId, returnRawResponse, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/vatoms/execute-action")
    
    
    @io.swagger.annotations.ApiOperation(value = "Execute Action on NFT", notes = "Execute Action on NFT.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response executeActionOnNFT(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Vatom NFT Id", required = true) @QueryParam("vatomId") @NotNull  String vatomId,@ApiParam(value = "Vatom Parameters", required = true) @QueryParam("vatomParameters") @NotNull  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.executeActionOnNFT(accountId, vatomId, vatomParameters, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/vatoms/geo-map/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "Search Vatom Geo Map", notes = "Search Vatom Geo Map", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response geomapSearch(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Vatom Parameters", required = true) @QueryParam("vatomParameters") @NotNull  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.geomapSearch(accountId, vatomParameters, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/b/behaviors")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom Business Behaviors", notes = "Gets the behaviors of a business.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response getBusinessBehaviors(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getBusinessBehaviors(accountId, appKey, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/b/coins/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get the coins for a Business", notes = "Get the coins for a Businesss.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response getBusinessCoinsBalance(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getBusinessCoinsBalance(accountId, appKey, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/me/businesses")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get the user business ids", notes = "Get the business ids the logged in user has access to.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response getBusinessIds(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getBusinessIds(accountId, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/b/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom Business Info", notes = "Gets the business info tied to this account.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response getBusinessInfo(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom Parameters") @QueryParam("vatomParameters")  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getBusinessInfo(accountId, appKey, vatomParameters, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/b/users")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom Business Users", notes = "Gets the users of a business.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response getBusinessUsers(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getBusinessUsers(accountId, appKey, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/b/campaign-groups/entities")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Campaign Group Entities", notes = "Get campaign group entities.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response getCampaignGroupEntities(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom Campaign Id", required = true) @QueryParam("vatomCampaignId") @NotNull  String vatomCampaignId,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCampaignGroupEntities(accountId, appKey, vatomCampaignId, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/b/campaign-groups/rules")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Campaign Group Rules", notes = "Get campaign group rules.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response getCampaignGroupRules(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom Campaign Id", required = true) @QueryParam("vatomCampaignId") @NotNull  String vatomCampaignId,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCampaignGroupRules(accountId, appKey, vatomCampaignId, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/b/campaign-groups/stats")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Campaign Group Stats", notes = "Get campaign group stats.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response getCampaignGroupStats(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom Campaign Id", required = true) @QueryParam("vatomCampaignId") @NotNull  String vatomCampaignId,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCampaignGroupStats(accountId, appKey, vatomCampaignId, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/b/campaign-groups/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Campaign Info", notes = "Gets the info on a campaign.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response getCampaignInfo(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom Campaign Id", required = true) @QueryParam("vatomCampaignId") @NotNull  String vatomCampaignId,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCampaignInfo(accountId, appKey, vatomCampaignId, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/b/events/guests/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom Event Guest List", notes = "Gets the guest list of an event.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response getEventGuestList(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom Event Id", required = true) @QueryParam("vatomEventId") @NotNull  String vatomEventId,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getEventGuestList(accountId, appKey, vatomEventId, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/me/inventory")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom User's Inventory", notes = "Gets the logged in user's Vatom Inventory.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response getInventory(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Vatom Parameters", required = true) @QueryParam("vatomParameters") @NotNull  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getInventory(accountId, vatomParameters, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/me/rels/following")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get following", notes = "Get following.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response getMyFollowing(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getMyFollowing(accountId, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/u/campaign/points/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Points Balance", notes = "Gets the points balance of a Vatom user.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response getPointsBalance(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Vatom User Id", required = true) @QueryParam("vatomUserId") @NotNull  String vatomUserId,@ApiParam(value = "Vatom Campaign Id", required = true) @QueryParam("vatomCampaignId") @NotNull  String vatomCampaignId,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPointsBalance(accountId, vatomUserId, vatomCampaignId, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/b/campaign/u/points/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Points Balance as Business", notes = "Gets the points balance of a Vatom user.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response getPointsBalanceAsBusiness(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom User Id", required = true) @QueryParam("vatomUserId") @NotNull  String vatomUserId,@ApiParam(value = "Vatom Campaign Id", required = true) @QueryParam("vatomCampaignId") @NotNull  String vatomCampaignId,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPointsBalanceAsBusiness(accountId, appKey, vatomUserId, vatomCampaignId, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/b/spaces/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom Space", notes = "Gets the details of a space.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response getSpace(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom Space Id", required = true) @QueryParam("vatomSpaceId") @NotNull  String vatomSpaceId,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getSpace(accountId, appKey, vatomSpaceId, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/b/users/coins/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get the coins for a user (as a Business)", notes = "Get the coins for a user (as a Business).", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response getUserCoinsAsBusiness(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Vatom User Id", required = true) @QueryParam("vatomUserId") @NotNull  String vatomUserId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUserCoinsAsBusiness(accountId, vatomUserId, appKey, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/u/coins/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Gets the coins balance for a Vatom User", notes = "Gets the coins balance for a Vatom User.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response getUserCoinsBalance(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Vatom User Id", required = true) @QueryParam("vatomUserId") @NotNull  String vatomUserId,@ApiParam(value = "Vatom Parameters") @QueryParam("vatomParameters")  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUserCoinsBalance(accountId, vatomUserId, vatomParameters, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/users/rels/followers")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get user followers", notes = "Get user followers.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response getUserFollowers(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Vatom User Id", required = true) @QueryParam("vatomUserId") @NotNull  String vatomUserId,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUserFollowers(accountId, vatomUserId, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/users/rels/following")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get user following", notes = "Get user following.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response getUserFollowing(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Vatom User Id", required = true) @QueryParam("vatomUserId") @NotNull  String vatomUserId,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUserFollowing(accountId, vatomUserId, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/user/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get User Info", notes = "Get a User's Info.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response getUserInfo(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Vatom User Id", required = true) @QueryParam("vatomUserId") @NotNull  String vatomUserId,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUserInfo(accountId, vatomUserId, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/me/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom User Profile", notes = "Gets the logged in user's profile in Vatom.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response getUserProfile(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUserProfile(accountId, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/b/events/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom Event", notes = "Gets the details of a event.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response getVatomEvent(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom Event Id", required = true) @QueryParam("vatomEventId") @NotNull  String vatomEventId,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getVatomEvent(accountId, appKey, vatomEventId, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/vatoms/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom NFT Details", notes = "Get Vatom NFT Details", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response getVatomNFT(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Vatom NFT Id", required = true) @QueryParam("vatomId") @NotNull  String vatomId,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getVatomNFT(accountId, vatomId, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/b/communities/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "List Vatom Communities", notes = "Gets the communities tied to a business.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response listCommunities(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom Parameters") @QueryParam("vatomParameters")  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listCommunities(accountId, appKey, vatomParameters, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/b/events/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "List Vatom Events", notes = "Gets the events tied to a business.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response listEvents(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom Parameters") @QueryParam("vatomParameters")  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listEvents(accountId, appKey, vatomParameters, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/b/spaces/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "List Vatom Spaces", notes = "Gets the spaces tied to a business.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response listSpaces(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom Parameters") @QueryParam("vatomParameters")  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listSpaces(accountId, appKey, vatomParameters, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/u/coins/txns/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "List Coin Transactions for a Vatom User", notes = "Gets the logged in user's Vatom coin transactions.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response listUserCoinTransactions(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Vatom User Id", required = true) @QueryParam("vatomUserId") @NotNull  String vatomUserId,@ApiParam(value = "Vatom Parameters") @QueryParam("vatomParameters")  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listUserCoinTransactions(accountId, vatomUserId, vatomParameters, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/b/users/coins/txns/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "List coin transactions for a user (as a Business)", notes = "List coin transactions for a user (as a Business).", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response listUserCoinTransactionsAsBusiness(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Vatom User Id", required = true) @QueryParam("vatomUserId") @NotNull  String vatomUserId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom Parameters") @QueryParam("vatomParameters")  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listUserCoinTransactionsAsBusiness(accountId, vatomUserId, appKey, vatomParameters, returnRawResponse, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/me/vatoms/actions")
    
    
    @io.swagger.annotations.ApiOperation(value = "Perform Action on NFT", notes = "Perform Action on NFT.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response performActionOnNFT(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Vatom NFT Id", required = true) @QueryParam("vatomId") @NotNull  String vatomId,@ApiParam(value = "Vatom Action", required = true) @QueryParam("vatomAction") @NotNull  String vatomAction,@ApiParam(value = "Vatom Parameters", required = true) @QueryParam("vatomParameters") @NotNull  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.performActionOnNFT(accountId, vatomId, vatomAction, vatomParameters, returnRawResponse, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/b/redemptions")
    
    
    @io.swagger.annotations.ApiOperation(value = "Redeem NFT", notes = "Redeem an NFT.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response redeemNFT(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom Parameters", required = true) @QueryParam("vatomParameters") @NotNull  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.redeemNFT(accountId, appKey, vatomParameters, returnRawResponse, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/b/users/coins/redeem")
    
    
    @io.swagger.annotations.ApiOperation(value = "Redeem the coins for a user (as a Business)", notes = "Redeem the coins for a user (as a Business).", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response redeemUserCoinsAsBusiness(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Vatom User Id", required = true) @QueryParam("vatomUserId") @NotNull  String vatomUserId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom Parameters", required = true) @QueryParam("vatomParameters") @NotNull  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.redeemUserCoinsAsBusiness(accountId, vatomUserId, appKey, vatomParameters, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/b/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "Search for Vatom Businesses", notes = "Searches for Vatom businesses.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response searchBusinesses(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Vatom Parameters") @QueryParam("vatomParameters")  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchBusinesses(accountId, vatomParameters, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/b/campaign-groups/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "Search Campaign Groups", notes = "Search campaign groups.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response searchCampaignGroups(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchCampaignGroups(accountId, appKey, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/me/identities/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "Search User Identities", notes = "Search User Identities.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response searchIdentities(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchIdentities(accountId, returnRawResponse, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/user-inventory/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "Search Vatom User's Inventory", notes = "Searches the logged in user's Vatom Inventory.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response searchInventory(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Vatom Parameters") @QueryParam("vatomParameters")  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchInventory(accountId, vatomParameters, returnRawResponse, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/b/campaigns/send")
    
    
    @io.swagger.annotations.ApiOperation(value = "Send NFT", notes = "Send an NFT.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response sendNFT(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom Campaign Id", required = true) @QueryParam("vatomCampaignId") @NotNull  String vatomCampaignId,@ApiParam(value = "Vatom Parameters", required = true) @QueryParam("vatomParameters") @NotNull  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sendNFT(accountId, appKey, vatomCampaignId, vatomParameters, returnRawResponse, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/b/campaign/u/points/update")
    
    
    @io.swagger.annotations.ApiOperation(value = "Set Points Balance as Business", notes = "Sets the points balance of a Vatom user.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response setPointsBalanceAsBusiness(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom User Id", required = true) @QueryParam("vatomUserId") @NotNull  String vatomUserId,@ApiParam(value = "Vatom Campaign Id", required = true) @QueryParam("vatomCampaignId") @NotNull  String vatomCampaignId,@ApiParam(value = "Vatom Parameters", required = true) @QueryParam("vatomParameters") @NotNull  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.setPointsBalanceAsBusiness(accountId, appKey, vatomUserId, vatomCampaignId, vatomParameters, returnRawResponse, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/u/coins/transfer")
    
    
    @io.swagger.annotations.ApiOperation(value = "Transfer coins from Vatom Users", notes = "Transfer coins from Vatom Users.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response transferUserCoins(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Vatom User Id", required = true) @QueryParam("vatomUserId") @NotNull  String vatomUserId,@ApiParam(value = "Vatom Parameters", required = true) @QueryParam("vatomParameters") @NotNull  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transferUserCoins(accountId, vatomUserId, vatomParameters, returnRawResponse, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/b/coins/update")
    
    
    @io.swagger.annotations.ApiOperation(value = "Fund coins for a Business", notes = "Fund/update coins for a Businesss.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response updateBusinessCoins(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom Parameters", required = true) @QueryParam("vatomParameters") @NotNull  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateBusinessCoins(accountId, appKey, vatomParameters, returnRawResponse, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/b/events/guests/update")
    
    
    @io.swagger.annotations.ApiOperation(value = "Update Vatom Event Guest List", notes = "Update the guest list of an event.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response updateEventGuestList(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom Event Id", required = true) @QueryParam("vatomEventId") @NotNull  String vatomEventId,@ApiParam(value = "Vatom Parameters", required = true) @QueryParam("vatomParameters") @NotNull  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateEventGuestList(accountId, appKey, vatomEventId, vatomParameters, returnRawResponse, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/b/spaces/update")
    
    
    @io.swagger.annotations.ApiOperation(value = "Update Vatom Space", notes = "Update a Vatom space.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response updateSpace(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom Space Id", required = true) @QueryParam("vatomSpaceId") @NotNull  String vatomSpaceId,@ApiParam(value = "Vatom Parameters", required = true) @QueryParam("vatomParameters") @NotNull  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateSpace(accountId, appKey, vatomSpaceId, vatomParameters, returnRawResponse, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/b/users/coins/update")
    
    
    @io.swagger.annotations.ApiOperation(value = "Update the coins for a user (as a Business)", notes = "Update the coins for a user (as a Business).", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response updateUserCoinsAsBusiness(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Vatom User Id", required = true) @QueryParam("vatomUserId") @NotNull  String vatomUserId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom Parameters", required = true) @QueryParam("vatomParameters") @NotNull  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateUserCoinsAsBusiness(accountId, vatomUserId, appKey, vatomParameters, returnRawResponse, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/me/update")
    
    
    @io.swagger.annotations.ApiOperation(value = "Update Vatom User Profile", notes = "Gets the logged in user's profile in Vatom.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response updateUserProfile(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Vatom Parameters", required = true) @QueryParam("vatomParameters") @NotNull  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateUserProfile(accountId, vatomParameters, returnRawResponse, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/b/events/update")
    
    
    @io.swagger.annotations.ApiOperation(value = "Update Vatom Event", notes = "Update a Vatom event.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response updateVatomEvent(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Sirqul Application Key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Vatom Event Id", required = true) @QueryParam("vatomEventId") @NotNull  String vatomEventId,@ApiParam(value = "Vatom Parameters", required = true) @QueryParam("vatomParameters") @NotNull  String vatomParameters,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateVatomEvent(accountId, appKey, vatomEventId, vatomParameters, returnRawResponse, securityContext);
    }
}
