package org.openapitools.api;

import org.openapitools.api.CarrierApiService;
import org.openapitools.api.factories.CarrierApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CellCarrierResponse;

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

@Path("/carrier/search")


@io.swagger.annotations.Api(description = "the carrier API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class CarrierApi  {
   private final CarrierApiService delegate;

   public CarrierApi(@Context ServletConfig servletContext) {
      CarrierApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("CarrierApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (CarrierApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = CarrierApiServiceFactory.getCarrierApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Carriers", notes = "Search on supported mobile telephone carriers that can be used to send SMS notifications via email.", response = CellCarrierResponse.class, responseContainer = "List", tags={ "Carrier", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CellCarrierResponse.class, responseContainer = "List")
    })
    public Response searchCarriers(@ApiParam(value = "The keyword to search on") @QueryParam("keyword")  String keyword,@ApiParam(value = "Determines whether the sorted list is in descending or ascending order", defaultValue = "false") @DefaultValue("false") @QueryParam("descending")  Boolean descending,@ApiParam(value = "The start index for pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "The limit for pagination", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@ApiParam(value = "Determines whether to return inactive results", defaultValue = "true") @DefaultValue("true") @QueryParam("activeOnly")  Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchCarriers(keyword, descending, start, limit, activeOnly, securityContext);
    }
}
