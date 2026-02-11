package org.openapitools.api;

import org.openapitools.api.OpenaiApiService;
import org.openapitools.api.factories.OpenaiApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.WrappedProxyItemResponse;

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

@Path("/openai/v1/images/generations")


@io.swagger.annotations.Api(description = "the openai API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OpenaiApi  {
   private final OpenaiApiService delegate;

   public OpenaiApi(@Context ServletConfig servletContext) {
      OpenaiApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("OpenaiApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (OpenaiApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = OpenaiApiServiceFactory.getOpenaiApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Generate images with OpenAI", notes = "Generate images with OpenAI.", response = WrappedProxyItemResponse.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WrappedProxyItemResponse.class)
    })
    public Response imageGeneration(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Post Body Parameters", required = true) @QueryParam("postBody") @NotNull  String postBody,@ApiParam(value = "Return raw response") @QueryParam("returnRawResponse")  Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.imageGeneration(accountId, postBody, returnRawResponse, securityContext);
    }
}
