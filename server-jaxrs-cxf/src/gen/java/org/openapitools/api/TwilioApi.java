package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.TwiMLResponse;

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
@Path("/api/{version}/sms/buyoffer/{appKey}")
@Api(value = "/", description = "")
public interface TwilioApi  {

    /**
     * Buy Offer by SMS
     *
     * Recieve an SMS payload from Twillio to purchase an offer.
     *
     */
    @POST
    
    @Produces({ "application/xml" })
    @ApiOperation(value = "Buy Offer by SMS", tags={ "Twilio" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = TwiMLResponse.class) })
    public TwiMLResponse smsBuyOffer(@PathParam("version") BigDecimal version, @PathParam("appKey") String appKey, @QueryParam("Body") @NotNull String body, @QueryParam("From") @NotNull String from, @QueryParam("currencyType") @NotNull String currencyType);
}
