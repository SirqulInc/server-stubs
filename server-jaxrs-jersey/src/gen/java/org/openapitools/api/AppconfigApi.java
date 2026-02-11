package org.openapitools.api;

import org.openapitools.api.AppconfigApiService;
import org.openapitools.api.factories.AppconfigApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ApplicationConfigResponse;
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

@Path("/appconfig")


@io.swagger.annotations.Api(description = "the appconfig API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AppconfigApi  {
   private final AppconfigApiService delegate;

   public AppconfigApi(@Context ServletConfig servletContext) {
      AppconfigApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AppconfigApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AppconfigApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = AppconfigApiServiceFactory.getAppconfigApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create AppConfig", notes = "Creates a new application configuration. If the configVersion provided already exists for the given app, an invalid response is returned and the application configuration won't be created.", response = ApplicationConfigResponse.class, tags={ "Application Config", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationConfigResponse.class)
    })
    public Response createApplicationConfig(@ApiParam(value = "The account ID of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The application key that the newly created applicationConfig will be associated to", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The application configuration, has to be unique within the application", required = true) @QueryParam("configVersion") @NotNull  String configVersion,@ApiParam(value = "The json assetId that stores the configuration detail.", required = true) @QueryParam("assetId") @NotNull  Long assetId,@ApiParam(value = "The retailer id for retailer specific configurations") @QueryParam("retailerId")  Long retailerId,@ApiParam(value = "The retailer location id for retailer location specific configurations") @QueryParam("retailerLocationId")  Long retailerLocationId,@ApiParam(value = "The device udid for device specific configurations") @QueryParam("udid")  String udid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createApplicationConfig(accountId, appKey, configVersion, assetId, retailerId, retailerLocationId, udid, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete AppConfig", notes = "Mark the application configuration for deletion.", response = SirqulResponse.class, tags={ "Application Config", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteApplicationConfig(@ApiParam(value = "The account ID of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The config ID of the application configuration to delete", required = true) @QueryParam("configId") @NotNull  Long configId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteApplicationConfig(accountId, configId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get AppConfig", notes = "Gets the appConfig data by the given configId. If appConfig cannot be found, it returns an invalid response.", response = ApplicationConfigResponse.class, tags={ "Application Config", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationConfigResponse.class)
    })
    public Response getApplicationConfig(@ApiParam(value = "The account ID of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The config ID of the application configuration", required = true) @QueryParam("configId") @NotNull  Long configId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getApplicationConfig(accountId, configId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/getbyversion")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get AppConfig by Version", notes = "Gets the appConfig data by the given appKey and app configVersion number.If the appKey is is invalid or appConfig is not found, it returns an invalid response. ", response = ApplicationConfigResponse.class, tags={ "Application Config", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationConfigResponse.class)
    })
    public Response getApplicationConfigByConfigVersion(@ApiParam(value = "The application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The version of the application configuration", required = true) @QueryParam("configVersion") @NotNull  String configVersion,@ApiParam(value = "Only returns the config that matches the given retailer") @QueryParam("retailerId")  Long retailerId,@ApiParam(value = "Only returns the config that matches the given retailer location") @QueryParam("retailerLocationId")  Long retailerLocationId,@ApiParam(value = "Only returns only returns the config that matches the given device udid") @QueryParam("udid")  String udid,@ApiParam(value = "Determines whether to return older config versions if the exact version is not found. If this happens, will try to return the latest version.", defaultValue = "false") @DefaultValue("false") @QueryParam("allowOlderVersions")  Boolean allowOlderVersions,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getApplicationConfigByConfigVersion(appKey, configVersion, retailerId, retailerLocationId, udid, allowOlderVersions, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search AppConfigs", notes = "Gets all versions of application configurations in a particular app by the given appKey.", response = ApplicationConfigResponse.class, responseContainer = "List", tags={ "Application Config", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationConfigResponse.class, responseContainer = "List")
    })
    public Response searchApplicationConfig(@ApiParam(value = "The account ID of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The application key to filter results by application Leaving this empty will return all application configurations for all applications (executive user only)") @QueryParam("appKey")  String appKey,@ApiParam(value = "Only returns the configs that matches the given retailer") @QueryParam("retailerId")  Long retailerId,@ApiParam(value = "Only returns the configs that matches the given retailer location") @QueryParam("retailerLocationId")  Long retailerLocationId,@ApiParam(value = "Only returns only returns the configs that matches the given device udid") @QueryParam("udid")  String udid,@ApiParam(value = "Config Version") @QueryParam("configVersion")  String configVersion,@ApiParam(value = "Orders the results by: CREATED, UPDATED, ACTIVE, APPLICATION_ID,  APPLICATION_KEY, APPLICATION_NAME, RETAILER_NAME, RETAILER_ID, RETAILER_LOCATION_NAME,  RETAILER_LOCATION_ID, OFFER_TITLE, OFFER_ID, OFFER_LOCATION_ID, CONFIG_VERSION_MINOR,  CONFIG_VERSION_MAJOR, CONFIG_VERSION_INDEX ", defaultValue = "CONFIG_VERSION_INDEX") @DefaultValue("CONFIG_VERSION_INDEX") @QueryParam("sortField")  String sortField,@ApiParam(value = "Determines whether the results are in descending or ascending order", defaultValue = "true") @DefaultValue("true") @QueryParam("descending")  Boolean descending,@ApiParam(value = "The start index for pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "The limit for pagination (There is a hard limit of 100)", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchApplicationConfig(accountId, appKey, retailerId, retailerLocationId, udid, configVersion, sortField, descending, start, limit, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update AppConfig", notes = "pdates an existing application configuration. If the configVersion provided already exists for the given app the application configuration won't be updated.", response = ApplicationConfigResponse.class, tags={ "Application Config", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationConfigResponse.class)
    })
    public Response updateApplicationConfig(@ApiParam(value = "The account ID of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The config ID of the application configuration to update", required = true) @QueryParam("configId") @NotNull  Long configId,@ApiParam(value = "The application key that the updated applicationConfig will be associated to") @QueryParam("appKey")  String appKey,@ApiParam(value = "The application configuration, has to be unique within the application") @QueryParam("configVersion")  String configVersion,@ApiParam(value = "The json assetId that stores the configuration detail.") @QueryParam("assetId")  Long assetId,@ApiParam(value = "The retailer id for retailer specific configurations") @QueryParam("retailerId")  Long retailerId,@ApiParam(value = "The retailer location id for retailer location specific configurations") @QueryParam("retailerLocationId")  Long retailerLocationId,@ApiParam(value = "The device udid for device specific configurations") @QueryParam("udid")  String udid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateApplicationConfig(accountId, configId, appKey, configVersion, assetId, retailerId, retailerLocationId, udid, securityContext);
    }
}
