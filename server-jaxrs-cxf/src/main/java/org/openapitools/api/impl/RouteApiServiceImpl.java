package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.Direction;
import org.openapitools.model.Route;
import org.openapitools.model.Shipment;
import org.openapitools.model.Stop;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
public class RouteApiServiceImpl implements RouteApi {
    /**
     * Approve Route
     *
     * Approve a route
     *
     */
    public Route approveRoute(BigDecimal version, Long routeId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Copy Route
     *
     * Make an copy of the given route with optional overriding properties
     *
     */
    public Route copyRoute(BigDecimal version, Long routeId, Route body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Route
     *
     * Create new route
     *
     */
    public Route createRoute(BigDecimal version, Route body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Route Directions
     *
     * Regenerate the directions of a route
     *
     */
    public List<Direction> createRouteDirections(BigDecimal version, Long routeId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Route Polyline
     *
     * Update the polyline of the requested route
     *
     */
    public Route createRoutePolyline(BigDecimal version, Long routeId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Route
     *
     * Delete an existing route
     *
     */
    public void deleteRoute(BigDecimal version, Long routeId) {
        // TODO: Implement...

        
    }

    /**
     * Disapprove Route
     *
     * Disapprove a route
     *
     */
    public Route disapproveRoute(BigDecimal version, Long routeId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Route
     *
     * Get an existing route
     *
     */
    public Route getRoute(BigDecimal version, Long routeId, Boolean showInheritedProperties) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Route Directions
     *
     * Get the directions of a route
     *
     */
    public List<Direction> getRouteDirections(BigDecimal version, Long routeId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Route Shipments
     *
     * Get the shipments on the requested route
     *
     */
    public List<Shipment> getRouteShipments(BigDecimal version, Long routeId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Route Stop
     *
     * Get the specific stop on a route
     *
     */
    public Stop getRouteStop(BigDecimal version, Long routeId, Long stopId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Route Stops
     *
     * The stops of the route requested
     *
     */
    public List<Stop> getRouteStops(BigDecimal version, Long routeId, Boolean confirmedOnly) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Shipments At Stop
     *
     * Get the list of shipments on the requested route at a stop
     *
     */
    public List<Shipment> getShipmentsAtStop(BigDecimal version, Long routeId, Long stopId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Optimize Route
     *
     * Optimize a route. The optimization method based on how the server is configured.
     *
     */
    public void optimizeRoute(BigDecimal version, Long routeId) {
        // TODO: Implement...

        
    }

    /**
     * Delete Stop
     *
     * Delete a stop on a route
     *
     */
    public void removeStop(BigDecimal version, Long routeId, Long stopId) {
        // TODO: Implement...

        
    }

    /**
     * Reorder Route Stops
     *
     * Reordering the stops on the route with and update route distance, time, direction, and polyline
     *
     */
    public List<Stop> reorderRouteStopsPatch(BigDecimal version, Long routeId, List<@Valid Stop> body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Reorder Route Stops
     *
     * Reordering the stops on the route with and update route distance, time, direction, and polyline
     *
     */
    public List<Stop> reorderRouteStopsPost(BigDecimal version, Long routeId, List<@Valid Stop> body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Routes
     *
     * Search for routes.
     *
     */
    public List<Route> searchRoutes(BigDecimal version, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly, Boolean includesEmpty, Boolean rootOnly, Boolean showInheritedProperties, Long hubId, Long programId, Long scheduledStart, Long scheduledEnd, Long updatedStart, Long updatedEnd, Boolean featured, Integer seatCount, Boolean approved, Boolean started, Boolean completed, Boolean valid, Long parentId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Set Driver
     *
     * Update the driver of the route.
     *
     */
    public void setDriver(BigDecimal version, Long id, Long driverId) {
        // TODO: Implement...

        
    }

    /**
     * Update Route
     *
     * Update an existing route
     *
     */
    public Route updateRoute(BigDecimal version, Long routeId, Route body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Route Stop
     *
     * Update a stop on a specified route
     *
     */
    public void updateRouteStop(BigDecimal version, Long routeId, Long stopId, Stop body) {
        // TODO: Implement...

        
    }

}
