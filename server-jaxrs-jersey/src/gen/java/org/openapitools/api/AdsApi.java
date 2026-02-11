package org.openapitools.api;

import org.openapitools.api.AdsApiService;
import org.openapitools.api.factories.AdsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.MissionResponse;

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

@Path("/ads/find")


@io.swagger.annotations.Api(description = "the ads API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AdsApi  {
   private final AdsApiService delegate;

   public AdsApi(@Context ServletConfig servletContext) {
      AdsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AdsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AdsApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = AdsApiServiceFactory.getAdsApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Find Missions", notes = "Get a set of ad filtered by the parameters provided.", response = MissionResponse.class, responseContainer = "List", tags={ "Creative", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class, responseContainer = "List")
    })
    public Response adsFind(@ApiParam(value = "The application key, if provided return missions specific for the app. Will always return mission levels that are app agnostic.", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "return a random set of results, default is true. If false returns in nature order.", required = true) @QueryParam("randomize") @NotNull  Boolean randomize,@ApiParam(value = "return only ads targets to the specific app, no global ads.", required = true) @QueryParam("targetedAdsOnly") @NotNull  Boolean targetedAdsOnly,@ApiParam(value = "The type of ads to get, possible values are: BANNER, LEADERBOARD, SKYSCRAPER, FULL, VIDEO, ZIP, CONFIG. Use this instead of suffix.") @QueryParam("type")  String type,@ApiParam(value = "The logged in user.") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The version of the application, will not return levels newer than the appVersion.") @QueryParam("appVersion")  String appVersion,@ApiParam(value = "The current location of the requesting device") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current location of the requesting device") @QueryParam("longitude")  Double longitude,@ApiParam(value = "Should use deviceId if possible. The name of the requesting device; possible values are: Android, iPhone, iPad, iPod, etc. use /audience/devices for list.") @QueryParam("device")  String device,@ApiParam(value = "The device ID of the requesting device, use /audience/devices for list") @QueryParam("deviceIdentifier")  Long deviceIdentifier,@ApiParam(value = "The requesting device version; examples are: 2.3, 5.1.4, 6.1.4. Supports X, X.X, or X.X.X formated string.") @QueryParam("deviceVersion")  String deviceVersion,@ApiParam(value = "The index into the record set to start with.") @QueryParam("start")  Integer start,@ApiParam(value = "The total number of record to return.") @QueryParam("limit")  Integer limit,@ApiParam(value = "If true then return the audience data in the response. Default is false.") @QueryParam("includeAudiences")  Boolean includeAudiences,@ApiParam(value = "If true/false only return missions whose game levels allocate (or don't allocate) tickets. Do not provide a value to return both.") @QueryParam("allocatesTickets")  Boolean allocatesTickets,@ApiParam(value = "return only ads from the specified campaigns.") @QueryParam("missionIds")  String missionIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adsFind(appKey, randomize, targetedAdsOnly, type, accountId, appVersion, latitude, longitude, device, deviceIdentifier, deviceVersion, start, limit, includeAudiences, allocatesTickets, missionIds, securityContext);
    }
}
