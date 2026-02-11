package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.Trip;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface TripApiService {
      Response createTrip(Trip body,SecurityContext securityContext)
      throws NotFoundException;
      Response delete(Long id,SecurityContext securityContext)
      throws NotFoundException;
      Response driveTrip(Long id,Boolean recurrence,SecurityContext securityContext)
      throws NotFoundException;
      Response flexibleTrip(Long id,Boolean recurrence,SecurityContext securityContext)
      throws NotFoundException;
      Response getTrip(Long id,SecurityContext securityContext)
      throws NotFoundException;
      Response getTripMatches(Long id,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Boolean matchedHasRoute,Boolean matchedHasDriver,SecurityContext securityContext)
      throws NotFoundException;
      Response processTripMatches(Long startDate,Long endDate,Long tripId,SecurityContext securityContext)
      throws NotFoundException;
      Response ride(Long id,Boolean recurrence,SecurityContext securityContext)
      throws NotFoundException;
      Response search(Long accountId,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Long startDate,Long endDate,Boolean hasNotifications,SecurityContext securityContext)
      throws NotFoundException;
      Response searchTrips(Long accountId,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Long startDate,Long endDate,Boolean matchedHasRoute,Boolean matchedHasDriver,SecurityContext securityContext)
      throws NotFoundException;
      Response updateLocations(Long id,Trip body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateRecurrenceLocations(Long id,Trip body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateRecurrenceShipments(Long id,Trip body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateShipments(Long id,Trip body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateTrip(Long id,Trip body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateTripNotifications(Long id,String notifications,SecurityContext securityContext)
      throws NotFoundException;


}
