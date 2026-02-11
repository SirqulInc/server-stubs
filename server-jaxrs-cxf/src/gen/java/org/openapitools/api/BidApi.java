package org.openapitools.api;

import org.openapitools.model.BidResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
@Path("/bid")
@Api(value = "/", description = "")
public interface BidApi  {

    /**
     * Create Bid
     *
     * Creates a bid on a biddable object
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Bid", tags={ "Bid" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = BidResponse.class) })
    public BidResponse createBid(@QueryParam("biddableType") @NotNull String biddableType, @QueryParam("biddableId") @NotNull Long biddableId, @QueryParam("amountPerView") @NotNull Double amountPerView, @QueryParam("amountPerAction") @NotNull Double amountPerAction, @QueryParam("budgetAmount") @NotNull Double budgetAmount, @QueryParam("budgetSchedule") @NotNull String budgetSchedule, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId);

    /**
     * Delete Bid
     *
     * Deleted a bid on a biddable object
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Bid", tags={ "Bid" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteBid(@QueryParam("bidId") @NotNull Long bidId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId);

    /**
     * Get Bid
     *
     * Get the bid details of a biddable object
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Bid", tags={ "Bid" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = BidResponse.class) })
    public BidResponse getBid(@QueryParam("bidId") @NotNull Long bidId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId);

    /**
     * Update Bid
     *
     * Updates a bid on a biddable object
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Bid", tags={ "Bid" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = BidResponse.class) })
    public BidResponse updateBid(@QueryParam("bidId") @NotNull Long bidId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("amountPerView") Double amountPerView, @QueryParam("amountPerAction") Double amountPerAction, @QueryParam("budgetAmount") Double budgetAmount, @QueryParam("budgetSchedule") String budgetSchedule);
}
