package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.AppconfigApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ApplicationConfigResponse;
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

@Path("/appconfig")


@io.swagger.annotations.Api(description = "the appconfig API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AppconfigApi  {

    @Inject AppconfigApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create AppConfig", notes = "Creates a new application configuration. If the configVersion provided already exists for the given app, an invalid response is returned and the application configuration won't be created.", response = ApplicationConfigResponse.class, tags={ "Application Config", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationConfigResponse.class) })
    public Response createApplicationConfig( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("configVersion") String configVersion, @NotNull @QueryParam("assetId") Long assetId, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("udid") String udid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createApplicationConfig(accountId,appKey,configVersion,assetId,retailerId,retailerLocationId,udid,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete AppConfig", notes = "Mark the application configuration for deletion.", response = SirqulResponse.class, tags={ "Application Config", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteApplicationConfig( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("configId") Long configId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteApplicationConfig(accountId,configId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get AppConfig", notes = "Gets the appConfig data by the given configId. If appConfig cannot be found, it returns an invalid response.", response = ApplicationConfigResponse.class, tags={ "Application Config", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationConfigResponse.class) })
    public Response getApplicationConfig( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("configId") Long configId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getApplicationConfig(accountId,configId,securityContext);
    }
    @GET
    @Path("/getbyversion")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get AppConfig by Version", notes = "Gets the appConfig data by the given appKey and app configVersion number.If the appKey is is invalid or appConfig is not found, it returns an invalid response. ", response = ApplicationConfigResponse.class, tags={ "Application Config", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationConfigResponse.class) })
    public Response getApplicationConfigByConfigVersion( @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("configVersion") String configVersion, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("udid") String udid, @DefaultValue("false") @QueryParam("allowOlderVersions") Boolean allowOlderVersions,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getApplicationConfigByConfigVersion(appKey,configVersion,retailerId,retailerLocationId,udid,allowOlderVersions,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search AppConfigs", notes = "Gets all versions of application configurations in a particular app by the given appKey.", response = ApplicationConfigResponse.class, responseContainer = "List", tags={ "Application Config", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationConfigResponse.class, responseContainer = "List") })
    public Response searchApplicationConfig( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("udid") String udid, @QueryParam("configVersion") String configVersion, @DefaultValue("CONFIG_VERSION_INDEX") @QueryParam("sortField") String sortField, @DefaultValue("true") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchApplicationConfig(accountId,appKey,retailerId,retailerLocationId,udid,configVersion,sortField,descending,start,limit,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update AppConfig", notes = "pdates an existing application configuration. If the configVersion provided already exists for the given app the application configuration won't be updated.", response = ApplicationConfigResponse.class, tags={ "Application Config", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationConfigResponse.class) })
    public Response updateApplicationConfig( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("configId") Long configId, @QueryParam("appKey") String appKey, @QueryParam("configVersion") String configVersion, @QueryParam("assetId") Long assetId, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("udid") String udid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateApplicationConfig(accountId,configId,appKey,configVersion,assetId,retailerId,retailerLocationId,udid,securityContext);
    }
}
