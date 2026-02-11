package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.CountResponse;
import java.io.File;
import org.openapitools.model.ProfileResponse;
import org.openapitools.model.TicketListResponse;
import org.openapitools.model.TicketOfferResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class TicketApiService {
    public abstract Response getTicketCount(String deviceId,Long accountId,String gameType,String appKey,String ticketType,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getTicketList(String deviceId,Long accountId,String ticketObjectType,String actionType,String ticketIds,String objectIds,String receiptTokens,String gameType,String appKey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response saveTicket( @NotNull String actionType, @NotNull String ticketObjectType,Boolean returnNulls,String deviceId,Long accountId,String gameType,String appKey,Long objectId,String purchaseCode,String receiptToken,String receiptData,Long count,String ticketType,String purchaseProvider,String purchaseType,Boolean returnProfileResponse,Boolean includeProfileResponse,String appVersion,SecurityContext securityContext) throws NotFoundException;
    public abstract Response saveTicketViaFileUpload( @NotNull String actionType, @NotNull String ticketObjectType, @NotNull File receiptData,Boolean returnNulls,String deviceId,Long accountId,String gameType,String appKey,Long objectId,String purchaseCode,String receiptToken,Long count,String ticketType,String purchaseProvider,String purchaseType,Boolean returnProfileResponse,Boolean includeProfileResponse,String appVersion,SecurityContext securityContext) throws NotFoundException;
    public abstract Response ticketOffers(SecurityContext securityContext) throws NotFoundException;
}
