package org.openapitools.api;

import org.openapitools.api.WeatherApiService;
import org.openapitools.api.factories.WeatherApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.WeatherResponse;

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

@Path("/weather/search")


@io.swagger.annotations.Api(description = "the weather API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class WeatherApi  {
   private final WeatherApiService delegate;

   public WeatherApi(@Context ServletConfig servletContext) {
      WeatherApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("WeatherApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (WeatherApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = WeatherApiServiceFactory.getWeatherApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Weather", notes = "Search the weather forcast for the next 5 days", response = WeatherResponse.class, tags={ "Weather", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WeatherResponse.class)
    })
    public Response searchWeather(@ApiParam(value = "Region Id") @QueryParam("regionId")  Long regionId,@ApiParam(value = "Latitude") @QueryParam("latitude")  Double latitude,@ApiParam(value = "Longitude") @QueryParam("longitude")  Double longitude,@ApiParam(value = "Timezone Offset", defaultValue = "-6") @DefaultValue("-6") @QueryParam("timezoneOffset")  Long timezoneOffset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchWeather(regionId, latitude, longitude, timezoneOffset, securityContext);
    }
}
