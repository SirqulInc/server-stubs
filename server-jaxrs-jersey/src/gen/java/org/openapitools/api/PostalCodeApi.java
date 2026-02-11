package org.openapitools.api;

import org.openapitools.api.PostalCodeApiService;
import org.openapitools.api.factories.PostalCodeApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.PostalCodeResponse;
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

@Path("/postalCode")


@io.swagger.annotations.Api(description = "the postalCode API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PostalCodeApi  {
   private final PostalCodeApiService delegate;

   public PostalCodeApi(@Context ServletConfig servletContext) {
      PostalCodeApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("PostalCodeApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (PostalCodeApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = PostalCodeApiServiceFactory.getPostalCodeApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Postal Code", notes = "Create a Postal Code", response = PostalCodeResponse.class, tags={ "Postal Code", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PostalCodeResponse.class)
    })
    public Response createPostalCode(@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the postal code", required = true) @QueryParam("code") @NotNull  String code,@ApiParam(value = "the latitude of the postal code", required = true) @QueryParam("latitude") @NotNull  Double latitude,@ApiParam(value = "the longitude of the postal code", required = true) @QueryParam("longitude") @NotNull  Double longitude,@ApiParam(value = "the state code (e.g WA, WV, WI) that the postal code is located") @QueryParam("stateCode")  String stateCode,@ApiParam(value = "the city that the postal code is located") @QueryParam("city")  String city,@ApiParam(value = "whether the postal code created should be active or inactive") @QueryParam("active")  Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createPostalCode(accountId, code, latitude, longitude, stateCode, city, active, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Postal Code", notes = "Delete a Postal Code", response = SirqulResponse.class, tags={ "Postal Code", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deletePostalCode(@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the postal code to delete", required = true) @QueryParam("postalCodeId") @NotNull  Long postalCodeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deletePostalCode(accountId, postalCodeId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Postal Code", notes = "Get a Postal Code", response = PostalCodeResponse.class, tags={ "Postal Code", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PostalCodeResponse.class)
    })
    public Response getPostalCode(@ApiParam(value = "the id of the postal code to get", required = true) @QueryParam("postalCodeId") @NotNull  Long postalCodeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPostalCode(postalCodeId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Postal Codes", notes = "Get the list of regions. If latitude or longitude is null, will return all postal codes in the system with paginated response.", response = PostalCodeResponse.class, responseContainer = "List", tags={ "Postal Code", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PostalCodeResponse.class, responseContainer = "List")
    })
    public Response getPostalCodes(@ApiParam(value = "the field to sort the results on", required = true) @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "whether to order results in ascending or descending order", required = true) @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "the latitude of the postal code to search on") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the longitude of the postal code to search on") @QueryParam("longitude")  Double longitude,@ApiParam(value = "the keyword of the postal code to search on") @QueryParam("keyword")  String keyword,@ApiParam(value = "how far (in miles) to search on for the postal code") @QueryParam("miles")  Double miles,@ApiParam(value = "the start of the index and/or pagination") @QueryParam("start")  Integer start,@ApiParam(value = "the limit of the index and/or pagination") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPostalCodes(sortField, descending, latitude, longitude, keyword, miles, start, limit, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Postal Code", notes = "Update a Postal Code", response = PostalCodeResponse.class, tags={ "Postal Code", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PostalCodeResponse.class)
    })
    public Response updatePostalCode(@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the postal code to update", required = true) @QueryParam("postalCodeId") @NotNull  Long postalCodeId,@ApiParam(value = "the postal code to update") @QueryParam("code")  String code,@ApiParam(value = "the latitude of the postal code") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the longitude of the postal code") @QueryParam("longitude")  Double longitude,@ApiParam(value = "the state code (e.g. WA, WI, WY) where the postal code is located") @QueryParam("stateCode")  String stateCode,@ApiParam(value = "the city where the postal code is located") @QueryParam("city")  String city,@ApiParam(value = "whether the postal code is active or inactive") @QueryParam("active")  Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updatePostalCode(accountId, postalCodeId, code, latitude, longitude, stateCode, city, active, securityContext);
    }
}
