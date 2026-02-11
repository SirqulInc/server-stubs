package org.openapitools.api;

import org.openapitools.api.BidApiService;
import org.openapitools.api.factories.BidApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.BidResponse;
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

@Path("/bid")


@io.swagger.annotations.Api(description = "the bid API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class BidApi  {
   private final BidApiService delegate;

   public BidApi(@Context ServletConfig servletContext) {
      BidApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("BidApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (BidApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = BidApiServiceFactory.getBidApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Bid", notes = "Creates a bid on a biddable object", response = BidResponse.class, tags={ "Bid", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = BidResponse.class)
    })
    public Response createBid(@ApiParam(value = "A biddable object type. Possible values include: CREATIVE (ads).", required = true) @QueryParam("biddableType") @NotNull  String biddableType,@ApiParam(value = "The id of the biddable object", required = true) @QueryParam("biddableId") @NotNull  Long biddableId,@ApiParam(value = "The bid amount for views. For ads, this is the amount that will be taken for each impression.", required = true) @QueryParam("amountPerView") @NotNull  Double amountPerView,@ApiParam(value = "The bid amount for actions. For ads, this is the amount that will be taken for each click.", required = true) @QueryParam("amountPerAction") @NotNull  Double amountPerAction,@ApiParam(value = "The allocated budget amount that will be used", required = true) @QueryParam("budgetAmount") @NotNull  Double budgetAmount,@ApiParam(value = "The schedule for when the allocated budget amount is reset", required = true) @QueryParam("budgetSchedule") @NotNull  String budgetSchedule,@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createBid(biddableType, biddableId, amountPerView, amountPerAction, budgetAmount, budgetSchedule, deviceId, accountId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Bid", notes = "Deleted a bid on a biddable object", response = SirqulResponse.class, tags={ "Bid", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteBid(@ApiParam(value = "The bid id", required = true) @QueryParam("bidId") @NotNull  Long bidId,@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteBid(bidId, deviceId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Bid", notes = "Get the bid details of a biddable object", response = BidResponse.class, tags={ "Bid", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = BidResponse.class)
    })
    public Response getBid(@ApiParam(value = "The bid id", required = true) @QueryParam("bidId") @NotNull  Long bidId,@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getBid(bidId, deviceId, accountId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Bid", notes = "Updates a bid on a biddable object", response = BidResponse.class, tags={ "Bid", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = BidResponse.class)
    })
    public Response updateBid(@ApiParam(value = "The bid id", required = true) @QueryParam("bidId") @NotNull  Long bidId,@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The bid amount for views. For ads, this is the amount that will be taken for each impression.") @QueryParam("amountPerView")  Double amountPerView,@ApiParam(value = "The bid amount for actions. For ads, this is the amount that will be taken for each click.") @QueryParam("amountPerAction")  Double amountPerAction,@ApiParam(value = "The allocated budget amount that will be used") @QueryParam("budgetAmount")  Double budgetAmount,@ApiParam(value = "The schedule for when the allocated budget amount is reset") @QueryParam("budgetSchedule")  String budgetSchedule,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateBid(bidId, deviceId, accountId, amountPerView, amountPerAction, budgetAmount, budgetSchedule, securityContext);
    }
}
