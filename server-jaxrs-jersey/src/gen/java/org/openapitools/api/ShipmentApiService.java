package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import java.util.Map;
import org.openapitools.model.Shipment;
import org.openapitools.model.ShipmentBatch;
import org.openapitools.model.ShipmentImportStatus;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class ShipmentApiService {
    public abstract Response cancelShipment(Long id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createShipment(Shipment body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createShipmentBatch(ShipmentBatch body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteShipment(Long id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteShipmentBatch(Long batchId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getShipment(Long id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getShipmentBatch(Long batchId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getShipmentBatchStatus(Long batchId, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit,Boolean valid,Boolean started,Boolean completed,Boolean hasShipment,Boolean hasRoute,String keyword,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchShipmentBatch( @NotNull Long hubId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchShipments( @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly,Long ownerId,Long riderId,Long routeId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateShipment(Long id,Shipment body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateShipmentStatus(Long id,Map<String, Boolean> body,SecurityContext securityContext) throws NotFoundException;
}
