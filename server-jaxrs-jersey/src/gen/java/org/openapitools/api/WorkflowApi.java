package org.openapitools.api;

import org.openapitools.api.WorkflowApiService;
import org.openapitools.api.factories.WorkflowApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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

@Path("/workflow/run")


@io.swagger.annotations.Api(description = "the workflow API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class WorkflowApi  {
   private final WorkflowApiService delegate;

   public WorkflowApi(@Context ServletConfig servletContext) {
      WorkflowApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("WorkflowApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (WorkflowApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = WorkflowApiServiceFactory.getWorkflowApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Run Workflow", notes = "Runs a published executable workflow", response = SirqulResponse.class, tags={ "Workflow", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response runWorkflow(@ApiParam(value = "the account ID of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the workflow to run", required = true) @QueryParam("workflowId") @NotNull  Long workflowId,@ApiParam(value = "this runs a particular sku on the workflow") @QueryParam("skuId")  Long skuId,@ApiParam(value = "this runs a particular sku version on the workflow") @QueryParam("versionCode")  Integer versionCode,@ApiParam(value = "Override parameters in JSON format. Example: ```json {   \"arguments_81\": { \"filter\": \"PUBLIC\" },   \"arguments_87\": { \"tag\": \"custom_tag\" } } ``` ") @QueryParam("parameters")  String parameters,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.runWorkflow(accountId, workflowId, skuId, versionCode, parameters, securityContext);
    }
}
