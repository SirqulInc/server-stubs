package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import java.util.Map;
import org.openapitools.model.Shipment;
import org.openapitools.model.ShipmentBatch;
import org.openapitools.model.ShipmentImportStatus;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface ShipmentApiService {
      Response cancelShipment(Long id,SecurityContext securityContext)
      throws NotFoundException;
      Response createShipment(Shipment body,SecurityContext securityContext)
      throws NotFoundException;
      Response createShipmentBatch(ShipmentBatch body,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteShipment(Long id,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteShipmentBatch(Long batchId,SecurityContext securityContext)
      throws NotFoundException;
      Response getShipment(Long id,SecurityContext securityContext)
      throws NotFoundException;
      Response getShipmentBatch(Long batchId,SecurityContext securityContext)
      throws NotFoundException;
      Response getShipmentBatchStatus(Long batchId,Long accountId,String sortField,Boolean descending,Integer start,Integer limit,Boolean valid,Boolean started,Boolean completed,Boolean hasShipment,Boolean hasRoute,String keyword,SecurityContext securityContext)
      throws NotFoundException;
      Response searchShipmentBatch(Long hubId,String sortField,Boolean descending,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchShipments(String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Long ownerId,Long riderId,Long routeId,SecurityContext securityContext)
      throws NotFoundException;
      Response updateShipment(Long id,Shipment body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateShipmentStatus(Long id,Map<String, Boolean> body,SecurityContext securityContext)
      throws NotFoundException;


}
