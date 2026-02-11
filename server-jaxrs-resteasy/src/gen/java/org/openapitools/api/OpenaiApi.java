package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.OpenaiApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.WrappedProxyItemResponse;

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

@Path("/openai/v1/images/generations")


@io.swagger.annotations.Api(description = "the openai API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OpenaiApi  {

    @Inject OpenaiApiService service;

    @POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Generate images with OpenAI", notes = "Generate images with OpenAI.", response = WrappedProxyItemResponse.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WrappedProxyItemResponse.class) })
    public Response imageGeneration( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("postBody") String postBody, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.imageGeneration(accountId,postBody,returnRawResponse,securityContext);
    }
}
