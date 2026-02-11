package org.openapitools.api;

import org.openapitools.api.CargoApiService;
import org.openapitools.api.factories.CargoApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Account;
import org.openapitools.model.CargoType;
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

@Path("/cargo")


@io.swagger.annotations.Api(description = "the cargo API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class CargoApi  {
   private final CargoApiService delegate;

   public CargoApi(@Context ServletConfig servletContext) {
      CargoApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("CargoApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (CargoApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = CargoApiServiceFactory.getCargoApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.PUT
    @Path("/dependent/{accountId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Dependent", notes = "Create dependent of the account", response = SirqulResponse.class, tags={ "Dependent", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response create(@ApiParam(value = "the id of the parent account to create a dependent for", required = true) @PathParam("accountId") @NotNull  Long accountId,@ApiParam(value = "") @Valid  Account body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.create(accountId, body, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/type")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Cargo Type", notes = "Create new cargo type", response = CargoType.class, tags={ "Cargo Type", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CargoType.class)
    })
    public Response createCargoType(@ApiParam(value = "") @Valid  CargoType body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createCargoType(body, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/type/{cargoTypeId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Cargo Type", notes = "Delete a type of cargo", response = Void.class, tags={ "Cargo Type", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response deleteCargoType(@ApiParam(value = "the ID of the cargo type", required = true) @PathParam("cargoTypeId") @NotNull  Long cargoTypeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteCargoType(cargoTypeId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/type/{cargoTypeId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Cargo Type", notes = "Get an existing cargo type", response = CargoType.class, tags={ "Cargo Type", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CargoType.class)
    })
    public Response getCargoType(@ApiParam(value = "the cargo type ID", required = true) @PathParam("cargoTypeId") @NotNull  Long cargoTypeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCargoType(cargoTypeId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/dependent/{accountId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get dependent list of an account", notes = "Get the dependent list of an account", response = SirqulResponse.class, tags={ "Dependent", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response getDependents(@ApiParam(value = "the id of the parent account to get a list of dependents", required = true) @PathParam("accountId") @NotNull  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getDependents(accountId, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/dependent/{accountId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Dependent", notes = "Delete the Dependent", response = Void.class, tags={ "Dependent", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response removeDependent(@ApiParam(value = "the id of the parent account tied to the dependent", required = true) @PathParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the dependent to delete", required = true) @PathParam("dependentId") @NotNull  Long dependentId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.removeDependent(accountId, dependentId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/type")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Cargo Type", notes = "Search for types of cargo", response = CargoType.class, responseContainer = "List", tags={ "Cargo Type", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CargoType.class, responseContainer = "List")
    })
    public Response searchCargoTypes(@ApiParam(value = "the sort field to use for the cargo type", required = true) @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "if the cargo type should be should be in descending order", required = true) @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "the start of the search", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "the limit of the search", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "if search should be on active only", required = true) @QueryParam("activeOnly") @NotNull  Boolean activeOnly,@ApiParam(value = "the id of the retailer location") @QueryParam("retailerId")  Long retailerId,@ApiParam(value = "the ID of the hub") @QueryParam("hubId")  Long hubId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchCargoTypes(sortField, descending, start, limit, activeOnly, retailerId, hubId, securityContext);
    }
    @javax.ws.rs.PUT
    @Path("/type/{cargoTypeId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Cargo Type", notes = "Update an existing cargo type", response = CargoType.class, tags={ "Cargo Type", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CargoType.class)
    })
    public Response updateCargoType(@ApiParam(value = "the ID of the cargo type", required = true) @PathParam("cargoTypeId") @NotNull  Long cargoTypeId,@ApiParam(value = "") @Valid  CargoType body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateCargoType(cargoTypeId, body, securityContext);
    }
}
