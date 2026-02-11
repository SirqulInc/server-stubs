package org.openapitools.api;

import org.openapitools.api.CreativeApiService;
import org.openapitools.api.factories.CreativeApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CreativeResponse;
import org.openapitools.model.SirqulResponse;

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

@Path("/creative")


@io.swagger.annotations.Api(description = "the creative API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class CreativeApi  {
   private final CreativeApiService delegate;

   public CreativeApi(@Context ServletConfig servletContext) {
      CreativeApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("CreativeApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (CreativeApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = CreativeApiServiceFactory.getCreativeApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/addpreview")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Add Preview", notes = "Enable this ad for preview for this account.", response = SirqulResponse.class, tags={ "Creative", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response addPreview(@ApiParam(value = "the id of the account", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The id of the creative that want to enable preview. The type of the creative should be CONFIG, otherwise no action will be applied.", required = true) @QueryParam("creativeId") @NotNull  Long creativeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addPreview(accountId, creativeId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Creative", notes = "Create a creative", response = CreativeResponse.class, tags={ "Creative", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CreativeResponse.class)
    })
    public Response createCreative(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The name of the level.", required = true) @QueryParam("name") @NotNull  String name,@ApiParam(value = "If true set the game level as active. Default is false.", required = true) @QueryParam("active") @NotNull  Boolean active,@ApiParam(value = "determines whether the response will wait until the asset gets created", required = true) @QueryParam("waitForAsset") @NotNull  Boolean waitForAsset,@ApiParam(value = "The description of the level.") @QueryParam("description")  String description,@ApiParam(value = "The asset Id of the level image.") @QueryParam("assetImageId")  Long assetImageId,@ApiParam(value = "This parameter is deprecated. deprecated use data field") @QueryParam("action")  String action,@ApiParam(value = "The creative data, json based format depending on type. If not using action then data is required.") @QueryParam("data")  String data,@ApiParam(value = "This parameter is deprecated. deprecated use type field") @QueryParam("suffix")  String suffix,@ApiParam(value = "The type of creative. If not using suffix then type is required.") @QueryParam("type")  String type,@ApiParam(value = "Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.") @QueryParam("balance")  Double balance,@ApiParam(value = "if creative related so some other content provided the id") @QueryParam("referenceId")  Long referenceId,@ApiParam(value = "The version of the application, will not return creatives newer than the appVersion. Only used when requesting application configuration creatives.") @QueryParam("appVersion")  String appVersion,@ApiParam(value = "Assign the creative to a campaign for timing and audience matching.") @QueryParam("missionId")  Long missionId,@ApiParam(value = "the id of the offer") @QueryParam("offerId")  Long offerId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createCreative(accountId, name, active, waitForAsset, description, assetImageId, action, data, suffix, type, balance, referenceId, appVersion, missionId, offerId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Creative", notes = "Delete a creative", response = SirqulResponse.class, tags={ "Creative", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteCreative(@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the creative to delete", required = true) @QueryParam("creativeId") @NotNull  Long creativeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteCreative(accountId, creativeId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Creative", notes = "Get a creative", response = CreativeResponse.class, tags={ "Creative", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CreativeResponse.class)
    })
    public Response getCreative(@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the ID of the creative to get", required = true) @QueryParam("creativeId") @NotNull  Long creativeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCreative(accountId, creativeId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Creatives", notes = "Get a list of levels for an application, just those the account has permissions to view.", response = CreativeResponse.class, responseContainer = "List", tags={ "Creative", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CreativeResponse.class, responseContainer = "List")
    })
    public Response getCreativesByApplication(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Start the result set at some index.", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "Limit the result to some number.", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "Creatives contained in the provided mission.") @QueryParam("missionId")  Long missionId,@ApiParam(value = "Match the keyword to the owner name or level name.") @QueryParam("keyword")  String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCreativesByApplication(accountId, appKey, start, limit, missionId, keyword, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/removepreview")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Remove Preview", notes = "Remove this ad for preview for this account.", response = SirqulResponse.class, tags={ "Creative", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response removePreview(@ApiParam(value = "the ID of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the ID of the creative to remove preview", required = true) @QueryParam("creativeId") @NotNull  Long creativeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.removePreview(accountId, creativeId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Creative", notes = "Update a creative", response = CreativeResponse.class, tags={ "Creative", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CreativeResponse.class)
    })
    public Response updateCreative(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the creative Id to upate.", required = true) @QueryParam("creativeId") @NotNull  Long creativeId,@ApiParam(value = "The name of the level.") @QueryParam("name")  String name,@ApiParam(value = "The description of the level.") @QueryParam("description")  String description,@ApiParam(value = "The asset Id of the level image.") @QueryParam("assetImageId")  Long assetImageId,@ApiParam(value = "This parameter is deprecated. deprecated use data field") @QueryParam("action")  String action,@ApiParam(value = "The creative data, json based format depending on type") @QueryParam("data")  String data,@ApiParam(value = "This parameter is deprecated. deprecated use type field") @QueryParam("suffix")  String suffix,@ApiParam(value = "The type of creative.") @QueryParam("type")  String type,@ApiParam(value = "Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.") @QueryParam("balance")  Double balance,@ApiParam(value = "If true set the game level as active. Default is false.") @QueryParam("active")  Boolean active,@ApiParam(value = "if creative related so some other content provided the id") @QueryParam("referenceId")  Long referenceId,@ApiParam(value = "The version of the application, will not return creatives newer than the appVersion. Only used when requesting application configuration creatives.") @QueryParam("appVersion")  String appVersion,@ApiParam(value = "Assign the creative to a campaign for timing and audience matching.") @QueryParam("missionId")  Long missionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateCreative(accountId, creativeId, name, description, assetImageId, action, data, suffix, type, balance, active, referenceId, appVersion, missionId, securityContext);
    }
}
