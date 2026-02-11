package org.openapitools.api;

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
@Path("/stripe/checkout/session/create")
@Api(value = "/", description = "")
public interface StripeApi  {

    /**
     * Create Stripe Checkout Session
     *
     * Create a Stripe checkout session
     *
     */
    @POST
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Stripe Checkout Session", tags={ "Stripe" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse createStripeCheckoutSession(@QueryParam("appKey") @NotNull String appKey, @QueryParam("stripeParameters") @NotNull String stripeParameters);
}
