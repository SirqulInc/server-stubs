package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.BidResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class BidApiService {
    public abstract Response createBid( @NotNull String biddableType, @NotNull Long biddableId, @NotNull Double amountPerView, @NotNull Double amountPerAction, @NotNull Double budgetAmount, @NotNull String budgetSchedule,String deviceId,Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteBid( @NotNull Long bidId,String deviceId,Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getBid( @NotNull Long bidId,String deviceId,Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateBid( @NotNull Long bidId,String deviceId,Long accountId,Double amountPerView,Double amountPerAction,Double budgetAmount,String budgetSchedule,SecurityContext securityContext) throws NotFoundException;
}
