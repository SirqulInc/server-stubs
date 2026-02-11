package org.openapitools.api;

import org.openapitools.api.RouteApiService;
import org.openapitools.api.factories.RouteApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Direction;
import org.openapitools.model.Route;
import org.openapitools.model.RouteSettings;
import org.openapitools.model.Shipment;
import org.openapitools.model.Stop;

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

@Path("/route")


@io.swagger.annotations.Api(description = "the route API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RouteApi  {
   private final RouteApiService delegate;

   public RouteApi(@Context ServletConfig servletContext) {
      RouteApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("RouteApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (RouteApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = RouteApiServiceFactory.getRouteApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/{routeId}/approve")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Approve Route", notes = "Approve a route", response = Route.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Route.class)
    })
    public Response approveRoute(@ApiParam(value = "the id of the route to approve", required = true) @PathParam("routeId") @NotNull  Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.approveRoute(routeId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{routeId}/copy")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Copy Route", notes = "Make an copy of the given route with optional overriding properties", response = Route.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Route.class)
    })
    public Response copyRoute(@ApiParam(value = "the id of the route to duplicate", required = true) @PathParam("routeId") @NotNull  Long routeId,@ApiParam(value = "") @Valid  Route body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.copyRoute(routeId, body, securityContext);
    }
    @javax.ws.rs.POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Route", notes = "Create new route", response = Route.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Route.class)
    })
    public Response createRoute(@ApiParam(value = "") @Valid  Route body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createRoute(body, securityContext);
    }
    @javax.ws.rs.PUT
    @Path("/{routeId}/directions")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Route Directions", notes = "Regenerate the directions of a route", response = Direction.class, responseContainer = "List", tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Direction.class, responseContainer = "List")
    })
    public Response createRouteDirections(@ApiParam(value = "the id of the route to update directions for", required = true) @PathParam("routeId") @NotNull  Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createRouteDirections(routeId, securityContext);
    }
    @javax.ws.rs.PUT
    @Path("/{routeId}/polyline")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Route Polyline", notes = "Update the polyline of the requested route", response = Route.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Route.class)
    })
    public Response createRoutePolyline(@ApiParam(value = "the id of the route to create a polyline for", required = true) @PathParam("routeId") @NotNull  Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createRoutePolyline(routeId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/setting")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Route Setting", notes = "Create a new route setting", response = RouteSettings.class, tags={ "Route Setting", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RouteSettings.class)
    })
    public Response createRouteSettings(@ApiParam(value = "") @Valid  RouteSettings body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createRouteSettings(body, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/{routeId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Route", notes = "Delete an existing route", response = Void.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response deleteRoute(@ApiParam(value = "the id of the route", required = true) @PathParam("routeId") @NotNull  Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteRoute(routeId, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/setting/{routeSettingsId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Route Setting", notes = "Delete an existing route setting", response = Object.class, tags={ "Route Setting", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Object.class)
    })
    public Response deleteRouteSettings(@ApiParam(value = "the id of the route setting to delete", required = true) @PathParam("routeSettingsId") @NotNull  Long routeSettingsId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteRouteSettings(routeSettingsId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{routeId}/disapprove")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Disapprove Route", notes = "Disapprove a route", response = Route.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Route.class)
    })
    public Response disapproveRoute(@ApiParam(value = "the id of the route to reject", required = true) @PathParam("routeId") @NotNull  Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.disapproveRoute(routeId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{routeId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Route", notes = "Get an existing route", response = Route.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Route.class)
    })
    public Response getRoute(@ApiParam(value = "the id of the route to get", required = true) @PathParam("routeId") @NotNull  Long routeId,@ApiParam(value = "return inherited properties from parent or not", required = true) @QueryParam("showInheritedProperties") @NotNull  Boolean showInheritedProperties,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getRoute(routeId, showInheritedProperties, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{routeId}/directions")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Route Directions", notes = "Get the directions of a route", response = Direction.class, responseContainer = "List", tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Direction.class, responseContainer = "List")
    })
    public Response getRouteDirections(@ApiParam(value = "the id of the route to get directions for", required = true) @PathParam("routeId") @NotNull  Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getRouteDirections(routeId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/setting/{routeSettingsId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Route Setting", notes = "Get an existing route settings", response = RouteSettings.class, tags={ "Route Setting", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RouteSettings.class)
    })
    public Response getRouteSettings(@ApiParam(value = "the id of the route settings to get", required = true) @PathParam("routeSettingsId") @NotNull  Long routeSettingsId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getRouteSettings(routeSettingsId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{routeId}/shipments")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Route Shipments", notes = "Get the shipments on the requested route", response = Shipment.class, responseContainer = "List", tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Shipment.class, responseContainer = "List")
    })
    public Response getRouteShipments(@ApiParam(value = "the id of the route to get shipments for", required = true) @PathParam("routeId") @NotNull  Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getRouteShipments(routeId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{routeId}/stop/{stopId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Route Stop", notes = "Get the specific stop on a route", response = Stop.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Stop.class)
    })
    public Response getRouteStop(@ApiParam(value = "the id of the route to get stops for", required = true) @PathParam("routeId") @NotNull  Long routeId,@ApiParam(value = "the id of the specific stop on the route", required = true) @PathParam("stopId") @NotNull  Long stopId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getRouteStop(routeId, stopId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{routeId}/stops")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Route Stops", notes = "The stops of the route requested", response = Stop.class, responseContainer = "List", tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Stop.class, responseContainer = "List")
    })
    public Response getRouteStops(@ApiParam(value = "the id of the route", required = true) @PathParam("routeId") @NotNull  Long routeId,@ApiParam(value = "only get stops that have been confirmed or not", required = true) @QueryParam("confirmedOnly") @NotNull  Boolean confirmedOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getRouteStops(routeId, confirmedOnly, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{routeId}/stop/{stopId}/shipments")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Shipments At Stop", notes = "Get the list of shipments on the requested route at a stop", response = Shipment.class, responseContainer = "List", tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Shipment.class, responseContainer = "List")
    })
    public Response getShipmentsAtStop(@ApiParam(value = "the id of the route", required = true) @PathParam("routeId") @NotNull  Long routeId,@ApiParam(value = "the id of the stop to get shipments on", required = true) @PathParam("stopId") @NotNull  Long stopId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getShipmentsAtStop(routeId, stopId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{routeId}/optimize")
    
    
    @io.swagger.annotations.ApiOperation(value = "Optimize Route", notes = "Optimize a route. The optimization method based on how the server is configured.", response = Void.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response optimizeRoute(@ApiParam(value = "the id of the route to optimize", required = true) @PathParam("routeId") @NotNull  Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.optimizeRoute(routeId, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/{routeId}/stop/{stopId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Stop", notes = "Delete a stop on a route", response = Void.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response removeStop(@ApiParam(value = "the id of the route", required = true) @PathParam("routeId") @NotNull  Long routeId,@ApiParam(value = "the id of the specific stop to delete on the route", required = true) @PathParam("stopId") @NotNull  Long stopId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.removeStop(routeId, stopId, securityContext);
    }
    @javax.ws.rs.PATCH
    @Path("/{routeId}/stops/reorder")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Reorder Route Stops", notes = "Reordering the stops on the route with and update route distance, time, direction, and polyline", response = Stop.class, responseContainer = "List", tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Stop.class, responseContainer = "List")
    })
    public Response reorderRouteStopsPatch(@ApiParam(value = "the id of the route", required = true) @PathParam("routeId") @NotNull  Long routeId,@ApiParam(value = "") @Valid  List<@Valid Stop> body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.reorderRouteStopsPatch(routeId, body, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{routeId}/stops/reorder")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Reorder Route Stops", notes = "Reordering the stops on the route with and update route distance, time, direction, and polyline", response = Stop.class, responseContainer = "List", tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Stop.class, responseContainer = "List")
    })
    public Response reorderRouteStopsPost(@ApiParam(value = "the id of the route", required = true) @PathParam("routeId") @NotNull  Long routeId,@ApiParam(value = "") @Valid  List<@Valid Stop> body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.reorderRouteStopsPost(routeId, body, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/setting")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Route Settings", notes = "Search for route settings", response = RouteSettings.class, responseContainer = "List", tags={ "Route Setting", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RouteSettings.class, responseContainer = "List")
    })
    public Response searchRouteSettings(@ApiParam(value = "The field to sort by", required = true) @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "Determines whether the sorted list is in descending or ascending order", required = true) @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "The start index for pagination", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "The limit for pagination", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "Return only active results", required = true) @QueryParam("activeOnly") @NotNull  Boolean activeOnly,@ApiParam(value = "The service hub that the route belongs under") @QueryParam("hubId")  Long hubId,@ApiParam(value = "The program that the route belongs under") @QueryParam("programId")  Long programId,@ApiParam(value = "The keyword to search for the route") @QueryParam("keyword")  String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchRouteSettings(sortField, descending, start, limit, activeOnly, hubId, programId, keyword, securityContext);
    }
    @javax.ws.rs.GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Routes", notes = "Search for routes.", response = Route.class, responseContainer = "List", tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Route.class, responseContainer = "List")
    })
    public Response searchRoutes(@ApiParam(value = "The field to sort by", required = true) @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "Determines whether the sorted list is in descending or ascending order", required = true) @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "The start index for pagination", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "The limit for pagination", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "Return only active results", required = true) @QueryParam("activeOnly") @NotNull  Boolean activeOnly,@ApiParam(value = "Include empty routes or not", required = true) @QueryParam("includesEmpty") @NotNull  Boolean includesEmpty,@ApiParam(value = "Only return root instance routes", required = true) @QueryParam("rootOnly") @NotNull  Boolean rootOnly,@ApiParam(value = "Display root route properties", required = true) @QueryParam("showInheritedProperties") @NotNull  Boolean showInheritedProperties,@ApiParam(value = "Filter results by service hub") @QueryParam("hubId")  Long hubId,@ApiParam(value = "Filter results by program") @QueryParam("programId")  Long programId,@ApiParam(value = "The start date to filter the results by") @QueryParam("scheduledStart")  Long scheduledStart,@ApiParam(value = "The end date to filter the results by") @QueryParam("scheduledEnd")  Long scheduledEnd,@ApiParam(value = "The lower bound of updated date") @QueryParam("updatedStart")  Long updatedStart,@ApiParam(value = "The upper bound of updated date") @QueryParam("updatedEnd")  Long updatedEnd,@ApiParam(value = "The route is featured or not") @QueryParam("featured")  Boolean featured,@ApiParam(value = "Has at least this many seat available") @QueryParam("seatCount")  Integer seatCount,@ApiParam(value = "Has been approved or not") @QueryParam("approved")  Boolean approved,@ApiParam(value = "Has started or not") @QueryParam("started")  Boolean started,@ApiParam(value = "Has completed or not") @QueryParam("completed")  Boolean completed,@ApiParam(value = "Is valid or not") @QueryParam("valid")  Boolean valid,@ApiParam(value = "If it is a recurring route based on the parent route") @QueryParam("parentId")  Long parentId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchRoutes(sortField, descending, start, limit, activeOnly, includesEmpty, rootOnly, showInheritedProperties, hubId, programId, scheduledStart, scheduledEnd, updatedStart, updatedEnd, featured, seatCount, approved, started, completed, valid, parentId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{id}/driver/{driverId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Set Driver", notes = "Update the driver of the route.", response = Void.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response setDriver(@ApiParam(value = "the id of the route", required = true) @PathParam("id") @NotNull  Long id,@ApiParam(value = "the id of the driver", required = true) @PathParam("driverId") @NotNull  Long driverId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.setDriver(id, driverId, securityContext);
    }
    @javax.ws.rs.PUT
    @Path("/{routeId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Route", notes = "Update an existing route", response = Route.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Route.class)
    })
    public Response updateRoute(@ApiParam(value = "the id of the route", required = true) @PathParam("routeId") @NotNull  Long routeId,@ApiParam(value = "") @Valid  Route body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateRoute(routeId, body, securityContext);
    }
    @javax.ws.rs.PUT
    @Path("/setting/{routeSettingsId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Route Setting", notes = "Update an existing route setting", response = RouteSettings.class, tags={ "Route Setting", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RouteSettings.class)
    })
    public Response updateRouteSettings(@ApiParam(value = "the id of the route settings to update", required = true) @PathParam("routeSettingsId") @NotNull  Long routeSettingsId,@ApiParam(value = "") @Valid  RouteSettings body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateRouteSettings(routeSettingsId, body, securityContext);
    }
    @javax.ws.rs.PUT
    @Path("/{routeId}/stop/{stopId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Update Route Stop", notes = "Update a stop on a specified route", response = Void.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response updateRouteStop(@ApiParam(value = "the id of the route to update stops for", required = true) @PathParam("routeId") @NotNull  Long routeId,@ApiParam(value = "the id of the specific stop to update on the route", required = true) @PathParam("stopId") @NotNull  Long stopId,@ApiParam(value = "") @Valid  Stop body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateRouteStop(routeId, stopId, body, securityContext);
    }
}
