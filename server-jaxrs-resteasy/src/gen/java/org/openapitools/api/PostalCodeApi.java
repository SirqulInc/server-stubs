package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.PostalCodeApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.PostalCodeResponse;
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

@Path("/postalCode")


@io.swagger.annotations.Api(description = "the postalCode API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PostalCodeApi  {

    @Inject PostalCodeApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Postal Code", notes = "Create a Postal Code", response = PostalCodeResponse.class, tags={ "Postal Code", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PostalCodeResponse.class) })
    public Response createPostalCode( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("code") String code, @NotNull @QueryParam("latitude") Double latitude, @NotNull @QueryParam("longitude") Double longitude, @QueryParam("stateCode") String stateCode, @QueryParam("city") String city, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createPostalCode(accountId,code,latitude,longitude,stateCode,city,active,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Postal Code", notes = "Delete a Postal Code", response = SirqulResponse.class, tags={ "Postal Code", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deletePostalCode( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("postalCodeId") Long postalCodeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deletePostalCode(accountId,postalCodeId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Postal Code", notes = "Get a Postal Code", response = PostalCodeResponse.class, tags={ "Postal Code", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PostalCodeResponse.class) })
    public Response getPostalCode( @NotNull @QueryParam("postalCodeId") Long postalCodeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPostalCode(postalCodeId,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Postal Codes", notes = "Get the list of regions. If latitude or longitude is null, will return all postal codes in the system with paginated response.", response = PostalCodeResponse.class, responseContainer = "List", tags={ "Postal Code", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PostalCodeResponse.class, responseContainer = "List") })
    public Response getPostalCodes( @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("keyword") String keyword, @QueryParam("miles") Double miles, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPostalCodes(sortField,descending,latitude,longitude,keyword,miles,start,limit,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Postal Code", notes = "Update a Postal Code", response = PostalCodeResponse.class, tags={ "Postal Code", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PostalCodeResponse.class) })
    public Response updatePostalCode( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("postalCodeId") Long postalCodeId, @QueryParam("code") String code, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("stateCode") String stateCode, @QueryParam("city") String city, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updatePostalCode(accountId,postalCodeId,code,latitude,longitude,stateCode,city,active,securityContext);
    }
}
