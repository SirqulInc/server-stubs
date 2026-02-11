package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.Trip;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class TripApiService {
    public abstract Response createTrip(Trip body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response delete(Long id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response driveTrip(Long id, @NotNull Boolean recurrence,SecurityContext securityContext) throws NotFoundException;
    public abstract Response flexibleTrip(Long id, @NotNull Boolean recurrence,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getTrip(Long id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getTripMatches(Long id, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly,Boolean matchedHasRoute,Boolean matchedHasDriver,SecurityContext securityContext) throws NotFoundException;
    public abstract Response processTripMatches(Long startDate,Long endDate,Long tripId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response ride(Long id, @NotNull Boolean recurrence,SecurityContext securityContext) throws NotFoundException;
    public abstract Response search( @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly,Long startDate,Long endDate,Boolean hasNotifications,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchTrips( @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly,Long startDate,Long endDate,Boolean matchedHasRoute,Boolean matchedHasDriver,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateLocations(Long id,Trip body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateRecurrenceLocations(Long id,Trip body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateRecurrenceShipments(Long id,Trip body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateShipments(Long id,Trip body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateTrip(Long id,Trip body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateTripNotifications( @NotNull Long id,String notifications,SecurityContext securityContext) throws NotFoundException;
}
