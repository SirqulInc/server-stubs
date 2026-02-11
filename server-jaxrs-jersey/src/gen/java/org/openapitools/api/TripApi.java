package org.openapitools.api;

import org.openapitools.api.TripApiService;
import org.openapitools.api.factories.TripApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Trip;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/trip")


@io.swagger.annotations.Api(description = "the trip API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TripApi  {
   private final TripApiService delegate;

   public TripApi(@Context ServletConfig servletContext) {
      TripApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("TripApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (TripApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = TripApiServiceFactory.getTripApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Trip", notes = "Create a new trip", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class)
    })
    public Response createTrip(@ApiParam(value = "") @Valid  Trip body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createTrip(body, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Trip", notes = "Delete an existing trip", response = Void.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response delete(@ApiParam(value = "the id of the trip to delete", required = true) @PathParam("id") @NotNull  Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delete(id, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{id}/drive")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Set Trip Preference Driver", notes = "Update trip preference to drive, also create a route and assign the trip to the route", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class)
    })
    public Response driveTrip(@ApiParam(value = "the id of the trip", required = true) @PathParam("id") @NotNull  Long id,@ApiParam(value = "the frequency of the trip (e.g. weekly, until 2018-08-09)", required = true) @QueryParam("recurrence") @NotNull  Boolean recurrence,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.driveTrip(id, recurrence, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{id}/flexible")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Set Trip Preference Flexible", notes = "Update trip preference to flexible.", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class)
    })
    public Response flexibleTrip(@ApiParam(value = "the id of the trip", required = true) @PathParam("id") @NotNull  Long id,@ApiParam(value = "the frequency of the trip (e.g. weekly, until 2018-08-09)", required = true) @QueryParam("recurrence") @NotNull  Boolean recurrence,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.flexibleTrip(id, recurrence, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Trip", notes = "Get an existing trip", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class)
    })
    public Response getTrip(@ApiParam(value = "the id of the trip to get", required = true) @PathParam("id") @NotNull  Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getTrip(id, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{id}/match")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Trip Matches", notes = "Get matching trips of specific trip", response = Trip.class, responseContainer = "List", tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class, responseContainer = "List")
    })
    public Response getTripMatches(@ApiParam(value = "The id The id of the trip to search for matches for", required = true) @PathParam("id") @NotNull  Long id,@ApiParam(value = "The field to sort by", required = true) @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "Determines whether the sorted list is in descending or ascending order", required = true) @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "The start index for pagination", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "The limit for pagination", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "Return only active results", required = true) @QueryParam("activeOnly") @NotNull  Boolean activeOnly,@ApiParam(value = "Only return matchings that already have route assigned") @QueryParam("matchedHasRoute")  Boolean matchedHasRoute,@ApiParam(value = "Only return matchings that already have driver assigned") @QueryParam("matchedHasDriver")  Boolean matchedHasDriver,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getTripMatches(id, sortField, descending, start, limit, activeOnly, matchedHasRoute, matchedHasDriver, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/match/process")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Process Trip Matches", notes = "Process trip matching, assign trips with no route to matched trips with route.", response = Trip.class, responseContainer = "List", tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class, responseContainer = "List")
    })
    public Response processTripMatches(@ApiParam(value = "The lower bound date to process matchings") @QueryParam("startDate")  Long startDate,@ApiParam(value = "The upper bound date to process matchings") @QueryParam("endDate")  Long endDate,@ApiParam(value = "the id of the trip to process") @QueryParam("tripId")  Long tripId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.processTripMatches(startDate, endDate, tripId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{id}/ride")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Set Trip Preference Rider", notes = "Update trip preference to ride.", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class)
    })
    public Response ride(@ApiParam(value = "the id of the trip", required = true) @PathParam("id") @NotNull  Long id,@ApiParam(value = "the frequency of the trip (e.g. weekly, until 2018-08-09)", required = true) @QueryParam("recurrence") @NotNull  Boolean recurrence,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.ride(id, recurrence, securityContext);
    }
    @javax.ws.rs.GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Trips", notes = "Search for trips", response = Trip.class, responseContainer = "List", tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class, responseContainer = "List")
    })
    public Response search(@ApiParam(value = "The owner of the trips", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The field to sort by", required = true) @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "Determines whether the sorted list is in descending or ascending order", required = true) @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "The start index for pagination", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "The limit for pagination", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "Return only active results", required = true) @QueryParam("activeOnly") @NotNull  Boolean activeOnly,@ApiParam(value = "The lower bound limit of time") @QueryParam("startDate")  Long startDate,@ApiParam(value = "The upper bound limit of time") @QueryParam("endDate")  Long endDate,@ApiParam(value = "whether to search on trips that have notifications or not") @QueryParam("hasNotifications")  Boolean hasNotifications,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.search(accountId, sortField, descending, start, limit, activeOnly, startDate, endDate, hasNotifications, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/match")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Trips", notes = "Search for trips with matching information.", response = Trip.class, responseContainer = "List", tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class, responseContainer = "List")
    })
    public Response searchTrips(@ApiParam(value = "The owner of the trips", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The field to sort by", required = true) @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "Determines whether the sorted list is in descending or ascending order", required = true) @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "The start index for pagination", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "The limit for pagination", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "Return only active results", required = true) @QueryParam("activeOnly") @NotNull  Boolean activeOnly,@ApiParam(value = "The lower bound limit of time") @QueryParam("startDate")  Long startDate,@ApiParam(value = "The upper bound limit of time") @QueryParam("endDate")  Long endDate,@ApiParam(value = "Only return matchings that already have route assigned") @QueryParam("matchedHasRoute")  Boolean matchedHasRoute,@ApiParam(value = "Only return matchings that already have driver assigned") @QueryParam("matchedHasDriver")  Boolean matchedHasDriver,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchTrips(accountId, sortField, descending, start, limit, activeOnly, startDate, endDate, matchedHasRoute, matchedHasDriver, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{id}/locations")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Trip Locations", notes = "", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class)
    })
    public Response updateLocations(@ApiParam(value = "the id of the trip to update locations for", required = true) @PathParam("id") @NotNull  Long id,@ApiParam(value = "") @Valid  Trip body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateLocations(id, body, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{id}/locations/recurrence")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Recurrence Locations", notes = "", response = Trip.class, responseContainer = "List", tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class, responseContainer = "List")
    })
    public Response updateRecurrenceLocations(@ApiParam(value = "the id of the trip", required = true) @PathParam("id") @NotNull  Long id,@ApiParam(value = "") @Valid  Trip body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateRecurrenceLocations(id, body, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{id}/shipments/recurrence")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Recurrence Shipments", notes = "", response = Trip.class, responseContainer = "List", tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class, responseContainer = "List")
    })
    public Response updateRecurrenceShipments(@ApiParam(value = "the id of the trip", required = true) @PathParam("id") @NotNull  Long id,@ApiParam(value = "") @Valid  Trip body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateRecurrenceShipments(id, body, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{id}/shipments")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Trip Shipments", notes = "", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class)
    })
    public Response updateShipments(@ApiParam(value = "the id of the trip shipments to update", required = true) @PathParam("id") @NotNull  Long id,@ApiParam(value = "") @Valid  Trip body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateShipments(id, body, securityContext);
    }
    @javax.ws.rs.PUT
    @Path("/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Trip", notes = "Update an existing trip. Does not support recurring trip update.", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class)
    })
    public Response updateTrip(@ApiParam(value = "the id of the trip to update", required = true) @PathParam("id") @NotNull  Long id,@ApiParam(value = "") @Valid  Trip body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateTrip(id, body, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/notifications")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Trip Notifications", notes = "Update the trip notifications", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class)
    })
    public Response updateTripNotifications(@ApiParam(value = "the id of the trip", required = true) @QueryParam("id") @NotNull  Long id,@ApiParam(value = "the notifications to update on the trip") @QueryParam("notifications")  String notifications,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateTripNotifications(id, notifications, securityContext);
    }
}
