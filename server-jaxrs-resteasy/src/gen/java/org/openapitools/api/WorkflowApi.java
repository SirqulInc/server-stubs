package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.WorkflowApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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

@Path("/workflow/run")


@io.swagger.annotations.Api(description = "the workflow API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class WorkflowApi  {

    @Inject WorkflowApiService service;

    @POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Run Workflow", notes = "Runs a published executable workflow", response = SirqulResponse.class, tags={ "Workflow", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response runWorkflow( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("workflowId") Long workflowId, @QueryParam("skuId") Long skuId, @QueryParam("versionCode") Integer versionCode, @QueryParam("parameters") String parameters,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.runWorkflow(accountId,workflowId,skuId,versionCode,parameters,securityContext);
    }
}
