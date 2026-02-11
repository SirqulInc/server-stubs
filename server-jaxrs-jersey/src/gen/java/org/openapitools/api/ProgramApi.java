package org.openapitools.api;

import org.openapitools.api.ProgramApiService;
import org.openapitools.api.factories.ProgramApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Program;

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

@Path("/program")


@io.swagger.annotations.Api(description = "the program API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ProgramApi  {
   private final ProgramApiService delegate;

   public ProgramApi(@Context ServletConfig servletContext) {
      ProgramApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ProgramApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ProgramApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = ProgramApiServiceFactory.getProgramApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Program", notes = "Create a new program", response = Program.class, tags={ "Program", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Program.class)
    })
    public Response createProgram(@ApiParam(value = "") @Valid  Program body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createProgram(body, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Program", notes = "Delete an existing program", response = Void.class, tags={ "Program", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response deleteProgram(@ApiParam(value = "the id of the program", required = true) @PathParam("id") @NotNull  Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteProgram(id, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Program", notes = "Get an existing program", response = Program.class, tags={ "Program", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Program.class)
    })
    public Response getProgram(@ApiParam(value = "the id of the program", required = true) @PathParam("id") @NotNull  Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getProgram(id, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Program", notes = "Update an existing program", response = Program.class, tags={ "Program", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Program.class)
    })
    public Response postProgram(@ApiParam(value = "the id of the program", required = true) @PathParam("id") @NotNull  Long id,@ApiParam(value = "") @Valid  Program body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postProgram(id, body, securityContext);
    }
    @javax.ws.rs.PUT
    @Path("/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Program", notes = "Update an existing program", response = Program.class, tags={ "Program", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Program.class)
    })
    public Response putProgram(@ApiParam(value = "the id of the program", required = true) @PathParam("id") @NotNull  Long id,@ApiParam(value = "") @Valid  Program body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.putProgram(id, body, securityContext);
    }
    @javax.ws.rs.GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Programs", notes = "Search for programs", response = Program.class, responseContainer = "List", tags={ "Program", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Program.class, responseContainer = "List")
    })
    public Response searchPrograms(@ApiParam(value = "The field to sort by", required = true) @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "Determines whether the sorted list is in descending or ascending order", required = true) @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "The start index for pagination", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "The limit for pagination", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "Return only active results", required = true) @QueryParam("activeOnly") @NotNull  Boolean activeOnly,@ApiParam(value = "The keyword to filter results by") @QueryParam("keyword")  String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchPrograms(sortField, descending, start, limit, activeOnly, keyword, securityContext);
    }
}
