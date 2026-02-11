package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.CreativeApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CreativeResponse;
import org.openapitools.model.SirqulResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/creative")


@io.swagger.annotations.Api(description = "the creative API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class CreativeApi  {

    @Inject CreativeApiService service;

    @POST
    @Path("/addpreview")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Add Preview", notes = "Enable this ad for preview for this account.", response = SirqulResponse.class, tags={ "Creative", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response addPreview( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("creativeId") Long creativeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addPreview(accountId,creativeId,securityContext);
    }
    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Creative", notes = "Create a creative", response = CreativeResponse.class, tags={ "Creative", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CreativeResponse.class) })
    public Response createCreative( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("name") String name, @NotNull @QueryParam("active") Boolean active, @NotNull @QueryParam("waitForAsset") Boolean waitForAsset, @QueryParam("description") String description, @QueryParam("assetImageId") Long assetImageId, @QueryParam("action") String action, @QueryParam("data") String data, @QueryParam("suffix") String suffix, @QueryParam("type") String type, @QueryParam("balance") Double balance, @QueryParam("referenceId") Long referenceId, @QueryParam("appVersion") String appVersion, @QueryParam("missionId") Long missionId, @QueryParam("offerId") Long offerId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createCreative(accountId,name,active,waitForAsset,description,assetImageId,action,data,suffix,type,balance,referenceId,appVersion,missionId,offerId,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Creative", notes = "Delete a creative", response = SirqulResponse.class, tags={ "Creative", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteCreative( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("creativeId") Long creativeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteCreative(accountId,creativeId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Creative", notes = "Get a creative", response = CreativeResponse.class, tags={ "Creative", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CreativeResponse.class) })
    public Response getCreative( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("creativeId") Long creativeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getCreative(accountId,creativeId,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Creatives", notes = "Get a list of levels for an application, just those the account has permissions to view.", response = CreativeResponse.class, responseContainer = "List", tags={ "Creative", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CreativeResponse.class, responseContainer = "List") })
    public Response getCreativesByApplication( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("missionId") Long missionId, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getCreativesByApplication(accountId,appKey,start,limit,missionId,keyword,securityContext);
    }
    @POST
    @Path("/removepreview")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Remove Preview", notes = "Remove this ad for preview for this account.", response = SirqulResponse.class, tags={ "Creative", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response removePreview( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("creativeId") Long creativeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removePreview(accountId,creativeId,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Creative", notes = "Update a creative", response = CreativeResponse.class, tags={ "Creative", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CreativeResponse.class) })
    public Response updateCreative( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("creativeId") Long creativeId, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("assetImageId") Long assetImageId, @QueryParam("action") String action, @QueryParam("data") String data, @QueryParam("suffix") String suffix, @QueryParam("type") String type, @QueryParam("balance") Double balance, @QueryParam("active") Boolean active, @QueryParam("referenceId") Long referenceId, @QueryParam("appVersion") String appVersion, @QueryParam("missionId") Long missionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateCreative(accountId,creativeId,name,description,assetImageId,action,data,suffix,type,balance,active,referenceId,appVersion,missionId,securityContext);
    }
}
