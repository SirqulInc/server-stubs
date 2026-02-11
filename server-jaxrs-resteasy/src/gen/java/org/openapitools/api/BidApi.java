package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.BidApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.BidResponse;
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

@Path("/bid")


@io.swagger.annotations.Api(description = "the bid API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class BidApi  {

    @Inject BidApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Bid", notes = "Creates a bid on a biddable object", response = BidResponse.class, tags={ "Bid", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = BidResponse.class) })
    public Response createBid( @NotNull @QueryParam("biddableType") String biddableType, @NotNull @QueryParam("biddableId") Long biddableId, @NotNull @QueryParam("amountPerView") Double amountPerView, @NotNull @QueryParam("amountPerAction") Double amountPerAction, @NotNull @QueryParam("budgetAmount") Double budgetAmount, @NotNull @QueryParam("budgetSchedule") String budgetSchedule, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createBid(biddableType,biddableId,amountPerView,amountPerAction,budgetAmount,budgetSchedule,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Bid", notes = "Deleted a bid on a biddable object", response = SirqulResponse.class, tags={ "Bid", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteBid( @NotNull @QueryParam("bidId") Long bidId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteBid(bidId,deviceId,accountId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Bid", notes = "Get the bid details of a biddable object", response = BidResponse.class, tags={ "Bid", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = BidResponse.class) })
    public Response getBid( @NotNull @QueryParam("bidId") Long bidId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBid(bidId,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Bid", notes = "Updates a bid on a biddable object", response = BidResponse.class, tags={ "Bid", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = BidResponse.class) })
    public Response updateBid( @NotNull @QueryParam("bidId") Long bidId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("amountPerView") Double amountPerView, @QueryParam("amountPerAction") Double amountPerAction, @QueryParam("budgetAmount") Double budgetAmount, @QueryParam("budgetSchedule") String budgetSchedule,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateBid(bidId,deviceId,accountId,amountPerView,amountPerAction,budgetAmount,budgetSchedule,securityContext);
    }
}
